package com.wakeup.module.ai.port;

import com.autonavi.aps.amapapi.config.Const;
import com.facebook.react.uimanager.ViewProps;
import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiabetesMoeAgiLog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ&\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018J*\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0018J>\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/wakeup/module/ai/port/DiabetesMoeAgiLog;", "", "<init>", "()V", "TAG", "", "d", "", "message", "e", "throwable", "", "logAbConfig", "userId", "configKey", "rawValue", ViewProps.ENABLED, "", "logChatRequestStart", "url", "logChatOpen", "httpCode", "", "elapsedMs", "", "logChatFirstChunk", "logChatFinish", "success", "totalMs", "reason", "logUploadStart", "fileName", "fileSize", "logUploadFinish", "ttfbMs", "fileId", "error", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DiabetesMoeAgiLog {
    public static final DiabetesMoeAgiLog INSTANCE = new DiabetesMoeAgiLog();
    public static final String TAG = "DiabetesMoeAgi";

    public final void d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final void e(String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    private DiabetesMoeAgiLog() {
    }

    public static /* synthetic */ void e$default(DiabetesMoeAgiLog diabetesMoeAgiLog, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        diabetesMoeAgiLog.e(str, th);
    }

    public final void logAbConfig(String userId, String configKey, String rawValue, boolean enabled) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        d("[AB] userId=" + userId + " configKey=" + configKey + " rawValue=" + rawValue + " hit=" + enabled);
    }

    public final void logChatRequestStart(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        d("[Chat] request start url=" + url + " userId=" + UserDao.getUid());
    }

    public final void logChatOpen(int httpCode, long elapsedMs) {
        d("[Chat] onOpen httpCode=" + httpCode + " elapsed=" + elapsedMs + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
    }

    public final void logChatFirstChunk(long elapsedMs) {
        d("[Chat] firstChunk elapsed=" + elapsedMs + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
    }

    public static /* synthetic */ void logChatFinish$default(DiabetesMoeAgiLog diabetesMoeAgiLog, boolean z, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        diabetesMoeAgiLog.logChatFinish(z, i, j, str);
    }

    public final void logChatFinish(boolean success, int httpCode, long totalMs, String reason) {
        String str = reason;
        d("[Chat] finish success=" + success + " httpCode=" + httpCode + " total=" + totalMs + Const.SP_KEY_GSM_UPLOAD_MXSIZE + ((str == null || str.length() == 0) ? "" : " reason=" + reason));
    }

    public final void logUploadStart(String fileName, long fileSize) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        d("[Upload] request start file=" + fileName + " size=" + fileSize + " userId=" + UserDao.getUid());
    }

    public static /* synthetic */ void logUploadFinish$default(DiabetesMoeAgiLog diabetesMoeAgiLog, boolean z, int i, long j, long j2, String str, String str2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        diabetesMoeAgiLog.logUploadFinish(z, i, j, j2, str, str2);
    }

    public final void logUploadFinish(boolean success, int httpCode, long ttfbMs, long totalMs, String fileId, String error) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Upload] finish success=" + success + " httpCode=" + httpCode);
        sb.append(" ttfb=" + ttfbMs + "ms total=" + totalMs + Const.SP_KEY_GSM_UPLOAD_MXSIZE);
        String str = fileId;
        if (str != null && str.length() != 0) {
            sb.append(" fileId=" + fileId);
        }
        String str2 = error;
        if (str2 != null && str2.length() != 0) {
            sb.append(" error=" + error);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        d(sb2);
    }
}
