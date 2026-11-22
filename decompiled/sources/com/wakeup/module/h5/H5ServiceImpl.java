package com.wakeup.module.h5;

import android.content.Context;
import android.os.Bundle;
import com.wakeup.common.EventMgr;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.module.h5.H5Config;
import com.wakeup.commponent.module.h5.H5Service;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: H5ServiceImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/h5/H5ServiceImpl;", "Lcom/wakeup/commponent/module/h5/H5Service;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "open", "config", "Lcom/wakeup/commponent/module/h5/H5Config;", "openPay", "callJsMethod", "functionName", "", "jsonParams", "module-h5_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H5ServiceImpl implements H5Service {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.wakeup.commponent.module.h5.H5Service
    public void open(Context context, H5Config config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Bundle bundle = new Bundle();
        bundle.putSerializable("config", config);
        Unit unit = Unit.INSTANCE;
        Navigator.start(context, (Class<?>) H5ContainerActivity.class, bundle);
    }

    @Override // com.wakeup.commponent.module.h5.H5Service
    public void openPay(Context context, H5Config config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Bundle bundle = new Bundle();
        bundle.putSerializable("config", config);
        Unit unit = Unit.INSTANCE;
        Navigator.start(context, (Class<?>) PaymentContainerActivity.class, bundle);
    }

    @Override // com.wakeup.commponent.module.h5.H5Service
    public void callJsMethod(String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        EventMgr.getCallJsMethodEvent().post(TuplesKt.to(functionName, ""));
    }

    @Override // com.wakeup.commponent.module.h5.H5Service
    public void callJsMethod(String functionName, String jsonParams) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(jsonParams, "jsonParams");
        EventMgr.getCallJsMethodEvent().post(TuplesKt.to(functionName, jsonParams));
    }
}
