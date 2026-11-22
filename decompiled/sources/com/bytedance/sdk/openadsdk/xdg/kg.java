package com.bytedance.sdk.openadsdk.xdg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class kg {
    public static int fxn = -1;
    public static int gff = 1;
    public static int hm = 2;
    public static int kg = 0;
    public static int rb = 3;
    private int bh = fxn;

    /* renamed from: sg, reason: collision with root package name */
    private long f9579sg = 0;
    private long tw = 0;
    private final List<gff> jq = new ArrayList();
    private long hie = 0;

    public void fxn(long j) {
        this.bh = kg;
        this.f9579sg = j;
    }

    public void kg(long j) {
        int i;
        int i2 = this.bh;
        if (i2 == fxn || i2 == (i = rb)) {
            return;
        }
        this.bh = i;
        this.tw = j;
    }

    public void gff(long j) {
        int i;
        int i2 = this.bh;
        if (i2 == fxn || i2 == (i = hm) || i2 == rb) {
            return;
        }
        this.bh = i;
        this.hie = j;
    }

    public void hm(long j) {
        int i = this.bh;
        if (i == fxn || i != hm) {
            return;
        }
        this.bh = gff;
        this.jq.add(new gff(this.hie, j));
        this.hie = 0L;
    }

    public long fxn(long j, long j2) {
        long j3;
        long j4;
        long kg2;
        long j5 = this.tw;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (gff gffVar : this.jq) {
            if (gffVar.kg() > j) {
                if (j < gffVar.fxn()) {
                    j4 = i;
                    kg2 = gffVar.kg() - gffVar.fxn();
                } else {
                    j4 = i;
                    kg2 = gffVar.kg() - j;
                }
                i = (int) (j4 + kg2);
            }
        }
        long j6 = this.f9579sg;
        if (j6 < j) {
            long j7 = this.hie;
            if (j7 == 0) {
                j7 = this.tw;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - i;
        }
        long j8 = this.hie;
        if (j8 == 0) {
            j8 = this.tw;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - i;
        return j3 - i;
    }

    public int fxn() {
        return this.bh;
    }
}
