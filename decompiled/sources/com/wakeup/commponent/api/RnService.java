package com.wakeup.commponent.api;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.facebook.react.ReactFragment;
import kotlin.Metadata;

/* compiled from: RnService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/commponent/api/RnService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "createReactFragment", "Lcom/facebook/react/ReactFragment;", "componentName", "", "destory", "", "checkUpdate", "context", "Landroid/content/Context;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RnService extends IProvider {
    void checkUpdate(Context context);

    ReactFragment createReactFragment(String componentName);

    void destory();
}
