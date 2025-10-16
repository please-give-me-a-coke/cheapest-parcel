package com.please_give_me_a_coke.cheapest_parcel.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceType {
    DOMESTIC("domestic"),
    HALF_PRICE("half-price");

    private final String value;
}
