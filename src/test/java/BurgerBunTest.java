import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;

//Тест добавление булки
@RunWith(MockitoJUnitRunner.class)
public class BurgerBunTest {
    Burger burger;

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    @Test
    public void burgerBunTest() {
        burger = new Burger();
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }
    @Test
    public void burgerAddIngredientTest() {
        burger = new Burger();
        burger.addIngredient(ingredient);
        System.out.println(burger.ingredients);
        assertEquals(ingredient, burger.ingredients.get(0));

    }




}