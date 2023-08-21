package Homeworks.Exceptions.Seminar_3;

public class Main {

    public static void main(String[] args) {

        String[] data = DataCheckService.dataCheck();

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        String sex = data[5];

        Human human = new Human(lastName, firstName, middleName, birthDate, phoneNumber, sex);

        try {
            SaveService.save(human);
        } catch (SaveException e) {
        }
    }
}
