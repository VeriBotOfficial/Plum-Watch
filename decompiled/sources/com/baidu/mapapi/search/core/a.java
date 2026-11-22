package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: LegLinked.java */
/* loaded from: classes13.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0362a();

    /* renamed from: a, reason: collision with root package name */
    private int f8082a;
    private int b;

    /* compiled from: LegLinked.java */
    /* renamed from: com.baidu.mapapi.search.core.a$a, reason: collision with other inner class name */
    static class C0362a implements Parcelable.Creator<a> {
        C0362a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    }

    public a() {
        this.f8082a = -1;
        this.b = -1;
    }

    public int a() {
        return this.f8082a;
    }

    public int b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8082a);
        parcel.writeInt(this.b);
    }

    public void a(int i) {
        this.f8082a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    protected a(Parcel parcel) {
        this.f8082a = -1;
        this.b = -1;
        this.f8082a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
