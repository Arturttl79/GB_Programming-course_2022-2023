package Classes;

/** класс Обычный клиент */
public class OrdinaryClient extends Actor {

    /** переопределение метода: получить Клиент */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Базовый конструктор класса
     * @param name Имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }

    /** переопределение метода: сделал ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: забрал ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** Сеттер. переопределение метода : сделал заказ  */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /** Сеттер.перопределение метода: получил заказ */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    /* переопределение метода сделал заявку на возврат */
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }
    
    /**
     * Сеттер метод. меняет статус на: забрал деньги
     * @param takeCash значение забрал деньги
     */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
      }

    /** переопределение метода:  есть ли заявка на возврат товара */
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /** переопределение метода забрал ли деньги */
    @Override
    public boolean isTakeCash() {
       return super.isTakeCash;
    }
}
