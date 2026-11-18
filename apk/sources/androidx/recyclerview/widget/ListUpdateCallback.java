package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes7.dex */
public interface ListUpdateCallback {
    void onChanged(int r1, int r2, Object obj);

    void onInserted(int r1, int r2);

    void onMoved(int r1, int r2);

    void onRemoved(int r1, int r2);
}
