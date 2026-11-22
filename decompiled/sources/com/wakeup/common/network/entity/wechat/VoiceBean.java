package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/VoiceBean;", "", "fileUrl", "", "<init>", "(Ljava/lang/String;)V", "getFileUrl", "()Ljava/lang/String;", "setFileUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VoiceBean {
    private String fileUrl;

    public static /* synthetic */ VoiceBean copy$default(VoiceBean voiceBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceBean.fileUrl;
        }
        return voiceBean.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final VoiceBean copy(String fileUrl) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        return new VoiceBean(fileUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VoiceBean) && Intrinsics.areEqual(this.fileUrl, ((VoiceBean) other).fileUrl);
    }

    public int hashCode() {
        return this.fileUrl.hashCode();
    }

    public String toString() {
        return "VoiceBean(fileUrl=" + this.fileUrl + Separators.RPAREN;
    }

    public VoiceBean(String fileUrl) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        this.fileUrl = fileUrl;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final void setFileUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileUrl = str;
    }
}
