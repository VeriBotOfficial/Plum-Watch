package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes12.dex */
public class c extends e<JSONArray> {
    private static final String c = "c";

    public c(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONArray> eVar) {
        super(i, str, str2, eVar);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    protected final l<JSONArray> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new JSONArray(new String(cVar.b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.d))), cVar);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e2) {
            e2.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
