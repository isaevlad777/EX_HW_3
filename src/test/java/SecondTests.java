import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

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
        $(id("subjectsInput")).setValue("C");
        $(id("react-select-2-option-4")).click();
        $(byText("Music")).click();
        $("input#uploadPicture").uploadFile(new File("src/test/resources/test.jpg"));
        $(id("currentAddress")).setValue("Test street and house");
        $(byText("Select State")).click();
        $(id("react-select-3-option-3")).click();
        $(byText("Select City")).click();
        $(id("react-select-4-option-1")).click();
        $(id("firstName")).pressEnter();

        $(xpath("//td[text()='Student Name']/following::td[1]")).shouldHave(text("Vladislav Isaev"));

        //$(byTagAndText("td", "Student Name"));
        //gertert

    }


}
