package com.xiaomi.push;

import java.net.InetSocketAddress;

/* loaded from: classes4.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private int f14485a;

    /* renamed from: a, reason: collision with other field name */
    private String f270a;

    public int a() {
        return this.f14485a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11959a() {
        return this.f270a;
    }

    public cf(String str, int i) {
        this.f270a = str;
        this.f14485a = i;
    }

    public static cf a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf != -1) {
            String substring = str.substring(0, lastIndexOf);
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                if (parseInt > 0) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
            str = substring;
        }
        return new cf(str, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static InetSocketAddress m11958a(String str, int i) {
        cf a2 = a(str, i);
        return new InetSocketAddress(a2.m11959a(), a2.a());
    }

    public String toString() {
        if (this.f14485a > 0) {
            return this.f270a + ":" + this.f14485a;
        }
        return this.f270a;
    }
}
