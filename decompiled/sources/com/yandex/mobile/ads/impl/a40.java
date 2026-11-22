package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class a40 implements Parcelable {
    public static final Parcelable.Creator<a40> CREATOR = new a();
    public final String b;
    public final Uri c;
    public final String d;
    public final List<w22> e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    final class a implements Parcelable.Creator<a40> {
        @Override // android.os.Parcelable.Creator
        public final a40 createFromParcel(Parcel parcel) {
            return new a40(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a40[] newArray(int i) {
            return new a40[i];
        }

        a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14970a;
        private final Uri b;
        private String c;
        private List<w22> d;
        private byte[] e;
        private String f;
        private byte[] g;

        public b(Uri uri, String str) {
            this.f14970a = str;
            this.b = uri;
        }

        public final b b(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        public final a40 a() {
            String str = this.f14970a;
            Uri uri = this.b;
            String str2 = this.c;
            List list = this.d;
            if (list == null) {
                list = kk0.h();
            }
            return new a40(str, uri, str2, list, this.e, this.f, this.g);
        }

        public final b b(String str) {
            this.c = str;
            return this;
        }

        public final b a(String str) {
            this.f = str;
            return this;
        }

        public final b a(byte[] bArr) {
            this.g = bArr;
            return this;
        }

        public final b a(ArrayList arrayList) {
            this.d = arrayList;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.d + ":" + this.b;
    }

    a40(Parcel parcel) {
        this.b = (String) f92.a(parcel.readString());
        this.c = Uri.parse((String) f92.a(parcel.readString()));
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((w22) parcel.readParcelable(w22.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = (byte[]) f92.a(parcel.createByteArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public final a40 a(a40 a40Var) {
        List emptyList;
        if (this.b.equals(a40Var.b)) {
            if (!this.e.isEmpty() && !a40Var.e.isEmpty()) {
                emptyList = new ArrayList(this.e);
                for (int i = 0; i < a40Var.e.size(); i++) {
                    w22 w22Var = a40Var.e.get(i);
                    if (!emptyList.contains(w22Var)) {
                        emptyList.add(w22Var);
                    }
                }
            } else {
                emptyList = Collections.emptyList();
            }
            return new a40(this.b, a40Var.c, a40Var.d, emptyList, a40Var.f, a40Var.g, a40Var.h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a40)) {
            return false;
        }
        a40 a40Var = (a40) obj;
        return this.b.equals(a40Var.b) && this.c.equals(a40Var.c) && f92.a(this.d, a40Var.d) && this.e.equals(a40Var.e) && Arrays.equals(this.f, a40Var.f) && f92.a(this.g, a40Var.g) && Arrays.equals(this.h, a40Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 961)) * 31;
        String str = this.d;
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.g;
        return Arrays.hashCode(this.h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        parcel.writeInt(this.e.size());
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            parcel.writeParcelable(this.e.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }

    private a40(String str, Uri uri, String str2, List<w22> list, byte[] bArr, String str3, byte[] bArr2) {
        int a2 = f92.a(uri, str2);
        if (a2 == 0 || a2 == 2 || a2 == 1) {
            hg.a("customCacheKey must be null for type: " + a2, str3 == null);
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : f92.f;
    }
}
