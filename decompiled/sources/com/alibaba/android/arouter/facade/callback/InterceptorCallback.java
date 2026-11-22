package com.alibaba.android.arouter.facade.callback;

import com.alibaba.android.arouter.facade.Postcard;

/* loaded from: classes11.dex */
public interface InterceptorCallback {
    void onContinue(Postcard postcard);

    void onInterrupt(Throwable th);
}
