package com.bytedance.adsdk.kg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.kg.sg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public class bh extends ImageView {
    private static final String fxn = "bh";
    private static final dgx<Throwable> kg = new dgx<Throwable>() { // from class: com.bytedance.adsdk.kg.bh.1
        @Override // com.bytedance.adsdk.kg.dgx
        public void fxn(Throwable th) {
            com.bytedance.adsdk.kg.bh.bh.fxn(th);
        }
    };
    private fxn ax;
    private int bh;
    private int bx;
    private rlu<sg> ckl;
    private boolean dgx;
    private long dx;
    private final dgx<sg> gff;
    private kg ggo;
    private boolean hie;
    private final dgx<Throwable> hm;
    private int iwp;
    private int je;
    private int jq;
    private int jz;
    private String ke;
    private JSONArray mve;
    private boolean mvp;
    private dgx<Throwable> rb;
    private final Set<hm> rlu;
    private final Handler rmu;

    /* renamed from: sg, reason: collision with root package name */
    private final jq f9225sg;
    private String tw;
    private Handler ud;
    private int uhw;
    private com.bytedance.adsdk.kg.gff.gff.gff ums;
    private sg xdg;
    private final Runnable zn;
    private final Set<Object> zu;

    public interface fxn {
    }

    private enum hm {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface kg {
    }

    static /* synthetic */ int je(bh bhVar) {
        int i = bhVar.iwp;
        bhVar.iwp = i - 1;
        return i;
    }

    static /* synthetic */ int rb(bh bhVar) {
        int i = bhVar.je;
        bhVar.je = i + 1;
        return i;
    }

    public bh(Context context) {
        super(context);
        this.gff = new dgx<sg>() { // from class: com.bytedance.adsdk.kg.bh.6
            @Override // com.bytedance.adsdk.kg.dgx
            public void fxn(sg sgVar) {
                bh.this.setComposition(sgVar);
            }
        };
        this.hm = new dgx<Throwable>() { // from class: com.bytedance.adsdk.kg.bh.7
            @Override // com.bytedance.adsdk.kg.dgx
            public void fxn(Throwable th) {
                if (bh.this.bh != 0) {
                    bh bhVar = bh.this;
                    bhVar.setImageResource(bhVar.bh);
                }
                (bh.this.rb == null ? bh.kg : bh.this.rb).fxn(th);
            }
        };
        this.bh = 0;
        this.f9225sg = new jq();
        this.hie = false;
        this.dgx = false;
        this.mvp = true;
        this.rlu = new HashSet();
        this.zu = new HashSet();
        this.rmu = new Handler(Looper.getMainLooper());
        this.je = 0;
        this.dx = 0L;
        this.zn = new Runnable() { // from class: com.bytedance.adsdk.kg.bh.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + bh.this.iwp + ", " + bh.this.jz);
                if (bh.this.iwp <= bh.this.jz) {
                    if (bh.this.bx >= 0 && bh.this.uhw >= 0) {
                        Log.i("TMe", "--==--- timer end, play anim, startframe: " + bh.this.bx);
                        bh.this.fxn();
                        bh bhVar = bh.this;
                        bhVar.setFrame(bhVar.bx);
                        bh.this.fxn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.kg.bh.4.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (bh.this.getFrame() < bh.this.uhw - 1 || bh.this.getFrame() >= bh.this.uhw + 2) {
                                    return;
                                }
                                Log.i("TMe", "--==--- timer end, play anim, endframe: " + bh.this.uhw);
                                bh.this.kg(this);
                                bh.this.bh();
                            }
                        });
                    } else {
                        Log.i("TMe", "--==--- timer end, frame invalid: " + bh.this.bx + "," + bh.this.uhw);
                    }
                    if ((!TextUtils.isEmpty(bh.this.ke) || (bh.this.mve != null && bh.this.mve.length() > 0)) && bh.this.ggo != null) {
                        kg unused = bh.this.ggo;
                        String unused2 = bh.this.ke;
                        JSONArray unused3 = bh.this.mve;
                        return;
                    }
                    return;
                }
                bh.je(bh.this);
                bh.this.ums.fxn(new StringBuilder().append(bh.this.iwp).toString());
                bh.this.invalidate();
                bh.this.ckl();
            }
        };
        tw();
    }

    private void tw() {
        setSaveEnabled(false);
        this.mvp = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        fxn(0.0f, false);
        fxn(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.f9225sg.fxn(Boolean.valueOf(com.bytedance.adsdk.kg.bh.bh.fxn(getContext()) != 0.0f));
        jq();
        hie();
        mvp();
    }

    private void jq() {
        fxn(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.kg.bh.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                bh.this.kg(this);
                bh.this.zu();
                bh.this.dgx();
            }
        });
    }

    private void hie() {
        fxn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.kg.bh.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                bh.rb(bh.this);
                sg.fxn globalConfig = bh.this.getGlobalConfig();
                if (globalConfig != null && globalConfig.hm > 0 && globalConfig.hm > bh.this.je) {
                    bh.this.zu();
                    bh.this.fxn();
                    bh.this.setProgress(0.0f);
                } else {
                    bh.this.kg(this);
                    if (bh.this.ax != null) {
                        fxn unused = bh.this.ax;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dgx() {
        final sg.fxn globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.rb <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.bh) && globalConfig.f9268sg == null) {
            return;
        }
        int i = globalConfig.rb;
        if (i > getMaxFrame()) {
            i = (int) getMaxFrame();
        }
        final float maxFrame = i / getMaxFrame();
        fxn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.kg.bh.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame) {
                    return;
                }
                bh.this.kg(this);
                if (bh.this.ggo != null) {
                    kg unused = bh.this.ggo;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(long j) {
        sg.fxn globalConfig = getGlobalConfig();
        if (this.ax != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(j));
            if (globalConfig == null || globalConfig.kg == null || globalConfig.kg.isEmpty()) {
                return;
            }
            hashMap.putAll(globalConfig.kg);
        }
    }

    private void mvp() {
        fxn(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.kg.bh.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                dx bx;
                final long elapsedRealtime = SystemClock.elapsedRealtime() - bh.this.dx;
                bh.this.kg(this);
                String playDelayedELExpressTimeS = bh.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (bx = bh.this.f9225sg.bx()) != null) {
                    try {
                        int parseInt = Integer.parseInt(bx.fxn(playDelayedELExpressTimeS)) * 1000;
                        if (bh.this.dx > 0) {
                            long elapsedRealtime2 = (bh.this.dx + parseInt) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(elapsedRealtime2)));
                            if (elapsedRealtime2 > 0) {
                                bh.this.bh();
                                bh.this.setVisibility(8);
                                if (bh.this.ud == null) {
                                    bh.this.ud = new Handler(Looper.getMainLooper());
                                }
                                bh.this.ud.removeCallbacksAndMessages(null);
                                bh.this.ud.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.kg.bh.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        bh.this.setVisibility(0);
                                        bh.this.fxn();
                                        bh.this.fxn(elapsedRealtime);
                                    }
                                }, elapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                bh.this.fxn(elapsedRealtime);
            }
        });
    }

    public void setView(View view) {
        this.f9225sg.fxn(view);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        rlu();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        rlu();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        rlu();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        jq jqVar;
        if (!this.hie && drawable == (jqVar = this.f9225sg) && jqVar.iwp()) {
            bh();
        } else if (!this.hie && (drawable instanceof jq)) {
            jq jqVar2 = (jq) drawable;
            if (jqVar2.iwp()) {
                jqVar2.zn();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof jq) && ((jq) drawable).bh() == ud.SOFTWARE) {
            this.f9225sg.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        jq jqVar = this.f9225sg;
        if (drawable2 == jqVar) {
            super.invalidateDrawable(jqVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        sg ke;
        jq jqVar = this.f9225sg;
        if (jqVar == null || (ke = jqVar.ke()) == null) {
            return null;
        }
        return ke.jq();
    }

    private hie fxn(String str) {
        jq jqVar;
        sg ke;
        Map<String, hie> xdg;
        if (TextUtils.isEmpty(str) || (jqVar = this.f9225sg) == null || (ke = jqVar.ke()) == null || (xdg = ke.xdg()) == null) {
            return null;
        }
        return xdg.get(str);
    }

    private sg.kg getGlobalEvent() {
        sg ke;
        jq jqVar = this.f9225sg;
        if (jqVar == null || (ke = jqVar.ke()) == null) {
            return null;
        }
        return ke.hie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sg.fxn getGlobalConfig() {
        sg ke;
        jq jqVar = this.f9225sg;
        if (jqVar == null || (ke = jqVar.ke()) == null) {
            return null;
        }
        return ke.dgx();
    }

    private void fxn(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            xdg();
            fxn();
            setFrame(i);
            fxn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.kg.bh.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (bh.this.getFrame() < i2 - 1 || bh.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + bh.this.getFrame());
                    bh.this.kg(this);
                    bh.this.bh();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void fxn(String str, String str2, JSONArray jSONArray) {
        sg.kg globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.fxn;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.gff;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.kg.gff.gff.fxn fxn2 = fxn(motionEvent);
        if (fxn2 != null) {
            String jq = fxn2.jq();
            if (fxn2 instanceof com.bytedance.adsdk.kg.gff.gff.kg) {
                if (getGlobalConfig() == null || getGlobalConfig().fxn != 1) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            }
            if (jq != null && jq.startsWith("CSJCLOSE")) {
                xdg();
            }
            hie fxn3 = fxn(fxn2.rb());
            if (fxn3 != null && motionEvent.getAction() == 1) {
                fxn(jq, fxn3.rb(), fxn3.sg());
                int[][] bh = fxn3.bh();
                if (bh != null) {
                    fxn(bh);
                } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().kg) != null) {
                    fxn(iArr);
                }
            }
            if (jq == null || !jq.startsWith("CSJNTP")) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (getGlobalConfig() == null || getGlobalConfig().fxn != 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private com.bytedance.adsdk.kg.gff.gff.fxn fxn(MotionEvent motionEvent) {
        com.bytedance.adsdk.kg.gff.gff.kg kg2;
        jq jqVar = this.f9225sg;
        if (jqVar == null || (kg2 = jqVar.kg()) == null) {
            return null;
        }
        return fxn(kg2, motionEvent);
    }

    private com.bytedance.adsdk.kg.gff.gff.fxn fxn(com.bytedance.adsdk.kg.gff.gff.kg kgVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.kg.gff.gff.fxn fxn2;
        for (com.bytedance.adsdk.kg.gff.gff.fxn fxnVar : kgVar.mvp()) {
            if (fxnVar instanceof com.bytedance.adsdk.kg.gff.gff.kg) {
                if (fxnVar.tw() && fxnVar.bh() > 0.0f) {
                    RectF rectF = new RectF();
                    fxnVar.fxn(rectF, fxnVar.hm(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (fxn2 = fxn((com.bytedance.adsdk.kg.gff.gff.kg) fxnVar, motionEvent)) != null) {
                        return fxn2;
                    }
                }
            } else if (fxnVar.tw() && fxnVar.bh() > 0.0f) {
                RectF rectF2 = new RectF();
                jq jqVar = this.f9225sg;
                if (jqVar != null && jqVar.sg()) {
                    fxnVar.fxn(rectF2, fxnVar.hm(), true);
                    RectF ax = this.f9225sg.ax();
                    if (ax != null) {
                        fxn(rectF2, ax);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    fxnVar.fxn(rectF3, fxnVar.hm(), true);
                    kg(rectF2, rectF3);
                }
                if (fxn(motionEvent, rectF2)) {
                    return fxnVar;
                }
            }
        }
        return null;
    }

    private boolean fxn(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void fxn(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.fxn[getScaleType().ordinal()];
        if (i == 1) {
            fxn(matrix, width, height, width2, height2);
        } else if (i == 2) {
            kg(matrix, width, height, width2, height2);
        } else if (i == 3) {
            gff(matrix, width, height, width2, height2);
        } else if (i == 4) {
            hm(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF);
    }

    /* renamed from: com.bytedance.adsdk.kg.bh$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            fxn = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                fxn[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void kg(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.f9225sg.getBounds().width();
        float height2 = this.f9225sg.getBounds().height();
        if (width == 0.0f || height == 0.0f || width2 == 0.0f || height2 == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.fxn[getScaleType().ordinal()];
        if (i == 1) {
            fxn(matrix, width, height, width2, height2);
        } else if (i == 2) {
            kg(matrix, width, height, width2, height2);
        } else if (i == 3) {
            gff(matrix, width, height, width2, height2);
        } else if (i == 4) {
            hm(matrix, width, height, width2, height2);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void fxn(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    private void kg(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    private void gff(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void hm(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        gff gffVar = new gff(super.onSaveInstanceState());
        gffVar.fxn = this.tw;
        gffVar.kg = this.jq;
        gffVar.gff = this.f9225sg.ggo();
        gffVar.hm = this.f9225sg.jz();
        gffVar.rb = this.f9225sg.hm();
        gffVar.bh = this.f9225sg.dx();
        gffVar.f9227sg = this.f9225sg.ums();
        return gffVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof gff)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gff gffVar = (gff) parcelable;
        super.onRestoreInstanceState(gffVar.getSuperState());
        this.tw = gffVar.fxn;
        if (!this.rlu.contains(hm.SET_ANIMATION) && !TextUtils.isEmpty(this.tw)) {
            setAnimation(this.tw);
        }
        this.jq = gffVar.kg;
        if (!this.rlu.contains(hm.SET_ANIMATION) && (i = this.jq) != 0) {
            setAnimation(i);
        }
        if (!this.rlu.contains(hm.SET_PROGRESS)) {
            fxn(gffVar.gff, false);
        }
        if (!this.rlu.contains(hm.PLAY_OPTION) && gffVar.hm) {
            fxn();
        }
        if (!this.rlu.contains(hm.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(gffVar.rb);
        }
        if (!this.rlu.contains(hm.SET_REPEAT_MODE)) {
            setRepeatMode(gffVar.bh);
        }
        if (this.rlu.contains(hm.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(gffVar.f9227sg);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.dgx) {
            return;
        }
        this.f9225sg.dgx();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xdg();
        Handler handler = this.ud;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        gff();
        kg();
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f9225sg.sg(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f9225sg.tw(z);
    }

    public void fxn(boolean z, Context context) {
        this.f9225sg.fxn(z, context);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f9225sg.fxn(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.f9225sg.gff();
    }

    public void setCacheComposition(boolean z) {
        this.mvp = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f9225sg.hm(z);
    }

    public void setAnimation(int i) {
        this.jq = i;
        this.tw = null;
        setCompositionTask(fxn(i));
    }

    private rlu<sg> fxn(final int i) {
        if (isInEditMode()) {
            return new rlu<>(new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.bh.13
                @Override // java.util.concurrent.Callable
                /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                public mvp<sg> call() throws Exception {
                    return bh.this.mvp ? tw.kg(bh.this.getContext(), i) : tw.kg(bh.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.mvp ? tw.fxn(getContext(), i) : tw.fxn(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.tw = str;
        this.jq = 0;
        setCompositionTask(kg(str));
    }

    private rlu<sg> kg(final String str) {
        if (isInEditMode()) {
            return new rlu<>(new Callable<mvp<sg>>() { // from class: com.bytedance.adsdk.kg.bh.2
                @Override // java.util.concurrent.Callable
                /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                public mvp<sg> call() throws Exception {
                    return bh.this.mvp ? tw.gff(bh.this.getContext(), str) : tw.gff(bh.this.getContext(), str, null);
                }
            }, true);
        }
        return this.mvp ? tw.kg(getContext(), str) : tw.kg(getContext(), str, (String) null);
    }

    public void setAnimationFromJson(String str) {
        fxn(str, (String) null);
    }

    public void fxn(String str, String str2) {
        fxn(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void fxn(InputStream inputStream, String str) {
        setCompositionTask(tw.fxn(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.mvp ? tw.fxn(getContext(), str) : tw.fxn(getContext(), str, (String) null));
    }

    public void setFailureListener(dgx<Throwable> dgxVar) {
        this.rb = dgxVar;
    }

    public void setFallbackResource(int i) {
        this.bh = i;
    }

    private void setCompositionTask(rlu<sg> rluVar) {
        this.rlu.add(hm.SET_ANIMATION);
        rmu();
        rlu();
        this.ckl = rluVar.fxn(this.gff).gff(this.hm);
    }

    private void rlu() {
        rlu<sg> rluVar = this.ckl;
        if (rluVar != null) {
            rluVar.kg(this.gff);
            this.ckl.hm(this.hm);
        }
    }

    private com.bytedance.adsdk.kg.gff.gff.gff fxn(com.bytedance.adsdk.kg.gff.gff.kg kgVar, String str) {
        for (com.bytedance.adsdk.kg.gff.gff.fxn fxnVar : kgVar.mvp()) {
            if (fxnVar instanceof com.bytedance.adsdk.kg.gff.gff.kg) {
                com.bytedance.adsdk.kg.gff.gff.gff fxn2 = fxn((com.bytedance.adsdk.kg.gff.gff.kg) fxnVar, str);
                if (fxn2 != null) {
                    return fxn2;
                }
            } else if (TextUtils.equals(str, fxnVar.jq()) && (fxnVar instanceof com.bytedance.adsdk.kg.gff.gff.gff)) {
                return (com.bytedance.adsdk.kg.gff.gff.gff) fxnVar;
            }
        }
        return null;
    }

    private com.bytedance.adsdk.kg.gff.gff.gff gff(String str) {
        com.bytedance.adsdk.kg.gff.gff.kg kg2;
        jq jqVar = this.f9225sg;
        if (jqVar == null || (kg2 = jqVar.kg()) == null) {
            return null;
        }
        return fxn(kg2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zu() {
        jq jqVar;
        int i;
        int i2;
        final int i3;
        if (this.xdg == null || (jqVar = this.f9225sg) == null) {
            return;
        }
        dx bx = jqVar.bx();
        sg.gff tw = this.xdg.tw();
        if (tw == null || bx == null) {
            return;
        }
        final int i4 = tw.fxn;
        if (i4 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4)));
            return;
        }
        final int i5 = -1;
        if (tw.rb == null || tw.rb.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i = tw.rb[0];
            i2 = tw.rb[1];
        }
        String fxn2 = bx.fxn(tw.gff);
        String fxn3 = bx.fxn(tw.hm);
        try {
            i3 = Integer.parseInt(fxn2);
            try {
                i5 = Integer.parseInt(fxn3);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        if (!TextUtils.isEmpty(tw.kg)) {
            Log.i("TMe", "--==--- timer, id:" + tw.kg);
            com.bytedance.adsdk.kg.gff.gff.gff gff2 = gff(tw.kg);
            if (gff2 != null) {
                Log.i("TMe", "--==--- timer success");
                this.ke = tw.bh;
                this.mve = tw.f9269sg;
                this.ums = gff2;
                this.iwp = i3;
                this.jz = i3 - i5;
                this.bx = i;
                this.uhw = i2;
                gff2.fxn(new StringBuilder().append(this.iwp).toString());
                fxn(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.kg.bh.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (bh.this.getFrame() < i4 - 1 || bh.this.getFrame() >= i4 + 2) {
                            return;
                        }
                        Log.i("TMe", "--==--- enter timer point, frame: " + bh.this.getFrame());
                        bh.this.kg(this);
                        if (i3 >= 0 && i5 >= 0) {
                            Log.i("TMe", "--==--- enter timer callback, start timer");
                            bh.this.ckl();
                        } else {
                            Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                        }
                        bh.this.bh();
                    }
                });
                return;
            }
            return;
        }
        Log.i("TMe", "--==--- timer fail, id is invalid: " + tw.kg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ckl() {
        this.rmu.postDelayed(this.zn, 1000L);
    }

    private void xdg() {
        this.rmu.removeCallbacksAndMessages(null);
    }

    public void setComposition(sg sgVar) {
        if (rb.fxn) {
            Log.v(fxn, "Set Composition \n".concat(String.valueOf(sgVar)));
        }
        this.f9225sg.setCallback(this);
        this.xdg = sgVar;
        this.hie = true;
        boolean fxn2 = this.f9225sg.fxn(sgVar, getContext().getApplicationContext());
        this.hie = false;
        if (getDrawable() != this.f9225sg || fxn2) {
            if (!fxn2) {
                je();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.zu.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public sg getComposition() {
        return this.xdg;
    }

    public void fxn() {
        if (this.dx == 0) {
            this.dx = SystemClock.elapsedRealtime();
        }
        this.rlu.add(hm.PLAY_OPTION);
        this.f9225sg.dgx();
    }

    public void setMinFrame(int i) {
        this.f9225sg.fxn(i);
    }

    public float getMinFrame() {
        return this.f9225sg.zu();
    }

    public void setMinProgress(float f) {
        this.f9225sg.fxn(f);
    }

    public void setMaxFrame(int i) {
        this.f9225sg.kg(i);
    }

    public float getMaxFrame() {
        return this.f9225sg.ckl();
    }

    public void setMaxProgress(float f) {
        this.f9225sg.kg(f);
    }

    public void setMinFrame(String str) {
        this.f9225sg.kg(str);
    }

    public void setMaxFrame(String str) {
        this.f9225sg.gff(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.f9225sg.hm(str);
    }

    public void setSpeed(float f) {
        this.f9225sg.gff(f);
    }

    public float getSpeed() {
        return this.f9225sg.xdg();
    }

    public void fxn(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9225sg.fxn(animatorUpdateListener);
    }

    public void kg(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f9225sg.kg(animatorUpdateListener);
    }

    public void kg() {
        this.f9225sg.rmu();
    }

    public void fxn(Animator.AnimatorListener animatorListener) {
        this.f9225sg.fxn(animatorListener);
    }

    public void kg(Animator.AnimatorListener animatorListener) {
        this.f9225sg.kg(animatorListener);
    }

    public void gff() {
        this.f9225sg.je();
    }

    public void fxn(boolean z) {
        this.f9225sg.rb(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.rlu.add(hm.SET_REPEAT_MODE);
        this.f9225sg.hm(i);
    }

    public int getRepeatMode() {
        return this.f9225sg.dx();
    }

    public void setRepeatCount(int i) {
        this.rlu.add(hm.SET_REPEAT_COUNT);
        this.f9225sg.rb(i);
    }

    public int getRepeatCount() {
        return this.f9225sg.ums();
    }

    public boolean hm() {
        return this.f9225sg.iwp();
    }

    public void setImageAssetsFolder(String str) {
        this.f9225sg.fxn(str);
    }

    public String getImageAssetsFolder() {
        return this.f9225sg.hm();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f9225sg.kg(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f9225sg.rb();
    }

    public Bitmap fxn(String str, Bitmap bitmap) {
        return this.f9225sg.fxn(str, bitmap);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.kg.hm hmVar) {
        this.f9225sg.fxn(hmVar);
    }

    public void setDefaultFontFileExtension(String str) {
        this.f9225sg.sg(str);
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.kg.gff gffVar) {
        this.f9225sg.fxn(gffVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f9225sg.fxn(map);
    }

    public void setTextDelegate(dx dxVar) {
        this.f9225sg.fxn(dxVar);
    }

    public void rb() {
        this.rlu.add(hm.PLAY_OPTION);
        this.f9225sg.mve();
    }

    public void bh() {
        this.dgx = false;
        this.f9225sg.zn();
    }

    public void setFrame(int i) {
        this.f9225sg.gff(i);
    }

    public int getFrame() {
        return this.f9225sg.ud();
    }

    public void setProgress(float f) {
        fxn(f, true);
    }

    private void fxn(float f, boolean z) {
        if (z) {
            this.rlu.add(hm.SET_PROGRESS);
        }
        this.f9225sg.hm(f);
    }

    public float getProgress() {
        return this.f9225sg.ggo();
    }

    public long getDuration() {
        sg sgVar = this.xdg;
        if (sgVar != null) {
            return (long) sgVar.rb();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f9225sg.gff(z);
    }

    public je getPerformanceTracker() {
        return this.f9225sg.tw();
    }

    private void rmu() {
        this.xdg = null;
        this.f9225sg.hie();
    }

    public void setSafeMode(boolean z) {
        this.f9225sg.bh(z);
    }

    public void setRenderMode(ud udVar) {
        this.f9225sg.fxn(udVar);
    }

    public ud getRenderMode() {
        return this.f9225sg.bh();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f9225sg.rb(z);
    }

    private void je() {
        boolean hm2 = hm();
        setImageDrawable(null);
        setImageDrawable(this.f9225sg);
        if (hm2) {
            this.f9225sg.rlu();
        }
    }

    private static class gff extends View.BaseSavedState {
        public static final Parcelable.Creator<gff> CREATOR = new Parcelable.Creator<gff>() { // from class: com.bytedance.adsdk.kg.bh.gff.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public gff createFromParcel(Parcel parcel) {
                return new gff(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public gff[] newArray(int i) {
                return new gff[i];
            }
        };
        int bh;
        String fxn;
        float gff;
        boolean hm;
        int kg;
        String rb;

        /* renamed from: sg, reason: collision with root package name */
        int f9227sg;

        gff(Parcelable parcelable) {
            super(parcelable);
        }

        private gff(Parcel parcel) {
            super(parcel);
            this.fxn = parcel.readString();
            this.gff = parcel.readFloat();
            this.hm = parcel.readInt() == 1;
            this.rb = parcel.readString();
            this.bh = parcel.readInt();
            this.f9227sg = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.fxn);
            parcel.writeFloat(this.gff);
            parcel.writeInt(this.hm ? 1 : 0);
            parcel.writeString(this.rb);
            parcel.writeInt(this.bh);
            parcel.writeInt(this.f9227sg);
        }
    }

    public void setLottieClicklistener(kg kgVar) {
        this.ggo = kgVar;
    }

    public void setLottieAnimListener(fxn fxnVar) {
        this.ax = fxnVar;
    }
}
