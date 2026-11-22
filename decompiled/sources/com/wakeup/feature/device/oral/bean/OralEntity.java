package com.wakeup.feature.device.oral.bean;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/device/oral/bean/OralEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "str", "isTrans", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getStr", "setStr", "(Ljava/lang/String;)V", "()Z", "itemType", "", "getItemType", "()I", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OralEntity implements MultiItemEntity {
    private final String id;
    private final boolean isTrans;
    private final int itemType;
    private String str;

    public static /* synthetic */ OralEntity copy$default(OralEntity oralEntity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oralEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = oralEntity.str;
        }
        if ((i & 4) != 0) {
            z = oralEntity.isTrans;
        }
        return oralEntity.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStr() {
        return this.str;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsTrans() {
        return this.isTrans;
    }

    public final OralEntity copy(String id2, String str, boolean isTrans) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(str, "str");
        return new OralEntity(id2, str, isTrans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OralEntity)) {
            return false;
        }
        OralEntity oralEntity = (OralEntity) other;
        return Intrinsics.areEqual(this.id, oralEntity.id) && Intrinsics.areEqual(this.str, oralEntity.str) && this.isTrans == oralEntity.isTrans;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.str.hashCode()) * 31) + Boolean.hashCode(this.isTrans);
    }

    public String toString() {
        return "OralEntity(id=" + this.id + ", str=" + this.str + ", isTrans=" + this.isTrans + Separators.RPAREN;
    }

    public OralEntity(String id2, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(str, "str");
        this.id = id2;
        this.str = str;
        this.isTrans = z;
        this.itemType = !z ? 1 : 0;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStr() {
        return this.str;
    }

    public final void setStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.str = str;
    }

    public final boolean isTrans() {
        return this.isTrans;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }
}
