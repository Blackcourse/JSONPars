import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class testsJson {


    @Test
    public void testJsonParsing() {
        Map<String, String> params = new HashMap<>();
        JsonPath response = RestAssured
                .given()
                .queryParams(params)
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        ArrayList  messages = response.get("messages");
        System.out.println(messages.get(1));


    }
}
