package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.webkit.internal.AssetHelper;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes17.dex */
public class HttpLite {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13146a;
    public static final int b;
    public static final int c;
    private static HttpLite d;
    private static ThreadPoolExecutor e;

    public static abstract class HttpCallback<T> {
        public void onFail(Exception exc) {
        }

        public void onPreExecute() {
        }

        public abstract void onSuccess(T t);

        public void preProcess(T t) {
        }

        public void preSyncTask() {
        }
    }

    static {
        int b2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.g.b();
        f13146a = b2;
        int max = Math.max(2, Math.min(b2 - 1, 4));
        b = max;
        int i = (b2 * 2) + 1;
        c = i;
        ThreadPoolExecutor a2 = oqm.a.a(max, i, "CpcHttpLite", false);
        a2.setKeepAliveTime(60L, TimeUnit.SECONDS);
        a2.allowCoreThreadTimeOut(true);
        e = a2;
    }

    private HttpLite() {
        try {
            Field declaredField = AsyncTask.class.getDeclaredField("sPoolWorkQueue");
            declaredField.setAccessible(true);
            LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) declaredField.get(null);
            Field declaredField2 = linkedBlockingQueue.getClass().getDeclaredField("capacity");
            declaredField2.setAccessible(true);
            declaredField2.set(linkedBlockingQueue, Integer.MAX_VALUE);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(URLConnection uRLConnection, InputStream inputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            int i = 0;
            do {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    inputStream.close();
                    byteArrayOutputStream.close();
                    return new String(byteArrayOutputStream.toByteArray(), "utf-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
            } while (i <= 5242880);
            inputStream.close();
            byteArrayOutputStream.close();
            return "";
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(HttpLite.class, "exp_HttpLite_inputStream2StringSafe", th);
            return "";
        }
    }

    public <T> AsyncTask c(String str, Map map, HttpCallback<T> httpCallback) {
        return c(str, map, null, httpCallback);
    }

    public static HttpLite a() {
        if (d == null) {
            d = new HttpLite();
        }
        return d;
    }

    public <T> AsyncTask c(String str, Map map, Map<String, String> map2, HttpCallback<T> httpCallback) {
        return new b(map, map2, httpCallback).executeOnExecutor(e, str);
    }

    public static String a(Map<String, Object> map) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(entry.getValue() == null ? "" : String.valueOf(entry.getValue()), "UTF-8"));
            sb.append("&");
        }
        int length = sb.length();
        if (length > 2) {
            return sb.toString().substring(0, length - 1);
        }
        return sb.toString();
    }

    static class a<T> extends AsyncTask<String, Integer, e<T>> {

        /* renamed from: a, reason: collision with root package name */
        private HttpCallback<T> f13147a;
        private Map b;
        private Map<String, String> c;

        public a(Map map, Map map2, HttpCallback<T> httpCallback) {
            this.f13147a = httpCallback;
            this.b = map;
            this.c = map2;
        }

        private void a(String str, int i, String str2) {
            try {
                if (!str.contains("callback_url") || this.c == null) {
                    return;
                }
                com.qumeng.overseas.advlib.__remote__.utils.network.b bVar = new com.qumeng.overseas.advlib.__remote__.utils.network.b();
                bVar.f13238a = str;
                String str3 = this.c.containsKey("searchid") ? this.c.get("searchid") : "unknow";
                String str4 = this.c.containsKey("ideaid") ? this.c.get("ideaid") : "0";
                bVar.a("iclicashsid", str3);
                bVar.a("idea_id", str4);
                com.qumeng.overseas.advlib.__remote__.utils.network.c.a(bVar, "jssdk", i, str2);
            } catch (Throwable unused) {
            }
        }

        public boolean isText(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.contains(com.anythink.core.common.m.a.f3976q) || str.contains("application/octet-stream") || str.contains(AssetHelper.DEFAULT_MIME_TYPE);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            HttpCallback<T> httpCallback = this.f13147a;
            if (httpCallback != null) {
                httpCallback.onPreExecute();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:2|3|(2:5|(1:7))|8)|(2:10|11)|(2:13|(8:15|16|(3:20|(4:23|(3:28|29|30)|31|21)|34)|35|(3:37|(3:68|69|70)(2:39|(3:62|63|64)(2:41|(2:43|(1:53)(2:47|(1:49)(2:50|(1:52))))))|61)(1:74)|54|55|56))|75|16|(4:18|20|(1:21)|34)|35|(0)(0)|54|55|56|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x016e, code lost:
        
            r9 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
        
            r9.printStackTrace();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: all -> 0x0173, Exception -> 0x0176, TryCatch #9 {Exception -> 0x0176, all -> 0x0173, blocks: (B:11:0x0049, B:13:0x0052, B:15:0x005d, B:16:0x0066, B:18:0x0070, B:20:0x0076, B:21:0x0080, B:23:0x0086, B:26:0x009e, B:29:0x00a4, B:35:0x00a8, B:37:0x00ba, B:39:0x00dd, B:41:0x00fb, B:43:0x0101, B:45:0x010f, B:47:0x0113, B:49:0x0127, B:50:0x012b, B:52:0x0135, B:53:0x0148, B:74:0x0153), top: B:10:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[Catch: all -> 0x0173, Exception -> 0x0176, TRY_LEAVE, TryCatch #9 {Exception -> 0x0176, all -> 0x0173, blocks: (B:11:0x0049, B:13:0x0052, B:15:0x005d, B:16:0x0066, B:18:0x0070, B:20:0x0076, B:21:0x0080, B:23:0x0086, B:26:0x009e, B:29:0x00a4, B:35:0x00a8, B:37:0x00ba, B:39:0x00dd, B:41:0x00fb, B:43:0x0101, B:45:0x010f, B:47:0x0113, B:49:0x0127, B:50:0x012b, B:52:0x0135, B:53:0x0148, B:74:0x0153), top: B:10:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0153 A[Catch: all -> 0x0173, Exception -> 0x0176, TRY_LEAVE, TryCatch #9 {Exception -> 0x0176, all -> 0x0173, blocks: (B:11:0x0049, B:13:0x0052, B:15:0x005d, B:16:0x0066, B:18:0x0070, B:20:0x0076, B:21:0x0080, B:23:0x0086, B:26:0x009e, B:29:0x00a4, B:35:0x00a8, B:37:0x00ba, B:39:0x00dd, B:41:0x00fb, B:43:0x0101, B:45:0x010f, B:47:0x0113, B:49:0x0127, B:50:0x012b, B:52:0x0135, B:53:0x0148, B:74:0x0153), top: B:10:0x0049 }] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.qumeng.overseas.advlib.__remote__.ui.incite.e<T> doInBackground(java.lang.String... r9) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.a.doInBackground(java.lang.String[]):com.qumeng.overseas.advlib.__remote__.ui.incite.e");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(e<T> eVar) {
            if (this.f13147a == null || eVar == null) {
                return;
            }
            if (eVar.d()) {
                this.f13147a.onSuccess(eVar.c());
            } else {
                this.f13147a.onFail(eVar.b());
            }
        }
    }

    public static Map<String, Object> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length > 0) {
                hashMap.put(split[0], URLDecoder.decode(split.length > 1 ? split[1] : ""));
            }
        }
        return hashMap;
    }

    public <T> void b(String str, Map map, HttpCallback<T> httpCallback) {
        a(str, map, null, httpCallback);
    }

    public <T> void b(String str, Map map, Map<String, String> map2, HttpCallback<T> httpCallback) {
        a(str, map, map2, httpCallback);
    }

    private static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                byteArrayOutputStream.close();
                return new String(byteArrayOutputStream.toByteArray(), "utf-8");
            }
        }
    }

    public <T> void a(String str, Map map, HttpCallback<T> httpCallback) {
        a(str, map, new h.b().append("id_tkid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.K).getMap(), httpCallback);
    }

    private <T> void a(String str, Map map, Map<String, String> map2, HttpCallback<T> httpCallback) {
        try {
            new a(map, map2, httpCallback).executeOnExecutor(e, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public <T> AsyncTask a(String str, Map map) {
        return new b(map, null, null).execute(str);
    }

    public <T> AsyncTask a(String str, Map map, Map<String, String> map2) {
        return new b(map, map2, null).execute(str);
    }

    public void a(Runnable runnable) {
        try {
            e.execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static class b<T> extends AsyncTask<String, Integer, e<T>> {

        /* renamed from: a, reason: collision with root package name */
        private HttpCallback<T> f13148a;
        private Map b;
        private Map<String, String> c;

        public b(Map map, Map<String, String> map2, HttpCallback<T> httpCallback) {
            this.f13148a = httpCallback;
            this.b = map;
            this.c = map2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
        
            if (r8 == null) goto L46;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.qumeng.overseas.advlib.__remote__.ui.incite.e, com.qumeng.overseas.advlib.__remote__.ui.incite.e<T>] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r2v12, types: [com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite$HttpCallback, com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite$HttpCallback<T>] */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.qumeng.overseas.advlib.__remote__.ui.incite.e<T> doInBackground(java.lang.String... r8) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.b.doInBackground(java.lang.String[]):com.qumeng.overseas.advlib.__remote__.ui.incite.e");
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(e<T> eVar) {
            if (this.f13148a == null || eVar == null) {
                return;
            }
            if (eVar.d()) {
                this.f13148a.onSuccess(eVar.c());
            } else {
                this.f13148a.onFail(eVar.b());
            }
        }
    }
}
