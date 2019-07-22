package rgs.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageFillForm extends BasePage {

    @FindBy(xpath="//button[contains(text(),'Отправить')]")
    public WebElement sendformbuton;

    @FindBy(xpath = "//input[contains(@class,'checkbox')]")
    public WebElement acceptbutton;

    @Step("Отправление заполненной")
    public void sendForm() {
        waitelement(sendformbuton).click();
    }

    @Step("Нажатие кнопки \"Я согласен\" и проверка заполненности введённых полей")
    public void clickAcceptForm() {
        acceptbutton.click();
        checkfilledfields();
        takeScreenshot();
    }

    @Override
    public void pageWaitingLoad() {
        WebElement temp = driver.findElement(By.xpath("//*[contains(text(),'добровольное медицинское страхование')]"));
        waitelement(temp);
    }

    public void fillSurname(String value) { fillfield("//*[@name='LastName']",value);}
    public void fillFirsname(String value) {fillfield("//*[@name='FirstName']",value);}
    public void fillMiddlename(String value) {fillfield("//*[@name='MiddleName']",value);}
    public void fillRegion(String choice) { multiplechoice("//*[@name='Region']", choice);}
    public void fillPhone(String value) {fillfield("//*[contains(@data-bind,'Phone')]",value);}
    public void fillEmail(String value) {fillfield("//*[@name='Email']",value);}
    public void fillComment(String value) {fillfield("//*[contains(@name,'Comment')]",value);}
}
