package com.baidu.bbalbscesium.n;

import android.content.Context;
import com.baidu.bbalbscesium.k.b.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class a {
    private static final String c = "Cesium";
    private static final boolean d = false;
    private static final String e = ".cesium";

    /* renamed from: a, reason: collision with root package name */
    private Context f7438a;
    private C0340a b;

    /* renamed from: com.baidu.bbalbscesium.n.a$a, reason: collision with other inner class name */
    public final class C0340a {

        /* renamed from: a, reason: collision with root package name */
        private File f7439a;
        private String b;
        private C0340a c;
        private boolean d = true;

        C0340a(File file) {
            this.f7439a = file;
            this.b = file.getName();
        }

        C0340a(String str, C0340a c0340a) {
            this.b = str;
            this.c = c0340a;
        }

        public C0340a a(File file) {
            if (this.d) {
                throw new IllegalStateException("isolate session is not support");
            }
            ArrayList arrayList = new ArrayList();
            C0340a c0340a = this;
            do {
                arrayList.add(c0340a.c());
                c0340a = c0340a.d();
            } while (c0340a != null);
            int size = arrayList.size() - 1;
            while (size >= 0) {
                File file2 = new File(file, (String) arrayList.get(size));
                size--;
                file = file2;
            }
            return a.this.new C0340a(file);
        }

        public File a(String str) {
            return new File(this.f7439a, str);
        }

        public String a(String str, boolean z) {
            return a.a(b(), str, "UTF-8", z);
        }

        public void a() {
            b().mkdirs();
        }

        public boolean a(String str, String str2, boolean z) {
            return a.a(b(), str, str2, "UTF-8", z);
        }

        public C0340a b(String str) {
            return a.this.new C0340a(str, this);
        }

        public File b() {
            File file = this.f7439a;
            if (file != null) {
                return file;
            }
            File file2 = this.c == null ? new File(a.this.a(), this.b) : new File(this.c.b(), this.b);
            this.f7439a = file2;
            return file2;
        }

        public String c() {
            return this.b;
        }

        public C0340a d() {
            return this.c;
        }
    }

    public a(Context context) {
        this.f7438a = context;
        b().mkdirs();
    }

    public static String a(File file, String str, String str2, boolean z) {
        FileInputStream fileInputStream;
        a(file);
        File file2 = new File(file, str);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                fileInputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
                th = th;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (z) {
                    byteArray = new c().a(byteArray);
                }
                String str3 = new String(byteArray, str2);
                com.baidu.bbalbscesium.o.c.a(fileInputStream);
                com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream2);
                return str3;
            } catch (Exception unused2) {
                byteArrayOutputStream = byteArrayOutputStream2;
                com.baidu.bbalbscesium.o.c.a(fileInputStream);
                com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream);
                return "";
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                com.baidu.bbalbscesium.o.c.a(fileInputStream);
                com.baidu.bbalbscesium.o.c.a(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void a(File file) {
        file.mkdirs();
    }

    public static boolean a(File file, String str, String str2, String str3, boolean z) {
        FileOutputStream fileOutputStream;
        a(file);
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (z) {
                fileOutputStream.write(new c().b(str2.getBytes()));
            } else {
                fileOutputStream.write(str2.getBytes(str3));
            }
            com.baidu.bbalbscesium.o.c.a(fileOutputStream);
            return true;
        } catch (Exception unused2) {
            fileOutputStream2 = fileOutputStream;
            com.baidu.bbalbscesium.o.c.a(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            com.baidu.bbalbscesium.o.c.a(fileOutputStream2);
            throw th;
        }
    }

    private File b() {
        return new File(a(), e);
    }

    public File a() {
        return new File(this.f7438a.getApplicationInfo().dataDir);
    }

    public synchronized C0340a c() {
        if (this.b == null) {
            this.b = new C0340a(e, null);
        }
        return this.b;
    }
}
