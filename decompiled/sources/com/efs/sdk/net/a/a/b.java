package com.efs.sdk.net.a.a;

import androidx.webkit.internal.AssetHelper;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.net.NetManager;
import com.efs.sdk.net.a.a.f;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    Map<String, Long> f9947a = new HashMap();

    static long a(f.b bVar) {
        try {
            if (bVar.d() != null) {
                return r2.length;
            }
            return 0L;
        } catch (IOException | OutOfMemoryError e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static InputStream a(String str, String str2, String str3, InputStream inputStream) {
        Log.i("NetTrace-Interceptor", "save interpret response stream");
        com.efs.sdk.net.a.c a2 = com.efs.sdk.net.a.a.a().a(str);
        a2.j = str2;
        if (str2 != null && (str2.contains("text") || str2.contains(BodyData.TYPE_JSON))) {
            ByteArrayOutputStream a3 = a(inputStream, a2, str3);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a3.toByteArray());
            try {
                a3.close();
                return byteArrayInputStream;
            } catch (IOException e) {
                Log.e("NetTrace-Interceptor", "save interpret response stream, e is ".concat(String.valueOf(e)));
                return byteArrayInputStream;
            }
        }
        a2.m = 0L;
        return inputStream;
    }

    private static ByteArrayOutputStream a(InputStream inputStream, com.efs.sdk.net.a.c cVar, String str) {
        BufferedReader bufferedReader;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                Log.e("NetTrace-Interceptor", "parse and save body, e is ".concat(String.valueOf(e)));
            }
        }
        byteArrayOutputStream.flush();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        if ("gzip".equals(str)) {
            bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(byteArrayInputStream)));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine + '\n');
        }
        String sb2 = sb.toString();
        try {
            if (NetManager.getNetConfigManager().getNetResponseBodyCollectState() && sb2.getBytes().length < 10240 && (cVar.j.contains(com.anythink.core.common.m.a.f3976q) || cVar.j.contains("application/x-www-form-urlencoded") || cVar.j.contains(AssetHelper.DEFAULT_MIME_TYPE))) {
                cVar.k = sb2;
            }
        } catch (Throwable unused) {
        }
        cVar.m = sb2.getBytes().length;
        return byteArrayOutputStream;
    }
}
