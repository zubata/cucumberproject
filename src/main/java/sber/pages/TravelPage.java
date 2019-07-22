package sber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TravelPage extends BasePage {

    @FindBy(xpath="//a[contains(text(),'Оформить')]")
    private WebElement opennextpage;

    @Step("Переход с страницы Путешествия и покупки на страницу Оформить онлайн")
    public void openFirstInsurancePage() {
        clickNextPage(opennextpage);
    }

    @Override
    public void pageWaitingLoad() {
        WebElement temp = driver.findElement(By.xpath("//h3[contains(text(),'Страхование')]"));
        waitelement(temp);
    }
}
