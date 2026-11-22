package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialPromoNextModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0089\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u00109\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010#\"\u0004\b$\u0010%R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001e¨\u0006="}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialPromoNextModel;", "", "currentStep", "", "stepLabels", "", "", "badgeText", "title", "subTitle", "isLowest", "", "dials", "Lcom/wakeup/common/network/entity/device/dial/DialPromoNextDial;", "buyText", "closeText", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentStep", "()I", "setCurrentStep", "(I)V", "getStepLabels", "()Ljava/util/List;", "setStepLabels", "(Ljava/util/List;)V", "getBadgeText", "()Ljava/lang/String;", "setBadgeText", "(Ljava/lang/String;)V", "getTitle", d.p, "getSubTitle", "setSubTitle", "()Z", "setLowest", "(Z)V", "getDials", "setDials", "getBuyText", "setBuyText", "getCloseText", "setCloseText", "getSessionId", "setSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialPromoNextModel {
    private String badgeText;
    private String buyText;
    private String closeText;
    private int currentStep;
    private List<DialPromoNextDial> dials;
    private boolean isLowest;
    private String sessionId;
    private List<String> stepLabels;
    private String subTitle;
    private String title;

    public DialPromoNextModel() {
        this(0, null, null, null, null, false, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ DialPromoNextModel copy$default(DialPromoNextModel dialPromoNextModel, int i, List list, String str, String str2, String str3, boolean z, List list2, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dialPromoNextModel.currentStep;
        }
        if ((i2 & 2) != 0) {
            list = dialPromoNextModel.stepLabels;
        }
        if ((i2 & 4) != 0) {
            str = dialPromoNextModel.badgeText;
        }
        if ((i2 & 8) != 0) {
            str2 = dialPromoNextModel.title;
        }
        if ((i2 & 16) != 0) {
            str3 = dialPromoNextModel.subTitle;
        }
        if ((i2 & 32) != 0) {
            z = dialPromoNextModel.isLowest;
        }
        if ((i2 & 64) != 0) {
            list2 = dialPromoNextModel.dials;
        }
        if ((i2 & 128) != 0) {
            str4 = dialPromoNextModel.buyText;
        }
        if ((i2 & 256) != 0) {
            str5 = dialPromoNextModel.closeText;
        }
        if ((i2 & 512) != 0) {
            str6 = dialPromoNextModel.sessionId;
        }
        String str7 = str5;
        String str8 = str6;
        List list3 = list2;
        String str9 = str4;
        String str10 = str3;
        boolean z2 = z;
        return dialPromoNextModel.copy(i, list, str, str2, str10, z2, list3, str9, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<String> component2() {
        return this.stepLabels;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLowest() {
        return this.isLowest;
    }

    public final List<DialPromoNextDial> component7() {
        return this.dials;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBuyText() {
        return this.buyText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCloseText() {
        return this.closeText;
    }

    public final DialPromoNextModel copy(int currentStep, List<String> stepLabels, String badgeText, String title, String subTitle, boolean isLowest, List<DialPromoNextDial> dials, String buyText, String closeText, String sessionId) {
        return new DialPromoNextModel(currentStep, stepLabels, badgeText, title, subTitle, isLowest, dials, buyText, closeText, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialPromoNextModel)) {
            return false;
        }
        DialPromoNextModel dialPromoNextModel = (DialPromoNextModel) other;
        return this.currentStep == dialPromoNextModel.currentStep && Intrinsics.areEqual(this.stepLabels, dialPromoNextModel.stepLabels) && Intrinsics.areEqual(this.badgeText, dialPromoNextModel.badgeText) && Intrinsics.areEqual(this.title, dialPromoNextModel.title) && Intrinsics.areEqual(this.subTitle, dialPromoNextModel.subTitle) && this.isLowest == dialPromoNextModel.isLowest && Intrinsics.areEqual(this.dials, dialPromoNextModel.dials) && Intrinsics.areEqual(this.buyText, dialPromoNextModel.buyText) && Intrinsics.areEqual(this.closeText, dialPromoNextModel.closeText) && Intrinsics.areEqual(this.sessionId, dialPromoNextModel.sessionId);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.currentStep) * 31;
        List<String> list = this.stepLabels;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.badgeText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isLowest)) * 31;
        List<DialPromoNextDial> list2 = this.dials;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.buyText;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.closeText;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sessionId;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "DialPromoNextModel(currentStep=" + this.currentStep + ", stepLabels=" + this.stepLabels + ", badgeText=" + this.badgeText + ", title=" + this.title + ", subTitle=" + this.subTitle + ", isLowest=" + this.isLowest + ", dials=" + this.dials + ", buyText=" + this.buyText + ", closeText=" + this.closeText + ", sessionId=" + this.sessionId + Separators.RPAREN;
    }

    public DialPromoNextModel(int i, List<String> list, String str, String str2, String str3, boolean z, List<DialPromoNextDial> list2, String str4, String str5, String str6) {
        this.currentStep = i;
        this.stepLabels = list;
        this.badgeText = str;
        this.title = str2;
        this.subTitle = str3;
        this.isLowest = z;
        this.dials = list2;
        this.buyText = str4;
        this.closeText = str5;
        this.sessionId = str6;
    }

    public /* synthetic */ DialPromoNextModel(int i, List list, String str, String str2, String str3, boolean z, List list2, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6);
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final void setCurrentStep(int i) {
        this.currentStep = i;
    }

    public final List<String> getStepLabels() {
        return this.stepLabels;
    }

    public final void setStepLabels(List<String> list) {
        this.stepLabels = list;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final void setBadgeText(String str) {
        this.badgeText = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final boolean isLowest() {
        return this.isLowest;
    }

    public final void setLowest(boolean z) {
        this.isLowest = z;
    }

    public final List<DialPromoNextDial> getDials() {
        return this.dials;
    }

    public final void setDials(List<DialPromoNextDial> list) {
        this.dials = list;
    }

    public final String getBuyText() {
        return this.buyText;
    }

    public final void setBuyText(String str) {
        this.buyText = str;
    }

    public final String getCloseText() {
        return this.closeText;
    }

    public final void setCloseText(String str) {
        this.closeText = str;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }
}
