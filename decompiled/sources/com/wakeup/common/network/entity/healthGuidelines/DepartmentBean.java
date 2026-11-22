package com.wakeup.common.network.entity.healthGuidelines;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepartmentBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/healthGuidelines/DepartmentBean;", "", "id", "", "hospitalName", "", "departmentName", "icon", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getHospitalName", "()Ljava/lang/String;", "setHospitalName", "(Ljava/lang/String;)V", "getDepartmentName", "setDepartmentName", "getIcon", "setIcon", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DepartmentBean {
    private String departmentName;
    private String hospitalName;
    private String icon;
    private long id;

    public static /* synthetic */ DepartmentBean copy$default(DepartmentBean departmentBean, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = departmentBean.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = departmentBean.hospitalName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = departmentBean.departmentName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = departmentBean.icon;
        }
        return departmentBean.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHospitalName() {
        return this.hospitalName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDepartmentName() {
        return this.departmentName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final DepartmentBean copy(long id2, String hospitalName, String departmentName, String icon) {
        Intrinsics.checkNotNullParameter(hospitalName, "hospitalName");
        Intrinsics.checkNotNullParameter(departmentName, "departmentName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new DepartmentBean(id2, hospitalName, departmentName, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentBean)) {
            return false;
        }
        DepartmentBean departmentBean = (DepartmentBean) other;
        return this.id == departmentBean.id && Intrinsics.areEqual(this.hospitalName, departmentBean.hospitalName) && Intrinsics.areEqual(this.departmentName, departmentBean.departmentName) && Intrinsics.areEqual(this.icon, departmentBean.icon);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.hospitalName.hashCode()) * 31) + this.departmentName.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "DepartmentBean(id=" + this.id + ", hospitalName=" + this.hospitalName + ", departmentName=" + this.departmentName + ", icon=" + this.icon + Separators.RPAREN;
    }

    public DepartmentBean(long j, String hospitalName, String departmentName, String icon) {
        Intrinsics.checkNotNullParameter(hospitalName, "hospitalName");
        Intrinsics.checkNotNullParameter(departmentName, "departmentName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = j;
        this.hospitalName = hospitalName;
        this.departmentName = departmentName;
        this.icon = icon;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getHospitalName() {
        return this.hospitalName;
    }

    public final void setHospitalName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hospitalName = str;
    }

    public final String getDepartmentName() {
        return this.departmentName;
    }

    public final void setDepartmentName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.departmentName = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }
}
