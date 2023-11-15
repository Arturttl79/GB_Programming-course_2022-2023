package seminar5_task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar5_task2.MenuItem;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceIntegrationTest {
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void testAddBookAndGetAllBooks() {

        // Задание:

        // 1. Создайте 3 книги и добавьте их в bookService.

        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        Book book3 = new Book("Title3", "Author3");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // 2. Получите список всех книг из bookService.

        List<Book> allBooks = bookService.getAllBooks();

        // 3. Проверьте, что список не является null.

        assertNotNull(allBooks);

        // 4. Проверьте, что список содержит 3 книги.

        assertEquals(3, allBooks.size());

        // 5. Выведите информацию о каждой книге (используйте метод toString).

        for (Book book : allBooks)
            System.out.println(book);

        // Проверьте, что результаты соответствуют ожиданиям.

        assertEquals("Title1", allBooks.get(0).getTitle());
        assertEquals("Author1", allBooks.get(0).getAuthor());
        assertEquals("Title2", allBooks.get(1).getTitle());
        assertEquals("Author2", allBooks.get(1).getAuthor());
        assertEquals("Title3", allBooks.get(2).getTitle());
        assertEquals("Author3", allBooks.get(2).getAuthor());
    }
}