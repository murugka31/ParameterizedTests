package com.emurugova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {

    Page page = new Page();
    @ValueSource(strings = {
            "Доставка",
            "Fellini",
            "Манга",
            "Фараон Hall",
            "Чарли Gold",
            "Billiard",
            "Торты на",
            "Кино"
    })
    @ParameterizedTest
    void checkMenuItemsForSovremennikWithValues (String menuItem) {
        page.openPage();
        page.switchToMenuItemWithValues(menuItem);
    }
}
