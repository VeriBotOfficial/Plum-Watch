package com.bytedance.adsdk.ugeno.tw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes15.dex */
public abstract class kg {
    private final DataSetObservable fxn = new DataSetObservable();
    private DataSetObserver kg;

    public float fxn(int r1) {
        return 1.0f;
    }

    public abstract int fxn();

    public int fxn(Object obj) {
        return -1;
    }

    public abstract boolean fxn(View view, Object obj);

    public Parcelable kg() {
        return null;
    }

    public Object fxn(ViewGroup viewGroup, int r2) {
        return fxn((View) viewGroup, r2);
    }

    public void fxn(ViewGroup viewGroup, int r2, Object obj) {
        fxn((View) viewGroup, r2, obj);
    }

    @Deprecated
    public Object fxn(View view, int r2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void fxn(View view, int r2, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void gff() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.kg;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.fxn.notifyChanged();
    }

    void fxn(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.kg = dataSetObserver;
        }
    }
}
