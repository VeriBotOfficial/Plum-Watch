package org.json.alipay;

import android.gov.nist.core.Separators;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f18836a;

    public a() {
        this.f18836a = new ArrayList();
    }

    public a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            a(Array.get(obj, i));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f18836a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) {
        this();
        char c;
        ArrayList arrayList;
        Object d;
        char c2 = cVar.c();
        if (c2 == '[') {
            c = ']';
        } else {
            if (c2 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c3 = cVar.c();
            cVar.a();
            if (c3 == ',') {
                arrayList = this.f18836a;
                d = null;
            } else {
                arrayList = this.f18836a;
                d = cVar.d();
            }
            arrayList.add(d);
            char c4 = cVar.c();
            if (c4 != ')') {
                if (c4 != ',' && c4 != ';') {
                    if (c4 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c != c4) {
                throw cVar.a("Expected a '" + new Character(c) + Separators.QUOTE);
            }
            return;
        } while (cVar.c() != ']');
    }

    public int a() {
        return this.f18836a.size();
    }

    public Object a(int i) {
        Object b = b(i);
        if (b != null) {
            return b;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public String a(String str) {
        int a2 = a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < a2; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.b(this.f18836a.get(i)));
        }
        return stringBuffer.toString();
    }

    public a a(Object obj) {
        this.f18836a.add(obj);
        return this;
    }

    public Object b(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.f18836a.get(i);
    }

    public String toString() {
        try {
            return "[" + a(",") + AbstractJsonLexerKt.END_LIST;
        } catch (Exception unused) {
            return null;
        }
    }
}
