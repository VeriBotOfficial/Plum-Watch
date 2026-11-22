package com.baidu.ar;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public class e5 implements z4 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6905a;
    public TreeMap<String, String> b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // com.baidu.ar.z4
    public void a(String str, String str2) {
        this.b.put(str, str2);
    }

    @Override // com.baidu.ar.d5
    public boolean a(String str) {
        return this.b.containsKey(str);
    }

    @Override // com.baidu.ar.d5
    public Iterator<String> b() {
        return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override // com.baidu.ar.d5
    public String c(String str) {
        String str2 = this.b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // com.baidu.ar.d5
    public byte[] getContent() {
        return this.f6905a;
    }
}
