package com.phancy.mini.core.app.tabbar;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.phancy.mini.core.app.MiniApp;
import com.phancy.mini.core.app.MiniAppConfig;
import com.phancy.mini.core.engine.web.WebPage;
import com.phancy.mini.utils.H5Color;
import com.phancy.mini.utils.OSExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabBar.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/phancy/mini/core/app/tabbar/TabBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "app", "Lcom/phancy/mini/core/app/MiniApp;", "(Landroid/content/Context;Lcom/phancy/mini/core/app/MiniApp;)V", "<set-?>", "Landroid/view/View;", "border", "getBorder", "()Landroid/view/View;", "bottomBorder", "getBottomBorder", "switchTabListener", "Lcom/phancy/mini/core/app/tabbar/TabBar$OnSwitchTabListener;", "tabItemLayout", "getTabItemLayout", "()Landroid/widget/LinearLayout;", "init", "", "setOnSwitchTabListener", "listener", WebPage.SWITCH_TAB, "url", "", "OnSwitchTabListener", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TabBar extends LinearLayout {
    private View border;
    private View bottomBorder;
    private OnSwitchTabListener switchTabListener;
    private LinearLayout tabItemLayout;

    /* compiled from: TabBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/phancy/mini/core/app/tabbar/TabBar$OnSwitchTabListener;", "", WebPage.SWITCH_TAB, "", "url", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnSwitchTabListener {
        void switchTab(String url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBar(Context context, MiniApp app) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        init(context, app);
    }

    public final LinearLayout getTabItemLayout() {
        return this.tabItemLayout;
    }

    public final View getBorder() {
        return this.border;
    }

    public final View getBottomBorder() {
        return this.bottomBorder;
    }

    private final void init(Context context, MiniApp app) {
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, OSExtKt.dip2px(49, context)));
        MiniAppConfig appConfig = app.getAppConfig();
        boolean isTopTabBar = appConfig.isTopTabBar();
        String tabBarBorderColor = appConfig.getTabBarBorderColor();
        String tabBarBackgroundColor = appConfig.getTabBarBackgroundColor();
        List<TabItemInfo> tabItemList = appConfig.getTabItemList();
        if (tabItemList.isEmpty()) {
            return;
        }
        setBackgroundColor(H5Color.parseColor(tabBarBackgroundColor));
        View view = new View(context);
        view.setBackgroundColor(H5Color.parseColor(tabBarBorderColor));
        addView(view, new LinearLayout.LayoutParams(-1, 1));
        this.border = view;
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabItemLayout = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.tabItemLayout, new LinearLayout.LayoutParams(-1, -1));
        int size = tabItemList.size();
        for (int i = 0; i < size; i++) {
            TabItemInfo tabItemInfo = tabItemList.get(i);
            TabItemView tabItemView = new TabItemView(app);
            tabItemView.setInfo(tabItemInfo);
            tabItemView.setTop(isTopTabBar);
            tabItemView.setOnClickListener(new View.OnClickListener() { // from class: com.phancy.mini.core.app.tabbar.TabBar$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TabBar.init$lambda$1(TabBar.this, view2);
                }
            });
            LinearLayout linearLayout2 = this.tabItemLayout;
            if (linearLayout2 != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                Unit unit = Unit.INSTANCE;
                linearLayout2.addView(tabItemView, layoutParams);
            }
        }
        if (isTopTabBar) {
            View view2 = new View(context);
            view2.setBackgroundColor(H5Color.parseColor(tabBarBorderColor));
            addView(view2, new LinearLayout.LayoutParams(-1, 1));
            this.bottomBorder = view2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(TabBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.isSelected()) {
            return;
        }
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.phancy.mini.core.app.tabbar.TabItemView");
        String pagePath = ((TabItemView) view).getPagePath();
        OnSwitchTabListener onSwitchTabListener = this$0.switchTabListener;
        if (onSwitchTabListener != null) {
            onSwitchTabListener.switchTab(pagePath);
        }
    }

    public final void switchTab(String url) {
        LinearLayout linearLayout = this.tabItemLayout;
        int childCount = linearLayout != null ? linearLayout.getChildCount() : 0;
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout2 = this.tabItemLayout;
            View childAt = linearLayout2 != null ? linearLayout2.getChildAt(i) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.phancy.mini.core.app.tabbar.TabItemView");
            TabItemView tabItemView = (TabItemView) childAt;
            tabItemView.setSelected(Intrinsics.areEqual(url, tabItemView.getPagePath()));
        }
    }

    public final void setOnSwitchTabListener(OnSwitchTabListener listener) {
        this.switchTabListener = listener;
    }
}
