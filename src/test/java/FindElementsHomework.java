import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementsHomework {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void findTenElements() {

        WebElement headerLogo = driver.findElement(By.className("header-logo"));
        System.out.println("header-logo: " + headerLogo.getText());

        WebElement headerLinks = driver.findElement(By.className("header-links"));
        System.out.println("header-links: " + headerLinks.getText());

        WebElement registerLink = driver.findElement(By.className("ico-register"));
        System.out.println("ico-register: " + registerLink.getText());

        WebElement loginLink = driver.findElement(By.className("ico-login"));
        System.out.println("ico-login: " + loginLink.getText());

        WebElement searchBox = driver.findElement(By.className("search-box"));
        System.out.println("search-box: " + searchBox.getText());

        WebElement searchInput = driver.findElement(By.className("search-box-text"));
        System.out.println("search-box-text: " + searchInput.getAttribute("type"));

        WebElement searchButton = driver.findElement(By.className("search-box-button"));
        System.out.println("search-box-button: " + searchButton.getAttribute("value"));

        WebElement headerMenu = driver.findElement(By.className("header-menu"));
        System.out.println("header-menu: " + headerMenu.getText());

        WebElement topMenu = driver.findElement(By.className("top-menu"));
        System.out.println("top-menu: " + topMenu.getText());

        WebElement footer = driver.findElement(By.className("footer"));
        System.out.println("footer: " + footer.getText());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}