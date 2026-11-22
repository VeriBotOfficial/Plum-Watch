package com.facebook.hermes.intl;

/* loaded from: classes14.dex */
public class LocaleObject {
    public static ILocaleObject createDefault() {
        return LocaleObjectICU.createDefault();
    }

    public static ILocaleObject createFromLocaleId(String str) throws JSRangeErrorException {
        return LocaleObjectICU.createFromLocaleId(str);
    }
}
