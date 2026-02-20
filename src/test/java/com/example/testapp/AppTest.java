package com.example.testapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void messageReturnsExpectedValue() {
        assertEquals("Hello from test-app", App.message());
    }
}
