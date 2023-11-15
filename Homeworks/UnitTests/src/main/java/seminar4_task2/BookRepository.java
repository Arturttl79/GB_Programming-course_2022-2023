package seminar4_task2;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
