package com.wakeup.common.tabconfig;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XtabConfigBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/tabconfig/XtabConfigBean;", "", "filePath", "", "data", "", "Lcom/wakeup/common/tabconfig/XtabConfigBeanItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFilePath", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XtabConfigBean {
    private final List<XtabConfigBeanItem> data;
    private final String filePath;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XtabConfigBean copy$default(XtabConfigBean xtabConfigBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xtabConfigBean.filePath;
        }
        if ((i & 2) != 0) {
            list = xtabConfigBean.data;
        }
        return xtabConfigBean.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final List<XtabConfigBeanItem> component2() {
        return this.data;
    }

    public final XtabConfigBean copy(String filePath, List<XtabConfigBeanItem> data) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(data, "data");
        return new XtabConfigBean(filePath, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XtabConfigBean)) {
            return false;
        }
        XtabConfigBean xtabConfigBean = (XtabConfigBean) other;
        return Intrinsics.areEqual(this.filePath, xtabConfigBean.filePath) && Intrinsics.areEqual(this.data, xtabConfigBean.data);
    }

    public int hashCode() {
        return (this.filePath.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "XtabConfigBean(filePath=" + this.filePath + ", data=" + this.data + Separators.RPAREN;
    }

    public XtabConfigBean(String filePath, List<XtabConfigBeanItem> data) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(data, "data");
        this.filePath = filePath;
        this.data = data;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final List<XtabConfigBeanItem> getData() {
        return this.data;
    }
}
