import org.junit.Before;
import org.mockito.Mock;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

//Бургер с двумя ингредиентами
public class BurgerTestBase {
    protected Burger burger;

    @Mock
    protected Bun bun;
    @Mock
    protected Ingredient ingredientFirst;
    @Mock
    protected Ingredient ingredientSecond;

    @Before
    public void setup() {
        burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientFirst);
        burger.addIngredient(ingredientSecond);
    }

}
