package com.wakeup.commponent.module.buryPoint;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppStabilityEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00107\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001e¨\u00068"}, d2 = {"Lcom/wakeup/commponent/module/buryPoint/AppStabilityEntity;", "", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "reqTime", "", "getReqTime", "()J", "setReqTime", "(J)V", "sn", "getSn", "setSn", "code", "getCode", "setCode", "productId", "", "getProductId", "()I", "setProductId", "(I)V", "connectCode", "getConnectCode", "setConnectCode", "connectTime", "getConnectTime", "setConnectTime", "connectDuration", "getConnectDuration", "setConnectDuration", "firstPackTime", "getFirstPackTime", "setFirstPackTime", "firstPackDuration", "getFirstPackDuration", "setFirstPackDuration", "endTime", "getEndTime", "setEndTime", "totalDuration", "getTotalDuration", "setTotalDuration", "disConnCode", "getDisConnCode", "setDisConnCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppStabilityEntity {
    private long connectDuration;
    private long connectTime;
    private long endTime;
    private long firstPackDuration;
    private long firstPackTime;
    private int productId;
    private long reqTime;
    private long totalDuration;
    private String type = "";
    private String url = "";
    private String sn = "";
    private String code = "";
    private int connectCode = 2;
    private int disConnCode = AppStabilityDisConnCode.NORMAL_DISCONNECT.getCode();

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final long getReqTime() {
        return this.reqTime;
    }

    public final void setReqTime(long j) {
        this.reqTime = j;
    }

    public final String getSn() {
        return this.sn;
    }

    public final void setSn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final void setProductId(int i) {
        this.productId = i;
    }

    public final int getConnectCode() {
        return this.connectCode;
    }

    public final void setConnectCode(int i) {
        this.connectCode = i;
    }

    public final long getConnectTime() {
        return this.connectTime;
    }

    public final void setConnectTime(long j) {
        this.connectTime = j;
    }

    public final long getConnectDuration() {
        return this.connectDuration;
    }

    public final void setConnectDuration(long j) {
        this.connectDuration = j;
    }

    public final long getFirstPackTime() {
        return this.firstPackTime;
    }

    public final void setFirstPackTime(long j) {
        this.firstPackTime = j;
    }

    public final long getFirstPackDuration() {
        return this.firstPackDuration;
    }

    public final void setFirstPackDuration(long j) {
        this.firstPackDuration = j;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public final int getDisConnCode() {
        return this.disConnCode;
    }

    public final void setDisConnCode(int i) {
        this.disConnCode = i;
    }

    public String toString() {
        return "AppStabilityEntity(type='" + this.type + "', url='" + this.url + "', reqTime=" + this.reqTime + ", sn='" + this.sn + "', code='" + this.code + "', productId=" + this.productId + ", connectCode=" + this.connectCode + ", connectTime=" + this.connectTime + ", connectDuration=" + this.connectDuration + ", firstPackTime=" + this.firstPackTime + ", firstPackDuration=" + this.firstPackDuration + ", endTime=" + this.endTime + ", totalDuration=" + this.totalDuration + ", disConnCode=" + this.disConnCode + Separators.RPAREN;
    }
}
