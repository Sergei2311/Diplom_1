import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

//Тест удаление ингредиента
@RunWith(MockitoJUnitRunner.class)
public class BurgerRemoveIngredientTestBase extends BurgerTestBase {

    @Test
    public void burgerRemoveIngredientTest(){
        burger.removeIngredient(0);
        assertEquals(ingredientSecond, burger.ingredients.get(0));
    }
}