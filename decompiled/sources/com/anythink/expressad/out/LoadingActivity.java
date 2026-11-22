package com.anythink.expressad.out;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes12.dex */
public class LoadingActivity extends Activity {
    private RelativeLayout b;
    private ImageView c;
    private Bitmap d;
    private a e;
    private String f;
    private Drawable h;
    private RelativeLayout i;
    private com.anythink.expressad.foundation.g.d.c g = new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.out.LoadingActivity.1
        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (LoadingActivity.this.c == null || bitmap == null || bitmap.isRecycled() || !((String) LoadingActivity.this.c.getTag()).equals(str)) {
                return;
            }
            LoadingActivity.this.c.setImageBitmap(bitmap);
            LoadingActivity.this.d = bitmap;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    BroadcastReceiver f5007a = new BroadcastReceiver() { // from class: com.anythink.expressad.out.LoadingActivity.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            LoadingActivity.this.finish();
        }
    };

    public interface a {
        void a();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        if (this.f5007a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f5007a, intentFilter);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f5007a != null) {
            com.anythink.core.common.d.n.a(this).a(this.f5007a);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.c = null;
        this.b = null;
        this.g = null;
        this.h = null;
        RelativeLayout relativeLayout = this.i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.i = null;
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.d = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("icon_url")) {
            this.f = getIntent().getStringExtra("icon_url");
        }
        if (this.b == null) {
            this.b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b = v.b(this, 15.0f);
            this.i.setPadding(b, b, b, b);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.c = aTImageView;
            aTImageView.setId(v.a());
            this.c.setTag(this.f);
            if (!TextUtils.isEmpty(this.f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f, this.g);
            }
            int b2 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(13, -1);
            this.i.addView(this.c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView(this.b);
    }

    private View a() {
        if (this.b == null) {
            this.b = new RelativeLayout(this);
            this.i = new RelativeLayout(this);
            int b = v.b(this, 15.0f);
            this.i.setPadding(b, b, b, b);
            this.i.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(this, "anythink_native_bg_loading_camera", com.anythink.expressad.foundation.h.k.c));
            this.i.addView(new TextView(this), new RelativeLayout.LayoutParams(v.b(this, 140.0f), v.b(this, 31.5f)));
            ATImageView aTImageView = new ATImageView(this);
            this.c = aTImageView;
            aTImageView.setId(v.a());
            this.c.setTag(this.f);
            if (!TextUtils.isEmpty(this.f)) {
                com.anythink.expressad.foundation.g.d.b.a(getApplicationContext()).a(this.f, this.g);
            }
            int b2 = v.b(this, 64.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b2, b2);
            layoutParams.addRule(13, -1);
            this.i.addView(this.c, layoutParams);
            TextView textView = new TextView(this);
            textView.setSingleLine();
            textView.setTextColor(-1);
            textView.setTextSize(16.0f);
            textView.setText("Relax while loading....");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(3, this.c.getId());
            layoutParams2.addRule(14, -1);
            this.i.addView(textView, layoutParams2);
            this.b.addView(this.i, new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.b;
    }
}
