package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public class ListData implements Parcelable {
    public static final Parcelable.Creator<ListData> CREATOR = new a();
    public List<Content> content;

    public static class BasicInfo implements Parcelable {
        public static final Parcelable.Creator<BasicInfo> CREATOR = new a();
        public String adcode;
        public String address;
        public String averagecost;
        public String buildingStatus;
        public String businessArea;
        public String category;
        public String childShortname;
        public String childShortnameEn;
        public String childtype;
        public String citycode;
        public String cname;
        public String dispName;
        public String distance;
        public String dname;
        public String eaddress;
        public String endPoiExtension;
        public String fNona;
        public String hisMark;
        public String hotText;

        /* renamed from: id, reason: collision with root package name */
        public String f2084id;
        public String industry;
        public String latitude;
        public String longitude;
        public String name;
        public NaviVisited naviVisited;
        public String numSpaceW;
        public String numSpaceWF;
        public String opentime2;
        public String opentimeText;
        public String parent;
        public String parentName;
        public String picInfo;
        public String rating;
        public String recommendFlag;
        public String reviewTotal;
        public String sell;
        public ShortReview shortReview;
        public String tel;
        public String towardsAngle;
        public String typeCode;
        public String updateFlag;
        public String xEntr;
        public String yEntr;

        static class a implements Parcelable.Creator<BasicInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public BasicInfo createFromParcel(Parcel parcel) {
                return new BasicInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public BasicInfo[] newArray(int i) {
                return new BasicInfo[i];
            }
        }

        public BasicInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.adcode);
            parcel.writeString(this.address);
            parcel.writeString(this.averagecost);
            parcel.writeString(this.buildingStatus);
            parcel.writeString(this.businessArea);
            parcel.writeString(this.childShortname);
            parcel.writeString(this.childShortnameEn);
            parcel.writeString(this.childtype);
            parcel.writeString(this.citycode);
            parcel.writeString(this.cname);
            parcel.writeString(this.dispName);
            parcel.writeString(this.distance);
            parcel.writeString(this.dname);
            parcel.writeString(this.eaddress);
            parcel.writeString(this.endPoiExtension);
            parcel.writeString(this.fNona);
            parcel.writeString(this.hisMark);
            parcel.writeString(this.hotText);
            parcel.writeString(this.f2084id);
            parcel.writeString(this.industry);
            parcel.writeString(this.latitude);
            parcel.writeString(this.longitude);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.naviVisited, i);
            parcel.writeString(this.numSpaceW);
            parcel.writeString(this.numSpaceWF);
            parcel.writeString(this.opentime2);
            parcel.writeString(this.opentimeText);
            parcel.writeString(this.parent);
            parcel.writeString(this.parentName);
            parcel.writeString(this.picInfo);
            parcel.writeString(this.rating);
            parcel.writeString(this.recommendFlag);
            parcel.writeString(this.reviewTotal);
            parcel.writeString(this.sell);
            parcel.writeString(this.tel);
            parcel.writeString(this.towardsAngle);
            parcel.writeString(this.typeCode);
            parcel.writeString(this.updateFlag);
            parcel.writeString(this.xEntr);
            parcel.writeString(this.yEntr);
            parcel.writeString(this.category);
        }

        protected BasicInfo(Parcel parcel) {
            this.adcode = parcel.readString();
            this.address = parcel.readString();
            this.averagecost = parcel.readString();
            this.buildingStatus = parcel.readString();
            this.businessArea = parcel.readString();
            this.childShortname = parcel.readString();
            this.childShortnameEn = parcel.readString();
            this.childtype = parcel.readString();
            this.citycode = parcel.readString();
            this.cname = parcel.readString();
            this.dispName = parcel.readString();
            this.distance = parcel.readString();
            this.dname = parcel.readString();
            this.eaddress = parcel.readString();
            this.endPoiExtension = parcel.readString();
            this.fNona = parcel.readString();
            this.hisMark = parcel.readString();
            this.hotText = parcel.readString();
            this.f2084id = parcel.readString();
            this.industry = parcel.readString();
            this.latitude = parcel.readString();
            this.longitude = parcel.readString();
            this.name = parcel.readString();
            this.naviVisited = (NaviVisited) parcel.readParcelable(NaviVisited.class.getClassLoader());
            this.numSpaceW = parcel.readString();
            this.numSpaceWF = parcel.readString();
            this.opentime2 = parcel.readString();
            this.opentimeText = parcel.readString();
            this.parent = parcel.readString();
            this.parentName = parcel.readString();
            this.picInfo = parcel.readString();
            this.rating = parcel.readString();
            this.recommendFlag = parcel.readString();
            this.reviewTotal = parcel.readString();
            this.sell = parcel.readString();
            this.tel = parcel.readString();
            this.towardsAngle = parcel.readString();
            this.typeCode = parcel.readString();
            this.updateFlag = parcel.readString();
            this.xEntr = parcel.readString();
            this.yEntr = parcel.readString();
            this.category = parcel.readString();
        }
    }

    public static class ChargeInfo implements Parcelable {
        public static final Parcelable.Creator<ChargeInfo> CREATOR = new a();
        public List<PlugsInfo> plugsInfos;
        public String plugsType;

        static class a implements Parcelable.Creator<ChargeInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public ChargeInfo createFromParcel(Parcel parcel) {
                return new ChargeInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ChargeInfo[] newArray(int i) {
                return new ChargeInfo[i];
            }
        }

        public ChargeInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.plugsType);
            parcel.writeTypedList(this.plugsInfos);
        }

        protected ChargeInfo(Parcel parcel) {
            this.plugsType = parcel.readString();
            this.plugsInfos = parcel.createTypedArrayList(PlugsInfo.CREATOR);
        }
    }

    public static class ChargingInfo implements Parcelable {
        public static final Parcelable.Creator<ChargingInfo> CREATOR = new a();
        public String brandDesc;
        public List<ChargeInfo> chargeInfo;
        public String chargingRatingFlagTerm;
        public String creditZhima;
        public String cscf;
        public String currentElePrice;
        public String currentSerPrice;
        public String deepRightsTag;
        public String fastFree;
        public HashMap<String, String> idDictionary;
        public String latestCharge;
        public String numFast;
        public String numSlow;
        public String parkCategory;
        public String parkingPriceSummary;
        public PriceChargingPark priceChargingPark;
        public String priceParkingStd;
        public String slowFree;
        public String superFree;
        public String superTotal;

        static class a implements Parcelable.Creator<ChargingInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public ChargingInfo createFromParcel(Parcel parcel) {
                return new ChargingInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ChargingInfo[] newArray(int i) {
                return new ChargingInfo[i];
            }
        }

        public ChargingInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.brandDesc);
            parcel.writeTypedList(this.chargeInfo);
            parcel.writeString(this.chargingRatingFlagTerm);
            parcel.writeString(this.creditZhima);
            parcel.writeString(this.cscf);
            parcel.writeString(this.currentElePrice);
            parcel.writeString(this.currentSerPrice);
            parcel.writeString(this.deepRightsTag);
            parcel.writeString(this.latestCharge);
            parcel.writeString(this.numFast);
            parcel.writeString(this.fastFree);
            parcel.writeString(this.numSlow);
            parcel.writeString(this.slowFree);
            parcel.writeString(this.superTotal);
            parcel.writeString(this.superFree);
            parcel.writeString(this.parkCategory);
            parcel.writeString(this.parkingPriceSummary);
            parcel.writeParcelable(this.priceChargingPark, i);
            parcel.writeString(this.priceParkingStd);
            parcel.writeMap(this.idDictionary);
        }

        protected ChargingInfo(Parcel parcel) {
            this.brandDesc = parcel.readString();
            this.chargeInfo = parcel.createTypedArrayList(ChargeInfo.CREATOR);
            this.chargingRatingFlagTerm = parcel.readString();
            this.creditZhima = parcel.readString();
            this.cscf = parcel.readString();
            this.currentElePrice = parcel.readString();
            this.currentSerPrice = parcel.readString();
            this.deepRightsTag = parcel.readString();
            this.latestCharge = parcel.readString();
            this.numFast = parcel.readString();
            this.fastFree = parcel.readString();
            this.numSlow = parcel.readString();
            this.slowFree = parcel.readString();
            this.superTotal = parcel.readString();
            this.superFree = parcel.readString();
            this.parkCategory = parcel.readString();
            this.parkingPriceSummary = parcel.readString();
            this.priceChargingPark = (PriceChargingPark) parcel.readParcelable(PriceChargingPark.class.getClassLoader());
            this.priceParkingStd = parcel.readString();
            HashMap<String, String> hashMap = new HashMap<>();
            this.idDictionary = hashMap;
            parcel.readMap(hashMap, HashMap.class.getClassLoader());
        }
    }

    public static class Content implements Parcelable {
        public static final Parcelable.Creator<Content> CREATOR = new a();
        public Data data;
        public String itemType;

        static class a implements Parcelable.Creator<Content> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Content createFromParcel(Parcel parcel) {
                return new Content(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Content[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.data, i);
            parcel.writeString(this.itemType);
        }

        protected Content(Parcel parcel) {
            this.data = (Data) parcel.readParcelable(Data.class.getClassLoader());
            this.itemType = parcel.readString();
        }
    }

    public static class LabelInfo implements Parcelable {
        public static final Parcelable.Creator<LabelInfo> CREATOR = new a();
        public String content;
        public int subType;
        public int type;

        static class a implements Parcelable.Creator<LabelInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public LabelInfo createFromParcel(Parcel parcel) {
                return new LabelInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LabelInfo[] newArray(int i) {
                return new LabelInfo[i];
            }
        }

        public LabelInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.content);
            parcel.writeInt(this.type);
            parcel.writeInt(this.subType);
        }

        protected LabelInfo(Parcel parcel) {
            this.content = parcel.readString();
            this.type = parcel.readInt();
            this.subType = parcel.readInt();
        }
    }

    public static class NaviVisited implements Parcelable {
        public static final Parcelable.Creator<NaviVisited> CREATOR = new a();
        public String randUnionMonthUv;

        static class a implements Parcelable.Creator<NaviVisited> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public NaviVisited createFromParcel(Parcel parcel) {
                return new NaviVisited(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public NaviVisited[] newArray(int i) {
                return new NaviVisited[i];
            }
        }

        public NaviVisited() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.randUnionMonthUv);
        }

        protected NaviVisited(Parcel parcel) {
            this.randUnionMonthUv = parcel.readString();
        }
    }

    public static class Park implements Parcelable {
        public static final Parcelable.Creator<Park> CREATOR = new a();
        public List<PriceCharging> priceChargings;
        public String srcType;

        static class a implements Parcelable.Creator<Park> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Park createFromParcel(Parcel parcel) {
                return new Park(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Park[] newArray(int i) {
                return new Park[i];
            }
        }

        public Park() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.priceChargings);
            parcel.writeString(this.srcType);
        }

        protected Park(Parcel parcel) {
            this.priceChargings = parcel.createTypedArrayList(PriceCharging.CREATOR);
            this.srcType = parcel.readString();
        }
    }

    public static class PlugsInfo implements Parcelable {
        public static final Parcelable.Creator<PlugsInfo> CREATOR = new a();
        public String brandDesc;
        public String fastcur;
        public String fastpower;
        public String fastvol;

        static class a implements Parcelable.Creator<PlugsInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public PlugsInfo createFromParcel(Parcel parcel) {
                return new PlugsInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public PlugsInfo[] newArray(int i) {
                return new PlugsInfo[i];
            }
        }

        public PlugsInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.brandDesc);
            parcel.writeString(this.fastcur);
            parcel.writeString(this.fastpower);
            parcel.writeString(this.fastvol);
        }

        protected PlugsInfo(Parcel parcel) {
            this.brandDesc = parcel.readString();
            this.fastcur = parcel.readString();
            this.fastpower = parcel.readString();
            this.fastvol = parcel.readString();
        }
    }

    public static class PriceCharging implements Parcelable {
        public static final Parcelable.Creator<PriceCharging> CREATOR = new a();
        public String elePrice;
        public String serPrice;
        public String time;
        public int updatetime;

        static class a implements Parcelable.Creator<PriceCharging> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public PriceCharging createFromParcel(Parcel parcel) {
                return new PriceCharging(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public PriceCharging[] newArray(int i) {
                return new PriceCharging[i];
            }
        }

        public PriceCharging() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.elePrice);
            parcel.writeString(this.serPrice);
            parcel.writeString(this.time);
            parcel.writeInt(this.updatetime);
        }

        protected PriceCharging(Parcel parcel) {
            this.elePrice = parcel.readString();
            this.serPrice = parcel.readString();
            this.time = parcel.readString();
            this.updatetime = parcel.readInt();
        }
    }

    public static class PriceChargingPark implements Parcelable {
        public static final Parcelable.Creator<PriceChargingPark> CREATOR = new a();
        public List<Park> parks;

        static class a implements Parcelable.Creator<PriceChargingPark> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public PriceChargingPark createFromParcel(Parcel parcel) {
                return new PriceChargingPark(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public PriceChargingPark[] newArray(int i) {
                return new PriceChargingPark[i];
            }
        }

        public PriceChargingPark() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.parks);
        }

        protected PriceChargingPark(Parcel parcel) {
            this.parks = parcel.createTypedArrayList(Park.CREATOR);
        }
    }

    public static class ShortReview {
    }

    static class a implements Parcelable.Creator<ListData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ListData createFromParcel(Parcel parcel) {
            return new ListData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ListData[] newArray(int i) {
            return new ListData[i];
        }
    }

    public ListData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.content);
    }

    public static class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public BasicInfo basicInfo;
        public ChargingInfo chargingInfo;
        public List<LabelInfo> labelInfos;

        static class a implements Parcelable.Creator<Data> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Data createFromParcel(Parcel parcel) {
                return new Data(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data() {
            this.labelInfos = new ArrayList();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.basicInfo, i);
            parcel.writeParcelable(this.chargingInfo, i);
            parcel.writeList(this.labelInfos);
        }

        protected Data(Parcel parcel) {
            this.labelInfos = new ArrayList();
            this.basicInfo = (BasicInfo) parcel.readParcelable(BasicInfo.class.getClassLoader());
            this.chargingInfo = (ChargingInfo) parcel.readParcelable(ChargingInfo.class.getClassLoader());
            this.labelInfos = parcel.readArrayList(LabelInfo.class.getClassLoader());
        }
    }

    protected ListData(Parcel parcel) {
        this.content = parcel.createTypedArrayList(Content.CREATOR);
    }
}
