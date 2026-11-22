package com.anythink.basead.webtemplet;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    WTWebView f3477a;
    g b;
    private final String c = "j";
    private c d;

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    private void a(WTWebView wTWebView) {
        this.f3477a = wTWebView;
        this.b = new g(wTWebView);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.messageLevel() == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AnonymousClass1.f3478a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            new StringBuilder("[").append(consoleMessage.messageLevel());
            consoleMessage.message();
        } else if (i == 2 || i == 3) {
            new StringBuilder("[").append(consoleMessage.messageLevel());
            consoleMessage.message();
        } else {
            new StringBuilder("[").append(consoleMessage.messageLevel());
            consoleMessage.message();
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (this.b == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        String message = consoleMessage.message();
        if (!TextUtils.isEmpty(message) && message.startsWith(h.f3475a) && this.b.a(h.f3475a)) {
            this.b.c(message);
            return true;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    /* renamed from: com.anythink.basead.webtemplet.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3478a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f3478a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3478a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3478a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3478a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3478a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(c cVar) {
        this.d = cVar;
    }
}
