package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    public static final String SAUCE_STANDARD = "standard";
    public static final String SAUCE_1000_ISLANDS = "1000 wysp";
    public static final String SAUCE_BARBECUE = "barbecue";

    public static final String INGREDIENT_SALAD = "sałata";
    public static final String INGREDIENT_ONION = "cebula";
    public static final String INGREDIENT_BECKON = "bekon";
    public static final String INGREDIENT_CUCUMBER = "ogórek";
    public static final String INGREDIENT_CHILLI_PEPPERS = "papryczki chilli";
    public static final String INGREDIENT_CHAMPIGNONS = "pieczarki";
    public static final String INGREDIENT_SCHRIMPS = "krewetki";
    public static final String INGREDIENT_CHEESE = "ser";

    private final boolean bun;
    private final boolean withSesame;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private boolean bun;
        private boolean withSesame;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder withSesame(boolean withSesame) {
            this.withSesame = withSesame;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() throws Exception {
            return new Bigmac(bun, withSesame, burgers, sauce, ingredients);
        }
    }

    private Bigmac(boolean bun, boolean withSesame, int burgers, String sauce, List<String> ingredients) throws Exception {
        this.bun = bun;
        this.withSesame = withSesame;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);

        if (!(sauce.equals(SAUCE_1000_ISLANDS) || sauce.equals(SAUCE_BARBECUE) ||
                sauce.equals(SAUCE_STANDARD)))
            throw new Exception("Invalid sauce");

        for (String ingredient : ingredients) {
            if (!(ingredient.equals(INGREDIENT_BECKON) ||
                  ingredient.equals(INGREDIENT_CHAMPIGNONS) ||
                  ingredient.equals(INGREDIENT_CHEESE) ||
                  ingredient.equals(INGREDIENT_CHILLI_PEPPERS) ||
                  ingredient.equals(INGREDIENT_CUCUMBER)||
                  ingredient.equals(INGREDIENT_ONION) ||
                  ingredient.equals(INGREDIENT_SALAD) ||
                  ingredient.equals(INGREDIENT_SCHRIMPS)
                          ))
             throw new Exception("Invalid ingredient");
        }
        if (burgers < 0)
            throw new Exception("Burgers must be > 0");
    }

    public boolean isBun() {
        return bun;
    }

    public boolean isWithSesame() {
        return withSesame;
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
        return "Bigmac{" +
                "bun=" + bun +
                ", withSesame=" + withSesame +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
