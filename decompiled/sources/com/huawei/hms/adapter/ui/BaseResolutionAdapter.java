package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f10245a;
    private String b = "";
    private long c = 0;

    private void a(long j) {
        if (!SystemUtils.isChinaROM()) {
            HMSLog.i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity c = c();
        if (c == null || c.isFinishing()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("package", c.getPackageName());
        hashMap.put(CommonCode.MapKey.RESOLUTION_FLAG, this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j);
        HiAnalyticsUtils.getInstance().onEvent(c, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, hashMap);
        HMSLog.e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.b + ", carriedTimeStamp: " + this.c + ", savedTimeStamp: " + j);
    }

    private void b() {
        Activity c = c();
        if (c == null || c.isFinishing()) {
            return;
        }
        c.finish();
    }

    private Activity c() {
        WeakReference<Activity> weakReference = this.f10245a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.b);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBridgeActivityCreate(android.app.Activity r10) {
        /*
            r9 = this;
            java.lang.String r1 = "BaseResolutionAdapter"
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.f10245a = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 != 0) goto L13
            r9.d()
            return
        L13:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "transaction_id"
            java.lang.String r3 = r0.getStringExtra(r3)     // Catch: java.lang.Throwable -> L2a
            r9.b = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "resolution_flag"
            r4 = 0
            long r3 = r0.getLongExtra(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r9.c = r3     // Catch: java.lang.Throwable -> L2a
            goto L48
        L2a:
            r0 = move-exception
            goto L2e
        L2c:
            r0 = move-exception
            r2 = 0
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get transaction_id or resolution_flag exception:"
            r3.<init>(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r0)
        L48:
            boolean r0 = r9.a()
            if (r0 != 0) goto L52
            r9.d()
            return
        L52:
            java.lang.String r0 = r9.b
            if (r0 == 0) goto L6a
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L6a
            java.lang.String r0 = "remove apk resolution failed task."
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager r0 = com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager.getInstance()
            java.lang.String r3 = r9.b
            r0.removeTask(r3)
        L6a:
            if (r2 != 0) goto L70
            r9.d()
            return
        L70:
            java.lang.String r0 = "resolution"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L7c
            r9.d()
            return
        L7c:
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto L95
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> L8c
            android.content.Intent r0 = com.huawei.hms.utils.IntentUtil.modifyIntentBehaviorsSafe(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 1001(0x3e9, float:1.403E-42)
            r10.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L8c
            goto Lb2
        L8c:
            r9.d()
            java.lang.String r10 = "ActivityNotFoundException:exception"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
            goto Lb2
        L95:
            boolean r2 = r0 instanceof android.app.PendingIntent
            if (r2 == 0) goto Lb2
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch: android.content.IntentSender.SendIntentException -> Laa
            android.content.IntentSender r3 = r0.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> Laa
            r7 = 0
            r8 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
            r2 = r10
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch: android.content.IntentSender.SendIntentException -> Laa
            goto Lb2
        Laa:
            r9.d()
            java.lang.String r10 = "SendIntentException:exception"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.ui.BaseResolutionAdapter.onBridgeActivityCreate(android.app.Activity):void");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f10245a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i2);
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.b);
        }
        b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    private boolean a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.b);
        if (resolutionFlag != 0 && resolutionFlag == this.c) {
            return true;
        }
        a(resolutionFlag);
        return false;
    }
}
