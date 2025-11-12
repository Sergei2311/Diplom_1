import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;

import static org.junit.Assert.assertEquals;

//Тест добавление булки
@RunWith(MockitoJUnitRunner.class)
public class BurgerBunTest {
    Burger burger;

    @Mock
    private Bun bun;

    @Test
    public void burgerBunTest() {
        burger = new Burger();
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }
}