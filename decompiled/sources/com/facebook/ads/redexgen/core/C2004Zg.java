package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2004Zg {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C2004Zg.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<LH> A03;
    public final WeakReference<InterfaceC2005Zh> A04;
    public final WeakReference<C2301eX> A05;
    public final WeakReference<C1624Ki> A06;

    public C2004Zg(C1624Ki c1624Ki, InterfaceC2005Zh interfaceC2005Zh, C2301eX c2301eX, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C2228dL c2228dL) {
        this.A06 = new WeakReference<>(c1624Ki);
        this.A04 = new WeakReference<>(interfaceC2005Zh);
        this.A05 = new WeakReference<>(c2301eX);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c2228dL.A0F());
    }

    private LH A00() {
        LH funnel = this.A03.get();
        if (funnel == null) {
            return new C2564j3();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC1937Wr.A01(T5.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i, String str) {
        A00().AK6(i, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AK7();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AK8();
            if (this.A06.get().isShown()) {
                A00().AK9();
                new Handler(Looper.getMainLooper()).post(new C1630Ko(this.A05));
            }
            InterfaceC2005Zh interfaceC2005Zh = this.A04.get();
            if (interfaceC2005Zh != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2003Zf(this, interfaceC2005Zh));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1624Ki webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKA(true);
            return;
        }
        InterfaceC2005Zh interfaceC2005Zh = this.A04.get();
        if (interfaceC2005Zh == null) {
            A00().AKA(true);
            return;
        }
        LH A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AKA(false);
        interfaceC2005Zh.AET();
    }
}
