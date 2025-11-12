import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

//Тест замена ингредиентов
@RunWith(MockitoJUnitRunner.class)
public class BurgerMoveIngredientTestBase extends BurgerTestBase {

    @Test
    public void burgerRemoveIngredientTest() {
        burger.moveIngredient(0, 1);
        System.out.println(burger.ingredients);
        assertEquals(ingredientFirst, burger.ingredients.get(1));
    }

}