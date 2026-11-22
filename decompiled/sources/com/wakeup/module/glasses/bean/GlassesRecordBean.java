package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesAlbumBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesRecordBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "itemType", "", "data", "", "<init>", "(ILjava/lang/Object;)V", "getItemType", "()I", "getData", "()Ljava/lang/Object;", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesRecordBean implements MultiItemEntity {
    public static final int TYPE_CALL = 2;
    public static final int TYPE_CALLING = 1;
    public static final int TYPE_RECORD = 0;
    private final Object data;
    private boolean isSelect;
    private final int itemType;

    public static /* synthetic */ GlassesRecordBean copy$default(GlassesRecordBean glassesRecordBean, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = glassesRecordBean.itemType;
        }
        if ((i2 & 2) != 0) {
            obj = glassesRecordBean.data;
        }
        return glassesRecordBean.copy(i, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final GlassesRecordBean copy(int itemType, Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new GlassesRecordBean(itemType, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesRecordBean)) {
            return false;
        }
        GlassesRecordBean glassesRecordBean = (GlassesRecordBean) other;
        return this.itemType == glassesRecordBean.itemType && Intrinsics.areEqual(this.data, glassesRecordBean.data);
    }

    public int hashCode() {
        return (Integer.hashCode(this.itemType) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "GlassesRecordBean(itemType=" + this.itemType + ", data=" + this.data + Separators.RPAREN;
    }

    public GlassesRecordBean(int i, Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.itemType = i;
        this.data = data;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType */
    public int getType() {
        return this.itemType;
    }

    public final Object getData() {
        return this.data;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
