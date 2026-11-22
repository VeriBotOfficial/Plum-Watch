package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class bj extends w<bk> {
    public static final int ao = 1;
    public static final int ap = 2;
    public static final int aq = 3;
    public static final int ar = 4;
    public static final int as = 5;
    public static final int at = 6;
    long aA;
    long aB;
    private String aD;
    private String aE;
    private String aF;
    private String aG;
    private String aH;
    private int aI;
    private int aJ;
    long ak;
    String al;
    String am;
    int an;
    String au;
    String av;
    bl aw;
    int ax;
    String ay;
    long az;
    private int b;
    private int c;
    private int d;
    private int e;

    /* renamed from: a, reason: collision with root package name */
    private final String f3872a = getClass().getSimpleName();
    String aC = "";

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List b(bk bkVar) {
        bk bkVar2 = bkVar;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(new StringBuilder().append(bkVar2.D()).toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f3935q)) {
            arrayList.add(this.f3935q);
        }
        if (TextUtils.equals(String.valueOf(bkVar2.D()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f3935q)) {
            arrayList.add(this.f3935q);
        }
        return arrayList;
    }

    public final void b(long j) {
        this.az = j;
        this.aB = this.aA + j;
    }

    public final void c(long j) {
        this.aA = j;
    }

    public final boolean ay() {
        return System.currentTimeMillis() >= this.aB;
    }

    public final void d(long j) {
        this.aB = j;
    }

    public final long az() {
        return this.aB;
    }

    private long d() {
        return this.az;
    }

    public final String aA() {
        return this.aD;
    }

    public final void X(String str) {
        this.aD = str;
    }

    public final String aB() {
        return this.aE;
    }

    public final void Y(String str) {
        this.aE = str;
    }

    public final String aC() {
        return this.aF;
    }

    public final void Z(String str) {
        this.aF = str;
    }

    public final String aD() {
        return this.aG;
    }

    public final void aa(String str) {
        this.aG = str;
    }

    public final String aE() {
        return this.aH;
    }

    public final void ab(String str) {
        this.aH = str;
    }

    public final int aF() {
        return this.aI;
    }

    public final void r(int i) {
        this.aI = i;
    }

    public final int aG() {
        return this.aJ;
    }

    public final void s(int i) {
        this.aJ = i;
    }

    private int e() {
        return this.ax;
    }

    private void a(int i) {
        this.ax = i;
    }

    public final bl aH() {
        return this.aw;
    }

    public final void a(bl blVar) {
        this.aw = blVar;
    }

    private long f() {
        return this.ak;
    }

    public final void e(long j) {
        this.ak = j;
    }

    private String g() {
        return this.al;
    }

    public final void ac(String str) {
        this.al = str;
    }

    public final String aI() {
        return this.am;
    }

    public final void ad(String str) {
        this.am = str;
    }

    public final int aJ() {
        return this.an;
    }

    public final void t(int i) {
        this.an = i;
    }

    public final String aK() {
        return this.au;
    }

    public final void ae(String str) {
        this.au = str;
    }

    private String aM() {
        return this.av;
    }

    public final void af(String str) {
        this.av = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0113, code lost:
    
        if (r6 != 4) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
    @Override // com.anythink.core.common.h.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> a(com.anythink.core.common.h.bk r9) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.h.bj.a(com.anythink.core.common.h.bk):java.util.List");
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private List<String> b2(bk bkVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(new StringBuilder().append(bkVar.D()).toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f3935q)) {
            arrayList.add(this.f3935q);
        }
        if (TextUtils.equals(String.valueOf(bkVar.D()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f3935q)) {
            arrayList.add(this.f3935q);
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public String a() {
        return this.aC;
    }

    public final String aL() {
        return this.ay;
    }

    public final void ag(String str) {
        this.ay = str;
    }

    private int aN() {
        return this.b;
    }

    public final void u(int i) {
        this.b = i;
    }

    private int aO() {
        return this.c;
    }

    public final void v(int i) {
        this.c = i;
    }

    private int aP() {
        return this.d;
    }

    public final void w(int i) {
        this.d = i;
    }

    private int aQ() {
        return this.e;
    }

    public final void x(int i) {
        this.e = i;
    }

    public final boolean a(boolean z, boolean z2) {
        return z ? z2 ? this.b == 1 : this.c == 1 : z2 ? this.d == 1 : this.e == 1;
    }
}
