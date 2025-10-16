package com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.mapper;

import com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.dto.PriceInfoResponse;
import com.please_give_me_a_coke.cheapest_parcel.application.dto.PriceInfoResult;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParcelsPricesRestMapper {
    PriceInfoResponse toResponse(PriceInfoResult result);
    List<PriceInfoResponse> toResponse(List<PriceInfoResult> result);
}
