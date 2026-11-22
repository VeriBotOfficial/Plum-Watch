package com.anythink.expressad.widget;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes12.dex */
public abstract class a implements View.OnClickListener {
    public static final int d = 2000;

    /* renamed from: a, reason: collision with root package name */
    private long f5556a = 0;

    protected abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f5556a > 2000) {
            this.f5556a = timeInMillis;
            a(view);
        }
    }
}
