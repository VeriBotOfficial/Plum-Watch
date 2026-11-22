package com.wakeup.feature.health.bean;

import com.wakeup.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthTotalContentBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/health/bean/HealthTotalContentBean;", "Ljava/io/Serializable;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", Constants.BundleKey.TIMESTAMP, "", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "timeContent", "getTimeContent", "setTimeContent", "valueDesc", "getValueDesc", "setValueDesc", "mac", "getMac", "setMac", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthTotalContentBean implements Serializable {
    public static final int $stable = 8;
    private long timeStamp;
    private String value = "";
    private String timeContent = "";
    private String valueDesc = "";
    private String mac = "";

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final String getTimeContent() {
        return this.timeContent;
    }

    public final void setTimeContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeContent = str;
    }

    public final String getValueDesc() {
        return this.valueDesc;
    }

    public final void setValueDesc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.valueDesc = str;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }
}
