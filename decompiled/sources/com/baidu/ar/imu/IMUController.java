package com.baidu.ar.imu;

import android.content.Context;
import android.hardware.SensorManager;
import com.baidu.ar.e6;
import com.baidu.ar.n7;
import com.baidu.ar.o7;
import com.baidu.ar.q7;
import com.umeng.analytics.pro.ak;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class IMUController implements e6 {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f6996a;
    public HashMap<n7, o7> b;

    @Override // com.baidu.ar.e6
    public void destroy() {
        HashMap<n7, o7> hashMap = this.b;
        if (hashMap != null) {
            Iterator<o7> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.b.clear();
            this.b = null;
        }
        this.f6996a = null;
    }

    @Override // com.baidu.ar.e6
    public void setContext(Context context) {
        if (context != null) {
            this.f6996a = (SensorManager) context.getSystemService(ak.ac);
        }
    }

    @Override // com.baidu.ar.e6
    public boolean start(q7 q7Var, n7 n7Var) {
        if (this.f6996a == null || q7Var == null || n7Var == null) {
            return false;
        }
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        o7 o7Var = this.b.get(n7Var);
        if (o7Var == null) {
            o7Var = new o7();
            this.b.put(n7Var, o7Var);
        }
        return o7Var.a(this.f6996a, q7Var, n7Var);
    }

    @Override // com.baidu.ar.e6
    public void stop(n7 n7Var) {
        HashMap<n7, o7> hashMap;
        o7 remove;
        if (n7Var == null || (hashMap = this.b) == null || (remove = hashMap.remove(n7Var)) == null) {
            return;
        }
        remove.b();
    }
}
