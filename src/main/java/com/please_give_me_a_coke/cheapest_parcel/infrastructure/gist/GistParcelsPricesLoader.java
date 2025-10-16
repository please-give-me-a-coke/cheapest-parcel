package com.please_give_me_a_coke.cheapest_parcel.infrastructure.gist;

import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;
import com.please_give_me_a_coke.cheapest_parcel.infrastructure.config.ParcelsPricesProperties;
import com.please_give_me_a_coke.cheapest_parcel.infrastructure.repository.ParcelsPriceRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class GistParcelsPricesLoader {
    private final RestClient restClient;
    private final ObjectMapper objectMapper;
    private final ParcelsPricesProperties props;
    private final ParcelsPriceRepository parcelsPriceRepository;

    @PostConstruct
    public void load() {
        List<String> urls = props.urls();
        if (urls == null || urls.isEmpty()) {
            log.warn("⚠️ parcel.prices.urls is null. skip load json data");
            return;
        }

        List<ParcelsPrices.Carrier> carriers = new ArrayList<>();
        urls.forEach(url -> {
            String body = restClient.get()
                    .uri(url)
                    .retrieve()
                    .body(String.class);
            ParcelsPrices.Carrier carrier = objectMapper.readValue(body, ParcelsPrices.Carrier.class);
            carriers.add(carrier);
        });

        ParcelsPrices merged = new ParcelsPrices(List.copyOf(carriers));
        parcelsPriceRepository.save(merged);
    }
}
