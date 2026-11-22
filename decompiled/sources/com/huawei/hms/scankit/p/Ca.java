package com.huawei.hms.scankit.p;

/* compiled from: DataMask.java */
/* loaded from: classes14.dex */
enum Ca extends Ka {
    Ca(String str, int i) {
        super(str, i, null);
    }

    @Override // com.huawei.hms.scankit.p.Ka
    boolean a(int i, int i2) {
        return ((i + i2) & 1) == 0;
    }
}
