package sber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstInsurancePage extends BasePage {

    @FindBy(xpath="//div[contains(text(),'Минимальная')]")
    private WebElement minimum;

    @FindBy(xpath="//span[contains(@ng-click,'save')]")
    private WebElement issuebutton;

    @Step("Определение минимальной суммые страх. защиты и переход к оформлению")
    public void openSecondInsurancePage() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        waitelement(minimum).click();
        waitelement(issuebutton).click();
    }

    @Override
    public void pageWaitingLoad() {
        WebElement temp = driver.findElement(By.xpath("//*[contains(text(),'Регион действия полиса')]"));
        waitelement(temp);
    }
}
