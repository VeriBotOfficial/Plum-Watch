package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class TimeInfosElement implements Parcelable {
    public static final Parcelable.Creator<TimeInfosElement> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    int f2203a;
    float b;
    float c;
    int d;
    private List<TMC> e;

    static class a implements Parcelable.Creator<TimeInfosElement> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TimeInfosElement createFromParcel(Parcel parcel) {
            return new TimeInfosElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeInfosElement[] newArray(int i) {
            return null;
        }
    }

    public TimeInfosElement(Parcel parcel) {
        this.e = new ArrayList();
        this.f2203a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDuration() {
        return this.b;
    }

    public int getPathindex() {
        return this.f2203a;
    }

    public int getRestriction() {
        return this.d;
    }

    public List<TMC> getTMCs() {
        return this.e;
    }

    public float getTolls() {
        return this.c;
    }

    public void setDuration(float f) {
        this.b = f;
    }

    public void setPathindex(int i) {
        this.f2203a = i;
    }

    public void setRestriction(int i) {
        this.d = i;
    }

    public void setTMCs(List<TMC> list) {
        this.e = list;
    }

    public void setTolls(float f) {
        this.c = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2203a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
    }

    public TimeInfosElement() {
        this.e = new ArrayList();
    }
}
