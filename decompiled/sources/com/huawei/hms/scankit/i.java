package com.huawei.hms.scankit;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.king.zxing.Intents;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: DecodeFormatManager.java */
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<BarcodeFormat> f10540a;
    public static final Set<BarcodeFormat> b;
    public static final Set<BarcodeFormat> c;
    public static final Set<BarcodeFormat> d;
    public static final Set<BarcodeFormat> e;
    public static final Set<BarcodeFormat> f;
    public static final Set<BarcodeFormat> g;
    private static final Map<String, Set<BarcodeFormat>> h;

    static {
        EnumSet of = EnumSet.of(BarcodeFormat.QR_CODE);
        d = of;
        EnumSet of2 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        e = of2;
        EnumSet of3 = EnumSet.of(BarcodeFormat.AZTEC);
        f = of3;
        EnumSet of4 = EnumSet.of(BarcodeFormat.PDF_417);
        g = of4;
        EnumSet of5 = EnumSet.of(BarcodeFormat.UPC_A, BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8);
        f10540a = of5;
        EnumSet of6 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        b = of6;
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        c = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put(Intents.Scan.ONE_D_MODE, copyOf);
        hashMap.put(Intents.Scan.PRODUCT_MODE, of5);
        hashMap.put(Intents.Scan.QR_CODE_MODE, of);
        hashMap.put(Intents.Scan.DATA_MATRIX_MODE, of2);
        hashMap.put(Intents.Scan.AZTEC_MODE, of3);
        hashMap.put(Intents.Scan.PDF417_MODE, of4);
    }
}
