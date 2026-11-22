package qiu.niorgai;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes7.dex */
public class StatusBarCompat {
    static int calculateStatusBarColor(int i, int i2) {
        float f = 1.0f - (i2 / 255.0f);
        return ((int) (((i & 255) * f) + 0.5d)) | (((int) ((((i >> 16) & 255) * f) + 0.5d)) << 16) | (-16777216) | (((int) ((((i >> 8) & 255) * f) + 0.5d)) << 8);
    }

    public static void setStatusBarColor(Activity activity, int i, int i2) {
        setStatusBarColor(activity, calculateStatusBarColor(i, i2));
    }

    public static void setStatusBarColor(Activity activity, int i) {
        StatusBarCompatLollipop.setStatusBarColor(activity, i);
    }

    public static void translucentStatusBar(Activity activity) {
        translucentStatusBar(activity, false);
    }

    public static void translucentStatusBar(Activity activity, boolean z) {
        StatusBarCompatLollipop.translucentStatusBar(activity, z);
    }

    public static void setStatusBarColorForCollapsingToolbar(Activity activity, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, int i) {
        StatusBarCompatLollipop.setStatusBarColorForCollapsingToolbar(activity, appBarLayout, collapsingToolbarLayout, toolbar, i);
    }

    public static void changeToLightStatusBar(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public static void cancelLightStatusBar(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }
}
