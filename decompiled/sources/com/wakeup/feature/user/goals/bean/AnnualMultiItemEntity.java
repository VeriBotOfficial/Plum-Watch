package com.wakeup.feature.user.goals.bean;

import com.autonavi.aps.amapapi.config.Const;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.goal.GoalBean;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnualMultiItemEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/user/goals/bean/AnnualMultiItemEntity;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "dataType", "", "type", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/network/entity/goal/GoalBean;", "<init>", "(IILcom/wakeup/common/network/entity/goal/GoalBean;)V", "getDataType", "()I", "setDataType", "(I)V", "getType", "setType", "getEntity", "()Lcom/wakeup/common/network/entity/goal/GoalBean;", "setEntity", "(Lcom/wakeup/common/network/entity/goal/GoalBean;)V", "itemType", "getItemType", "Companion", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnualMultiItemEntity implements Serializable, MultiItemEntity {
    public static final int DATA_TYPE_FITNESS = 3;
    public static final int DATA_TYPE_RIDE = 4;
    public static final int DATA_TYPE_RUN = 1;
    public static final int DATA_TYPE_WALK = 2;
    public static final int DATA_TYPE_WEIGHT = 5;
    public static final int HasAnnualData = 1;
    public static final int NoAnnualData = 2;
    public static final int NoAnnualSingleData = 3;
    private int dataType;
    private GoalBean entity;
    private int type;

    public AnnualMultiItemEntity(int i, int i2, GoalBean entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        this.dataType = i;
        this.type = i2;
        this.entity = entity;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public /* synthetic */ AnnualMultiItemEntity(int i, int i2, GoalBean goalBean, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new GoalBean() : goalBean);
    }

    public final GoalBean getEntity() {
        return this.entity;
    }

    public final void setEntity(GoalBean goalBean) {
        Intrinsics.checkNotNullParameter(goalBean, "<set-?>");
        this.entity = goalBean;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }
}
