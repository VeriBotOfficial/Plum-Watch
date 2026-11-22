package com.qumeng.overseas.advlib.__remote__.ui.elements.twist;

import android.text.TextUtils;
import android.util.Pair;
import com.qumeng.overseas.advlib.trdparty.unionset.network.TwistEntity;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private double f13140a;
    private double b;
    private double c;
    private int d;
    private double e;
    private int f;
    private double g;
    private double h;
    private double i;
    private int j;
    private int k;
    private double l;
    private double m;
    private double n;
    private double o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f13141q;
    private double r;
    private double s;
    private double t;
    private double u;
    private int v;
    private int w;
    private Map<String, TwistEntity.SlotIdSaveConfig> x;

    public k() {
        this.f13140a = 1.0d;
        this.b = 1.0d;
        this.c = 1.0d;
        this.d = 500;
        this.e = 5.0d;
        this.f = 3000;
        this.g = 5.0d;
        this.h = 5.0d;
        this.i = 5.0d;
        this.j = 500;
        this.k = 3000;
        this.l = 30.0d;
        this.m = 10.0d;
        this.n = 10.0d;
        this.o = 10.0d;
        this.p = 500;
        this.f13141q = 3000;
        this.r = 45.0d;
        this.s = 15.0d;
        this.t = 15.0d;
        this.u = 15.0d;
        this.v = 500;
        this.w = 3000;
    }

    public int a(Set<Integer> set) {
        if (set.contains(3)) {
            return this.d;
        }
        if (set.contains(2)) {
            return this.j;
        }
        if (set.contains(1)) {
            return this.p;
        }
        return 500;
    }

    public void b(float f) {
        this.b = f;
    }

    public void c(float f) {
        this.c = f;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(float f) {
        this.n = f;
    }

    public void f(float f) {
        this.o = f;
    }

    public double g() {
        return this.f13140a;
    }

    public double h() {
        return this.b;
    }

    public double i() {
        return this.c;
    }

    public int j() {
        return this.d;
    }

    public double k() {
        return this.e;
    }

    public int l() {
        return this.f13141q;
    }

    public double m() {
        return this.m;
    }

    public double n() {
        return this.n;
    }

    public double o() {
        return this.o;
    }

    public int p() {
        return this.p;
    }

    public double q() {
        return this.r;
    }

    public int r() {
        return this.k;
    }

    public double s() {
        return this.g;
    }

    public double t() {
        return this.h;
    }

    public String toString() {
        return "TwistModel{highOffsetX=" + this.f13140a + ", highOffsetY=" + this.b + ", highOffsetZ=" + this.c + ", highTime=" + this.d + ", highTriggerAngle=" + this.e + ", highDuration=" + this.f + ", middleOffsetX=" + this.g + ", middleOffsetY=" + this.h + ", middleOffsetZ=" + this.i + ", middleTime=" + this.j + ", middleDuration=" + this.k + ", middleTriggerAngle=" + this.l + ", lowOffsetX=" + this.m + ", lowOffsetY=" + this.n + ", lowOffsetZ=" + this.o + ", lowTime=" + this.p + ", heGuiOffsetX=" + this.s + ", heGuiOffsetY=" + this.t + ", heGuiOffsetZ=" + this.u + ", heGuiTime=" + this.v + ", lowDuration=" + this.f13141q + ", lowTriggerAngle=" + this.r + ", freqGroup=" + this.x + AbstractJsonLexerKt.END_OBJ;
    }

    public double u() {
        return this.i;
    }

    public int v() {
        return this.j;
    }

    public double w() {
        return this.l;
    }

    public double b() {
        return this.s;
    }

    public void c(int i) {
        this.f = i;
    }

    public void d(float f) {
        this.m = f;
    }

    public void e(int i) {
        this.f13141q = i;
    }

    public void f(int i) {
        this.p = i;
    }

    public void g(int i) {
        this.k = i;
    }

    public void h(float f) {
        this.g = f;
    }

    public void i(float f) {
        this.h = f;
    }

    public void j(float f) {
        this.i = f;
    }

    public void k(float f) {
        this.l = f;
    }

    public void b(double d) {
        this.t = d;
    }

    public double c() {
        return this.t;
    }

    public void d(double d) {
        this.e = d;
    }

    public int e() {
        return this.v;
    }

    public int f() {
        return this.f;
    }

    public void g(float f) {
        this.r = f;
    }

    public void h(int i) {
        this.j = i;
    }

    public void b(int i) {
        this.v = i;
    }

    public void c(double d) {
        this.u = d;
    }

    public double d() {
        return this.u;
    }

    public Pair<String, Integer> a(String str) {
        Map<String, TwistEntity.SlotIdSaveConfig> map;
        if (TextUtils.isEmpty(str) || (map = this.x) == null || map.size() == 0) {
            return null;
        }
        for (Map.Entry<String, TwistEntity.SlotIdSaveConfig> entry : this.x.entrySet()) {
            TwistEntity.SlotIdSaveConfig value = entry.getValue();
            List<String> list = value.slotIds;
            if (list != null && list.size() > 0 && list.contains(str)) {
                return new Pair<>(entry.getKey(), Integer.valueOf(value.num));
            }
        }
        return null;
    }

    public void a(float f) {
        this.f13140a = f;
    }

    public void a(double d) {
        this.s = d;
    }

    public int a() {
        return this.w;
    }

    public void a(int i) {
        this.w = i;
    }

    public k(TwistEntity twistEntity) {
        this.f13140a = 1.0d;
        this.b = 1.0d;
        this.c = 1.0d;
        this.d = 500;
        this.e = 5.0d;
        this.f = 3000;
        this.g = 5.0d;
        this.h = 5.0d;
        this.i = 5.0d;
        this.j = 500;
        this.k = 3000;
        this.l = 30.0d;
        this.m = 10.0d;
        this.n = 10.0d;
        this.o = 10.0d;
        this.p = 500;
        this.f13141q = 3000;
        this.r = 45.0d;
        this.s = 15.0d;
        this.t = 15.0d;
        this.u = 15.0d;
        this.v = 500;
        this.w = 3000;
        if (twistEntity == null || twistEntity.enable != 1) {
            return;
        }
        TwistEntity.OffsetPos offsetPos = twistEntity.high;
        if (offsetPos != null) {
            this.f13140a = offsetPos.offsetX;
            this.b = offsetPos.offsetY;
            this.c = offsetPos.offsetZ;
            this.d = offsetPos.time;
            this.e = offsetPos.triggerAngle;
            this.f = offsetPos.duration;
        }
        TwistEntity.OffsetPos offsetPos2 = twistEntity.middle;
        if (offsetPos2 != null) {
            this.g = offsetPos2.offsetX;
            this.h = offsetPos2.offsetY;
            this.i = offsetPos2.offsetZ;
            this.j = offsetPos2.time;
            this.l = offsetPos2.triggerAngle;
            this.k = offsetPos2.duration;
        }
        TwistEntity.OffsetPos offsetPos3 = twistEntity.low;
        if (offsetPos3 != null) {
            this.m = offsetPos3.offsetX;
            this.n = offsetPos3.offsetY;
            this.o = offsetPos3.offsetZ;
            this.p = offsetPos3.time;
            this.r = offsetPos3.triggerAngle;
            this.f13141q = offsetPos3.duration;
        }
        this.x = twistEntity.freqGroup;
    }
}
