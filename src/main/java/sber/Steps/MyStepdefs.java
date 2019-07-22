package sber.Steps;

import cucumber.api.java.ru.Допустим;
import basic.Initial;
import sber.pages.FirstInsurancePage;
import sber.pages.HomePage;
import sber.pages.SecondInsurancePage;
import sber.pages.TravelPage;

import java.util.Map;

public class MyStepdefs {

    @Допустим("шаг открытия сайта Сбербанка")
    public void шаг_открытия_сайта_Сбербанка() {
        Initial.getDriver().get("http://www.sberbank.ru/ru/person");
    }

    @Допустим("шаг с переходом на страницу Путешествия и Заявки")
    public void шаг_с_переходом_на_страницу_Путешествия_и_Заявки() {
        HomePage homePage = new HomePage();
        homePage.openTravelPage();
    }

    @Допустим("шаг с переходом на страницу Оформить Онлайн")
    public void шаг_с_переходом_на_страницу_Оформить_Онлайн() {
        TravelPage travelPage = new TravelPage();
        travelPage.openFirstInsurancePage();
    }

    @Допустим("шаг с переходом на страницу Оформления заявки")
    public void шаг_с_переходом_на_страницу_Оформления_заявки() {
        FirstInsurancePage firstInsurancePage = new FirstInsurancePage();
        firstInsurancePage.openSecondInsurancePage();
    }

    @Допустим("шаг заполенения заявки Сбербанк")
    public void шаг_заполенения_заявки_Сбербанк(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> map = dataTable.asMap(String.class,String.class);
        SecondInsurancePage fillForm = new SecondInsurancePage();
        fillForm.fillInsuredSurname(map.get("Фамилия застрахованного"));
        fillForm.fillInsuredFirsname(map.get("Имя застрахованного"));
        fillForm.fillInsuredBirthdate(map.get("Дата рождения застрахаванного"));
        fillForm.fillOwnerSurname(map.get("Фамилия страхователя"));
        fillForm.fillOwnerFirsname(map.get("Имя страхователя"));
        fillForm.fillOwnerMiddlename(map.get("Отчество страхователя"));
        fillForm.fillOwnerBirthdate(map.get("Дата рождения страхователя"));
        fillForm.clickOwnerSex(map.get("Пол страхователя"));
        fillForm.fillOwnerPassportSeries(map.get("Серия паспорта"));
        fillForm.fillOwnerPassportNumber(map.get("Номер паспорта"));
        fillForm.fillOwnerPassportDate(map.get("Когда выдан паспорт"));
        fillForm.fillOwnerPassportPlace(map.get("Кем выдан паспорт"));
        fillForm.checkfilledfields();
        fillForm.finishform();
    }

}
