package com.hauschildt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza();
    }

    @Test
    void getName() {
        fail();
    }

    @Test
    void setName() {
        fail();
    }

    @Test
    void getPrice() {
        fail();
    }

    @Test
    void setPrice() {
        fail();
    }

    @Test
    void getDescription() {
        fail();
    }

    @Test
    void setDescription() {
        fail();
    }

    @Test
    void getSize() {
        fail();
    }

    @Test
    void setSize() {
        fail();
    }

    @Test
    void getCrust() {
        Crust expected = Pizza.DEFAULT_CRUST;
        assertEquals(expected, pizza.getCrust());
    }

    @Test
    void setCrust() {
        Crust expected = Crust.THIN;
        pizza.setCrust(expected);
        assertEquals(expected, pizza.getCrust());
    }

    @Test
    void getSauce() {
        fail();
    }

    @Test
    void setSauce() {
        fail();
    }

    @Test
    void getMeat() {
        fail();
    }

    @Test
    void setMeat() {
        fail();
    }

    @Test
    void getVeggies() {
        fail();
    }

    @Test
    void setVeggies() {
        fail();
    }

    @Test
    void testToString() {
        fail();
    }
}