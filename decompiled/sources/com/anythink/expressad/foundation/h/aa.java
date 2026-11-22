package com.anythink.expressad.foundation.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes12.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4916a = "ViewUtils";
    private static boolean b = false;

    public static boolean a(View view, int i) {
        if (view.getVisibility() != 0) {
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            return true;
        }
        Rect rect = new Rect();
        if (!(view.getGlobalVisibleRect(rect) && ((((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > (((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * (i == 1 ? 0.0f : 0.5f)) ? 1 : (((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) == (((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * (i == 1 ? 0.0f : 0.5f)) ? 0 : -1)) >= 0))) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int a2 = a(view2, viewGroup) + 1; a2 < viewGroup.getChildCount(); a2++) {
                View childAt = viewGroup.getChildAt(a2);
                if (childAt.getVisibility() == 0 && a(view, childAt)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            boolean b2 = b(view, viewGroup2);
                            b = false;
                            if (b2) {
                                return true;
                            }
                        }
                    }
                    if (a(childAt)) {
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        return false;
    }

    private static boolean a(View view) {
        return view.getAlpha() > 0.5f && view.getBackground() != null && view.getBackground().getAlpha() > 127;
    }

    private static boolean a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        return Rect.intersects(rect, rect2) && ((Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * (Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top))) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth();
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    private static boolean b(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    b = true;
                }
                if (a(childAt)) {
                    b = true;
                }
                if (b) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    b(view, (ViewGroup) childAt);
                }
            }
        }
        return b;
    }
}
