package com.please_give_me_a_coke.cheapest_parcel.application.mapper;

import com.please_give_me_a_coke.cheapest_parcel.application.dto.ParcelsPricesResult;
import com.please_give_me_a_coke.cheapest_parcel.domain.model.ParcelsPrices;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParcelsPricesResultMapper {
    ParcelsPricesResult toResult(ParcelsPrices domain);

}
