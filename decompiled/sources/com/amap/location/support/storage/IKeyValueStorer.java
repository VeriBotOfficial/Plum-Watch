package com.amap.location.support.storage;

/* loaded from: classes11.dex */
public interface IKeyValueStorer {
    void clear();

    boolean getBoolean(String str, boolean z);

    double getDouble(String str, double d);

    float getFloat(String str, float f);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z);

    void putDouble(String str, double d);

    void putFloat(String str, float f);

    void putInt(String str, int i);

    void putLong(String str, long j);

    void putString(String str, String str2);

    void save();
}
