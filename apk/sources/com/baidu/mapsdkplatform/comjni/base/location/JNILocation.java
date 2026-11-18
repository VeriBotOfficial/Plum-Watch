package com.baidu.mapsdkplatform.comjni.base.location;

import android.os.Bundle;

/* JADX INFO: loaded from: classes15.dex */
public class JNILocation {
    public native boolean CoordinateEncryptEx(int r1, float f, float f2, Bundle bundle, String str);

    public native int Create();

    public native int QueryInterface(int r1);

    public native int Release(int r1);
}
