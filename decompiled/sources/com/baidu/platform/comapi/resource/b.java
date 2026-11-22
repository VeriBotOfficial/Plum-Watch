package com.baidu.platform.comapi.resource;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.util.MD5;
import com.baidu.platform.comapi.util.SysOSUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: ResourceManager.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8665a = new b();
    private final SharedPreferences b = JNIInitializer.getCachedContext().getSharedPreferences("engine_resource_sp", 0);

    private b() {
    }

    private boolean b(File file, byte[] bArr) {
        if (file != null && file.exists() && bArr != null) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr2 = new byte[fileInputStream2.available()];
                    fileInputStream2.read(bArr2);
                    if (Arrays.equals(bArr2, bArr)) {
                        a.a(fileInputStream2);
                        return false;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    a.a(fileInputStream);
                    throw th;
                }
                fileInputStream = fileInputStream2;
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            a.a(fileInputStream);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0013, B:26:0x001d, B:28:0x002d, B:10:0x004d, B:14:0x005a, B:15:0x005e, B:17:0x0064), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(com.baidu.platform.comapi.resource.ResourceList r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            android.content.Context r0 = com.baidu.platform.comapi.JNIInitializer.getCachedContext()     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = r12.a()     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L8a
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L8a
            java.lang.String r6 = "/ver.dat"
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L54 java.lang.Throwable -> L8a
            byte[] r2 = r13.resVer()     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L8a
            boolean r6 = r12.b(r5, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L8a
            if (r6 == 0) goto L4d
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.String[] r13 = r13.resList()     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            r7 = 65536(0x10000, float:9.1835E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            int r8 = r13.length     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            r9 = r1
        L2b:
            if (r9 >= r8) goto L4d
            r3 = r13[r9]     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            r10.<init>()     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.StringBuilder r10 = r10.append(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.String r11 = "/"
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.StringBuilder r10 = r10.append(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            boolean r3 = r12.a(r0, r7, r3, r10)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            int r9 = r9 + 1
            goto L2b
        L4d:
            r12.a(r4)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L8a
            r1 = r3
            goto L56
        L52:
            r3 = r6
            goto L55
        L54:
            r5 = r2
        L55:
            r6 = r3
        L56:
            if (r6 == 0) goto L5e
            if (r1 == 0) goto L5e
            boolean r1 = r12.a(r5, r2)     // Catch: java.lang.Throwable -> L8a
        L5e:
            boolean r13 = com.baidu.mapapi.OpenLogUtil.isMapLogEnable()     // Catch: java.lang.Throwable -> L8a
            if (r13 == 0) goto L88
            com.baidu.mapsdkplatform.comapi.commonutils.a r13 = com.baidu.mapsdkplatform.comapi.commonutils.a.a()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "initEngineRes firstInit = "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "; isInitSucceed = "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8a
            r13.a(r0)     // Catch: java.lang.Throwable -> L8a
        L88:
            monitor-exit(r12)
            return
        L8a:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8a
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.resource.b.a(com.baidu.platform.comapi.resource.ResourceList):void");
    }

    private String a() {
        String outputDirPath = SysOSUtil.getInstance().getOutputDirPath();
        File file = new File(outputDirPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return outputDirPath;
    }

    private boolean a(AssetManager assetManager, byte[] bArr, String str, String str2) {
        InputStream inputStream = null;
        try {
            if (!TextUtils.isEmpty(str) && str.endsWith(".dir")) {
                String substring = str.substring(0, str.indexOf(".dir"));
                String substring2 = str2.substring(0, str2.indexOf(".dir"));
                String[] list = assetManager.list(substring);
                if (list != null && list.length > 0) {
                    File file = new File(substring2);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.mkdirs();
                    for (String str3 : list) {
                        if (!TextUtils.isEmpty(str3)) {
                            a(assetManager, bArr, substring + "/" + str3, substring2 + "/" + str3);
                        }
                    }
                }
            } else {
                inputStream = assetManager.open(str);
                File file2 = new File(str2);
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.isDirectory()) {
                    parentFile.mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                a.a(inputStream, new FileOutputStream(file2), bArr);
            }
            a.a(inputStream);
            return true;
        } catch (Exception unused) {
            a.a(null);
            return false;
        } catch (Throwable th) {
            a.a(null);
            throw th;
        }
    }

    private boolean a(File file, byte[] bArr) {
        if (file != null && bArr != null) {
            FileOutputStream fileOutputStream = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    a.a(fileOutputStream2);
                    return true;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    a.a(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    private void a(String str) {
        if (this.b == null) {
            return;
        }
        File file = new File(str, "shader/");
        String mD5String = MD5.getMD5String(Build.FINGERPRINT);
        if (!file.exists()) {
            this.b.edit().putString("fingerprint", mD5String).commit();
            return;
        }
        String string = this.b.getString("fingerprint", "");
        if (TextUtils.isEmpty(string) || !(string.equals(mD5String) || MD5.getMD5String(string).equals(mD5String))) {
            a(file);
            if (file.exists()) {
                return;
            }
            this.b.edit().putString("fingerprint", mD5String).commit();
        }
    }

    private static void a(File file) {
        if (file == null) {
            return;
        }
        if (!file.isFile() && (!file.exists() || file.list() == null || file.list().length != 0)) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; i++) {
                    a(listFiles[i]);
                    listFiles[i].delete();
                }
            }
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        file.delete();
    }
}
