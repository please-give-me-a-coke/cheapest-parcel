package com.please_give_me_a_coke.cheapest_parcel.infrastructure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "parcels.prices")
public record ParcelsPricesProperties(List<String> urls) {}
