package com.emurugova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {

    Page page = new Page();
    @CsvSource(value = {
            "0001; Доставка; Позитивный тест",
            "0002; Fellini; Позитивный тест",
            "0003; Манга; Позитивный тест",
            "0004; Фараон Hall; Позитивный тест",
            "0005; Чарли Gold; Позитивный тест",
            "0006; Billiard; Позитивный тест",
            "0007; Торты на; Позитивный тест",
    }, delimiter = ';')
    @ParameterizedTest
    void checkMenuItemsForSovremennikWithCsv(int testId, String menuItem, String testName) {
        page.openPage();
        page.switchToMenuItemWithCsv(testId, menuItem, testName);
    }
}
