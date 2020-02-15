package com.thoughtworks;

public enum Suit {
    club("梅花"), diamond("方片"), spade("黑桃"), heart("红桃");

    private String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
