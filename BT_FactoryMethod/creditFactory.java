package DesignPatern.BT_FactoryMethod;

public class creditFactory {
    public static CreditCard getCardType(String credit){
        switch (credit){
            case "titanium":
                return new Titanium("0101010101");
            case "platinum":
                return new platinum("0202020202");
            case "moneyBack":
                return new moneyBack("0303030303");
            default:
                return null;
        }

    }
}
