package sg.bigo.ads.common.h.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
final class f {
    private static f b = new f();

    /* renamed from: a, reason: collision with root package name */
    HashMap<String, CopyOnWriteArrayList<e>> f19632a = new HashMap<>();

    /* renamed from: sg.bigo.ads.common.h.b.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19633a;

        static {
            int[] iArr = new int[h.a().length];
            f19633a = iArr;
            try {
                iArr[h.f19635a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19633a[h.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19633a[h.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19633a[h.d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19633a[h.e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19633a[h.f - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19633a[h.g - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    f() {
    }

    protected static f a() {
        return b;
    }

    private void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (this.f19632a.containsKey(str) && (copyOnWriteArrayList = this.f19632a.get(str)) != null && copyOnWriteArrayList.contains(eVar)) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    private void a(a aVar, CopyOnWriteArrayList<e> copyOnWriteArrayList) {
        switch (AnonymousClass1.f19633a[aVar.e - 1]) {
            case 1:
                Iterator<e> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                Iterator<e> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                break;
            case 3:
                Iterator<e> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().a(aVar.f19629a);
                }
                break;
            case 4:
                Iterator<e> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    e next = it4.next();
                    String str = aVar.f19629a;
                    j.a(aVar.d);
                    next.b(str);
                }
                break;
            case 5:
                Iterator<e> it5 = copyOnWriteArrayList.iterator();
                while (it5.hasNext()) {
                    it5.next().c(aVar.f19629a);
                }
                break;
            case 6:
                Iterator<e> it6 = copyOnWriteArrayList.iterator();
                while (it6.hasNext()) {
                    e next2 = it6.next();
                    next2.d(aVar.f19629a);
                    a(aVar.f19629a, next2);
                }
                break;
            case 7:
                Iterator<e> it7 = copyOnWriteArrayList.iterator();
                while (it7.hasNext()) {
                    e next3 = it7.next();
                    next3.a(aVar.f19629a, aVar.f, aVar.b.g);
                    a(aVar.f19629a, next3);
                }
                break;
        }
    }

    public final void a(String str) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        a c;
        if (!this.f19632a.containsKey(str) || (copyOnWriteArrayList = this.f19632a.get(str)) == null || (c = i.c(str)) == null) {
            return;
        }
        a(c, copyOnWriteArrayList);
    }

    protected final void b(String str) {
        if (!this.f19632a.containsKey(str) || this.f19632a.get(str) == null) {
            return;
        }
        this.f19632a.get(str).clear();
    }
}
