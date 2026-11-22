package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderDiscountModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0007HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u00063"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/LadderStatusModel;", "", ViewProps.ENABLED, "", JsonStorageKeyNames.SESSION_ID_KEY, "", "level", "", "nextLevel", "finished", "banner", "baseDialPrice", "", "summary", "bannerDescList", "", "Lcom/wakeup/common/network/entity/device/dial/LadderBannerDesc;", ApiConstants.TIERS, "Lcom/wakeup/common/network/entity/device/dial/LadderTier;", "<init>", "(ZLjava/lang/String;IIZLjava/lang/String;DLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getEnabled", "()Z", "getSessionId", "()Ljava/lang/String;", "getLevel", "()I", "getNextLevel", "getFinished", "getBanner", "getBaseDialPrice", "()D", "getSummary", "getBannerDescList", "()Ljava/util/List;", "getTiers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LadderStatusModel {
    private final String banner;
    private final List<LadderBannerDesc> bannerDescList;
    private final double baseDialPrice;
    private final boolean enabled;
    private final boolean finished;
    private final int level;
    private final int nextLevel;
    private final String sessionId;
    private final String summary;
    private final List<LadderTier> tiers;

    public LadderStatusModel() {
        this(false, null, 0, 0, false, null, 0.0d, null, null, null, 1023, null);
    }

    public static /* synthetic */ LadderStatusModel copy$default(LadderStatusModel ladderStatusModel, boolean z, String str, int i, int i2, boolean z2, String str2, double d, String str3, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = ladderStatusModel.enabled;
        }
        if ((i3 & 2) != 0) {
            str = ladderStatusModel.sessionId;
        }
        if ((i3 & 4) != 0) {
            i = ladderStatusModel.level;
        }
        if ((i3 & 8) != 0) {
            i2 = ladderStatusModel.nextLevel;
        }
        if ((i3 & 16) != 0) {
            z2 = ladderStatusModel.finished;
        }
        if ((i3 & 32) != 0) {
            str2 = ladderStatusModel.banner;
        }
        if ((i3 & 64) != 0) {
            d = ladderStatusModel.baseDialPrice;
        }
        if ((i3 & 128) != 0) {
            str3 = ladderStatusModel.summary;
        }
        if ((i3 & 256) != 0) {
            list = ladderStatusModel.bannerDescList;
        }
        if ((i3 & 512) != 0) {
            list2 = ladderStatusModel.tiers;
        }
        List list3 = list2;
        String str4 = str3;
        double d2 = d;
        boolean z3 = z2;
        String str5 = str2;
        int i4 = i;
        int i5 = i2;
        return ladderStatusModel.copy(z, str, i4, i5, z3, str5, d2, str4, list, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<LadderTier> component10() {
        return this.tiers;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNextLevel() {
        return this.nextLevel;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: component7, reason: from getter */
    public final double getBaseDialPrice() {
        return this.baseDialPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final List<LadderBannerDesc> component9() {
        return this.bannerDescList;
    }

    public final LadderStatusModel copy(boolean enabled, String sessionId, int level, int nextLevel, boolean finished, String banner, double baseDialPrice, String summary, List<LadderBannerDesc> bannerDescList, List<LadderTier> tiers) {
        return new LadderStatusModel(enabled, sessionId, level, nextLevel, finished, banner, baseDialPrice, summary, bannerDescList, tiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderStatusModel)) {
            return false;
        }
        LadderStatusModel ladderStatusModel = (LadderStatusModel) other;
        return this.enabled == ladderStatusModel.enabled && Intrinsics.areEqual(this.sessionId, ladderStatusModel.sessionId) && this.level == ladderStatusModel.level && this.nextLevel == ladderStatusModel.nextLevel && this.finished == ladderStatusModel.finished && Intrinsics.areEqual(this.banner, ladderStatusModel.banner) && Double.compare(this.baseDialPrice, ladderStatusModel.baseDialPrice) == 0 && Intrinsics.areEqual(this.summary, ladderStatusModel.summary) && Intrinsics.areEqual(this.bannerDescList, ladderStatusModel.bannerDescList) && Intrinsics.areEqual(this.tiers, ladderStatusModel.tiers);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.sessionId;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.nextLevel)) * 31) + Boolean.hashCode(this.finished)) * 31;
        String str2 = this.banner;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.baseDialPrice)) * 31;
        String str3 = this.summary;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LadderBannerDesc> list = this.bannerDescList;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<LadderTier> list2 = this.tiers;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "LadderStatusModel(enabled=" + this.enabled + ", sessionId=" + this.sessionId + ", level=" + this.level + ", nextLevel=" + this.nextLevel + ", finished=" + this.finished + ", banner=" + this.banner + ", baseDialPrice=" + this.baseDialPrice + ", summary=" + this.summary + ", bannerDescList=" + this.bannerDescList + ", tiers=" + this.tiers + Separators.RPAREN;
    }

    public LadderStatusModel(boolean z, String str, int i, int i2, boolean z2, String str2, double d, String str3, List<LadderBannerDesc> list, List<LadderTier> list2) {
        this.enabled = z;
        this.sessionId = str;
        this.level = i;
        this.nextLevel = i2;
        this.finished = z2;
        this.banner = str2;
        this.baseDialPrice = d;
        this.summary = str3;
        this.bannerDescList = list;
        this.tiers = list2;
    }

    public /* synthetic */ LadderStatusModel(boolean z, String str, int i, int i2, boolean z2, String str2, double d, String str3, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? 0.0d : d, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : list, (i3 & 512) != 0 ? null : list2);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getNextLevel() {
        return this.nextLevel;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final double getBaseDialPrice() {
        return this.baseDialPrice;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<LadderBannerDesc> getBannerDescList() {
        return this.bannerDescList;
    }

    public final List<LadderTier> getTiers() {
        return this.tiers;
    }
}
