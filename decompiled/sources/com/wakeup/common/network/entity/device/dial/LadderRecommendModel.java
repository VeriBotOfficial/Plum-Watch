package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.network.entity.device.DialModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderDiscountModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/LadderRecommendModel;", "", "show", "", "level", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "defaultSelectedDialId", "dials", "", "Lcom/wakeup/common/network/entity/device/DialModel;", "<init>", "(ZILjava/lang/String;ILjava/util/List;)V", "getShow", "()Z", "getLevel", "()I", "getSessionId", "()Ljava/lang/String;", "getDefaultSelectedDialId", "getDials", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LadderRecommendModel {
    private final int defaultSelectedDialId;
    private final List<DialModel> dials;
    private final int level;
    private final String sessionId;
    private final boolean show;

    public LadderRecommendModel() {
        this(false, 0, null, 0, null, 31, null);
    }

    public static /* synthetic */ LadderRecommendModel copy$default(LadderRecommendModel ladderRecommendModel, boolean z, int i, String str, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = ladderRecommendModel.show;
        }
        if ((i3 & 2) != 0) {
            i = ladderRecommendModel.level;
        }
        if ((i3 & 4) != 0) {
            str = ladderRecommendModel.sessionId;
        }
        if ((i3 & 8) != 0) {
            i2 = ladderRecommendModel.defaultSelectedDialId;
        }
        if ((i3 & 16) != 0) {
            list = ladderRecommendModel.dials;
        }
        List list2 = list;
        String str2 = str;
        return ladderRecommendModel.copy(z, i, str2, i2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDefaultSelectedDialId() {
        return this.defaultSelectedDialId;
    }

    public final List<DialModel> component5() {
        return this.dials;
    }

    public final LadderRecommendModel copy(boolean show, int level, String sessionId, int defaultSelectedDialId, List<? extends DialModel> dials) {
        return new LadderRecommendModel(show, level, sessionId, defaultSelectedDialId, dials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderRecommendModel)) {
            return false;
        }
        LadderRecommendModel ladderRecommendModel = (LadderRecommendModel) other;
        return this.show == ladderRecommendModel.show && this.level == ladderRecommendModel.level && Intrinsics.areEqual(this.sessionId, ladderRecommendModel.sessionId) && this.defaultSelectedDialId == ladderRecommendModel.defaultSelectedDialId && Intrinsics.areEqual(this.dials, ladderRecommendModel.dials);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.show) * 31) + Integer.hashCode(this.level)) * 31;
        String str = this.sessionId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.defaultSelectedDialId)) * 31;
        List<DialModel> list = this.dials;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "LadderRecommendModel(show=" + this.show + ", level=" + this.level + ", sessionId=" + this.sessionId + ", defaultSelectedDialId=" + this.defaultSelectedDialId + ", dials=" + this.dials + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LadderRecommendModel(boolean z, int i, String str, int i2, List<? extends DialModel> list) {
        this.show = z;
        this.level = i;
        this.sessionId = str;
        this.defaultSelectedDialId = i2;
        this.dials = list;
    }

    public /* synthetic */ LadderRecommendModel(boolean z, int i, String str, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : list);
    }

    public final boolean getShow() {
        return this.show;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getDefaultSelectedDialId() {
        return this.defaultSelectedDialId;
    }

    public final List<DialModel> getDials() {
        return this.dials;
    }
}
