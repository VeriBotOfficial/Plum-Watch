package com.wakeup.howear.model.domain.feedmenu.entity;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeedMenuDomainEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "", "title", "", "description", "imageUrl", "jumpAction", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "experiment_Id", "experiment_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImageUrl", "getJumpAction", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "getExperiment_Id", "getExperiment_name", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeedMenuDomainEntity {
    private final String description;
    private final String experiment_Id;
    private final String experiment_name;
    private final String imageUrl;
    private final OptsJumpModel jumpAction;
    private final String title;

    public static /* synthetic */ FeedMenuDomainEntity copy$default(FeedMenuDomainEntity feedMenuDomainEntity, String str, String str2, String str3, OptsJumpModel optsJumpModel, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedMenuDomainEntity.title;
        }
        if ((i & 2) != 0) {
            str2 = feedMenuDomainEntity.description;
        }
        if ((i & 4) != 0) {
            str3 = feedMenuDomainEntity.imageUrl;
        }
        if ((i & 8) != 0) {
            optsJumpModel = feedMenuDomainEntity.jumpAction;
        }
        if ((i & 16) != 0) {
            str4 = feedMenuDomainEntity.experiment_Id;
        }
        if ((i & 32) != 0) {
            str5 = feedMenuDomainEntity.experiment_name;
        }
        String str6 = str4;
        String str7 = str5;
        return feedMenuDomainEntity.copy(str, str2, str3, optsJumpModel, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final OptsJumpModel getJumpAction() {
        return this.jumpAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExperiment_Id() {
        return this.experiment_Id;
    }

    /* renamed from: component6, reason: from getter */
    public final String getExperiment_name() {
        return this.experiment_name;
    }

    public final FeedMenuDomainEntity copy(String title, String description, String imageUrl, OptsJumpModel jumpAction, String experiment_Id, String experiment_name) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(experiment_Id, "experiment_Id");
        Intrinsics.checkNotNullParameter(experiment_name, "experiment_name");
        return new FeedMenuDomainEntity(title, description, imageUrl, jumpAction, experiment_Id, experiment_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedMenuDomainEntity)) {
            return false;
        }
        FeedMenuDomainEntity feedMenuDomainEntity = (FeedMenuDomainEntity) other;
        return Intrinsics.areEqual(this.title, feedMenuDomainEntity.title) && Intrinsics.areEqual(this.description, feedMenuDomainEntity.description) && Intrinsics.areEqual(this.imageUrl, feedMenuDomainEntity.imageUrl) && Intrinsics.areEqual(this.jumpAction, feedMenuDomainEntity.jumpAction) && Intrinsics.areEqual(this.experiment_Id, feedMenuDomainEntity.experiment_Id) && Intrinsics.areEqual(this.experiment_name, feedMenuDomainEntity.experiment_name);
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        OptsJumpModel optsJumpModel = this.jumpAction;
        return ((((hashCode + (optsJumpModel == null ? 0 : optsJumpModel.hashCode())) * 31) + this.experiment_Id.hashCode()) * 31) + this.experiment_name.hashCode();
    }

    public String toString() {
        return "FeedMenuDomainEntity(title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", jumpAction=" + this.jumpAction + ", experiment_Id=" + this.experiment_Id + ", experiment_name=" + this.experiment_name + Separators.RPAREN;
    }

    public FeedMenuDomainEntity(String title, String description, String imageUrl, OptsJumpModel optsJumpModel, String experiment_Id, String experiment_name) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(experiment_Id, "experiment_Id");
        Intrinsics.checkNotNullParameter(experiment_name, "experiment_name");
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.jumpAction = optsJumpModel;
        this.experiment_Id = experiment_Id;
        this.experiment_name = experiment_name;
    }

    public /* synthetic */ FeedMenuDomainEntity(String str, String str2, String str3, OptsJumpModel optsJumpModel, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : optsJumpModel, str4, str5);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final OptsJumpModel getJumpAction() {
        return this.jumpAction;
    }

    public final String getExperiment_Id() {
        return this.experiment_Id;
    }

    public final String getExperiment_name() {
        return this.experiment_name;
    }
}
