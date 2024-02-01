package n2e1_CallbackPattern;

public class Main_n2e1_BotigaDeSabates {
    public static void main(String[] args) {

        PasarelaDePagament pasarelaDePagament = new PasarelaDePagament();

        Callback targeta = new TargetaCredit();
        targeta.ferPagament();

        Callback paypal = new Paypal();
        paypal.ferPagament();

        Callback compteBancaria = new CompteBancaria();
        compteBancaria.ferPagament();



    }
}
