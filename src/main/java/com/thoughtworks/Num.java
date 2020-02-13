package com.thoughtworks;

public enum Num {
    num1("A"),
    num2("2"),
    num3("3"),
    num4("4"),
    num5("5"),
    num6("6"),
    num7("7"),
    num8("8"),
    num9("9"),
    num10("10"),
    num11("J"),
    num12("Q"),
    num13("K");

    private String value;

    Num() {
    }

    Num(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
