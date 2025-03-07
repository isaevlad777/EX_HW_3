import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;

public class SecondTests {

    @BeforeAll
    static void beforeAll (){
        Configuration.baseUrl ="https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "none";
    }

    @Test
    void test1 (){
        open("/automation-practice-form");
        $(id("firstName")).setValue("Vladislav");
        $(id("lastName")).setValue("Isaev");
        $(id("userEmail")).setValue("test@test.ru");
        $(byText("Male")).click();
        $(id("userNumber")).setValue("9270232999");
        $(id("dateOfBirthInput")).click();
        $(".react-datepicker__month-select").click();
        $(byText("September")).click();
        $(".react-datepicker__year-select").click();
        $(byText("1997")).click();
        $(".react-datepicker__day--018").click();
        $(id("subjectsInput")).setValue("Tests Subject");
        $(byText("Music")).click();

    }


}
