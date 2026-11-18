package com.baidu.ar.statistic.performance;

import androidx.camera.video.AudioStats;
import com.autonavi.aps.amapapi.config.Const;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7202a;
    public double b;
    public long c;
    public long d;
    public long e;
    public BlockingQueue<C0420a> f = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: com.baidu.ar.statistic.performance.a$a, reason: collision with other inner class name */
    public static class C0420a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7203a;
        public long b;
        public long c;
        public BlockingQueue<C0421a> d = new LinkedBlockingQueue();

        /* JADX INFO: renamed from: com.baidu.ar.statistic.performance.a$a$a, reason: collision with other inner class name */
        public static class C0421a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f7204a;
            public String b;
            public long c;
            public int d;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("case_id", this.f7202a);
            jSONObject.put("cpu_rate", String.valueOf(this.b));
            jSONObject.put("cpu_tc", String.valueOf(this.c));
            jSONObject.put("mem_total", String.valueOf(this.d));
            jSONObject.put("mem_used", String.valueOf(this.e));
            JSONArray jSONArray = new JSONArray();
            for (C0420a c0420a : this.f) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("frame_index", c0420a.f7203a);
                    jSONObject2.put("frame_in", c0420a.b);
                    jSONObject2.put("frame_out", c0420a.c);
                    JSONArray jSONArray2 = new JSONArray();
                    for (C0420a.C0421a c0421a : c0420a.d) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", c0421a.f7204a);
                            jSONObject3.put("func", c0421a.b);
                            jSONObject3.put("time_cost", c0421a.c);
                            jSONObject3.put(Const.SP_KEY_CALL_LOC_COUNT, c0421a.d);
                            jSONArray2.put(jSONObject3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    jSONObject2.put("algo_data", jSONArray2);
                    jSONArray.put(jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            jSONObject.put("frame_data", jSONArray);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    public void b() {
        this.f7202a = null;
        this.b = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = new LinkedBlockingQueue();
    }
}
