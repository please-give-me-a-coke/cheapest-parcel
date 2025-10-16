package com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.mapper;

import com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.dto.ParcelsPricesResponse;
import com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.dto.PriceInfoResponse;
import com.please_give_me_a_coke.cheapest_parcel.application.dto.ParcelsPricesResult;
import com.please_give_me_a_coke.cheapest_parcel.application.dto.PriceInfoResult;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParcelsPricesRestMapper {
    ParcelsPricesResponse toResult(ParcelsPricesResult domain);
    PriceInfoResponse toResponse(PriceInfoResult result);
    List<PriceInfoResponse> toResponse(List<PriceInfoResult> result);
}
