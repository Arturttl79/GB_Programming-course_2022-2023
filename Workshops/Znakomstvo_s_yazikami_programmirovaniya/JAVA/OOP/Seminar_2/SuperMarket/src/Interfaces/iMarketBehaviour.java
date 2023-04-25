package Interfaces;

import Classes.Actor;
import java.util.*;

public interface iMarketBehaviour {
    
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
