package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class c {
    private static final String U = "AcquireRewardPopViewParameters";
    public com.anythink.expressad.widget.rewardpopview.a T;

    /* renamed from: a, reason: collision with root package name */
    public String f5581a;
    public String b;
    public int c;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    /* renamed from: q, reason: collision with root package name */
    public List<String> f5582q;
    public List<String> r;
    public int d = 5;
    public int e = 0;
    public boolean f = true;
    public int s = -15750;
    public int t = -27861;
    public int u = -1054;
    public int v = -8011;
    public int w = -29952;
    public int x = 871331329;
    public int y = -1741031;
    public int z = -7772596;
    public int A = -1;
    public int B = -2988288;
    public int C = -1;
    public int D = -1;
    public int E = -939524096;
    public int F = -1043;
    public int G = -17041;
    public int H = -1280767;
    public int I = 40;
    public float J = 3.0f;
    public float K = 1.5f;
    public float L = 1.8f;
    public int M = -1;
    public int N = -7640251;
    public int O = -12898009;
    public int P = 40;
    public float Q = 3.0f;
    public float R = 1.5f;
    public float S = 1.8f;

    private static a a(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (i == 0) {
            i = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new a(str, str2, i, str3);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f5583a;

        public a(String str, String str2, int i, String str3) {
            c cVar = new c();
            this.f5583a = cVar;
            cVar.f5581a = str;
            this.f5583a.b = str2;
            this.f5583a.c = i;
            this.f5583a.g = str3;
            Context g = t.b().g();
            this.f5583a.h = g.getString(k.a(g, "anythink_default_question_title_text", "string"));
            this.f5583a.i = g.getString(k.a(g, "anythink_question_tip_text", "string"));
            this.f5583a.j = g.getString(k.a(g, "anythink_success_title_text", "string"));
            this.f5583a.k = g.getString(k.a(g, "anythink_success_tip_text", "string"));
            this.f5583a.l = g.getString(k.a(g, "anythink_fail_title_text", "string"));
            this.f5583a.m = g.getString(k.a(g, "anythink_fail_tip_text", "string"));
            this.f5583a.n = g.getString(k.a(g, "anythink_slide_title_text", "string"));
            this.f5583a.o = g.getString(k.a(g, "anythink_slide_tip_text", "string"));
            this.f5583a.p = g.getString(k.a(g, "anythink_slide_success_text", "string"));
            String[] stringArray = g.getResources().getStringArray(k.a(g, "anythink_random_answers", "array"));
            this.f5583a.r = Arrays.asList(stringArray);
        }

        private void b() {
            Context g = t.b().g();
            this.f5583a.h = g.getString(k.a(g, "anythink_default_question_title_text", "string"));
            this.f5583a.i = g.getString(k.a(g, "anythink_question_tip_text", "string"));
            this.f5583a.j = g.getString(k.a(g, "anythink_success_title_text", "string"));
            this.f5583a.k = g.getString(k.a(g, "anythink_success_tip_text", "string"));
            this.f5583a.l = g.getString(k.a(g, "anythink_fail_title_text", "string"));
            this.f5583a.m = g.getString(k.a(g, "anythink_fail_tip_text", "string"));
            this.f5583a.n = g.getString(k.a(g, "anythink_slide_title_text", "string"));
            this.f5583a.o = g.getString(k.a(g, "anythink_slide_tip_text", "string"));
            this.f5583a.p = g.getString(k.a(g, "anythink_slide_success_text", "string"));
            String[] stringArray = g.getResources().getStringArray(k.a(g, "anythink_random_answers", "array"));
            this.f5583a.r = Arrays.asList(stringArray);
        }

        public final a a(int i) {
            this.f5583a.d = i;
            return this;
        }

        public final a b(int i) {
            this.f5583a.e = i;
            return this;
        }

        private a a(boolean z) {
            this.f5583a.f = z;
            return this;
        }

        private a a(String str) {
            this.f5583a.h = str;
            return this;
        }

        private a b(String str) {
            this.f5583a.i = str;
            return this;
        }

        private a c(String str) {
            this.f5583a.j = str;
            return this;
        }

        private a d(String str) {
            this.f5583a.k = str;
            return this;
        }

        private a e(String str) {
            this.f5583a.l = str;
            return this;
        }

        private a f(String str) {
            this.f5583a.m = str;
            return this;
        }

        private a g(String str) {
            this.f5583a.n = str;
            return this;
        }

        private a h(String str) {
            this.f5583a.o = str;
            return this;
        }

        private a i(String str) {
            this.f5583a.p = str;
            return this;
        }

        public final a a(ArrayList<String> arrayList) {
            this.f5583a.f5582q = arrayList;
            return this;
        }

        private a b(ArrayList<String> arrayList) {
            this.f5583a.r = arrayList;
            return this;
        }

        private a c(int i) {
            this.f5583a.s = i;
            return this;
        }

        private a d(int i) {
            this.f5583a.t = i;
            return this;
        }

        private a e(int i) {
            this.f5583a.u = i;
            return this;
        }

        private a f(int i) {
            this.f5583a.v = i;
            return this;
        }

        private a g(int i) {
            this.f5583a.w = i;
            return this;
        }

        private a h(int i) {
            this.f5583a.x = i;
            return this;
        }

        private a i(int i) {
            this.f5583a.y = i;
            return this;
        }

        private a j(int i) {
            this.f5583a.z = i;
            return this;
        }

        private a k(int i) {
            this.f5583a.A = i;
            return this;
        }

        private a l(int i) {
            this.f5583a.B = i;
            return this;
        }

        private a m(int i) {
            this.f5583a.C = i;
            return this;
        }

        private a n(int i) {
            this.f5583a.D = i;
            return this;
        }

        private a o(int i) {
            this.f5583a.E = i;
            return this;
        }

        private a p(int i) {
            this.f5583a.F = i;
            return this;
        }

        private a q(int i) {
            this.f5583a.G = i;
            return this;
        }

        private a r(int i) {
            this.f5583a.H = i;
            return this;
        }

        private a s(int i) {
            this.f5583a.I = i;
            return this;
        }

        private a a(float f) {
            this.f5583a.J = f;
            return this;
        }

        private a b(float f) {
            this.f5583a.K = f;
            return this;
        }

        private a c(float f) {
            this.f5583a.L = f;
            return this;
        }

        private a t(int i) {
            this.f5583a.M = i;
            return this;
        }

        private a u(int i) {
            this.f5583a.N = i;
            return this;
        }

        private a v(int i) {
            this.f5583a.O = i;
            return this;
        }

        private a w(int i) {
            this.f5583a.P = i;
            return this;
        }

        private a d(float f) {
            this.f5583a.Q = f;
            return this;
        }

        private a e(float f) {
            this.f5583a.R = f;
            return this;
        }

        private a f(float f) {
            this.f5583a.S = f;
            return this;
        }

        public final a a(com.anythink.expressad.widget.rewardpopview.a aVar) {
            this.f5583a.T = aVar;
            return this;
        }

        public final c a() {
            return this.f5583a;
        }
    }
}
