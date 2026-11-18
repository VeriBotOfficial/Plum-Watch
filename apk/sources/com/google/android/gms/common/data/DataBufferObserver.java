package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes15.dex */
public interface DataBufferObserver {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int r1, int r2);

    void onDataRangeInserted(int r1, int r2);

    void onDataRangeMoved(int r1, int r2, int r3);

    void onDataRangeRemoved(int r1, int r2);
}
