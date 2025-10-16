package com.please_give_me_a_coke.cheapest_parcel.application.dto;

import lombok.Builder;

@Builder
public record PriceInfoResult(
        String carrier,
        String deliveryTime,
        String agentName,
        String url,
        int maxWeight,
        int price
) {
}
