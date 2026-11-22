package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.C3054t;

/* compiled from: Decoder.java */
/* renamed from: com.huawei.hms.scankit.p.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
/* synthetic */ class C3050s {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f10685a;

    static {
        int[] iArr = new int[C3054t.a.values().length];
        f10685a = iArr;
        try {
            iArr[C3054t.a.UPPER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10685a[C3054t.a.LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10685a[C3054t.a.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10685a[C3054t.a.PUNCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10685a[C3054t.a.DIGIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
