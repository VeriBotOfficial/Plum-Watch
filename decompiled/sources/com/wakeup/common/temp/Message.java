package com.wakeup.common.temp;

import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B=\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/temp/Message;", "", "code", "", "msg", "", "arg1", "arg2", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "<init>", "(ILjava/lang/String;IILjava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getArg1", "setArg1", "getArg2", "setArg2", "getObj", "()Ljava/lang/Object;", "setObj", "(Ljava/lang/Object;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Message {
    private int arg1;
    private int arg2;
    private int code;
    private String msg;
    private Object obj;

    public Message() {
        this(0, null, 0, 0, null, 31, null);
    }

    public Message(int i) {
        this(i, null, 0, 0, null, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Message(int i, String msg) {
        this(i, msg, 0, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Message(int i, String msg, int i2) {
        this(i, msg, i2, 0, null, 24, null);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Message(int i, String msg, int i2, int i3) {
        this(i, msg, i2, i3, null, 16, null);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public Message(int i, String msg, int i2, int i3, Object obj) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = i;
        this.msg = msg;
        this.arg1 = i2;
        this.arg2 = i3;
        this.obj = obj;
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public /* synthetic */ Message(int i, String str, int i2, int i3, Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? null : obj);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public final int getArg1() {
        return this.arg1;
    }

    public final void setArg1(int i) {
        this.arg1 = i;
    }

    public final int getArg2() {
        return this.arg2;
    }

    public final void setArg2(int i) {
        this.arg2 = i;
    }

    public final Object getObj() {
        return this.obj;
    }

    public final void setObj(Object obj) {
        this.obj = obj;
    }
}
