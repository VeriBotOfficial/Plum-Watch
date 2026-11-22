package com.beken.iot.smartsdk.core.video;

import com.beken.iot.smartsdk.core.log.BKSmartLog;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class DisplayDevice {
    private static final String TAG = "DisplayDevice";
    public static final String TYPE_DEF_MCU = "mcu";
    public static final String TYPE_DEF_RGB = "rgb";
    public static final int TYPE_MCU = 1;
    public static final int TYPE_RGB = 2;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: id, reason: collision with root package name */
    private final int f9071id;
    private final String name;
    private final Ppi ppi;
    private final int type;

    public DisplayDevice(String str, int i, int i2, Ppi ppi) {
        this.name = str;
        this.f9071id = i;
        this.type = i2;
        this.ppi = ppi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static DisplayDevice unpack(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, 0, bArr.length));
            String string = jSONObject.getString("name");
            int i = jSONObject.getInt("id");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("ppi");
            ?? r4 = string2.equals(TYPE_DEF_MCU);
            if (string2.equals(TYPE_DEF_RGB)) {
                r4 = 2;
            }
            printD("name: " + string + " index: " + i + " type: " + r4);
            return new DisplayDevice(string, i, r4, new Ppi(string3));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void unpack(List<DisplayDevice> list, byte[] bArr) {
        String str = new String(bArr, 0, bArr.length);
        printD("UNPACK: ".concat(str));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("name");
            int i = jSONObject.getInt("id");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("ppi");
            ?? r4 = string2.equals(TYPE_DEF_MCU);
            if (string2.equals(TYPE_DEF_RGB)) {
                r4 = 2;
            }
            printD("name: " + string + " index: " + i + " type: " + r4);
            list.add(new DisplayDevice(string, i, r4, new Ppi(string3)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Ppi getPpi() {
        return this.ppi;
    }

    public int getId() {
        return this.f9071id;
    }

    public String getTypeString() {
        int i = this.type;
        if (i == 2) {
            return TYPE_DEF_RGB;
        }
        if (i == 1) {
            return TYPE_DEF_MCU;
        }
        return "unknown";
    }

    public String toString() {
        return "DisplayDevice{name='" + this.name + "', id=" + this.f9071id + ", type=" + this.type + ", ppi=" + this.ppi + AbstractJsonLexerKt.END_OBJ;
    }

    private static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
