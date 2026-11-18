package com.baidu.ar;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class f4 implements Parcelable {
    public static final Parcelable.Creator<f4> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6921a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;

    public class a implements Parcelable.Creator<f4> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f4 createFromParcel(Parcel parcel) {
            f4 f4Var = new f4();
            f4Var.f6921a = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.b = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.c = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.d = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.e = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.f = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.g = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.h = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.i = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.j = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.k = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.l = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.m = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.n = (String) parcel.readValue(String.class.getClassLoader());
            f4Var.o = (String) parcel.readValue(String.class.getClassLoader());
            return f4Var;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f4[] newArray(int r1) {
            return new f4[r1];
        }
    }

    public String a() {
        return this.f6921a;
    }

    public void a(String str) {
        this.f6921a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.l = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(String str) {
        this.f = str;
    }

    public void h(String str) {
        this.g = str;
    }

    public void i(String str) {
        this.n = str;
    }

    public void j(String str) {
        this.m = str;
    }

    public void k(String str) {
        this.o = str;
    }

    public void l(String str) {
        this.h = str;
    }

    public void m(String str) {
        this.i = str;
    }

    public void n(String str) {
        this.j = str;
    }

    public void o(String str) {
        this.k = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeValue(this.f6921a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
        parcel.writeValue(this.g);
        parcel.writeValue(this.h);
        parcel.writeValue(this.i);
        parcel.writeValue(this.j);
        parcel.writeValue(this.k);
        parcel.writeValue(this.l);
        parcel.writeValue(this.m);
        parcel.writeValue(this.n);
        parcel.writeValue(this.o);
    }
}
