package com.bytedance.sdk.component.jq;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.jq;
import com.bytedance.sdk.component.utils.mve;
import com.bytedance.sdk.component.utils.zn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn extends gff implements mve.fxn {
    private final Context bh;
    private long dgx;
    private View.OnTouchListener dx;
    private final int gff;
    private final List<Integer> hm;
    private float je;
    private final int kg;
    private long mvp;
    private final int rb;
    private int rlu;
    private float rmu;

    /* renamed from: sg, reason: collision with root package name */
    private volatile float f9369sg;
    private volatile float tw;
    private String ud;
    private boolean xdg;
    private float jq = -1.0f;
    private float hie = -1.0f;
    private final Handler ckl = new mve(jq.fxn().getLooper(), this);
    InterfaceC0479fxn fxn = new InterfaceC0479fxn() { // from class: com.bytedance.sdk.component.jq.fxn.1
        @Override // com.bytedance.sdk.component.jq.fxn.InterfaceC0479fxn
        public void fxn() {
            if (fxn.this.jq == -1.0f && fxn.this.hie == -1.0f && fxn.this.mvp == -1) {
                new Object[]{"first trigger triggerJump()", ", mTriggerX: ", Float.valueOf(fxn.this.jq), ", mTriggerY: ", Float.valueOf(fxn.this.hie)};
                fxn fxnVar = fxn.this;
                fxnVar.jq = fxnVar.f9369sg;
                fxn fxnVar2 = fxn.this;
                fxnVar2.hie = fxnVar2.tw;
                fxn fxnVar3 = fxn.this;
                fxnVar3.mvp = fxnVar3.dgx;
                fxn.this.xdg = true;
            }
            new Object[]{"everytime trigger triggerJump()", ", mTriggerX: ", Float.valueOf(fxn.this.jq), ", mTriggerY: ", Float.valueOf(fxn.this.hie)};
        }

        @Override // com.bytedance.sdk.component.jq.fxn.InterfaceC0479fxn
        public void fxn(int i) {
            fxn.this.rlu = i;
            fxn.this.kg();
        }
    };
    private int ums = -1;
    private final List<Integer> zu = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.jq.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0479fxn {
        void fxn();

        void fxn(int i);
    }

    public fxn(Context context, int i, int i2, List<Integer> list, int i3) {
        this.bh = context;
        if (i == -1) {
            this.kg = zn.fxn(context);
        } else {
            this.kg = zn.fxn(context, i);
        }
        this.gff = zn.fxn(context, i2);
        this.hm = list;
        this.rb = i3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        fxn fxnVar;
        int action = motionEvent.getAction();
        new Object[]{"action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY())};
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.dgx = SystemClock.elapsedRealtime();
        this.f9369sg = x;
        this.tw = y;
        if (action == 0) {
            fxnVar = this;
            fxnVar.rmu = x;
            fxnVar.je = y;
            new Object[]{"ACTION_DOWN: ", "downX: ", Float.valueOf(x), "downY: ", Float.valueOf(fxnVar.je)};
        } else if (action != 1) {
            fxnVar = this;
        } else {
            new Object[]{"ACTION_UP: ", "upX: ", Float.valueOf(x), "upY: ", Float.valueOf(y)};
            fxnVar = this;
            if (fxnVar.fxn(x, y, this.rmu, this.je, this.bh)) {
                int fxn = fxn(fxnVar.f9369sg, fxnVar.tw, fxnVar.dgx);
                boolean contains = fxnVar.zu.contains(Integer.valueOf(fxnVar.rlu));
                fxn(view, motionEvent, fxn, !contains);
                if (!contains) {
                    fxnVar.zu.add(Integer.valueOf(fxnVar.rlu));
                }
                if (fxn == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = fxnVar.dx;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.jq.gff
    public void fxn(View.OnTouchListener onTouchListener) {
        this.dx = onTouchListener;
    }

    public InterfaceC0479fxn fxn() {
        return this.fxn;
    }

    private void fxn(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        if (i != 0) {
            i2 = 0;
        }
        jSONObject.put("is_interceptor", i2);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.rlu);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.ckl.sendMessageDelayed(obtain, 200L);
    }

    public void fxn(String str) {
        this.ud = str;
    }

    private int fxn(float f, float f2, long j) {
        if (this.jq == -1.0f && this.hie == -1.0f && this.mvp == -1) {
            return 1;
        }
        new Object[]{"mInterceptorPageList: ", this.hm, "mPageIndex:", Integer.valueOf(this.rlu)};
        if (!this.hm.contains(Integer.valueOf(this.rlu))) {
            return 2;
        }
        if (j - this.mvp > this.rb) {
            kg();
            return 3;
        }
        float abs = Math.abs(f - this.jq);
        float abs2 = Math.abs(f2 - this.hie);
        new Object[]{"mTouchX: ", Float.valueOf(f), ", mTriggerX : ", Float.valueOf(this.jq), " ,x distance：", Float.valueOf(abs)};
        new Object[]{"mTouchY: ", Float.valueOf(f2), ", mTriggerY: ", Float.valueOf(this.hie), " ,y distance：", Float.valueOf(abs2)};
        new Object[]{"mInterceptorXPx: ", Integer.valueOf(this.kg), ", mInterceptorYPx: ", Integer.valueOf(this.gff)};
        if (abs <= this.kg / 2.0f && abs2 <= this.gff / 2.0f) {
            return 0;
        }
        kg();
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg() {
        this.jq = -1.0f;
        this.hie = -1.0f;
        this.mvp = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.mve.fxn
    public void fxn(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.xdg ? 1 : 0);
                    this.xdg = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg() != null) {
                com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg().fxn(this.ud, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
