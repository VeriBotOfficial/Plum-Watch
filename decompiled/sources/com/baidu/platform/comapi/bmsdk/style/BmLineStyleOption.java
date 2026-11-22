package com.baidu.platform.comapi.bmsdk.style;

import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes13.dex */
public class BmLineStyleOption extends BmObject {
    private BmLineStyleOption() {
        super(52, nativeCreate());
    }

    private static native boolean nativeBuildStyleOption(long j, int i, long j2);

    private static native long nativeCreate();

    public BmLineStyleOption(int i, BmLineStyle bmLineStyle) {
        super(52, nativeCreate());
        nativeBuildStyleOption(this.nativeInstance, i, bmLineStyle != null ? bmLineStyle.getNativeInstance() : 0L);
    }
}
