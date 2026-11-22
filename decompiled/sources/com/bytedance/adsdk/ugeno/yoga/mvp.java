package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes13.dex */
public class mvp extends YogaNodeJNIBase {
    protected void finalize() throws Throwable {
        try {
            rlu();
        } finally {
            super.finalize();
        }
    }

    public void rlu() {
        if (this.fxn != 0) {
            long j = this.fxn;
            this.fxn = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}
