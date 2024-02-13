package n3e1_DependencyInjection;

public class Article {
    private String nom;
    private double preuEuros;

    public Article(String nom, double preuEuros){
        this.nom = nom;
        this.preuEuros = preuEuros;
    }

    public String getNom(){
        return nom;
    }
    public double getPreuEuros(){
        return preuEuros;
    }
}
