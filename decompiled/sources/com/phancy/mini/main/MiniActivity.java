package com.phancy.mini.main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.R;
import com.phancy.mini.core.app.MiniApp;
import com.phancy.mini.core.app.MiniAppActivity;
import com.phancy.mini.main.capsule.MiniCapsule;
import com.phancy.mini.main.loader.MiniAppLoader;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiniActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0006\u0010\r\u001a\u00020\u0006J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0014J\b\u0010\u0017\u001a\u00020\u0006H\u0014J\b\u0010\u0018\u001a\u00020\u0006H\u0014J\u0006\u0010\u0019\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/phancy/mini/main/MiniActivity;", "Lcom/phancy/mini/core/app/MiniAppActivity;", "()V", "container", "Landroid/widget/FrameLayout;", "finish", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onAppLoadSuccess", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, _imp_adbrowser.ACTIVITY_PAUSE, _imp_adbrowser.ACTIVITY_RESUME, Constants.ON_START_KEY, "onStop", "stashToBackground", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public class MiniActivity extends MiniAppActivity {
    private static final String TAG = "MiniActivity";
    private FrameLayout container;

    @Override // com.phancy.mini.core.app.MiniAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        MiniSDK.d(TAG, "onCreate: " + this);
        super.onCreate(savedInstanceState);
        MiniSDK.init(this);
        if (getAppId().length() == 0) {
            MiniSDK.e(TAG, "appId empty start MiniActivity failed!");
            finish();
            return;
        }
        if (getUserId().length() == 0) {
            MiniSDK.e(TAG, "userId empty start MiniActivity failed!");
            finish();
            return;
        }
        getApp().onCreate(getIntent());
        MiniAppStack.pushApp(getApp());
        setContentView(R.layout.mini_main_activity);
        this.container = (FrameLayout) findViewById(R.id.container);
        new MiniCapsule(this).onCreate();
        MiniAppLoader miniAppLoader = new MiniAppLoader(this);
        miniAppLoader.onCreate();
        miniAppLoader.load(getApp());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        getApp().getAppStatus().setStashed(false);
        getApp().onNewIntent(intent);
    }

    public final void onAppLoadSuccess() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            getApp().onLoadSuccess(frameLayout);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        MiniSDK.d(TAG, "onStart: " + this);
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        MiniSDK.d(TAG, "onResume: " + this);
        super.onResume();
        getApp().getAppStatus().setStashed(false);
        getApp().onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        MiniSDK.d(TAG, "onPause: " + this);
        getApp().onPause();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        MiniSDK.d(TAG, "onStop: " + this);
        super.onStop();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getApp().onBackPressed()) {
            return;
        }
        if (MiniSDK.INSTANCE.getSettings().getBooleanValue(MiniSDK.SETTINGS_CLOSE_TO_BACKGROUND)) {
            stashToBackground();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getApp().onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        MiniSDK.d(TAG, "onDestroy: " + this);
        MiniApp app = getApp();
        MiniAppStack.removeApp(app);
        app.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        MiniSDK.d(TAG, "finish: " + getAppId() + " stashed: " + getApp().getAppStatus().getStashed());
        MiniAppStack.removeApp(getApp());
        getApp().onDestroy();
        super.finishAndRemoveTask();
        overridePendingTransition(R.anim.mini_task_close_enter, R.anim.mini_task_close_exit);
    }

    public final void stashToBackground() {
        MiniSDK.d(TAG, "stash: " + getAppId());
        getApp().getAppStatus().setStashed(true);
        moveTaskToBack(true);
    }
}
