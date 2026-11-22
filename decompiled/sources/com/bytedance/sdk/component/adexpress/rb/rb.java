package com.bytedance.sdk.component.adexpress.rb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.fxn.dx;
import com.bytedance.sdk.component.jq.bh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class rb {
    private static int bh = 10;
    private static volatile rb jq = null;
    private static final byte[] rb = new byte[0];
    private static int tw = 10;

    /* renamed from: sg, reason: collision with root package name */
    private final AtomicBoolean f9347sg = new AtomicBoolean(false);
    private List<bh> fxn = new ArrayList();
    private List<bh> kg = new ArrayList();
    private Map<Integer, gff> gff = new HashMap();
    private Map<Integer, hm> hm = new HashMap();

    private rb() {
        com.bytedance.sdk.component.adexpress.fxn.fxn.gff gff = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff();
        if (gff != null) {
            bh = gff.hie();
            tw = gff.dgx();
        }
    }

    public static rb fxn() {
        if (jq == null) {
            synchronized (rb.class) {
                if (jq == null) {
                    jq = new rb();
                }
            }
        }
        return jq;
    }

    public bh fxn(Context context, String str) {
        if (hm() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.hm.rb.fxn(str) && hm() <= 1) {
            new Object[]{"get WebView from newengine pool; but ad type is does not meet the requirement ", Integer.valueOf(hm())};
            return null;
        }
        bh remove = this.kg.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                new Object[]{"get WebView from newengine pool; current available count: ", Integer.valueOf(hm())};
            }
            return remove;
        } catch (Throwable unused) {
            new Object[]{"get WebView from newengine pool exception; current available count: ", Integer.valueOf(hm())};
            return null;
        }
    }

    public void fxn(bh bhVar) {
        if (bhVar == null) {
            return;
        }
        if (this.kg.size() >= tw) {
            try {
                Context context = bhVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                bhVar.xdg();
                return;
            } catch (Throwable th) {
                new Object[]{"WebView newengine pool is full，destroy webview ", th.getMessage()};
                return;
            }
        }
        if (this.kg.contains(bhVar)) {
            return;
        }
        try {
            Context context2 = bhVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                bhVar.setRecycler(true);
                this.kg.add(bhVar);
                new Object[]{"recycle WebView newengine，current available count: ", Integer.valueOf(hm())};
            }
        } catch (Throwable th2) {
            new Object[]{"recycle WebView newengine fail，current available count: ", Integer.valueOf(hm()), "exception is ", th2.getMessage()};
        }
    }

    public void kg(bh bhVar) {
        if (bhVar == null) {
            return;
        }
        sg(bhVar);
        bhVar.b_("SDK_INJECT_GLOBAL");
        bh(bhVar);
        fxn(bhVar);
    }

    public bh kg(Context context, String str) {
        if (gff() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.hm.rb.fxn(str) && gff() <= 1) {
            new Object[]{"get WebView from pool; but ad type is does not meet the requirement ", Integer.valueOf(gff())};
            return null;
        }
        bh remove = this.fxn.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                new Object[]{"get WebView from pool; current available count: ", Integer.valueOf(gff())};
            }
            return remove;
        } catch (Throwable unused) {
            new Object[]{"get WebView from pool exception; current available count: ", Integer.valueOf(gff())};
            return null;
        }
    }

    public void gff(bh bhVar) {
        if (bhVar == null) {
            return;
        }
        sg(bhVar);
        bhVar.b_("SDK_INJECT_GLOBAL");
        bh(bhVar);
        hm(bhVar);
    }

    public void hm(bh bhVar) {
        if (bhVar == null) {
            return;
        }
        if (this.fxn.size() >= bh) {
            try {
                Context context = bhVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                bhVar.xdg();
                return;
            } catch (Throwable th) {
                new Object[]{"WebView pool is full，destroy webview ", th.getMessage()};
                return;
            }
        }
        if (this.fxn.contains(bhVar)) {
            return;
        }
        try {
            Context context2 = bhVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                bhVar.setRecycler(true);
                this.fxn.add(bhVar);
                new Object[]{"recycle WebView，current available count: ", Integer.valueOf(gff())};
            }
        } catch (Throwable th2) {
            new Object[]{"recycle WebView fail，current available count: ", Integer.valueOf(gff()), "exception is ", th2.getMessage()};
        }
    }

    public boolean rb(bh bhVar) {
        if (bhVar == null) {
            return false;
        }
        try {
            Context context = bhVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            bhVar.xdg();
            return true;
        } catch (Throwable th) {
            new Object[]{"WebView abandon failed ", th.getMessage()};
            return true;
        }
    }

    public void kg() {
        for (bh bhVar : this.fxn) {
            if (bhVar != null) {
                try {
                    Context context = bhVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    bhVar.xdg();
                } catch (Throwable th) {
                    new Object[]{"WebView clear failed ", th.getMessage()};
                }
            }
        }
        this.fxn.clear();
        for (bh bhVar2 : this.kg) {
            if (bhVar2 != null) {
                try {
                    Context context2 = bhVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    bhVar2.xdg();
                } catch (Throwable th2) {
                    new Object[]{"WebView newengine clear failed ", th2.getMessage()};
                }
            }
        }
        this.kg.clear();
    }

    public int gff() {
        return this.fxn.size();
    }

    public int hm() {
        return this.kg.size();
    }

    private void sg(bh bhVar) {
        try {
            bhVar.removeAllViews();
            bhVar.sg();
            bhVar.setWebChromeClient(null);
            bhVar.setWebViewClient(null);
            bhVar.setDownloadListener(null);
            bhVar.setJavaScriptEnabled(true);
            bhVar.setCacheMode(-1);
            bhVar.setSupportZoom(false);
            bhVar.setUseWideViewPort(true);
            bhVar.setJavaScriptCanOpenWindowsAutomatically(true);
            bhVar.setDomStorageEnabled(true);
            bhVar.setBuiltInZoomControls(false);
            bhVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            bhVar.setLoadWithOverviewMode(false);
            bhVar.setDefaultTextEncodingName("UTF-8");
            bhVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    public void fxn(bh bhVar, kg kgVar) {
        if (bhVar == null || kgVar == null) {
            return;
        }
        gff gffVar = this.gff.get(Integer.valueOf(bhVar.hashCode()));
        if (gffVar != null) {
            gffVar.fxn(kgVar);
        } else {
            gffVar = new gff(kgVar);
            this.gff.put(Integer.valueOf(bhVar.hashCode()), gffVar);
        }
        bhVar.fxn(gffVar, "SDK_INJECT_GLOBAL");
    }

    public void bh(bh bhVar) {
        if (bhVar == null) {
            return;
        }
        gff gffVar = this.gff.get(Integer.valueOf(bhVar.hashCode()));
        if (gffVar != null) {
            gffVar.fxn(null);
        }
        bhVar.b_("SDK_INJECT_GLOBAL");
    }

    public void fxn(WebView webView, dx dxVar, String str) {
        if (webView == null || dxVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        hm hmVar = this.hm.get(Integer.valueOf(webView.hashCode()));
        if (hmVar != null) {
            hmVar.fxn(dxVar);
        } else {
            hmVar = new hm(dxVar);
            this.hm.put(Integer.valueOf(webView.hashCode()), hmVar);
        }
        webView.addJavascriptInterface(hmVar, str);
    }

    public void fxn(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        hm hmVar = this.hm.get(Integer.valueOf(webView.hashCode()));
        if (hmVar != null) {
            hmVar.fxn(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void fxn(int i) {
        synchronized (rb) {
            bh = i;
        }
    }

    public void kg(int i) {
        synchronized (rb) {
            tw = i;
        }
    }
}
