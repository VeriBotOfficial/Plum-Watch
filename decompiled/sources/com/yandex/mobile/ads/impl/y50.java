package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.k01;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class y50 implements k01.b {
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    private int g;
    private static final jc0 h = new jc0.a().e("application/id3").a();
    private static final jc0 i = new jc0.a().e("application/x-scte35").a();
    public static final Parcelable.Creator<y50> CREATOR = new a();

    final class a implements Parcelable.Creator<y50> {
        @Override // android.os.Parcelable.Creator
        public final y50 createFromParcel(Parcel parcel) {
            return new y50(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final y50[] newArray(int i) {
            return new y50[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.e + ", durationMs=" + this.d + ", value=" + this.c;
    }

    y50(Parcel parcel) {
        this.b = (String) f92.a(parcel.readString());
        this.c = (String) f92.a(parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = (byte[]) f92.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.impl.k01.b
    public final jc0 a() {
        String str = this.b;
        str.getClass();
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.k01.b
    public final byte[] b() {
        if (a() != null) {
            return this.f;
        }
        return null;
    }

    public final int hashCode() {
        if (this.g == 0) {
            String str = this.b;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.d;
            int i2 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            this.g = Arrays.hashCode(this.f) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y50.class == obj.getClass()) {
            y50 y50Var = (y50) obj;
            if (this.d == y50Var.d && this.e == y50Var.e && f92.a(this.b, y50Var.b) && f92.a(this.c, y50Var.c) && Arrays.equals(this.f, y50Var.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }

    public y50(String str, String str2, long j, long j2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = bArr;
    }
}
