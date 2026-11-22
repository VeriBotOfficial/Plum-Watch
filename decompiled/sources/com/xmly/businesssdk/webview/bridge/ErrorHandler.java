package com.xmly.businesssdk.webview.bridge;

import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.umeng.analytics.pro.ak;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorHandler.kt */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J*\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/ErrorHandler;", "", "Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$ErrorListener;", "listener", "", "addListener", "removeListener", "Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$SDKError;", "error", "handleError", "", "code", "", "message", ak.e, "", "throwable", "originalCode", "extra", "mapPlayerErrorCode", "", "listeners", "Ljava/util/List;", "<init>", "()V", "ErrorListener", "Modules", "PlayerErrorCodes", "SDKError", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ErrorHandler {
    public static final ErrorHandler INSTANCE = new ErrorHandler();
    private static final List<ErrorListener> listeners = new ArrayList();

    /* compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$ErrorListener;", "", "onError", "", "error", "Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$SDKError;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ErrorListener {
        void onError(SDKError error);
    }

    /* compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$Modules;", "", "()V", "AUDIO", "", "CORE", "LOGIN", "PAYMENT", "SEARCH", "UC", "UTIL", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Modules {
        public static final String AUDIO = "AudioModule";
        public static final String CORE = "CoreModule";
        public static final Modules INSTANCE = new Modules();
        public static final String LOGIN = "LoginModule";
        public static final String PAYMENT = "PaymentModule";
        public static final String SEARCH = "SearchModule";
        public static final String UC = "UcModule";
        public static final String UTIL = "UtilModule";

        private Modules() {
        }
    }

    /* compiled from: ErrorHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$PlayerErrorCodes;", "", "<init>", "()V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1})
    public static final class PlayerErrorCodes {
        public static final PlayerErrorCodes INSTANCE = new PlayerErrorCodes();

        private PlayerErrorCodes() {
        }
    }

    private ErrorHandler() {
    }

    public static /* synthetic */ void handleError$default(ErrorHandler errorHandler, int i, String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        errorHandler.handleError(i, str, str2, th);
    }

    public final void addListener(ErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    public final void handleError(SDKError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.e("ErrorHandler", "SDK Error: [" + error.getCode() + "][" + error.getModule() + "] " + error.getMessage());
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((ErrorListener) it.next()).onError(error);
        }
    }

    public final int mapPlayerErrorCode(int originalCode, int extra) {
        if (extra == 8888) {
            return 2021;
        }
        if (extra == 9999) {
            return 2027;
        }
        if (originalCode == 1) {
            return 2016;
        }
        if (originalCode == -202002) {
            return extra == 2026 ? 2026 : 2018;
        }
        if (originalCode == 1193046) {
            return 2012;
        }
        if (originalCode == -1) {
            return GLMapStaticValue.AM_PARAMETERNAME_SHOW_BUILDING_MARK;
        }
        return 2000;
    }

    public final void removeListener(ErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    /* compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xmly/businesssdk/webview/bridge/ErrorHandler$SDKError;", "", "code", "", "message", "", ak.e, "throwable", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getModule", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SDKError {
        private final int code;
        private final String message;
        private final String module;
        private final Throwable throwable;

        public SDKError(int i, String message, String module, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(module, "module");
            this.code = i;
            this.message = message;
            this.module = module;
            this.throwable = th;
        }

        public static /* synthetic */ SDKError copy$default(SDKError sDKError, int i, String str, String str2, Throwable th, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = sDKError.code;
            }
            if ((i2 & 2) != 0) {
                str = sDKError.message;
            }
            if ((i2 & 4) != 0) {
                str2 = sDKError.module;
            }
            if ((i2 & 8) != 0) {
                th = sDKError.throwable;
            }
            return sDKError.copy(i, str, str2, th);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getModule() {
            return this.module;
        }

        /* renamed from: component4, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final SDKError copy(int code, String message, String module, Throwable throwable) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(module, "module");
            return new SDKError(code, message, module, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SDKError)) {
                return false;
            }
            SDKError sDKError = (SDKError) other;
            return this.code == sDKError.code && Intrinsics.areEqual(this.message, sDKError.message) && Intrinsics.areEqual(this.module, sDKError.module) && Intrinsics.areEqual(this.throwable, sDKError.throwable);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getModule() {
            return this.module;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int a2 = com.xmly.businesssdk.config.a.a(this.module, com.xmly.businesssdk.config.a.a(this.message, Integer.hashCode(this.code) * 31, 31), 31);
            Throwable th = this.throwable;
            return a2 + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            return c.a("SDKError(code=").append(this.code).append(", message=").append(this.message).append(", module=").append(this.module).append(", throwable=").append(this.throwable).append(')').toString();
        }

        public /* synthetic */ SDKError(int i, String str, String str2, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, (i2 & 8) != 0 ? null : th);
        }
    }

    public final void handleError(int code, String message, String module, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(module, "module");
        handleError(new SDKError(code, message, module, throwable));
    }
}
