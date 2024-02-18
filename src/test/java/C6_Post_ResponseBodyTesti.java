import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class C6_Post_ResponseBodyTesti {
   /*
https://jsonplaceholder.typicode.com/posts url'ine asagidaki body ile bir POST request gonderdigimizde
        {
        "title":"API",
        "body":"API ogrenmek ne guzel",
        "userId":10,
        }
        donen Response'un,
        status code'unun 201,
        ve content type'inin application/json
        ve Response Body'sindeki,
         "title"'in "API" oldugunu
        "userId" degerinin 100'den kucuk oldugunu
        "body" nin "API" kelimesi icerdigini test edin.
 */
@Test
    public  void  PostResponseBody(){
    //1-Endpoint belirlenerek hazırlanır
    String url="https://jsonplaceholder.typicode.com/posts";

    //2-Soruda verilmişsse  Expected Data hazırlanır
    JSONObject reqBody=new JSONObject();
    reqBody.put("title","API");
    reqBody.put("body","API ogrenmek ne guzel");
    reqBody.put( "userId",10);

    Response response=given().contentType(ContentType.JSON).when().body(reqBody.toString()).post(url);

    //4-Assertion İşlemi

    response.then().assertThat()
                               .statusCode(201)
                               .contentType("application/json")
                               .body("title", equalTo("API"))
                               .body("userId",lessThan(100))
                               .body("body",containsString("API"));

}
    @Test
    public  void  PostResponseBody1(){
        //1-Endpoint belirlenerek hazırlanır
        String url="https://jsonplaceholder.typicode.com/posts";
        //2-Soruda verilmişsse  Expected Data hazırlanır

        JSONObject requBody=new JSONObject();
        requBody.put("title","API");
        requBody.put("body","API ogrenmek ne guzel");
        requBody.put("userId",10);

        Response response=given().contentType(ContentType.JSON).when().body(requBody.toString()).post(url);

        response.then().assertThat()
                .statusCode(201)
                .contentType("application/json")
                .body("title",equalTo("API"))
                .body("userId",lessThan(100))
                .body("body",containsString("API"));

    }

}
