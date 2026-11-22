package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f6633a;
    private final List b;

    public MaxSegment(int i, List<Integer> list) {
        this.f6633a = i;
        this.b = list;
        a(i);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f6633a;
    }

    public List<Integer> getValues() {
        return this.b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f6633a + ", values=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
