package com.wakeup.commponent.module.device.work;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NaviSearchBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/wakeup/commponent/module/device/work/NaviSearchBean;", "", "latLng", "Lcom/baidu/mapapi/model/LatLng;", "name", "", Const.JSON_KEY_ADDRESS, "poiId", "<init>", "(Lcom/baidu/mapapi/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLatLng", "()Lcom/baidu/mapapi/model/LatLng;", "getName", "()Ljava/lang/String;", "getAddress", "getPoiId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviSearchBean {
    private final String address;
    private final LatLng latLng;
    private final String name;
    private final String poiId;

    public static /* synthetic */ NaviSearchBean copy$default(NaviSearchBean naviSearchBean, LatLng latLng, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            latLng = naviSearchBean.latLng;
        }
        if ((i & 2) != 0) {
            str = naviSearchBean.name;
        }
        if ((i & 4) != 0) {
            str2 = naviSearchBean.address;
        }
        if ((i & 8) != 0) {
            str3 = naviSearchBean.poiId;
        }
        return naviSearchBean.copy(latLng, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final LatLng getLatLng() {
        return this.latLng;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPoiId() {
        return this.poiId;
    }

    public final NaviSearchBean copy(LatLng latLng, String name, String address, String poiId) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(poiId, "poiId");
        return new NaviSearchBean(latLng, name, address, poiId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviSearchBean)) {
            return false;
        }
        NaviSearchBean naviSearchBean = (NaviSearchBean) other;
        return Intrinsics.areEqual(this.latLng, naviSearchBean.latLng) && Intrinsics.areEqual(this.name, naviSearchBean.name) && Intrinsics.areEqual(this.address, naviSearchBean.address) && Intrinsics.areEqual(this.poiId, naviSearchBean.poiId);
    }

    public int hashCode() {
        return (((((this.latLng.hashCode() * 31) + this.name.hashCode()) * 31) + this.address.hashCode()) * 31) + this.poiId.hashCode();
    }

    public String toString() {
        return "NaviSearchBean(latLng=" + this.latLng + ", name=" + this.name + ", address=" + this.address + ", poiId=" + this.poiId + Separators.RPAREN;
    }

    public NaviSearchBean(LatLng latLng, String name, String address, String poiId) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(poiId, "poiId");
        this.latLng = latLng;
        this.name = name;
        this.address = address;
        this.poiId = poiId;
    }

    public final LatLng getLatLng() {
        return this.latLng;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getPoiId() {
        return this.poiId;
    }
}
