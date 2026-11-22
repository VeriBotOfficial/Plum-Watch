package com.amap.api.col.p0003sl;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.BaseOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContourLineOptions.java */
/* loaded from: classes11.dex */
public class m5 extends BaseOptions implements Parcelable {
    public static final Parcelable.Creator<m5> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private float f1766a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private int g;
    private double h;
    private List<l5> i;

    /* compiled from: ContourLineOptions.java */
    static class a implements Parcelable.Creator<m5> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public m5 createFromParcel(Parcel parcel) {
            return new m5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public m5[] newArray(int i) {
            return new m5[i];
        }
    }

    protected m5(Parcel parcel) {
        this.f1766a = 3.0f;
        this.b = 20.0f;
        this.c = Float.MIN_VALUE;
        this.d = Float.MAX_VALUE;
        this.e = 200.0f;
        this.f = true;
        this.g = -3355444;
        this.h = 3.0d;
        this.i = new ArrayList();
        this.f1766a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = parcel.readInt();
        this.h = parcel.readDouble();
        this.i = parcel.readArrayList(l5.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f1766a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeBooleanArray(new boolean[]{this.f});
        parcel.writeInt(this.g);
        parcel.writeDouble(this.h);
        parcel.writeList(this.i);
    }
}
