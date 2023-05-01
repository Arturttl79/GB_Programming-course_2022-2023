package StudentDomain;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}
