package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* compiled from: UPCAWriter.java */
/* renamed from: com.huawei.hms.scankit.p.uc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3061uc implements Pb {

    /* renamed from: a, reason: collision with root package name */
    private final C3046qc f10694a = new C3046qc();

    @Override // com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f10694a.a("0" + str, BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + barcodeFormat);
    }
}
