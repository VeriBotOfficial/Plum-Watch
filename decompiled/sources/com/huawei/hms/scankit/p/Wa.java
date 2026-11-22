package com.huawei.hms.scankit.p;

/* compiled from: QRCodeDecoderMetaData.java */
/* loaded from: classes14.dex */
public final class Wa {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10610a;

    Wa(boolean z) {
        this.f10610a = z;
    }

    public void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        if (!this.f10610a || zVarArr == null || zVarArr.length < 3) {
            return;
        }
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        zVarArr[0] = zVarArr[2];
        zVarArr[2] = zVar;
    }
}
