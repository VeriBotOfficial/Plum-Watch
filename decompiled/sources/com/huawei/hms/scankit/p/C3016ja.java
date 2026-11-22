package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.C3020ka;

/* compiled from: DecodedBitStreamParser.java */
/* renamed from: com.huawei.hms.scankit.p.ja, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
/* synthetic */ class C3016ja {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f10656a;

    static {
        int[] iArr = new int[C3020ka.a.values().length];
        f10656a = iArr;
        try {
            iArr[C3020ka.a.ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10656a[C3020ka.a.LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10656a[C3020ka.a.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10656a[C3020ka.a.PUNCT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10656a[C3020ka.a.ALPHA_SHIFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10656a[C3020ka.a.PUNCT_SHIFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
