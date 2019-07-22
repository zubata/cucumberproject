package rgs.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath="//*[contains(text(),\"Страхование\")]")
    public WebElement openmenubut;

    @FindBy(xpath="//*[contains(text(),\"ДМС\")]")
    public WebElement openpagebut;

    @Step("Переход с главной страницы на страницу ДМС")
    public void openDMSPage() {
        openmenuHomepage();
        waitelement(openpagebut).click();
    }

    public void openmenuHomepage() {
        waitelement(openmenubut).click();
    }

}
