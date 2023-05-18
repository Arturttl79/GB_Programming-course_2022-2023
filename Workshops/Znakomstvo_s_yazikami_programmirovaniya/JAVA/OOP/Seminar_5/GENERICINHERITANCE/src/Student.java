public class Student<T,V,S extends Comparable<S>> extends User<T,V> implements Comparable<Student<T,V,S>> {

    private S studID;

    public Student(T firstName, T lastName, V age, S studID) {
        super(firstName, lastName, age);
        this.studID = studID;
    }

    public S getStudID() {
        return studID;
    }

    public void setStudID(S studID) {
        this.studID = studID;
    }

    @Override
    public String toString() {
        return "Student (firstName = " + super.getFirstName() + ", lastName = " + super.getLastName() + ", age = "
                + super.getAge() + ", studID = " + studID + ")";
    }

    @Override
    public int compareTo(Student<T,V,S> o) {
        return this.studID.compareTo(o.studID);
    }
}
