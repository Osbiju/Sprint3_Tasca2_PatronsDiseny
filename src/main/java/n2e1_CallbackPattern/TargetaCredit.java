package n2e1_CallbackPattern;

public class TargetaCredit implements Callback{


    @Override
    public void ferPagament() {
        System.out.println("Pagament efectuat amb targeta");
    }
}
