package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
public class g extends j<String> {
    private static final String c = "g";
    private String d;

    public g(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i, str, eVar);
        this.d = str2;
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final byte[] h() {
        try {
            String str = this.d;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    protected final l<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new String(cVar.b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.d)), cVar);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
