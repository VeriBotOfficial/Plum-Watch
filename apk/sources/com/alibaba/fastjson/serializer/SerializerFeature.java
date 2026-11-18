package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes7.dex */
public enum SerializerFeature {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    WriteEnumUsingName,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    BrowserCompatible,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue,
    BrowserSecure,
    IgnoreNonFieldGetter,
    WriteNonStringValueAsString,
    IgnoreErrorGetter,
    WriteBigDecimalAsPlain,
    MapSortField;

    public static final SerializerFeature[] EMPTY;
    public static final int WRITE_MAP_NULL_FEATURES;
    public final int mask = 1 << ordinal();

    static {
        SerializerFeature serializerFeature = WriteMapNullValue;
        SerializerFeature serializerFeature2 = WriteNullListAsEmpty;
        SerializerFeature serializerFeature3 = WriteNullStringAsEmpty;
        SerializerFeature serializerFeature4 = WriteNullNumberAsZero;
        SerializerFeature serializerFeature5 = WriteNullBooleanAsFalse;
        EMPTY = new SerializerFeature[0];
        WRITE_MAP_NULL_FEATURES = serializerFeature.getMask() | serializerFeature5.getMask() | serializerFeature2.getMask() | serializerFeature4.getMask() | serializerFeature3.getMask();
    }

    SerializerFeature() {
    }

    public final int getMask() {
        return this.mask;
    }

    public static boolean isEnabled(int r0, SerializerFeature serializerFeature) {
        return (r0 & serializerFeature.mask) != 0;
    }

    public static boolean isEnabled(int r0, int r1, SerializerFeature serializerFeature) {
        int r2 = serializerFeature.mask;
        return ((r0 & r2) == 0 && (r1 & r2) == 0) ? false : true;
    }

    public static int config(int r0, SerializerFeature serializerFeature, boolean z) {
        if (z) {
            return r0 | serializerFeature.mask;
        }
        return r0 & (~serializerFeature.mask);
    }

    public static int of(SerializerFeature[] serializerFeatureArr) {
        if (serializerFeatureArr == null) {
            return 0;
        }
        int r2 = 0;
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            r2 |= serializerFeature.mask;
        }
        return r2;
    }
}
