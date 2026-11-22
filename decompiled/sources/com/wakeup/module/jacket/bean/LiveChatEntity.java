package com.wakeup.module.jacket.bean;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveChatEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017¨\u0006."}, d2 = {"Lcom/wakeup/module/jacket/bean/LiveChatEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "position", "", "sourceStr", "", "isLeft", "", "sourceLanId", "transLanId", "<init>", "(JILjava/lang/String;ZII)V", "getId", "()J", "getPosition", "()I", "setPosition", "(I)V", "getSourceStr", "()Ljava/lang/String;", "setSourceStr", "(Ljava/lang/String;)V", "()Z", "getSourceLanId", "setSourceLanId", "getTransLanId", "setTransLanId", "itemType", "getItemType", "transStr", "getTransStr", "setTransStr", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LiveChatEntity implements MultiItemEntity {
    private final long id;
    private final boolean isLeft;
    private final int itemType;
    private int position;
    private int sourceLanId;
    private String sourceStr;
    private int transLanId;
    private String transStr;

    public static /* synthetic */ LiveChatEntity copy$default(LiveChatEntity liveChatEntity, long j, int i, String str, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = liveChatEntity.id;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = liveChatEntity.position;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            str = liveChatEntity.sourceStr;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            z = liveChatEntity.isLeft;
        }
        boolean z2 = z;
        if ((i4 & 16) != 0) {
            i2 = liveChatEntity.sourceLanId;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = liveChatEntity.transLanId;
        }
        return liveChatEntity.copy(j2, i5, str2, z2, i6, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceStr() {
        return this.sourceStr;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLeft() {
        return this.isLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSourceLanId() {
        return this.sourceLanId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTransLanId() {
        return this.transLanId;
    }

    public final LiveChatEntity copy(long id2, int position, String sourceStr, boolean isLeft, int sourceLanId, int transLanId) {
        Intrinsics.checkNotNullParameter(sourceStr, "sourceStr");
        return new LiveChatEntity(id2, position, sourceStr, isLeft, sourceLanId, transLanId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveChatEntity)) {
            return false;
        }
        LiveChatEntity liveChatEntity = (LiveChatEntity) other;
        return this.id == liveChatEntity.id && this.position == liveChatEntity.position && Intrinsics.areEqual(this.sourceStr, liveChatEntity.sourceStr) && this.isLeft == liveChatEntity.isLeft && this.sourceLanId == liveChatEntity.sourceLanId && this.transLanId == liveChatEntity.transLanId;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.position)) * 31) + this.sourceStr.hashCode()) * 31) + Boolean.hashCode(this.isLeft)) * 31) + Integer.hashCode(this.sourceLanId)) * 31) + Integer.hashCode(this.transLanId);
    }

    public String toString() {
        return "LiveChatEntity(id=" + this.id + ", position=" + this.position + ", sourceStr=" + this.sourceStr + ", isLeft=" + this.isLeft + ", sourceLanId=" + this.sourceLanId + ", transLanId=" + this.transLanId + Separators.RPAREN;
    }

    public LiveChatEntity(long j, int i, String sourceStr, boolean z, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sourceStr, "sourceStr");
        this.id = j;
        this.position = i;
        this.sourceStr = sourceStr;
        this.isLeft = z;
        this.sourceLanId = i2;
        this.transLanId = i3;
        this.itemType = !z ? 1 : 0;
        this.transStr = "";
    }

    public final long getId() {
        return this.id;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final String getSourceStr() {
        return this.sourceStr;
    }

    public final void setSourceStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourceStr = str;
    }

    public final boolean isLeft() {
        return this.isLeft;
    }

    public final int getSourceLanId() {
        return this.sourceLanId;
    }

    public final void setSourceLanId(int i) {
        this.sourceLanId = i;
    }

    public final int getTransLanId() {
        return this.transLanId;
    }

    public final void setTransLanId(int i) {
        this.transLanId = i;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public final String getTransStr() {
        return this.transStr;
    }

    public final void setTransStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transStr = str;
    }
}
