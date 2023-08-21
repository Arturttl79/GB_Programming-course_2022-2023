package Homeworks.Exceptions.Seminar_3;

public class Human {

    String lastName;
    String firstName;
    String middleName;
    String birthDate;
    String phoneNumber;
    String sex;

    public Human(String lastName, String firstName, String middleName, String birthDate, String phoneNumber,
            String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", lastName, firstName, middleName, birthDate, phoneNumber, sex);
    }

    

}
