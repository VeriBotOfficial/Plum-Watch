package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.List;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class PoiDetailInfo extends BaseParams {

    @Properties(name = "new_catalog")
    private String A;

    @Properties(desc = "poi子点", name = DOMConstants.TAG_CHILDREN)
    private List<ChildrenPoi> B;

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "classified_poi_tag")
    private String f8138a;

    @Properties(desc = "poi分类标签", name = "tag")
    private String b;

    @Properties(desc = "poi别名", name = "new_alias")
    private String c;

    @Properties(desc = "类型", name = "type")
    private String d;

    @Properties(desc = "poi详情页", name = "detail_url")
    private String e;

    @Properties(desc = "poi的营业时间", name = "shop_hours")
    private String f;

    @Properties(desc = "poi商户的价格", name = "price")
    private String g;

    @Properties(desc = "poi权威标签", name = "label")
    private String h;

    @Properties(desc = "poi综合评分", name = "overall_rating")
    private String i;

    @Properties(desc = "poi图片数", name = "image_num")
    private String j;

    @Properties(desc = "poi的评论数", name = "comment_num")
    private String k;

    @Properties(desc = "poi对应的导航引导点坐标", name = "navi_location")
    private String l;

    @Properties(desc = "poi对应的品牌", name = "brand")
    private String m;

    @Properties(desc = "室内poi所在楼层", name = "indoor_floor")
    private String n;

    @Properties(desc = "poi头图", name = "head_image")
    private String o;

    @Properties(desc = "poi的相关榜单排名", name = "ranking")
    private String p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "poi父id", name = "parent_id")
    private String f8139q;

    @Properties(desc = "poi图片的下载链接", name = "photos")
    private List<String> r;

    @Properties(desc = "最佳游玩时间 ", name = "best_time")
    private String s;

    @Properties(desc = "建议时长", name = "sug_time")
    private String t;

    @Properties(desc = "描述", name = "description")
    private String u;

    @Properties(name = "content_tag")
    private String v;

    @Properties(name = "alias")
    private List<String> w;

    @Properties(name = "is_default_image")
    private boolean x;

    @Properties(name = "image")
    private String y;

    @Properties(name = "distance")
    private int z;

    public List<String> getAlias() {
        return this.w;
    }

    public String getBestTime() {
        return this.s;
    }

    public String getBrand() {
        return this.m;
    }

    public List<ChildrenPoi> getChildren() {
        return this.B;
    }

    public String getClassifiedPoiTag() {
        return this.f8138a;
    }

    public String getCommentNum() {
        return this.k;
    }

    public String getContentTag() {
        return this.v;
    }

    public String getDescription() {
        return this.u;
    }

    public String getDetailUrl() {
        return this.e;
    }

    public int getDistance() {
        return this.z;
    }

    public String getHeadImage() {
        return this.o;
    }

    public String getImage() {
        return this.y;
    }

    public String getImageNum() {
        return this.j;
    }

    public String getIndoorFloor() {
        return this.n;
    }

    public String getLabel() {
        return this.h;
    }

    public LatLng getNaviLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.l);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(",");
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getNewAlias() {
        return this.c;
    }

    public String getNewCatalog() {
        return this.A;
    }

    public String getOverallRating() {
        return this.i;
    }

    public String getParentId() {
        return this.f8139q;
    }

    public List<String> getPhotos() {
        return this.r;
    }

    public String getPrice() {
        return this.g;
    }

    public String getRanking() {
        return this.p;
    }

    public String getShopHours() {
        return this.f;
    }

    public String getSugTime() {
        return this.t;
    }

    public String getTag() {
        return this.b;
    }

    public String getType() {
        return this.d;
    }

    public boolean isDefaultImage() {
        return this.x;
    }

    public void setAlias(List<String> list) {
        this.w = list;
    }

    public void setBestTime(String str) {
        this.s = str;
    }

    public void setBrand(String str) {
        this.m = str;
    }

    public void setChildren(List<ChildrenPoi> list) {
        this.B = list;
    }

    public void setClassifiedPoiTag(String str) {
        this.f8138a = str;
    }

    public void setCommentNum(String str) {
        this.k = str;
    }

    public void setContentTag(String str) {
        this.v = str;
    }

    public void setDefaultImage(boolean z) {
        this.x = z;
    }

    public void setDescription(String str) {
        this.u = str;
    }

    public void setDetailUrl(String str) {
        this.e = str;
    }

    public void setDistance(int i) {
        this.z = i;
    }

    public void setHeadImage(String str) {
        this.o = str;
    }

    public void setImage(String str) {
        this.y = str;
    }

    public void setImageNum(String str) {
        this.j = str;
    }

    public void setIndoorFloor(String str) {
        this.n = str;
    }

    public void setLabel(String str) {
        this.h = str;
    }

    public void setNaviLocation(LatLng latLng) {
        if (latLng != null) {
            this.l = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setNewAlias(String str) {
        this.c = str;
    }

    public void setNewCatalog(String str) {
        this.A = str;
    }

    public void setOverallRating(String str) {
        this.i = str;
    }

    public void setParentId(String str) {
        this.f8139q = str;
    }

    public void setPhotos(List<String> list) {
        this.r = list;
    }

    public void setPrice(String str) {
        this.g = str;
    }

    public void setRanking(String str) {
        this.p = str;
    }

    public void setShopHours(String str) {
        this.f = str;
    }

    public void setSugTime(String str) {
        this.t = str;
    }

    public void setTag(String str) {
        this.b = str;
    }

    public void setType(String str) {
        this.d = str;
    }
}
