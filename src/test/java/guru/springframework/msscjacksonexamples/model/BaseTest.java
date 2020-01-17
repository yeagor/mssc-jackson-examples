package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {
        return BeerDto.builder()
            .beerName("Some name")
            .beerStyle("Mustache scratcher")
            .id(UUID.randomUUID())
            .createdDate(OffsetDateTime.now())
            .lastUpdatedDate(OffsetDateTime.now())
            .price(new BigDecimal("34.4"))
            .upc(123423L)
            .build();
    }

}
