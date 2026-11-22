package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomePageChannelAndAttentionModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/video/HomePageChannelAndAttentionModel;", "", "categoryChannels", "", "Lcom/wakeup/common/network/entity/video/HomepageChannelList;", "attentionPublisherCount", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getCategoryChannels", "()Ljava/util/List;", "getAttentionPublisherCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/video/HomePageChannelAndAttentionModel;", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomePageChannelAndAttentionModel {
    private final Integer attentionPublisherCount;
    private final List<HomepageChannelList> categoryChannels;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomePageChannelAndAttentionModel copy$default(HomePageChannelAndAttentionModel homePageChannelAndAttentionModel, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homePageChannelAndAttentionModel.categoryChannels;
        }
        if ((i & 2) != 0) {
            num = homePageChannelAndAttentionModel.attentionPublisherCount;
        }
        return homePageChannelAndAttentionModel.copy(list, num);
    }

    public final List<HomepageChannelList> component1() {
        return this.categoryChannels;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAttentionPublisherCount() {
        return this.attentionPublisherCount;
    }

    public final HomePageChannelAndAttentionModel copy(List<HomepageChannelList> categoryChannels, Integer attentionPublisherCount) {
        return new HomePageChannelAndAttentionModel(categoryChannels, attentionPublisherCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageChannelAndAttentionModel)) {
            return false;
        }
        HomePageChannelAndAttentionModel homePageChannelAndAttentionModel = (HomePageChannelAndAttentionModel) other;
        return Intrinsics.areEqual(this.categoryChannels, homePageChannelAndAttentionModel.categoryChannels) && Intrinsics.areEqual(this.attentionPublisherCount, homePageChannelAndAttentionModel.attentionPublisherCount);
    }

    public int hashCode() {
        List<HomepageChannelList> list = this.categoryChannels;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.attentionPublisherCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "HomePageChannelAndAttentionModel(categoryChannels=" + this.categoryChannels + ", attentionPublisherCount=" + this.attentionPublisherCount + Separators.RPAREN;
    }

    public HomePageChannelAndAttentionModel(List<HomepageChannelList> list, Integer num) {
        this.categoryChannels = list;
        this.attentionPublisherCount = num;
    }

    public final List<HomepageChannelList> getCategoryChannels() {
        return this.categoryChannels;
    }

    public final Integer getAttentionPublisherCount() {
        return this.attentionPublisherCount;
    }
}
