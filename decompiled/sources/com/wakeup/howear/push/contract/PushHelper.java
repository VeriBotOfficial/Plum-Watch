package com.wakeup.howear.push.contract;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: PushHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/push/contract/PushHelper;", "", "isSupportPush", "", "context", "Landroid/content/Context;", "initPush", "", "getCurrentRegId", "", "saveRegId", "regId", "module-push_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PushHelper {
    String getCurrentRegId();

    void initPush(Context context);

    boolean isSupportPush(Context context);

    void saveRegId(String regId);
}
