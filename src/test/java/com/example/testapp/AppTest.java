/*
 * @Date: 2026-02-20 22:30:19
 * @LastEditors: tqtqtq
 * @LastEditTime: 2026-02-21 01:26:33
 * @FilePath: \testProject\src\test\java\com\example\testapp\AppTest.java
 */
package com.example.testapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// This test class verifies that the App.message() method returns the expected string.
class AppTest {
    @Test
    void messageReturnsExpectedValue() {
        assertEquals("Hello from test-app", App.message());
    }
}
