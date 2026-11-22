package com.wakeup.module.bt.headset.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: HeadsetKeyEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/bt/headset/bean/HeadsetKeyEntity;", "", "type", "", "function", "<init>", "(II)V", "getType", "()I", "getFunction", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-btheadset_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeadsetKeyEntity {
    private final int function;
    private boolean select;
    private final int type;

    public static /* synthetic */ HeadsetKeyEntity copy$default(HeadsetKeyEntity headsetKeyEntity, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = headsetKeyEntity.type;
        }
        if ((i3 & 2) != 0) {
            i2 = headsetKeyEntity.function;
        }
        return headsetKeyEntity.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFunction() {
        return this.function;
    }

    public final HeadsetKeyEntity copy(int type, int function) {
        return new HeadsetKeyEntity(type, function);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetKeyEntity)) {
            return false;
        }
        HeadsetKeyEntity headsetKeyEntity = (HeadsetKeyEntity) other;
        return this.type == headsetKeyEntity.type && this.function == headsetKeyEntity.function;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.function);
    }

    public String toString() {
        return "HeadsetKeyEntity(type=" + this.type + ", function=" + this.function + Separators.RPAREN;
    }

    public HeadsetKeyEntity(int i, int i2) {
        this.type = i;
        this.function = i2;
    }

    public final int getFunction() {
        return this.function;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
