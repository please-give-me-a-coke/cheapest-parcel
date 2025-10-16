package com.please_give_me_a_coke.cheapest_parcel.application.usecase;

import com.please_give_me_a_coke.cheapest_parcel.application.dto.ParcelsPricesResult;
import com.please_give_me_a_coke.cheapest_parcel.application.dto.PriceInfoResult;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.RegionType;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.ServiceType;

import java.util.List;

public interface ParcelsPricesQueryUseCase {
    ParcelsPricesResult getAll();
    List<PriceInfoResult> getByRegion(ServiceType type, RegionType region, int weight);
}
