package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public class CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2095a;
    private int b;
    private String c;
    private String d;
    private HashMap<String, String> e;
    private List<CloudImage> f;
    protected final LatLonPoint mPoint;
    protected final String mSnippet;
    protected final String mTitle;

    static class a implements Parcelable.Creator<CloudItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public CloudItem createFromParcel(Parcel parcel) {
            return new CloudItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CloudItem[] newArray(int i) {
            return new CloudItem[i];
        }
    }

    public CloudItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.b = -1;
        this.f2095a = str;
        this.mPoint = latLonPoint;
        this.mTitle = str2;
        this.mSnippet = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudItem)) {
            return false;
        }
        CloudItem cloudItem = (CloudItem) obj;
        String str = this.f2095a;
        if (str == null) {
            if (cloudItem.f2095a != null) {
                return false;
            }
        } else if (!str.equals(cloudItem.f2095a)) {
            return false;
        }
        return true;
    }

    public List<CloudImage> getCloudImage() {
        return this.f;
    }

    public String getCreatetime() {
        return this.c;
    }

    public HashMap<String, String> getCustomfield() {
        return this.e;
    }

    public int getDistance() {
        return this.b;
    }

    public String getID() {
        return this.f2095a;
    }

    public LatLonPoint getLatLonPoint() {
        return this.mPoint;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUpdatetime() {
        return this.d;
    }

    public int hashCode() {
        String str = this.f2095a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public void setCreatetime(String str) {
        this.c = str;
    }

    public void setCustomfield(HashMap<String, String> hashMap) {
        this.e = hashMap;
    }

    public void setDistance(int i) {
        this.b = i;
    }

    public void setUpdatetime(String str) {
        this.d = str;
    }

    public void setmCloudImage(List<CloudImage> list) {
        this.f = list;
    }

    public String toString() {
        return this.mTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2095a);
        parcel.writeInt(this.b);
        parcel.writeValue(this.mPoint);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSnippet);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeMap(this.e);
        parcel.writeList(this.f);
    }

    protected CloudItem(Parcel parcel) {
        this.b = -1;
        this.f2095a = parcel.readString();
        this.b = parcel.readInt();
        this.mPoint = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.mTitle = parcel.readString();
        this.mSnippet = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        HashMap<String, String> hashMap = new HashMap<>();
        this.e = hashMap;
        parcel.readMap(hashMap, HashMap.class.getClassLoader());
        List arrayList = new ArrayList();
        this.f = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
    }
}
