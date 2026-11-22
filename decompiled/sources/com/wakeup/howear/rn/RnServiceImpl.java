package com.wakeup.howear.rn;

import android.content.Context;
import com.facebook.react.ReactFragment;
import com.wakeup.commponent.api.RnService;
import com.wakeup.howear.rn.core.RNHelper;
import com.wakeup.howear.rn.core.update.UpdateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RnServiceImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/howear/rn/RnServiceImpl;", "Lcom/wakeup/commponent/api/RnService;", "<init>", "()V", "context", "Landroid/content/Context;", "init", "", "createReactFragment", "Lcom/facebook/react/ReactFragment;", "componentName", "", "destory", "checkUpdate", "feature-rn_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RnServiceImpl implements RnService {
    private Context context;

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.wakeup.commponent.api.RnService
    public ReactFragment createReactFragment(String componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        return RNHelper.INSTANCE.buildReactFragment(componentName);
    }

    @Override // com.wakeup.commponent.api.RnService
    public void destory() {
        RNHelper.INSTANCE.clearReactNativeHost();
    }

    @Override // com.wakeup.commponent.api.RnService
    public void checkUpdate(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UpdateManager.INSTANCE.checkUpdate(context);
    }
}
