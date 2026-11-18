package androidx.databinding;

/* JADX INFO: loaded from: classes8.dex */
public interface Observable {

    public static abstract class OnPropertyChangedCallback {
        public abstract void onPropertyChanged(Observable observable, int r2);
    }

    void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback);

    void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback);
}
