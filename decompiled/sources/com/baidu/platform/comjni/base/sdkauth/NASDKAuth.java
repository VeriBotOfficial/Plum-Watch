package com.baidu.platform.comjni.base.sdkauth;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes13.dex */
public class NASDKAuth extends NativeComponent {
    public NASDKAuth() {
        create();
    }

    private static native long nativeCreate();

    private static native int nativeRelease(long j);

    public static native boolean nativeSetAuth(long j, String str, int i);

    public boolean a(String str, int i) {
        return nativeSetAuth(this.mNativePointer, str, i);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        this.mNativePointer = nativeCreate();
        return this.mNativePointer;
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        if (this.mNativePointer != 0) {
            this.mNativePointer = 0L;
        }
        return 0;
    }
}
