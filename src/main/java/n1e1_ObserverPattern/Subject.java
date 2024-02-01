package n1e1_ObserverPattern;

public interface Subject {
    public void afegirObserver(Observer observer);
    public void esborrarObserver(Observer observer);
    public void notificarObserver();

}
