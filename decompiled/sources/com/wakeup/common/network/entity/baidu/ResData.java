package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/ResData;", "", SignalClient.SD_TYPE_ANSWER, "", "part", "index", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAnswer", "()Ljava/lang/String;", "getPart", "getIndex", "()I", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResData {
    private final String answer;
    private final int index;
    private final String part;

    public static /* synthetic */ ResData copy$default(ResData resData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = resData.answer;
        }
        if ((i2 & 2) != 0) {
            str2 = resData.part;
        }
        if ((i2 & 4) != 0) {
            i = resData.index;
        }
        return resData.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPart() {
        return this.part;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final ResData copy(String answer, String part, int index) {
        return new ResData(answer, part, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResData)) {
            return false;
        }
        ResData resData = (ResData) other;
        return Intrinsics.areEqual(this.answer, resData.answer) && Intrinsics.areEqual(this.part, resData.part) && this.index == resData.index;
    }

    public int hashCode() {
        String str = this.answer;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.part;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    public ResData(String str, String str2, int i) {
        this.answer = str;
        this.part = str2;
        this.index = i;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getPart() {
        return this.part;
    }

    public final int getIndex() {
        return this.index;
    }

    public String toString() {
        return "Data(part='" + this.part + "', index=" + this.index + Separators.RPAREN;
    }
}
