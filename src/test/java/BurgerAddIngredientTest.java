import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;

//Тест добавление одного ингредиента
@RunWith(MockitoJUnitRunner.class)
public class BurgerAddIngredientTest {
    Burger burger;

    @Mock
    private Ingredient ingredient;

    @Test
    public void burgerAddIngredientTest() {
        burger = new Burger();
        burger.addIngredient(ingredient);
        System.out.println(burger.ingredients);
        assertEquals(ingredient, burger.ingredients.get(0));

    }

}