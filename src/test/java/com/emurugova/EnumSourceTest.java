package com.emurugova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {

    Page page = new Page();
    @EnumSource(MenuItems.class)
    @ParameterizedTest
    void checkMenuItemsForSovremennikWithEnum(MenuItems menuItem) {
        page.openPage();
        page.switchToMenuItemWithEnum(menuItem);
    }
}
