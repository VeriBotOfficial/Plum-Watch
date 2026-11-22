package com.bykv.vk.openvk.fxn.fxn.fxn.bh;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class gff extends rb implements SurfaceHolder.Callback, kg {
    private static final ArrayList<bh> gff = new ArrayList<>();
    private WeakReference<fxn> fxn;
    private kg.fxn hm;
    private bh kg;

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public View getView() {
        return this;
    }

    public gff(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        bh bhVar = new bh(this);
        this.kg = bhVar;
        gff.add(bhVar);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public void fxn(fxn fxnVar) {
        this.fxn = new WeakReference<>(fxnVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<bh> it = gff.iterator();
        while (it.hasNext()) {
            bh next = it.next();
            if (next != null && next.fxn() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.kg);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public void fxn(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<fxn> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().fxn(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<fxn> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().fxn(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<fxn> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().kg(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(kg.fxn fxnVar) {
        this.hm = fxnVar;
    }
}
