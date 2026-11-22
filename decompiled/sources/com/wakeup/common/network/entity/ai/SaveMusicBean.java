package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/ai/SaveMusicBean;", "", "businessId", "", "musicResult", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBusinessId", "()Ljava/lang/String;", "getMusicResult", "getRemark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SaveMusicBean {
    private final String businessId;
    private final String musicResult;
    private final String remark;

    public static /* synthetic */ SaveMusicBean copy$default(SaveMusicBean saveMusicBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveMusicBean.businessId;
        }
        if ((i & 2) != 0) {
            str2 = saveMusicBean.musicResult;
        }
        if ((i & 4) != 0) {
            str3 = saveMusicBean.remark;
        }
        return saveMusicBean.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBusinessId() {
        return this.businessId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMusicResult() {
        return this.musicResult;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final SaveMusicBean copy(String businessId, String musicResult, String remark) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        Intrinsics.checkNotNullParameter(musicResult, "musicResult");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new SaveMusicBean(businessId, musicResult, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveMusicBean)) {
            return false;
        }
        SaveMusicBean saveMusicBean = (SaveMusicBean) other;
        return Intrinsics.areEqual(this.businessId, saveMusicBean.businessId) && Intrinsics.areEqual(this.musicResult, saveMusicBean.musicResult) && Intrinsics.areEqual(this.remark, saveMusicBean.remark);
    }

    public int hashCode() {
        return (((this.businessId.hashCode() * 31) + this.musicResult.hashCode()) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "SaveMusicBean(businessId=" + this.businessId + ", musicResult=" + this.musicResult + ", remark=" + this.remark + Separators.RPAREN;
    }

    public SaveMusicBean(String businessId, String musicResult, String remark) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        Intrinsics.checkNotNullParameter(musicResult, "musicResult");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.businessId = businessId;
        this.musicResult = musicResult;
        this.remark = remark;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getMusicResult() {
        return this.musicResult;
    }

    public /* synthetic */ SaveMusicBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getRemark() {
        return this.remark;
    }
}
