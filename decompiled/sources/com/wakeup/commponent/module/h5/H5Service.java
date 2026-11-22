package com.wakeup.commponent.module.h5;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import kotlin.Metadata;

/* compiled from: H5Service.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/h5/H5Service;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "open", "", "context", "Landroid/content/Context;", "config", "Lcom/wakeup/commponent/module/h5/H5Config;", "openPay", "callJsMethod", "functionName", "", "jsonParams", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface H5Service extends IProvider {
    void callJsMethod(String functionName);

    void callJsMethod(String functionName, String jsonParams);

    void open(Context context, H5Config config);

    void openPay(Context context, H5Config config);
}
