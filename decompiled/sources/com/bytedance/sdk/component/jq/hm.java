package com.bytedance.sdk.component.jq;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hm extends gff {
    private View.OnTouchListener bh;
    private final View.OnTouchListener fxn;
    private final long gff;
    private String hie;
    private final Context hm;
    private float jq;
    private final int kg;
    private final bh rb;

    /* renamed from: sg, reason: collision with root package name */
    private long f9370sg = -1;
    private float tw;

    public hm(Context context, View.OnTouchListener onTouchListener, int i, long j, bh bhVar) {
        this.hm = context;
        this.fxn = onTouchListener;
        this.kg = i;
        this.gff = j;
        this.rb = bhVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        hm hmVar;
        int action = motionEvent.getAction();
        new Object[]{"action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY())};
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            hmVar = this;
            hmVar.tw = x;
            hmVar.jq = y;
        } else if (action != 1) {
            hmVar = this;
        } else {
            hmVar = this;
            if (hmVar.fxn(x, y, this.tw, this.jq, this.hm)) {
                if (fxn(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    fxn(1, x, y);
                } else {
                    fxn(0, x, y);
                }
            }
        }
        View.OnTouchListener onTouchListener = hmVar.fxn;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = hmVar.bh;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private boolean fxn(long j) {
        long j2 = this.f9370sg;
        if (j2 == -1) {
            this.f9370sg = j;
            return false;
        }
        int i = this.kg;
        if (i == 1) {
            if (j - j2 <= this.gff) {
                return true;
            }
            this.f9370sg = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.gff) {
                this.f9370sg = j;
                return true;
            }
            this.f9370sg = j;
        }
        return false;
    }

    private void fxn(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.kg);
            jSONObject.put("lp_click_interval", this.gff);
        } catch (Throwable th) {
            dx.fxn("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg() != null) {
            com.bytedance.sdk.component.jq.fxn.kg kg = com.bytedance.sdk.component.jq.fxn.fxn.fxn().kg();
            bh bhVar = this.rb;
            kg.fxn(bhVar != null ? bhVar.getMaterialMeta() : null, this.hie, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void fxn(String str) {
        this.hie = str;
    }

    @Override // com.bytedance.sdk.component.jq.gff
    public void fxn(View.OnTouchListener onTouchListener) {
        this.bh = onTouchListener;
    }
}
