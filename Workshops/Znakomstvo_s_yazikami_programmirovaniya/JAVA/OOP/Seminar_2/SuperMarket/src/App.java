import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Market market = new Market();
        
        // OrdinaryClient client1 = new OrdinaryClient("Boris");
        // OrdinaryClient client2 = new OrdinaryClient("Dasha");
        // SpecialClient client3 = new SpecialClient("Fedor", 1101);

        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market = new Market();

        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new ActionClient("Vasiliy", "Акция на конфеты");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        ((ActionClient) item4.getActor()).setReturnOrder(true);
        ((ActionClient) item4.getActor()).setTakeCash(true);
        market.update();

    }
}
