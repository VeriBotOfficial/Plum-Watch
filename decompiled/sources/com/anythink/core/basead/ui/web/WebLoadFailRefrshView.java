package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public class WebLoadFailRefrshView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private View.OnClickListener f3578a;

    public WebLoadFailRefrshView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(q.a(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new AnonymousClass1());
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(q.a(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new AnonymousClass1());
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLoadFailRefrshView$1, reason: invalid class name */
    final class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLoadFailRefrshView.this.f3578a != null) {
                WebLoadFailRefrshView.this.f3578a.onClick(view);
            }
        }
    }

    public void setOnRefreshListener(View.OnClickListener onClickListener) {
        this.f3578a = onClickListener;
    }
}
