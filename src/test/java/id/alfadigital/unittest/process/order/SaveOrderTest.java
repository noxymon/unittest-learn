package id.alfadigital.unittest.process.order;

import id.alfadigital.unittest.db.postgresql.mapper.TbTransactionPromoMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class SaveOrderTest {

    TbTransactionPromoMapper promoMapper = mock(TbTransactionPromoMapper.class);

    @Before
    public void setupMock() {
        when(promoMapper.insert(any())).thenReturn(1);
    }

    @Test
    public void method() {
        SaveOrder saveOrder = new SaveOrder(promoMapper);
        saveOrder.save(1000, 200);
        verify(promoMapper, times(1)).insert(any());
    }
}
