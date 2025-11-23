import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.mockito.Mockito.when;

//Тест замена ингредиентов
@RunWith(Parameterized.class)
public class BurgerMoveIngredientTestBase extends BurgerTestBase {

    @Mock
    private Ingredient ingredientOne;

    @Mock
    private Ingredient ingredientTwo;

    @Mock
    private Ingredient expect;

    private Burger burger;

    private final String ingredientOneName;
    private final String ingredientTwoName;
    private final String expectName;

    public BurgerMoveIngredientTestBase(
            String ingredientOneName,
            String ingredientTwoName,
            String expectName
    ) {
        this.ingredientOneName = ingredientOneName;
        this.ingredientTwoName = ingredientTwoName;
        this.expectName = expectName;
    }

    @Parameterized.Parameters(name = "Тест: {0} → {1}, ожидаем {2}")
    public static Object[][] data() {
        return new Object[][]{
                {"IngredientA", "IngredientB", "IngredientB"},
                {"IngredientB", "IngredientA", "IngredientA"}
        };
    }

    @Before
    public void setUp() {
        // Инициализируем моки
        MockitoAnnotations.initMocks(this);

        // Настраиваем возвращение Name
        when(ingredientOne.getName()).thenReturn(ingredientOneName);
        when(ingredientTwo.getName()).thenReturn(ingredientTwoName);
        when(expect.getName()).thenReturn(expectName);

        // Создаём Burger
        burger = new Burger();
    }

    @Test
    public void moveIngredientTest() {
        // Добавляем ингредиенты в бургер
        burger.addIngredient(ingredientOne);
        burger.addIngredient(ingredientTwo);

        // Перемещаем ингредиент
        burger.moveIngredient(0, 1);

        // Выполняем проверку ожидаемого Name с фактическим
        TestCase.assertEquals(expectName, burger.ingredients.get(0).getName());
    }

}