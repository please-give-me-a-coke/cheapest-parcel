package com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.dto;

public record PriceInfoResponse(
        String carrier,
        String deliveryTime,
        String agentName,
        String url,
        int maxWeight,
        int price
) {
}
