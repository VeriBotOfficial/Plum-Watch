package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialPromoModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialPromoDetail;", "", "title", "", "subTitle", "ladders", "", "Lcom/wakeup/common/network/entity/device/dial/DialPromoLadder;", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getSubTitle", "setSubTitle", "getLadders", "()Ljava/util/List;", "setLadders", "(Ljava/util/List;)V", "getSummary", "setSummary", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialPromoDetail {
    private List<DialPromoLadder> ladders;
    private String subTitle;
    private String summary;
    private String title;

    public DialPromoDetail() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialPromoDetail copy$default(DialPromoDetail dialPromoDetail, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialPromoDetail.title;
        }
        if ((i & 2) != 0) {
            str2 = dialPromoDetail.subTitle;
        }
        if ((i & 4) != 0) {
            list = dialPromoDetail.ladders;
        }
        if ((i & 8) != 0) {
            str3 = dialPromoDetail.summary;
        }
        return dialPromoDetail.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    public final List<DialPromoLadder> component3() {
        return this.ladders;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final DialPromoDetail copy(String title, String subTitle, List<DialPromoLadder> ladders, String summary) {
        return new DialPromoDetail(title, subTitle, ladders, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialPromoDetail)) {
            return false;
        }
        DialPromoDetail dialPromoDetail = (DialPromoDetail) other;
        return Intrinsics.areEqual(this.title, dialPromoDetail.title) && Intrinsics.areEqual(this.subTitle, dialPromoDetail.subTitle) && Intrinsics.areEqual(this.ladders, dialPromoDetail.ladders) && Intrinsics.areEqual(this.summary, dialPromoDetail.summary);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DialPromoLadder> list = this.ladders;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.summary;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DialPromoDetail(title=" + this.title + ", subTitle=" + this.subTitle + ", ladders=" + this.ladders + ", summary=" + this.summary + Separators.RPAREN;
    }

    public DialPromoDetail(String str, String str2, List<DialPromoLadder> list, String str3) {
        this.title = str;
        this.subTitle = str2;
        this.ladders = list;
        this.summary = str3;
    }

    public /* synthetic */ DialPromoDetail(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3);
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

    public final List<DialPromoLadder> getLadders() {
        return this.ladders;
    }

    public final void setLadders(List<DialPromoLadder> list) {
        this.ladders = list;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }
}
