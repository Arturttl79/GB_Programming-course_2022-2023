package seminar4_task2;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    BookRepository mockRepository;
    BookService service;

    @BeforeEach
    public void setUp() {

        // Создаем мок-объект BookRepository
        mockRepository = mock(BookRepository.class);

        // Создаем экземпляр BookService, передавая мок-объект
        service = new BookService(mockRepository);
    }

    @Test
    public void testFindById() {

        // Устанавливаем, что при вызове findById с любым id книги должен вернуться объект книги
        when(mockRepository.findById(anyString())).thenReturn(new Book("1"));

        // Вызываем метод findBookById с id = 2 и проверяем, что возвращается объект книги
        assertTrue(service.findBookById("2") instanceof Book);

        // Проверяем, что метод mockRepository.findById был вызван ровно один раз с любым id
        verify(mockRepository, times(1)).findById(anyString());
    }

    @Test
    public void testFindAll() {

        // Устанавливаем, что при вызове findAll должен вернуться пустой массив
        when(mockRepository.findAll()).thenReturn(new ArrayList<>(10));

        // Вызываем метод findAllBooks и проверяем, что он возвращает массив
        assertEquals(service.findAllBooks(), new ArrayList<>(10));

        // Проверяем, что метод mockRepository.findById был вызван ровно один раз
        verify(mockRepository, times(1)).findAll();
    }
}
