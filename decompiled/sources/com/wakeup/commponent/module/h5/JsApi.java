package com.wakeup.commponent.module.h5;

import android.content.Context;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class JsApi implements Serializable {
    protected transient H5Config mConfig;
    protected transient Context mContext;

    public abstract String getName();

    public void unMount() {
    }

    public void onMount(Context context, H5Config h5Config) {
        this.mContext = context;
        this.mConfig = h5Config;
    }
}
