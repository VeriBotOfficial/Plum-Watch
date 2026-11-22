package com.wakeup.common.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.umeng.analytics.pro.ak;
import com.wakeup.common.log.LogUtils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/base/BaseHandler;", "T", "Landroid/os/Handler;", ak.aH, "<init>", "(Ljava/lang/Object;)V", "mReference", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "onMessage", "(Ljava/lang/Object;Landroid/os/Message;)V", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseHandler<T> extends Handler {
    public static final String TAG = "BaseHandler";
    private WeakReference<T> mReference;

    public abstract void onMessage(T t, Message msg);

    public BaseHandler(T t) {
        super(Looper.getMainLooper());
        this.mReference = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.handleMessage(msg);
        T t = this.mReference.get();
        if (t == null) {
            LogUtils.w(TAG, "handleMessage reference is null");
        } else {
            onMessage(t, msg);
        }
    }
}
