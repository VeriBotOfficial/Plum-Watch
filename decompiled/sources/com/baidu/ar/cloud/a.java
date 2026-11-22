package com.baidu.ar.cloud;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.c6;
import com.baidu.ar.f2;
import com.baidu.ar.i2;
import com.baidu.ar.id;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.l2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class a implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f6861a;
    public Handler b;
    public c c;

    /* renamed from: com.baidu.ar.cloud.a$a, reason: collision with other inner class name */
    public class C0327a implements c6 {
        public C0327a() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (a.this.c != null) {
                a.this.c.onResourceResponse(null);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                InputStream stream = iHttpResponse.getStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = stream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                stream.close();
                if (a.this.c != null) {
                    a.this.c.onResourceResponse(byteArray);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements c6 {
        public b() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (a.this.c != null) {
                a.this.c.onRequestLibraryResult(null);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                String content = iHttpResponse.getContent();
                if (TextUtils.isEmpty(content)) {
                    return;
                }
                a.this.b(content);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public interface c {
        void onRequestLibraryResult(String str);

        void onResourceRequest(i2 i2Var);

        void onResourceResponse(byte[] bArr);
    }

    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public l2 f6864a;

        public d(Looper looper, l2 l2Var) {
            super(looper);
            this.f6864a = l2Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f6864a.handleMessage(message);
        }
    }

    public class e {

        /* renamed from: a, reason: collision with root package name */
        public String f6865a;
        public HashMap<String, String> b;
        public byte[] c;

        public e(a aVar, String str, HashMap<String, String> hashMap, byte[] bArr) {
            this.f6865a = str;
            this.b = hashMap;
            this.c = bArr;
        }
    }

    public a() {
        b();
    }

    public final void a() {
        f2.a(new b());
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public final void a(String str) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.onRequestLibraryResult(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[Catch: JSONException -> 0x00c8, TryCatch #0 {JSONException -> 0x00c8, blocks: (B:11:0x002e, B:13:0x0039, B:14:0x0048, B:15:0x004b, B:17:0x0051, B:18:0x0060, B:19:0x0063, B:21:0x0069, B:23:0x0077, B:25:0x0086, B:26:0x008d, B:28:0x0093, B:29:0x009a, B:31:0x00a0, B:32:0x00a7, B:34:0x00ac, B:41:0x0056, B:43:0x005c, B:44:0x003e, B:46:0x0044), top: B:10:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r12, java.util.HashMap<java.lang.String, java.lang.String> r13, byte[] r14) {
        /*
            r11 = this;
            java.lang.String r0 = "image_md5"
            java.lang.String r1 = "ar_type"
            java.lang.String r2 = "ar_key"
            java.lang.String r3 = "err_msg"
            java.lang.String r4 = "errorMsg"
            java.lang.String r5 = "err_code"
            java.lang.String r6 = "errorNum"
            java.lang.String r7 = "data"
            java.lang.String r8 = "云端识图: "
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = com.baidu.ar.f2.a(r12, r13, r14)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L29
            com.baidu.ar.cloud.a$c r12 = r11.c
            if (r12 == 0) goto Ld3
            r13 = 0
            r12.onResourceRequest(r13)
            return
        L29:
            com.baidu.ar.i2 r13 = new com.baidu.ar.i2
            r13.<init>()
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc8
            r14.<init>(r12)     // Catch: org.json.JSONException -> Lc8
            boolean r12 = r14.has(r6)     // Catch: org.json.JSONException -> Lc8
            if (r12 == 0) goto L3e
            int r12 = r14.getInt(r6)     // Catch: org.json.JSONException -> Lc8
            goto L48
        L3e:
            boolean r12 = r14.has(r5)     // Catch: org.json.JSONException -> Lc8
            if (r12 == 0) goto L4b
            int r12 = r14.getInt(r5)     // Catch: org.json.JSONException -> Lc8
        L48:
            r13.a(r12)     // Catch: org.json.JSONException -> Lc8
        L4b:
            boolean r12 = r14.has(r4)     // Catch: org.json.JSONException -> Lc8
            if (r12 == 0) goto L56
            java.lang.String r12 = r14.getString(r4)     // Catch: org.json.JSONException -> Lc8
            goto L60
        L56:
            boolean r12 = r14.has(r3)     // Catch: org.json.JSONException -> Lc8
            if (r12 == 0) goto L63
            java.lang.String r12 = r14.getString(r3)     // Catch: org.json.JSONException -> Lc8
        L60:
            r13.a(r12)     // Catch: org.json.JSONException -> Lc8
        L63:
            boolean r12 = r14.has(r7)     // Catch: org.json.JSONException -> Lc8
            if (r12 == 0) goto Lcc
            java.lang.Object r12 = r14.get(r7)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> Lc8
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: org.json.JSONException -> Lc8
            if (r12 != 0) goto Lcc
            org.json.JSONObject r12 = r14.getJSONObject(r7)     // Catch: org.json.JSONException -> Lc8
            com.baidu.ar.d4 r14 = new com.baidu.ar.d4     // Catch: org.json.JSONException -> Lc8
            r14.<init>()     // Catch: org.json.JSONException -> Lc8
            boolean r3 = r12.has(r2)     // Catch: org.json.JSONException -> Lc8
            if (r3 == 0) goto L8d
            java.lang.String r2 = r12.getString(r2)     // Catch: org.json.JSONException -> Lc8
            r14.a(r2)     // Catch: org.json.JSONException -> Lc8
        L8d:
            boolean r2 = r12.has(r1)     // Catch: org.json.JSONException -> Lc8
            if (r2 == 0) goto L9a
            java.lang.String r1 = r12.getString(r1)     // Catch: org.json.JSONException -> Lc8
            r14.b(r1)     // Catch: org.json.JSONException -> Lc8
        L9a:
            boolean r1 = r12.has(r0)     // Catch: org.json.JSONException -> Lc8
            if (r1 == 0) goto La7
            java.lang.String r12 = r12.getString(r0)     // Catch: org.json.JSONException -> Lc8
            r14.c(r12)     // Catch: org.json.JSONException -> Lc8
        La7:
            r13.a(r14)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r12 = "qatest"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lc8
            r14.<init>(r8)     // Catch: org.json.JSONException -> Lc8
            long r0 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> Lc8
            long r0 = r0 - r9
            java.lang.StringBuilder r14 = r14.append(r0)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r0 = " ms"
            java.lang.StringBuilder r14 = r14.append(r0)     // Catch: org.json.JSONException -> Lc8
            java.lang.String r14 = r14.toString()     // Catch: org.json.JSONException -> Lc8
            android.util.Log.e(r12, r14)     // Catch: org.json.JSONException -> Lc8
            goto Lcc
        Lc8:
            r12 = move-exception
            r12.printStackTrace()
        Lcc:
            com.baidu.ar.cloud.a$c r12 = r11.c
            if (r12 == 0) goto Ld3
            r12.onResourceRequest(r13)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.cloud.a.a(java.lang.String, java.util.HashMap, byte[]):void");
    }

    public final void a(byte[] bArr) {
        f2.a(new C0327a(), bArr);
    }

    public final void b() {
        if (c()) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CloudSearchThread");
        this.f6861a = handlerThread;
        handlerThread.start();
        this.b = new d(this.f6861a.getLooper(), this);
    }

    public final void b(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("err_num")) {
            if (jSONObject.getInt("err_num") == 0 && jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2.has("cloud_recognize")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("cloud_recognize");
                    if (jSONObject3.has("url")) {
                        str2 = jSONObject3.getString("url");
                        a(str2);
                    }
                }
            }
            str2 = null;
            a(str2);
        }
    }

    public void b(byte[] bArr) {
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(1007);
            e eVar = new e(this, id.e(), null, bArr);
            Handler handler2 = this.b;
            handler2.sendMessage(handler2.obtainMessage(1008, eVar));
        }
    }

    public final boolean c() {
        HandlerThread handlerThread = this.f6861a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void d() {
        HandlerThread handlerThread = this.f6861a;
        if (handlerThread != null) {
            handlerThread.getLooper().quit();
        }
        this.c = null;
        this.f6861a = null;
        this.b = null;
    }

    public void e() {
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(1007);
            Handler handler2 = this.b;
            handler2.sendMessage(handler2.obtainMessage(1009));
        }
    }

    @Override // com.baidu.ar.l2
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1001) {
            e eVar = (e) message.obj;
            a(eVar.f6865a, eVar.b, eVar.c);
        } else if (i == 1008) {
            a(((e) message.obj).c);
        } else {
            if (i != 1009) {
                return;
            }
            a();
        }
    }
}
