package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }

    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Edmonton", "Alberta")));

        cityList.delete(new City("Edmonton", "Alberta"));
        assertEquals(0, cityList.countCities());
        assertFalse(cityList.hasCity(new City("Edmonton", "Alberta")));
    }
}
