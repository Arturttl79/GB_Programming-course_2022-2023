package Classes;

import java.util.*;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/** класс магазин. Имплементирует интерфейсы */
public class Market implements iMarketBehaviour, iQueueBehaviour{

    //private List<Actor> queue;
    /** список клиентов в магазине. Приватный(инкапсуляция) */
    private List<iActorBehaviour> queue;

    /** конструктор класса */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /** переопределение метода: Клиент зашел в магазин */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /** переопределение метода: клиент встал в очередь */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /** переопределение метода: клиент покинул магазин */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            this.queue.remove(actor);
        }
    }

    /** переопределение метода: обновление данных. */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /** переопределение метода: заказ товаров */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /** переопределение метода: клиент покинул очередь */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /** переопределение метода: Клиент сделвл заказ */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }
}
