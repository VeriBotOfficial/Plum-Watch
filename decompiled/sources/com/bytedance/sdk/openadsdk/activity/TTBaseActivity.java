package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.utils.jz;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
public class TTBaseActivity extends Activity {
    private OnBackInvokedCallback fxn;
    protected boolean tw = false;

    protected boolean fxn() {
        return false;
    }

    private static class fxn implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> fxn;

        fxn(TTBaseActivity tTBaseActivity) {
            this.fxn = new WeakReference<>(tTBaseActivity);
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.fxn.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.kg();
            }
        }
    }

    protected void kg() {
        onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fxn() && jz.fxn()) {
            this.fxn = new fxn(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.fxn);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e) {
                dx.fxn("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    dx.fxn("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                try {
                    super.onPause();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (IllegalArgumentException unused2) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
                return;
            }
        }
        super.onPause();
    }

    public void gff(boolean z) {
        this.tw = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!jz.fxn() || this.fxn == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.fxn);
        this.fxn = null;
    }
}
