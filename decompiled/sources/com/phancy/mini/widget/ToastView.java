package com.phancy.mini.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anythink.core.express.b.a;
import com.phancy.mini.R;
import com.phancy.mini.utils.OSExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToastView.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/phancy/mini/widget/ToastView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "handler", "Landroid/os/Handler;", "hideAction", "Ljava/lang/Runnable;", "image", "Landroid/widget/ImageView;", "layout", "Landroid/widget/LinearLayout;", a.e, "Landroid/widget/ProgressBar;", "text", "Landroid/widget/TextView;", "cancelHideAction", "", "hide", "init", "onDetachedFromWindow", "setImage", "", "setMask", "mask", "", "show", "isLoading", "params", "Lcom/alibaba/fastjson/JSONObject;", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ToastView extends FrameLayout {
    private static final String TAG = "ToastView";
    private final Handler handler;
    private final Runnable hideAction;
    private ImageView image;
    private LinearLayout layout;
    private ProgressBar loading;
    private TextView text;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMask$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideAction$lambda$0(ToastView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        this.hideAction = new Runnable() { // from class: com.phancy.mini.widget.ToastView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ToastView.hideAction$lambda$0(ToastView.this);
            }
        };
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        this.hideAction = new Runnable() { // from class: com.phancy.mini.widget.ToastView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ToastView.hideAction$lambda$0(ToastView.this);
            }
        };
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        this.hideAction = new Runnable() { // from class: com.phancy.mini.widget.ToastView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ToastView.hideAction$lambda$0(ToastView.this);
            }
        };
        init(context);
    }

    private final void init(Context context) {
        setVisibility(8);
        FrameLayout.inflate(context, R.layout.mini_toast_view, this);
        this.image = (ImageView) findViewById(R.id.toast_image);
        this.loading = (ProgressBar) findViewById(R.id.toast_loading);
        this.text = (TextView) findViewById(R.id.toast_text);
        this.layout = (LinearLayout) findViewById(R.id.toast_layout);
    }

    private final void setMask(boolean mask) {
        if (mask) {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.phancy.mini.widget.ToastView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean mask$lambda$1;
                    mask$lambda$1 = ToastView.setMask$lambda$1(view, motionEvent);
                    return mask$lambda$1;
                }
            });
        } else {
            setOnTouchListener(null);
        }
    }

    private final void setImage(String image) {
        String str = image;
        if (str == null || str.length() == 0) {
            ProgressBar progressBar = this.loading;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.image;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (Intrinsics.areEqual("success", image)) {
            ProgressBar progressBar2 = this.loading;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            ImageView imageView2 = this.image;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.image;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ic_mini_success);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual("error", image)) {
            ProgressBar progressBar3 = this.loading;
            if (progressBar3 != null) {
                progressBar3.setVisibility(8);
            }
            ImageView imageView4 = this.image;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.image;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.ic_mini_error);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(a.e, image)) {
            ProgressBar progressBar4 = this.loading;
            if (progressBar4 != null) {
                progressBar4.setVisibility(0);
            }
            ImageView imageView6 = this.image;
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        ProgressBar progressBar5 = this.loading;
        if (progressBar5 != null) {
            progressBar5.setVisibility(8);
        }
        ImageView imageView7 = this.image;
        if (imageView7 != null) {
            imageView7.setVisibility(0);
        }
        ImageView imageView8 = this.image;
        if (imageView8 != null) {
            OSExtKt.load$default(imageView8, image, 0, false, null, null, 30, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show(boolean r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            r8.cancelHideAction()
            r1 = 0
            r2 = 1500(0x5dc, double:7.41E-321)
            r4 = 0
            java.lang.String r5 = "title"
            java.lang.String r5 = com.phancy.mini.utils.JsonExtKt.optString(r10, r5, r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r6 = "icon"
            java.lang.String r6 = com.phancy.mini.utils.JsonExtKt.optString(r10, r6, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r7 = "image"
            java.lang.String r0 = com.phancy.mini.utils.JsonExtKt.optString(r10, r7, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "duration"
            long r2 = com.phancy.mini.utils.JsonExtKt.optLong(r10, r7, r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = "mask"
            boolean r10 = com.phancy.mini.utils.JsonExtKt.optBoolean(r10, r7, r4)     // Catch: java.lang.Exception -> L2e
            goto L3f
        L2e:
            r10 = move-exception
            goto L3b
        L30:
            r10 = move-exception
            r0 = r1
            goto L3b
        L33:
            r10 = move-exception
            r0 = r1
            r6 = r0
            goto L3b
        L37:
            r10 = move-exception
            r0 = r1
            r5 = r0
            r6 = r5
        L3b:
            r10.printStackTrace()
            r10 = r4
        L3f:
            android.widget.TextView r7 = r8.text
            if (r7 != 0) goto L44
            goto L49
        L44:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r7.setText(r5)
        L49:
            r8.setMask(r10)
            if (r9 == 0) goto L54
            java.lang.String r9 = "loading"
            r8.setImage(r9)
            goto L83
        L54:
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L5f
            int r9 = r9.length()
            if (r9 != 0) goto L60
        L5f:
            r0 = r6
        L60:
            r9 = r0
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L79
            int r9 = r9.length()
            if (r9 != 0) goto L6c
            goto L79
        L6c:
            java.lang.String r9 = "none"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r9 == 0) goto L75
            goto L79
        L75:
            r8.setImage(r0)
            goto L7c
        L79:
            r8.setImage(r1)
        L7c:
            android.os.Handler r9 = r8.handler
            java.lang.Runnable r10 = r8.hideAction
            r9.postDelayed(r10, r2)
        L83:
            r8.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.phancy.mini.widget.ToastView.show(boolean, com.alibaba.fastjson.JSONObject):void");
    }

    public final void hide() {
        setVisibility(8);
        cancelHideAction();
    }

    private final void cancelHideAction() {
        this.handler.removeCallbacks(this.hideAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        cancelHideAction();
        super.onDetachedFromWindow();
    }
}
