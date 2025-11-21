package data;

import praktikum.Ingredient;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class DataTest {
    public static final Ingredient INGREDIENT_ONE = new Ingredient(SAUCE, "hot sauce", 100);
    public static final Ingredient INGREDIENT_TWO = new Ingredient(FILLING,"filling", 100);
}
