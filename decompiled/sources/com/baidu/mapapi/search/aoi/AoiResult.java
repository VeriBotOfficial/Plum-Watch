package com.baidu.mapapi.search.aoi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.AoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class AoiResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<AoiResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<AoiInfo> f8056a;

    static class a implements Parcelable.Creator<AoiResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiResult createFromParcel(Parcel parcel) {
            return new AoiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiResult[] newArray(int i) {
            return new AoiResult[i];
        }
    }

    public AoiResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AoiInfo> getAoiList() {
        return this.f8056a;
    }

    public void setAoiList(List<AoiInfo> list) {
        this.f8056a = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiResult: ");
        List<AoiInfo> list = this.f8056a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        } else {
            for (int i = 0; i < this.f8056a.size(); i++) {
                stringBuffer.append(" ").append(i).append(" ");
                AoiInfo aoiInfo = this.f8056a.get(i);
                if (aoiInfo == null) {
                    stringBuffer.append(AbstractJsonLexerKt.NULL);
                } else {
                    stringBuffer.append(aoiInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f8056a);
    }

    protected AoiResult(Parcel parcel) {
        this.f8056a = parcel.createTypedArrayList(AoiInfo.CREATOR);
    }
}
