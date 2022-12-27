package com.emurugova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {

    Page page = new Page();
    @CsvSource(value = {
            "1; Доставка; Позитивный тест",
            "2; Fellini; Позитивный тест",
            "3; Манга; Позитивный тест",
            "4; Фараон Hall; Позитивный тест",
            "5; Чарли Gold; Позитивный тест",
            "6; Billiard; Позитивный тест",
            "7; Торты на; Позитивный тест",
            "8; Кино; Позитивный тест",
    }, delimiter = ';')
    @ParameterizedTest
    void checkMenuItemsForSovremennikWithCsv(int testId, String menuItem, String testName) {
        page.openPage();
        page.switchToMenuItemWithCsv(testId, menuItem, testName);
    }
}
