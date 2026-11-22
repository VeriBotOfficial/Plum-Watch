package com.bytedance.sdk.openadsdk.dx;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bh {
    private Context fxn;
    private WeakReference<tw> kg;
    private Map<String, fxn> gff = new HashMap();
    private SensorEventListener hm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.dx.bh.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            tw hm;
            if (sensorEvent.sensor.getType() != 1 || (hm = bh.this.hm()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                hm.fxn("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener rb = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.dx.bh.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            tw hm;
            if (sensorEvent.sensor.getType() != 4 || (hm = bh.this.hm()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                hm.fxn("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener bh = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.dx.bh.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            tw hm;
            if (sensorEvent.sensor.getType() != 10 || (hm = bh.this.hm()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                hm.fxn("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: sg, reason: collision with root package name */
    private SensorEventListener f9541sg = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.dx.bh.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                System.arraycopy(sensorEvent.values, 0, hie.kg, 0, hie.kg.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                System.arraycopy(sensorEvent.values, 0, hie.gff, 0, hie.gff.length);
            }
            SensorManager.getRotationMatrix(hie.hm, null, hie.kg, hie.gff);
            SensorManager.getOrientation(hie.hm, hie.rb);
            tw hm = bh.this.hm();
            if (hm == null) {
                return;
            }
            float f = hie.rb[0];
            float f2 = hie.rb[1];
            float f3 = hie.rb[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                hm.fxn("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    interface fxn {
        JSONObject fxn(JSONObject jSONObject) throws Throwable;
    }

    public bh(tw twVar) {
        this.fxn = twVar.fxn();
        this.kg = new WeakReference<>(twVar);
        gff();
    }

    public Set<String> fxn() {
        return this.gff.keySet();
    }

    private void gff() {
        this.gff.put("adInfo", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.45
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                if (hm != null) {
                    JSONObject ud = hm.ud();
                    if (ud != null) {
                        ud.put("code", 1);
                        return ud;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.gff.put("appInfo", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.56
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = bh.this.fxn().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                tw hm = bh.this.hm();
                if (hm != null) {
                    jSONObject2.put("deviceId", hm.sg());
                    jSONObject2.put("netType", hm.xdg());
                    jSONObject2.put("innerAppName", hm.hm());
                    jSONObject2.put("appName", hm.rb());
                    jSONObject2.put("appVersion", hm.bh());
                    Map<String, String> kg = hm.kg();
                    for (String str : kg.keySet()) {
                        jSONObject2.put(str, kg.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.gff.put("playableSDKInfo", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.62
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.gff.put("subscribe_app_ad", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.63
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("download_app_ad", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.64
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("isViewable", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.2
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                if (hm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", hm.jq());
                return jSONObject3;
            }
        });
        this.gff.put("getVolume", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.3
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                if (hm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", hm.tw());
                return jSONObject3;
            }
        });
        this.gff.put("getScreenSize", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.4
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                if (hm == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject je = hm.je();
                je.put("code", 1);
                return je;
            }
        });
        this.gff.put("start_accelerometer_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.5
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        sg.fxn("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                hie.fxn(bh.this.fxn, bh.this.hm, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("close_accelerometer_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.6
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, bh.this.hm);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("start_gyro_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.7
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        sg.fxn("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                hie.kg(bh.this.fxn, bh.this.rb, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("close_gyro_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.8
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, bh.this.rb);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("start_accelerometer_grativityless_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.9
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        sg.fxn("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                hie.gff(bh.this.fxn, bh.this.bh, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("close_accelerometer_grativityless_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.10
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, bh.this.bh);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("start_rotation_vector_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.11
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        sg.fxn("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                hie.hm(bh.this.fxn, bh.this.f9541sg, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("close_rotation_vector_observer", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.13
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, bh.this.f9541sg);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("device_shake", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.14
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("device_shake_short", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.15
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    hie.fxn(bh.this.fxn, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    sg.fxn("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gff.put("playable_style", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.16
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm != null) {
                    JSONObject gff = hm.gff();
                    gff.put("code", 1);
                    return gff;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.gff.put("sendReward", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.17
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm != null) {
                    hm.ums();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.gff.put("playableInteractionTriggered", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.18
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm != null) {
                    hm.iwp();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.gff.put("webview_time_track", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.19
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.gff.put("playable_event", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.20
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.kg(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("reportAd", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.21
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("close", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.22
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("openAdLandPageLinks", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.24
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("get_viewport", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.25
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject dx = hm.dx();
                dx.put("code", 1);
                return dx;
            }
        });
        this.gff.put("jssdk_load_finish", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.26
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.ci();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_material_render_result", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.27
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.jq(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("detect_change_playable_click", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.28
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject hie = hm.hie();
                hie.put("code", 1);
                return hie;
            }
        });
        this.gff.put("check_camera_permission", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.29
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject rlu = hm.rlu();
                rlu.put("code", 1);
                return rlu;
            }
        });
        this.gff.put("check_external_storage", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.30
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject zu = hm.zu();
                if (zu.isNull("result")) {
                    zu.put("code", -1);
                    return zu;
                }
                zu.put("code", 1);
                return zu;
            }
        });
        this.gff.put("playable_open_camera", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.31
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_pick_photo", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.32
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_download_media_in_photos", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.33
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.fxn(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_preventTouchEvent", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.35
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.kg(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_settings_info", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.36
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject ckl = hm.ckl();
                ckl.put("code", 1);
                return ckl;
            }
        });
        this.gff.put("playable_load_main_scene", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.37
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.jz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_enter_section", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.38
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.hm(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_end", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.39
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.bx();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_finish_play_playable", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.40
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.uhw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_transfrom_module_show", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.41
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.ke();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_transfrom_module_change_color", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.42
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.mve();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_set_scroll_rect", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.43
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_click_area", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.44
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.rb(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_real_play_start", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.46
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_material_first_frame_show", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.47
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.zn();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_stuck_check_pong", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.48
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.ggo();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_material_adnormal_mask", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.49
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                hm.bh(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_long_press_panel", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.50
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_alpha_player_play", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.51
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_transfrom_module_highlight", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.52
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_send_click_event", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.53
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_query_media_permission_declare", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.54
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject sg2 = hm.sg(jSONObject);
                sg2.put("code", 1);
                return sg2;
            }
        });
        this.gff.put("playable_query_media_permission_enable", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.55
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                tw hm = bh.this.hm();
                JSONObject jSONObject2 = new JSONObject();
                if (hm == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject tw = hm.tw(jSONObject);
                tw.put("code", 1);
                return tw;
            }
        });
        this.gff.put("playable_apply_media_permission", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.57
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_start_kws", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.58
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_close_kws", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.59
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_video_preload_task_add", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.60
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gff.put("playable_video_preload_task_cancel", new fxn() { // from class: com.bytedance.sdk.openadsdk.dx.bh.61
            @Override // com.bytedance.sdk.openadsdk.dx.bh.fxn
            public JSONObject fxn(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.dx.fxn rb = bh.this.rb();
                JSONObject jSONObject2 = new JSONObject();
                if (rb == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tw hm() {
        WeakReference<tw> weakReference = this.kg;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.dx.fxn rb() {
        tw hm = hm();
        if (hm == null) {
            return null;
        }
        return hm.rmu();
    }

    public JSONObject fxn(String str, JSONObject jSONObject) {
        try {
            fxn fxnVar = this.gff.get(str);
            if (fxnVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return fxnVar.fxn(jSONObject);
        } catch (Throwable th) {
            sg.fxn("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void kg() {
        hie.fxn(this.fxn, this.hm);
        hie.fxn(this.fxn, this.rb);
        hie.fxn(this.fxn, this.bh);
        hie.fxn(this.fxn, this.f9541sg);
    }
}
