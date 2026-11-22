package com.baidu.mapapi.search.poi.abroad.bean;

import a.a.a.a.a.b.a;
import androidx.core.app.NotificationCompat;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iflytek.cloud.SpeechConstant;
import java.util.List;

/* loaded from: classes13.dex */
public class AbroadPlaceDetailInfo extends BaseParams {

    @Properties(name = "environment_exterior")
    private String A;

    @Properties(name = "inner_facility")
    private String B;

    @Properties(name = "hotel_facility")
    private String C;

    @Properties(name = "hotel_service")
    private String D;

    @Properties(name = FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String E;

    @Properties(name = "brand")
    private String F;

    @Properties(name = "alias")
    private String G;

    @Properties(name = "scope_type")
    private String H;

    @Properties(name = "scope_grade")
    private String I;

    @Properties(name = "description")
    private String J;

    @Properties(name = "di_review_keyword")
    private List<String> K;

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "tag")
    private String f8115a;

    @Properties(name = "type")
    private String b;

    @Properties(name = "detail_url")
    private String c;

    @Properties(name = "distance")
    private int d;

    @Properties(name = "indoor_floor")
    private String e;

    @Properties(name = "overall_rating")
    private String f;

    @Properties(name = "taste_rating")
    private String g;

    @Properties(name = "service_rating")
    private String h;

    @Properties(name = "environment_rating")
    private String i;

    @Properties(name = "facility_rating")
    private String j;

    @Properties(name = "hygiene_rating")
    private String k;

    @Properties(name = "technology_rating")
    private String l;

    @Properties(name = "price")
    private String m;

    @Properties(name = "shop_hours")
    private String n;

    @Properties(name = "image")
    private String o;

    @Properties(name = "image_num")
    private String p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "groupon_num")
    private String f8116q;

    @Properties(name = "discount_num")
    private String r;

    @Properties(name = "comment_num")
    private String s;

    @Properties(name = "favorite_num")
    private String t;

    @Properties(name = "checkin_num")
    private String u;

    @Properties(name = "atmosphere")
    private String v;

    @Properties(name = "featured_service")
    private String w;

    @Properties(name = NotificationCompat.CATEGORY_RECOMMENDATION)
    private String x;

    @Properties(name = SpeechConstant.ISE_CATEGORY)
    private String y;

    @Properties(name = "level")
    private String z;

    public String getAlias() {
        return this.G;
    }

    public String getAtmosphere() {
        return this.v;
    }

    public String getBrand() {
        return this.F;
    }

    public String getCategory() {
        return this.y;
    }

    public String getCheckinNum() {
        return this.u;
    }

    public String getCommentNum() {
        return this.s;
    }

    public String getDescription() {
        return this.J;
    }

    public String getDetailUrl() {
        return this.c;
    }

    public List<String> getDiReviewKeyword() {
        return this.K;
    }

    public String getDiscountNum() {
        return this.r;
    }

    public int getDistance() {
        return this.d;
    }

    public String getEnvironmentExterior() {
        return this.A;
    }

    public String getEnvironmentRating() {
        return this.i;
    }

    public String getFacilityRating() {
        return this.j;
    }

    public String getFavoriteNum() {
        return this.t;
    }

    public String getFeaturedService() {
        return this.w;
    }

    public String getGrouponNum() {
        return this.f8116q;
    }

    public String getHotelFacility() {
        return this.C;
    }

    public String getHotelService() {
        return this.D;
    }

    public String getHygieneRating() {
        return this.k;
    }

    public String getImage() {
        return this.o;
    }

    public String getImageNum() {
        return this.p;
    }

    public String getIndoorFloor() {
        return this.e;
    }

    public String getInnerFacility() {
        return this.B;
    }

    public String getLevel() {
        return this.z;
    }

    public LatLng getNaviLocation() {
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            throw null;
        }
        throw null;
    }

    public String getOverallRating() {
        return this.f;
    }

    public String getPaymentType() {
        return this.E;
    }

    public String getPrice() {
        return this.m;
    }

    public String getRecommendation() {
        return this.x;
    }

    public String getScopeGrade() {
        return this.I;
    }

    public String getScopeType() {
        return this.H;
    }

    public String getServiceRating() {
        return this.h;
    }

    public String getShopHours() {
        return this.n;
    }

    public String getTag() {
        return this.f8115a;
    }

    public String getTasteRating() {
        return this.g;
    }

    public String getTechnologyRating() {
        return this.l;
    }

    public String getType() {
        return this.b;
    }

    public void setAlias(String str) {
        this.G = str;
    }

    public void setAtmosphere(String str) {
        this.v = str;
    }

    public void setBrand(String str) {
        this.F = str;
    }

    public void setCategory(String str) {
        this.y = str;
    }

    public void setCheckinNum(String str) {
        this.u = str;
    }

    public void setCommentNum(String str) {
        this.s = str;
    }

    public void setDescription(String str) {
        this.J = str;
    }

    public void setDetailUrl(String str) {
        this.c = str;
    }

    public void setDiReviewKeyword(List<String> list) {
        this.K = list;
    }

    public void setDiscountNum(String str) {
        this.r = str;
    }

    public void setDistance(int i) {
        this.d = i;
    }

    public void setEnvironmentExterior(String str) {
        this.A = str;
    }

    public void setEnvironmentRating(String str) {
        this.i = str;
    }

    public void setFacilityRating(String str) {
        this.j = str;
    }

    public void setFavoriteNum(String str) {
        this.t = str;
    }

    public void setFeaturedService(String str) {
        this.w = str;
    }

    public void setGrouponNum(String str) {
        this.f8116q = str;
    }

    public void setHotelFacility(String str) {
        this.C = str;
    }

    public void setHotelService(String str) {
        this.D = str;
    }

    public void setHygieneRating(String str) {
        this.k = str;
    }

    public void setImage(String str) {
        this.o = str;
    }

    public void setImageNum(String str) {
        this.p = str;
    }

    public void setIndoorFloor(String str) {
        this.e = str;
    }

    public void setInnerFacility(String str) {
        this.B = str;
    }

    public void setLevel(String str) {
        this.z = str;
    }

    public void setNaviLocation(a aVar) {
    }

    public void setOverallRating(String str) {
        this.f = str;
    }

    public void setPaymentType(String str) {
        this.E = str;
    }

    public void setPrice(String str) {
        this.m = str;
    }

    public void setRecommendation(String str) {
        this.x = str;
    }

    public void setScopeGrade(String str) {
        this.I = str;
    }

    public void setScopeType(String str) {
        this.H = str;
    }

    public void setServiceRating(String str) {
        this.h = str;
    }

    public void setShopHours(String str) {
        this.n = str;
    }

    public void setTag(String str) {
        this.f8115a = str;
    }

    public void setTasteRating(String str) {
        this.g = str;
    }

    public void setTechnologyRating(String str) {
        this.l = str;
    }

    public void setType(String str) {
        this.b = str;
    }
}
