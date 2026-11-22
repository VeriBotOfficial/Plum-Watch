package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class PoiFilter implements Parcelable {
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    /* renamed from: a, reason: collision with root package name */
    private static Map<SortName, String> f8093a = new HashMap();
    public static final Parcelable.Creator<PoiFilter> CREATOR = new a();

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8094a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        public Builder() {
            PoiFilter.f8093a.put(SortName.HotelSortName.DEFAULT, "default");
            PoiFilter.f8093a.put(SortName.HotelSortName.HOTEL_LEVEL, "level");
            PoiFilter.f8093a.put(SortName.HotelSortName.HOTEL_PRICE, "price");
            PoiFilter.f8093a.put(SortName.HotelSortName.HOTEL_DISTANCE, "distance");
            PoiFilter.f8093a.put(SortName.HotelSortName.HOTEL_HEALTH_SCORE, "health_score");
            PoiFilter.f8093a.put(SortName.HotelSortName.HOTEL_TOTAL_SCORE, "total_score");
            PoiFilter.f8093a.put(SortName.CaterSortName.DEFAULT, "default");
            PoiFilter.f8093a.put(SortName.CaterSortName.CATER_DISTANCE, "distance");
            PoiFilter.f8093a.put(SortName.CaterSortName.CATER_PRICE, "price");
            PoiFilter.f8093a.put(SortName.CaterSortName.CATER_OVERALL_RATING, "overall_rating");
            PoiFilter.f8093a.put(SortName.CaterSortName.CATER_SERVICE_RATING, "service_rating");
            PoiFilter.f8093a.put(SortName.CaterSortName.CATER_TASTE_RATING, "taste_rating");
            PoiFilter.f8093a.put(SortName.LifeSortName.DEFAULT, "default");
            PoiFilter.f8093a.put(SortName.LifeSortName.PRICE, "price");
            PoiFilter.f8093a.put(SortName.LifeSortName.LIFE_COMMENT_RATING, "comment_num");
            PoiFilter.f8093a.put(SortName.LifeSortName.LIFE_OVERALL_RATING, "overall_rating");
            PoiFilter.f8093a.put(SortName.LifeSortName.DISTANCE, "distance");
        }

        public PoiFilter build() {
            return new PoiFilter(this.f8094a, this.b, this.c, this.e, this.d, this.f);
        }

        public Builder industryType(IndustryType industryType) {
            int i = b.f8099a[industryType.ordinal()];
            if (i == 1) {
                this.f8094a = "hotel";
                return this;
            }
            if (i == 2) {
                this.f8094a = "cater";
                return this;
            }
            if (i != 3) {
                this.f8094a = "";
                return this;
            }
            this.f8094a = "life";
            return this;
        }

        public Builder isDiscount(boolean z) {
            if (z) {
                this.e = "1";
                return this;
            }
            this.e = "0";
            return this;
        }

        public Builder isGroupon(boolean z) {
            if (z) {
                this.d = "1";
                return this;
            }
            this.d = "0";
            return this;
        }

        public Builder priceSection(String str) {
            this.f = str;
            return this;
        }

        public Builder sortName(SortName sortName) {
            if (sortName != null) {
                this.b = (String) PoiFilter.f8093a.get(sortName);
            }
            return this;
        }

        public Builder sortRule(int i) {
            this.c = i + "";
            return this;
        }
    }

    public enum IndustryType {
        HOTEL,
        CATER,
        LIFE
    }

    public interface SortName {

        public enum CaterSortName implements SortName {
            DEFAULT,
            CATER_PRICE,
            CATER_DISTANCE,
            CATER_TASTE_RATING,
            CATER_OVERALL_RATING,
            CATER_SERVICE_RATING
        }

        public enum HotelSortName implements SortName {
            DEFAULT,
            HOTEL_PRICE,
            HOTEL_DISTANCE,
            HOTEL_TOTAL_SCORE,
            HOTEL_LEVEL,
            HOTEL_HEALTH_SCORE
        }

        public enum LifeSortName implements SortName {
            DEFAULT,
            PRICE,
            DISTANCE,
            LIFE_OVERALL_RATING,
            LIFE_COMMENT_RATING
        }
    }

    static class a implements Parcelable.Creator<PoiFilter> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiFilter createFromParcel(Parcel parcel) {
            return new PoiFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiFilter[] newArray(int i) {
            return new PoiFilter[i];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8099a;

        static {
            int[] iArr = new int[IndustryType.values().length];
            f8099a = iArr;
            try {
                iArr[IndustryType.HOTEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8099a[IndustryType.CATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8099a[IndustryType.LIFE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    PoiFilter(String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.e = str5;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            sb.append("industry_type:");
            sb.append(this.b);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(this.c)) {
            sb.append("sort_name:");
            sb.append(this.c);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(this.d)) {
            sb.append("sort_rule:");
            sb.append(this.d);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(this.f)) {
            sb.append("discount:");
            sb.append(this.f);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(this.e)) {
            sb.append("groupon:");
            sb.append(this.e);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(this.g)) {
            sb.append("price_section:");
            sb.append(this.g);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeString(this.e);
        parcel.writeString(this.g);
    }

    protected PoiFilter(Parcel parcel) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.e = parcel.readString();
        this.g = parcel.readString();
    }
}
