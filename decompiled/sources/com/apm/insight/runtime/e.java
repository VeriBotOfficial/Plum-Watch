package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* compiled from: ConfigPropGetter.java */
/* loaded from: classes12.dex */
public class e {
    private static final e b = new e() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a, reason: collision with root package name */
        private Header f6107a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f6107a == null) {
                this.f6107a = Header.b(com.apm.insight.e.g());
            }
            return this.f6107a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f6106a;

    e() {
        this(b);
    }

    private e(e eVar) {
        this.f6106a = eVar;
    }

    public Object b(String str) {
        e eVar = this.f6106a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    public Object a(String str) {
        e eVar = this.f6106a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }
}
