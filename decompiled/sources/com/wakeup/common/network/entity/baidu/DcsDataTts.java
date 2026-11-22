package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsDataTts;", "", "logid", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLogid", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsDataTts {
    private final String logid;
    private final String text;

    public static /* synthetic */ DcsDataTts copy$default(DcsDataTts dcsDataTts, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsDataTts.logid;
        }
        if ((i & 2) != 0) {
            str2 = dcsDataTts.text;
        }
        return dcsDataTts.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogid() {
        return this.logid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final DcsDataTts copy(String logid, String text) {
        Intrinsics.checkNotNullParameter(logid, "logid");
        return new DcsDataTts(logid, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsDataTts)) {
            return false;
        }
        DcsDataTts dcsDataTts = (DcsDataTts) other;
        return Intrinsics.areEqual(this.logid, dcsDataTts.logid) && Intrinsics.areEqual(this.text, dcsDataTts.text);
    }

    public int hashCode() {
        int hashCode = this.logid.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DcsDataTts(logid=" + this.logid + ", text=" + this.text + Separators.RPAREN;
    }

    public DcsDataTts(String logid, String str) {
        Intrinsics.checkNotNullParameter(logid, "logid");
        this.logid = logid;
        this.text = str;
    }

    public final String getLogid() {
        return this.logid;
    }

    public final String getText() {
        return this.text;
    }
}
