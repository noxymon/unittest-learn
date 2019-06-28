package id.alfadigital.unittest.process.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class GetAmountTest {

    @Test
    public void givenAmount_returnPromo() {
        GetAmount getAmount = new GetAmount();
        int amountOrder = 40000;
        int amount = getAmount.calc(40000);
        assertEquals(20000, amount);
    }

    @Test
    public void givenAmountLess_returnNoPromo() {
        GetAmount getAmount = new GetAmount();
        int amountOrder = 10000;
        int promoAmount = getAmount.calc(amountOrder);
        assertEquals(0, promoAmount);
    }

    @Test
    public void givenAmoutn40rebu_return20rebu() {
        GetAmount getAmount = new GetAmount();
        int amountOrder = 50000;
        int promoAmount = getAmount.calc(amountOrder);
        assertEquals(25000, promoAmount);
    }

}
