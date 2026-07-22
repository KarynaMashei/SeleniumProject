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
        // --- 4 элемента по имени тэга (tagName) ---
        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println("tagName a: " + link.getText());

        WebElement listItem = driver.findElement(By.tagName("li"));
        System.out.println("tagName li: " + listItem.getText());

        WebElement image = driver.findElement(By.tagName("img"));
        System.out.println("tagName img: " + image.getAttribute("src"));

        WebElement input = driver.findElement(By.tagName("input"));
        System.out.println("tagName input: " + input.getAttribute("type"));

        // --- 3 элемента по id ---
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        System.out.println("id small-searchterms: " + searchBox.getAttribute("id"));

        WebElement cartLink = driver.findElement(By.id("topcartlink"));
        System.out.println("id topcartlink: " + cartLink.getText());

        WebElement loginLink = driver.findElement(By.className("ico-login"));
        System.out.println("id-подобный (по классу) ico-login: " + loginLink.getText());

        // --- 3 элемента по className ---
        WebElement headerLogo = driver.findElement(By.className("header-logo"));
        System.out.println("className header-logo: " + headerLogo.getAttribute("class"));

        WebElement headerLinks = driver.findElement(By.className("header-links"));
        System.out.println("className header-links: " + headerLinks.getAttribute("class"));

        WebElement loginByClass = driver.findElement(By.className("ico-login"));
        System.out.println("className ico-login: " + loginByClass.getAttribute("class"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
