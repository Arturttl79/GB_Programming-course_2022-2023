package Homeworks.SoftwareArchitecture.Lesson_2.Abstractions;

// Абстракция класса фабрики

public abstract class ItemGenerator {
    
    // Метод взаимодействия с абстрактной продукцией
    // return: содержимое из разных сундуков

    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    // Метод создания экхемпляра продукта
    // return: экземпляр продукта

    public abstract IGameItem createItem();

    @Override
    public String toString() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }
}
