package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.umeng.analytics.pro.d;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/opts/OptionReport;", "", "common", "Lcom/wakeup/common/network/entity/opts/Common;", d.t, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", RnBuryPointApi.KEY_PAGE_ID, RnBuryPointApi.KEY_ACTION_NAME, "extend", "<init>", "(Lcom/wakeup/common/network/entity/opts/Common;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommon", "()Lcom/wakeup/common/network/entity/opts/Common;", "getPages", "()Ljava/util/ArrayList;", "getPageId", "()Ljava/lang/String;", "getActionName", "getExtend", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionReport {
    private final String actionName;
    private final Common common;
    private final String extend;
    private final String pageId;
    private final ArrayList<String> pages;

    public static /* synthetic */ OptionReport copy$default(OptionReport optionReport, Common common, ArrayList arrayList, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            common = optionReport.common;
        }
        if ((i & 2) != 0) {
            arrayList = optionReport.pages;
        }
        if ((i & 4) != 0) {
            str = optionReport.pageId;
        }
        if ((i & 8) != 0) {
            str2 = optionReport.actionName;
        }
        if ((i & 16) != 0) {
            str3 = optionReport.extend;
        }
        String str4 = str3;
        String str5 = str;
        return optionReport.copy(common, arrayList, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Common getCommon() {
        return this.common;
    }

    public final ArrayList<String> component2() {
        return this.pages;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExtend() {
        return this.extend;
    }

    public final OptionReport copy(Common common, ArrayList<String> pages, String pageId, String actionName, String extend) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(extend, "extend");
        return new OptionReport(common, pages, pageId, actionName, extend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionReport)) {
            return false;
        }
        OptionReport optionReport = (OptionReport) other;
        return Intrinsics.areEqual(this.common, optionReport.common) && Intrinsics.areEqual(this.pages, optionReport.pages) && Intrinsics.areEqual(this.pageId, optionReport.pageId) && Intrinsics.areEqual(this.actionName, optionReport.actionName) && Intrinsics.areEqual(this.extend, optionReport.extend);
    }

    public int hashCode() {
        return (((((((this.common.hashCode() * 31) + this.pages.hashCode()) * 31) + this.pageId.hashCode()) * 31) + this.actionName.hashCode()) * 31) + this.extend.hashCode();
    }

    public String toString() {
        return "OptionReport(common=" + this.common + ", pages=" + this.pages + ", pageId=" + this.pageId + ", actionName=" + this.actionName + ", extend=" + this.extend + Separators.RPAREN;
    }

    public OptionReport(Common common, ArrayList<String> pages, String pageId, String actionName, String extend) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(extend, "extend");
        this.common = common;
        this.pages = pages;
        this.pageId = pageId;
        this.actionName = actionName;
        this.extend = extend;
    }

    public final Common getCommon() {
        return this.common;
    }

    public final ArrayList<String> getPages() {
        return this.pages;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final String getExtend() {
        return this.extend;
    }
}
