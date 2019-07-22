package rgs.Steps;

import cucumber.api.java.ru.Допустим;
import basic.Initial;
import rgs.pages.DMSPage;
import rgs.pages.HomePage;
import rgs.pages.PageFillForm;

import java.util.Map;

public class MyStepdefs {

    @Допустим("шаг открытия сайта Росгостраха")
    public void шаг_открытия_сайта_Росгостраха() {
        Initial.getDriver().get("http://www.rgs.ru");
    }

    @Допустим("шаг с переходом на страницу ДМС")
    public void шаг_с_переходом_на_страницу_ДМС() {
        HomePage startPage = new HomePage();
        startPage.openDMSPage();
    }

    @Допустим("шаг с переходом на страницу Отправления Заявки")
    public void шаг_с_переходом_на_страницу_Отправления_Заявки() {
        DMSPage dmsPage = new DMSPage();
        dmsPage.toRequestPage();
    }

    @Допустим("шаг заполенения заявки Росгострах")
    public void шаг_заполенения_заявки_Росгострах(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> map = dataTable.asMap(String.class,String.class);
        PageFillForm fillForm = new PageFillForm();
        fillForm.fillSurname(map.get("Фамилия"));
        fillForm.fillFirsname(map.get("Имя"));
        fillForm.fillMiddlename(map.get("Отчество"));
        fillForm.fillRegion(map.get("Регион"));
        fillForm.fillPhone(map.get("Телефон"));
        fillForm.fillEmail(map.get("Email"));
        fillForm.fillComment(map.get("Комментарий"));
        fillForm.clickAcceptForm();
        fillForm.sendForm();
        fillForm.chechErrors("Введите адрес электронной почты");
    }

}
