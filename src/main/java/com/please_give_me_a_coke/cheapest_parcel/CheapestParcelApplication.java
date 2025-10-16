package com.please_give_me_a_coke.cheapest_parcel;

import com.please_give_me_a_coke.cheapest_parcel.infrastructure.config.ParcelsPricesProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ParcelsPricesProperties.class)
public class CheapestParcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheapestParcelApplication.class, args);
	}

}
