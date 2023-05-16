package DesignPatern.BT_FactoryMethod;

public class platinum implements CreditCard{
    private String CardKey;

    public platinum(String cardKey) {
        CardKey = cardKey;
    }

    @Override
    public String getCardType() {
        return "platinum";
    }

    @Override
    public int CreditLimit() {
        return 1;
    }

    @Override
    public int AnnualCharge() {
        return 15000;
    }
}
