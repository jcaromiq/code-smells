package es.rachelcarmena.bloaters.smell1;


public class Amount {
    private double value;

    private Amount() {

    }

    public static Amount anew(double value) {
        Amount amount = new Amount();
        amount.value = value;
        return amount;
    }

    public double getValue() {
        return value;
    }
}
