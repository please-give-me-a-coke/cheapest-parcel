package com.please_give_me_a_coke.cheapest_parcel.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RegionType {
    SAME_AREA("동일권"),
    OTHER_AREA("타권"),
    JEJU("제주권"),
    ISLANDS("도서산간");

    private final String value;
}
