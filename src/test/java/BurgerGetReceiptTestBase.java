import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

//Тест чек бургера
@RunWith(MockitoJUnitRunner.class)
public class BurgerGetReceiptTestBase extends BurgerTestBase {

    @Test
    public void burgerGetReceiptTest(){
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(bun.getPrice()).thenReturn(25.0f);
        Mockito.when(ingredientFirst.getType()).thenReturn(SAUCE);
        Mockito.when(ingredientFirst.getName()).thenReturn("hot sauce");
        Mockito.when(ingredientFirst.getPrice()).thenReturn(20.0f);
        Mockito.when(ingredientSecond.getType()).thenReturn(FILLING);
        Mockito.when(ingredientSecond.getName()).thenReturn("cutlet");
        Mockito.when(ingredientSecond.getPrice()).thenReturn(30.0f);

        String receipt = burger.getReceipt();
        String receiptExpect = "(==== " + bun.getName() + " ====)\n"+
                "= "+ ingredientFirst.getType().toString().toLowerCase() + " " + ingredientFirst.getName() + " =\n" +
                "= "+ ingredientSecond.getType().toString().toLowerCase() + " " + ingredientSecond.getName() + " =\n" +
                "(==== " + bun.getName() + " ====)\n" +
                "\n" +
                "Price: "+ String.format("%f", burger.getPrice());
        System.out.println(receipt.replaceAll("\\s+", "") + receiptExpect.replaceAll("\\s+", ""));
        assertEquals(receipt.replaceAll("\\s+", ""), receiptExpect.replaceAll("\\s+", ""));
    }
}