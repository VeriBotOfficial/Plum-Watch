package com.baidu.bbalbscesium.j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.content.UriPermission;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.i.i;
import com.baidu.bbalbscesium.j.a;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class d extends com.baidu.bbalbscesium.j.a {
    private static final boolean i = false;
    private static final String j = "Cesium";
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 2;
    private static final long n = 5;
    private static final int o = 6;
    private static final int p = 16;
    private Context g;
    private g h;

    static final class a implements Comparable {
        private static final String[] b = {"read0", "read1", "read2", "read3", "access0", "access1", "access2", "access3", "sync0", "sync1", "sync2", "sync3", "open0", "open1", "open2", "open3"};

        /* renamed from: a, reason: collision with root package name */
        private final int f7407a;

        private a(int i) {
            this.f7407a = i;
        }

        public static a a(byte b2, boolean z) {
            return a(z ? (b2 & 255) >> 4 : b2 & 15);
        }

        public static a a(int i) {
            if (i < 0 || i >= 16) {
                throw new IllegalArgumentException("invalid idx " + i);
            }
            return new a(i);
        }

        public byte a() {
            return (byte) this.f7407a;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f7407a - aVar.f7407a;
        }

        public String b() {
            return b[this.f7407a];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.f7407a == ((a) obj).f7407a;
        }

        public int hashCode() {
            return this.f7407a;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private Map f7408a = new HashMap();

        class a implements Comparator {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry entry, Map.Entry entry2) {
                int intValue = ((Integer) entry2.getValue()).intValue() - ((Integer) entry.getValue()).intValue();
                return intValue != 0 ? intValue : ((a) entry.getKey()).compareTo((a) entry2.getKey());
            }
        }

        b() {
        }

        public List a() {
            ArrayList arrayList = new ArrayList(this.f7408a.entrySet());
            Collections.sort(arrayList, new a());
            ArrayList arrayList2 = new ArrayList(6);
            int min = Math.min(6, arrayList.size());
            for (int i = 0; i < min; i++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i);
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList2.add(entry.getKey());
                }
            }
            return arrayList2;
        }

        public void a(a aVar) {
            Integer num = (Integer) this.f7408a.get(aVar);
            this.f7408a.put(aVar, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
        }
    }

    class c {

        /* renamed from: a, reason: collision with root package name */
        private int f7410a;
        private a[] b;
        private int c;

        public c() {
            this.f7410a = 33;
            this.b = new a[33];
        }

        public c(byte[] bArr) {
            this.f7410a = 33;
            this.b = new a[33];
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            for (int i = 0; i < bArr.length; i++) {
                a a2 = a.a(bArr[i], false);
                a a3 = a.a(bArr[i], true);
                a(a2);
                a(a3);
            }
        }

        private void a(int i) {
            a[] aVarArr = this.b;
            if (i - aVarArr.length > 0) {
                int length = aVarArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i >= 0) {
                    i = i2;
                }
                this.b = (a[]) Arrays.copyOf(aVarArr, i);
            }
        }

        public int a() {
            return this.c;
        }

        public void a(a aVar) {
            a(this.c + 1);
            a[] aVarArr = this.b;
            int i = this.c;
            this.c = i + 1;
            aVarArr[i] = aVar;
        }

        public a b(int i) {
            if (i < this.c) {
                return this.b[i];
            }
            throw new IndexOutOfBoundsException("idx " + i + " size " + this.c);
        }

        public byte[] b() {
            int i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            while (true) {
                i = this.c;
                if (i2 >= i / 2) {
                    break;
                }
                int i3 = i2 * 2;
                byteArrayOutputStream.write((byte) (((b(i3 + 1).a() & 255) << 4) | (b(i3).a() & 255)));
                i2++;
            }
            if (i % 2 != 0) {
                byteArrayOutputStream.write((byte) (b(i - 1).a() & 255));
            }
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: com.baidu.bbalbscesium.j.d$d, reason: collision with other inner class name */
    static class C0339d {

        /* renamed from: a, reason: collision with root package name */
        private List f7411a = new ArrayList();

        /* renamed from: com.baidu.bbalbscesium.j.d$d$a */
        class a implements Comparator {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(b bVar, b bVar2) {
                return bVar.f7413a - bVar2.f7413a;
            }
        }

        /* renamed from: com.baidu.bbalbscesium.j.d$d$b */
        static class b {

            /* renamed from: a, reason: collision with root package name */
            private int f7413a;
            private a b;

            public b(a aVar) {
                this.b = aVar;
            }

            public a a() {
                return this.b;
            }

            public void b() {
                this.f7413a++;
            }
        }

        C0339d() {
        }

        public List a() {
            ArrayList arrayList = new ArrayList(this.f7411a);
            Collections.sort(arrayList, new a());
            return arrayList;
        }

        public void a(a aVar) {
            this.f7411a.add(new b(aVar));
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        byte[] f7414a;
        byte b;
        byte[] c;

        public e(byte[] bArr, byte b, byte[] bArr2) {
            this.f7414a = bArr;
            this.b = b;
            this.c = bArr2;
        }

        public static e a(h.a aVar) {
            try {
                byte[] c = d.c(aVar.b());
                if (c.length > 16) {
                    return null;
                }
                return new e(c, aVar.e().getBytes("UTF-8")[0], aVar.c() != null ? aVar.c().getBytes("UTF-8") : null);
            } catch (Exception unused) {
                return null;
            }
        }

        public h.a a() {
            try {
                return h.a(com.baidu.bbalbscesium.m.c.a(this.f7414a, "", true), new String(new byte[]{this.b}, "UTF-8"), this.c != null ? new String(this.c, "UTF-8") : null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f7415a;
        public int b;
        public int c = 16;

        f() {
        }

        public String toString() {
            return "";
        }
    }

    static class g {

        /* renamed from: a, reason: collision with root package name */
        private Method f7416a;
        private Method b;
        private Method c;
        private Method d;
        private Method e;

        g() {
        }

        public int a(Context context, Uri uri, int i, int i2, int i3) throws i.a {
            try {
                return ((Integer) this.f7416a.invoke(context, uri, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
            } catch (Exception e) {
                throw new i.a(e);
            }
        }

        void a() {
            try {
                this.f7416a = i.a(Context.class, i.a(com.baidu.bbalbscesium.i.h.a()), new Class[]{Uri.class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                this.b = i.a(Context.class, i.a(com.baidu.bbalbscesium.i.h.d()), new Class[]{String.class, Uri.class, Integer.TYPE});
                this.c = i.a(ContentResolver.class, i.a(com.baidu.bbalbscesium.i.h.g()), new Class[]{Uri.class, Integer.TYPE});
                this.d = i.a(Context.class, i.a(com.baidu.bbalbscesium.i.h.f()), new Class[]{Uri.class, Integer.TYPE});
                this.e = i.a(ContentResolver.class, i.a(com.baidu.bbalbscesium.i.h.e()), new Class[]{Uri.class, Integer.TYPE});
            } catch (Exception unused) {
            }
        }

        public void a(ContentResolver contentResolver, Uri uri, int i) throws i.a {
            try {
                this.e.invoke(contentResolver, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new i.a(e);
            }
        }

        public void a(Context context, Uri uri, int i) throws i.a {
            try {
                this.d.invoke(context, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new i.a(e);
            }
        }

        public void a(Context context, String str, Uri uri, int i) throws i.a {
            try {
                this.b.invoke(context, str, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new i.a(e);
            }
        }

        public void b(ContentResolver contentResolver, Uri uri, int i) throws i.a {
            try {
                this.c.invoke(contentResolver, uri, Integer.valueOf(i));
            } catch (Exception e) {
                throw new i.a(e);
            }
        }
    }

    public d() {
        super(com.baidu.bbalbscesium.j.b.c, com.baidu.bbalbscesium.j.b.d);
        g gVar = new g();
        this.h = gVar;
        gVar.a();
    }

    private a a(String str, int i2, List list, int i3, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0339d.b bVar = (C0339d.b) it.next();
            String str2 = str;
            int i4 = i2;
            int i5 = i3;
            f fVar2 = fVar;
            if (a(str2, i4, bVar.b, i5, fVar2)) {
                bVar.b();
                return bVar.b;
            }
            str = str2;
            i2 = i4;
            i3 = i5;
            fVar = fVar2;
        }
        return null;
    }

    private String a(String str, int i2, a aVar) {
        return String.format("content://%s/dat/v1/i%d/%s", b(str), Integer.valueOf(i2), aVar.b());
    }

    private String a(String str, a aVar) {
        return String.format("content://%s/dic/v1/%s", b(str), aVar.b());
    }

    private void a(UriMatcher uriMatcher) {
        uriMatcher.addURI(b(this.g.getPackageName()), "dat/v1/*/*", 1);
        uriMatcher.addURI(b(this.g.getPackageName()), "dic/v1/*", 2);
    }

    private boolean a(int i2, a aVar) {
        return a(Uri.parse(a(this.g.getPackageName(), i2, aVar)));
    }

    private boolean a(Uri uri) {
        Context context = this.g;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.h.a(context, context.getPackageName(), uri, 65);
            this.h.b(contentResolver, uri, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(Uri uri, int i2) {
        Context context = this.g;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            this.h.a(context, uri, i2);
            this.h.a(contentResolver, uri, i2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(a aVar) {
        return a(Uri.parse(a(this.g.getPackageName(), aVar)));
    }

    private boolean a(c cVar, List list) {
        int i2;
        ContentResolver contentResolver = this.g.getContentResolver();
        UriMatcher uriMatcher = new UriMatcher(-1);
        a(uriMatcher);
        List<UriPermission> persistedUriPermissions = contentResolver.getPersistedUriPermissions();
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            persistedUriPermissions = contentResolver.getOutgoingPersistedUriPermissions();
        }
        if (persistedUriPermissions == null || persistedUriPermissions.size() == 0) {
            return true;
        }
        for (UriPermission uriPermission : persistedUriPermissions) {
            Uri uri = uriPermission.getUri();
            int match = uriMatcher.match(uri);
            List<String> pathSegments = uri.getPathSegments();
            if ((match == 1 || match == 2) && uriPermission.isWritePermission()) {
                a(uri, uriPermission.isReadPermission() ? 3 : 2);
            } else if (match == 1) {
                try {
                    i2 = Integer.valueOf(pathSegments.get(2).substring(1)).intValue();
                } catch (Exception unused) {
                    i2 = -1;
                }
                if (i2 >= 0 && i2 < cVar.a()) {
                    if (!cVar.b(i2).b().equals(pathSegments.get(3))) {
                    }
                }
                a(uri, 1);
            } else if (match == 2) {
                String str = pathSegments.get(2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).b().equals(str)) {
                        break;
                    }
                }
                a(uri, 1);
            }
        }
        int a2 = cVar.a();
        for (int i3 = 0; i3 < a2; i3++) {
            if (!a(this.g.getPackageName(), i3, cVar.b(i3), Process.myUid(), (f) null)) {
                return true;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!a(this.g.getPackageName(), (a) list.get(i4), Process.myUid())) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i2, a aVar, int i3, f fVar) {
        int i4;
        int i5;
        Uri parse = Uri.parse(a(str, i2, aVar));
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                i4 = -1;
                break;
            }
            if (fVar != null) {
                try {
                    fVar.f7415a++;
                } catch (Throwable unused) {
                    i5 = i3;
                    try {
                        Thread.sleep(5L);
                    } catch (Exception unused2) {
                    }
                    i6++;
                    i3 = i5;
                }
            }
            i5 = i3;
            try {
                i4 = this.h.a(this.g, parse, 0, i5, 1);
                break;
            } catch (Throwable unused3) {
                Thread.sleep(5L);
                i6++;
                i3 = i5;
            }
            i6++;
            i3 = i5;
        }
        if (i4 == 0) {
            return true;
        }
        if (fVar != null) {
            fVar.b++;
        }
        return false;
    }

    private boolean a(String str, a aVar, int i2) {
        int i3;
        int i4;
        Uri parse = Uri.parse(a(str, aVar));
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                i3 = -1;
                break;
            }
            try {
                i4 = i2;
            } catch (Throwable unused) {
                i4 = i2;
            }
            try {
                i3 = this.h.a(this.g, parse, 0, i4, 1);
                break;
            } catch (Throwable unused2) {
                try {
                    Thread.sleep(5L);
                } catch (Exception unused3) {
                }
                i5++;
                i2 = i4;
            }
            i5++;
            i2 = i4;
        }
        return i3 == 0;
    }

    private String b(String str) {
        return str + ".cesium";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int digit = Character.digit(str.charAt(i3), 16);
            int digit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    @Override // com.baidu.bbalbscesium.j.a
    public a.f a(a.e eVar, h.a aVar) {
        return a.f.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v6 */
    @Override // com.baidu.bbalbscesium.j.a
    public a.h a(String str, a.g gVar) {
        int i2;
        byte[] bArr;
        d dVar;
        ?? r18;
        Byte b2;
        d dVar2 = this;
        String str2 = str;
        boolean z = false;
        try {
            i2 = dVar2.g.getPackageManager().getPackageUid(str2, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        int i3 = i2;
        if (i3 < 0) {
            return a.h.a();
        }
        f fVar = new f();
        c cVar = dVar2.new c();
        C0339d c0339d = new C0339d();
        C0339d c0339d2 = new C0339d();
        for (int i4 = 0; i4 < 16; i4++) {
            a a2 = a.a(i4);
            if (dVar2.a(str2, a2, i3)) {
                c0339d.a(a2);
            } else {
                c0339d2.a(a2);
            }
        }
        int i5 = 0;
        while (i5 < 32) {
            a a3 = dVar2.a(str2, i5, c0339d.a(), i3, fVar);
            if (a3 == null) {
                a3 = a(str, i5, c0339d2.a(), i3, fVar);
            }
            if (a3 == null) {
                return a.h.a();
            }
            cVar.a(a3);
            i5++;
            dVar2 = this;
            str2 = str;
        }
        byte[] b3 = cVar.b();
        boolean z2 = true;
        byte[] bArr2 = {"0".getBytes()[0], "O".getBytes()[0], "V".getBytes()[0]};
        int i6 = 0;
        while (true) {
            bArr = null;
            if (i6 >= 3) {
                dVar = this;
                r18 = z;
                b2 = null;
                break;
            }
            byte b4 = bArr2[i6];
            a a4 = a.a(b4, z);
            boolean z3 = z;
            if (a(str, 32, a4, i3, fVar)) {
                a a5 = a.a(b4, true);
                dVar = this;
                if (dVar.a(str, 33, a5, i3, fVar)) {
                    c cVar2 = dVar.new c();
                    cVar2.a(a4);
                    cVar2.a(a5);
                    b2 = Byte.valueOf(cVar2.b()[z3 ? 1 : 0]);
                    r18 = z3;
                    break;
                }
            }
            i6++;
            z = z3 ? 1 : 0;
        }
        if (b2 == null) {
            c cVar3 = dVar.new c();
            for (int i7 = 32; i7 < 34; i7++) {
                a a6 = dVar.a(str, i7, c0339d.a(), i3, fVar);
                if (a6 == null) {
                    dVar = this;
                    a6 = dVar.a(str, i7, c0339d2.a(), i3, fVar);
                } else {
                    dVar = this;
                }
                if (a6 == null) {
                    return a.h.a();
                }
                cVar3.a(a6);
            }
            b2 = Byte.valueOf(cVar3.b()[r18]);
        } else {
            z2 = r18;
        }
        Byte b5 = b2;
        if (z2) {
            c cVar4 = dVar.new c();
            int i8 = 34;
            while (i8 < 94) {
                a a7 = dVar.a(str, i8, c0339d.a(), i3, fVar);
                if (a7 == null) {
                    a7 = a(str, i8, c0339d2.a(), i3, fVar);
                }
                if (a7 == null) {
                    break;
                }
                cVar4.a(a7);
                i8++;
                dVar = this;
            }
            if (cVar4.a() > 0) {
                bArr = cVar4.b();
            }
        }
        return a.h.a(new e(b3, b5.byteValue(), bArr).a());
    }

    @Override // com.baidu.bbalbscesium.j.a
    public void a(a.d dVar) {
        this.g = this.f7396a.f7397a;
    }
}
