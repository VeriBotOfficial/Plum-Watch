package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerGameModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/opts/BannerGameModel;", "", "firstly", "Lcom/wakeup/common/network/entity/opts/BannerGameItemModel;", "secondly", "<init>", "(Lcom/wakeup/common/network/entity/opts/BannerGameItemModel;Lcom/wakeup/common/network/entity/opts/BannerGameItemModel;)V", "getFirstly", "()Lcom/wakeup/common/network/entity/opts/BannerGameItemModel;", "getSecondly", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerGameModel {
    private final BannerGameItemModel firstly;
    private final BannerGameItemModel secondly;

    public static /* synthetic */ BannerGameModel copy$default(BannerGameModel bannerGameModel, BannerGameItemModel bannerGameItemModel, BannerGameItemModel bannerGameItemModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            bannerGameItemModel = bannerGameModel.firstly;
        }
        if ((i & 2) != 0) {
            bannerGameItemModel2 = bannerGameModel.secondly;
        }
        return bannerGameModel.copy(bannerGameItemModel, bannerGameItemModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final BannerGameItemModel getFirstly() {
        return this.firstly;
    }

    /* renamed from: component2, reason: from getter */
    public final BannerGameItemModel getSecondly() {
        return this.secondly;
    }

    public final BannerGameModel copy(BannerGameItemModel firstly, BannerGameItemModel secondly) {
        return new BannerGameModel(firstly, secondly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerGameModel)) {
            return false;
        }
        BannerGameModel bannerGameModel = (BannerGameModel) other;
        return Intrinsics.areEqual(this.firstly, bannerGameModel.firstly) && Intrinsics.areEqual(this.secondly, bannerGameModel.secondly);
    }

    public int hashCode() {
        BannerGameItemModel bannerGameItemModel = this.firstly;
        int hashCode = (bannerGameItemModel == null ? 0 : bannerGameItemModel.hashCode()) * 31;
        BannerGameItemModel bannerGameItemModel2 = this.secondly;
        return hashCode + (bannerGameItemModel2 != null ? bannerGameItemModel2.hashCode() : 0);
    }

    public String toString() {
        return "BannerGameModel(firstly=" + this.firstly + ", secondly=" + this.secondly + Separators.RPAREN;
    }

    public BannerGameModel(BannerGameItemModel bannerGameItemModel, BannerGameItemModel bannerGameItemModel2) {
        this.firstly = bannerGameItemModel;
        this.secondly = bannerGameItemModel2;
    }

    public final BannerGameItemModel getFirstly() {
        return this.firstly;
    }

    public final BannerGameItemModel getSecondly() {
        return this.secondly;
    }
}
