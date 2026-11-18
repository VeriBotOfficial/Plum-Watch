package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: LegLinked.java */
/* JADX INFO: loaded from: classes15.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0449a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8082a;
    private int b;

    /* JADX INFO: renamed from: com.baidu.mapapi.search.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LegLinked.java */
    static class C0449a implements Parcelable.Creator<a> {
        C0449a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int r1) {
            return new a[r1];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f8082a);
        parcel.writeInt(this.b);
    }

    public void a(int r1) {
        this.f8082a = r1;
    }

    public void b(int r1) {
        this.b = r1;
    }

    protected a(Parcel parcel) {
        this.f8082a = -1;
        this.b = -1;
        this.f8082a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
