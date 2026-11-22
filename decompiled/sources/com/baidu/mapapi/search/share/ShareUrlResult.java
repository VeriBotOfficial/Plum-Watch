package com.baidu.mapapi.search.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: classes13.dex */
public class ShareUrlResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<ShareUrlResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f8175a;
    private int b;

    static class a implements Parcelable.Creator<ShareUrlResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareUrlResult createFromParcel(Parcel parcel) {
            return new ShareUrlResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareUrlResult[] newArray(int i) {
            return new ShareUrlResult[i];
        }
    }

    public ShareUrlResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUrl() {
        return this.f8175a;
    }

    public void setType(int i) {
        this.b = i;
    }

    public void setUrl(String str) {
        this.f8175a = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8175a);
        parcel.writeInt(this.b);
    }

    protected ShareUrlResult(Parcel parcel) {
        this.f8175a = parcel.readString();
        this.b = parcel.readInt();
    }
}
