package id.alfadigital.unittest.process.order;

public class GetAmount {
    public int calc(int amount) {
        if (amount < 40000) {
            return 0;
        }
        return (int) (amount * 0.5);
    }
}
