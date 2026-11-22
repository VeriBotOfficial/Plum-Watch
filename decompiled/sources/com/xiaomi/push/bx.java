package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.push.af;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class bx {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bx f14472a;

    /* renamed from: a, reason: collision with other field name */
    private Context f245a;

    /* renamed from: a, reason: collision with other field name */
    private bw f246a;

    /* renamed from: a, reason: collision with other field name */
    private final HashMap<String, bv> f248a = new HashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private ThreadPoolExecutor f249a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<a> f247a = new ArrayList<>();

    private bx(Context context) {
        this.f245a = context;
    }

    public static bx a(Context context) {
        if (f14472a == null) {
            synchronized (bx.class) {
                if (f14472a == null) {
                    f14472a = new bx(context);
                }
            }
        }
        return f14472a;
    }

    private void a() {
        af.a(this.f245a).b(new af.a() { // from class: com.xiaomi.push.bx.1
            @Override // com.xiaomi.push.af.a
            /* renamed from: a */
            public String mo11916a() {
                return "100957";
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (bx.this.f247a) {
                    if (bx.this.f247a.size() > 0) {
                        if (bx.this.f247a.size() > 1) {
                            bx bxVar = bx.this;
                            bxVar.a(bxVar.f247a);
                        } else {
                            bx bxVar2 = bx.this;
                            bxVar2.b((a) bxVar2.f247a.get(0));
                        }
                        bx.this.f247a.clear();
                        System.gc();
                    }
                }
            }
        }, com.xiaomi.push.service.ah.a(this.f245a).a(gl.StatDataProcessFrequency.a(), 5));
    }

    public void a(a aVar) {
        bv bvVar;
        if (aVar == null) {
            return;
        }
        if (this.f246a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m11927a = aVar.m11927a();
        synchronized (this.f248a) {
            bvVar = this.f248a.get(m11927a);
            if (bvVar == null) {
                bvVar = this.f246a.a(this.f245a, m11927a);
                this.f248a.put(m11927a, bvVar);
            }
        }
        if (this.f249a.isShutdown()) {
            return;
        }
        aVar.a(bvVar, this.f245a);
        synchronized (this.f247a) {
            this.f247a.add(aVar);
            a();
        }
    }

    public void b(a aVar) {
        bv bvVar;
        if (aVar == null) {
            return;
        }
        if (this.f246a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String m11927a = aVar.m11927a();
        synchronized (this.f248a) {
            bvVar = this.f248a.get(m11927a);
            if (bvVar == null) {
                bvVar = this.f246a.a(this.f245a, m11927a);
                this.f248a.put(m11927a, bvVar);
            }
        }
        if (this.f249a.isShutdown()) {
            return;
        }
        aVar.a(bvVar, this.f245a);
        a((Runnable) aVar);
    }

    public void a(Runnable runnable) {
        if (this.f249a.isShutdown()) {
            return;
        }
        this.f249a.execute(runnable);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11925a(String str) {
        return a(str).a();
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f246a == null) {
            throw new IllegalStateException("should exec setDbHelperFactory method first!");
        }
        HashMap hashMap = new HashMap();
        if (this.f249a.isShutdown()) {
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m11928a()) {
                next.a(a(next.m11927a()), this.f245a);
            }
            ArrayList arrayList2 = (ArrayList) hashMap.get(next.m11927a());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(next.m11927a(), arrayList2);
            }
            arrayList2.add(next);
        }
        for (String str : hashMap.keySet()) {
            ArrayList arrayList3 = (ArrayList) hashMap.get(str);
            if (arrayList3 != null && arrayList3.size() > 0) {
                c cVar = new c(str, arrayList3);
                cVar.a(((a) arrayList3.get(0)).f250a, this.f245a);
                this.f249a.execute(cVar);
            }
        }
    }

    private bv a(String str) {
        bv bvVar = this.f248a.get(str);
        if (bvVar != null) {
            return bvVar;
        }
        synchronized (this.f248a) {
            if (bvVar == null) {
                bvVar = this.f246a.a(this.f245a, str);
                this.f248a.put(str, bvVar);
            }
        }
        return bvVar;
    }

    public static class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<a> f14477a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            ArrayList<a> arrayList2 = new ArrayList<>();
            this.f14477a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.bx.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            Iterator<a> it = this.f14477a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context, sQLiteDatabase);
                }
            }
        }

        @Override // com.xiaomi.push.bx.a
        public final void a(Context context) {
            super.a(context);
            Iterator<a> it = this.f14477a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(context);
                }
            }
        }
    }

    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with other field name */
        private a f251a;

        /* renamed from: a, reason: collision with other field name */
        private String f252a;

        /* renamed from: a, reason: collision with other field name */
        private WeakReference<Context> f253a;
        protected String b;

        /* renamed from: a, reason: collision with other field name */
        protected bv f250a = null;

        /* renamed from: a, reason: collision with other field name */
        private Random f254a = new Random();

        /* renamed from: a, reason: collision with root package name */
        private int f14474a = 0;

        /* renamed from: a, reason: collision with other method in class */
        public Object mo11926a() {
            return null;
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void b(Context context) {
        }

        public a(String str) {
            this.f252a = str;
        }

        void a(bv bvVar, Context context) {
            this.f250a = bvVar;
            this.b = bvVar.a();
            this.f253a = new WeakReference<>(context);
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m11928a() {
            return this.f250a == null || TextUtils.isEmpty(this.b) || this.f253a == null;
        }

        public void a(a aVar) {
            this.f251a = aVar;
        }

        public void a(Context context, Object obj) {
            bx.a(context).a(this);
        }

        /* renamed from: a, reason: collision with other method in class */
        public String m11927a() {
            return this.f252a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final Context context;
            WeakReference<Context> weakReference = this.f253a;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f250a == null || TextUtils.isEmpty(this.f252a)) {
                return;
            }
            File file = new File(this.f252a);
            v.a(context, new File(file.getParentFile(), bb.b(file.getAbsolutePath())), new Runnable() { // from class: com.xiaomi.push.bx.a.1
                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        try {
                            sQLiteDatabase = a.this.a();
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.beginTransaction();
                                a.this.a(context, sQLiteDatabase);
                                sQLiteDatabase.setTransactionSuccessful();
                            }
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Exception e) {
                                    e = e;
                                    com.xiaomi.channel.commonutils.logger.b.a(e);
                                    a.this.a(context);
                                }
                            }
                            if (a.this.f250a != null) {
                                a.this.f250a.close();
                            }
                        } catch (Throwable th) {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Exception e2) {
                                    com.xiaomi.channel.commonutils.logger.b.a(e2);
                                    a.this.a(context);
                                    throw th;
                                }
                            }
                            if (a.this.f250a != null) {
                                a.this.f250a.close();
                            }
                            a.this.a(context);
                            throw th;
                        }
                    } catch (Exception e3) {
                        com.xiaomi.channel.commonutils.logger.b.a(e3);
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Exception e4) {
                                e = e4;
                                com.xiaomi.channel.commonutils.logger.b.a(e);
                                a.this.a(context);
                            }
                        }
                        if (a.this.f250a != null) {
                            a.this.f250a.close();
                        }
                    }
                    a.this.a(context);
                }
            });
        }

        public SQLiteDatabase a() {
            return this.f250a.getWritableDatabase();
        }

        void a(Context context) {
            a aVar = this.f251a;
            if (aVar != null) {
                aVar.a(context, mo11926a());
            }
            b(context);
        }
    }

    public static abstract class b<T> extends a {

        /* renamed from: a, reason: collision with root package name */
        private int f14476a;

        /* renamed from: a, reason: collision with other field name */
        private String f256a;

        /* renamed from: a, reason: collision with other field name */
        private List<String> f257a;

        /* renamed from: a, reason: collision with other field name */
        private String[] f258a;
        private List<T> b;
        private String c;
        private String d;
        private String e;

        public abstract T a(Context context, Cursor cursor);

        public abstract void a(Context context, List<T> list);

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.b = new ArrayList();
            this.f257a = list;
            this.f256a = str2;
            this.f258a = strArr;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f14476a = i;
        }

        @Override // com.xiaomi.push.bx.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.b.clear();
            List<String> list = this.f257a;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f257a.size()];
                this.f257a.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f14476a;
            Cursor query = sQLiteDatabase.query(this.b, strArr, this.f256a, this.f258a, this.c, this.d, this.e, i > 0 ? String.valueOf(i) : null);
            if (query != null && query.moveToFirst()) {
                do {
                    T a2 = a(context, query);
                    if (a2 != null) {
                        this.b.add(a2);
                    }
                } while (query.moveToNext());
                query.close();
            }
            a(context, (List) this.b);
        }

        @Override // com.xiaomi.push.bx.a
        public SQLiteDatabase a() {
            return this.f250a.getReadableDatabase();
        }
    }

    public static class e extends a {

        /* renamed from: a, reason: collision with root package name */
        private ContentValues f14479a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f14479a = contentValues;
        }

        @Override // com.xiaomi.push.bx.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.b, null, this.f14479a);
        }
    }

    public static class d extends a {

        /* renamed from: a, reason: collision with root package name */
        private String f14478a;

        /* renamed from: a, reason: collision with other field name */
        protected String[] f259a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f14478a = str2;
            this.f259a = strArr;
        }

        @Override // com.xiaomi.push.bx.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.b, this.f14478a, this.f259a);
        }
    }
}
