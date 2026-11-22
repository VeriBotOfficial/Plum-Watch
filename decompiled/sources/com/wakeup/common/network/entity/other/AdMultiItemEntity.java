package com.wakeup.common.network.entity.other;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.opts.BannerAdModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdMultiItemEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/other/AdMultiItemEntity;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "data", "Lcom/wakeup/common/network/entity/opts/BannerAdModel;", "<init>", "(ILcom/wakeup/common/network/entity/opts/BannerAdModel;)V", "getType", "()I", "setType", "(I)V", "getData", "()Lcom/wakeup/common/network/entity/opts/BannerAdModel;", "setData", "(Lcom/wakeup/common/network/entity/opts/BannerAdModel;)V", "itemType", "getItemType", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdMultiItemEntity implements Serializable, MultiItemEntity {
    public static final int HEALTH_NORMAL_LAYOUT = 1;
    public static final int HORIZONTAL_NORMAL_LAYOUT = 3;
    public static final int VERTICAL_NORMAL_LAYOUT = 2;
    private BannerAdModel data;
    private int type;

    public AdMultiItemEntity(int i, BannerAdModel data) {
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

    public final BannerAdModel getData() {
        return this.data;
    }

    public final void setData(BannerAdModel bannerAdModel) {
        Intrinsics.checkNotNullParameter(bannerAdModel, "<set-?>");
        this.data = bannerAdModel;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }
}
