package DesignPatern.BT_FactoryMethod;

public class moneyBack implements CreditCard{
    private String CardKey;

    public moneyBack(String cardKey) {
        CardKey = cardKey;
    }

    @Override
    public String getCardType() {
        return "moneyBack";
    }

    @Override
    public int CreditLimit() {
        return 2;
    }

    @Override
    public int AnnualCharge() {
        return 10000;
    }
}
