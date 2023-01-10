package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {

    @Test
    void createTest() {
        assertThatCode(() -> new Cook("만두", 5000)) // Cook 객체가 만들어지면 OK
                .doesNotThrowAnyException();
    }
}
