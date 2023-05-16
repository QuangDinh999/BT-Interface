package DesignPatern.BT_FactoryMethod;

public class Titanium implements CreditCard{
    private String CardKey;

    public Titanium(String cardKey) {
        CardKey = cardKey;
    }

    @Override
    public String getCardType() {
        return "Titanium";
    }

    @Override
    public int CreditLimit() {
        return 3;
    }

    @Override
    public int AnnualCharge() {
        return 8000;
    }
}
