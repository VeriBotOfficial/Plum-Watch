package com.phancy.mini.core;

import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.phancy.mini.core.app.tabbar.TabBar;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import kotlin.Metadata;

/* compiled from: IPage.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010 H&J\b\u0010!\u001a\u00020\u001dH&J\b\u0010\"\u001a\u00020\u001dH&J\b\u0010#\u001a\u00020\u001dH&J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u001dH&J\b\u0010(\u001a\u00020\u001dH&J\b\u0010)\u001a\u00020\u001dH&J$\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010.H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011¨\u0006/"}, d2 = {"Lcom/phancy/mini/core/IPage;", "", "contentHeight", "", "getContentHeight", "()I", "contentViewGroup", "Landroid/view/ViewGroup;", "getContentViewGroup", "()Landroid/view/ViewGroup;", "contentViewId", "getContentViewId", "contentWidth", "getContentWidth", "navigationBarTitle", "", "getNavigationBarTitle", "()Ljava/lang/String;", "setNavigationBarTitle", "(Ljava/lang/String;)V", "pagePath", "getPagePath", "tabBar", "Lcom/phancy/mini/core/app/tabbar/TabBar;", "getTabBar", "()Lcom/phancy/mini/core/app/tabbar/TabBar;", "userAgent", "getUserAgent", "evaluateJavascript", "", "script", "callback", "Landroid/webkit/ValueCallback;", "hideNavigationBarLoading", _imp_adbrowser.ACTIVITY_PAUSE, _imp_adbrowser.ACTIVITY_RESUME, "setNavigationBarColor", "frontColor", "backgroundColor", "showNavigationBarLoading", "startPullDownRefresh", "stopPullDownRefresh", "subscribeHandler", "event", "params", "viewIds", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IPage {
    void evaluateJavascript(String script, ValueCallback<String> callback);

    int getContentHeight();

    ViewGroup getContentViewGroup();

    int getContentViewId();

    int getContentWidth();

    String getNavigationBarTitle();

    String getPagePath();

    TabBar getTabBar();

    String getUserAgent();

    void hideNavigationBarLoading();

    void onPause();

    void onResume();

    void setNavigationBarColor(int frontColor, int backgroundColor);

    void setNavigationBarTitle(String str);

    void showNavigationBarLoading();

    void startPullDownRefresh();

    void stopPullDownRefresh();

    void subscribeHandler(String event, String params, int[] viewIds);
}
