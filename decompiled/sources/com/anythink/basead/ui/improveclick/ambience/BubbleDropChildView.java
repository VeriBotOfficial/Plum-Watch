package com.anythink.basead.ui.improveclick.ambience;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.anythink.basead.ui.animplayerview.redpacket.RedPacketView;

/* loaded from: classes11.dex */
public class BubbleDropChildView extends RedPacketView {
    a e;
    private boolean f;

    public interface a {
        void a();
    }

    public BubbleDropChildView(Context context) {
        super(context);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BubbleDropChildView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void initSetting(a aVar) {
        this.f3182a = 0.25d;
        this.b = 0.33000001311302185d;
        this.f = false;
        this.e = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (com.anythink.basead.ui.animplayerview.redpacket.a aVar2 : this.c) {
                if (aVar2.f3183a <= x && x <= aVar2.f3183a + aVar2.b() && aVar2.b <= y && y <= aVar2.b + aVar2.a()) {
                    this.f = true;
                    return true;
                }
            }
        } else if (action == 1) {
            if (this.f && (aVar = this.e) != null) {
                aVar.a();
            }
            this.f = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (com.anythink.basead.ui.animplayerview.redpacket.a aVar : this.c) {
            if (aVar.f3183a <= x && x <= aVar.f3183a + aVar.b() && aVar.b <= y && y <= aVar.b + aVar.a()) {
                return true;
            }
        }
        return false;
    }
}
