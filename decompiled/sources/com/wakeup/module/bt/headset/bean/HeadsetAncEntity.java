package com.wakeup.module.bt.headset.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: HeadsetAncEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/bt/headset/bean/HeadsetAncEntity;", "", DOMConstants.ATTR_MODE, "", "<init>", "(I)V", "getMode", "()I", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "toString", "", "feature-btheadset_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeadsetAncEntity {
    private final int mode;
    private boolean select;

    public static /* synthetic */ HeadsetAncEntity copy$default(HeadsetAncEntity headsetAncEntity, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = headsetAncEntity.mode;
        }
        return headsetAncEntity.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public final HeadsetAncEntity copy(int mode) {
        return new HeadsetAncEntity(mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeadsetAncEntity) && this.mode == ((HeadsetAncEntity) other).mode;
    }

    public int hashCode() {
        return Integer.hashCode(this.mode);
    }

    public String toString() {
        return "HeadsetAncEntity(mode=" + this.mode + Separators.RPAREN;
    }

    public HeadsetAncEntity(int i) {
        this.mode = i;
    }

    public final int getMode() {
        return this.mode;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
