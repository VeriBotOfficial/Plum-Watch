package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.rmu.kg;
import com.bytedance.sdk.openadsdk.rmu.kg.fxn;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes14.dex */
public class BusMonitorDependWrapper implements kg {
    private kg fxn;
    private Handler kg;

    public BusMonitorDependWrapper(kg kgVar) {
        this.fxn = kgVar;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public Context getContext() {
        kg kgVar = this.fxn;
        if (kgVar != null && kgVar.getContext() != null) {
            return this.fxn.getContext();
        }
        return getReflectContext();
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public Handler getHandler() {
        kg kgVar = this.fxn;
        if (kgVar != null && kgVar.getHandler() != null) {
            return this.fxn.getHandler();
        }
        if (this.kg == null) {
            this.kg = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.kg;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        kg kgVar = this.fxn;
        if (kgVar == null || (uploadIntervalTime = kgVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public boolean isMonitorOpen() {
        kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public void onMonitorUpload(List<fxn> list) {
        kg kgVar = this.fxn;
        if (kgVar != null) {
            kgVar.onMonitorUpload(list);
        }
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public int getOnceLogCount() {
        kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public int getOnceLogInterval() {
        kg kgVar = this.fxn;
        if (kgVar != null) {
            return kgVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.rmu.kg
    public HandlerThread getSafeHandlerThread(String str, int i) {
        HandlerThread safeHandlerThread;
        kg kgVar = this.fxn;
        if (kgVar != null && (safeHandlerThread = kgVar.getSafeHandlerThread(str, i)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }
}
