package com.xmly.businesssdk.webview.h5;

import android.webkit.WebView;
import com.xmly.businesssdk.webview.url.UrlParamParser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: H5CommunicationManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/webview/h5/H5CommunicationManager;", "", "webView", "Landroid/webkit/WebView;", "urlParamParser", "Lcom/xmly/businesssdk/webview/url/UrlParamParser;", "(Landroid/webkit/WebView;Lcom/xmly/businesssdk/webview/url/UrlParamParser;)V", "handleAlbumId", "", "albumId", "", "handleTrackId", "trackId", "handleUrlParams", "url", "sendSearchKeywordToH5", "keyword", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class H5CommunicationManager {
    private final UrlParamParser urlParamParser;
    private final WebView webView;

    public H5CommunicationManager(WebView webView, UrlParamParser urlParamParser) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(urlParamParser, "urlParamParser");
        this.webView = webView;
        this.urlParamParser = urlParamParser;
    }

    private final void handleAlbumId(String albumId) {
    }

    private final void handleTrackId(String trackId) {
    }

    private final void sendSearchKeywordToH5(String keyword) {
        this.webView.evaluateJavascript("javascript:window.handleSearchKeyword('" + keyword + "')", null);
    }

    public final void handleUrlParams(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        for (Map.Entry<String, String> entry : this.urlParamParser.parseUrlParams(url).entrySet()) {
            entry.getKey();
            String value = entry.getValue();
            if (this.urlParamParser.isSearchKeyword(value)) {
                sendSearchKeywordToH5(value);
            } else if (this.urlParamParser.isAlbumId(value)) {
                handleAlbumId(value);
            } else if (this.urlParamParser.isTrackId(value)) {
                handleTrackId(value);
            }
        }
    }
}
