package seminar5_task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginEndToEndTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        // Установка пути к драйверу браузера (ChromeDriver в данном случае)
        System.setProperty("webdriver.chrome.driver", "путь_к_драйверу/chromedriver");

        // Инициализация веб-драйвера
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {

        // Открываем веб-страницу авторизации
        driver.get("http://example.com/login");

        // Находим элементы ввода для логина и пароля
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        // Вводим логин и пароль
        usernameInput.sendKeys("ваш_логин");
        passwordInput.sendKeys("ваш_пароль");

        // Находим и кликаем кнопку входа
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Проверяем, что мы успешно авторизовались (это может быть проверкой наличия элемента после авторизации)
        WebElement welcomeMessage = driver.findElement(By.id("welcome-message"));
        assertNotNull(welcomeMessage);
    }

    @AfterEach
    public void tearDown() {

        // Завершаем работу веб-драйвера после каждого теста
        if (driver != null) {
            driver.quit();
        }
    }
}