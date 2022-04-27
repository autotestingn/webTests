package services;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UserApi extends BaseApi {
    public UserApi() {
        requestSpecification.basePath("/users");
    }

    @Step("Отправляем запрос на получение пользователя с {userId}")
    public Response getUserById(String userId) {
        return given(requestSpecification)
                .with()
                .pathParam("userId", userId)
                .log().all()
                .when()
                .get("/get/{userId}");
    }

    @Step("Отправляем запрос на получение списка пользователей")
    public Response getUsersList() {
        return given(requestSpecification)
                .with()
                .log().all()
                .when()
                .get("/get/all");
    }

    @Step("Проверяем json схему")
    public ValidatableResponse validateJsonSchema(Response response, String jsonSchemaPath) {
        return response
                .then()
                .body(matchesJsonSchemaInClasspath(jsonSchemaPath));
    }
}
