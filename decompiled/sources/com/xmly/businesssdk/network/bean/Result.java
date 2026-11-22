package com.xmly.businesssdk.network.bean;

import com.anythink.core.express.b.a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \r*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\r\u000eB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Result;", "T", "", "status", "Lcom/xmly/businesssdk/network/bean/Result$Status;", "data", "message", "", "(Lcom/xmly/businesssdk/network/bean/Result$Status;Ljava/lang/Object;Ljava/lang/String;)V", "throwable", "", "(Lcom/xmly/businesssdk/network/bean/Result$Status;Ljava/lang/Throwable;)V", "Ljava/lang/Object;", "Companion", "Status", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Result<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public T data;
    public String message;
    public final Status status;
    public Throwable throwable;

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0004\b\u0001\u0010\u0005H\u0007J/\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001e\u0010\f\u001a\u00020\r\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004H\u0007J\u001e\u0010\u000f\u001a\u00020\r\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004H\u0007J\u001e\u0010\u0010\u001a\u00020\r\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004H\u0007J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0004\b\u0001\u0010\u0005H\u0007J\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0004\"\u0004\b\u0001\u0010\u0005H\u0007J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0013J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Result$Companion;", "", "()V", "error", "Lcom/xmly/businesssdk/network/bean/Result;", "T", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/xmly/businesssdk/network/bean/Result;", "throwable", "", "isError", "", "result", "isLoading", "isSuccess", a.e, "success", "(Ljava/lang/Object;)Lcom/xmly/businesssdk/network/bean/Result;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <T> Result<T> error() {
            return new Result<>(Status.ERROR, null, "");
        }

        @JvmStatic
        public final <T> boolean isError(Result<T> result) {
            return result == null || result.status == Status.ERROR;
        }

        @JvmStatic
        public final <T> boolean isLoading(Result<T> result) {
            return result != null && result.status == Status.LOADING;
        }

        @JvmStatic
        public final <T> boolean isSuccess(Result<T> result) {
            return result != null && result.status == Status.SUCCESS;
        }

        @JvmStatic
        public final <T> Result<T> loading() {
            return new Result<>(Status.LOADING, null, null);
        }

        @JvmStatic
        public final <T> Result<T> success() {
            return new Result<>(Status.SUCCESS, null, null);
        }

        @JvmStatic
        public final <T> Result<T> error(String message) {
            return new Result<>(Status.ERROR, null, message);
        }

        @JvmStatic
        public final <T> Result<T> success(T data) {
            return new Result<>(Status.SUCCESS, data, null);
        }

        @JvmStatic
        public final <T> Result<T> error(T data, String message) {
            return new Result<>(Status.ERROR, data, message);
        }

        @JvmStatic
        public final <T> Result<T> success(T data, String message) {
            return new Result<>(Status.SUCCESS, data, message);
        }

        @JvmStatic
        public final <T> Result<T> error(Throwable throwable) {
            return new Result<>(Status.ERROR, throwable);
        }
    }

    /* compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Result$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    public Result(Status status, T t, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = t;
        this.message = str;
    }

    @JvmStatic
    public static final <T> Result<T> error() {
        return INSTANCE.error();
    }

    @JvmStatic
    public static final <T> Result<T> error(T t, String str) {
        return INSTANCE.error(t, str);
    }

    @JvmStatic
    public static final <T> Result<T> error(String str) {
        return INSTANCE.error(str);
    }

    @JvmStatic
    public static final <T> Result<T> error(Throwable th) {
        return INSTANCE.error(th);
    }

    @JvmStatic
    public static final <T> boolean isError(Result<T> result) {
        return INSTANCE.isError(result);
    }

    @JvmStatic
    public static final <T> boolean isLoading(Result<T> result) {
        return INSTANCE.isLoading(result);
    }

    @JvmStatic
    public static final <T> boolean isSuccess(Result<T> result) {
        return INSTANCE.isSuccess(result);
    }

    @JvmStatic
    public static final <T> Result<T> loading() {
        return INSTANCE.loading();
    }

    @JvmStatic
    public static final <T> Result<T> success() {
        return INSTANCE.success();
    }

    @JvmStatic
    public static final <T> Result<T> success(T t) {
        return INSTANCE.success(t);
    }

    @JvmStatic
    public static final <T> Result<T> success(T t, String str) {
        return INSTANCE.success(t, str);
    }

    public Result(Status status, Throwable th) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.throwable = th;
    }
}
