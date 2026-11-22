package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.umeng.analytics.pro.ak;
import com.wakeup.module.ai.DeviceLanguageByAiLanguage;
import org.json.JSONObject;

/* compiled from: H5LocationClient.java */
/* loaded from: classes11.dex */
public class n {
    private Context b;
    private WebView d;
    a h;

    /* renamed from: a, reason: collision with root package name */
    Object f1780a = new Object();
    private AMapLocationClient c = null;
    private String e = "AMap.Geolocation.cbk";
    AMapLocationClientOption f = null;
    private volatile boolean g = false;

    /* compiled from: H5LocationClient.java */
    class a implements AMapLocationListener {
        a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public void onLocationChanged(AMapLocation aMapLocation) {
            if (n.this.g) {
                n nVar = n.this;
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    if (aMapLocation.getErrorCode() == 0) {
                        jSONObject.put("errorCode", 0);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("x", aMapLocation.getLongitude());
                        jSONObject2.put("y", aMapLocation.getLatitude());
                        jSONObject2.put("precision", aMapLocation.getAccuracy());
                        jSONObject2.put("type", aMapLocation.getLocationType());
                        jSONObject2.put("country", aMapLocation.getCountry());
                        jSONObject2.put("province", aMapLocation.getProvince());
                        jSONObject2.put("city", aMapLocation.getCity());
                        jSONObject2.put("cityCode", aMapLocation.getCityCode());
                        jSONObject2.put("district", aMapLocation.getDistrict());
                        jSONObject2.put("adCode", aMapLocation.getAdCode());
                        jSONObject2.put(Const.JSON_KEY_STREET, aMapLocation.getStreet());
                        jSONObject2.put("streetNum", aMapLocation.getStreetNum());
                        jSONObject2.put(Const.JSON_KEY_FLOOR, aMapLocation.getFloor());
                        jSONObject2.put(Const.JSON_KEY_ADDRESS, aMapLocation.getAddress());
                        jSONObject.put("result", jSONObject2);
                    } else {
                        jSONObject.put("errorCode", aMapLocation.getErrorCode());
                        jSONObject.put("errorInfo", aMapLocation.getErrorInfo());
                        jSONObject.put(Const.JSON_KEY_LOCATIONDETAIL, aMapLocation.getLocationDetail());
                    }
                } catch (Throwable unused) {
                }
                n.a(nVar, jSONObject.toString());
            }
        }
    }

    public n(Context context, WebView webView) {
        this.d = null;
        this.h = null;
        this.b = context.getApplicationContext();
        this.d = webView;
        this.h = new a();
    }

    static void a(n nVar, String str) {
        nVar.getClass();
        try {
            WebView webView = nVar.d;
            if (webView != null) {
                webView.evaluateJavascript("javascript:" + nVar.e + "('" + str + "')", new l(nVar));
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "H5LocationClient", "callbackJs()");
        }
    }

    @JavascriptInterface
    public void getLocation(String str) {
        synchronized (this.f1780a) {
            if (this.g) {
                a(str);
                AMapLocationClient aMapLocationClient = this.c;
                if (aMapLocationClient != null) {
                    aMapLocationClient.setLocationOption(this.f);
                    this.c.stopLocation();
                    this.c.startLocation();
                }
            }
        }
    }

    @JavascriptInterface
    public void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.g && (aMapLocationClient = this.c) != null) {
            aMapLocationClient.stopLocation();
        }
    }

    public void b() {
        if (this.d == null || this.b == null || this.g) {
            return;
        }
        try {
            this.d.getSettings().setJavaScriptEnabled(true);
            this.d.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!TextUtils.isEmpty(this.d.getUrl())) {
                this.d.reload();
            }
            if (this.c == null) {
                AMapLocationClient aMapLocationClient = new AMapLocationClient(this.b);
                this.c = aMapLocationClient;
                aMapLocationClient.setLocationListener(this.h);
            }
            this.g = true;
        } catch (Throwable unused) {
        }
    }

    public void a() {
        synchronized (this.f1780a) {
            this.g = false;
            AMapLocationClient aMapLocationClient = this.c;
            if (aMapLocationClient != null) {
                aMapLocationClient.unRegisterLocationListener(this.h);
                this.c.stopLocation();
                this.c.onDestroy();
                this.c = null;
            }
            this.f = null;
        }
    }

    private void a(String str) {
        boolean z;
        if (this.f == null) {
            this.f = new AMapLocationClientOption();
        }
        int i = 5;
        long j = 30000;
        try {
            JSONObject jSONObject = new JSONObject(str);
            j = jSONObject.optLong("to", 30000L);
            boolean z2 = jSONObject.optInt("useGPS", 1) == 1;
            try {
                r3 = jSONObject.optInt(DeviceLanguageByAiLanguage.SOURCE_WATCH, 0) == 1;
                i = jSONObject.optInt(ak.aT, 5);
                String optString = jSONObject.optString("callback", null);
                if (!TextUtils.isEmpty(optString)) {
                    this.e = optString;
                } else {
                    this.e = "AMap.Geolocation.cbk";
                }
            } catch (Throwable unused) {
            }
            boolean z3 = r3;
            r3 = z2;
            z = z3;
        } catch (Throwable unused2) {
            z = false;
        }
        try {
            this.f.setHttpTimeOut(j);
            if (r3) {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
            } else {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            }
            this.f.setOnceLocation(!z);
            if (z) {
                this.f.setInterval(i * 1000);
            }
        } catch (Throwable unused3) {
        }
    }
}
