package com.necer.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.NestedScrollingChild;
import com.necer.R;

/* loaded from: classes17.dex */
public class ViewUtil {
    public static View getTargetView(Context context, View view) {
        View findViewWithTag = view.findViewWithTag(context.getString(R.string.N_factual_scroll_view));
        if (findViewWithTag != null && isViewVisible(findViewWithTag)) {
            return findViewWithTag;
        }
        try {
            traverseView(view);
            return null;
        } catch (ViewException e) {
            e.printStackTrace();
            return e.getExceptionView();
        }
    }

    private static void traverseView(View view) throws ViewException {
        if ((view instanceof NestedScrollingChild) && isViewVisible(view)) {
            throw new ViewException(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) && isViewVisible(childAt)) {
                    throw new ViewException(childAt);
                }
                traverseView(childAt);
            }
        }
    }

    private static boolean isViewVisible(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            int width = ((ViewGroup) parent).getWidth();
            Rect rect = new Rect();
            return view.getGlobalVisibleRect(rect) && rect.width() >= width / 2;
        }
        return view.getGlobalVisibleRect(new Rect());
    }

    public static class ViewException extends Throwable {
        private View view;

        public ViewException(View view) {
            this.view = view;
        }

        public View getExceptionView() {
            return this.view;
        }
    }
}
