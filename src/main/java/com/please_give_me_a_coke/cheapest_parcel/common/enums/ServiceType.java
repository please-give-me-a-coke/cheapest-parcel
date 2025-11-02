package com.please_give_me_a_coke.cheapest_parcel.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceType {
    STORE_TO_HOUSE("store_to_house"),
    STORE_TO_STORE("store_to_store");

    private final String value;
}
