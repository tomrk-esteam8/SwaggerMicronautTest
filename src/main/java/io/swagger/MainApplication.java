package io.swagger;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "Test Sample Service",
            version = "1.0.0",
            description = "This is a sample service for testing generator",
            contact = @Contact(
                    name = "",
                    email = "tomasz.rarok@gmail.com"
            ),
            license = @License(
                    name = "Apache 2.0",
                    url = "http://www.apache.org/licenses/LICENSE-2.0.html"
            )
    )
)
public class MainApplication {

    public static void main(String[] args) {
        Micronaut.run(MainApplication.class);
    }
}