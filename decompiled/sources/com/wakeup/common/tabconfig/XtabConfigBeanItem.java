package com.wakeup.common.tabconfig;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XtabConfigBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jk\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006)"}, d2 = {"Lcom/wakeup/common/tabconfig/XtabConfigBeanItem;", "", "id", "", "delStatus", "tabName", "", "orderNum", "defaultFlag", "createTime", l.a.ac, SocialConstants.PARAM_IMG_URL, "pageUrl", "<init>", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getDelStatus", "getTabName", "()Ljava/lang/String;", "getOrderNum", "getDefaultFlag", "getCreateTime", "getUpdateTime", "getImg", "getPageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XtabConfigBeanItem {
    private final String createTime;
    private final int defaultFlag;
    private final int delStatus;
    private final int id;
    private final String img;
    private final int orderNum;
    private final String pageUrl;
    private final String tabName;
    private final String updateTime;

    public static /* synthetic */ XtabConfigBeanItem copy$default(XtabConfigBeanItem xtabConfigBeanItem, int i, int i2, String str, int i3, int i4, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = xtabConfigBeanItem.id;
        }
        if ((i5 & 2) != 0) {
            i2 = xtabConfigBeanItem.delStatus;
        }
        if ((i5 & 4) != 0) {
            str = xtabConfigBeanItem.tabName;
        }
        if ((i5 & 8) != 0) {
            i3 = xtabConfigBeanItem.orderNum;
        }
        if ((i5 & 16) != 0) {
            i4 = xtabConfigBeanItem.defaultFlag;
        }
        if ((i5 & 32) != 0) {
            str2 = xtabConfigBeanItem.createTime;
        }
        if ((i5 & 64) != 0) {
            str3 = xtabConfigBeanItem.updateTime;
        }
        if ((i5 & 128) != 0) {
            str4 = xtabConfigBeanItem.img;
        }
        if ((i5 & 256) != 0) {
            str5 = xtabConfigBeanItem.pageUrl;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        int i6 = i4;
        String str10 = str;
        return xtabConfigBeanItem.copy(i, i2, str10, i3, i6, str8, str9, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDelStatus() {
        return this.delStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrderNum() {
        return this.orderNum;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDefaultFlag() {
        return this.defaultFlag;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    public final XtabConfigBeanItem copy(int id2, int delStatus, String tabName, int orderNum, int defaultFlag, String createTime, String updateTime, String img, String pageUrl) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        return new XtabConfigBeanItem(id2, delStatus, tabName, orderNum, defaultFlag, createTime, updateTime, img, pageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XtabConfigBeanItem)) {
            return false;
        }
        XtabConfigBeanItem xtabConfigBeanItem = (XtabConfigBeanItem) other;
        return this.id == xtabConfigBeanItem.id && this.delStatus == xtabConfigBeanItem.delStatus && Intrinsics.areEqual(this.tabName, xtabConfigBeanItem.tabName) && this.orderNum == xtabConfigBeanItem.orderNum && this.defaultFlag == xtabConfigBeanItem.defaultFlag && Intrinsics.areEqual(this.createTime, xtabConfigBeanItem.createTime) && Intrinsics.areEqual(this.updateTime, xtabConfigBeanItem.updateTime) && Intrinsics.areEqual(this.img, xtabConfigBeanItem.img) && Intrinsics.areEqual(this.pageUrl, xtabConfigBeanItem.pageUrl);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.delStatus)) * 31) + this.tabName.hashCode()) * 31) + Integer.hashCode(this.orderNum)) * 31) + Integer.hashCode(this.defaultFlag)) * 31;
        String str = this.createTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageUrl;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "XtabConfigBeanItem(id=" + this.id + ", delStatus=" + this.delStatus + ", tabName=" + this.tabName + ", orderNum=" + this.orderNum + ", defaultFlag=" + this.defaultFlag + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", img=" + this.img + ", pageUrl=" + this.pageUrl + Separators.RPAREN;
    }

    public XtabConfigBeanItem(int i, int i2, String tabName, int i3, int i4, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        this.id = i;
        this.delStatus = i2;
        this.tabName = tabName;
        this.orderNum = i3;
        this.defaultFlag = i4;
        this.createTime = str;
        this.updateTime = str2;
        this.img = str3;
        this.pageUrl = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ XtabConfigBeanItem(int r2, int r3, java.lang.String r4, int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r2 = -1
        L5:
            r12 = r11 & 32
            r0 = 0
            if (r12 == 0) goto Lb
            r7 = r0
        Lb:
            r12 = r11 & 64
            if (r12 == 0) goto L10
            r8 = r0
        L10:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L15
            r9 = r0
        L15:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L24
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2e
        L24:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.tabconfig.XtabConfigBeanItem.<init>(int, int, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getId() {
        return this.id;
    }

    public final int getDelStatus() {
        return this.delStatus;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final int getOrderNum() {
        return this.orderNum;
    }

    public final int getDefaultFlag() {
        return this.defaultFlag;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }
}
