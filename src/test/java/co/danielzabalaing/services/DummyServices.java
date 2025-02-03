package co.danielzabalaing.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import static org.hamcrest.Matchers.notNullValue;

public class DummyServices extends BaseTest{

    public Response getAllEmployees(){

        Response response= SerenityRest.given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("/objects");

        response.then()
                .statusCode(200);

        return response;
    }

    public Response getSpecifyEmployee ( String id){

        Response response = SerenityRest.given(spec)
                .contentType(ContentType.JSON)
                .when()
                .get("/objects/"+id);

        response.then()
                .statusCode(200)
                .assertThat()
                .body("id",notNullValue());;

        return response;
    }

    public String createNewEmployee(Object employee){

        Response response = SerenityRest.given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(employee)
                .post("/objects");


        response.then()
                .statusCode(200)
                .assertThat()
                .body("id",notNullValue());


        return response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("id");



    }


    public Response deleteEmployee(String id){

        Response response = SerenityRest.given(spec)
                .contentType(ContentType.JSON)
                .delete("/objects/"+id);

        response.then()
                .statusCode(200);

        return  response;

    }
}
