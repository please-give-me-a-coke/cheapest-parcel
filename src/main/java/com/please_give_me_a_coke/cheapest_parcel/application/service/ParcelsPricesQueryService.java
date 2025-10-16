package com.please_give_me_a_coke.cheapest_parcel.application.service;

import com.please_give_me_a_coke.cheapest_parcel.application.dto.PriceInfoResult;
import com.please_give_me_a_coke.cheapest_parcel.application.usecase.ParcelsPricesQueryUseCase;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.RegionType;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.ServiceType;
import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;
import com.please_give_me_a_coke.cheapest_parcel.domain.port.PricesParcelsQueryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ParcelsPricesQueryService implements ParcelsPricesQueryUseCase {
    private final PricesParcelsQueryPort pricesParcelsQueryPort;

    @Override
    public List<PriceInfoResult> getByRegion(ServiceType type, RegionType region, int weight) {
        ParcelsPrices data = pricesParcelsQueryPort.getAll();

        return data.carriers().stream()
                .flatMap(c -> c.services().stream()
                        .filter(s -> type.getValue().equals(s.type())) // type 필터
                        .flatMap(s -> s.regions().stream()
                                .filter(r -> region.getValue().equals(r.name())) // region 필터
                                .flatMap(r -> r.agents().stream()
                                        .flatMap(a -> a.weightBasedRates().stream()
                                                .filter(w -> w.maxWeight() >= weight) // weight 필터
                                                .map(w -> new PriceInfoResult(
                                                        c.carrier(),
                                                        s.deliveryTime(),
                                                        a.name(),
                                                        a.url(),
                                                        w.maxWeight(),
                                                        w.price()
                                                ))
                                        )
                                )
                        )
                )
                .sorted(Comparator.comparingInt(PriceInfoResult::price))
                .limit(5)
                .toList();
    }
}
