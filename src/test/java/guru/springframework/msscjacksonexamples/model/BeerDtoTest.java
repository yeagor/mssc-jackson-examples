package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String jsonString = "{\"beerName\":\"Some name\",\"beerStyle\":\"Mustache scratcher\",\"upc\":123423,\"price\":\"34.4\",\"createdDate\":\"2020-01-18T00:00:44+0600\",\"lastUpdatedDate\":\"2020-01-18T00:00:44.8803643+06:00\",\"myLocalDate\":\"20200118\",\"beerId\":\"3c2e348c-5818-4484-b592-514f7a72ac08\"}";
        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beerDto);
    }

}