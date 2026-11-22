package com.bytedance.sdk.component.tw;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.ckl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class hm {
    private static AtomicInteger gff = new AtomicInteger(0);
    public static final String[] fxn = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] kg = {"tt_pangle", "bd_tracker"};
    private static int hm = 0;
    private static int rb = 0;

    public static void fxn() {
        try {
            kg();
        } catch (Throwable unused) {
        }
    }

    private static void kg() {
        int i;
        String str;
        gff jq = bh.jq();
        if (jq == null) {
            return;
        }
        int i2 = 1;
        int addAndGet = gff.addAndGet(1);
        if (bh.gff < 0 || addAndGet % bh.gff != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap hashMap = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean fxn2 = ckl.fxn();
        int size = allStackTraces.size();
        if (size > rb) {
            rb = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i4 += i2;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (fxn2) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i2;
                String stackTraceElement = value[i5].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (fxn2) {
                    sb.append(stackTraceElement + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (fxn(stackTraceElement, fxn)) {
                        str = stackTraceElement;
                    } else {
                        str = stackTraceElement;
                        if (!fxn(key.getName(), kg)) {
                        }
                    }
                    i3++;
                    str2 = str;
                }
                i5++;
                it = it2;
                i2 = i6;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i7 = i2;
            if (fxn2) {
                if (TextUtils.isEmpty(str2)) {
                    i = i7;
                } else {
                    String str3 = str2 + "&" + key.getName();
                    fxn fxnVar = (fxn) hashMap.get(str3);
                    if (fxnVar != null) {
                        fxnVar.fxn(fxnVar.fxn() + 1);
                        i = i7;
                    } else {
                        String sb2 = sb.toString();
                        String name = key.getName();
                        i = i7;
                        fxnVar = new fxn(str3, i, sb2, name);
                    }
                    hashMap.put(str3, fxnVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i = i7;
            }
            i2 = i;
            it = it3;
        }
        if (i3 > hm) {
            hm = i3;
        }
        if (fxn2) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + hm + ", Application threads = " + size + ", Application max threads = " + rb);
            Iterator it4 = hashMap.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((fxn) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        jq.fxn(new com.bytedance.sdk.component.tw.kg.fxn(i3, hm, size, rb));
    }

    private static boolean fxn(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class fxn {
        public int fxn;
        public String gff;
        public String hm;
        public String kg;

        public fxn(String str, int i, String str2, String str3) {
            this.gff = str;
            this.fxn = i;
            this.hm = str2;
            this.kg = str3;
        }

        public void fxn(int i) {
            this.fxn = i;
        }

        public int fxn() {
            return this.fxn;
        }

        public String toString() {
            return "ThreadModel{times=" + this.fxn + ", name='" + this.kg + "', lastStackStack='" + this.gff + "'}";
        }
    }
}
