package com.bytedance.sdk.openadsdk.core.jq;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class hm {
    private static volatile hm gff;
    private static int kg;
    private final List<rb> fxn = new ArrayList();

    public static hm fxn() {
        if (gff == null) {
            synchronized (hm.class) {
                if (gff == null) {
                    gff = new hm();
                }
            }
        }
        return gff;
    }

    public rb kg() {
        rb remove;
        if (gff() > 0 && (remove = this.fxn.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public void fxn(rb rbVar) {
        if (rbVar != null) {
            kg(rbVar);
        }
    }

    public void kg(rb rbVar) {
        if (rbVar != null) {
            if (this.fxn.size() >= kg) {
                rbVar.xdg();
            } else {
                if (this.fxn.contains(rbVar)) {
                    return;
                }
                gff(rbVar);
                this.fxn.add(rbVar);
            }
        }
    }

    public int gff() {
        return this.fxn.size();
    }

    public void gff(rb rbVar) {
        if (rbVar == null || rbVar.getWebView() == null) {
            return;
        }
        if (rbVar.getParent() != null) {
            ((ViewGroup) rbVar.getParent()).removeView(rbVar);
        }
        try {
            rbVar.removeAllViews();
            rbVar.sg();
            rbVar.setWebChromeClient(null);
            rbVar.setWebViewClient(null);
            rbVar.setDownloadListener(null);
            rbVar.setDefaultTextEncodingName("UTF-8");
            rbVar.setAllowFileAccess(false);
            rbVar.setJavaScriptEnabled(true);
            rbVar.setCacheMode(-1);
            rbVar.setDatabaseEnabled(true);
            rbVar.setSupportZoom(false);
            rbVar.getWebView().setLayerType(0, null);
            rbVar.setBackgroundColor(0);
            rbVar.getWebView().setHorizontalScrollBarEnabled(false);
            rbVar.getWebView().setHorizontalScrollbarOverlay(false);
            rbVar.getWebView().setVerticalScrollBarEnabled(false);
            rbVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.fxn.gff.fxn(rbVar);
            rbVar.zu();
            rbVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }
}
