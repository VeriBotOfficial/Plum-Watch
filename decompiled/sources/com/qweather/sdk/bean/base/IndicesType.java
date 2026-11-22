package com.qweather.sdk.bean.base;

/* loaded from: classes17.dex */
public enum IndicesType {
    ALL("0"),
    CW("2"),
    COMF("8"),
    DRSG("3"),
    FLU("9"),
    SPT("1"),
    TRAV("6"),
    UV("5"),
    AP("10"),
    AC("11"),
    AG("7"),
    GL("12"),
    SK("17"),
    MU("13"),
    DC("14"),
    PTFC("15"),
    FIS("4"),
    SPI("16");

    private String code;

    IndicesType(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
