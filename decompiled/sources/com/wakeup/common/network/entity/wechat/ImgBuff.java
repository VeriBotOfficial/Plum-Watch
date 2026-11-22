package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/ImgBuff;", "", "iLen", "", "<init>", "(I)V", "getILen", "()I", "setILen", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ImgBuff {
    private int iLen;

    public static /* synthetic */ ImgBuff copy$default(ImgBuff imgBuff, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = imgBuff.iLen;
        }
        return imgBuff.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getILen() {
        return this.iLen;
    }

    public final ImgBuff copy(int iLen) {
        return new ImgBuff(iLen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImgBuff) && this.iLen == ((ImgBuff) other).iLen;
    }

    public int hashCode() {
        return Integer.hashCode(this.iLen);
    }

    public String toString() {
        return "ImgBuff(iLen=" + this.iLen + Separators.RPAREN;
    }

    public ImgBuff(int i) {
        this.iLen = i;
    }

    public final int getILen() {
        return this.iLen;
    }

    public final void setILen(int i) {
        this.iLen = i;
    }
}
