package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class PoiDetailInfo implements Parcelable {
    public static final Parcelable.Creator<PoiDetailInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f8067a;
    private LatLng b;
    public String brand;
    private String c;
    public int checkinNum;
    public int commentNum;
    private String d;
    public String detailUrl;
    public int discountNum;
    public int distance;
    private String e;
    public double environmentRating;
    private String f;
    public double facilityRating;
    public int favoriteNum;
    private int g;
    public int grouponNum;
    private String h;
    public double hygieneRating;
    private String i;
    public String image;
    public int imageNum;
    private String j;
    private int k;
    private List<PoiChildrenInfo> l;
    private List<String> m;
    private String n;
    public LatLng naviLocation;
    private boolean o;
    public double overallRating;
    private String p;
    public double price;

    /* renamed from: q, reason: collision with root package name */
    private String f8068q;
    public double serviceRating;
    public String shopHours;
    public String tag;
    public double tasteRating;
    public double technologyRating;
    public String type;

    static class a implements Parcelable.Creator<PoiDetailInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailInfo createFromParcel(Parcel parcel) {
            return new PoiDetailInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiDetailInfo[] newArray(int i) {
            return new PoiDetailInfo[i];
        }
    }

    public PoiDetailInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAdCode() {
        return this.g;
    }

    public String getAddress() {
        return this.c;
    }

    public String getArea() {
        return this.f;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCheckinNum() {
        return this.checkinNum;
    }

    public String getCity() {
        return this.e;
    }

    public int getCommentNum() {
        return this.commentNum;
    }

    public String getContentTag() {
        return this.p;
    }

    public int getDetail() {
        return this.k;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public int getDiscountNum() {
        return this.discountNum;
    }

    public int getDistance() {
        return this.distance;
    }

    public double getEnvironmentRating() {
        return this.environmentRating;
    }

    public double getFacilityRating() {
        return this.facilityRating;
    }

    public int getFavoriteNum() {
        return this.favoriteNum;
    }

    public int getGrouponNum() {
        return this.grouponNum;
    }

    public double getHygieneRating() {
        return this.hygieneRating;
    }

    public String getImage() {
        return this.image;
    }

    public int getImageNum() {
        return this.imageNum;
    }

    public String getLabel() {
        return this.f8068q;
    }

    public LatLng getLocation() {
        return this.b;
    }

    public String getName() {
        return this.f8067a;
    }

    public LatLng getNaviLocation() {
        return this.naviLocation;
    }

    public double getOverallRating() {
        return this.overallRating;
    }

    public List<String> getPhotos() {
        return this.m;
    }

    public List<PoiChildrenInfo> getPoiChildrenInfoList() {
        return this.l;
    }

    public double getPrice() {
        return this.price;
    }

    public String getProvince() {
        return this.d;
    }

    public double getServiceRating() {
        return this.serviceRating;
    }

    public String getShopHours() {
        return this.shopHours;
    }

    public String getStatus() {
        return this.n;
    }

    public String getStreetId() {
        return this.j;
    }

    public String getTag() {
        return this.tag;
    }

    public double getTasteRating() {
        return this.tasteRating;
    }

    public double getTechnologyRating() {
        return this.technologyRating;
    }

    public String getTelephone() {
        return this.h;
    }

    public String getType() {
        return this.type;
    }

    public String getUid() {
        return this.i;
    }

    public boolean isDefaultImage() {
        return this.o;
    }

    public void setAdCode(int i) {
        this.g = i;
    }

    public void setAddress(String str) {
        this.c = str;
    }

    public void setArea(String str) {
        this.f = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCheckinNum(int i) {
        this.checkinNum = i;
    }

    public void setCity(String str) {
        this.e = str;
    }

    public void setCommentNum(int i) {
        this.commentNum = i;
    }

    public void setContentTag(String str) {
        this.p = str;
    }

    public void setDetail(String str) {
        try {
            this.k = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            this.k = 0;
        }
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setDiscountNum(int i) {
        this.discountNum = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setEnvironmentRating(double d) {
        this.environmentRating = d;
    }

    public void setFacilityRating(double d) {
        this.facilityRating = d;
    }

    public void setFavoriteNum(int i) {
        this.favoriteNum = i;
    }

    public void setGrouponNum(int i) {
        this.grouponNum = i;
    }

    public void setHygieneRating(double d) {
        this.hygieneRating = d;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setImageNum(int i) {
        this.imageNum = i;
    }

    public void setIsDefaultImage(boolean z) {
        this.o = z;
    }

    public void setLabel(String str) {
        this.f8068q = str;
    }

    public void setLocation(LatLng latLng) {
        this.b = latLng;
    }

    public void setName(String str) {
        this.f8067a = str;
    }

    public void setNaviLocation(LatLng latLng) {
        this.naviLocation = latLng;
    }

    public void setOverallRating(double d) {
        this.overallRating = d;
    }

    public void setPhotos(List<String> list) {
        this.m = list;
    }

    public void setPoiChildrenInfoList(List<PoiChildrenInfo> list) {
        this.l = list;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setProvince(String str) {
        this.d = str;
    }

    public void setServiceRating(double d) {
        this.serviceRating = d;
    }

    public void setShopHours(String str) {
        this.shopHours = str;
    }

    public void setStatus(String str) {
        this.n = str;
    }

    public void setStreetId(String str) {
        this.j = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTasteRating(double d) {
        this.tasteRating = d;
    }

    public void setTechnologyRating(double d) {
        this.technologyRating = d;
    }

    public void setTelephone(String str) {
        this.h = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUid(String str) {
        this.i = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PoiDetailInfo: name = ");
        stringBuffer.append(this.f8067a);
        stringBuffer.append("; location = ");
        LatLng latLng = this.b;
        if (latLng != null) {
            stringBuffer.append(latLng.toString());
        } else {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        }
        stringBuffer.append("; address = ").append(this.c);
        stringBuffer.append("; province = ").append(this.d);
        stringBuffer.append("; city = ").append(this.e);
        stringBuffer.append("; area = ").append(this.f);
        stringBuffer.append("; telephone = ").append(this.h);
        stringBuffer.append("; uid = ").append(this.i);
        stringBuffer.append("; detail = ").append(this.k);
        stringBuffer.append("; distance = ").append(this.distance);
        stringBuffer.append("; type = ").append(this.type);
        stringBuffer.append("; tag = ").append(this.tag);
        stringBuffer.append("; naviLocation = ");
        LatLng latLng2 = this.naviLocation;
        if (latLng2 != null) {
            stringBuffer.append(latLng2.toString());
        } else {
            stringBuffer.append(AbstractJsonLexerKt.NULL);
        }
        stringBuffer.append("; detailUrl = ").append(this.detailUrl);
        stringBuffer.append("; price = ").append(this.price);
        stringBuffer.append("; shopHours = ").append(this.shopHours);
        stringBuffer.append("; overallRating = ").append(this.overallRating);
        stringBuffer.append("; tasteRating = ").append(this.tasteRating);
        stringBuffer.append("; serviceRating = ").append(this.serviceRating);
        stringBuffer.append("; environmentRating = ").append(this.environmentRating);
        stringBuffer.append("; facilityRating = ").append(this.facilityRating);
        stringBuffer.append("; hygieneRating = ").append(this.hygieneRating);
        stringBuffer.append("; technologyRating = ").append(this.technologyRating);
        stringBuffer.append("; imageNum = ").append(this.imageNum);
        stringBuffer.append("; grouponNum = ").append(this.grouponNum);
        stringBuffer.append("; discountNum = ").append(this.discountNum);
        stringBuffer.append("; commentNum = ").append(this.commentNum);
        stringBuffer.append("; favoriteNum = ").append(this.favoriteNum);
        stringBuffer.append("; checkinNum = ").append(this.checkinNum);
        stringBuffer.append("; status = ").append(this.n);
        stringBuffer.append("; isDefaultImage = ").append(this.o);
        stringBuffer.append("; contentTag = ").append(this.p);
        stringBuffer.append("; label = ").append(this.f8068q);
        List<PoiChildrenInfo> list = this.l;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.l.size(); i++) {
                stringBuffer.append("; The ").append(i).append(" poiChildrenInfo is: ");
                PoiChildrenInfo poiChildrenInfo = this.l.get(i);
                if (poiChildrenInfo != null) {
                    stringBuffer.append(poiChildrenInfo.toString());
                } else {
                    stringBuffer.append(AbstractJsonLexerKt.NULL);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8067a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.distance);
        parcel.writeString(this.type);
        parcel.writeString(this.tag);
        parcel.writeParcelable(this.naviLocation, i);
        parcel.writeString(this.detailUrl);
        parcel.writeDouble(this.price);
        parcel.writeString(this.shopHours);
        parcel.writeDouble(this.overallRating);
        parcel.writeDouble(this.tasteRating);
        parcel.writeDouble(this.serviceRating);
        parcel.writeDouble(this.environmentRating);
        parcel.writeDouble(this.facilityRating);
        parcel.writeDouble(this.hygieneRating);
        parcel.writeDouble(this.technologyRating);
        parcel.writeInt(this.imageNum);
        parcel.writeString(this.image);
        parcel.writeInt(this.grouponNum);
        parcel.writeInt(this.discountNum);
        parcel.writeInt(this.commentNum);
        parcel.writeInt(this.favoriteNum);
        parcel.writeInt(this.checkinNum);
        parcel.writeTypedList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeString(this.brand);
        parcel.writeString(this.f8068q);
        parcel.writeString(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeString(this.p);
    }

    protected PoiDetailInfo(Parcel parcel) {
        this.f8067a = parcel.readString();
        this.b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.distance = parcel.readInt();
        this.type = parcel.readString();
        this.tag = parcel.readString();
        this.naviLocation = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.detailUrl = parcel.readString();
        this.price = parcel.readDouble();
        this.shopHours = parcel.readString();
        this.overallRating = parcel.readDouble();
        this.tasteRating = parcel.readDouble();
        this.serviceRating = parcel.readDouble();
        this.environmentRating = parcel.readDouble();
        this.facilityRating = parcel.readDouble();
        this.hygieneRating = parcel.readDouble();
        this.technologyRating = parcel.readDouble();
        this.imageNum = parcel.readInt();
        this.image = parcel.readString();
        this.grouponNum = parcel.readInt();
        this.discountNum = parcel.readInt();
        this.commentNum = parcel.readInt();
        this.favoriteNum = parcel.readInt();
        this.checkinNum = parcel.readInt();
        this.l = parcel.createTypedArrayList(PoiChildrenInfo.CREATOR);
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        parcel.readStringList(arrayList);
        this.brand = parcel.readString();
        this.f8068q = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readByte() != 0;
        this.p = parcel.readString();
    }
}
