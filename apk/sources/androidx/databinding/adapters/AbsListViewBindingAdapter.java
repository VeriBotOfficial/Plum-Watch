package androidx.databinding.adapters;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes8.dex */
public class AbsListViewBindingAdapter {

    public interface OnScroll {
        void onScroll(AbsListView absListView, int r2, int r3, int r4);
    }

    public interface OnScrollStateChanged {
        void onScrollStateChanged(AbsListView absListView, int r2);
    }

    public static void setOnScroll(AbsListView absListView, final OnScroll onScroll, final OnScrollStateChanged onScrollStateChanged) {
        absListView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: androidx.databinding.adapters.AbsListViewBindingAdapter.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView2, int r3) {
                OnScrollStateChanged onScrollStateChanged2 = onScrollStateChanged;
                if (onScrollStateChanged2 != null) {
                    onScrollStateChanged2.onScrollStateChanged(absListView2, r3);
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView2, int r3, int r4, int r5) {
                OnScroll onScroll2 = onScroll;
                if (onScroll2 != null) {
                    onScroll2.onScroll(absListView2, r3, r4, r5);
                }
            }
        });
    }
}
