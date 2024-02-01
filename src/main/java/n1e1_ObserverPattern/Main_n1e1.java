package n1e1_ObserverPattern;

public class Main_n1e1 {
    public static void main(String[] args) {

        AgentBorsa agentBorsa = new AgentBorsa();

        AgenciaBorsa1 agenciaBorsa1 = new AgenciaBorsa1("Barcelona brokers");
        AgenciaBorsa1 agenciaBorsa2 = new AgenciaBorsa1("Madrid brokers");
        AgenciaBorsa1 agenciaBorsa3 = new AgenciaBorsa1("Bilbao brokers");

        agentBorsa.afegirObserver(agenciaBorsa1);
        agentBorsa.afegirObserver(agenciaBorsa2);
        agentBorsa.afegirObserver(agenciaBorsa3);

        agentBorsa.setValor(360);

        agentBorsa.esborrarObserver(agenciaBorsa3);
        System.out.println("----- ");

        agentBorsa.setValor(200);


    }
}
