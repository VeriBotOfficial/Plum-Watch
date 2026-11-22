package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ay extends w<ba> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3862a = 1;
    public static final int b = 2;
    private String aA;
    private String ak;
    private String al;
    private String am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private long au;
    private int av;
    private String aw;
    private String ax;
    private String ay;
    private String az;
    public int c;
    public long d;
    String e = "";

    @Override // com.anythink.core.common.h.w
    public final int b() {
        return 1;
    }

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List a(ba baVar) {
        boolean z;
        ba baVar2 = baVar;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(baVar2.D()), "0") && !TextUtils.isEmpty(this.v)) {
            arrayList.add(this.v);
        }
        if (TextUtils.equals(String.valueOf(baVar2.D()), "2")) {
            String B = baVar2.B();
            if (!TextUtils.isEmpty(this.v)) {
                arrayList.add(this.v);
            }
            String d = d(baVar2);
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(B).append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(baVar2.D()), "1")) {
            if (!TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
                z = true;
            } else {
                stringBuffer.append("icon_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.s)) {
                arrayList.add(this.s);
            } else {
                stringBuffer.append("full_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.v)) {
                arrayList.add(this.v);
            } else {
                stringBuffer.append("video_u,");
                z = false;
            }
        } else {
            z = true;
        }
        if (TextUtils.equals(new StringBuilder().append(baVar2.D()).toString(), "3")) {
            if (!TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
            } else {
                stringBuffer.append("icon_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.s)) {
                arrayList.add(this.s);
            } else {
                stringBuffer.append("full_u,");
                z = false;
            }
            if (this.A == 1) {
                if (!TextUtils.isEmpty(this.v)) {
                    arrayList.add(this.v);
                } else {
                    stringBuffer.append("video_u,");
                    z = false;
                }
            }
        }
        if (TextUtils.equals(String.valueOf(baVar2.D()), "4")) {
            if (TextUtils.isEmpty(this.v)) {
                if (!TextUtils.isEmpty(this.s)) {
                    arrayList.add(this.s);
                } else {
                    stringBuffer.append("full_u,");
                    z = false;
                }
            } else {
                arrayList.add(this.v);
                if (!TextUtils.isEmpty(this.s)) {
                    arrayList.add(this.s);
                }
            }
        }
        if (z) {
            return arrayList;
        }
        this.e = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List b(ba baVar) {
        ba baVar2 = baVar;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(baVar2.D()), "2")) {
            String d = d(baVar2);
            if (!TextUtils.isEmpty(d) && TextUtils.equals(d, this.s) && !TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
            }
        }
        return arrayList;
    }

    private String aF() {
        return this.aA;
    }

    public final void a(String str) {
        this.aA = str;
    }

    private String aG() {
        return this.aw;
    }

    public final void b(String str) {
        this.aw = str;
    }

    private String aH() {
        return this.ax;
    }

    public final void X(String str) {
        this.ax = str;
    }

    private String aI() {
        return this.ay;
    }

    public final void Y(String str) {
        this.ay = str;
    }

    private String aJ() {
        return this.az;
    }

    public final void Z(String str) {
        this.az = str;
    }

    public final int d() {
        return this.av;
    }

    public final void a(int i) {
        this.av = i;
    }

    public final String e() {
        return this.ak;
    }

    public final void aa(String str) {
        this.ak = str;
    }

    public final String f() {
        return this.al;
    }

    public final void ab(String str) {
        this.al = str;
    }

    public final String g() {
        return this.am;
    }

    public final void ac(String str) {
        this.am = str;
    }

    public final String ay() {
        return this.an;
    }

    public final void ad(String str) {
        this.an = str;
    }

    public final String az() {
        return this.ao;
    }

    public final void ae(String str) {
        this.ao = str;
    }

    public final String aA() {
        return this.ap;
    }

    public final void af(String str) {
        this.ap = str;
    }

    public final String aB() {
        return this.aq;
    }

    public final void ag(String str) {
        this.aq = str;
    }

    public final String aC() {
        return this.ar;
    }

    public final void ah(String str) {
        this.ar = str;
    }

    public final String aD() {
        return this.as;
    }

    public final void ai(String str) {
        this.as = str;
    }

    public final String aE() {
        return this.at;
    }

    public final void aj(String str) {
        this.at = str;
    }

    private int aK() {
        return this.c;
    }

    private void b(int i) {
        this.c = i;
    }

    private long aL() {
        return this.d;
    }

    private void c(long j) {
        this.d = j;
    }

    private long aM() {
        return this.au;
    }

    public final void b(long j) {
        this.au = j;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final boolean a2(ba baVar) {
        return baVar == null || System.currentTimeMillis() - this.au > baVar.K();
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private List<String> b2(ba baVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(baVar.D()), "0") && !TextUtils.isEmpty(this.v)) {
            arrayList.add(this.v);
        }
        if (TextUtils.equals(String.valueOf(baVar.D()), "2")) {
            String B = baVar.B();
            if (!TextUtils.isEmpty(this.v)) {
                arrayList.add(this.v);
            }
            String d = d(baVar);
            if (!TextUtils.isEmpty(d)) {
                arrayList.add(d);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(B).append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(baVar.D()), "1")) {
            if (!TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
                z = true;
            } else {
                stringBuffer.append("icon_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.s)) {
                arrayList.add(this.s);
            } else {
                stringBuffer.append("full_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.v)) {
                arrayList.add(this.v);
            } else {
                stringBuffer.append("video_u,");
                z = false;
            }
        } else {
            z = true;
        }
        if (TextUtils.equals(new StringBuilder().append(baVar.D()).toString(), "3")) {
            if (!TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
            } else {
                stringBuffer.append("icon_u,");
                z = false;
            }
            if (!TextUtils.isEmpty(this.s)) {
                arrayList.add(this.s);
            } else {
                stringBuffer.append("full_u,");
                z = false;
            }
            if (this.A == 1) {
                if (!TextUtils.isEmpty(this.v)) {
                    arrayList.add(this.v);
                } else {
                    stringBuffer.append("video_u,");
                    z = false;
                }
            }
        }
        if (TextUtils.equals(String.valueOf(baVar.D()), "4")) {
            if (TextUtils.isEmpty(this.v)) {
                if (!TextUtils.isEmpty(this.s)) {
                    arrayList.add(this.s);
                } else {
                    stringBuffer.append("full_u,");
                    z = false;
                }
            } else {
                arrayList.add(this.v);
                if (!TextUtils.isEmpty(this.s)) {
                    arrayList.add(this.s);
                }
            }
        }
        if (z) {
            return arrayList;
        }
        this.e = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    private List<String> c(ba baVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(baVar.D()), "2")) {
            String d = d(baVar);
            if (!TextUtils.isEmpty(d) && TextUtils.equals(d, this.s) && !TextUtils.isEmpty(this.f3935q)) {
                arrayList.add(this.f3935q);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.core.common.h.w
    public String d(ba baVar) {
        char c;
        if (TextUtils.equals(String.valueOf(baVar.D()), "2")) {
            String B = baVar.B();
            switch (B.hashCode()) {
                case -559799608:
                    if (B.equals(y.c)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1507809730:
                    if (B.equals(y.f3939a)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1507809854:
                    if (B.equals(y.b)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1622564786:
                    if (B.equals(y.d)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        if (!TextUtils.isEmpty(this.az)) {
                            return this.az;
                        }
                    } else if (!TextUtils.isEmpty(this.aw)) {
                        return this.aw;
                    }
                } else if (!TextUtils.isEmpty(this.ay)) {
                    return this.ay;
                }
            } else if (!TextUtils.isEmpty(this.ax)) {
                return this.ax;
            }
            return this.s;
        }
        return "";
    }

    @Override // com.anythink.core.common.h.w
    public final String a() {
        return this.e;
    }

    public final String ak(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.aA);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }
}
