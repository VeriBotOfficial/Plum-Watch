package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.a.d;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* loaded from: classes12.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {
    private static final String d = "ATNativeAdvancedWebview";
    private d e;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.e == null) {
                this.e = new d(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
            getContext().registerReceiver(this.e, intentFilter);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            d dVar = this.e;
            if (dVar != null) {
                dVar.a();
                getContext().unregisterReceiver(this.e);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
