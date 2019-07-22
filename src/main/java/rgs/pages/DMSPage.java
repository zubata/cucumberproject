package rgs.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DMSPage extends BasePage {

    @FindBy(xpath="//a[contains(text(),\"Отправить заявку\")]")
    public WebElement torequestpagebutton;

    @Step("Переход к отправлению заявки")
    public void toRequestPage() {
        waitelement(torequestpagebutton).click();
    }

    @Override
    public void pageWaitingLoad() {
        WebElement temp = driver.findElement(By.xpath("//*[contains(text(),'добровольное медицинское страхование')]"));
        waitelement(temp);
    }
}
