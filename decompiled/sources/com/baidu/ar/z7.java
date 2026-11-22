package com.baidu.ar;

/* loaded from: classes12.dex */
public enum z7 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a, reason: collision with root package name */
    public String f7360a;

    z7(int i, String str) {
        this.f7360a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f7360a;
    }
}
