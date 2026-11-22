package com.bytedance.adsdk.ugeno.tw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public abstract class kg {
    private final DataSetObservable fxn = new DataSetObservable();
    private DataSetObserver kg;

    public float fxn(int i) {
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

    public Object fxn(ViewGroup viewGroup, int i) {
        return fxn((View) viewGroup, i);
    }

    public void fxn(ViewGroup viewGroup, int i, Object obj) {
        fxn((View) viewGroup, i, obj);
    }

    @Deprecated
    public Object fxn(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void fxn(View view, int i, Object obj) {
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
