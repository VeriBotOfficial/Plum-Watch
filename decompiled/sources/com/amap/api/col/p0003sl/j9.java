package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: Privacy.java */
/* loaded from: classes11.dex */
public class j9 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f1707a = d.Unknow;
    private static volatile f b = f.Unknow;
    private static volatile String c = "";
    private static volatile String d = "";
    private static volatile long e = -1;
    private static volatile c f = c.Unknow;
    private static volatile long g = -1;
    private static volatile String h = "";
    private static volatile String i = "";
    private static volatile long j = 0;
    private static volatile long k = 0;
    private static volatile boolean l = false;
    private static volatile boolean m = true;

    /* compiled from: Privacy.java */
    static class a extends qc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1708a;

        a(Context context) {
            this.f1708a = context;
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            Iterator it = j9.b(j9.f(this.f1708a)).iterator();
            while (it.hasNext()) {
                j9.a(this.f1708a, ((File) it.next()).getName());
            }
            j9.b(this.f1708a);
        }
    }

    /* compiled from: Privacy.java */
    static class b extends qc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1709a;
        final /* synthetic */ Context b;
        final /* synthetic */ long c;
        final /* synthetic */ JSONObject d;

        b(boolean z, Context context, long j, JSONObject jSONObject) {
            this.f1709a = z;
            this.b = context;
            this.c = j;
            this.d = jSONObject;
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            if (this.f1709a) {
                Iterator it = j9.b(j9.f(this.b)).iterator();
                while (it.hasNext()) {
                    j9.a(this.b, ((File) it.next()).getName());
                }
            }
            j9.d(this.b);
            j9.a(this.b, this.d, this.c);
            boolean b = j9.b(this.b, this.d);
            if (b) {
                j9.b(this.b, j9.b(this.c));
            }
            if (this.f1709a) {
                j9.b(this.b);
            }
            if (b) {
                return;
            }
            j9.a(this.b, j9.b(this.c));
        }
    }

    /* compiled from: Privacy.java */
    public enum c {
        Unknow(-1),
        NotAgree(0),
        DidAgree(1);


        /* renamed from: a, reason: collision with root package name */
        private int f1710a;

        c(int i) {
            this.f1710a = i;
        }

        public final int a() {
            return this.f1710a;
        }
    }

    /* compiled from: Privacy.java */
    public enum d {
        Unknow(-1),
        NotContain(0),
        DidContain(1);


        /* renamed from: a, reason: collision with root package name */
        private int f1711a;

        d(int i) {
            this.f1711a = i;
        }

        public final int a() {
            return this.f1711a;
        }
    }

    /* compiled from: Privacy.java */
    public enum e {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(20001);


        /* renamed from: a, reason: collision with root package name */
        private final int f1712a;

        e(int i) {
            this.f1712a = i;
        }

        public final int a() {
            return this.f1712a;
        }
    }

    /* compiled from: Privacy.java */
    public enum f {
        Unknow(-1),
        NotShow(0),
        DidShow(1);


        /* renamed from: a, reason: collision with root package name */
        private int f1713a;

        f(int i) {
            this.f1713a = i;
        }

        public final int a() {
            return this.f1713a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, JSONObject jSONObject) {
        try {
            qa qaVar = new qa();
            qaVar.p = context;
            qaVar.o = jSONObject;
            JSONObject jSONObject2 = new JSONObject(m9.c(new hb().a(qaVar).f1837a));
            if (jSONObject2.has("status")) {
                return jSONObject2.getInt("status") == 1;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context) {
        synchronized (j9.class) {
            if (context == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            try {
                wa.a(context, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", Integer.valueOf(f1707a.a()), Integer.valueOf(b.a()), Long.valueOf(e), c, d, Integer.valueOf(f.a()), Long.valueOf(g), h, i, Long.valueOf(j), Long.valueOf(k)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void e(Context context) {
        String str;
        try {
            str = wa.a(context, "AMap.privacy.data", "AMap.privacy.data");
        } catch (Throwable th) {
            th.printStackTrace();
            str = null;
        }
        if (str == null) {
            return;
        }
        String[] split = str.split("&");
        if (split.length != 11) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            d dVar = d.NotContain;
            if (parseInt != 0) {
                dVar = d.DidContain;
                if (parseInt != 1) {
                    dVar = d.Unknow;
                }
            }
            f1707a = dVar;
            int parseInt2 = Integer.parseInt(split[1]);
            f fVar = f.NotShow;
            if (parseInt2 != 0) {
                fVar = f.DidShow;
                if (parseInt2 != 1) {
                    fVar = f.Unknow;
                }
            }
            b = fVar;
            e = Long.parseLong(split[2]);
            d = split[3];
            d = split[4];
            int parseInt3 = Integer.parseInt(split[5]);
            c cVar = c.NotAgree;
            if (parseInt3 != 0) {
                cVar = c.DidAgree;
                if (parseInt3 != 1) {
                    cVar = c.Unknow;
                }
            }
            f = cVar;
            g = Long.parseLong(split[6]);
            h = split[7];
            i = split[8];
            j = Long.parseLong(split[9]);
            k = Long.parseLong(split[10]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Upload";
    }

    public static void a(Context context, boolean z, boolean z2, l9 l9Var) {
        f fVar;
        d dVar;
        if (z2) {
            fVar = f.DidShow;
        } else {
            fVar = f.NotShow;
        }
        if (z) {
            dVar = d.DidContain;
        } else {
            dVar = d.NotContain;
        }
        synchronized (j9.class) {
            if (context != null && l9Var != null) {
                if (!l) {
                    e(context);
                    l = true;
                }
                Boolean bool = Boolean.FALSE;
                if (fVar != b) {
                    bool = Boolean.TRUE;
                    b = fVar;
                }
                if (dVar != f1707a) {
                    bool = Boolean.TRUE;
                    f1707a = dVar;
                }
                if (bool.booleanValue()) {
                    c = l9Var.d();
                    d = l9Var.e();
                    long currentTimeMillis = System.currentTimeMillis();
                    e = currentTimeMillis;
                    j = currentTimeMillis;
                    d(context);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j2) {
        return String.format("%d-%s", Long.valueOf(j2), "privacy.data");
    }

    static void b(Context context) {
        try {
            Iterator<File> it = b(context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload").iterator();
            while (it.hasNext()) {
                File next = it.next();
                try {
                    String name = next.getName();
                    if (!name.endsWith("-privacy.data")) {
                        next.delete();
                    } else {
                        String[] split = name.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        if (split == null && split.length != 2) {
                            next.delete();
                        } else if (Long.parseLong(split[0]) <= 0) {
                            next.delete();
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(next);
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            if (b(context, new JSONObject(new String(wa.b(context, bArr))))) {
                                next.delete();
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(Context context, boolean z, l9 l9Var) {
        c cVar;
        if (z) {
            cVar = c.DidAgree;
        } else {
            cVar = c.NotAgree;
        }
        synchronized (j9.class) {
            if (context != null && l9Var != null) {
                if (!l) {
                    e(context);
                    l = true;
                }
                if (cVar != f) {
                    f = cVar;
                    h = l9Var.d();
                    i = l9Var.e();
                    long currentTimeMillis = System.currentTimeMillis();
                    g = currentTimeMillis;
                    j = currentTimeMillis;
                    d(context);
                }
            }
        }
    }

    public static synchronized k9 a(Context context, l9 l9Var) {
        boolean z;
        Context context2;
        synchronized (j9.class) {
            if (context != null && l9Var != null) {
                if (!l) {
                    e(context);
                    l = true;
                }
                k9 k9Var = null;
                if (b != f.DidShow) {
                    if (b == f.Unknow) {
                        k9Var = new k9(e.ShowUnknowCode, l9Var);
                    } else if (b == f.NotShow) {
                        k9Var = new k9(e.ShowNoShowCode, l9Var);
                    }
                    z = false;
                } else {
                    z = true;
                }
                if (z && f1707a != d.DidContain) {
                    if (f1707a == d.Unknow) {
                        k9Var = new k9(e.InfoUnknowCode, l9Var);
                    } else if (f1707a == d.NotContain) {
                        k9Var = new k9(e.InfoNotContainCode, l9Var);
                    }
                    z = false;
                }
                if (z && f != c.DidAgree) {
                    if (f == c.Unknow) {
                        k9Var = new k9(e.AgreeUnknowCode, l9Var);
                    } else if (f == c.NotAgree) {
                        k9Var = new k9(e.AgreeNotAgreeCode, l9Var);
                    }
                    z = false;
                }
                if (k != j) {
                    long j2 = j;
                    k = j;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("privacyInfo", f1707a.a());
                        jSONObject.put("privacyShow", b.a());
                        jSONObject.put("showTime", e);
                        jSONObject.put("show2SDK", c);
                        jSONObject.put("show2SDKVer", d);
                        jSONObject.put("privacyAgree", f.a());
                        jSONObject.put("agreeTime", g);
                        jSONObject.put("agree2SDK", h);
                        jSONObject.put("agree2SDKVer", i);
                        context2 = context;
                        pc.d().b(new b(m, context2, j2, jSONObject));
                    } catch (Throwable unused) {
                        context2 = context;
                    }
                } else {
                    context2 = context;
                    if (m) {
                        pc.d().b(new a(context2));
                    }
                }
                m = false;
                String e2 = z8.e(context2);
                if (e2 == null || e2.length() <= 0) {
                    k9Var = new k9(e.InvaildUserKeyCode, l9Var);
                    Log.e(l9Var.d(), String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(k9Var.f1729a.a()), k9Var.b));
                }
                if (z) {
                    k9Var = new k9(e.SuccessCode, l9Var);
                } else {
                    Log.e(l9Var.d(), String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(k9Var.f1729a.a()), k9Var.b));
                }
                return k9Var;
            }
            return new k9(e.IllegalArgument, l9Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<File> b(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void b(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(f(context) + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static void a(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(f(context) + "/" + str);
            if (file.exists()) {
                File file2 = new File((context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload") + "/" + str);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file.renameTo(file2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void a(Context context, JSONObject jSONObject, long j2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        try {
            byte[] a2 = wa.a(context, jSONObject.toString().getBytes());
            File file = new File(f(context) + "/" + b(j2));
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(a2);
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                } catch (Throwable th5) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th6.printStackTrace();
                        }
                    }
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            fileOutputStream = null;
        }
    }
}
