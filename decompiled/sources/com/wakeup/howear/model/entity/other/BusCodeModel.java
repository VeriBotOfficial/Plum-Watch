package com.wakeup.howear.model.entity.other;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusCodeModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006#"}, d2 = {"Lcom/wakeup/howear/model/entity/other/BusCodeModel;", "", "method", "", "id", "", "params", "Lcom/wakeup/howear/model/entity/other/BusCodeParams;", "version", "<init>", "(Ljava/lang/String;ILcom/wakeup/howear/model/entity/other/BusCodeParams;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getParams", "()Lcom/wakeup/howear/model/entity/other/BusCodeParams;", "setParams", "(Lcom/wakeup/howear/model/entity/other/BusCodeParams;)V", MobileAdsBridge.versionMethodName, "setVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BusCodeModel {
    private int id;
    private String method;
    private BusCodeParams params;
    private String version;

    public static /* synthetic */ BusCodeModel copy$default(BusCodeModel busCodeModel, String str, int i, BusCodeParams busCodeParams, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = busCodeModel.method;
        }
        if ((i2 & 2) != 0) {
            i = busCodeModel.id;
        }
        if ((i2 & 4) != 0) {
            busCodeParams = busCodeModel.params;
        }
        if ((i2 & 8) != 0) {
            str2 = busCodeModel.version;
        }
        return busCodeModel.copy(str, i, busCodeParams, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final BusCodeParams getParams() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final BusCodeModel copy(String method, int id2, BusCodeParams params, String version) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(version, "version");
        return new BusCodeModel(method, id2, params, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusCodeModel)) {
            return false;
        }
        BusCodeModel busCodeModel = (BusCodeModel) other;
        return Intrinsics.areEqual(this.method, busCodeModel.method) && this.id == busCodeModel.id && Intrinsics.areEqual(this.params, busCodeModel.params) && Intrinsics.areEqual(this.version, busCodeModel.version);
    }

    public int hashCode() {
        return (((((this.method.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + this.params.hashCode()) * 31) + this.version.hashCode();
    }

    public String toString() {
        return "BusCodeModel(method=" + this.method + ", id=" + this.id + ", params=" + this.params + ", version=" + this.version + Separators.RPAREN;
    }

    public BusCodeModel(String method, int i, BusCodeParams params, String version) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(version, "version");
        this.method = method;
        this.id = i;
        this.params = params;
        this.version = version;
    }

    public final String getMethod() {
        return this.method;
    }

    public final void setMethod(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.method = str;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final BusCodeParams getParams() {
        return this.params;
    }

    public final void setParams(BusCodeParams busCodeParams) {
        Intrinsics.checkNotNullParameter(busCodeParams, "<set-?>");
        this.params = busCodeParams;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }
}
