package com.please_give_me_a_coke.cheapest_parcel.infrastructure.adapter;

import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;
import com.please_give_me_a_coke.cheapest_parcel.domain.port.PricesParcelsQueryPort;
import com.please_give_me_a_coke.cheapest_parcel.infrastructure.repository.ParcelsPriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ParcelsPricesAdapter implements PricesParcelsQueryPort {
    private final ParcelsPriceRepository repository;

    @Override
    public ParcelsPrices getAll() {
        return repository.getAll();
    }
}
