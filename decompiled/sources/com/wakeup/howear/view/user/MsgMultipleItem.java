package com.wakeup.howear.view.user;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.opts.MessageEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MsgMultipleItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/howear/view/user/MsgMultipleItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "itemType", "", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/network/entity/opts/MessageEntity;", "<init>", "(ILcom/wakeup/common/network/entity/opts/MessageEntity;)V", "getItemType", "()I", "getEntity", "()Lcom/wakeup/common/network/entity/opts/MessageEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MsgMultipleItem implements MultiItemEntity {
    public static final int NORMAL_IMG_VIEW = 2;
    public static final int NORMAL_TEXT_VIEW = 1;
    private final MessageEntity entity;
    private final int itemType;

    public static /* synthetic */ MsgMultipleItem copy$default(MsgMultipleItem msgMultipleItem, int i, MessageEntity messageEntity, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = msgMultipleItem.itemType;
        }
        if ((i2 & 2) != 0) {
            messageEntity = msgMultipleItem.entity;
        }
        return msgMultipleItem.copy(i, messageEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* renamed from: component2, reason: from getter */
    public final MessageEntity getEntity() {
        return this.entity;
    }

    public final MsgMultipleItem copy(int itemType, MessageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new MsgMultipleItem(itemType, entity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MsgMultipleItem)) {
            return false;
        }
        MsgMultipleItem msgMultipleItem = (MsgMultipleItem) other;
        return this.itemType == msgMultipleItem.itemType && Intrinsics.areEqual(this.entity, msgMultipleItem.entity);
    }

    public int hashCode() {
        return (Integer.hashCode(this.itemType) * 31) + this.entity.hashCode();
    }

    public String toString() {
        return "MsgMultipleItem(itemType=" + this.itemType + ", entity=" + this.entity + Separators.RPAREN;
    }

    public MsgMultipleItem(int i, MessageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.itemType = i;
        this.entity = entity;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType */
    public int getType() {
        return this.itemType;
    }

    public final MessageEntity getEntity() {
        return this.entity;
    }
}
