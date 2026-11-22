package com.xmly.businesssdk.utils;

import android.R;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes3.dex */
public class StatusBarUtils {
    public static final int DEFAULT_STATUS_BAR_ALPHA = 112;

    public static class StatusBarView extends View {
        public StatusBarView(Context context) {
            super(context);
        }

        public StatusBarView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public StatusBarView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    private static void addTranslucentView(Activity activity, int i) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup.getChildCount() > 1) {
            viewGroup.getChildAt(1).setBackgroundColor(Color.argb(i, 0, 0, 0));
        } else {
            viewGroup.addView(createTranslucentStatusBarView(activity, i));
        }
    }

    private static int calculateStatusColor(int i, int i2) {
        float f = 1.0f - (i2 / 255.0f);
        return ((int) (((i & 255) * f) + 0.5d)) | (((int) ((((i >> 16) & 255) * f) + 0.5d)) << 16) | (-16777216) | (((int) ((((i >> 8) & 255) * f) + 0.5d)) << 8);
    }

    private static void clearPreviousSetting(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = childCount - 1;
            if (viewGroup.getChildAt(i) instanceof StatusBarView) {
                viewGroup.removeViewAt(i);
                ((ViewGroup) ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0)).setPadding(0, 0, 0, 0);
            }
        }
    }

    private static StatusBarView createStatusBarView(Activity activity, int i) {
        return createStatusBarView(activity, i, -1);
    }

    private static StatusBarView createTranslucentStatusBarView(Activity activity, int i) {
        return createStatusBarView(activity, -1, i);
    }

    public static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void setColor(Activity activity, int i) {
        setColor(activity, i, 112);
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        setColorForDrawerLayout(activity, drawerLayout, i, 112);
    }

    public static void setColorNoTranslucent(Activity activity, int i) {
        setColor(activity, i, 0);
    }

    public static void setColorNoTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        setColorForDrawerLayout(activity, drawerLayout, i, 0);
    }

    private static void setRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
        viewGroup.setFitsSystemWindows(true);
        viewGroup.setClipToPadding(true);
    }

    public static void setTranslucent(Activity activity) {
        setTranslucent(activity, 112);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        setTranslucentForDrawerLayout(activity, drawerLayout, 112);
    }

    public static void setTranslucentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, 112, view);
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 112, view);
    }

    public static void setTransparentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, 0, view);
    }

    public static void setTransparentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 0, view);
    }

    private static StatusBarView createStatusBarView(Activity activity, int i, int i2) {
        StatusBarView statusBarView = new StatusBarView(activity);
        statusBarView.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        if (i2 == -1) {
            statusBarView.setBackgroundColor(i);
            return statusBarView;
        }
        if (i == -1) {
            statusBarView.setBackgroundColor(Color.argb(i2, 0, 0, 0));
            return statusBarView;
        }
        statusBarView.setBackgroundColor(calculateStatusColor(i, i2));
        return statusBarView;
    }

    public static void setFullScreen(Activity activity) {
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, int i, View view) {
        setTranslucentForImageView(activity, i, view);
    }

    private static void transparentStatusBar(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().addFlags(134217728);
        activity.getWindow().setStatusBarColor(0);
    }

    public static void setColor(Activity activity, int i, int i2) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(calculateStatusColor(i, i2));
    }

    public static void setTranslucentForCoordinatorLayout(Activity activity, int i) {
        transparentStatusBar(activity);
        addTranslucentView(activity, i);
    }

    public static void setTransparent(Activity activity) {
        transparentStatusBar(activity);
        setRootView(activity);
    }

    public static void setTranslucent(Activity activity, int i) {
        setTransparent(activity);
        addTranslucentView(activity, i);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i) {
        setTransparentForDrawerLayout(activity, drawerLayout);
        addTranslucentView(activity, i);
    }

    public static void setTransparentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(0, getStatusBarHeight(activity), 0, 0);
        }
        ViewGroup viewGroup2 = (ViewGroup) drawerLayout.getChildAt(1);
        drawerLayout.setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        viewGroup.setClipToPadding(true);
        viewGroup2.setFitsSystemWindows(false);
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        if (viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof StatusBarView)) {
            viewGroup.getChildAt(0).setBackgroundColor(calculateStatusColor(i, i2));
        } else {
            viewGroup.addView(createStatusBarView(activity, i), 0);
        }
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + getStatusBarHeight(activity), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        ViewGroup viewGroup2 = (ViewGroup) drawerLayout.getChildAt(1);
        drawerLayout.setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        viewGroup.setClipToPadding(true);
        viewGroup2.setFitsSystemWindows(false);
        addTranslucentView(activity, i2);
    }

    public static void setTranslucentForImageView(Activity activity, int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        if (activity instanceof TabActivity) {
            activity.getWindow().setFlags(67108864, 67108864);
        }
        addTranslucentView(activity, i);
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMargins(0, getStatusBarHeight(activity), 0, 0);
    }
}
