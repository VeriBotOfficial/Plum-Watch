package com.bytedance.sdk.component.adexpress.rb;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.fxn.dx;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class hm {
    private WeakReference<dx> fxn;

    public hm(dx dxVar) {
        this.fxn = new WeakReference<>(dxVar);
    }

    public void fxn(dx dxVar) {
        this.fxn = new WeakReference<>(dxVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<dx> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().invokeMethod(str);
    }
}
