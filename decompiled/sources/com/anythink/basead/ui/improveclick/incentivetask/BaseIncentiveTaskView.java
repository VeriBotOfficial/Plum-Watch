package com.anythink.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.y;
import com.anythink.core.common.t.c;

/* loaded from: classes11.dex */
public abstract class BaseIncentiveTaskView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    c f3376a;
    protected a b;

    public interface a {
        void a();

        void a(int i);

        void a(long j);

        void b();
    }

    abstract void a();

    public BaseIncentiveTaskView(Context context) {
        this(context, null);
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseIncentiveTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void initSetting(w wVar, y yVar, long j, a aVar) {
        this.b = aVar;
        c cVar = new c(yVar.bs(), new Runnable() { // from class: com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.1
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseIncentiveTaskView.this.b != null) {
                    BaseIncentiveTaskView.this.b.a();
                }
            }
        }, true);
        this.f3376a = cVar;
        cVar.a();
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public void onResume() {
        c cVar = this.f3376a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onPause() {
        c cVar = this.f3376a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void release() {
        b();
    }

    protected final void b() {
        c cVar = this.f3376a;
        if (cVar != null) {
            cVar.c();
        }
    }
}
