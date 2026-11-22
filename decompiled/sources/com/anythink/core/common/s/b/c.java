package com.anythink.core.common.s.b;

import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.a.g;
import com.anythink.core.common.s.a.j;
import java.util.Map;

/* loaded from: classes12.dex */
public class c implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4331a = "c";
    private final String b;
    private boolean c;
    private final com.anythink.core.common.s.a.a d;
    private final int e;

    public c(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        j b = aVar.b();
        this.d = b;
        this.e = cVar.d();
        String b2 = cVar.b();
        this.b = b2;
        if (b2.endsWith(u.f3738a)) {
            this.c = true;
        } else {
            this.c = b.getBoolean(u.a.f3739a, false);
        }
    }

    private static com.anythink.core.common.s.a.a a(com.anythink.core.common.s.c cVar) {
        j.a aVar = new j.a(cVar.a(), cVar.b());
        aVar.a();
        return aVar.b();
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v) {
        a(str, v, this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v, int i) {
        if (TextUtils.isEmpty(str) || v == 0 || this.d == null) {
            return;
        }
        try {
            String obj = v.toString();
            if (v instanceof String) {
                this.d.putString(str, (String) v);
            } else if (v instanceof Integer) {
                this.d.putInt(str, Integer.parseInt(obj));
            } else if (v instanceof Long) {
                this.d.putLong(str, Long.parseLong(obj));
            } else if (v instanceof Double) {
                this.d.b(str, Double.parseDouble(obj));
            } else if (v instanceof Float) {
                this.d.putFloat(str, Float.parseFloat(obj));
            } else if (v instanceof Boolean) {
                this.d.putBoolean(str, Boolean.parseBoolean(obj));
            } else {
                new Object[]{str, v};
            }
            a(i);
            new Object[]{str, v};
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
        v3 = v;
        if (!TextUtils.isEmpty(str) && v != 0) {
            com.anythink.core.common.s.a.a aVar = this.d;
            v3 = v;
            if (aVar != null) {
                try {
                    if (v instanceof String) {
                        v2 = (V) aVar.getString(str, (String) v);
                    } else if (v instanceof Integer) {
                        v2 = (V) Integer.valueOf(aVar.getInt(str, ((Integer) v).intValue()));
                    } else if (v instanceof Long) {
                        v2 = (V) Long.valueOf(aVar.getLong(str, ((Long) v).longValue()));
                    } else if (v instanceof Double) {
                        v2 = (V) Double.valueOf(aVar.a(str, ((Double) v).doubleValue()));
                    } else if (v instanceof Float) {
                        v2 = (V) Float.valueOf(aVar.getFloat(str, ((Float) v).floatValue()));
                    } else if (v instanceof Boolean) {
                        v2 = (V) Boolean.valueOf(aVar.getBoolean(str, ((Boolean) v).booleanValue()));
                    } else if (v instanceof Object) {
                        new Object[]{str, v};
                        v2 = (V) aVar.d(str);
                    } else {
                        v2 = v;
                    }
                    try {
                        new Object[]{str, v2, v};
                        return v2;
                    } catch (Throwable th) {
                        th = th;
                        v = v2;
                        new Object[]{th.getMessage()};
                        v3 = v;
                        return v3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return v3;
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        com.anythink.core.common.s.a.a aVar = this.d;
        if (aVar != null) {
            aVar.remove(str);
            a(this.e);
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        com.anythink.core.common.s.a.a aVar = this.d;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        com.anythink.core.common.s.a.a aVar = this.d;
        if (aVar != null) {
            return aVar.getAll();
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        com.anythink.core.common.s.a.a aVar = this.d;
        return aVar != null && aVar.contains(str);
    }

    public final boolean c() {
        new Object[]{this.b, Boolean.valueOf(this.c)};
        return this.c;
    }

    public final void d() {
        this.c = true;
        a(u.a.f3739a, Boolean.TRUE);
        new Object[]{Boolean.TRUE};
    }

    private void a(int i) {
        com.anythink.core.common.s.a.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof g) {
            i = ((g) aVar).j();
        } else if ((aVar instanceof j) && i == 0) {
            i = 1;
        }
        new Object[]{Integer.valueOf(i), this.d.getClass().getSimpleName()};
        if (i == 1) {
            this.d.apply();
        } else if (i == 2) {
            this.d.commit();
        }
    }
}
