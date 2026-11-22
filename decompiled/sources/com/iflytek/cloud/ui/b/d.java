package com.iflytek.cloud.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.ui.b.c;

/* loaded from: classes17.dex */
public class d extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private c.b f11219a;
    protected boolean b;
    protected boolean c;

    public d(Context context) {
        super(context);
        this.f11219a = null;
        this.b = true;
        this.c = true;
    }

    protected static boolean a(ViewGroup viewGroup) {
        try {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setOnClickListener(null);
                childAt.setBackgroundDrawable(null);
            }
            viewGroup.removeAllViews();
            viewGroup.setOnClickListener(null);
            viewGroup.setBackgroundDrawable(null);
            return true;
        } catch (Exception e) {
            DebugLog.LogE(e);
            return false;
        }
    }

    protected void a() {
    }

    protected boolean b() {
        try {
            a(this);
            return true;
        } catch (Exception e) {
            DebugLog.LogE(e);
            return false;
        }
    }

    public void c() {
        c.b bVar = this.f11219a;
        if (bVar != null) {
            bVar.a();
        }
    }

    protected void d() {
        Intent intent = new Intent();
        intent.setAction("android.settings.SETTINGS");
        intent.addFlags(268435456);
        getContext().startActivity(intent);
    }

    protected void e() {
    }

    public void setExitCallBack(c.b bVar) {
        this.f11219a = bVar;
    }
}
