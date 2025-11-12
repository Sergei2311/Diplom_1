import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTestBase extends BurgerTestBase {

    // Nест стоимость бургера
    @Test
    public void burgerGetPriceTest(){
        Mockito.when(bun.getPrice()).thenReturn(25.0f);
        Mockito.when(ingredientFirst.getPrice()).thenReturn(20.0f);
        Mockito.when(ingredientSecond.getPrice()).thenReturn(30.0f);

        float priceActual = burger.getPrice();
        float priceExpect = 100.0f;
        assertEquals(priceExpect, priceActual);
    }
}