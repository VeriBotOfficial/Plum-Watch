package com.baidu.mapapi.search.building;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class BuildingResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BuildingResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<BuildingInfo> f8058a;
    private int b;
    private double c;

    static class a implements Parcelable.Creator<BuildingResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingResult createFromParcel(Parcel parcel) {
            return new BuildingResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingResult[] newArray(int i) {
            return new BuildingResult[i];
        }
    }

    public BuildingResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BuildingInfo> getBuildingList() {
        return this.f8058a;
    }

    public double getDistance() {
        return this.c;
    }

    public int getRelation() {
        return this.b;
    }

    public void setBuildingList(List<BuildingInfo> list) {
        this.f8058a = list;
    }

    public void setDistance(double d) {
        this.c = d;
    }

    public void setRelation(int i) {
        this.b = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BuidingResult: ");
        List<BuildingInfo> list = this.f8058a;
        if (list == null || list.isEmpty()) {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        } else {
            for (int i = 0; i < this.f8058a.size(); i++) {
                stringBuffer.append(" ").append(i).append(" ");
                BuildingInfo buildingInfo = this.f8058a.get(i);
                if (buildingInfo == null) {
                    stringBuffer.append(AbstractJsonLexerKt.NULL);
                } else {
                    stringBuffer.append(buildingInfo.toString());
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f8058a);
    }

    protected BuildingResult(Parcel parcel) {
        this.f8058a = parcel.createTypedArrayList(BuildingInfo.CREATOR);
    }
}
