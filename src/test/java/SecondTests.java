import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;

public class SecondTests {

    @Test
    void test1 (){
        open("/automation-practice-form");
        $(id("firstName")).setValue("Vladislav");
        $(id("lastName")).setValue("Isaev");
        $(id("userEmail")).setValue("test@test.ru");
    }

    @BeforeAll
    static void beforeAll (){
        Configuration.baseUrl ="https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "none";
    }
}
