package com.baidu.ar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class w1 implements j6, s3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7299a = false;

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        return Arrays.asList(103, 104);
    }

    @Override // com.baidu.ar.s3
    public void a(int i, int i2, HashMap<String, Object> hashMap) {
        if (i != 104) {
            return;
        }
        this.f7299a = true;
    }

    public void a(r3 r3Var) {
        r3Var.a(this);
    }

    @Override // com.baidu.ar.j6
    public boolean b() {
        return this.f7299a;
    }

    public void c() {
        d();
    }

    public void d() {
        this.f7299a = false;
    }
}
