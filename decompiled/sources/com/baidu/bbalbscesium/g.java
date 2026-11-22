package com.baidu.bbalbscesium;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes12.dex */
public class g {
    private static final boolean c = false;
    private static final String d = "CuidV266Manager";
    private static final String e = "com.baidu.deviceid";
    private static final String f = "com.baidu.deviceid.v2";
    private static final String g = "backups/.SystemConfig";
    private static final String h = ".cuid2";
    private static final String i = "bd_setting_i";
    private static final String j = "";
    private static final String k = ".cuid";
    private static final String l = "baidu";
    private static final boolean m = false;

    /* renamed from: a, reason: collision with root package name */
    private Context f7381a;
    private d b;

    public g(Context context, d dVar) {
        this.f7381a = context;
        this.b = dVar;
    }

    private f a() {
        return f.a(e(e), e(i));
    }

    private f a(Context context) {
        List<c> b = this.b.b(context);
        f fVar = null;
        if (b != null) {
            File filesDir = context.getFilesDir();
            String str = "files";
            if (!"files".equals(filesDir.getName())) {
                Log.e(d, "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                str = filesDir.getName();
            }
            for (c cVar : b) {
                if (!cVar.d) {
                    File file = new File(new File(cVar.f7377a.dataDir, str), f.g);
                    if (file.exists() && (fVar = f.a(com.baidu.bbalbscesium.o.c.a(file))) != null) {
                        break;
                    }
                }
            }
        }
        return fVar;
    }

    private boolean a(String str) {
        return this.f7381a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private f b() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            return f.a(com.baidu.bbalbscesium.o.c.a(file));
        }
        return null;
    }

    private String c(String str) {
        return "0";
    }

    private f d(String str) {
        String str2;
        String[] split;
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] a2 = com.baidu.bbalbscesium.k.a.g.a();
            split = new String(com.baidu.bbalbscesium.k.a.c.a(a2, a2, com.baidu.bbalbscesium.m.b.a(sb.toString().getBytes()))).split("=");
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        if (split != null && split.length == 2) {
            str2 = split[0];
            try {
                str3 = split[1];
            } catch (FileNotFoundException | IOException | Exception unused2) {
            }
            return f.a(str3, str2);
        }
        str2 = "";
        return f.a(str3, str2);
    }

    private String e(String str) {
        try {
            return Settings.System.getString(this.f7381a.getContentResolver(), str);
        } catch (Exception e2) {
            com.baidu.bbalbscesium.o.c.a(e2);
            return null;
        }
    }

    private boolean f(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f7381a.openFileOutput(f.g, 0);
                fileOutputStream.write(str.getBytes());
                fileOutputStream.flush();
                if (fileOutputStream == null) {
                    return true;
                }
                try {
                    fileOutputStream.close();
                    return true;
                } catch (Exception e2) {
                    com.baidu.bbalbscesium.o.c.a(e2);
                    return true;
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e3) {
                        com.baidu.bbalbscesium.o.c.a(e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            com.baidu.bbalbscesium.o.c.a(e4);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    com.baidu.bbalbscesium.o.c.a(e5);
                }
            }
            return false;
        }
    }

    public void a(f fVar) {
        File file = new File(this.f7381a.getFilesDir(), f.g);
        String e2 = fVar.e();
        if (file.exists()) {
            f a2 = f.a(com.baidu.bbalbscesium.o.c.a(file));
            if (a2 != null) {
                if (a2.a()) {
                    f(a2.e());
                    return;
                }
                return;
            } else if (a2 != null) {
                return;
            }
        }
        f(e2);
    }

    public f b(String str) {
        boolean z;
        f a2 = a(this.f7381a);
        if (a2 == null) {
            a2 = f.a(e(f));
        }
        boolean a3 = a("android.permission.READ_EXTERNAL_STORAGE");
        if (a2 == null && a3) {
            a2 = b();
        }
        if (a2 == null) {
            a2 = a();
        }
        if (a2 == null && a3) {
            a2 = d(c(""));
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c("");
        }
        if (a2 != null) {
            a2.a();
        }
        return a2;
    }
}
