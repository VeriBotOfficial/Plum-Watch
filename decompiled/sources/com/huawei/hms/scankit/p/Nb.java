package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;

/* compiled from: MultiFormatWriter.java */
/* loaded from: classes14.dex */
/* synthetic */ class Nb {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f10583a;

    static {
        int[] iArr = new int[BarcodeFormat.values().length];
        f10583a = iArr;
        try {
            iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10583a[BarcodeFormat.UPC_E.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10583a[BarcodeFormat.EAN_13.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10583a[BarcodeFormat.UPC_A.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10583a[BarcodeFormat.QR_CODE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f10583a[BarcodeFormat.CODE_39.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f10583a[BarcodeFormat.CODE_93.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10583a[BarcodeFormat.CODE_128.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f10583a[BarcodeFormat.ITF.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f10583a[BarcodeFormat.PDF_417.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f10583a[BarcodeFormat.CODABAR.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f10583a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f10583a[BarcodeFormat.AZTEC.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
    }
}
