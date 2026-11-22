package com.baidu.platform.base;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.domain.d;

/* compiled from: SearchRequest.java */
/* loaded from: classes13.dex */
public abstract class c {
    protected String c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f8497a = true;
    private boolean b = true;
    protected com.baidu.platform.util.a d = new com.baidu.platform.util.a();

    public abstract String a(com.baidu.platform.domain.c cVar);

    public void a(boolean z) {
        this.b = z;
    }

    public void b(boolean z) {
        this.f8497a = z;
    }

    public String a() {
        return this.c;
    }

    public String b(SearchType searchType) {
        String a2 = a(d.a());
        SDKInitializer.getDebugMode();
        String authToken = HttpClient.getAuthToken();
        if (authToken == null) {
            Log.e("SearchRequest", "toUrlString get authtoken failed");
            int permissionCheck = PermissionCheck.permissionCheck();
            if (permissionCheck != 0) {
                Log.e("SearchRequest", "try permissionCheck result is: " + permissionCheck);
                return null;
            }
            authToken = HttpClient.getAuthToken();
        }
        if (this.f8497a) {
            this.d.a("token", authToken);
        }
        String a3 = this.d.a();
        if (a(searchType)) {
            a3 = a(searchType, a3);
        }
        String str = a3 + HttpClient.getPhoneInfo();
        if (this.b) {
            str = str + "&sign=" + AppMD5.getSignMD5String(str);
        }
        return a2 + Separators.QUESTION + str;
    }

    private String a(SearchType searchType, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return SearchType.REVERSE_GEO_CODER == searchType ? a(str) : str;
    }

    private String a(String str) {
        String substring = str.substring(str.indexOf("location=") + 9, str.indexOf("&", str.indexOf("location=")));
        if (TextUtils.isEmpty(substring)) {
            return str;
        }
        byte[] bArr = {0};
        try {
            bArr = AlgorithmUtil.setUrlNeedInfo(AppMD5.getUrlNeedInfo(), AppMD5.getUrlNeedInfo(), substring.getBytes());
        } catch (Exception e) {
            Log.e("BaseSearch", "get location failed", e);
        }
        return str.replace(substring, Base64.encodeToString(bArr, 0).trim());
    }

    protected final String a(PlanNode planNode) {
        if (planNode == null) {
            return null;
        }
        String str = new String(Const.STR_MART_JSON_BEGIN);
        LatLng location = planNode.getLocation();
        if (location != null) {
            String concat = str.concat("\"type\":1,");
            Point ll2point = CoordUtil.ll2point(location);
            if (!TextUtils.isEmpty(planNode.getPoiId())) {
                concat = concat + "\"uid\":\"" + planNode.getPoiId() + "\",";
            }
            if (!TextUtils.isEmpty(planNode.getBid()) && !TextUtils.isEmpty(planNode.getFloor())) {
                concat = (concat + "\"building\":\"" + planNode.getBid() + "\",") + "\"floor\":\"" + planNode.getFloor() + "\",";
            }
            if (!TextUtils.isEmpty(planNode.getCityCode())) {
                concat = concat + "\"city\":\"" + planNode.getCityCode() + "\",";
            }
            return concat + "\"xy\":\"" + ll2point.doubleX + "," + ll2point.doubleY + "\"}";
        }
        if (planNode.getName() == null) {
            return str;
        }
        String concat2 = str.concat("\"type\":2,");
        if (!TextUtils.isEmpty(planNode.getPoiId())) {
            concat2 = concat2 + "\"uid\":\"" + planNode.getPoiId() + "\",";
        }
        return concat2 + "\"keyword\":\"" + planNode.getName() + "\"}";
    }

    private boolean a(SearchType searchType) {
        return SearchType.REVERSE_GEO_CODER == searchType;
    }
}
