package com.wakeup.feature.sport.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportMultiItemEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/sport/bean/SportMultiItemEntity;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "data", "Lcom/wakeup/feature/sport/bean/SportListBean;", "<init>", "(ILcom/wakeup/feature/sport/bean/SportListBean;)V", "getType", "()I", "setType", "(I)V", "getData", "()Lcom/wakeup/feature/sport/bean/SportListBean;", "setData", "(Lcom/wakeup/feature/sport/bean/SportListBean;)V", "itemType", "getItemType", "Companion", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportMultiItemEntity implements Serializable, MultiItemEntity {
    public static final int NORMAL_LAYOUT = 0;
    public static final int TITLE_LAYOUT = -1;
    private SportListBean data;
    private int type;

    public SportMultiItemEntity(int i, SportListBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = i;
        this.data = data;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final SportListBean getData() {
        return this.data;
    }

    public final void setData(SportListBean sportListBean) {
        Intrinsics.checkNotNullParameter(sportListBean, "<set-?>");
        this.data = sportListBean;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }
}
