package com.wakeup.common.network;

import com.wakeup.module.record.Constants;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseObserver.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/BaseObserver;", "T", "Lio/reactivex/Observer;", "Lcom/wakeup/common/network/BaseResult;", "<init>", "()V", "onSubscribe", "", "d", "Lio/reactivex/disposables/Disposable;", Constants.ON_COMPLETE_KEY, "onError", "e", "", "onNext", "result", "onSuccess", "data", "(Ljava/lang/Object;)V", "onFail", "code", "", "msg", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseObserver<T> implements Observer<BaseResult<T>> {
    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    public void onFail(int code, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable d) {
        Intrinsics.checkNotNullParameter(d, "d");
    }

    public void onSuccess(T data) {
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        String message = e.getMessage();
        if (message == null) {
            message = "";
        }
        onFail(-1, message);
    }

    @Override // io.reactivex.Observer
    public void onNext(BaseResult<T> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isSuccess() && result.getData() != null) {
            onSuccess(result.getData());
        } else {
            onFail(result.getCode(), result.getMsg());
        }
    }
}
