package com.baidu.mshield.x6.c;

import android.view.InputDevice;
import com.baidu.mshield.x6.f.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SystemInfoUtils.java */
/* loaded from: classes13.dex */
public class b {
    public static String a() {
        try {
            int[] deviceIds = InputDevice.getDeviceIds();
            JSONArray jSONArray = new JSONArray();
            for (int i : deviceIds) {
                InputDevice device = InputDevice.getDevice(i);
                if (device != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("0", device.getName());
                    jSONObject.put("1", device.isVirtual() ? 1 : 0);
                    jSONObject.put("2", device.getVendorId());
                    jSONObject.put("3", device.getSources());
                    String inputDevice = device.toString();
                    jSONObject.put("4", inputDevice.indexOf("Location: built-in") > 0 ? 1 : inputDevice.indexOf("Location: external") > 0 ? 2 : 0);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString().replace("   ", "");
        } catch (Exception e) {
            f.b(e);
            return "";
        }
    }

    public static boolean b() {
        return true;
    }
}
