package id.alfadigital.unittest.process.order;

import id.alfadigital.unittest.db.postgresql.mapper.TbTransactionPromoMapper;
import id.alfadigital.unittest.db.postgresql.model.TbTransactionPromo;
import org.springframework.beans.factory.annotation.Autowired;

public class SaveOrder {

    private final TbTransactionPromoMapper promoMapper;

    @Autowired
    public SaveOrder(TbTransactionPromoMapper promoMapper) {
        this.promoMapper = promoMapper;
    }

    public void save(int amount, int promoAmount) {
        TbTransactionPromo promo = new TbTransactionPromo();
        promo.setTbtoNo("O");
        promo.setTbtoDiscount(promoAmount);
        promo.setTbtoAmount(amount);
        promoMapper.insert(promo);
    }
}
