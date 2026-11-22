package com.bytedance.sdk.component.adexpress.rb;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class gff {
    private WeakReference<kg> fxn;

    public gff(kg kgVar) {
        this.fxn = new WeakReference<>(kgVar);
    }

    public void fxn(kg kgVar) {
        this.fxn = new WeakReference<>(kgVar);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference != null && weakReference.get() != null) {
            return this.fxn.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference != null && weakReference.get() != null) {
            return this.fxn.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference != null && weakReference.get() != null) {
            return this.fxn.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().muteVideo(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().clickEvent(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().skipVideo();
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference != null && weakReference.get() != null) {
            return this.fxn.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().initRenderFinish();
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().fxn(str);
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference != null && weakReference.get() != null) {
            return this.fxn.get().getData(str);
        }
        return "";
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<kg> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().videoFrameChanged(str);
    }
}
