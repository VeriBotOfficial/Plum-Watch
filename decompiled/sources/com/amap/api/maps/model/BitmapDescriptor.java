package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.t4;

/* loaded from: classes11.dex */
public final class BitmapDescriptor implements Parcelable, Cloneable {
    public static final BitmapDescriptorCreator CREATOR = new BitmapDescriptorCreator();

    /* renamed from: a, reason: collision with root package name */
    int f2041a;
    int b;
    protected Object mBitmap;
    private String mId;

    BitmapDescriptor(Bitmap bitmap, String str) {
        this.f2041a = 0;
        this.b = 0;
        if (bitmap != null) {
            try {
                this.f2041a = bitmap.getWidth();
                this.b = bitmap.getHeight();
                if (bitmap.getConfig() == null) {
                    this.mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                } else {
                    this.mBitmap = bitmap.copy(bitmap.getConfig(), true);
                }
            } catch (Throwable th) {
                t4.a(th);
                return;
            }
        }
        this.mId = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        BitmapDescriptor bitmapDescriptor;
        Object obj2;
        Object obj3 = this.mBitmap;
        if (obj3 == null || ((Bitmap) obj3).isRecycled() || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (BitmapDescriptor.class == obj.getClass() && (obj2 = (bitmapDescriptor = (BitmapDescriptor) obj).mBitmap) != null && !((Bitmap) obj2).isRecycled() && this.f2041a == bitmapDescriptor.getWidth() && this.b == bitmapDescriptor.getHeight()) {
            try {
                return ((Bitmap) this.mBitmap).sameAs((Bitmap) bitmapDescriptor.mBitmap);
            } catch (Throwable th) {
                t4.a(th);
            }
        }
        return false;
    }

    public Bitmap getBitmap() {
        return (Bitmap) this.mBitmap;
    }

    public int getHeight() {
        return this.b;
    }

    public String getId() {
        return this.mId;
    }

    public int getWidth() {
        return this.f2041a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void recycle() {
        try {
            t4.a((Bitmap) this.mBitmap);
        } catch (Throwable th) {
            t4.a(th);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable((Bitmap) this.mBitmap, i);
        parcel.writeInt(this.f2041a);
        parcel.writeInt(this.b);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitmapDescriptor m6873clone() {
        try {
            Object obj = this.mBitmap;
            return new BitmapDescriptor(((Bitmap) obj).copy(((Bitmap) obj).getConfig(), true), this.f2041a, this.b, this.mId);
        } catch (Throwable th) {
            th.printStackTrace();
            t4.a(th);
            return null;
        }
    }

    private BitmapDescriptor(Bitmap bitmap, int i, int i2, String str) {
        this.f2041a = i;
        this.b = i2;
        this.mBitmap = bitmap;
        this.mId = str;
    }
}
