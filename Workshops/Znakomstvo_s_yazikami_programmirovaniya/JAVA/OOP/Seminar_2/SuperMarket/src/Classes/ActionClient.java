package Classes;

/** Класс Акционных клиентов. Имплементирует родительский класс Actor */
public class ActionClient extends Actor {

    /** название акции.Поле инкапуслировано */
    private String offerName;

    /**
     * базовый конструктор класса Акционный клиент. 
     * при создании нового оъекта данного класса - счетчик Количества акционных клиентов обновляет количество.
     * @param name Имя 
     * @param offerTitle название акции
     */
    public ActionClient(String name, String offerName) {
        super(name);
        this.offerName = offerName;
    }

    /**
     * геттер метод для получения названия акции
     * @return название акции
     */
    public String getOfferName() {
        return this.offerName;
    }

    /** переопределение получения имени клиента */
    @Override
    public String getName() {
        return super.name;
    }

    /** переопределение метода: получить Клиента */
    @Override
    public Actor getActor() {
        return this;
    }

    /** переопределение метода: сделан ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: получен ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** Сеттер. переопределение метода: заказ получен */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /** Сеттер. переопределение метода: сделан заказ */
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
