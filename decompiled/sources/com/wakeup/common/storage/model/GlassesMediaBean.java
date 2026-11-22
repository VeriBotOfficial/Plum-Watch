package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: GlassesMediaBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/storage/model/GlassesMediaBean;", "", "photoNum", "", "videoNum", "audioNum", "<init>", "(III)V", "getPhotoNum", "()I", "getVideoNum", "getAudioNum", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesMediaBean {
    private final int audioNum;
    private final int photoNum;
    private final int videoNum;

    public static /* synthetic */ GlassesMediaBean copy$default(GlassesMediaBean glassesMediaBean, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = glassesMediaBean.photoNum;
        }
        if ((i4 & 2) != 0) {
            i2 = glassesMediaBean.videoNum;
        }
        if ((i4 & 4) != 0) {
            i3 = glassesMediaBean.audioNum;
        }
        return glassesMediaBean.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPhotoNum() {
        return this.photoNum;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVideoNum() {
        return this.videoNum;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAudioNum() {
        return this.audioNum;
    }

    public final GlassesMediaBean copy(int photoNum, int videoNum, int audioNum) {
        return new GlassesMediaBean(photoNum, videoNum, audioNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesMediaBean)) {
            return false;
        }
        GlassesMediaBean glassesMediaBean = (GlassesMediaBean) other;
        return this.photoNum == glassesMediaBean.photoNum && this.videoNum == glassesMediaBean.videoNum && this.audioNum == glassesMediaBean.audioNum;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.photoNum) * 31) + Integer.hashCode(this.videoNum)) * 31) + Integer.hashCode(this.audioNum);
    }

    public String toString() {
        return "GlassesMediaBean(photoNum=" + this.photoNum + ", videoNum=" + this.videoNum + ", audioNum=" + this.audioNum + Separators.RPAREN;
    }

    public GlassesMediaBean(int i, int i2, int i3) {
        this.photoNum = i;
        this.videoNum = i2;
        this.audioNum = i3;
    }

    public final int getPhotoNum() {
        return this.photoNum;
    }

    public final int getVideoNum() {
        return this.videoNum;
    }

    public final int getAudioNum() {
        return this.audioNum;
    }
}
