package com.qumeng.overseas.advlib.ui.front;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;

/* loaded from: classes17.dex */
public abstract class a {
    public static final int A = 112;
    public static final int w = 99;
    public static final int x = 101;
    public static final int y = 102;
    public static final int z = 103;
    protected Activity t;
    protected Intent u;
    protected AdsObject v;

    public a(Activity activity) {
        this.t = activity;
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(int i, String[] strArr, int[] iArr) {
    }

    public void g() {
        this.u = this.t.getIntent();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void a(AdsObject adsObject) {
        this.v = adsObject;
        g();
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return true;
        }
        h();
        return true;
    }

    public static void a(Bundle bundle, Intent intent) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    intent.putExtra(str, (String) bundle.get(str));
                } else if (obj instanceof Integer) {
                    intent.putExtra(str, (Integer) bundle.get(str));
                } else if (obj instanceof Double) {
                    intent.putExtra(str, (Double) bundle.get(str));
                } else if (obj instanceof Boolean) {
                    intent.putExtra(str, (Boolean) bundle.get(str));
                }
            }
        }
    }
}
