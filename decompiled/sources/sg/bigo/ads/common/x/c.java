package sg.bigo.ads.common.x;

import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public final class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static a f19796a;
        private final C1092a b = new C1092a();

        /* renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        static class C1092a {
            C1092a() {
            }

            public static void a(SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f19796a == null) {
                f19796a = new a();
            }
            return f19796a;
        }
    }
}
