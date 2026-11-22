package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.widget.a;

/* loaded from: classes12.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {
    private static final String n = "anythink_reward_endcard_vast";
    private ViewGroup o;
    private View p;

    /* renamed from: q, reason: collision with root package name */
    private View f5346q;

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(n);
        if (findLayout >= 0) {
            this.c.inflate(findLayout, this);
            this.o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.p = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.f5346q = findViewById;
            this.f = isNotNULL(this.o, this.p, findViewById);
            c();
            if (this.f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    private void a() {
        if (this.f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.o.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    protected final void c() {
        super.c();
        if (this.f) {
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkVastEndCardView.this.e != null) {
                        AnythinkVastEndCardView.this.e.a(104, "");
                    }
                }
            });
            this.f5346q.setOnClickListener(new a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                protected final void a(View view) {
                    if (AnythinkVastEndCardView.this.e != null) {
                        AnythinkVastEndCardView.this.e.a(108, AnythinkVastEndCardView.this.d());
                    }
                }
            });
        }
    }

    private boolean b() {
        this.o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.p = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.f5346q = findViewById;
        return isNotNULL(this.o, this.p, findViewById);
    }

    public void notifyShowListener() {
        this.e.a(111, "");
    }
}
