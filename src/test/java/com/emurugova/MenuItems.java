package com.emurugova;

public enum MenuItems {
    DELIVERY("Доставка"),
    FELLINI("Fellini"),
    MANGA("Манга"),
    PHARAON("Фараон Hall"),
    CHARLIE("Чарли Gold"),
    BILLIARD("Billiard"),
    CAKES("Торты на"),
    Cinema ("Кино");

    private String desc;

    MenuItems(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
