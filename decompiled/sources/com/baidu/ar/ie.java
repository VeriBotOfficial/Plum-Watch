package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import io.nats.client.support.ApiConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ie implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f6988a;
    public Handler b;
    public me c;
    public sd d;

    public class a implements c6 {
        public a() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                String content = iHttpResponse.getContent();
                if (TextUtils.isEmpty(content)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(content);
                if (jSONObject.getInt(ApiConstants.ERR_CODE) != 0) {
                    jSONObject.getString("err_msg");
                    if (ie.this.c != null) {
                        ie.this.c.a(false, null);
                        return;
                    }
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String str = (String) jSONObject2.get("session_id");
                if (jSONObject2.has("srt")) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("srt"));
                    if (jSONObject3.has("scale")) {
                        double d = jSONObject3.getDouble("scale");
                        if (ie.this.c != null) {
                            ie.this.c.a((float) d);
                        }
                    }
                    if (jSONObject3.has("rotation")) {
                        JSONArray jSONArray = jSONObject3.getJSONArray("rotation");
                        float[] fArr = new float[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            fArr[i] = (float) jSONArray.getDouble(i);
                            Log.e("rotation", fArr[i] + "");
                        }
                        if (ie.this.c != null) {
                            ie.this.c.b(fArr);
                        }
                    }
                    if (jSONObject3.has("translation")) {
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("translation");
                        float[] fArr2 = new float[jSONArray2.length()];
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            fArr2[i2] = (float) jSONArray2.getDouble(i2);
                            Log.e("translation", fArr2[i2] + "");
                        }
                        if (ie.this.c != null) {
                            ie.this.c.a(fArr2);
                        }
                    }
                }
                if (TextUtils.isEmpty(str) && ie.this.c != null) {
                    ie.this.c.a(false, null);
                }
                if (ie.this.c != null) {
                    ie.this.c.a(true, str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (ie.this.c != null) {
                    ie.this.c.a(false, null);
                }
            }
        }
    }

    public class b implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class c implements c6 {
        public c() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            Log.e("response trackFrame err", "" + httpException.getMessage());
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                if (ie.this.c == null) {
                    return;
                }
                InputStream stream = iHttpResponse.getStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = stream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        stream.close();
                        ie.this.c.b(byteArray);
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public k2 f6991a;

        public d(Looper looper, k2 k2Var) {
            super(looper);
            this.f6991a = k2Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f6991a.handleMessage(message);
        }
    }

    public ie() {
        HandlerThread handlerThread = new HandlerThread("VpasController");
        this.f6988a = handlerThread;
        handlerThread.start();
        this.b = new d(this.f6988a.getLooper(), this);
    }

    public static TreeMap a() {
        return new TreeMap(new b());
    }

    public void a(me meVar, sd sdVar) {
        this.c = meVar;
        this.d = sdVar;
    }

    public void a(String str) {
        Handler handler = this.b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1001, str));
        }
    }

    public void a(byte[] bArr) {
        je.a(new c(), bArr);
    }

    public final JSONObject b(String str) {
        double d2;
        double d3;
        long currentTimeMillis = System.currentTimeMillis();
        TreeMap a2 = a();
        sd sdVar = this.d;
        if (sdVar == null || sdVar.b() == null) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            d2 = this.d.b()[0];
            d3 = this.d.b()[1];
        }
        a2.put("lat", Double.valueOf(d2));
        a2.put("lng", Double.valueOf(d3));
        a2.put("timestamp", Long.valueOf(currentTimeMillis));
        a2.put("ar_key", Long.valueOf(Long.parseLong(str)));
        a2.put("app_id", Integer.valueOf(Integer.parseInt(DuMixARConfig.getAipAppId())));
        String a3 = ne.a(a2);
        a2.put("sign", a3.toUpperCase());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lat", d2);
            jSONObject.put("lng", d3);
            jSONObject.put("timestamp", currentTimeMillis);
            jSONObject.put("ar_key", Long.parseLong(str));
            jSONObject.put("app_id", Integer.parseInt(DuMixARConfig.getAipAppId()));
            jSONObject.put("sign", a3.toUpperCase());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public final void c(String str) {
        je.a(id.l(), b(str), new a());
    }

    @Override // com.baidu.ar.k2
    public void handleMessage(Message message) {
        Object obj;
        int i = message.what;
        if (i != 1001) {
            if (i == 1002 && (obj = message.obj) != null) {
                a((byte[]) obj);
                return;
            }
            return;
        }
        Object obj2 = message.obj;
        if (obj2 != null) {
            c((String) obj2);
        }
    }
}
