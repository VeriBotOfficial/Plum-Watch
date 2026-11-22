package com.baidu.mapapi.search.base;

import com.anythink.expressad.video.dynview.a.a;
import com.umeng.analytics.pro.ak;

/* loaded from: classes13.dex */
public enum InputLanguageType {
    AUTO("auto"),
    ENGLISH("en"),
    CANTONESE("yue"),
    CLASSICAL_CHINESE("wyw"),
    JAPANESE("jp"),
    KOREAN("kor"),
    FRENCH("fra"),
    SPANISH("spa"),
    THAI("th"),
    ARABIC("ara"),
    RUSSIAN(a.Y),
    PORTUGUESE("pt"),
    GERMAN("de"),
    ITALIAN("it"),
    Greek("el"),
    DUTCH("nl"),
    Polish(ak.az),
    BULGARIAN("bul"),
    ESTONIAN("est"),
    DANISH("dan"),
    FINNISH("fin"),
    CZECH("cs"),
    ROMANIAN("rom"),
    SLOVENIAN("slo"),
    SWEDISH("swe"),
    HUNGARIAN("hu"),
    TRADITIONAL_CHINESE("cht"),
    VIETNAMESE("vie");

    private final String value;

    InputLanguageType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
