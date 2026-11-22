package com.wakeup.common.network.entity.search;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HotSearchInfoBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003Jw\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018¨\u0006="}, d2 = {"Lcom/wakeup/common/network/entity/search/HotSearchInfoBean;", "", "id", "", "rank", "", "title", "label", "batchId", "source", "hotValue", SpeechConstant.ISE_CATEGORY, "createdAt", "updatedAt", "language", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getRank", "()Ljava/lang/String;", "setRank", "(Ljava/lang/String;)V", "getTitle", d.p, "getLabel", "setLabel", "getBatchId", "setBatchId", "getSource", "setSource", "getHotValue", "setHotValue", "getCategory", "setCategory", "getCreatedAt", "setCreatedAt", "getUpdatedAt", "setUpdatedAt", "getLanguage", "setLanguage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HotSearchInfoBean {
    private long batchId;
    private String category;
    private String createdAt;
    private String hotValue;
    private long id;
    private String label;
    private String language;
    private String rank;
    private String source;
    private String title;
    private String updatedAt;

    public HotSearchInfoBean() {
        this(0L, null, null, null, 0L, null, null, null, null, null, null, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRank() {
        return this.rank;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component5, reason: from getter */
    public final long getBatchId() {
        return this.batchId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final String getHotValue() {
        return this.hotValue;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final HotSearchInfoBean copy(long id2, String rank, String title, String label, long batchId, String source, String hotValue, String category, String createdAt, String updatedAt, String language) {
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hotValue, "hotValue");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(language, "language");
        return new HotSearchInfoBean(id2, rank, title, label, batchId, source, hotValue, category, createdAt, updatedAt, language);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotSearchInfoBean)) {
            return false;
        }
        HotSearchInfoBean hotSearchInfoBean = (HotSearchInfoBean) other;
        return this.id == hotSearchInfoBean.id && Intrinsics.areEqual(this.rank, hotSearchInfoBean.rank) && Intrinsics.areEqual(this.title, hotSearchInfoBean.title) && Intrinsics.areEqual(this.label, hotSearchInfoBean.label) && this.batchId == hotSearchInfoBean.batchId && Intrinsics.areEqual(this.source, hotSearchInfoBean.source) && Intrinsics.areEqual(this.hotValue, hotSearchInfoBean.hotValue) && Intrinsics.areEqual(this.category, hotSearchInfoBean.category) && Intrinsics.areEqual(this.createdAt, hotSearchInfoBean.createdAt) && Intrinsics.areEqual(this.updatedAt, hotSearchInfoBean.updatedAt) && Intrinsics.areEqual(this.language, hotSearchInfoBean.language);
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + this.rank.hashCode()) * 31) + this.title.hashCode()) * 31) + this.label.hashCode()) * 31) + Long.hashCode(this.batchId)) * 31) + this.source.hashCode()) * 31) + this.hotValue.hashCode()) * 31) + this.category.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.language.hashCode();
    }

    public String toString() {
        return "HotSearchInfoBean(id=" + this.id + ", rank=" + this.rank + ", title=" + this.title + ", label=" + this.label + ", batchId=" + this.batchId + ", source=" + this.source + ", hotValue=" + this.hotValue + ", category=" + this.category + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", language=" + this.language + Separators.RPAREN;
    }

    public HotSearchInfoBean(long j, String rank, String title, String label, long j2, String source, String hotValue, String category, String createdAt, String updatedAt, String language) {
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(hotValue, "hotValue");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(language, "language");
        this.id = j;
        this.rank = rank;
        this.title = title;
        this.label = label;
        this.batchId = j2;
        this.source = source;
        this.hotValue = hotValue;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.language = language;
    }

    public /* synthetic */ HotSearchInfoBean(long j, String str, String str2, String str3, long j2, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? j2 : 0L, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9);
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getRank() {
        return this.rank;
    }

    public final void setRank(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rank = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getLabel() {
        return this.label;
    }

    public final void setLabel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.label = str;
    }

    public final long getBatchId() {
        return this.batchId;
    }

    public final void setBatchId(long j) {
        this.batchId = j;
    }

    public final String getSource() {
        return this.source;
    }

    public final void setSource(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final String getHotValue() {
        return this.hotValue;
    }

    public final void setHotValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hotValue = str;
    }

    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createdAt = str;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final void setUpdatedAt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.updatedAt = str;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final void setLanguage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.language = str;
    }
}
