package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultipleBarcodeDetector.java */
/* loaded from: classes14.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public List<L> f10581a = new ArrayList();
    private int b = 0;

    public void a(boolean z, byte[] bArr, int i, int i2, int i3, boolean z2) {
        float[] multiBarcodeDetect = LoadOpencvJNIUtil.multiBarcodeDetect(bArr, i, i2, i3, z2);
        if (multiBarcodeDetect != null) {
            this.b = multiBarcodeDetect.length / 10;
        } else {
            this.b = 0;
        }
        for (int i4 = 0; i4 < this.b; i4++) {
            int i5 = i4 * 10;
            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i5)) {
                int i6 = i5 + 1;
                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i6)) {
                    int i7 = i5 + 2;
                    if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i7)) {
                        int i8 = i5 + 3;
                        if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i8)) {
                            int i9 = i5 + 4;
                            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i9)) {
                                int i10 = i5 + 5;
                                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i10)) {
                                    int i11 = i5 + 6;
                                    if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i11)) {
                                        int i12 = i5 + 7;
                                        if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i12)) {
                                            int i13 = i5 + 8;
                                            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i13)) {
                                                int i14 = i5 + 9;
                                                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i14)) {
                                                    this.f10581a.add(new L(z, multiBarcodeDetect[i5], multiBarcodeDetect[i6], multiBarcodeDetect[i7], multiBarcodeDetect[i8], multiBarcodeDetect[i9], multiBarcodeDetect[i10], multiBarcodeDetect[i11], multiBarcodeDetect[i12], multiBarcodeDetect[i13], multiBarcodeDetect[i14]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
