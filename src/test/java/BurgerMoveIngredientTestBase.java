import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Burger;
import praktikum.Ingredient;

import static data.DataTest.INGREDIENT_ONE;
import static data.DataTest.INGREDIENT_TWO;
import static org.junit.Assert.assertEquals;

//Тест замена ингредиентов
@RunWith(Parameterized.class)
public class BurgerMoveIngredientTestBase extends BurgerTestBase {
    private final Ingredient ingredientOne;
    private final Ingredient ingredientTwo;
    private final Ingredient expect;

    public BurgerMoveIngredientTestBase(Ingredient ingredientOne, Ingredient ingredientTwo, Ingredient expect) {
        this.ingredientOne = ingredientOne;
        this.ingredientTwo = ingredientTwo;
        this.expect = expect;
    }

    @Parameterized.Parameters(name = "Данные для теста: ingredientOne={0}, ingredientTwo={1}, expect={2}")
    public static Object[][] ingredients() {
        return new Object[][]{
                {INGREDIENT_ONE, INGREDIENT_TWO, INGREDIENT_TWO},
                {INGREDIENT_TWO, INGREDIENT_ONE, INGREDIENT_ONE}
        };
    }

    @Test
    public void moveIngredientTest() {
        Burger burger = new Burger();

        burger.addIngredient(ingredientOne);
        burger.addIngredient(ingredientTwo);
        burger.moveIngredient(1, 0);
        assertEquals(expect, burger.ingredients.get(0));
    }

}