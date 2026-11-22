package com.xiaomi.push;

/* loaded from: classes4.dex */
public class as implements au {

    /* renamed from: a, reason: collision with root package name */
    private final String f14439a;
    private final String b;

    public as(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f14439a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.au
    public String a() {
        return this.f14439a;
    }

    @Override // com.xiaomi.push.au
    public String b() {
        return this.b;
    }
}
