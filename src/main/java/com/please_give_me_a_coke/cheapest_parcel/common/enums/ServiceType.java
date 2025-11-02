package com.please_give_me_a_coke.cheapest_parcel.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceType {
    STORE_TO_HOUSE("store-to-house"),
    STORE_TO_STORE("store-to-store");

    private final String value;
}
