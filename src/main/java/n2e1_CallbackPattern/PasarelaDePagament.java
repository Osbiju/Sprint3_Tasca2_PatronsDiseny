package n2e1_CallbackPattern;

public class PasarelaDePagament {

    public void activarPasarela(Callback metodePagament){
        metodePagament.ferPagament();
    }
}
