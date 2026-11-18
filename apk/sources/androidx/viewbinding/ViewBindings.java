package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class ViewBindings {
    private ViewBindings() {
    }

    public static <T extends View> T findChildViewById(View view, int r5) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            T t = (T) viewGroup.getChildAt(r2).findViewById(r5);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
