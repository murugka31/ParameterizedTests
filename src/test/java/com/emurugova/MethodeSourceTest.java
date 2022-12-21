package com.emurugova;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodeSourceTest {

    Page page = new Page();
    static Stream<Arguments> checkMenuItemsForSovremennikWithMethode() {
        return Stream.of(
                Arguments.of(
                        1, "Доставка", "Позитивный тест"
                ),
                Arguments.of(
                        2,  "Fellini", "Позитивный тест"
                ),
                Arguments.of(
                        3,  "Манга", "Позитивный тест"
                ),
                Arguments.of(
                        4,  "Фараон Hall", "Позитивный тест"
                ),
                Arguments.of(
                        5,  "Чарли Gold","Позитивный тест"
                ),
                Arguments.of(
                        6,  "Billiard", "Позитивный тест"
                ),
                Arguments.of(
                        7,  "Торты на", "Позитивный тест"
                )
        );
    }

    @MethodSource()
    @ParameterizedTest
    void checkMenuItemsForSovremennikWithMethode(int testId, String menuItem, String testName) {
        page.openPage();
        page.switchToMenuItemWithMethode(testId, menuItem, testName);
    }
}