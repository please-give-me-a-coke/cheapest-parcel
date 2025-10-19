package com.please_give_me_a_coke.cheapest_parcel.infrastructure.config;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@RegisterReflectionForBinding({
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.class,
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.Carrier.class,
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.Service.class,
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.Region.class,
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.Agent.class,
        com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices.WeightBasedRate.class
})
class ParcelsRuntimeHints {}
