package com.bytedance.sdk.openadsdk.core.hie.fxn;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.autonavi.aps.amapapi.config.Const;
import com.hjq.permissions.Permission;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg {
    private static volatile kg fxn;
    private final ArrayList<String> kg = new ArrayList<>();
    private final AtomicBoolean gff = new AtomicBoolean(false);
    private long hm = System.currentTimeMillis();
    private long rb = 0;
    private long bh = 0;

    /* renamed from: sg, reason: collision with root package name */
    private String f9472sg = "";
    private String tw = "";
    private String jq = "";
    private boolean hie = false;
    private boolean dgx = false;

    public static kg fxn(Application application) {
        if (fxn == null) {
            synchronized (kg.class) {
                if (fxn == null) {
                    kg kgVar = new kg();
                    fxn = kgVar;
                    kgVar.hie = fxn((Context) application);
                    fxn.dgx = fxn(application.getApplicationContext(), Permission.SYSTEM_ALERT_WINDOW) == 0;
                    fxn.fxn();
                }
            }
        }
        return fxn;
    }

    private static int fxn(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean fxn(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void fxn(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.kg.size() == 0) {
            this.f9472sg = localClassName;
            this.rb = System.currentTimeMillis();
            this.bh = System.currentTimeMillis() - this.hm;
            this.gff.set(false);
        }
        if (!this.kg.contains(localClassName)) {
            this.kg.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.jq = localClassName;
    }

    public void kg(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.kg.contains(localClassName)) {
            this.kg.remove(localClassName);
        }
        if (this.kg.size() == 0) {
            this.hm = System.currentTimeMillis();
            this.gff.set(true);
            this.tw = localClassName;
        }
    }

    private void fxn() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField(Const.STR_PROCESS_TAG);
                declaredField3.setAccessible(true);
                for (int i = 0; i < size; i++) {
                    Object valueAt = arrayMap.valueAt(i);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.kg.contains(localClassName)) {
                            this.kg.add(localClassName);
                        }
                    }
                }
                this.gff.set(this.kg.size() <= 0);
            }
        } catch (Throwable unused) {
        }
    }

    public String fxn(String str, long j, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.rb;
        long j3 = currentTimeMillis - j;
        int i2 = j3 < 500 ? 1 : 0;
        if (this.gff.get() && this.dgx) {
            i2 |= 2;
        }
        if (!this.gff.get() && this.bh >= 5000 && j2 < 1000) {
            i2 = this.tw.equals(this.jq) ? i2 | 4 : i2 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i2).put("adtag", str).put("bakdur", this.bh).put("rit", i).put("poptime", j2).put("unlocktime", j3).put("bakground", this.gff).put(ParameterNames.ALERT, this.dgx).put(NotificationCompat.CATEGORY_SYSTEM, this.hie).put("actsize", this.kg.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.kg.gff()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.f9472sg = "";
        this.bh = 0L;
        this.rb = 0L;
        this.hm = System.currentTimeMillis();
        return str2;
    }
}
