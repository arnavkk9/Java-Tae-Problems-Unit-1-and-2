abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("NetBanking: " + amount);
    }

    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1000);
        p2.pay(2000);
        p3.pay(3000);
    }
}
