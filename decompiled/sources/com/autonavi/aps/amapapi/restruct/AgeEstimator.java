package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.f9;
import com.autonavi.aps.amapapi.security.Encrypt;
import com.autonavi.aps.amapapi.utils.Utils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public abstract class AgeEstimator<T> {

    /* renamed from: a, reason: collision with root package name */
    private File f6674a;
    private Handler d;
    private String e;
    private boolean f;
    public String mTag;
    private boolean b = false;
    private Map<String, SignalAge> c = new ConcurrentHashMap();
    private Runnable g = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.AgeEstimator.2
        @Override // java.lang.Runnable
        public void run() {
            if (AgeEstimator.this.b) {
                if (AgeEstimator.this.f) {
                    AgeEstimator.d(AgeEstimator.this);
                    AgeEstimator.this.f = false;
                }
                if (AgeEstimator.this.d != null) {
                    AgeEstimator.this.d.postDelayed(AgeEstimator.this.g, 60000L);
                }
            }
        }
    };

    static class SignalAge {

        /* renamed from: a, reason: collision with root package name */
        int f6677a;
        long b;
        long c;

        public SignalAge(int i, long j, long j2) {
            this.f6677a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public AgeEstimator(Context context, String str, Handler handler) {
        this.e = null;
        if (context == null) {
            return;
        }
        this.d = handler;
        this.mTag = TextUtils.isEmpty(str) ? "unknow" : str;
        this.e = Utils.getPackageNameMD5(context);
        try {
            this.f6674a = new File(context.getFilesDir().getPath(), this.mTag);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        c();
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    static void d(AgeEstimator ageEstimator) {
        if (ageEstimator.a() > 0) {
            ageEstimator.c.size();
            if (ageEstimator.b() > 0) {
                long timeBoot = Utils.getTimeBoot();
                Iterator<Map.Entry<String, SignalAge>> it = ageEstimator.c.entrySet().iterator();
                while (it.hasNext()) {
                    if (timeBoot - ageEstimator.c.get(it.next().getKey()).c > ageEstimator.b()) {
                        it.remove();
                    }
                }
            }
            if (ageEstimator.c.size() > ageEstimator.a()) {
                ArrayList arrayList = new ArrayList(ageEstimator.c.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.autonavi.aps.amapapi.restruct.AgeEstimator.1
                    @Override // java.util.Comparator
                    public int compare(String str, String str2) {
                        return AgeEstimator.compare(((SignalAge) AgeEstimator.this.c.get(str2)).c, ((SignalAge) AgeEstimator.this.c.get(str)).c);
                    }
                });
                for (int a2 = (int) ageEstimator.a(); a2 < arrayList.size(); a2++) {
                    ageEstimator.c.remove(arrayList.get(a2));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, SignalAge> entry : ageEstimator.c.entrySet()) {
            try {
                sb.append(f9.c(Encrypt.aesEncrypt((entry.getKey() + "," + entry.getValue().f6677a + "," + entry.getValue().b + "," + entry.getValue().c).getBytes("UTF-8"), ageEstimator.e)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return;
        }
        Utils.writeStringToFile(ageEstimator.f6674a, sb2, false);
    }

    abstract int a(T t);

    abstract long a();

    abstract void a(T t, long j);

    abstract long b();

    abstract long b(T t);

    public void destroy(boolean z) {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        if (!z) {
            this.g.run();
        }
        this.b = false;
    }

    public long getAge(T t) {
        return (Utils.getTimeBoot() - b((AgeEstimator<T>) t)) / 1000;
    }

    public abstract String getKey(T t);

    public void start() {
        Handler handler;
        if (!this.b && (handler = this.d) != null) {
            handler.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
        this.b = true;
    }

    public void update(T t) {
        b(t, Utils.getTimeBoot());
    }

    private void b(T t, long j) {
        if (t == null || b((AgeEstimator<T>) t) < 0) {
            return;
        }
        String key = getKey(t);
        SignalAge signalAge = this.c.get(key);
        if (signalAge == null) {
            a((AgeEstimator<T>) t, j);
            this.c.put(key, new SignalAge(a((AgeEstimator<T>) t), b((AgeEstimator<T>) t), j));
            this.f = true;
            return;
        }
        signalAge.c = j;
        if (signalAge.f6677a == a((AgeEstimator<T>) t)) {
            a((AgeEstimator<T>) t, signalAge.b);
            return;
        }
        a((AgeEstimator<T>) t, j);
        signalAge.f6677a = a((AgeEstimator<T>) t);
        signalAge.b = b((AgeEstimator<T>) t);
        this.f = true;
    }

    private void c() {
        try {
            StringBuilder sb = new StringBuilder("restore from：\n");
            Iterator<String> it = Utils.readLines(this.f6674a).iterator();
            while (it.hasNext()) {
                try {
                    String str = new String(Encrypt.aesDecrypt(f9.a(it.next()), this.e), "UTF-8");
                    sb.append(str).append("\n");
                    String[] split = str.split(",");
                    this.c.put(split[0], new SignalAge(Integer.parseInt(split[1]), Long.parseLong(split[2]), split.length >= 4 ? Long.parseLong(split[3]) : Utils.getTimeBoot()));
                } catch (Throwable th) {
                    if (this.f6674a.exists()) {
                        this.f6674a.delete();
                    }
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void update(List<T> list) {
        long timeBoot = Utils.getTimeBoot();
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), timeBoot);
        }
        if (this.c.size() >= list.size()) {
            this.f = true;
        }
        if (this.c.size() > 16384 || a() <= 0) {
            this.c.clear();
            for (T t : list) {
                this.c.put(getKey(t), new SignalAge(a((AgeEstimator<T>) t), b((AgeEstimator<T>) t), timeBoot));
            }
        }
    }
}
