package com.baidu.location.b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class ab {

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final ab f7524a = new ab();
    }

    private ab() {
    }

    public static ab a() {
        return a.f7524a;
    }

    private void a(String str, String str2, String str3) {
        Log.d("UrlConfigManger", "setConfig");
        Log.d("baidu_location_dev", "type:" + str + ", owner: " + str2 + " ,url: " + str3);
        if (str2.contains("default_owner") || "default_url".equals(str3) || !str3.contains("https")) {
            Log.d("baidu_location_dev", "url 不合法");
            return;
        }
        str.hashCode();
        switch (str) {
            case "indoor_roadnet":
                com.baidu.location.h.d.i = str3;
                break;
            case "vdr_log_update":
                com.baidu.location.h.d.l = str3;
                break;
            case "hdyawupdate":
                com.baidu.location.h.d.r = str3;
                break;
            case "basement_inout":
                com.baidu.location.h.d.s = str3;
                break;
            case "indoor_poi_data":
                com.baidu.location.h.d.k = str3;
                break;
            case "loc":
                com.baidu.location.h.d.f = str3;
                break;
            case "cfgs":
                com.baidu.location.h.d.g = str3;
                break;
            case "indoor_rects":
                com.baidu.location.h.d.j = str3;
                break;
        }
    }

    private boolean a(String str) {
        JSONArray optJSONArray;
        Log.d("UrlConfigManger", "parseConfig");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("url_config") || (optJSONArray = jSONObject.optJSONArray("url_config")) == null) {
                return true;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                a(optJSONObject.optString("type"), optJSONObject.optString("owner"), optJSONObject.optString("url"));
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void a(Context context) {
        Log.d("UrlConfigManger", "updateUrl");
        if (context == null) {
            return;
        }
        try {
            String str = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES) + File.separator + "baiduLocDev" + File.separator + "loc_local_config";
            StringBuilder sb = new StringBuilder();
            try {
                if (!new File(str).exists()) {
                    Log.d("baidu_location_dev", "loc_local_config not exit...");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(str);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileInputStream.close();
                        a(sb.toString());
                        return;
                    }
                    sb.append(new String(bArr, 0, read));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
