package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public final class NotificationClickedActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private long f14374a;

    /* renamed from: a, reason: collision with other field name */
    private BroadcastReceiver f113a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f114a;
    private long b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f14374a = System.currentTimeMillis();
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
        Handler handler = new Handler();
        this.f114a = handler;
        handler.postDelayed(new Runnable() { // from class: com.xiaomi.mipush.sdk.NotificationClickedActivity.1
            @Override // java.lang.Runnable
            public void run() {
                com.xiaomi.channel.commonutils.logger.b.e("clicked activity finish by timeout.");
                NotificationClickedActivity.this.finish();
            }
        }, 3000L);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.mipush.sdk.NotificationClickedActivity.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                com.xiaomi.channel.commonutils.logger.b.b("clicked activity finish by normal.");
                NotificationClickedActivity.this.finish();
            }
        };
        this.f113a = broadcastReceiver;
        try {
            com.xiaomi.push.m.a(this, broadcastReceiver, intentFilter, c.a(this), null, 4);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.b = System.currentTimeMillis();
        super.onResume();
        a(getIntent());
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f114a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.f113a);
        } catch (Exception unused) {
        }
    }

    private void a(Intent intent) {
        try {
            if (intent == null) {
                com.xiaomi.channel.commonutils.logger.b.d("PushClickedActivity", "clicked activity start service, missing intent");
                return;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
            if (intent2 == null) {
                com.xiaomi.channel.commonutils.logger.b.d("PushClickedActivity", "clicked activity start service, newIntent is null");
                return;
            }
            intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent2.putExtra("is_clicked_activity_call", true);
            intent2.putExtra("nca_create_time", this.f14374a);
            intent2.putExtra("nca_resume_time", this.b);
            com.xiaomi.channel.commonutils.logger.b.m11782a("PushClickedActivity", "clicked activity start service.");
            startService(intent2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }
}
