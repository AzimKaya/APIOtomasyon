import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ResponseBilgileriAsertion {
          /*
    https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
    gonderdigimizde donen Response'un,
    status code'unun 200,
    ve content type'inin application/json; charset=utf-8
    Server isimli Header'in degerinin Cowboy,
    ve status Line'in HTTP/1.1 200 OK olduğunu assert ediniz.
 */
@Test
    public  void get01(){

        //API Testlerinde genelde işlemler 4 aşamada gerçekleşir
        //1-Endpoint belirlenerek hazırlanır

        String url="https://restful-booker.herokuapp.com/booking/10";

        //2-Gerekli ise Expected Data hazırlanır
        //3-Actual Data kaydedilir

        Response response=given().when().get(url);

        //4-Assertion İşlemi Yapılır

        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");


    }



}
/*


git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/AzimKaya/APIOtomasyon.git
git push -u origin main
 */