package com.please_give_me_a_coke.cheapest_parcel.infrastructure.repository;

import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;

public interface ParcelsPriceRepository {
    void save(ParcelsPrices parcelsPrices);
    ParcelsPrices getAll();
}
