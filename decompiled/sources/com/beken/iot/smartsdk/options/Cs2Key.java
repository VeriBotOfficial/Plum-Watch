package com.beken.iot.smartsdk.options;

import com.beken.iot.smartsdk.core.thirdparty.cs2.DIDModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Params.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0013J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/beken/iot/smartsdk/options/Cs2Key;", "", "apiLicense", "", DIDModel.DID_KEY, "initString", "key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiLicense", "()Ljava/lang/String;", "getDid", "getInitString", "getKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isLegal", "toString", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Cs2Key {
    private final String apiLicense;
    private final String did;
    private final String initString;
    private final String key;

    public static /* synthetic */ Cs2Key copy$default(Cs2Key cs2Key, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cs2Key.apiLicense;
        }
        if ((i & 2) != 0) {
            str2 = cs2Key.did;
        }
        if ((i & 4) != 0) {
            str3 = cs2Key.initString;
        }
        if ((i & 8) != 0) {
            str4 = cs2Key.key;
        }
        return cs2Key.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApiLicense() {
        return this.apiLicense;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitString() {
        return this.initString;
    }

    /* renamed from: component4, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final Cs2Key copy(String apiLicense, String did, String initString, String key) {
        return new Cs2Key(apiLicense, did, initString, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cs2Key)) {
            return false;
        }
        Cs2Key cs2Key = (Cs2Key) other;
        return Intrinsics.areEqual(this.apiLicense, cs2Key.apiLicense) && Intrinsics.areEqual(this.did, cs2Key.did) && Intrinsics.areEqual(this.initString, cs2Key.initString) && Intrinsics.areEqual(this.key, cs2Key.key);
    }

    public int hashCode() {
        String str = this.apiLicense;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.did;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initString;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.key;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Cs2Key(apiLicense=" + this.apiLicense + ", did=" + this.did + ", initString=" + this.initString + ", key=" + this.key + ')';
    }

    public Cs2Key(String str, String str2, String str3, String str4) {
        this.apiLicense = str;
        this.did = str2;
        this.initString = str3;
        this.key = str4;
    }

    public final String getApiLicense() {
        return this.apiLicense;
    }

    public final String getDid() {
        return this.did;
    }

    public final String getInitString() {
        return this.initString;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean isLegal() {
        String str;
        String str2;
        String str3;
        String str4 = this.apiLicense;
        return (str4 == null || StringsKt.isBlank(str4) || (str = this.did) == null || StringsKt.isBlank(str) || (str2 = this.initString) == null || StringsKt.isBlank(str2) || (str3 = this.key) == null || StringsKt.isBlank(str3)) ? false : true;
    }
}
