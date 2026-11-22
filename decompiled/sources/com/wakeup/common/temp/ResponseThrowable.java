package com.wakeup.common.temp;

import com.wakeup.common.network.IBaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseThrowable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\rB!\b\u0016\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/temp/ResponseThrowable;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lcom/wakeup/common/temp/ERROR;", "e", "", "<init>", "(Lcom/wakeup/common/temp/ERROR;Ljava/lang/Throwable;)V", "code", "", "msg", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "base", "Lcom/wakeup/common/network/IBaseResponse;", "(Lcom/wakeup/common/network/IBaseResponse;Ljava/lang/Throwable;)V", "getCode", "()I", "setCode", "(I)V", "errMsg", "getErrMsg", "()Ljava/lang/String;", "setErrMsg", "(Ljava/lang/String;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ResponseThrowable extends Exception {
    private int code;
    private String errMsg;

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final void setErrMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errMsg = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseThrowable(ERROR error, Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(error, "error");
        this.code = error.getCode();
        this.errMsg = error.getErr() + "  " + (th == null ? "" : th.getMessage());
    }

    public /* synthetic */ ResponseThrowable(ERROR error, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(error, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseThrowable(int i, String msg, Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = i;
        this.errMsg = msg + " " + (th == null ? "" : th.getMessage());
    }

    public /* synthetic */ ResponseThrowable(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseThrowable(IBaseResponse<?> base, Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(base, "base");
        this.code = base.getCode();
        this.errMsg = base.msg() + "  " + (th == null ? "" : th.getMessage());
    }

    public /* synthetic */ ResponseThrowable(IBaseResponse iBaseResponse, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((IBaseResponse<?>) iBaseResponse, (i & 2) != 0 ? null : th);
    }
}
