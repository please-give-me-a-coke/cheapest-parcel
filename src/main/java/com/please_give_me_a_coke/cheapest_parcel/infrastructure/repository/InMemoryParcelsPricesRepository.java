package com.please_give_me_a_coke.cheapest_parcel.infrastructure.repository;

import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicReference;

@Repository
public class InMemoryParcelsPricesRepository implements ParcelsPriceRepository {
    private final AtomicReference<ParcelsPrices> cache = new AtomicReference<>();

    @Override
    public void save(ParcelsPrices parcelsPrices) {
        cache.set(parcelsPrices);
    }

    @Override
    public ParcelsPrices getAll() {
        return cache.get();
    }
}
