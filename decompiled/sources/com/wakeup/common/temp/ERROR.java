package com.wakeup.common.temp;

import androidx.core.app.NotificationCompat;
import com.amap.api.services.core.AMapException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ERROR.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/temp/ERROR;", "", "code", "", NotificationCompat.CATEGORY_ERROR, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "UNKNOWN", "PARSE_ERROR", "NETWORD_ERROR", "HTTP_ERROR", "SSL_ERROR", "TIMEOUT_ERROR", "getValue", "getKey", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ERROR {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ERROR[] $VALUES;
    private final int code;
    private final String err;
    public static final ERROR UNKNOWN = new ERROR("UNKNOWN", 0, 1000, AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
    public static final ERROR PARSE_ERROR = new ERROR("PARSE_ERROR", 1, 1001, "解析错误");
    public static final ERROR NETWORD_ERROR = new ERROR("NETWORD_ERROR", 2, 1002, "网络错误");
    public static final ERROR HTTP_ERROR = new ERROR("HTTP_ERROR", 3, 1003, "协议出错");
    public static final ERROR SSL_ERROR = new ERROR("SSL_ERROR", 4, 1004, "证书出错");
    public static final ERROR TIMEOUT_ERROR = new ERROR("TIMEOUT_ERROR", 5, 1006, "连接超时");

    private static final /* synthetic */ ERROR[] $values() {
        return new ERROR[]{UNKNOWN, PARSE_ERROR, NETWORD_ERROR, HTTP_ERROR, SSL_ERROR, TIMEOUT_ERROR};
    }

    public static EnumEntries<ERROR> getEntries() {
        return $ENTRIES;
    }

    private ERROR(String str, int i, int i2, String str2) {
        this.code = i2;
        this.err = str2;
    }

    static {
        ERROR[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    /* renamed from: getValue, reason: from getter */
    public final String getErr() {
        return this.err;
    }

    /* renamed from: getKey, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public static ERROR valueOf(String str) {
        return (ERROR) Enum.valueOf(ERROR.class, str);
    }

    public static ERROR[] values() {
        return (ERROR[]) $VALUES.clone();
    }
}
