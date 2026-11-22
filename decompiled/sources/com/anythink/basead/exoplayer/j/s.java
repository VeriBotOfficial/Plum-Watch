package com.anythink.basead.exoplayer.j;

import android.text.TextUtils;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmind.core.INotes;

/* loaded from: classes11.dex */
public interface s extends h {
    public static final com.anythink.basead.exoplayer.k.u<String> c = new com.anythink.basead.exoplayer.k.u<String>() { // from class: com.anythink.basead.exoplayer.j.s.1
        @Override // com.anythink.basead.exoplayer.k.u
        public final /* synthetic */ boolean a(String str) {
            String d2 = af.d(str);
            if (TextUtils.isEmpty(d2)) {
                return false;
            }
            return ((d2.contains("text") && !d2.contains("text/vtt")) || d2.contains(INotes.HTML) || d2.contains("xml")) ? false : true;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(String str) {
            String d2 = af.d(str);
            if (TextUtils.isEmpty(d2)) {
                return false;
            }
            return ((d2.contains("text") && !d2.contains("text/vtt")) || d2.contains(INotes.HTML) || d2.contains("xml")) ? false : true;
        }
    };

    public interface b extends h.a {
        @Deprecated
        void a(String str);

        @Deprecated
        void a(String str, String str2);

        @Override // com.anythink.basead.exoplayer.j.h.a
        /* renamed from: b */
        s a();

        f c();

        @Deprecated
        void d();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    int a(byte[] bArr, int i, int i2);

    @Override // com.anythink.basead.exoplayer.j.h
    long a(k kVar);

    void a(String str);

    void a(String str, String str2);

    @Override // com.anythink.basead.exoplayer.j.h
    void b();

    Map<String, List<String>> c();

    void d();

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f2652a = new HashMap();
        private Map<String, String> b;

        public final synchronized void a(String str, String str2) {
            this.b = null;
            this.f2652a.put(str, str2);
        }

        private synchronized void a(Map<String, String> map) {
            this.b = null;
            this.f2652a.putAll(map);
        }

        private synchronized void b(Map<String, String> map) {
            this.b = null;
            this.f2652a.clear();
            this.f2652a.putAll(map);
        }

        public final synchronized void a(String str) {
            this.b = null;
            this.f2652a.remove(str);
        }

        public final synchronized void a() {
            this.b = null;
            this.f2652a.clear();
        }

        public final synchronized Map<String, String> b() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.f2652a));
            }
            return this.b;
        }
    }

    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final f f2650a = new f();

        protected abstract s a(f fVar);

        @Override // com.anythink.basead.exoplayer.j.s.b, com.anythink.basead.exoplayer.j.h.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            return a(this.f2650a);
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        public final f c() {
            return this.f2650a;
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void a(String str, String str2) {
            this.f2650a.a(str, str2);
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void a(String str) {
            this.f2650a.a(str);
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void d() {
            this.f2650a.a();
        }
    }

    public static class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f2651a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public final int d;
        public final k e;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private c(k kVar, int i) {
            this.e = kVar;
            this.d = i;
        }

        public c(String str, k kVar) {
            super(str);
            this.e = kVar;
            this.d = 1;
        }

        public c(IOException iOException, k kVar, int i) {
            super(iOException);
            this.e = kVar;
            this.d = i;
        }

        public c(String str, IOException iOException, k kVar) {
            super(str, iOException);
            this.e = kVar;
            this.d = 1;
        }
    }

    public static final class d extends c {
        public final String f;

        public d(String str, k kVar) {
            super("Invalid content type: ".concat(String.valueOf(str)), kVar);
            this.f = str;
        }
    }

    public static final class e extends c {
        public final int f;
        public final Map<String, List<String>> g;

        public e(int i, Map<String, List<String>> map, k kVar) {
            super("Response code: ".concat(String.valueOf(i)), kVar);
            this.f = i;
            this.g = map;
        }
    }
}
