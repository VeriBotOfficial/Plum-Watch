package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendPlanBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/course/RecommendPlanBean;", "", "id", "", "name", "", "description", "recommendImg", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getDescription", "getRecommendImg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecommendPlanBean {
    private final String description;
    private final int id;
    private final String name;
    private final String recommendImg;

    public static /* synthetic */ RecommendPlanBean copy$default(RecommendPlanBean recommendPlanBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recommendPlanBean.id;
        }
        if ((i2 & 2) != 0) {
            str = recommendPlanBean.name;
        }
        if ((i2 & 4) != 0) {
            str2 = recommendPlanBean.description;
        }
        if ((i2 & 8) != 0) {
            str3 = recommendPlanBean.recommendImg;
        }
        return recommendPlanBean.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRecommendImg() {
        return this.recommendImg;
    }

    public final RecommendPlanBean copy(int id2, String name, String description, String recommendImg) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(recommendImg, "recommendImg");
        return new RecommendPlanBean(id2, name, description, recommendImg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendPlanBean)) {
            return false;
        }
        RecommendPlanBean recommendPlanBean = (RecommendPlanBean) other;
        return this.id == recommendPlanBean.id && Intrinsics.areEqual(this.name, recommendPlanBean.name) && Intrinsics.areEqual(this.description, recommendPlanBean.description) && Intrinsics.areEqual(this.recommendImg, recommendPlanBean.recommendImg);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.recommendImg.hashCode();
    }

    public String toString() {
        return "RecommendPlanBean(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", recommendImg=" + this.recommendImg + Separators.RPAREN;
    }

    public RecommendPlanBean(int i, String name, String description, String recommendImg) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(recommendImg, "recommendImg");
        this.id = i;
        this.name = name;
        this.description = description;
        this.recommendImg = recommendImg;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getRecommendImg() {
        return this.recommendImg;
    }
}
