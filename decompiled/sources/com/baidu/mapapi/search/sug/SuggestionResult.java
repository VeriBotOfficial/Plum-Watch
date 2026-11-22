package com.baidu.mapapi.search.sug;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiChildrenInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class SuggestionResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<SuggestionResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<SuggestionInfo> f8177a;

    public static class SuggestionInfo implements Parcelable {
        public static final Parcelable.Creator<SuggestionInfo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f8178a;
        public String address;
        public String city;
        public String district;
        public String key;
        public List<PoiChildrenInfo> poiChildrenInfoList;
        public LatLng pt;
        public String tag;
        public String uid;

        static class a implements Parcelable.Creator<SuggestionInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SuggestionInfo createFromParcel(Parcel parcel) {
                return new SuggestionInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SuggestionInfo[] newArray(int i) {
                return new SuggestionInfo[i];
            }
        }

        public SuggestionInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getAdCode() {
            return this.f8178a;
        }

        public String getAddress() {
            return this.address;
        }

        public String getCity() {
            return this.city;
        }

        public String getDistrict() {
            return this.district;
        }

        public String getKey() {
            return this.key;
        }

        public List<PoiChildrenInfo> getPoiChildrenInfoList() {
            return this.poiChildrenInfoList;
        }

        public LatLng getPt() {
            return this.pt;
        }

        public String getTag() {
            return this.tag;
        }

        public String getUid() {
            return this.uid;
        }

        public void setAdCode(int i) {
            this.f8178a = i;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDistrict(String str) {
            this.district = str;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setPoiChildrenInfoList(List<PoiChildrenInfo> list) {
            this.poiChildrenInfoList = list;
        }

        public void setPt(LatLng latLng) {
            this.pt = latLng;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("SuggestionInfo: key = ");
            stringBuffer.append(this.key);
            stringBuffer.append("; city = ").append(this.city);
            stringBuffer.append("; district = ").append(this.district);
            stringBuffer.append("; pt = ");
            LatLng latLng = this.pt;
            if (latLng != null) {
                stringBuffer.append(latLng.toString());
            } else {
                stringBuffer.append(AbstractJsonLexerKt.NULL);
            }
            stringBuffer.append("; uid = ").append(this.uid);
            stringBuffer.append("; tag = ").append(this.tag);
            stringBuffer.append("; address = ").append(this.address);
            stringBuffer.append("; childrenInfo = ");
            List<PoiChildrenInfo> list = this.poiChildrenInfoList;
            if (list == null || list.isEmpty()) {
                stringBuffer.append(AbstractJsonLexerKt.NULL);
            } else {
                for (int i = 0; i < this.poiChildrenInfoList.size(); i++) {
                    stringBuffer.append(" ").append(i).append(" ");
                    PoiChildrenInfo poiChildrenInfo = this.poiChildrenInfoList.get(i);
                    if (poiChildrenInfo == null) {
                        stringBuffer.append(AbstractJsonLexerKt.NULL);
                    } else {
                        stringBuffer.append(poiChildrenInfo.toString());
                    }
                }
            }
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.city);
            parcel.writeString(this.district);
            parcel.writeParcelable(this.pt, i);
            parcel.writeString(this.uid);
            parcel.writeString(this.tag);
            parcel.writeString(this.address);
            parcel.writeTypedList(this.poiChildrenInfoList);
        }

        protected SuggestionInfo(Parcel parcel) {
            this.key = parcel.readString();
            this.city = parcel.readString();
            this.district = parcel.readString();
            this.pt = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.uid = parcel.readString();
            this.tag = parcel.readString();
            this.address = parcel.readString();
            this.poiChildrenInfoList = parcel.createTypedArrayList(PoiChildrenInfo.CREATOR);
        }
    }

    static class a implements Parcelable.Creator<SuggestionResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestionResult[] newArray(int i) {
            return new SuggestionResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestionResult createFromParcel(Parcel parcel) {
            return new SuggestionResult(parcel);
        }
    }

    public SuggestionResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<SuggestionInfo> getAllSuggestions() {
        return this.f8177a;
    }

    public void setSuggestionInfo(ArrayList<SuggestionInfo> arrayList) {
        this.f8177a = arrayList;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8177a);
    }

    public SuggestionResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    protected SuggestionResult(Parcel parcel) {
        this.f8177a = parcel.readArrayList(SuggestionInfo.class.getClassLoader());
    }
}
