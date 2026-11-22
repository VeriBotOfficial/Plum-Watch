package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONObject;

/* compiled from: UpdateItem.java */
@ta(isSuperField = true, tableName = "update_item")
/* loaded from: classes11.dex */
public class k2 extends n2 {
    private String n = "";
    private Context o;

    public k2() {
    }

    public void d(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (!"".equals(str) && (jSONObject = new JSONObject(str).getJSONObject("file")) != null) {
                    this.f1785a = jSONObject.optString("title");
                    this.c = jSONObject.optString("code");
                    this.b = jSONObject.optString("url");
                    this.d = jSONObject.optString("fileName");
                    this.f = jSONObject.optLong("lLocalLength");
                    this.g = jSONObject.optLong("lRemoteLength");
                    this.l = jSONObject.optInt("mState");
                    this.e = jSONObject.optString("version");
                    this.h = jSONObject.optString("localPath");
                    this.n = jSONObject.optString("vMapFileNames");
                    this.i = jSONObject.optInt("isSheng");
                    this.j = jSONObject.optInt("mCompleteCode");
                    this.k = jSONObject.optString("mCityCode");
                    String trim = (!jSONObject.has("pinyin") || "[]".equals(jSONObject.getString("pinyin"))) ? "" : jSONObject.optString("pinyin").trim();
                    this.m = trim;
                    if ("".equals(trim)) {
                        String str2 = this.b;
                        String substring = str2.substring(str2.lastIndexOf("/") + 1);
                        this.m = substring.substring(0, substring.lastIndexOf("."));
                    }
                }
            } catch (Throwable th) {
                ja.a(th, "UpdateItem", "readFileToJSONObject");
                th.printStackTrace();
            }
        }
    }

    public void e(String str) {
        this.n = str;
    }

    public String f() {
        return this.n;
    }

    protected void g() {
        this.d = t4.a(this.o) + this.m + ".zip.tmp";
    }

    public void h() {
        OutputStreamWriter outputStreamWriter;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", this.f1785a);
            jSONObject2.put("code", this.c);
            jSONObject2.put("url", this.b);
            jSONObject2.put("fileName", this.d);
            jSONObject2.put("lLocalLength", this.f);
            jSONObject2.put("lRemoteLength", this.g);
            jSONObject2.put("mState", this.l);
            jSONObject2.put("version", this.e);
            jSONObject2.put("localPath", this.h);
            String str = this.n;
            if (str != null) {
                jSONObject2.put("vMapFileNames", str);
            }
            jSONObject2.put("isSheng", this.i);
            jSONObject2.put("mCompleteCode", this.j);
            jSONObject2.put("mCityCode", this.k);
            jSONObject2.put("pinyin", this.m);
            jSONObject.put("file", jSONObject2);
            File file = new File(this.d + ".dt");
            file.delete();
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                try {
                    try {
                        outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), "utf-8");
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.close();
            } catch (IOException e3) {
                e = e3;
                outputStreamWriter2 = outputStreamWriter;
                ja.a(e, "UpdateItem", "saveJSONObjectToFile");
                e.printStackTrace();
                if (outputStreamWriter2 != null) {
                    outputStreamWriter2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter2 != null) {
                    try {
                        outputStreamWriter2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            ja.a(th3, "UpdateItem", "saveJSONObjectToFile parseJson");
            th3.printStackTrace();
        }
    }

    public k2(OfflineMapCity offlineMapCity, Context context) {
        this.o = context;
        this.f1785a = offlineMapCity.getCity();
        this.c = offlineMapCity.getAdcode();
        this.b = offlineMapCity.getUrl();
        this.g = offlineMapCity.getSize();
        this.e = offlineMapCity.getVersion();
        this.k = offlineMapCity.getCode();
        this.i = 0;
        this.l = offlineMapCity.getState();
        this.j = offlineMapCity.getcompleteCode();
        this.m = offlineMapCity.getPinyin();
        g();
    }

    public k2(OfflineMapProvince offlineMapProvince, Context context) {
        this.o = context;
        this.f1785a = offlineMapProvince.getProvinceName();
        this.c = offlineMapProvince.getProvinceCode();
        this.b = offlineMapProvince.getUrl();
        this.g = offlineMapProvince.getSize();
        this.e = offlineMapProvince.getVersion();
        this.i = 1;
        this.l = offlineMapProvince.getState();
        this.j = offlineMapProvince.getCompleteCode();
        this.m = offlineMapProvince.getPinyin();
        g();
    }
}
