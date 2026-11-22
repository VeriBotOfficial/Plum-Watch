package com.baidu.ar;

import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import io.livekit.android.room.util.MediaConstraintKeys;
import io.nats.client.support.ApiConstants;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class t8 {

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f7220a;

        public a(e eVar) {
            this.f7220a = eVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f7220a.a(false, null, null, null, null);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                t8.this.a(iHttpResponse.getContent(), this.f7220a);
            } catch (Exception e) {
                e.printStackTrace();
                this.f7220a.a(false, "ar inner exception", null, null, null);
            }
        }
    }

    public class b implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f7221a;

        public b(f fVar) {
            this.f7221a = fVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f7221a.onUploadProtobufResult(null, true);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            t8.this.a(iHttpResponse, this.f7221a, true);
        }
    }

    public class c implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f7222a;

        public c(f fVar) {
            this.f7222a = fVar;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            this.f7222a.onUploadProtobufResult(null, false);
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            t8.this.a(iHttpResponse, this.f7222a, false);
        }
    }

    public class d implements Comparator<String> {
        public d(t8 t8Var) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public interface e {
        void a(boolean z, String str, String str2, float[] fArr, String str3);
    }

    public interface f {
        void onUploadProtobufResult(byte[] bArr, boolean z);
    }

    public final String a(Map<String, Object> map) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            if ((map.get(str) instanceof Float) || (map.get(str) instanceof Double)) {
                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                numberInstance.setMaximumFractionDigits(5);
                numberInstance.setRoundingMode(RoundingMode.HALF_DOWN);
                format = new DecimalFormat("0.00000").format(Double.parseDouble(numberInstance.format(map.get(str))));
            } else {
                boolean z = map.get(str) instanceof Boolean;
                Object obj = map.get(str);
                if (z) {
                    format = ((Boolean) obj).booleanValue() ? MediaConstraintKeys.TRUE : "false";
                } else {
                    stringBuffer.append(obj);
                }
            }
            stringBuffer.append(format);
        }
        stringBuffer.append("313d1d593314c7bff96422b0f29432d9c50a");
        return k8.b(stringBuffer.toString());
    }

    public void a() {
        r8.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[Catch: IOException -> 0x0057, TRY_ENTER, TryCatch #1 {IOException -> 0x0057, blocks: (B:20:0x0031, B:28:0x0053, B:30:0x005b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[Catch: IOException -> 0x0057, TRY_LEAVE, TryCatch #1 {IOException -> 0x0057, blocks: (B:20:0x0031, B:28:0x0053, B:30:0x005b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[Catch: IOException -> 0x006c, TRY_LEAVE, TryCatch #8 {IOException -> 0x006c, blocks: (B:46:0x0068, B:39:0x0070), top: B:45:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.baidu.ar.ihttp.IHttpResponse r6, com.baidu.ar.t8.f r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r6 = r6.getStream()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L47
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L40
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        Le:
            int r3 = r6.read(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            goto Le
        L1a:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r1.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r6.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r2 == 0) goto L2e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r3 > 0) goto L2a
            goto L2e
        L2a:
            r7.onUploadProtobufResult(r2, r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            goto L31
        L2e:
            r7.onUploadProtobufResult(r0, r8)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L31:
            r1.close()     // Catch: java.io.IOException -> L57
            r6.close()     // Catch: java.io.IOException -> L57
            return
        L38:
            r7 = move-exception
            goto L66
        L3a:
            r2 = move-exception
            goto L4b
        L3c:
            r7 = move-exception
            r1 = r0
        L3e:
            r0 = r6
            goto L65
        L40:
            r1 = move-exception
            r2 = r1
            goto L4a
        L43:
            r6 = move-exception
            r7 = r6
            r1 = r0
            goto L65
        L47:
            r6 = move-exception
            r2 = r6
            r6 = r0
        L4a:
            r1 = r0
        L4b:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L63
            r7.onUploadProtobufResult(r0, r8)     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.io.IOException -> L57
            goto L59
        L57:
            r6 = move-exception
            goto L5f
        L59:
            if (r6 == 0) goto L62
            r6.close()     // Catch: java.io.IOException -> L57
            goto L62
        L5f:
            r6.printStackTrace()
        L62:
            return
        L63:
            r7 = move-exception
            goto L3e
        L65:
            r6 = r0
        L66:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L6e
        L6c:
            r6 = move-exception
            goto L74
        L6e:
            if (r6 == 0) goto L77
            r6.close()     // Catch: java.io.IOException -> L6c
            goto L77
        L74:
            r6.printStackTrace()
        L77:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.t8.a(com.baidu.ar.ihttp.IHttpResponse, com.baidu.ar.t8$f, boolean):void");
    }

    public void a(byte[] bArr, f fVar) {
        if (fVar == null) {
            return;
        }
        r8.a(id.p(), bArr, new b(fVar));
    }

    public void a(double[] dArr, String str, int i, int i2, e eVar) {
        double d2;
        double d3;
        if (eVar == null) {
            return;
        }
        String m = id.m();
        long currentTimeMillis = System.currentTimeMillis();
        TreeMap<String, Object> b2 = b();
        if (dArr == null) {
            d3 = 0.0d;
            d2 = 0.0d;
        } else {
            d2 = dArr[0];
            d3 = dArr[1];
        }
        b2.put("lat", Double.valueOf(d2));
        b2.put("lng", Double.valueOf(d3));
        b2.put("frame_width", String.valueOf(i));
        b2.put("frame_height", String.valueOf(i2));
        b2.put("phonetype", "Android_" + Build.MODEL);
        b2.put("timestamp", Long.valueOf(currentTimeMillis));
        b2.put("version", String.valueOf(o.a()));
        if (!TextUtils.isEmpty(str)) {
            b2.put("building_id", str);
        }
        b2.put("userid", TextUtils.isEmpty(q8.a()) ? "default" : q8.a());
        b2.put("sign", a(b2).toUpperCase());
        r8.a(m, new JSONObject(b2), new a(eVar));
    }

    public final boolean a(String str, e eVar) {
        float[] fArr;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ApiConstants.ERR_CODE) && jSONObject.getInt(ApiConstants.ERR_CODE) != 0) {
                eVar.a(false, jSONObject.getString("err_msg"), null, null, null);
                return true;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String str2 = (String) jSONObject2.get("session_id");
            if (jSONObject2.has(PixelReadParams.DEFAULT_FILTER_ID)) {
                String[] split = jSONObject2.getString(PixelReadParams.DEFAULT_FILTER_ID).split(",");
                float[] fArr2 = new float[split.length];
                for (int i = 0; i < split.length; i++) {
                    fArr2[i] = Float.parseFloat(split[i]);
                }
                fArr = fArr2;
            } else {
                fArr = null;
            }
            String string = jSONObject2.has("conf") ? jSONObject2.getString("conf") : null;
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(true, "success", str2, fArr, string);
                return true;
            }
            eVar.a(false, null, null, null, null);
        }
        return false;
    }

    public final TreeMap<String, Object> b() {
        return new TreeMap<>(new d(this));
    }

    public void b(byte[] bArr, f fVar) {
        r8.a(id.q(), bArr, new c(fVar));
    }
}
