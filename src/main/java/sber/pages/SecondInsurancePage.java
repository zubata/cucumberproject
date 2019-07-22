package sber.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SecondInsurancePage extends BasePage {

    @FindBy(xpath="//*[contains(text(),'Продолжить')]")
    private WebElement theendbutton;

    @Step("Оформление заявки на страхование")
    public void finishform() {
        theendbutton.click();
        chechErrors("Заполнены не все обязательные поля");
        takeScreenshot();
    }

    public void fillInsuredSurname(String value) { fillfield("//*[(@name='insured0_surname')]",value);}
    public void fillInsuredFirsname(String value) {fillfield("//*[(@name='insured0_name')]",value);}
    public void fillInsuredBirthdate(String value) {fillfield("//*[(@name='insured0_birthDate')]",value);}
    public void fillOwnerSurname(String choice) { fillfield("//*[(@name='surname')]", choice);}
    public void fillOwnerFirsname(String value) {fillfield("//*[(@name='name')]",value);}
    public void fillOwnerMiddlename(String value) {fillfield("//*[(@name='middlename')]",value);}
    public void fillOwnerBirthdate(String value) {fillfield("//*[(@name='birthDate')]",value);}
    public void clickOwnerSex(String value) {
        String sex = value.equals("мужской")? "male":"female";
        clickradiobutton(String.format("//*[(@name='%s')]",sex));
    }
    public void fillOwnerPassportSeries(String value) {fillfield("//*[(@name='passport_series')]",value);}
    public void fillOwnerPassportNumber(String value) {fillfield("//*[(@name='passport_number')]",value);}
    public void fillOwnerPassportDate(String value) {fillfield("//*[(@name='issueDate')]",value);}
    public void fillOwnerPassportPlace(String value) {fillfield("//*[(@name='issuePlace')]",value);}

}
