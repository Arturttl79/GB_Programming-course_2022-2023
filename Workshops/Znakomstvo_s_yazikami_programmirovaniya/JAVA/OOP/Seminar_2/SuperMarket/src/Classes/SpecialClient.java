package Classes;

/** Класс VIP клент, наследуется от родительского класса Actor */
public class SpecialClient extends Actor {

    /** персональный номер VIP клиента. Приватный(инкапсуляция) */
    private int idVIP;

    /**
     * базовый конструктор класса VIP клиент
     * @param name Имя
     * @param idVIP персональный номер VIP клиента
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /** переопределение метода: получить Клиента */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Геттер. метод для получение персонального номера
     * @return персональный номер VIP клиента
     */
    public int getVIPid() {
        return idVIP;
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
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

    /** Сеттер. переопределение метода: сделан заказ */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /** Сеттер. переопределение метода: заказ получен */
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
