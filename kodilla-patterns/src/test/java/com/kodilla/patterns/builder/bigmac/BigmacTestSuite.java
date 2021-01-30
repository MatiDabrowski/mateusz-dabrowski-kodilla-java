package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigMacBuilder(){
        //given
            BigMac bigMac = new BigMac.BigMacBuilder()
                    .ingredient("ONION")
                    .ingredient("BECON")
                    .burgers(2)
                    .sauce("STANDARD")
                    .bun("NO_SEZAM")
                    .build();

            System.out.println(bigMac);
        //when
        int howManyIngredients = bigMac.getIngredients().size();
        //then
        assertEquals(2, howManyIngredients);

    }

}
