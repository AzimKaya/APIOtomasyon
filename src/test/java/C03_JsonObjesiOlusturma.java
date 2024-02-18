import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {
    /*
           Asagidaki JSON Objesini olusturup konsolda yazdirin.
                     {
                     "title":"Ahmet",
                     "body":"Merhaba",
                     "userId":1
                     }
            */
    @Test
    public  void jsonData(){

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("title","Ahmet");
        jsonObject.put("body","Merhaba");
        jsonObject.put("userId",1);

        System.out.println("İlk olusturulan Json data:"+jsonObject);

    }

   @Test
   public  void inerJsonData (){

    /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.

{
"firstname":"Jim",
"additionalneeds":"Breakfast",
"bookingdates":{
               "checkin":"2018-01-01",
               "checkout":"2019-01-01"
               },
"totalprice":111,
"depositpaid":true,
"lastname":"Brown"
}
*/
/*
JSONObject inerJson=new JSONObject();
        inerJson.put("checkin","2018-01-01");
        inerJson.put("checkout","2019-01-01");

 JSONObject outerJson=new JSONObject();

       outerJson.put("firstname","Jim");
       outerJson.put("additionalneeds","Breakfast");
       outerJson.put("bookingdates",inerJson);
       outerJson.put("totalprice",111);
       outerJson.put("depositpaid",true);
       outerJson.put("lastname","Brown");

       System.out.println(outerJson);

 */

     JSONObject inerJson=new JSONObject();
     inerJson.put("checkin","2018-01-01");
     inerJson.put("checkout","2019-01-01");

     JSONObject outerJeson=new JSONObject();
     outerJeson.put("firstname","Jim");
     outerJeson.put("additionalneeds","Breakfast");
     outerJeson.put("bookingdates",inerJson);
     outerJeson.put("totalprice",111);
     outerJeson.put("depositpaid",true);
     outerJeson.put("lastname","Brown");

       System.out.println(outerJeson);



   }

}
