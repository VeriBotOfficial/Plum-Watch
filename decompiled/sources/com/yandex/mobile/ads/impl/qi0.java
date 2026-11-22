package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.mw0;

/* loaded from: classes5.dex */
public final class qi0 implements k01.b {
    public static final Parcelable.Creator<qi0> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;

    final class a implements Parcelable.Creator<qi0> {
        @Override // android.os.Parcelable.Creator
        public final qi0 createFromParcel(Parcel parcel) {
            return new qi0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final qi0[] newArray(int i) {
            return new qi0[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.d + "\", genre=\"" + this.c + "\", bitrate=" + this.b + ", metadataInterval=" + this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.qi0 a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L34
            int r7 = r7 * 1000
            if (r7 <= 0) goto L23
            r1 = r4
            goto L3b
        L23:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L35
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.StringBuilder r1 = r8.append(r2)     // Catch: java.lang.NumberFormatException -> L35
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L35
            com.yandex.mobile.ads.impl.et0.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L35
            goto L3d
        L34:
            r7 = r6
        L35:
            java.lang.String r1 = "Invalid bitrate header: "
            com.yandex.mobile.ads.impl.rv0.a(r1, r2, r3)
            r1 = r5
        L3b:
            r9 = r7
            goto L3f
        L3d:
            r1 = r5
            r9 = r6
        L3f:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L53
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L54
        L53:
            r10 = r7
        L54:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L67
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L68
        L67:
            r11 = r7
        L68:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7b
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7c
        L7b:
            r12 = r7
        L7c:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L95
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L96
        L95:
            r13 = r5
        L96:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lc3
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lc0
            if (r2 <= 0) goto Lae
            r14 = r2
            goto Lc5
        Lae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbf
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.StringBuilder r4 = r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbf
            com.yandex.mobile.ads.impl.et0.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
            goto Lc3
        Lbf:
            r6 = r2
        Lc0:
            com.yandex.mobile.ads.impl.rv0.a(r0, r15, r3)
        Lc3:
            r4 = r1
            r14 = r6
        Lc5:
            if (r4 == 0) goto Lcd
            com.yandex.mobile.ads.impl.qi0 r8 = new com.yandex.mobile.ads.impl.qi0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7 = r8
        Lcd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qi0.a(java.util.Map):com.yandex.mobile.ads.impl.qi0");
    }

    public qi0(int i, String str, String str2, String str3, boolean z, int i2) {
        hg.a(i2 == -1 || i2 > 0);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qi0.class == obj.getClass()) {
            qi0 qi0Var = (qi0) obj;
            if (this.b == qi0Var.b && f92.a(this.c, qi0Var.c) && f92.a(this.d, qi0Var.d) && f92.a(this.e, qi0Var.e) && this.f == qi0Var.f && this.g == qi0Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b + 527) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        boolean z = this.f;
        int i2 = f92.f15466a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.g);
    }

    qi0(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = f92.a(parcel);
        this.g = parcel.readInt();
    }

    @Override // com.yandex.mobile.ads.impl.k01.b
    public final void a(mw0.a aVar) {
        String str = this.d;
        if (str != null) {
            aVar.h(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            aVar.g(str2);
        }
    }
}
