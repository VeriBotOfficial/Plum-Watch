package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.rb;
import com.bytedance.sdk.openadsdk.utils.yws;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public abstract class mvp implements rb {
    private fxn hie;

    /* renamed from: sg, reason: collision with root package name */
    private final String f9525sg;
    private final ConcurrentHashMap<String, Object> gff = new ConcurrentHashMap<>();
    private final Object hm = new Object();
    private final Object rb = new Object();
    private final CountDownLatch bh = new CountDownLatch(1);
    private Properties tw = new Properties();
    private volatile boolean jq = false;

    public interface fxn {
        void fxn();

        void kg();
    }

    public mvp(String str, fxn fxnVar) {
        this.f9525sg = str;
        this.hie = fxnVar;
        yws.fxn(new com.bytedance.sdk.component.tw.tw("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.mvp.1
            @Override // java.lang.Runnable
            public void run() {
                mvp.this.fxn(false);
            }
        });
    }

    public String fxn(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        rb();
        return this.tw.getProperty(str, str2);
    }

    private void rb() {
        if (this.jq) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.bh.await(yws.bh() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            dx.fxn("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public int fxn(String str, int i) {
        if (str != null && !str.isEmpty()) {
            rb();
            try {
                return Integer.parseInt(this.tw.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                dx.fxn("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long fxn(String str, long j) {
        if (str != null && !str.isEmpty()) {
            rb();
            try {
                return Long.parseLong(this.tw.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                dx.fxn("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float fxn(String str, float f) {
        if (str != null && !str.isEmpty()) {
            rb();
            try {
                return Float.parseFloat(this.tw.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                dx.fxn("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean fxn(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            rb();
            try {
                return Boolean.parseBoolean(this.tw.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                dx.fxn("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0107 A[Catch: all -> 0x0117, TryCatch #3 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000b, B:12:0x0016, B:22:0x0051, B:23:0x0056, B:24:0x0103, B:26:0x0107, B:28:0x010b, B:29:0x010e, B:30:0x0115, B:45:0x006a, B:46:0x006d, B:49:0x0088, B:50:0x008b, B:51:0x0090, B:36:0x0080, B:37:0x0083, B:54:0x0091, B:56:0x009b, B:59:0x00a5, B:61:0x00ba, B:62:0x00ca, B:64:0x00d0, B:67:0x00e2, B:72:0x00ea, B:80:0x00f5, B:81:0x00f8, B:43:0x0061, B:40:0x0077, B:34:0x0072), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn(boolean r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.mvp.fxn(boolean):void");
    }

    private File bh() {
        return new File(rmu.fxn().getFilesDir(), this.f9525sg);
    }

    public rb.fxn fxn() {
        return new kg();
    }

    public <T> T fxn(String str, T t, rb.kg<T> kgVar) {
        T kg2;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.gff.get(str);
            if (t2 != null) {
                return t2;
            }
            rb();
            String property = this.tw.getProperty(str, null);
            if (property != null && kgVar != null && (kg2 = kgVar.kg(property)) != null) {
                this.gff.put(str, kg2);
                return kg2;
            }
        }
        return t;
    }

    public boolean kg() {
        return this.jq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    public void fxn(Properties properties) {
        FileOutputStream fileOutputStream;
        synchronized (this.rb) {
            File bh = bh();
            FileOutputStream fileOutputStream2 = null;
            FileOutputStream fileOutputStream3 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(bh);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                properties.store(fileOutputStream, (String) null);
                ?? r2 = "success";
                new Object[]{"saveToLocal: save to", bh.getAbsolutePath(), "success"};
                com.bytedance.sdk.openadsdk.utils.rlu.fxn(fileOutputStream);
                fileOutputStream2 = r2;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream3 = fileOutputStream;
                dx.fxn("SdkSettings.Prop", "saveToLocal: ", e);
                fileOutputStream2 = fileOutputStream3;
                if (fileOutputStream3 != null) {
                    com.bytedance.sdk.openadsdk.utils.rlu.fxn(fileOutputStream3);
                    fileOutputStream2 = fileOutputStream3;
                }
                rlu.oox();
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    com.bytedance.sdk.openadsdk.utils.rlu.fxn(fileOutputStream2);
                }
                throw th;
            }
        }
        rlu.oox();
    }

    public void gff() {
        File bh = bh();
        if (bh.exists()) {
            bh.delete();
        }
    }

    public class kg implements rb.fxn {
        private final Map<String, Object> kg = new HashMap();
        private final Object gff = new Object();

        public kg() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public void fxn() {
            Object obj;
            new Object[]{"commit: ", this.kg};
            Properties properties = new Properties();
            synchronized (this.gff) {
                properties.putAll(mvp.this.tw);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.kg.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != this && value != null) {
                        if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                    }
                    if (properties.containsKey(key)) {
                        properties.remove(key);
                        z = true;
                    }
                }
                this.kg.clear();
                if (z) {
                    mvp.this.fxn(properties);
                    mvp.this.tw = properties;
                    mvp.this.gff.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str, String str2) {
            synchronized (this.gff) {
                this.kg.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str, int i) {
            synchronized (this.gff) {
                this.kg.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str, long j) {
            synchronized (this.gff) {
                this.kg.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str) {
            synchronized (this.gff) {
                this.kg.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str, float f) {
            synchronized (this.gff) {
                this.kg.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.rb.fxn
        public rb.fxn fxn(String str, boolean z) {
            synchronized (this.gff) {
                this.kg.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    protected void hm() {
        fxn fxnVar = this.hie;
        if (fxnVar != null) {
            fxnVar.kg();
        }
    }
}
