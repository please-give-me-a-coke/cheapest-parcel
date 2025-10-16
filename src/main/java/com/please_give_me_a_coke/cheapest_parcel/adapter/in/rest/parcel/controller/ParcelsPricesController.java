package com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.controller;

import com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.dto.PriceInfoResponse;
import com.please_give_me_a_coke.cheapest_parcel.adapter.in.rest.parcel.mapper.ParcelsPricesRestMapper;
import com.please_give_me_a_coke.cheapest_parcel.application.dto.PriceInfoResult;
import com.please_give_me_a_coke.cheapest_parcel.application.usecase.ParcelsPricesQueryUseCase;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.RegionType;
import com.please_give_me_a_coke.cheapest_parcel.common.enums.ServiceType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/parcels-prices")
public class ParcelsPricesController {
    private final ParcelsPricesQueryUseCase parcelsPricesQueryUseCase;
    private final ParcelsPricesRestMapper mapper;

    @GetMapping("/cheapest")
    public ResponseEntity<List<PriceInfoResponse>> getCheapest(
            @RequestParam ServiceType type,
            @RequestParam RegionType region,
            @RequestParam int weight
    ) {
        List<PriceInfoResult> parcelsPricesResult = parcelsPricesQueryUseCase.getByRegion(type, region, weight);

        return ResponseEntity.ok()
                .body(mapper.toResponse(parcelsPricesResult));
    }
}
