package stepdefinitions.api_stepdefinitions;

import base_urls.MedunnaBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class RoomCreation {

    Response response;
    @Given("user sends post request for room data")
    public void user_sends_post_request_for_room_data() {
        //MedunnaBaseUrl.medunnaSetUp(); // Or call this method in Hooks class and it will be called automatically
        spec.pathParams("first", "api", "second", "rooms");

        Room expectedData = new Room();
        expectedData.setRoomNumber(Faker.instance().number().numberBetween(1000, 1000000));
        expectedData.setRoomType("TWIN");
        expectedData.setStatus(true);
        expectedData.setPrice(100);
        expectedData.setDescription("This room is created by API");

        response = given().spec(spec).headers("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnRlYW0wNSIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjc5OTM4MDE3fQ.LeyHG6u8v5fsCNC_03jpZOcMwB_lOEQkJWnV_7YkAOmEyAUFj-KrO8KS-X65EXP-dyVwWe9KbvKbaCka8eQDFg",
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");

        response.prettyPrint();

    }

    @Then("user gets the room data and validates")
    public void user_gets_the_room_data_and_validates() {
        assertEquals(201, response.getStatusCode());

    }




}
