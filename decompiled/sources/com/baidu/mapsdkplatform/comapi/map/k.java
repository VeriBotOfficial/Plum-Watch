package com.baidu.mapsdkplatform.comapi.map;

import android.os.Handler;
import android.os.Message;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LocalMap.java */
/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static k f8377a;
    private static Handler b;
    private AppBaseMap c;
    private o d;

    /* compiled from: LocalMap.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (k.f8377a != null) {
                k.this.d.a(message);
            }
        }
    }

    private k() {
    }

    public static k f() {
        if (f8377a == null) {
            k kVar = new k();
            f8377a = kVar;
            kVar.g();
        }
        return f8377a;
    }

    private void g() {
        h();
        this.d = new o();
        a aVar = new a();
        b = aVar;
        MessageCenter.registMessage(65289, aVar);
    }

    private void h() {
        EnvironmentUtilities.initAppDirectory(BMapManager.getContext());
        AppBaseMap appBaseMap = new AppBaseMap();
        this.c = appBaseMap;
        appBaseMap.Create();
        String moduleFileName = SysOSUtil.getModuleFileName();
        String appSDCardPath = EnvironmentUtilities.getAppSDCardPath();
        String appCachePath = EnvironmentUtilities.getAppCachePath();
        String appSecondCachePath = EnvironmentUtilities.getAppSecondCachePath();
        int mapTmpStgMax = EnvironmentUtilities.getMapTmpStgMax();
        int domTmpStgMax = EnvironmentUtilities.getDomTmpStgMax();
        int itsTmpStgMax = EnvironmentUtilities.getItsTmpStgMax();
        int ssgTmpStgMax = EnvironmentUtilities.getSsgTmpStgMax();
        String str = com.baidu.platform.comapi.util.SysOSUtil.getInstance().getDensityDPI() >= 180 ? "/h/" : "/l/";
        String str2 = moduleFileName + "/cfg";
        String str3 = appSDCardPath + "/vmp";
        this.c.Init(str2 + "/a/", str2 + "/idrres/", str3 + str, appCachePath + "/tmp/", appSecondCachePath + "/tmp/", str3 + str, str2 + "/a/", com.baidu.platform.comapi.util.SysOSUtil.getInstance().getScreenWidth(), com.baidu.platform.comapi.util.SysOSUtil.getInstance().getScreenHeight(), com.baidu.platform.comapi.util.SysOSUtil.getInstance().getDensityDPI(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, ssgTmpStgMax, false, false);
        this.c.OnResume();
    }

    public void b() {
        MessageCenter.unregistMessage(65289, b);
        this.c.releaseFromOfflineMap();
        f8377a = null;
    }

    public boolean c(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null || i < 0) {
            return false;
        }
        return appBaseMap.OnRecordRemove(i, false);
    }

    public boolean d(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null || i < 0) {
            return false;
        }
        if (i <= 9999 || i == 2912 || i == 2911 || i == 9000) {
            return appBaseMap.OnRecordStart(i, false, 0);
        }
        return false;
    }

    public boolean e(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null || i < 0) {
            return false;
        }
        return appBaseMap.OnRecordSuspend(i, false, 0);
    }

    public void a(n nVar) {
        o oVar = this.d;
        if (oVar != null) {
            oVar.a(nVar);
        }
    }

    public ArrayList<j> c() {
        ArrayList<j> arrayList;
        AppBaseMap appBaseMap = this.c;
        ArrayList<j> arrayList2 = null;
        if (appBaseMap == null) {
            return null;
        }
        String OnSchcityGet = appBaseMap.OnSchcityGet("");
        ArrayList<j> arrayList3 = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(OnSchcityGet).optJSONArray("dataset");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                int i = 0;
                while (i < optJSONArray.length()) {
                    j jVar = new j();
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("id");
                    if (optInt <= 9999 || optInt == 2912 || optInt == 2911 || optInt == 9000) {
                        jVar.f8376a = optInt;
                        jVar.b = optJSONObject.optString("name");
                        jVar.c = optJSONObject.optInt("mapsize");
                        jVar.d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                        if (optJSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                            if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                ArrayList<j> arrayList4 = new ArrayList<>();
                                int i2 = 0;
                                while (i2 < optJSONArray2.length()) {
                                    j jVar2 = new j();
                                    ArrayList<j> arrayList5 = arrayList2;
                                    try {
                                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                        jVar2.f8376a = optJSONObject2.optInt("id");
                                        jVar2.b = optJSONObject2.optString("name");
                                        jVar2.c = optJSONObject2.optInt("mapsize");
                                        jVar2.d = optJSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                        arrayList4.add(jVar2);
                                        i2++;
                                        arrayList2 = arrayList5;
                                    } catch (JSONException unused) {
                                        return arrayList5;
                                    } catch (Exception unused2) {
                                        return arrayList5;
                                    }
                                }
                                arrayList = arrayList2;
                                jVar.a(arrayList4);
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                        arrayList3.add(jVar);
                        i++;
                        arrayList2 = arrayList;
                    }
                    arrayList = arrayList2;
                    i++;
                    arrayList2 = arrayList;
                }
                return arrayList3;
            }
            return null;
        } catch (JSONException unused3) {
            return arrayList2;
        } catch (Exception unused4) {
            return arrayList2;
        }
    }

    public ArrayList<j> e() {
        ArrayList<j> arrayList;
        ArrayList<j> arrayList2;
        AppBaseMap appBaseMap = this.c;
        ArrayList<j> arrayList3 = null;
        if (appBaseMap == null) {
            return null;
        }
        String OnHotcityGet = appBaseMap.OnHotcityGet();
        ArrayList<j> arrayList4 = new ArrayList<>();
        try {
            JSONArray optJSONArray = new JSONObject(OnHotcityGet).optJSONArray("dataset");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                int i = 0;
                while (i < optJSONArray.length()) {
                    j jVar = new j();
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    jVar.f8376a = optJSONObject.optInt("id");
                    jVar.b = optJSONObject.optString("name");
                    jVar.c = optJSONObject.optInt("mapsize");
                    jVar.d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                    if (optJSONObject.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            ArrayList<j> arrayList5 = new ArrayList<>();
                            int i2 = 0;
                            while (i2 < optJSONArray2.length()) {
                                j jVar2 = new j();
                                arrayList = arrayList3;
                                try {
                                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                    jVar2.f8376a = optJSONObject2.optInt("id");
                                    jVar2.b = optJSONObject2.optString("name");
                                    jVar2.c = optJSONObject2.optInt("mapsize");
                                    jVar2.d = optJSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                    arrayList5.add(jVar2);
                                    i2++;
                                    arrayList3 = arrayList;
                                } catch (JSONException e) {
                                    e = e;
                                    e.printStackTrace();
                                    return arrayList;
                                }
                            }
                            arrayList2 = arrayList3;
                            jVar.a(arrayList5);
                        }
                        arrayList2 = arrayList3;
                        i++;
                        arrayList3 = arrayList2;
                    } else {
                        arrayList2 = arrayList3;
                    }
                    arrayList4.add(jVar);
                    i++;
                    arrayList3 = arrayList2;
                }
                return arrayList4;
            }
            return null;
        } catch (JSONException e2) {
            e = e2;
            arrayList = arrayList3;
        }
    }

    public boolean a(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null || i < 0) {
            return false;
        }
        if (i <= 9999 || i == 2912 || i == 2911 || i == 9000) {
            return appBaseMap.OnRecordAdd(i);
        }
        return false;
    }

    public void b(n nVar) {
        o oVar = this.d;
        if (oVar != null) {
            oVar.b(nVar);
        }
    }

    public boolean f(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.OnRecordSuspend(0, true, i);
    }

    public m b(int i) {
        String OnRecordGetAt;
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap != null && i >= 0 && (OnRecordGetAt = appBaseMap.OnRecordGetAt(i)) != null && !OnRecordGetAt.equals("")) {
            m mVar = new m();
            l lVar = new l();
            try {
                JSONObject jSONObject = new JSONObject(OnRecordGetAt);
                if (jSONObject.length() == 0) {
                    return null;
                }
                int optInt = jSONObject.optInt("id");
                if (optInt > 9999 && optInt != 2912 && optInt != 2911 && optInt != 9000) {
                    return null;
                }
                lVar.f8379a = optInt;
                lVar.b = jSONObject.optString("name");
                lVar.c = jSONObject.optString("pinyin");
                lVar.d = jSONObject.optString("headchar");
                lVar.h = jSONObject.optInt("mapoldsize");
                lVar.i = jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_RATION);
                lVar.l = jSONObject.optInt("status");
                lVar.g = new GeoPoint(jSONObject.optInt("y"), jSONObject.optInt("x"));
                boolean z = true;
                if (jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE) != 1) {
                    z = false;
                }
                lVar.j = z;
                lVar.e = jSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_LEVEL);
                if (lVar.j) {
                    lVar.k = jSONObject.optInt("mapsize");
                } else {
                    lVar.k = 0;
                }
                lVar.f = jSONObject.optInt("ver");
                mVar.a(lVar);
                return mVar;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ArrayList<m> d() {
        String OnRecordGetAll;
        JSONArray optJSONArray;
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap != null && (OnRecordGetAll = appBaseMap.OnRecordGetAll()) != null && !OnRecordGetAll.equals("")) {
            ArrayList<m> arrayList = new ArrayList<>();
            try {
                JSONObject jSONObject = new JSONObject(OnRecordGetAll);
                if (jSONObject.length() != 0 && (optJSONArray = jSONObject.optJSONArray("dataset")) != null && optJSONArray.length() != 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        m mVar = new m();
                        l lVar = new l();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        lVar.f8379a = optJSONObject.optInt("id");
                        lVar.b = optJSONObject.optString("name");
                        lVar.c = optJSONObject.optString("pinyin");
                        lVar.h = optJSONObject.optInt("mapoldsize");
                        lVar.i = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_RATION);
                        lVar.l = optJSONObject.optInt("status");
                        lVar.g = new GeoPoint(optJSONObject.optInt("y"), optJSONObject.optInt("x"));
                        boolean z = true;
                        if (optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE) != 1) {
                            z = false;
                        }
                        lVar.j = z;
                        lVar.e = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_LEVEL);
                        if (lVar.j) {
                            lVar.k = optJSONObject.optInt("mapsize");
                        } else {
                            lVar.k = 0;
                        }
                        mVar.a(lVar);
                        arrayList.add(mVar);
                    }
                    return arrayList;
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean a(boolean z, boolean z2) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.OnRecordImport(z, z2);
    }

    public boolean g(int i) {
        AppBaseMap appBaseMap = this.c;
        if (appBaseMap == null || i < 0) {
            return false;
        }
        if (i <= 9999 || i == 2912 || i == 2911 || i == 9000) {
            return appBaseMap.OnRecordReload(i, false);
        }
        return false;
    }

    public ArrayList<j> a(String str) {
        AppBaseMap appBaseMap;
        ArrayList<j> arrayList;
        ArrayList<j> arrayList2;
        ArrayList<j> arrayList3 = null;
        if (!str.equals("") && (appBaseMap = this.c) != null) {
            String OnSchcityGet = appBaseMap.OnSchcityGet(str);
            if (OnSchcityGet == null || OnSchcityGet.equals("")) {
                return null;
            }
            ArrayList<j> arrayList4 = new ArrayList<>();
            try {
                JSONObject jSONObject = new JSONObject(OnSchcityGet);
                if (jSONObject.length() == 0) {
                    return null;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("dataset");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        j jVar = new j();
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        int optInt = jSONObject2.optInt("id");
                        if (optInt <= 9999 || optInt == 2912 || optInt == 2911 || optInt == 9000) {
                            jVar.f8376a = optInt;
                            jVar.b = jSONObject2.optString("name");
                            jVar.c = jSONObject2.optInt("mapsize");
                            jVar.d = jSONObject2.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                            if (jSONObject2.has(MapBundleKey.OfflineMapKey.OFFLINE_CHILD)) {
                                JSONArray optJSONArray2 = jSONObject2.optJSONArray(MapBundleKey.OfflineMapKey.OFFLINE_CHILD);
                                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                                    ArrayList<j> arrayList5 = new ArrayList<>();
                                    int i2 = 0;
                                    while (i2 < optJSONArray2.length()) {
                                        j jVar2 = new j();
                                        arrayList = arrayList3;
                                        try {
                                            JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                                            jVar2.f8376a = optJSONObject.optInt("id");
                                            jVar2.b = optJSONObject.optString("name");
                                            jVar2.c = optJSONObject.optInt("mapsize");
                                            jVar2.d = optJSONObject.optInt(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
                                            arrayList5.add(jVar2);
                                            i2++;
                                            arrayList3 = arrayList;
                                        } catch (JSONException e) {
                                            e = e;
                                            e.printStackTrace();
                                            return arrayList;
                                        }
                                    }
                                    arrayList2 = arrayList3;
                                    jVar.a(arrayList5);
                                }
                            } else {
                                arrayList2 = arrayList3;
                            }
                            arrayList4.add(jVar);
                            i++;
                            arrayList3 = arrayList2;
                        }
                        arrayList2 = arrayList3;
                        i++;
                        arrayList3 = arrayList2;
                    }
                    return arrayList4;
                }
                return null;
            } catch (JSONException e2) {
                e = e2;
                arrayList = arrayList3;
            }
        }
        return null;
    }
}
