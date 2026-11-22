package com.baidu.mapsdkplatform.comapi.a.a;

import android.content.Context;
import android.os.Build;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comapi.util.f;
import com.baidu.mapsdkplatform.comapi.util.g;
import com.baidu.mapsdkplatform.comjni.util.JNIHandler;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

/* compiled from: NativeCrashUtil.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f8330a = "";
    private static String b = "";
    private static String c = "";
    private Context d;

    /* compiled from: NativeCrashUtil.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            if (f.b().a() == null) {
                return;
            }
            File file = new File(b.f8330a);
            if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
                return;
            }
            try {
                Arrays.sort(listFiles, new c());
            } catch (Exception unused) {
            }
            int length = listFiles.length;
            if (length > 10) {
                length = 10;
            }
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                if (!file2.isDirectory() && file2.exists() && file2.isFile() && file2.getName().contains(b.b)) {
                    if (file2.getName().endsWith(".txt")) {
                        b.this.b(file2);
                    } else if (file2.getName().endsWith(".zip") && file2.exists()) {
                        b.this.b(file2);
                    }
                }
            }
            if (listFiles.length > 10) {
                b.this.a(listFiles);
            }
        }
    }

    /* compiled from: NativeCrashUtil.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.a.a.b$b, reason: collision with other inner class name */
    private static final class C0374b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f8332a = new b();
    }

    public static b c() {
        return C0374b.f8332a;
    }

    private void d() {
        File filesDir;
        Context context = this.d;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return;
        }
        String path = filesDir.getPath();
        if (path.isEmpty()) {
            return;
        }
        String str = path + File.separator + "crash";
        File file = new File(str);
        if (file.exists()) {
            f8330a = str;
        } else if (file.mkdir()) {
            f8330a = str;
        } else {
            f8330a = path;
        }
    }

    private HttpURLConnection e() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.map.baidu.com/lbs_sdkcc/report").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "keep-alive");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=bd_map_sdk_cc");
            httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setConnectTimeout(10000);
            return httpURLConnection;
        } catch (Exception unused) {
            return null;
        }
    }

    private void f() {
        String str;
        String str2 = f8330a;
        if (str2 == null || str2.isEmpty() || (str = b) == null || str.isEmpty()) {
            return;
        }
        String str3 = f8330a + File.separator + b;
        com.baidu.mapsdkplatform.comapi.a.a.a.a().a(str3);
        JNIHandler.registerNativeHandler(str3);
    }

    private void g() {
        if (NetworkUtil.isNetworkAvailable(this.d)) {
            new Thread(new a()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[Catch: all -> 0x000f, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #13 {, blocks: (B:11:0x000b, B:47:0x00d4, B:51:0x00db, B:55:0x00e1, B:100:0x00f7, B:88:0x00fe, B:93:0x0106, B:94:0x0109, B:79:0x010f, B:68:0x0116, B:75:0x011e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(java.io.File r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapsdkplatform.comapi.a.a.b.b(java.io.File):boolean");
    }

    public void a(Context context) {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            c = strArr[0];
        }
        this.d = context;
        String g = g.g();
        if (g.isEmpty()) {
            return;
        }
        if (g.contains("_")) {
            g = g.replaceAll("_", "");
        }
        b = g + "_" + g.o() + "_";
        d();
        f();
        g();
    }

    public void a(String str, String str2) {
        JNIHandler.addLog(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length - 10; i++) {
            int i2 = i + 10;
            File file = fileArr[i2];
            if (file != null && file.exists()) {
                fileArr[i2].delete();
            }
        }
    }

    private StringBuilder a(File file) {
        String[] split = file.getName().substring(0, file.getName().length() - 4).split("_");
        StringBuilder sb = new StringBuilder();
        sb.append("--bd_map_sdk_cc\r\nContent-Disposition: form-data; name=\"phoneinfo\"\r\n\r\n");
        sb.append(URLDecoder.decode(SyncSysInfo.getPhoneInfo() + "&abi=" + c));
        sb.append("\r\n--bd_map_sdk_cc\r\n");
        String str = split[0];
        if (str != null && !str.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"packname\"\r\n\r\n");
            sb.append(split[0]);
            sb.append("\r\n--bd_map_sdk_cc\r\n");
        }
        String str2 = split[1];
        if (str2 != null && !str2.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"version\"\r\n\r\n");
            sb.append(split[1]);
            sb.append("\r\n--bd_map_sdk_cc\r\n");
        }
        String str3 = split[2];
        if (str3 != null && !str3.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"timestamp\"\r\n\r\n");
            sb.append(split[2]);
            sb.append("\r\n--bd_map_sdk_cc\r\n");
        }
        sb.append("Content-Disposition: form-data; name=\"os\"\r\n\r\nandroid\r\n--bd_map_sdk_cc\r\n");
        return sb;
    }

    private byte[] a(byte[] bArr) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                try {
                    outputStream.close();
                    inputStream.close();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
