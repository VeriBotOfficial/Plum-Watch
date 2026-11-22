package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class PoiDetailSearchResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiDetailSearchResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<PoiDetailInfo> f8092a;

    static class a implements Parcelable.Creator<PoiDetailSearchResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailSearchResult createFromParcel(Parcel parcel) {
            return new PoiDetailSearchResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailSearchResult[] newArray(int i) {
            return new PoiDetailSearchResult[i];
        }
    }

    public PoiDetailSearchResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PoiDetailInfo> getPoiDetailInfoList() {
        return this.f8092a;
    }

    public void setPoiDetailInfoList(List<PoiDetailInfo> list) {
        this.f8092a = list;
    }

    public String toString() {
        List<PoiDetailInfo> list = this.f8092a;
        if (list == null || list.isEmpty()) {
            return "PoiDetailSearchResult is null";
        }
        StringBuffer stringBuffer = new StringBuffer("PoiDetailSearchResult:");
        for (int i = 0; i < this.f8092a.size(); i++) {
            stringBuffer.append(" ").append(i).append(" ");
            PoiDetailInfo poiDetailInfo = this.f8092a.get(i);
            if (poiDetailInfo != null) {
                stringBuffer.append(poiDetailInfo.toString());
            } else {
                stringBuffer.append(AbstractJsonLexerKt.NULL);
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f8092a);
    }

    public PoiDetailSearchResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    protected PoiDetailSearchResult(Parcel parcel) {
        super(parcel);
        this.f8092a = parcel.createTypedArrayList(PoiDetailInfo.CREATOR);
    }
}
