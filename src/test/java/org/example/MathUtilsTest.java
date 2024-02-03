package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void add() {
        MathUtils mu = new MathUtils();
        assertEquals(3, mu.add(1,2));
        assertEquals(-4, mu.add(1,-5));
        assertEquals(0, mu.add(0,0));
    }

    @Test
    void subtract() {
        MathUtils mu = new MathUtils();
        assertEquals(2, mu.subtract(5,3));
        assertEquals(-2, mu.subtract(3,5));
        assertEquals(0, mu.subtract(5,5));
        assertEquals(-2, mu.subtract(-5,-3));
    }

    @Test
    void multiply() {
        MathUtils mu = new MathUtils();
        assertEquals(12, mu.multiply(3,4));
        assertEquals(-12, mu.multiply(-3,4));
        assertEquals(12, mu.multiply(-3,-4));
        assertEquals(0, mu.multiply(3,0));
    }

    @Test
    void divide() {
        MathUtils mu = new MathUtils();
        assertEquals(3.0, mu.divide(6,2));
        assertEquals(1.0, mu.divide(2,2));
        assertEquals(0.5, mu.divide(3,6));
        assertEquals(-3.0, mu.divide(6,-2));
        assertEquals(-3.0, mu.divide(-6,2));
        assertEquals(3.0, mu.divide(-6,-2));
        assertEquals(-1.0, mu.divide(6,0));
    }
}