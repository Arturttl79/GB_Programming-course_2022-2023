package StudentDomain;
/** Обобщенный класс MeanAgeUser */
public class MeanAgeUser {

    /** Метод для вычисления среднего возраста группы User и его потомков */
    public <T extends User> Double meanAge(T[] users) {
        Double sum = 0.0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        sum = sum / users.length;
        return Math.ceil(sum * Math.pow(10, 2)) / Math.pow(10, 2);
    }
}
