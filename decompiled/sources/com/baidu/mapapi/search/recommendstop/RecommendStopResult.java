package com.baidu.mapapi.search.recommendstop;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RecommendStationStopInfo;
import com.baidu.mapapi.search.core.RecommendStopInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class RecommendStopResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<RecommendStopResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<RecommendStopInfo> f8150a;
    private List<RecommendStationStopInfo> b;

    static class a implements Parcelable.Creator<RecommendStopResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopResult createFromParcel(Parcel parcel) {
            return new RecommendStopResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopResult[] newArray(int i) {
            return new RecommendStopResult[i];
        }
    }

    public RecommendStopResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RecommendStopInfo> getRecommendStopInfoList() {
        return this.f8150a;
    }

    public List<RecommendStationStopInfo> getStationInfoList() {
        return this.b;
    }

    public void setRecommendStopInfoList(List<RecommendStopInfo> list) {
        this.f8150a = list;
    }

    public void setStationInfoList(List<RecommendStationStopInfo> list) {
        this.b = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RecommendStopResult: ");
        List<RecommendStopInfo> list = this.f8150a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        } else {
            for (int i = 0; i < this.f8150a.size(); i++) {
                stringBuffer.append(" ").append(i).append(" ");
                RecommendStopInfo recommendStopInfo = this.f8150a.get(i);
                if (recommendStopInfo == null) {
                    stringBuffer.append(AbstractJsonLexerKt.NULL);
                } else {
                    stringBuffer.append(recommendStopInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f8150a);
    }

    protected RecommendStopResult(Parcel parcel) {
        super(parcel);
        this.f8150a = parcel.createTypedArrayList(RecommendStopInfo.CREATOR);
    }
}
