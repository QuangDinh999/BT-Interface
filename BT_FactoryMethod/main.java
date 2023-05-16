package DesignPatern.BT_FactoryMethod;

public class main {
    public static void main(String[] args) {
        CreditCard p = creditFactory.getCardType("platinum");
        System.out.println("Card name: " + p.getCardType());
        System.out.println("Annual Charge: " + p.AnnualCharge());
        System.out.println("Credit limit: " + p.CreditLimit());

        CreditCard t = creditFactory.getCardType("titanium");
        System.out.println("Card name: " + t.getCardType());
        System.out.println("Annual Charge: " + t.AnnualCharge());
        System.out.println("Credit limit: " + t.CreditLimit());

        CreditCard mb = creditFactory.getCardType("moneyBack");
        System.out.println("Card name: " + t.getCardType());
        System.out.println("Annual Charge: " + t.AnnualCharge());
        System.out.println("Credit limit: " + t.CreditLimit());
    }
}
