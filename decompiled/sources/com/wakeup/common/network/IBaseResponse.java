package com.wakeup.common.network;

import kotlin.Metadata;

/* compiled from: IBaseResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/network/IBaseResponse;", "T", "", "code", "", "msg", "", "data", "()Ljava/lang/Object;", "isSuccess", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface IBaseResponse<T> {
    int code();

    T data();

    boolean isSuccess();

    String msg();
}
