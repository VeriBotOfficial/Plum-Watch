package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import androidx.compose.ui.layout.LayoutKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnualBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J¡\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020KHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0016¨\u0006L"}, d2 = {"Lcom/wakeup/common/network/entity/other/AnnualBean;", "", "mhn920", "", "luckdraw", "ios_luckdraw", "annual_reports", "Lcom/wakeup/common/network/entity/other/AnnualReports;", "android_caizhiwu", "android_find", "android_chatgpt_zh", "android_chatgpt_en", "android_game_zh", "android_game_en", "android_isOpenWsh_zh", "android_isOpenWsh_en", "android_paypal_guide", "android_position_offset", "old_file_health", "<init>", "(IIILcom/wakeup/common/network/entity/other/AnnualReports;IIIIIIIIIII)V", "getMhn920", "()I", "setMhn920", "(I)V", "getLuckdraw", "setLuckdraw", "getIos_luckdraw", "setIos_luckdraw", "getAnnual_reports", "()Lcom/wakeup/common/network/entity/other/AnnualReports;", "setAnnual_reports", "(Lcom/wakeup/common/network/entity/other/AnnualReports;)V", "getAndroid_caizhiwu", "setAndroid_caizhiwu", "getAndroid_find", "setAndroid_find", "getAndroid_chatgpt_zh", "setAndroid_chatgpt_zh", "getAndroid_chatgpt_en", "setAndroid_chatgpt_en", "getAndroid_game_zh", "setAndroid_game_zh", "getAndroid_game_en", "setAndroid_game_en", "getAndroid_isOpenWsh_zh", "setAndroid_isOpenWsh_zh", "getAndroid_isOpenWsh_en", "setAndroid_isOpenWsh_en", "getAndroid_paypal_guide", "setAndroid_paypal_guide", "getAndroid_position_offset", "setAndroid_position_offset", "getOld_file_health", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AnnualBean {
    private int android_caizhiwu;
    private int android_chatgpt_en;
    private int android_chatgpt_zh;
    private int android_find;
    private int android_game_en;
    private int android_game_zh;
    private int android_isOpenWsh_en;
    private int android_isOpenWsh_zh;
    private int android_paypal_guide;
    private int android_position_offset;
    private AnnualReports annual_reports;
    private int ios_luckdraw;
    private int luckdraw;
    private int mhn920;
    private final int old_file_health;

    public AnnualBean() {
        this(0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, LayoutKt.LargeDimension, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMhn920() {
        return this.mhn920;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAndroid_game_en() {
        return this.android_game_en;
    }

    /* renamed from: component11, reason: from getter */
    public final int getAndroid_isOpenWsh_zh() {
        return this.android_isOpenWsh_zh;
    }

    /* renamed from: component12, reason: from getter */
    public final int getAndroid_isOpenWsh_en() {
        return this.android_isOpenWsh_en;
    }

    /* renamed from: component13, reason: from getter */
    public final int getAndroid_paypal_guide() {
        return this.android_paypal_guide;
    }

    /* renamed from: component14, reason: from getter */
    public final int getAndroid_position_offset() {
        return this.android_position_offset;
    }

    /* renamed from: component15, reason: from getter */
    public final int getOld_file_health() {
        return this.old_file_health;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLuckdraw() {
        return this.luckdraw;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIos_luckdraw() {
        return this.ios_luckdraw;
    }

    /* renamed from: component4, reason: from getter */
    public final AnnualReports getAnnual_reports() {
        return this.annual_reports;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAndroid_caizhiwu() {
        return this.android_caizhiwu;
    }

    /* renamed from: component6, reason: from getter */
    public final int getAndroid_find() {
        return this.android_find;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAndroid_chatgpt_zh() {
        return this.android_chatgpt_zh;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAndroid_chatgpt_en() {
        return this.android_chatgpt_en;
    }

    /* renamed from: component9, reason: from getter */
    public final int getAndroid_game_zh() {
        return this.android_game_zh;
    }

    public final AnnualBean copy(int mhn920, int luckdraw, int ios_luckdraw, AnnualReports annual_reports, int android_caizhiwu, int android_find, int android_chatgpt_zh, int android_chatgpt_en, int android_game_zh, int android_game_en, int android_isOpenWsh_zh, int android_isOpenWsh_en, int android_paypal_guide, int android_position_offset, int old_file_health) {
        return new AnnualBean(mhn920, luckdraw, ios_luckdraw, annual_reports, android_caizhiwu, android_find, android_chatgpt_zh, android_chatgpt_en, android_game_zh, android_game_en, android_isOpenWsh_zh, android_isOpenWsh_en, android_paypal_guide, android_position_offset, old_file_health);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnualBean)) {
            return false;
        }
        AnnualBean annualBean = (AnnualBean) other;
        return this.mhn920 == annualBean.mhn920 && this.luckdraw == annualBean.luckdraw && this.ios_luckdraw == annualBean.ios_luckdraw && Intrinsics.areEqual(this.annual_reports, annualBean.annual_reports) && this.android_caizhiwu == annualBean.android_caizhiwu && this.android_find == annualBean.android_find && this.android_chatgpt_zh == annualBean.android_chatgpt_zh && this.android_chatgpt_en == annualBean.android_chatgpt_en && this.android_game_zh == annualBean.android_game_zh && this.android_game_en == annualBean.android_game_en && this.android_isOpenWsh_zh == annualBean.android_isOpenWsh_zh && this.android_isOpenWsh_en == annualBean.android_isOpenWsh_en && this.android_paypal_guide == annualBean.android_paypal_guide && this.android_position_offset == annualBean.android_position_offset && this.old_file_health == annualBean.old_file_health;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.mhn920) * 31) + Integer.hashCode(this.luckdraw)) * 31) + Integer.hashCode(this.ios_luckdraw)) * 31;
        AnnualReports annualReports = this.annual_reports;
        return ((((((((((((((((((((((hashCode + (annualReports == null ? 0 : annualReports.hashCode())) * 31) + Integer.hashCode(this.android_caizhiwu)) * 31) + Integer.hashCode(this.android_find)) * 31) + Integer.hashCode(this.android_chatgpt_zh)) * 31) + Integer.hashCode(this.android_chatgpt_en)) * 31) + Integer.hashCode(this.android_game_zh)) * 31) + Integer.hashCode(this.android_game_en)) * 31) + Integer.hashCode(this.android_isOpenWsh_zh)) * 31) + Integer.hashCode(this.android_isOpenWsh_en)) * 31) + Integer.hashCode(this.android_paypal_guide)) * 31) + Integer.hashCode(this.android_position_offset)) * 31) + Integer.hashCode(this.old_file_health);
    }

    public String toString() {
        return "AnnualBean(mhn920=" + this.mhn920 + ", luckdraw=" + this.luckdraw + ", ios_luckdraw=" + this.ios_luckdraw + ", annual_reports=" + this.annual_reports + ", android_caizhiwu=" + this.android_caizhiwu + ", android_find=" + this.android_find + ", android_chatgpt_zh=" + this.android_chatgpt_zh + ", android_chatgpt_en=" + this.android_chatgpt_en + ", android_game_zh=" + this.android_game_zh + ", android_game_en=" + this.android_game_en + ", android_isOpenWsh_zh=" + this.android_isOpenWsh_zh + ", android_isOpenWsh_en=" + this.android_isOpenWsh_en + ", android_paypal_guide=" + this.android_paypal_guide + ", android_position_offset=" + this.android_position_offset + ", old_file_health=" + this.old_file_health + Separators.RPAREN;
    }

    public AnnualBean(int i, int i2, int i3, AnnualReports annualReports, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.mhn920 = i;
        this.luckdraw = i2;
        this.ios_luckdraw = i3;
        this.annual_reports = annualReports;
        this.android_caizhiwu = i4;
        this.android_find = i5;
        this.android_chatgpt_zh = i6;
        this.android_chatgpt_en = i7;
        this.android_game_zh = i8;
        this.android_game_en = i9;
        this.android_isOpenWsh_zh = i10;
        this.android_isOpenWsh_en = i11;
        this.android_paypal_guide = i12;
        this.android_position_offset = i13;
        this.old_file_health = i14;
    }

    public /* synthetic */ AnnualBean(int i, int i2, int i3, AnnualReports annualReports, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i, (i15 & 2) != 0 ? 0 : i2, (i15 & 4) != 0 ? 0 : i3, (i15 & 8) != 0 ? null : annualReports, (i15 & 16) != 0 ? 1 : i4, (i15 & 32) != 0 ? 1 : i5, (i15 & 64) != 0 ? 0 : i6, (i15 & 128) != 0 ? 0 : i7, (i15 & 256) != 0 ? 0 : i8, (i15 & 512) != 0 ? 0 : i9, (i15 & 1024) != 0 ? 1 : i10, (i15 & 2048) == 0 ? i11 : 1, (i15 & 4096) != 0 ? 0 : i12, (i15 & 8192) != 0 ? 0 : i13, (i15 & 16384) != 0 ? 0 : i14);
    }

    public final int getMhn920() {
        return this.mhn920;
    }

    public final void setMhn920(int i) {
        this.mhn920 = i;
    }

    public final int getLuckdraw() {
        return this.luckdraw;
    }

    public final void setLuckdraw(int i) {
        this.luckdraw = i;
    }

    public final int getIos_luckdraw() {
        return this.ios_luckdraw;
    }

    public final void setIos_luckdraw(int i) {
        this.ios_luckdraw = i;
    }

    public final AnnualReports getAnnual_reports() {
        return this.annual_reports;
    }

    public final void setAnnual_reports(AnnualReports annualReports) {
        this.annual_reports = annualReports;
    }

    public final int getAndroid_caizhiwu() {
        return this.android_caizhiwu;
    }

    public final void setAndroid_caizhiwu(int i) {
        this.android_caizhiwu = i;
    }

    public final int getAndroid_find() {
        return this.android_find;
    }

    public final void setAndroid_find(int i) {
        this.android_find = i;
    }

    public final int getAndroid_chatgpt_zh() {
        return this.android_chatgpt_zh;
    }

    public final void setAndroid_chatgpt_zh(int i) {
        this.android_chatgpt_zh = i;
    }

    public final int getAndroid_chatgpt_en() {
        return this.android_chatgpt_en;
    }

    public final void setAndroid_chatgpt_en(int i) {
        this.android_chatgpt_en = i;
    }

    public final int getAndroid_game_zh() {
        return this.android_game_zh;
    }

    public final void setAndroid_game_zh(int i) {
        this.android_game_zh = i;
    }

    public final int getAndroid_game_en() {
        return this.android_game_en;
    }

    public final void setAndroid_game_en(int i) {
        this.android_game_en = i;
    }

    public final int getAndroid_isOpenWsh_zh() {
        return this.android_isOpenWsh_zh;
    }

    public final void setAndroid_isOpenWsh_zh(int i) {
        this.android_isOpenWsh_zh = i;
    }

    public final int getAndroid_isOpenWsh_en() {
        return this.android_isOpenWsh_en;
    }

    public final void setAndroid_isOpenWsh_en(int i) {
        this.android_isOpenWsh_en = i;
    }

    public final int getAndroid_paypal_guide() {
        return this.android_paypal_guide;
    }

    public final void setAndroid_paypal_guide(int i) {
        this.android_paypal_guide = i;
    }

    public final int getAndroid_position_offset() {
        return this.android_position_offset;
    }

    public final void setAndroid_position_offset(int i) {
        this.android_position_offset = i;
    }

    public final int getOld_file_health() {
        return this.old_file_health;
    }
}
