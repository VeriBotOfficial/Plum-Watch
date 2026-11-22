package com.baidu.ar;

import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class na implements w6 {
    public static final Pattern b = Pattern.compile(" ");
    public static final Pattern c = Pattern.compile(",");

    /* renamed from: a, reason: collision with root package name */
    public final String f7096a;

    public na(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f7096a = str;
    }

    @Override // com.baidu.ar.w6
    public w6 a() {
        return new na(b());
    }

    @Override // com.baidu.ar.w6
    public boolean a(String str) {
        for (String str2 : c.split(b.matcher(str).replaceAll(""))) {
            if (this.f7096a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.ar.w6
    public String b() {
        return this.f7096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || na.class != obj.getClass()) {
            return false;
        }
        return this.f7096a.equals(((na) obj).f7096a);
    }

    public int hashCode() {
        return this.f7096a.hashCode();
    }

    @Override // com.baidu.ar.w6
    public String toString() {
        return b();
    }
}
