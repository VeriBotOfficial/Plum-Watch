package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class rq1 implements Parcelable {
    public static final Parcelable.Creator<rq1> CREATOR = new a();
    private final int b;

    final class a implements Parcelable.Creator<rq1> {
        @Override // android.os.Parcelable.Creator
        public final rq1 createFromParcel(Parcel parcel) {
            return new rq1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final rq1[] newArray(int i) {
            return new rq1[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2.hasCapability(16) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6.e()
            r1 = 2
            if (r0 != 0) goto L8
            goto L48
        L8:
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r7.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()
            if (r2 == 0) goto L4a
            boolean r2 = r2.isConnected()
            if (r2 == 0) goto L4a
            int r2 = com.yandex.mobile.ads.impl.f92.f15466a
            r3 = 24
            if (r2 >= r3) goto L26
            goto L3b
        L26:
            android.net.Network r2 = r0.getActiveNetwork()
            if (r2 != 0) goto L2d
            goto L4a
        L2d:
            android.net.NetworkCapabilities r2 = r0.getNetworkCapabilities(r2)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
            r3 = 16
            boolean r2 = r2.hasCapability(r3)     // Catch: java.lang.SecurityException -> L3b
            if (r2 == 0) goto L4a
        L3b:
            int r2 = r6.b
            r2 = r2 & r1
            if (r2 == 0) goto L48
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L48
            r0 = r1
            goto L4e
        L48:
            r0 = 0
            goto L4e
        L4a:
            int r0 = r6.b
            r0 = r0 & 3
        L4e:
            boolean r2 = r6.c()
            r3 = 0
            if (r2 == 0) goto L72
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r4)
            android.content.Intent r2 = r7.registerReceiver(r3, r2)
            if (r2 != 0) goto L63
            goto L70
        L63:
            java.lang.String r4 = "status"
            r5 = -1
            int r2 = r2.getIntExtra(r4, r5)
            if (r2 == r1) goto L72
            r1 = 5
            if (r2 != r1) goto L70
            goto L72
        L70:
            r0 = r0 | 8
        L72:
            boolean r1 = r6.d()
            if (r1 == 0) goto La4
            java.lang.String r1 = "power"
            java.lang.Object r1 = r7.getSystemService(r1)
            r1.getClass()
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            int r2 = com.yandex.mobile.ads.impl.f92.f15466a
            r4 = 23
            if (r2 < r4) goto L90
            boolean r1 = r1.isDeviceIdleMode()
            if (r1 != 0) goto La4
            goto La2
        L90:
            r4 = 20
            if (r2 < r4) goto L9b
            boolean r1 = r1.isInteractive()
            if (r1 != 0) goto La2
            goto La4
        L9b:
            boolean r1 = r1.isScreenOn()
            if (r1 != 0) goto La2
            goto La4
        La2:
            r0 = r0 | 4
        La4:
            boolean r1 = r6.f()
            if (r1 == 0) goto Lba
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r2)
            android.content.Intent r7 = r7.registerReceiver(r3, r1)
            if (r7 != 0) goto Lb8
            goto Lba
        Lb8:
            r0 = r0 | 16
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rq1.a(android.content.Context):int");
    }

    public rq1(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    public final boolean e() {
        return (this.b & 1) != 0;
    }

    public final boolean c() {
        return (this.b & 8) != 0;
    }

    public final boolean d() {
        return (this.b & 4) != 0;
    }

    public final boolean f() {
        return (this.b & 16) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rq1.class == obj.getClass() && this.b == ((rq1) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
