package tests;

import dto.UserResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import services.UserApi;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ApiTests {
    @Test(description = "Проверка получения ответа на запрос пользователя по id и на соответствие json схеме")
    public void getUserByUserId() {
        UserApi userApi = new UserApi();
        Response response = userApi.getUserById("1");

        response
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("name"))
                .body("school_name", equalTo("Some school"))
                .body("city", equalTo("City"));

        userApi.validateJsonSchema(response, "schemas/User.json");
    }

    @Test(description = "Проверка получения ответа на запрос списка пользователей и на соответствие json схеме")
    public void getUsersList() {
        UserApi userApi = new UserApi();
        Response response = userApi.getUsersList();

        List<UserResponse> users = Arrays.asList(response
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .body()
                .as(UserResponse[].class));

        assertThat(users.size(), equalTo(300));
        assertThat(users.get(0).getId(), equalTo(0L));
        assertThat(users.get(0).getName(), equalTo("name 0"));
        assertThat(users.get(0).getGrade(), equalTo("Grade 0"));

        userApi.validateJsonSchema(response, "schemas/AllUsers.json");
    }
}
