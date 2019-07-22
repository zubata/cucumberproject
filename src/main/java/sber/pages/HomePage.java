package sber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath="//button[contains(@aria-label,'Страхование')]")
    public WebElement openmenubut;

    @FindBy(xpath="//a[contains(text(),'Путешествия и покупки')]")
    public WebElement openpagebut;

    @Step("Переход с главной страницы на страницу Путешествия и покупки")
    public void openTravelPage() {
        openmenuHomepage();
        waitelement(openpagebut).click();
    }

    public void openmenuHomepage() {
        waitelement(openmenubut).click();
    }

}
