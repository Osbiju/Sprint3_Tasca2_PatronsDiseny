package ObserverExemple;

public class Main_observer {
    public static void main(String[] args) {

        PatronObserver.SachinCenturyNotifier notifier = new PatronObserver.SachinCenturyNotifier();
        notifier.register(new SachinFan("Fan1"));
        notifier.register(new SachinFan("Fan2"));
        notifier.register(new SachinFan("Fan3"));
        notifier.register(new SachinFan("Fan4"));

        notifier.sachinScoredACentury();

    }
}
