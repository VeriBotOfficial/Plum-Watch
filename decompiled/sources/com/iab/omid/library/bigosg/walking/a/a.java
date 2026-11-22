package com.iab.omid.library.bigosg.walking.a;

import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f10921a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0621b interfaceC0621b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0621b);
        this.f10921a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
