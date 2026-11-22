package com.huawei.hms.scankit;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MsModel.java */
/* loaded from: classes14.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f10716a = null;
    private static byte[] b = null;
    private static float[] c = null;
    private static int d = 8136;

    public static int a() {
        return d;
    }

    public static void b(Context context, String str) {
        com.huawei.hms.scankit.util.a.c("MsModel", "load model...." + str);
        if (f10716a != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            com.huawei.hms.scankit.util.a.c("MsModel", "inputStream" + open);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            f10716a = bArr;
        } catch (IOException unused) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadModel IOException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadModel Exception");
        }
    }

    public static byte[] c() {
        return f10716a;
    }

    public static float[] d() {
        return c;
    }

    public static float a(byte[] bArr, int i) {
        return Float.intBitsToFloat((int) ((bArr[i + 3] << 24) | (((int) ((((int) ((bArr[i] & 255) | (bArr[i + 1] << 8))) & 65535) | (bArr[i + 2] << 16))) & 16777215)));
    }

    public static void c(Context context, String str) {
        com.huawei.hms.scankit.util.a.c("MsModel", "ms anrchos...." + str);
        if (c != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            com.huawei.hms.scankit.util.a.c("MsModel", "2inputStream" + open);
            int available = open.available();
            byte[] bArr = new byte[available];
            open.read(bArr);
            open.close();
            c = new float[available / 4];
            int i = 0;
            while (true) {
                float[] fArr = c;
                if (i >= fArr.length) {
                    return;
                }
                fArr[i] = a(bArr, i * 4);
                i++;
            }
        } catch (IOException unused) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadMsAnchors IOException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadMsAnchors Exception");
        }
    }

    public static void a(Context context, String str) {
        com.huawei.hms.scankit.util.a.c("MsModel", "load angle model...." + str);
        if (b != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            com.huawei.hms.scankit.util.a.c("MsModel", "3inputStream" + open);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            b = bArr;
        } catch (IOException unused) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadAngleModel IOException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("MsModel", "loadAngleModel Exception");
        }
    }

    public static byte[] b() {
        return b;
    }
}
