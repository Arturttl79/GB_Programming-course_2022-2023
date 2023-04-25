package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;
/** базовый (родительский) класс посетителей */
public abstract class Actor implements iActorBehaviour, iReturnOrder{
    /** имя */
    protected String name;
    /** статус выполнения заказа */
    protected boolean isTakeOrder;
    /** статус получения заказа  */
    protected boolean isMakeOrder;
    /** статус оплаты  */
    protected boolean isTakeCash;
    /** статус возврата заказа */
    protected boolean isReturnOrder;
    
    /**
     * конструктор родительского класса
     * @param name имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    /** абстрактный метод получения имени клиента */
    public abstract String getName();
    
}
