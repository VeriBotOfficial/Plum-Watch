package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class ListViewCompat {
    @Deprecated
    public static void scrollListBy(ListView listView, int r1) {
        listView.scrollListBy(r1);
    }

    @Deprecated
    public static boolean canScrollList(ListView listView, int r1) {
        return listView.canScrollList(r1);
    }

    private ListViewCompat() {
    }
}
