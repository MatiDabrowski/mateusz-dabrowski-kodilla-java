package com.kodilla.stream.forum.world;


import com.kodilla.stream.sand.SandStorage;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal(40000000));
        Country germany = new Country("Germany", new BigDecimal(90000000));
        Country china = new Country("China", new BigDecimal(2000000000));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");

        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When

        BigDecimal allQty = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("2130000000"), allQty);

    }
}
