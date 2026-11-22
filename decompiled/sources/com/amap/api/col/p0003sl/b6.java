package com.amap.api.col.p0003sl;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.Classify;
import com.amap.api.services.auto.ListData;
import com.amap.api.services.auto.Lqii;
import com.amap.api.services.auto.Meta;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.feature.dynamic.b;
import com.iflytek.cloud.SpeechConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutoTSearchResultParser.java */
/* loaded from: classes11.dex */
public class b6 {

    /* renamed from: a, reason: collision with root package name */
    static yb f1569a;

    public static void a(Context context, String str, long j, boolean z) {
        try {
            String a2 = a(str, j, z);
            if (a2 != null && a2.length() >= 1) {
                if (f1569a == null) {
                    f1569a = new yb(context, "sea", "9.7.4", "O002");
                }
                f1569a.a(a2);
                zb.a(f1569a, context);
            }
        } catch (Throwable th) {
            a(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    public static AutoTChargeStationResult b(JSONObject jSONObject) {
        Meta meta;
        AutoTChargeStationResult autoTChargeStationResult = new AutoTChargeStationResult();
        try {
            autoTChargeStationResult.code = jSONObject.optInt("code");
            autoTChargeStationResult.message = jSONObject.optString("message");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                autoTChargeStationResult.classify = a(optJSONObject.optJSONObject("classify"));
                autoTChargeStationResult.listData = c(optJSONObject.optJSONObject("list_data"));
                autoTChargeStationResult.lqii = d(optJSONObject.optJSONObject("lqii"));
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("meta");
                if (optJSONObject2 == null) {
                    meta = null;
                } else {
                    Meta meta2 = new Meta();
                    meta2.listBizType = optJSONObject2.optString("list_biz_type");
                    meta = meta2;
                }
                autoTChargeStationResult.meta = meta;
                autoTChargeStationResult.originJson = optJSONObject.toString();
                return autoTChargeStationResult;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return autoTChargeStationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ListData c(JSONObject jSONObject) {
        JSONArray jSONArray;
        ListData listData;
        int i;
        ListData.BasicInfo basicInfo;
        JSONArray jSONArray2;
        int i2;
        int i3;
        ListData listData2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        int i4;
        ListData.PriceChargingPark priceChargingPark;
        JSONArray jSONArray5;
        int i5;
        int i6;
        JSONArray jSONArray6;
        ListData.ChargingInfo chargingInfo;
        ListData.BasicInfo basicInfo2 = null;
        if (jSONObject == null) {
            return null;
        }
        ListData listData3 = new ListData();
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < optJSONArray.length()) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject == null) {
                jSONArray = optJSONArray;
                listData = listData3;
                i = i7;
            } else {
                ListData.Content content = new ListData.Content();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
                if (optJSONObject2 != null) {
                    ListData.Data data = new ListData.Data();
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("basic_info");
                    if (optJSONObject3 == null) {
                        basicInfo = basicInfo2;
                    } else {
                        basicInfo = new ListData.BasicInfo();
                        basicInfo.adcode = optJSONObject3.optString(Const.JSON_KEY_ADCODE);
                        basicInfo.address = optJSONObject3.optString(Const.JSON_KEY_ADDRESS);
                        basicInfo.averagecost = optJSONObject3.optString("averagecost");
                        basicInfo.buildingStatus = optJSONObject3.optString("building_status");
                        basicInfo.businessArea = optJSONObject3.optString("business_area");
                        basicInfo.childShortname = optJSONObject3.optString("child_shortname");
                        basicInfo.childShortnameEn = optJSONObject3.optString("child_shortname_en");
                        basicInfo.childtype = optJSONObject3.optString("childtype");
                        basicInfo.citycode = optJSONObject3.optString(Const.JSON_KEY_CITYCODE);
                        basicInfo.cname = optJSONObject3.optString("cname");
                        basicInfo.dispName = optJSONObject3.optString("disp_name");
                        basicInfo.distance = optJSONObject3.optString("distance");
                        basicInfo.dname = optJSONObject3.optString("dname");
                        basicInfo.eaddress = optJSONObject3.optString("eaddress");
                        basicInfo.endPoiExtension = optJSONObject3.optString("end_poi_extension");
                        basicInfo.fNona = optJSONObject3.optString("f_nona");
                        basicInfo.hisMark = optJSONObject3.optString("his_mark");
                        basicInfo.hotText = optJSONObject3.optString("hot_text");
                        basicInfo.f2084id = optJSONObject3.optString("id");
                        basicInfo.industry = optJSONObject3.optString("industry");
                        basicInfo.latitude = optJSONObject3.optString("latitude");
                        basicInfo.longitude = optJSONObject3.optString("longitude");
                        basicInfo.name = optJSONObject3.optString("name");
                        basicInfo.category = optJSONObject3.optString(SpeechConstant.ISE_CATEGORY);
                        ListData.NaviVisited naviVisited = new ListData.NaviVisited();
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("navi_visited");
                        if (optJSONObject4 != null) {
                            naviVisited.randUnionMonthUv = optJSONObject4.optString("rand_union_month_uv");
                        }
                        basicInfo.naviVisited = naviVisited;
                        basicInfo.numSpaceW = optJSONObject3.optString("num_space_w");
                        basicInfo.numSpaceWF = optJSONObject3.optString("num_space_w_f");
                        basicInfo.opentime2 = optJSONObject3.optString("opentime2");
                        basicInfo.opentimeText = optJSONObject3.optString("opentime_text");
                        basicInfo.parent = optJSONObject3.optString("parent");
                        basicInfo.parentName = optJSONObject3.optString("parent_name");
                        basicInfo.picInfo = optJSONObject3.optString("pic_info");
                        basicInfo.rating = optJSONObject3.optString("rating");
                        basicInfo.recommendFlag = optJSONObject3.optString("recommend_flag");
                        basicInfo.reviewTotal = optJSONObject3.optString("review_total");
                        basicInfo.sell = optJSONObject3.optString("sell");
                        ListData.ShortReview shortReview = new ListData.ShortReview();
                        if (optJSONObject3.optJSONObject("short_review") != null) {
                            basicInfo.shortReview = shortReview;
                        }
                        basicInfo.tel = optJSONObject3.optString("tel");
                        basicInfo.towardsAngle = optJSONObject3.optString("towards_angle");
                        basicInfo.typeCode = optJSONObject3.optString("typecode");
                        basicInfo.updateFlag = optJSONObject3.optString("update_flag");
                        basicInfo.xEntr = optJSONObject3.optString("x_entr");
                        basicInfo.yEntr = optJSONObject3.optString("y_entr");
                    }
                    data.basicInfo = basicInfo;
                    JSONObject optJSONObject5 = optJSONObject2.optJSONObject("charging_info");
                    if (optJSONObject5 == null) {
                        jSONArray = optJSONArray;
                        chargingInfo = basicInfo2;
                        listData = listData3;
                        i = i7;
                    } else {
                        ListData.ChargingInfo chargingInfo2 = new ListData.ChargingInfo();
                        chargingInfo2.brandDesc = optJSONObject5.optString("brand_desc");
                        JSONArray optJSONArray2 = optJSONObject5.optJSONArray("charge_info");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            int i8 = 0;
                            while (i8 < optJSONArray2.length()) {
                                JSONObject optJSONObject6 = optJSONArray2.optJSONObject(i8);
                                if (optJSONObject6 == null) {
                                    jSONArray2 = optJSONArray;
                                    i2 = i8;
                                } else {
                                    jSONArray2 = optJSONArray;
                                    ListData.ChargeInfo chargeInfo = new ListData.ChargeInfo();
                                    i2 = i8;
                                    JSONArray optJSONArray3 = optJSONObject6.optJSONArray("plugs_info");
                                    if (optJSONArray3 != null) {
                                        i3 = i7;
                                        ArrayList arrayList3 = new ArrayList();
                                        listData2 = listData3;
                                        jSONArray3 = optJSONArray2;
                                        int i9 = 0;
                                        while (i9 < optJSONArray3.length()) {
                                            JSONObject optJSONObject7 = optJSONArray3.optJSONObject(i9);
                                            if (optJSONObject7 == null) {
                                                jSONArray4 = optJSONArray3;
                                                i4 = i9;
                                            } else {
                                                jSONArray4 = optJSONArray3;
                                                ListData.PlugsInfo plugsInfo = new ListData.PlugsInfo();
                                                i4 = i9;
                                                plugsInfo.brandDesc = optJSONObject7.optString("brand_desc");
                                                plugsInfo.fastcur = optJSONObject7.optString("fastcur");
                                                plugsInfo.fastpower = optJSONObject7.optString("fastpower");
                                                plugsInfo.fastvol = optJSONObject7.optString("fastvol");
                                                arrayList3.add(plugsInfo);
                                            }
                                            i9 = i4 + 1;
                                            optJSONArray3 = jSONArray4;
                                        }
                                        chargeInfo.plugsInfos = arrayList3;
                                        chargeInfo.plugsType = optJSONObject6.optString("plugstype");
                                        arrayList2.add(chargeInfo);
                                        i8 = i2 + 1;
                                        optJSONArray = jSONArray2;
                                        i7 = i3;
                                        optJSONArray2 = jSONArray3;
                                        listData3 = listData2;
                                    }
                                }
                                listData2 = listData3;
                                i3 = i7;
                                jSONArray3 = optJSONArray2;
                                i8 = i2 + 1;
                                optJSONArray = jSONArray2;
                                i7 = i3;
                                optJSONArray2 = jSONArray3;
                                listData3 = listData2;
                            }
                        }
                        jSONArray = optJSONArray;
                        listData = listData3;
                        i = i7;
                        chargingInfo2.chargeInfo = arrayList2;
                        chargingInfo2.chargingRatingFlagTerm = optJSONObject5.optString("charging_rating_flag_term");
                        chargingInfo2.creditZhima = optJSONObject5.optString("credit_zhima");
                        chargingInfo2.cscf = optJSONObject5.optString("cscf");
                        chargingInfo2.currentElePrice = optJSONObject5.optString("current_ele_price");
                        chargingInfo2.currentSerPrice = optJSONObject5.optString("current_ser_price");
                        chargingInfo2.deepRightsTag = optJSONObject5.optString("deep_rights_tag");
                        chargingInfo2.latestCharge = optJSONObject5.optString("latest_charge");
                        chargingInfo2.numFast = optJSONObject5.optString("num_fast");
                        chargingInfo2.fastFree = optJSONObject5.optString("fast_free");
                        chargingInfo2.numSlow = optJSONObject5.optString("num_slow");
                        chargingInfo2.slowFree = optJSONObject5.optString("slow_free");
                        chargingInfo2.superTotal = optJSONObject5.optString("super_total");
                        chargingInfo2.superFree = optJSONObject5.optString("super_free");
                        chargingInfo2.parkCategory = optJSONObject5.optString("park_category");
                        chargingInfo2.parkingPriceSummary = optJSONObject5.optString("parkingPriceSummary");
                        JSONArray optJSONArray4 = optJSONObject5.optJSONArray("price_charging_pack");
                        if (optJSONArray4 == null) {
                            priceChargingPark = null;
                        } else {
                            priceChargingPark = new ListData.PriceChargingPark();
                            ArrayList arrayList4 = new ArrayList();
                            int i10 = 0;
                            while (i10 < optJSONArray4.length()) {
                                JSONObject optJSONObject8 = optJSONArray4.optJSONObject(i10);
                                if (optJSONObject8 == null) {
                                    jSONArray5 = optJSONArray4;
                                    i5 = i10;
                                } else {
                                    ListData.Park park = new ListData.Park();
                                    park.srcType = optJSONObject8.optString(Constants.JumpUrlConstants.URL_KEY_SRC);
                                    JSONArray optJSONArray5 = optJSONObject8.optJSONArray("price_charging");
                                    if (optJSONArray5 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        jSONArray5 = optJSONArray4;
                                        int i11 = 0;
                                        while (i11 < optJSONArray5.length()) {
                                            JSONObject optJSONObject9 = optJSONArray5.optJSONObject(i11);
                                            if (optJSONObject9 == null) {
                                                i6 = i10;
                                                jSONArray6 = optJSONArray5;
                                            } else {
                                                i6 = i10;
                                                ListData.PriceCharging priceCharging = new ListData.PriceCharging();
                                                jSONArray6 = optJSONArray5;
                                                priceCharging.elePrice = optJSONObject9.optString("ele_price");
                                                priceCharging.serPrice = optJSONObject9.optString("ser_price");
                                                priceCharging.time = optJSONObject9.optString("time");
                                                priceCharging.updatetime = optJSONObject9.optInt("updatetime");
                                                arrayList5.add(priceCharging);
                                            }
                                            i11++;
                                            i10 = i6;
                                            optJSONArray5 = jSONArray6;
                                        }
                                        i5 = i10;
                                        park.priceChargings = arrayList5;
                                    } else {
                                        jSONArray5 = optJSONArray4;
                                        i5 = i10;
                                    }
                                    arrayList4.add(park);
                                }
                                i10 = i5 + 1;
                                optJSONArray4 = jSONArray5;
                            }
                            priceChargingPark.parks = arrayList4;
                        }
                        chargingInfo2.priceChargingPark = priceChargingPark;
                        chargingInfo2.priceParkingStd = optJSONObject5.optString("price_parking_std");
                        JSONObject optJSONObject10 = optJSONObject5.optJSONObject("iddictionary");
                        chargingInfo = chargingInfo2;
                        if (optJSONObject10 != null) {
                            HashMap<String, String> hashMap = new HashMap<>();
                            Iterator<String> keys = optJSONObject10.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, optJSONObject10.optString(next));
                            }
                            chargingInfo2.idDictionary = hashMap;
                            chargingInfo = chargingInfo2;
                        }
                    }
                    data.chargingInfo = chargingInfo;
                    JSONArray optJSONArray6 = optJSONObject2.optJSONArray("labelInfos");
                    ArrayList arrayList6 = new ArrayList();
                    if (optJSONArray6 != null) {
                        for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                            JSONObject optJSONObject11 = optJSONArray6.optJSONObject(i12);
                            if (optJSONObject11 != null) {
                                ListData.LabelInfo labelInfo = new ListData.LabelInfo();
                                labelInfo.content = optJSONObject11.optString("content");
                                labelInfo.type = optJSONObject11.optInt("type");
                                labelInfo.subType = optJSONObject11.optInt("subType");
                                arrayList6.add(labelInfo);
                            }
                        }
                    }
                    data.labelInfos = arrayList6;
                    content.data = data;
                } else {
                    jSONArray = optJSONArray;
                    listData = listData3;
                    i = i7;
                }
                content.itemType = optJSONObject.optString("item_type");
                arrayList.add(content);
            }
            i7 = i + 1;
            optJSONArray = jSONArray;
            listData3 = listData;
            basicInfo2 = null;
        }
        ListData listData4 = listData3;
        listData4.content = arrayList;
        return listData4;
    }

    public static void d(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(b.g)) {
                a(jSONObject.getInt(b.g), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has("status")) {
                String string = jSONObject.getString("status");
                if (string.equals("1")) {
                    return;
                }
                if (string.equals("0") && !jSONObject.has("infocode")) {
                    throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
                }
                int i = jSONObject.getInt("infocode");
                if (string.equals("0")) {
                    a(i, jSONObject.getString(ParameterNames.INFO));
                }
            }
        } catch (JSONException e) {
            a(e, "CoreUtil", "paseAuthFailurJson");
            throw new AMapException(AMapException.AMAP_CLIENT_ERROR_PROTOCOL);
        }
    }

    public static void e(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(b.g)) {
                a(jSONObject.getInt(b.g), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has("status")) {
                if (jSONObject.optInt("status") == 0) {
                    if (!jSONObject.has("infocode")) {
                        throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
                    }
                    a(jSONObject.getInt("infocode"), jSONObject.getString(ParameterNames.INFO));
                }
                int optInt = jSONObject.optInt("code");
                if (optInt == 0) {
                    return;
                }
                String optString = jSONObject.optString("message");
                throw new AMapException(optString, 2, optString, Integer.parseInt("1" + optInt));
            }
        } catch (JSONException e) {
            a(e, "CoreUtil", "paseAuthFailurJson");
            throw new AMapException(AMapException.AMAP_CLIENT_ERROR_PROTOCOL);
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    private static Classify a(JSONObject jSONObject) {
        Classify.ItermData itermData;
        Classify.CheckedValue checkedValue;
        Classify.RetainState retainState = null;
        if (jSONObject == null) {
            return null;
        }
        Classify classify = new Classify();
        JSONObject optJSONObject = jSONObject.optJSONObject("item_data");
        if (optJSONObject == null) {
            itermData = null;
        } else {
            itermData = new Classify.ItermData();
            JSONArray optJSONArray = optJSONObject.optJSONArray("checked_nodes");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
                    if (optJSONObject2 != null) {
                        Classify.CheckedNode checkedNode = new Classify.CheckedNode();
                        checkedNode.f2083id = optJSONObject2.optString("id");
                        checkedNode.value = optJSONObject2.optString("value");
                        checkedNode.name = optJSONObject2.optString("name");
                        arrayList.add(checkedNode);
                    }
                }
            }
            itermData.checkedNodes = arrayList;
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("checked_value");
            if (optJSONObject3 == null) {
                checkedValue = null;
            } else {
                checkedValue = new Classify.CheckedValue();
                checkedValue.classifyV2Data = optJSONObject3.optString("classify_v2_data");
                checkedValue.classifyV2Level2Data = optJSONObject3.optString("classify_v2_level2_data");
                checkedValue.classifyV2Level3Data = optJSONObject3.optString("classify_v2_level3_data");
            }
            itermData.checkedValue = checkedValue;
            itermData.datas = a(optJSONObject.optJSONArray("data"));
            itermData.defaultPositionDatas = a(optJSONObject.optJSONArray("default_position_data"));
            itermData.level2Datas = a(optJSONObject.optJSONArray("level2_data"));
        }
        classify.itermData = itermData;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("retain_state");
        if (optJSONObject4 != null) {
            retainState = new Classify.RetainState();
            retainState.classifyBusinessType = optJSONObject4.optString("classify_business_type");
            retainState.classifyConf = optJSONObject4.optString("classify_conf");
            retainState.classifyRetainLevel2 = optJSONObject4.optString("classify_retain_level2");
            retainState.level2All = optJSONObject4.optString("level2_all");
            retainState.newClassifyCityadcode = optJSONObject4.optString("new_classify_cityadcode");
            retainState.newClassifyFlag = optJSONObject4.optString("new_classify_flag");
        }
        classify.retainState = retainState;
        return classify;
    }

    public static Date b(String str) {
        if (str != null && !str.trim().equals("")) {
            try {
                return new SimpleDateFormat("HHmm").parse(str);
            } catch (ParseException e) {
                a(e, "CoreUtil", "parseString2Time");
            }
        }
        return null;
    }

    private static Lqii d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Lqii lqii = new Lqii();
        lqii.categoryBrandRecognitionResult = jSONObject.optString("category_brand_recognition_result");
        lqii.changeQueryTip = jSONObject.optString("change_query_tip");
        lqii.expandRangeTip = jSONObject.optString("change_query_tip");
        lqii.isCurrentCity = jSONObject.optString("is_current_city");
        lqii.isUserCity = jSONObject.optString("is_user_city");
        lqii.queryCateResult = jSONObject.optString("query_cate_result");
        lqii.suggestContent = jSONObject.optString("suggestcontent");
        lqii.targetViewCity = jSONObject.optString("target_view_city");
        lqii.totalhits = jSONObject.optString("totalhits");
        lqii.viewRegion = jSONObject.optString("view_region");
        return lqii;
    }

    private static String a(String str, long j, boolean z) {
        try {
            StringBuilder sb = new StringBuilder("{\"RequestPath\":\"");
            sb.append(str).append("\",\"ResponseTime\":");
            sb.append(j);
            sb.append(",\"Success\":");
            sb.append(z);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static List<Classify.Data> a(JSONArray jSONArray) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        JSONArray jSONArray2;
        int i3;
        ArrayList arrayList2;
        JSONObject jSONObject;
        Classify.Data data;
        ArrayList arrayList3;
        JSONArray jSONArray3;
        int i4;
        JSONArray jSONArray4 = jSONArray;
        ArrayList arrayList4 = new ArrayList();
        if (jSONArray4 != null) {
            int i5 = 0;
            while (i5 < jSONArray4.length()) {
                JSONObject optJSONObject = jSONArray4.optJSONObject(i5);
                if (optJSONObject == null) {
                    arrayList = arrayList4;
                    i = i5;
                } else {
                    Classify.Data data2 = new Classify.Data();
                    String str2 = SpeechConstant.ISE_CATEGORY;
                    JSONArray optJSONArray = optJSONObject.optJSONArray(SpeechConstant.ISE_CATEGORY);
                    ArrayList arrayList5 = new ArrayList();
                    if (optJSONArray != null) {
                        int i6 = 0;
                        while (i6 < optJSONArray.length()) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i6);
                            if (optJSONObject2 == null) {
                                arrayList2 = arrayList4;
                                i2 = i5;
                                jSONObject = optJSONObject;
                                data = data2;
                                str = str2;
                                jSONArray2 = optJSONArray;
                                arrayList3 = arrayList5;
                                i3 = i6;
                            } else {
                                Classify.DataCategory dataCategory = new Classify.DataCategory();
                                JSONArray optJSONArray2 = optJSONObject2.optJSONArray(str2);
                                i2 = i5;
                                ArrayList arrayList6 = new ArrayList();
                                str = str2;
                                jSONArray2 = optJSONArray;
                                i3 = i6;
                                arrayList2 = arrayList4;
                                jSONObject = optJSONObject;
                                data = data2;
                                ArrayList arrayList7 = arrayList5;
                                if (optJSONArray2 != null) {
                                    int i7 = 0;
                                    while (i7 < optJSONArray2.length()) {
                                        JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i7);
                                        if (optJSONObject3 == null) {
                                            jSONArray3 = optJSONArray2;
                                            i4 = i7;
                                        } else {
                                            jSONArray3 = optJSONArray2;
                                            Classify.Category category = new Classify.Category();
                                            i4 = i7;
                                            category.checked = optJSONObject3.optInt("checked");
                                            category.componentType = optJSONObject3.optString("component_type");
                                            category.defaultValue = optJSONObject3.optInt("default");
                                            category.name = optJSONObject3.optString("name");
                                            category.value = optJSONObject3.optString("value");
                                            category.classifyItemType = optJSONObject3.optString("classify_item_type");
                                            category.img = optJSONObject3.optString(SocialConstants.PARAM_IMG_URL);
                                            category.showType = optJSONObject3.optString(CampaignEx.KEY_SHOW_TYPE);
                                            category.params = optJSONObject3.optString("params");
                                            arrayList6.add(category);
                                        }
                                        i7 = i4 + 1;
                                        optJSONArray2 = jSONArray3;
                                    }
                                }
                                dataCategory.categories = arrayList6;
                                dataCategory.checked = optJSONObject2.optInt("checked");
                                dataCategory.defaultValue = optJSONObject2.optInt("default");
                                dataCategory.componentType = optJSONObject2.optString("component_type");
                                dataCategory.name = optJSONObject2.optString("name");
                                dataCategory.params = optJSONObject2.optString("params");
                                dataCategory.areaSubwayMark = optJSONObject2.optInt("area_subway_mark");
                                dataCategory.hideTitle = optJSONObject2.optInt("hide_title");
                                dataCategory.maxShowNum = optJSONObject2.optInt("max_show_num");
                                dataCategory.maxShowNumRow = optJSONObject2.optInt("max_show_num_row");
                                dataCategory.multiSelect = optJSONObject2.optInt("multi_select");
                                dataCategory.img = optJSONObject2.optString(SocialConstants.PARAM_IMG_URL);
                                dataCategory.showType = optJSONObject2.optString(CampaignEx.KEY_SHOW_TYPE);
                                dataCategory.value = optJSONObject2.optString("value");
                                dataCategory.classifyItemType = optJSONObject2.optString("classify_item_type");
                                arrayList3 = arrayList7;
                                arrayList3.add(dataCategory);
                            }
                            i6 = i3 + 1;
                            arrayList5 = arrayList3;
                            i5 = i2;
                            str2 = str;
                            optJSONArray = jSONArray2;
                            arrayList4 = arrayList2;
                            optJSONObject = jSONObject;
                            data2 = data;
                        }
                    }
                    ArrayList arrayList8 = arrayList4;
                    i = i5;
                    JSONObject jSONObject2 = optJSONObject;
                    Classify.Data data3 = data2;
                    data3.categories = arrayList5;
                    data3.checked = jSONObject2.optInt("checked");
                    data3.classifyItemType = jSONObject2.optString("classify_item_type");
                    data3.isCancelDefaultSelect = jSONObject2.optInt("is_cancel_default_select");
                    data3.isNoBtn = jSONObject2.optInt("is_no_btn");
                    data3.name = jSONObject2.optString("name");
                    data3.params = jSONObject2.optString("params");
                    data3.separator = jSONObject2.optString("separator");
                    data3.type = jSONObject2.optString("type");
                    data3.useCommonlyUsedConfig = jSONObject2.optInt("use_commonly_used_config");
                    data3.useLocalConfig = jSONObject2.optInt("use_local_config");
                    data3.useRemoteConfig = jSONObject2.optInt("use_remote_config");
                    data3.multiSelect = jSONObject2.optInt("multi_select");
                    arrayList = arrayList8;
                    arrayList.add(data3);
                }
                i5 = i + 1;
                arrayList4 = arrayList;
                jSONArray4 = jSONArray;
            }
        }
        return arrayList4;
    }

    public static void a(Context context, String str, boolean z) {
        try {
            String a2 = a(str, z);
            if (a2 != null && a2.length() >= 1) {
                yb ybVar = new yb(context, "sea", "9.7.4", "O006");
                ybVar.a(a2);
                zb.a(ybVar, context);
            }
        } catch (Throwable th) {
            a(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    private static String a(String str, boolean z) {
        String str2;
        try {
            int indexOf = str.indexOf(Separators.QUESTION);
            int length = str.length();
            str2 = "";
            if (indexOf > 0) {
                String substring = str.substring(0, indexOf);
                int i = indexOf + 1;
                str2 = i < length ? str.substring(i) : "";
                str = substring;
            }
            StringBuilder sb = new StringBuilder("{\"RequestPath\":\"");
            sb.append(str).append("\",\"RequestParm\":\"");
            sb.append(str2).append("\",\"IsCacheRequest\":");
            sb.append(z);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    private static void a(int i, String str) throws AMapException, JSONException {
        if (i != 0) {
            if (i == 22000) {
                throw new AMapException(AMapException.AMAP_SERVICE_TABLEID_NOT_EXIST, 2, str);
            }
            if (i == 32200) {
                throw new AMapException(AMapException.AMAP_NEARBY_INVALID_USERID, 2, str);
            }
            if (i != 32201) {
                switch (i) {
                    case 10000:
                        return;
                    case 10001:
                        throw new AMapException(AMapException.AMAP_INVALID_USER_KEY, 2, str);
                    case 10002:
                        throw new AMapException(AMapException.AMAP_SERVICE_NOT_AVAILBALE, 2, str);
                    case 10003:
                        throw new AMapException(AMapException.AMAP_DAILY_QUERY_OVER_LIMIT, 2, str);
                    case 10004:
                        throw new AMapException(AMapException.AMAP_ACCESS_TOO_FREQUENT, 2, str);
                    case 10005:
                        throw new AMapException(AMapException.AMAP_INVALID_USER_IP, 2, str);
                    case 10006:
                        throw new AMapException(AMapException.AMAP_INVALID_USER_DOMAIN, 2, str);
                    case 10007:
                        throw new AMapException("用户签名未通过", 2, str);
                    case 10008:
                        throw new AMapException(AMapException.AMAP_INVALID_USER_SCODE, 2, str);
                    case 10009:
                        throw new AMapException(AMapException.AMAP_USERKEY_PLAT_NOMATCH, 2, str);
                    case 10010:
                        throw new AMapException(AMapException.AMAP_IP_QUERY_OVER_LIMIT, 2, str);
                    case 10011:
                        throw new AMapException(AMapException.AMAP_NOT_SUPPORT_HTTPS, 2, str);
                    case 10012:
                        throw new AMapException(AMapException.AMAP_INSUFFICIENT_PRIVILEGES, 2, str);
                    case 10013:
                        throw new AMapException(AMapException.AMAP_USER_KEY_RECYCLED, 2, str);
                    default:
                        switch (i) {
                            case 20000:
                                throw new AMapException(AMapException.AMAP_SERVICE_INVALID_PARAMS, 2, str);
                            case 20001:
                                throw new AMapException(AMapException.AMAP_SERVICE_MISSING_REQUIRED_PARAMS, 2, str);
                            case 20002:
                                throw new AMapException(AMapException.AMAP_SERVICE_ILLEGAL_REQUEST, 2, str);
                            case 20003:
                                throw new AMapException(AMapException.AMAP_SERVICE_UNKNOWN_ERROR, 2, str);
                            default:
                                switch (i) {
                                    case 20800:
                                        throw new AMapException(AMapException.AMAP_ROUTE_OUT_OF_SERVICE, 2, str);
                                    case 20801:
                                        throw new AMapException(AMapException.AMAP_ROUTE_NO_ROADS_NEARBY, 2, str);
                                    case 20802:
                                        throw new AMapException(AMapException.AMAP_ROUTE_FAIL, 2, str);
                                    case 20803:
                                        throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE, 2, str);
                                    default:
                                        switch (i) {
                                            case 30000:
                                                throw new AMapException(AMapException.AMAP_ENGINE_RESPONSE_ERROR, 2, str);
                                            case 30001:
                                                throw new AMapException(AMapException.AMAP_ENGINE_RESPONSE_DATA_ERROR, 2, str);
                                            case 30002:
                                                throw new AMapException(AMapException.AMAP_ENGINE_CONNECT_TIMEOUT, 2, str);
                                            case 30003:
                                                throw new AMapException(AMapException.AMAP_ENGINE_RETURN_TIMEOUT, 2, str);
                                            default:
                                                switch (i) {
                                                    case PcmAudioUtil.PCM_BYTES_PER_SEC /* 32000 */:
                                                        throw new AMapException(AMapException.AMAP_ENGINE_TABLEID_NOT_EXIST, 2, str);
                                                    case 32001:
                                                        throw new AMapException(AMapException.AMAP_ID_NOT_EXIST, 2, str);
                                                    case 32002:
                                                        throw new AMapException(AMapException.AMAP_SERVICE_MAINTENANCE, 2, str);
                                                    default:
                                                        if (!TextUtils.isEmpty(str) && i > 0) {
                                                            throw new AMapException(str, 2, str, i);
                                                        }
                                                        throw new AMapException(str, 2, str);
                                                }
                                        }
                                }
                        }
                }
            }
            throw new AMapException(AMapException.AMAP_NEARBY_KEY_NOT_BIND, 2, str);
        }
    }

    public static Date c(String str) {
        if (str != null && !str.trim().equals("")) {
            try {
                return new SimpleDateFormat("HH:mm").parse(str);
            } catch (ParseException e) {
                a(e, "CoreUtil", "parseTime");
            }
        }
        return null;
    }

    public static double a(double d) {
        return Double.parseDouble(new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US)).format(d));
    }

    public static String a(LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return "";
        }
        return a(latLonPoint.getLongitude()) + "," + a(latLonPoint.getLatitude());
    }

    public static String a(Date date) {
        return date != null ? new SimpleDateFormat("HH:mm").format(date) : "";
    }

    public static String a(List<LatLonPoint> list, String str) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            LatLonPoint latLonPoint = list.get(i);
            if (latLonPoint != null) {
                stringBuffer.append(a(latLonPoint.getLongitude())).append(",").append(a(latLonPoint.getLatitude()));
                stringBuffer.append(str);
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public static void a(Throwable th, String str, String str2) {
        try {
            ja a2 = ja.a();
            if (a2 != null) {
                a2.b(th, str, str2);
            }
            th.printStackTrace();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static float a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
        if (latLonPoint != null && latLonPoint2 != null) {
            try {
                double longitude = latLonPoint.getLongitude();
                double d = longitude * 0.01745329251994329d;
                double latitude = latLonPoint.getLatitude() * 0.01745329251994329d;
                double longitude2 = latLonPoint2.getLongitude() * 0.01745329251994329d;
                double latitude2 = latLonPoint2.getLatitude() * 0.01745329251994329d;
                double sin = Math.sin(d);
                double sin2 = Math.sin(latitude);
                double cos = Math.cos(d);
                double cos2 = Math.cos(latitude);
                double sin3 = Math.sin(longitude2);
                double sin4 = Math.sin(latitude2);
                double cos3 = Math.cos(longitude2);
                double cos4 = Math.cos(latitude2);
                double[] dArr = {cos * cos2, cos2 * sin, sin2};
                double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
                double d2 = dArr[0];
                double d3 = dArr2[0];
                double d4 = (d2 - d3) * (d2 - d3);
                double d5 = dArr[1];
                double d6 = dArr2[1];
                double d7 = d4 + ((d5 - d6) * (d5 - d6));
                double d8 = dArr[2];
                double d9 = dArr2[2];
                return (float) (Math.asin(Math.sqrt(d7 + ((d8 - d9) * (d8 - d9))) / 2.0d) * 1.27420015798544E7d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return 0.0f;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder();
        if ((i & 1) != 0) {
            sb.append("cost,");
        }
        if ((i & 2) != 0) {
            sb.append("tmcs,");
        }
        if ((i & 4) != 0) {
            sb.append("navi,");
        }
        if ((i & 8) != 0) {
            sb.append("cities,");
        }
        if ((i & 16) != 0) {
            sb.append("polyline,");
        }
        if ((i & 32) != 0) {
            sb.append("elec_consume_info,");
        }
        if ((i & 64) != 0) {
            sb.append("charge_station_info,");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }
}
