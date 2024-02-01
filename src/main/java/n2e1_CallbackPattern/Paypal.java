package n2e1_CallbackPattern;

public class Paypal implements Callback{
    @Override
    public void ferPagament() {
        System.out.println("Pagament fet amb PAYPAL");
    }
}
