package specs;
import io.restassured.specification.RequestSpecification;

import static helpers.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;



public class RegRequestSpec {

    public static RequestSpecification regRequestSpec = with()
            .contentType(JSON)
            .log().all()
            .filter(withCustomTemplates())
            .baseUri("https://reqres.in")
            .basePath("/api/register");

}