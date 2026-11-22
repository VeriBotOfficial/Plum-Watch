package com.wakeup.module.jacket.bean;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaceTransEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J1\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0014HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, d2 = {"Lcom/wakeup/module/jacket/bean/FaceTransEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "beforeStr", "", "isLeft", "", "afterId", "<init>", "(JLjava/lang/String;ZLjava/lang/String;)V", "getId", "()J", "getBeforeStr", "()Ljava/lang/String;", "()Z", "getAfterId", "setAfterId", "(Ljava/lang/String;)V", "itemType", "", "getItemType", "()I", "afterStr", "getAfterStr", "setAfterStr", "isPlaying", "setPlaying", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FaceTransEntity implements MultiItemEntity {
    private String afterId;
    private String afterStr;
    private final String beforeStr;
    private final long id;
    private final boolean isLeft;
    private transient boolean isPlaying;
    private final int itemType;

    public static /* synthetic */ FaceTransEntity copy$default(FaceTransEntity faceTransEntity, long j, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = faceTransEntity.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = faceTransEntity.beforeStr;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = faceTransEntity.isLeft;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = faceTransEntity.afterId;
        }
        return faceTransEntity.copy(j2, str3, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBeforeStr() {
        return this.beforeStr;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLeft() {
        return this.isLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAfterId() {
        return this.afterId;
    }

    public final FaceTransEntity copy(long id2, String beforeStr, boolean isLeft, String afterId) {
        Intrinsics.checkNotNullParameter(beforeStr, "beforeStr");
        Intrinsics.checkNotNullParameter(afterId, "afterId");
        return new FaceTransEntity(id2, beforeStr, isLeft, afterId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceTransEntity)) {
            return false;
        }
        FaceTransEntity faceTransEntity = (FaceTransEntity) other;
        return this.id == faceTransEntity.id && Intrinsics.areEqual(this.beforeStr, faceTransEntity.beforeStr) && this.isLeft == faceTransEntity.isLeft && Intrinsics.areEqual(this.afterId, faceTransEntity.afterId);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.beforeStr.hashCode()) * 31) + Boolean.hashCode(this.isLeft)) * 31) + this.afterId.hashCode();
    }

    public String toString() {
        return "FaceTransEntity(id=" + this.id + ", beforeStr=" + this.beforeStr + ", isLeft=" + this.isLeft + ", afterId=" + this.afterId + Separators.RPAREN;
    }

    public FaceTransEntity(long j, String beforeStr, boolean z, String afterId) {
        Intrinsics.checkNotNullParameter(beforeStr, "beforeStr");
        Intrinsics.checkNotNullParameter(afterId, "afterId");
        this.id = j;
        this.beforeStr = beforeStr;
        this.isLeft = z;
        this.afterId = afterId;
        this.itemType = !z ? 1 : 0;
        this.afterStr = "";
    }

    public final long getId() {
        return this.id;
    }

    public final String getBeforeStr() {
        return this.beforeStr;
    }

    public final boolean isLeft() {
        return this.isLeft;
    }

    public final String getAfterId() {
        return this.afterId;
    }

    public final void setAfterId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterId = str;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final String getAfterStr() {
        return this.afterStr;
    }

    public final void setAfterStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.afterStr = str;
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }
}
