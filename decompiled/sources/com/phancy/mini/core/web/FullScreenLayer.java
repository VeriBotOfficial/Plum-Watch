package com.phancy.mini.core.web;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.utils.OSExtKt;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FullScreenLayer.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u000fJ\"\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\rR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/phancy/mini/core/web/FullScreenLayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backSurface", "Lcom/phancy/mini/core/web/FullScreenLayer$BackSurface;", "callbackRef", "Ljava/lang/ref/WeakReference;", "Landroid/webkit/WebChromeClient$CustomViewCallback;", SDPKeywords.CLEAR, "", "doHideCustomView", "findSurfaceView", "Landroid/view/SurfaceView;", "view", "Landroid/view/View;", "onBackPressed", "", "onDestroy", "onHideCustomView", "webView", "Lcom/phancy/mini/core/web/MiniWebView;", _imp_adbrowser.ACTIVITY_PAUSE, _imp_adbrowser.ACTIVITY_RESUME, "onShowCustomView", "callback", "BackSurface", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FullScreenLayer extends FrameLayout {
    public static final int BG_COLOR = -16777216;
    private static final String TAG = "FullScreenLayer";
    private BackSurface backSurface;
    private WeakReference<WebChromeClient.CustomViewCallback> callbackRef;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenLayer(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullScreenLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FullScreenLayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClickable(true);
        setBackgroundColor(-16777216);
    }

    public final void onShowCustomView(MiniWebView webView, View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        MiniSDK.d(TAG, "onShowCustomView: isX5WebView=" + webView.getIsX5Core() + ' ' + view);
        if (view != null) {
            clear();
            setVisibility(0);
            if (!webView.getIsX5Core()) {
                SurfaceView findSurfaceView = findSurfaceView(view);
                if (findSurfaceView != null) {
                    findSurfaceView.setZOrderMediaOverlay(true);
                    Context context = findSurfaceView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    BackSurface backSurface = new BackSurface(context);
                    this.backSurface = backSurface;
                    backSurface.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    addView(backSurface);
                }
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                OSExtKt.applyCutoutModeByShortEdges(context2);
            }
            addView(view);
            this.callbackRef = new WeakReference<>(callback);
        }
    }

    private final SurfaceView findSurfaceView(View view) {
        if (view instanceof SurfaceView) {
            return (SurfaceView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            SurfaceView findSurfaceView = findSurfaceView(viewGroup.getChildAt(i));
            if (findSurfaceView != null) {
                return findSurfaceView;
            }
        }
        return null;
    }

    public final void onHideCustomView(MiniWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        MiniSDK.d(TAG, "onHideCustomView: isX5WebView=" + webView.getIsX5Core() + ' ' + getChildCount());
        doHideCustomView();
    }

    private final void doHideCustomView() {
        clear();
        setVisibility(8);
    }

    private final void clear() {
        BackSurface backSurface = this.backSurface;
        if (backSurface != null) {
            backSurface.onPause();
        }
        removeAllViews();
        this.backSurface = null;
        this.callbackRef = null;
    }

    public final boolean onBackPressed() {
        if (getVisibility() != 0) {
            return false;
        }
        MiniSDK.d(TAG, "onBackPressed: " + getChildCount());
        WeakReference<WebChromeClient.CustomViewCallback> weakReference = this.callbackRef;
        WebChromeClient.CustomViewCallback customViewCallback = weakReference != null ? weakReference.get() : null;
        doHideCustomView();
        if (customViewCallback == null) {
            return true;
        }
        customViewCallback.onCustomViewHidden();
        return true;
    }

    public final void onResume() {
        BackSurface backSurface = this.backSurface;
        if (backSurface != null) {
            backSurface.onResume();
        }
    }

    public final void onPause() {
        BackSurface backSurface = this.backSurface;
        if (backSurface != null) {
            backSurface.onPause();
        }
    }

    public final void onDestroy() {
        if (getChildCount() > 0) {
            MiniSDK.d(TAG, "onDestroy: " + getChildCount());
            clear();
        }
    }

    /* compiled from: FullScreenLayer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/phancy/mini/core/web/FullScreenLayer$BackSurface;", "Landroid/opengl/GLSurfaceView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", _imp_adbrowser.ACTIVITY_PAUSE, "", _imp_adbrowser.ACTIVITY_RESUME, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BackSurface extends GLSurfaceView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackSurface(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            setEGLContextClientVersion(3);
            setRenderer(new GLSurfaceView.Renderer() { // from class: com.phancy.mini.core.web.FullScreenLayer.BackSurface.1
                @Override // android.opengl.GLSurfaceView.Renderer
                public void onSurfaceCreated(GL10 gl, EGLConfig config) {
                    if (gl != null) {
                        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                }

                @Override // android.opengl.GLSurfaceView.Renderer
                public void onSurfaceChanged(GL10 gl, int width, int height) {
                    if (gl != null) {
                        gl.glViewport(0, 0, width, height);
                    }
                }

                @Override // android.opengl.GLSurfaceView.Renderer
                public void onDrawFrame(GL10 gl) {
                    if (gl != null) {
                        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                }
            });
            setRenderMode(0);
        }

        @Override // android.opengl.GLSurfaceView
        public void onResume() {
            MiniSDK.d(FullScreenLayer.TAG, "onResume: " + this);
            super.onResume();
        }

        @Override // android.opengl.GLSurfaceView
        public void onPause() {
            MiniSDK.d(FullScreenLayer.TAG, "onPause: " + this);
            super.onPause();
        }
    }
}
