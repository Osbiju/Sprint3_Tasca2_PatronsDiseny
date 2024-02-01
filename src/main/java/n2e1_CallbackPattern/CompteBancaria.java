package n2e1_CallbackPattern;

public class CompteBancaria implements Callback{
    @Override
    public void ferPagament() {
        System.out.println("Pagament fet amb Conta Bancaria");
    }
}
