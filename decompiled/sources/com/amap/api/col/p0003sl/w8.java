package com.amap.api.col.p0003sl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.LBSTraceClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TraceResultPool.java */
/* loaded from: classes11.dex */
public class w8 {
    private static volatile w8 b;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, a> f1952a;

    /* compiled from: TraceResultPool.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private int f1953a;
        private int b;
        private int d;
        private HashMap<Integer, List<LatLng>> f;
        private int c = 0;
        private int e = 0;
        private List<LatLng> g = new ArrayList();

        public a(int i, int i2, int i3, HashMap<Integer, List<LatLng>> hashMap) {
            this.f1953a = 0;
            this.b = 0;
            this.d = 0;
            this.f1953a = i2;
            this.f = hashMap;
            this.b = i;
            this.d = i3;
        }

        public HashMap<Integer, List<LatLng>> a() {
            return this.f;
        }

        public void a(Handler handler) {
            List<LatLng> list;
            for (int i = this.c; i <= this.f1953a && (list = this.f.get(Integer.valueOf(i))) != null; i++) {
                this.g.addAll(list);
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.obj = list;
                obtainMessage.what = 100;
                obtainMessage.arg1 = this.c;
                Bundle bundle = new Bundle();
                bundle.putInt("lineID", this.b);
                obtainMessage.setData(bundle);
                handler.sendMessage(obtainMessage);
                this.c++;
                this.e++;
            }
            if (this.c == this.f1953a + 1) {
                if (this.e <= 0) {
                    w8.this.a(handler, this.b, LBSTraceClient.MIN_GRASP_POINT_ERROR);
                    return;
                }
                List<LatLng> list2 = this.g;
                int i2 = 0;
                if (list2 != null && list2.size() != 0) {
                    int i3 = 0;
                    while (i2 < list2.size() - 1) {
                        LatLng latLng = list2.get(i2);
                        i2++;
                        LatLng latLng2 = list2.get(i2);
                        if (latLng == null || latLng2 == null) {
                            break;
                        } else {
                            i3 = (int) (i3 + AMapUtils.calculateLineDistance(latLng, latLng2));
                        }
                    }
                    i2 = i3;
                }
                Message obtainMessage2 = handler.obtainMessage();
                obtainMessage2.obj = this.g;
                obtainMessage2.what = 101;
                obtainMessage2.arg1 = i2;
                obtainMessage2.arg2 = this.d;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("lineID", this.b);
                obtainMessage2.setData(bundle2);
                handler.sendMessage(obtainMessage2);
            }
        }
    }

    public w8() {
        this.f1952a = null;
        this.f1952a = Collections.synchronizedMap(new HashMap());
    }

    public static w8 a() {
        if (b == null) {
            synchronized (w8.class) {
                if (b == null) {
                    b = new w8();
                }
            }
        }
        return b;
    }

    public synchronized void a(String str, int i, List<LatLng> list) {
        Map<String, a> map = this.f1952a;
        if (map != null) {
            map.get(str).a().put(Integer.valueOf(i), list);
        }
    }

    public synchronized void a(String str, int i, int i2, int i3) {
        try {
            try {
                Map<String, a> map = this.f1952a;
                if (map != null) {
                    map.put(str, new a(i, i2, i3, new HashMap(16)));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized a a(String str) {
        Map<String, a> map = this.f1952a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void a(Handler handler, int i, String str) {
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.obj = str;
        obtainMessage.what = 102;
        Bundle bundle = new Bundle();
        bundle.putInt("lineID", i);
        obtainMessage.setData(bundle);
        handler.sendMessage(obtainMessage);
    }
}
