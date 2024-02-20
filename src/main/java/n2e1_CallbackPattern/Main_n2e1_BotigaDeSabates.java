package n2e1_CallbackPattern;

public class Main_n2e1_BotigaDeSabates {
    public static void main(String[] args) {

        PasarelaDePagament pasarelaDePagament = new PasarelaDePagament();

        Callback targeta = new TargetaCredit();
        Callback paypal = new Paypal();
        Callback compteBancaria = new CompteBancaria();

        pasarelaDePagament.activarPasarela(targeta);
        pasarelaDePagament.activarPasarela(paypal);
        pasarelaDePagament.activarPasarela(compteBancaria);


    }
}
