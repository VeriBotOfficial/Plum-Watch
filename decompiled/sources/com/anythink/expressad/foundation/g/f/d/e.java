package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
public abstract class e<T> extends j<T> {
    private static final String c = "e";
    private final String d;

    public e(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<T> eVar) {
        super(i, str, eVar);
        this.d = str2;
    }

    public e(int i, String str, String str2, com.anythink.expressad.foundation.g.f.e<T> eVar, boolean z) {
        super(i, str, eVar, z);
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
}
