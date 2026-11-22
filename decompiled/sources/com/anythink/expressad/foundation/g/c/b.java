package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4838a = "anythink_template/other";
    private static final String c = "anythink_template/";
    private static final String d = "anythink_template/res/Movies";
    private static final String e = "anythink_template/res";
    private static final String f = "anythink_template/res/.Anythink_VC";
    private static final String g = "anythink_template/res/.anythink700";
    private static final String h = "anythink_template/res/img";
    private static final String i = "anythink_template/crashinfo";
    private static final String j = "anythink_template/res/xml";
    private static final String k = "anythink_template/anythink/config";
    private static final String l = "anythink_template/res/res";
    private static final String m = "anythink_template/res/html";

    public b(String str) {
        super(str);
    }

    @Override // com.anythink.expressad.foundation.g.c.f
    protected final List<e> a() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, a.ANYTHINK_RES_MANAGER_DIR, e);
        a(arrayList, a.AD_MOVIES, d).a(a.ANYTHINK_VC, f);
        e a2 = a(arrayList, a.AD_ANYTHINK_700, g);
        a2.a(a.ANYTHINK_700_IMG, h);
        a2.a(a.ANYTHINK_700_XML, j);
        a2.a(a.ANYTHINK_700_CONFIG, k);
        a2.a(a.ANYTHINK_700_RES, l);
        a2.a(a.ANYTHINK_700_HTML, m);
        a(arrayList, a.ANYTHINK_OTHER, f4838a);
        a(arrayList, a.ANYTHINK_CRASH_INFO, i);
        a(arrayList, a.ANYTHINK_OTHER, f4838a);
        return arrayList;
    }
}
