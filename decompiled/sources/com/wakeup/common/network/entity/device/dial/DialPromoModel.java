package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.burypoint.BuryPointPageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialPromoModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014¨\u00067"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialPromoModel;", "", "title", "", "steps", "", "Lcom/wakeup/common/network/entity/device/dial/DialPromoStep;", BuryPointPageId.PAGE_ID_PLAN_DETAIL, "Lcom/wakeup/common/network/entity/device/dial/DialPromoDetail;", "banner", "keepLevel", "", "keepLabel", "keepTitle", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/wakeup/common/network/entity/device/dial/DialPromoDetail;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "getDetail", "()Lcom/wakeup/common/network/entity/device/dial/DialPromoDetail;", "setDetail", "(Lcom/wakeup/common/network/entity/device/dial/DialPromoDetail;)V", "getBanner", "setBanner", "getKeepLevel", "()I", "setKeepLevel", "(I)V", "getKeepLabel", "setKeepLabel", "getKeepTitle", "setKeepTitle", "getSessionId", "setSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialPromoModel {
    private String banner;
    private DialPromoDetail detail;
    private String keepLabel;
    private int keepLevel;
    private String keepTitle;
    private String sessionId;
    private List<DialPromoStep> steps;
    private String title;

    public DialPromoModel() {
        this(null, null, null, null, 0, null, null, null, 255, null);
    }

    public static /* synthetic */ DialPromoModel copy$default(DialPromoModel dialPromoModel, String str, List list, DialPromoDetail dialPromoDetail, String str2, int i, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dialPromoModel.title;
        }
        if ((i2 & 2) != 0) {
            list = dialPromoModel.steps;
        }
        if ((i2 & 4) != 0) {
            dialPromoDetail = dialPromoModel.detail;
        }
        if ((i2 & 8) != 0) {
            str2 = dialPromoModel.banner;
        }
        if ((i2 & 16) != 0) {
            i = dialPromoModel.keepLevel;
        }
        if ((i2 & 32) != 0) {
            str3 = dialPromoModel.keepLabel;
        }
        if ((i2 & 64) != 0) {
            str4 = dialPromoModel.keepTitle;
        }
        if ((i2 & 128) != 0) {
            str5 = dialPromoModel.sessionId;
        }
        String str6 = str4;
        String str7 = str5;
        int i3 = i;
        String str8 = str3;
        return dialPromoModel.copy(str, list, dialPromoDetail, str2, i3, str8, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DialPromoStep> component2() {
        return this.steps;
    }

    /* renamed from: component3, reason: from getter */
    public final DialPromoDetail getDetail() {
        return this.detail;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: component5, reason: from getter */
    public final int getKeepLevel() {
        return this.keepLevel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKeepLabel() {
        return this.keepLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getKeepTitle() {
        return this.keepTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final DialPromoModel copy(String title, List<DialPromoStep> steps, DialPromoDetail detail, String banner, int keepLevel, String keepLabel, String keepTitle, String sessionId) {
        return new DialPromoModel(title, steps, detail, banner, keepLevel, keepLabel, keepTitle, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialPromoModel)) {
            return false;
        }
        DialPromoModel dialPromoModel = (DialPromoModel) other;
        return Intrinsics.areEqual(this.title, dialPromoModel.title) && Intrinsics.areEqual(this.steps, dialPromoModel.steps) && Intrinsics.areEqual(this.detail, dialPromoModel.detail) && Intrinsics.areEqual(this.banner, dialPromoModel.banner) && this.keepLevel == dialPromoModel.keepLevel && Intrinsics.areEqual(this.keepLabel, dialPromoModel.keepLabel) && Intrinsics.areEqual(this.keepTitle, dialPromoModel.keepTitle) && Intrinsics.areEqual(this.sessionId, dialPromoModel.sessionId);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DialPromoStep> list = this.steps;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        DialPromoDetail dialPromoDetail = this.detail;
        int hashCode3 = (hashCode2 + (dialPromoDetail == null ? 0 : dialPromoDetail.hashCode())) * 31;
        String str2 = this.banner;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.keepLevel)) * 31;
        String str3 = this.keepLabel;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.keepTitle;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sessionId;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "DialPromoModel(title=" + this.title + ", steps=" + this.steps + ", detail=" + this.detail + ", banner=" + this.banner + ", keepLevel=" + this.keepLevel + ", keepLabel=" + this.keepLabel + ", keepTitle=" + this.keepTitle + ", sessionId=" + this.sessionId + Separators.RPAREN;
    }

    public DialPromoModel(String str, List<DialPromoStep> list, DialPromoDetail dialPromoDetail, String str2, int i, String str3, String str4, String str5) {
        this.title = str;
        this.steps = list;
        this.detail = dialPromoDetail;
        this.banner = str2;
        this.keepLevel = i;
        this.keepLabel = str3;
        this.keepTitle = str4;
        this.sessionId = str5;
    }

    public /* synthetic */ DialPromoModel(String str, List list, DialPromoDetail dialPromoDetail, String str2, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : dialPromoDetail, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5);
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final List<DialPromoStep> getSteps() {
        return this.steps;
    }

    public final void setSteps(List<DialPromoStep> list) {
        this.steps = list;
    }

    public final DialPromoDetail getDetail() {
        return this.detail;
    }

    public final void setDetail(DialPromoDetail dialPromoDetail) {
        this.detail = dialPromoDetail;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final void setBanner(String str) {
        this.banner = str;
    }

    public final int getKeepLevel() {
        return this.keepLevel;
    }

    public final void setKeepLevel(int i) {
        this.keepLevel = i;
    }

    public final String getKeepLabel() {
        return this.keepLabel;
    }

    public final void setKeepLabel(String str) {
        this.keepLabel = str;
    }

    public final String getKeepTitle() {
        return this.keepTitle;
    }

    public final void setKeepTitle(String str) {
        this.keepTitle = str;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }
}
