package com.wakeup.common.base;

import com.umeng.analytics.pro.ak;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: SimpleCallback.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/base/SimpleCallback;", "H", "T", "Lcom/wakeup/common/base/BaseCallback;", "h", "<init>", "(Ljava/lang/Object;)V", "holder", "Ljava/lang/ref/WeakReference;", "getHolder", "()Ljava/lang/ref/WeakReference;", "callback", "", "code", "", ak.aH, "(ILjava/lang/Object;)V", "onCallback", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SimpleCallback<H, T> extends BaseCallback<T> {
    private final WeakReference<H> holder;

    public abstract void onCallback(int code, T t);

    public final WeakReference<H> getHolder() {
        return this.holder;
    }

    public SimpleCallback(H h) {
        this.holder = new WeakReference<>(h);
    }

    @Override // com.wakeup.common.base.BaseCallback
    public void callback(int code, T t) {
        if (this.holder.get() == null) {
            return;
        }
        onCallback(code, t);
    }
}
