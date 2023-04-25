package Interfaces;

import Classes.Actor;

public interface iReturnOrder {

    void setReturnOrder(boolean returnOrder);
    void setTakeCash(boolean takeCash);
    boolean isReturnOrder();
    boolean isTakeCash();
    Actor getActor();
}
