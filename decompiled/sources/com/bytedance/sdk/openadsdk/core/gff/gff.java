package com.bytedance.sdk.openadsdk.core.gff;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.jq;

/* loaded from: classes14.dex */
public abstract class gff implements View.OnClickListener, View.OnTouchListener {
    private static float fxn = 0.0f;
    private static float gff = 0.0f;
    protected static int ggo = 8;
    private static float hm;
    private static float kg;
    private static long rb;
    protected View ci;
    protected float dx = -1.0f;
    protected float ums = -1.0f;
    protected float iwp = -1.0f;
    protected float jz = -1.0f;
    protected long bx = -1;
    protected long uhw = -1;
    protected int ke = -1;
    protected int mve = -1024;
    protected int zn = -1;
    protected boolean ax = true;
    public SparseArray<fxn> rz = new SparseArray<>();
    private int bh = 0;

    /* renamed from: sg, reason: collision with root package name */
    private int f9470sg = 0;

    protected abstract void fxn(View view, float f, float f2, float f3, float f4, SparseArray<fxn> sparseArray, boolean z);

    static {
        if (rmu.fxn() != null) {
            ggo = rmu.kg();
        }
        fxn = 0.0f;
        kg = 0.0f;
        gff = 0.0f;
        hm = 0.0f;
        rb = 0L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (jq.fxn()) {
            fxn(view, this.dx, this.ums, this.iwp, this.jz, this.rz, this.ax);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.gff.gff.hm <= r3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.gff.gff.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private boolean fxn(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (kg.kg(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (fxn(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class fxn {
        public int fxn;
        public double gff;
        public long hm;
        public double kg;

        public fxn(int i, double d, double d2, long j) {
            this.fxn = i;
            this.kg = d;
            this.gff = d2;
            this.hm = j;
        }
    }

    public boolean bh() {
        return this.ax;
    }
}
