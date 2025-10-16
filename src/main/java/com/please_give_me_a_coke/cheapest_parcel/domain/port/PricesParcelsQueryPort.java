package com.please_give_me_a_coke.cheapest_parcel.domain.port;

import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;

public interface PricesParcelsQueryPort {
    ParcelsPrices getAll();
}
