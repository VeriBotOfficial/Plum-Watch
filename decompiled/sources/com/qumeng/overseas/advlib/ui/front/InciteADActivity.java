package com.qumeng.overseas.advlib.ui.front;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.qumeng.overseas.advlib.core.IInciteAd;

/* loaded from: classes17.dex */
public class InciteADActivity extends AppCompatActivity {
    private static final int u = 64222;
    private IInciteAd t;

    private void a() {
        if (com.qumeng.overseas.advlib.common.a.c().b(IInciteAd.class) == null) {
            Log.i("ADBrowser", "Well, our remote class didn't load yet, invoke _bootstrap() ...");
            com.qumeng.overseas.advlib.__bootstrap__.a.a(getApplicationContext());
        }
        this.t = (IInciteAd) com.qumeng.overseas.advlib.common.a.c().a(IInciteAd.class, new Object[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onActivityResultRef(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            a();
            IInciteAd iInciteAd = this.t;
            if (iInciteAd != null) {
                iInciteAd.doWhenReflect(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onDestroyRef(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IInciteAd iInciteAd = this.t;
        if (iInciteAd == null || !Boolean.valueOf(iInciteAd.onKeyEvent(i, keyEvent)).booleanValue()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onPauseRef(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.whenPermDialogReturns(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onResumeRef(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onStartRef(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        IInciteAd iInciteAd = this.t;
        if (iInciteAd != null) {
            iInciteAd.onStopRef(this);
        }
    }
}
