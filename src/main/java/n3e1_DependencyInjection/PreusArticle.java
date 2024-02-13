package n3e1_DependencyInjection;

public class PreusArticle {
    private Article article;
    private ConversorMoneda conversorMoneda;

    public PreusArticle(Article article, ConversorMoneda conversorMoneda){
        this.article = article;
        this.conversorMoneda = conversorMoneda;
    }

    public Article getArticle(){
        return article;
    }

    public ConversorMoneda getConversorMoneda(){
        return conversorMoneda;
    }
}
