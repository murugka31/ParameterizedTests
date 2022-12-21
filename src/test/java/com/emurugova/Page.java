package com.emurugova;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.emurugova.TestData.url;

public class Page {

    public void openPage(){
        Configuration.startMaximized = true;
        Selenide.open(url);
    }

    public Page switchToMenuItemWithEnum (MenuItems menuItem) {
        $(".items").$(byText(menuItem.getDesc())).click();
        System.out.println("Проверено: " + menuItem.getDesc());
        return this;
    }

    public Page switchToMenuItemWithValues(String menuItem) {
        $(".items").$(byText(menuItem)).click();
        System.out.println("Проверено: " + menuItem);
        return this;
    }

    public Page switchToMenuItemWithCsv(int testId, String menuItem, String testName) {
        $(".items").$(byText(menuItem)).click();
        System.out.println("Проверено: " + menuItem + ", " + testName + ", номер теста " + testId + ".");
        return this;
    }

    public Page switchToMenuItemWithMethode(int testId, String menuItem, String testName) {
        $(".items").$(byText(menuItem)).click();
        System.out.println("Проверено: " + menuItem + ", " + testName + ", номер теста " + testId + ".");
        return this;
    }
}

