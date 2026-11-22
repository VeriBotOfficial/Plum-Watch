package com.bytedance.sdk.component.jq;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.jq.bh;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public class rb extends WebView {
    private gff bh;
    public long fxn;
    private boolean gff;
    private boolean hm;
    private final HashSet<String> kg;
    private boolean rb;

    public rb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.kg = new HashSet<>();
        this.fxn = System.currentTimeMillis();
        fxn();
    }

    public rb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kg = new HashSet<>();
        this.fxn = System.currentTimeMillis();
        fxn();
    }

    public void setTouchListenerProxy(gff gffVar) {
        this.bh = gffVar;
    }

    private void fxn() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new bh.fxn());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        new StringBuilder("addJavascriptInterface: ").append(str).append(", ").append(this);
        if (this.gff || this.rb) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.kg.add(str);
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.gff || this.rb) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.kg.remove(str);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.gff || this.rb) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.gff || this.rb) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.gff || this.rb) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.gff || this.rb) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.gff || this.rb) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.gff || this.rb) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.gff || this.rb) {
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.gff || this.rb) {
            return;
        }
        super.clearCache(z);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.gff || this.rb) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.gff || this.rb) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.gff || this.rb) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.gff || this.rb) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.gff && !this.rb) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        new StringBuilder("onAttachedToWindow: ").append(this);
    }

    public void setDestroyOnDetached(boolean z) {
        this.hm = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        new StringBuilder("onDetachedFromWindow: ").append(this);
        if (this.hm) {
            destroy();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.gff || this.rb) {
            return;
        }
        super.resumeTimers();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.gff || this.rb) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.gff || this.rb) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        new StringBuilder("destroy() called, ").append(this);
        if (this.gff) {
            return;
        }
        this.gff = true;
        kg();
        super.destroy();
    }

    private void kg() {
        if (this.gff) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.kg.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    public void setRecycler(boolean z) {
        this.rb = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        gff gffVar = this.bh;
        if (gffVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            gffVar.fxn(onTouchListener);
            super.setOnTouchListener(this.bh);
        }
    }
}
