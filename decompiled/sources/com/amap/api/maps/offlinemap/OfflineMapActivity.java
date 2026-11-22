package com.amap.api.maps.offlinemap;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.amap.api.col.p0003sl.n1;
import com.amap.api.col.p0003sl.w5;
import com.amap.api.col.p0003sl.y5;

/* loaded from: classes11.dex */
public class OfflineMapActivity extends Activity implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private w5 f2066a;

    public void closeScr() {
        try {
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.d();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.a(view);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            getWindow().setSoftInputMode(32);
            getWindow().setFormat(-3);
            requestWindowFeature(1);
            y5.b(getApplicationContext());
            n1.a(getApplicationContext());
            try {
                if (this.f2066a == null) {
                    this.f2066a = new w5();
                }
                this.f2066a.a(this);
                this.f2066a.getClass();
                setContentView(this.f2066a.b());
                this.f2066a.e();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            super.onDestroy();
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.d();
                this.f2066a = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                w5 w5Var = this.f2066a;
                if (w5Var != null && !w5Var.a()) {
                    return true;
                }
                finish();
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            super.onPause();
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.getClass();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.getClass();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        try {
            super.onStart();
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.getClass();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            super.onStop();
            w5 w5Var = this.f2066a;
            if (w5Var != null) {
                w5Var.getClass();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
