package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: compiled from: MBridgeNoDoubleClick.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f12667a = 0;

    protected abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f12667a > 2000) {
            this.f12667a = timeInMillis;
            a(view);
        }
    }
}
