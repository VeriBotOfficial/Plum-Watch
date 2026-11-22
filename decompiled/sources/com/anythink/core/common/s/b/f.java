package com.anythink.core.common.s.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes12.dex */
public class f implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4334a = "f";
    private final Context b;
    private final String c;
    private final int d;

    private static boolean a(int i) {
        return i != 2;
    }

    public f(com.anythink.core.common.s.c cVar) {
        this.b = cVar.a();
        this.c = cVar.b();
        this.d = cVar.d();
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v) {
        a(str, v, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v, int i) {
        if (this.b == null || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(str) || v == 0) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.b.getSharedPreferences(this.c, 0).edit();
            String obj = v.toString();
            if (v instanceof String) {
                edit.putString(str, (String) v);
            } else if (v instanceof Integer) {
                edit.putInt(str, Integer.parseInt(obj));
            } else if (v instanceof Long) {
                edit.putLong(str, Long.parseLong(obj));
            } else if (v instanceof Double) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v instanceof Float) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v instanceof Boolean) {
                edit.putBoolean(str, Boolean.parseBoolean(obj));
            } else {
                new Object[]{str, v};
            }
            if (a(i)) {
                edit.apply();
            } else {
                edit.commit();
            }
            new Object[]{str, v, Integer.valueOf(i)};
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v) {
        V v2;
        V v3 = v;
        if (this.b != null) {
            v3 = v;
            if (!TextUtils.isEmpty(this.c)) {
                v3 = v;
                v3 = v;
                if (!TextUtils.isEmpty(str) && v != 0) {
                    try {
                        SharedPreferences sharedPreferences = this.b.getSharedPreferences(this.c, 0);
                        if (v instanceof String) {
                            v2 = (V) sharedPreferences.getString(str, (String) v);
                        } else if (v instanceof Integer) {
                            v2 = (V) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) v).intValue()));
                        } else if (v instanceof Long) {
                            v2 = (V) Long.valueOf(sharedPreferences.getLong(str, ((Long) v).longValue()));
                        } else if (v instanceof Double) {
                            v2 = (V) Double.valueOf(sharedPreferences.getFloat(str, Float.parseFloat(v.toString())));
                        } else if (v instanceof Float) {
                            v2 = (V) Float.valueOf(sharedPreferences.getFloat(str, ((Float) v).floatValue()));
                        } else if (v instanceof Boolean) {
                            v2 = (V) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) v).booleanValue()));
                        } else {
                            if (v instanceof Object) {
                                new Object[]{str, v};
                            }
                            v2 = v;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        new Object[]{str, v2, v};
                        return v2;
                    } catch (Throwable th2) {
                        th = th2;
                        v = v2;
                        new Object[]{th.getMessage()};
                        v3 = v;
                        return v3;
                    }
                }
            }
        }
        return v3;
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        if (this.b == null || TextUtils.isEmpty(this.c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.b.getSharedPreferences(this.c, 0).edit();
            edit.remove(str);
            edit.apply();
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        if (this.b == null || TextUtils.isEmpty(this.c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.b.getSharedPreferences(this.c, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        if (this.b != null && !TextUtils.isEmpty(this.c)) {
            try {
                return this.b.getSharedPreferences(this.c, 0).getAll();
            } catch (Throwable th) {
                new Object[]{th.getMessage()};
            }
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        if (this.b != null && !TextUtils.isEmpty(this.c)) {
            try {
                return this.b.getSharedPreferences(this.c, 0).contains(str);
            } catch (Throwable th) {
                new Object[]{th.getMessage()};
            }
        }
        return false;
    }

    public final String c() {
        return this.c;
    }
}
