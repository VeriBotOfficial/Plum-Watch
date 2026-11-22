package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class d extends e<JSONObject> {
    private static final String c = "d";

    public d(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONObject> eVar) {
        super(i, str, str2, eVar);
    }

    private d(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONObject> eVar, boolean z) {
        super(i, str, str2, eVar, z);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    protected final l<JSONObject> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            String str = new String(cVar.b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.d));
            if (cVar.f4878a == 204) {
                return l.a(new JSONObject(), cVar);
            }
            return l.a(new JSONObject(str), cVar);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e2) {
            e2.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
