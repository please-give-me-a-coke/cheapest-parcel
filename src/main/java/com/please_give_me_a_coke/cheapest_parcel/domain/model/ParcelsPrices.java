package com.please_give_me_a_coke.cheapest_parcel.domain.model;

import java.util.List;

public record ParcelsPrices(
        List<Carrier> carriers
) {
    public record Carrier(
            String carrier,
            List<Service> services
    ) {
    }

    public record Service(
            String type,
            String deliveryTime,
            List<Region> regions
    ) {
    }

    public record Region(
            String name,
            List<Agent> agents
    ) {
    }

    public record Agent(
            String name,
            String url,
            List<WeightBasedRate> weightBasedRates
    ) {
    }

    public record WeightBasedRate(
            int maxWeight,
            int price
    ) {
    }
}
