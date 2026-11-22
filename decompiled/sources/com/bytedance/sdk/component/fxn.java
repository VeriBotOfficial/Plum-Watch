package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class fxn {
    protected static InterfaceC0478fxn fxn = null;
    private static boolean kg = false;
    private static ArrayMap<String, File> mvp;
    private static ArrayMap<File, fxn> rlu;
    private volatile boolean bh;
    private final File dgx;
    private final Object gff;
    private final File hie;
    private final Object hm;
    private long jq;
    private Properties rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9361sg;
    private long tw;

    /* renamed from: com.bytedance.sdk.component.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0478fxn {
        ExecutorService getExecutorService();

        HandlerThread getSafeHandlerThread(String str, int i);
    }

    static /* synthetic */ long bh(fxn fxnVar) {
        long j = fxnVar.tw;
        fxnVar.tw = 1 + j;
        return j;
    }

    static /* synthetic */ int jq(fxn fxnVar) {
        int i = fxnVar.f9361sg;
        fxnVar.f9361sg = i - 1;
        return i;
    }

    static /* synthetic */ int rb(fxn fxnVar) {
        int i = fxnVar.f9361sg;
        fxnVar.f9361sg = i + 1;
        return i;
    }

    public static void fxn(InterfaceC0478fxn interfaceC0478fxn) {
        fxn = interfaceC0478fxn;
    }

    public static fxn fxn(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (fxn.class) {
            if (mvp == null) {
                mvp = new ArrayMap<>();
            }
            File file = mvp.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                mvp.put(str, file);
            }
            if (rlu == null) {
                rlu = new ArrayMap<>();
            }
            fxn fxnVar = rlu.get(file);
            if (fxnVar != null) {
                return fxnVar;
            }
            fxn fxnVar2 = new fxn(file);
            rlu.put(file, fxnVar2);
            return fxnVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.fxn$1] */
    private fxn(File file) {
        Object obj = new Object();
        this.gff = obj;
        this.hm = new Object();
        this.rb = new Properties();
        this.bh = false;
        this.f9361sg = 0;
        this.hie = file;
        this.dgx = fxn(file);
        synchronized (obj) {
            this.bh = false;
        }
        InterfaceC0478fxn interfaceC0478fxn = fxn;
        if (interfaceC0478fxn == null || interfaceC0478fxn.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.fxn.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    fxn.this.fxn();
                }
            }.start();
        } else {
            fxn.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.fxn.2
                @Override // java.lang.Runnable
                public void run() {
                    fxn.this.fxn();
                }
            });
        }
    }

    static File fxn(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00b3 -> B:32:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fxn() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fxn.fxn():void");
    }

    private void hm() {
        while (!this.bh) {
            try {
                this.gff.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public String fxn(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.gff) {
            hm();
            property = this.rb.getProperty(str, str2);
        }
        return property;
    }

    public int fxn(String str, int i) {
        int parseInt;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gff) {
                try {
                    try {
                        hm();
                        parseInt = Integer.parseInt(this.rb.getProperty(str, String.valueOf(i)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseInt;
        }
        return i;
    }

    public long fxn(String str, long j) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gff) {
                try {
                    try {
                        hm();
                        parseLong = Long.parseLong(this.rb.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseLong;
        }
        return j;
    }

    public float fxn(String str, float f) {
        float parseFloat;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gff) {
                try {
                    try {
                        hm();
                        parseFloat = Float.parseFloat(this.rb.getProperty(str, String.valueOf(f)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseFloat;
        }
        return f;
    }

    public boolean fxn(String str, boolean z) {
        boolean parseBoolean;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.gff) {
                try {
                    try {
                        hm();
                        parseBoolean = Boolean.parseBoolean(this.rb.getProperty(str, String.valueOf(z)));
                    } catch (NumberFormatException e) {
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parseBoolean;
        }
        return z;
    }

    public boolean fxn(String str) {
        boolean containsKey;
        synchronized (this.gff) {
            try {
                try {
                    hm();
                    containsKey = this.rb.containsKey(str);
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containsKey;
    }

    public gff kg() {
        return new gff();
    }

    private static class kg {
        final long fxn;
        final CountDownLatch gff;
        volatile boolean hm;
        final Properties kg;
        boolean rb;

        private kg(long j, Properties properties) {
            this.gff = new CountDownLatch(1);
            this.hm = false;
            this.rb = false;
            this.fxn = j;
            this.kg = properties;
        }

        void fxn(boolean z, boolean z2) {
            this.rb = z;
            this.hm = z2;
            this.gff.countDown();
        }
    }

    public class gff implements SharedPreferences.Editor {
        private final Object kg = new Object();
        private final Map<String, Object> gff = new HashMap();
        private boolean hm = false;

        public gff() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return fxn(str, (Set<String>) set);
        }

        public gff fxn(String str, Set<String> set) {
            synchronized (this.kg) {
                this.gff.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff putInt(String str, int i) {
            synchronized (this.kg) {
                this.gff.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff putLong(String str, long j) {
            synchronized (this.kg) {
                this.gff.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff putFloat(String str, float f) {
            synchronized (this.kg) {
                this.gff.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff putString(String str, String str2) {
            synchronized (this.kg) {
                this.gff.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff putBoolean(String str, boolean z) {
            synchronized (this.kg) {
                this.gff.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff remove(String str) {
            synchronized (this.kg) {
                this.gff.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public gff clear() {
            synchronized (this.kg) {
                this.hm = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long currentTimeMillis = fxn.kg ? System.currentTimeMillis() : 0L;
            kg kg = kg();
            fxn.this.fxn(kg, true);
            try {
                kg.gff.await();
                if (fxn.kg) {
                    Log.d("TTPropHelper", fxn.this.hie.getName() + ":" + kg.fxn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                return kg.hm;
            } catch (InterruptedException unused) {
                if (!fxn.kg) {
                    return false;
                }
                Log.d("TTPropHelper", fxn.this.hie.getName() + ":" + kg.fxn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (fxn.kg) {
                    Log.d("TTPropHelper", fxn.this.hie.getName() + ":" + kg.fxn + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            fxn.this.fxn(kg(), false);
        }

        private kg kg() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (fxn.this.gff) {
                if (fxn.this.f9361sg > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(fxn.this.rb);
                    fxn.this.rb = properties2;
                }
                properties = fxn.this.rb;
                fxn.rb(fxn.this);
                synchronized (this.kg) {
                    boolean z2 = false;
                    if (this.hm) {
                        if (properties.isEmpty()) {
                            z = false;
                        } else {
                            properties.clear();
                            z = true;
                        }
                        this.hm = false;
                        z2 = z;
                    }
                    for (Map.Entry<String, Object> entry : this.gff.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z2 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z2 = true;
                        }
                    }
                    this.gff.clear();
                    if (z2) {
                        fxn.bh(fxn.this);
                    }
                    j = fxn.this.tw;
                }
            }
            return new kg(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(final kg kgVar, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fxn.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (fxn.this.hm) {
                    try {
                        fxn.this.kg(kgVar, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (fxn.this.gff) {
                    fxn.jq(fxn.this);
                }
            }
        };
        if (z) {
            synchronized (this.gff) {
                z2 = this.f9361sg == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.kg.fxn(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: all -> 0x01a2, TryCatch #3 {all -> 0x01a2, blocks: (B:38:0x0093, B:39:0x0095, B:57:0x0123, B:59:0x0127, B:60:0x012e, B:62:0x0137, B:63:0x013f, B:65:0x014b, B:104:0x01a0, B:105:0x01a1, B:55:0x00e8, B:56:0x0122, B:72:0x00ed, B:73:0x00f3, B:82:0x011b, B:97:0x019e, B:96:0x0195), top: B:37:0x0093, inners: #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137 A[Catch: all -> 0x01a2, TryCatch #3 {all -> 0x01a2, blocks: (B:38:0x0093, B:39:0x0095, B:57:0x0123, B:59:0x0127, B:60:0x012e, B:62:0x0137, B:63:0x013f, B:65:0x014b, B:104:0x01a0, B:105:0x01a1, B:55:0x00e8, B:56:0x0122, B:72:0x00ed, B:73:0x00f3, B:82:0x011b, B:97:0x019e, B:96:0x0195), top: B:37:0x0093, inners: #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #3 {all -> 0x01a2, blocks: (B:38:0x0093, B:39:0x0095, B:57:0x0123, B:59:0x0127, B:60:0x012e, B:62:0x0137, B:63:0x013f, B:65:0x014b, B:104:0x01a0, B:105:0x01a1, B:55:0x00e8, B:56:0x0122, B:72:0x00ed, B:73:0x00f3, B:82:0x011b, B:97:0x019e, B:96:0x0195), top: B:37:0x0093, inners: #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void kg(com.bytedance.sdk.component.fxn.kg r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.fxn.kg(com.bytedance.sdk.component.fxn$kg, boolean):void");
    }
}
