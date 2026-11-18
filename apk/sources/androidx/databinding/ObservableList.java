package androidx.databinding;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t);

        public abstract void onItemRangeChanged(T t, int r2, int r3);

        public abstract void onItemRangeInserted(T t, int r2, int r3);

        public abstract void onItemRangeMoved(T t, int r2, int r3, int r4);

        public abstract void onItemRangeRemoved(T t, int r2, int r3);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
