package n1e1_ObserverPattern;

public class AgenciaBorsa2 implements Observer{
    private String nom;

    public AgenciaBorsa2 (String nom){
        this.nom = nom;
    }

    @Override
    public void actualitzar(double valor) {
        System.out.println(nom + ": L'IBEX 35 ara te un valor de " + valor + " €");
    }
}
