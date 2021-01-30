package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder{
        private String bun;
        public static final String SEZAM = "SEZAM";
        public static final String NOSEZAM = "NO_SEZAM";
        private int burgers;
        private String sauce;
        public static final String STANDARD = "STANDARD";
        public static final String ISLAND = "1000 WYSP";
        public static final String BARBECUE = "BARBEQUE";
        List<String> ingredients = new ArrayList<>();
        public static final String SALATA = "SALATA";
        public static final String ONION = "ONION";
        public static final String BECON = "BECON";
        public static final String CHILLI = "CHILLI";
        public static final String MUSHROOM = "MUSHROOMS";
        public static final String KREWETKI = "KREWETKI";
        public static final String SER = "SER";



        public BigMacBuilder bun(String bun){
            if (bun.equals(BigMacBuilder.SEZAM) || bun.equals(BigMacBuilder.NOSEZAM)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Niedozowlona wartość. Wybierz sezam lub bez.");
            }
            return this;
        }

        public BigMacBuilder burgers(int burgers){
            if (burgers >= 0 ) {
                this.burgers = burgers;
            } else {
                throw new IllegalStateException("Nie może byc mniej niż 0!");
            }

            return this;
        }
        public BigMacBuilder sauce(String sauce){
            if (sauce.equals(BigMacBuilder.BARBECUE) || sauce.equals(BigMacBuilder.STANDARD) || sauce.equals(BigMacBuilder.ISLAND)){
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Sosy do wyboru to: STANDARD, 1000 WYSP, BARBEQUE");
            }

            return this;
        }
        public BigMacBuilder ingredient(String ingredient){
            if (ingredient.equals(BigMacBuilder.BECON)
                    || ingredient.equals(BigMacBuilder.CHILLI)
                    || ingredient.equals(BigMacBuilder.KREWETKI)
                    || ingredient.equals(BigMacBuilder.MUSHROOM)
                    || ingredient.equals(BigMacBuilder.ONION)
                    || ingredient.equals(BigMacBuilder.SALATA)
                    || ingredient.equals(BigMacBuilder.SER)
            ) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Zły składnik!!!!!");
            }
            return this;
        }

        public BigMac build(){
            return new BigMac(bun, burgers,sauce, ingredients );
        }



    }

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
