package com.beken.iot.smartsdk.core.video;

import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class CameraDevice {
    private static final String TAG = "CameraDevice";
    public static final String TYPE_DEF_DVP = "DVP";
    public static final String TYPE_DEF_UVC = "UVC";
    public static final int TYPE_DVP = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UVC = 2;

    /* renamed from: id, reason: collision with root package name */
    private int f9069id;
    private String name;
    List<Ppi> ppiList = new ArrayList();
    private int type;

    public CameraDevice(String str, int i, int i2) {
        this.name = str;
        this.f9069id = i;
        this.type = i2;
    }

    public static void unpack(List<CameraDevice> list, byte[] bArr) {
        CameraDevice unpack = unpack(bArr);
        if (unpack != null) {
            list.add(unpack);
        }
    }

    public static CameraDevice unpack(byte[] bArr) {
        return unpack(new String(bArr, 0, bArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static CameraDevice unpack(String str) {
        printD("unpack: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("name");
            int i = jSONObject.getInt("id");
            String string2 = jSONObject.getString("type");
            ?? r5 = string2.equals("DVP");
            if (string2.equals("UVC")) {
                r5 = 2;
            }
            printD("name: " + string + " index: " + i + " type: " + r5);
            CameraDevice cameraDevice = new CameraDevice(string, i, r5);
            JSONArray jSONArray = jSONObject.getJSONArray("ppi");
            printD("json array: " + jSONArray);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                cameraDevice.addPPICap(new Ppi(jSONArray.get(i2).toString()));
            }
            return cameraDevice;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addPPICap(Ppi ppi) {
        this.ppiList.add(ppi);
    }

    public List<Ppi> getPpiList() {
        return this.ppiList;
    }

    public int getId() {
        return this.f9069id;
    }

    public int getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeString() {
        int i = this.type;
        if (i == 1) {
            return "DVP";
        }
        if (i == 2) {
            return "UVC";
        }
        return "unknown";
    }

    private static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }

    public String toString() {
        return "CameraDevice{ppiList=" + this.ppiList + ", type=" + this.type + ", id=" + this.f9069id + ", name='" + this.name + "'}";
    }
}
