package com.amap.api.col.p0003sl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DBOperation.java */
/* loaded from: classes11.dex */
public class sa {
    private static Map<Class<? extends ra>, ra> d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private va f1878a;
    private SQLiteDatabase b;
    private ra c;

    public sa(Context context, ra raVar) {
        try {
            this.f1878a = new va(context.getApplicationContext(), raVar.getDBName(), raVar.getVersion(), raVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = raVar;
    }

    public static synchronized ra b(Class<? extends ra> cls) throws IllegalAccessException, InstantiationException {
        ra raVar;
        synchronized (sa.class) {
            if (d.get(cls) == null) {
                d.put(cls, cls.newInstance());
            }
            raVar = d.get(cls);
        }
        return raVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(java.lang.String r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            com.amap.api.col.3sl.ra r0 = r3.c
            monitor-enter(r0)
            com.amap.api.col.3sl.ta r5 = a(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L44
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L13:
            android.database.sqlite.SQLiteDatabase r1 = r3.a()     // Catch: java.lang.Throwable -> L44
            r3.b = r1     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L1d:
            r2 = 0
            r1.delete(r5, r4, r2)     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r4 = r3.b     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L37
            goto L32
        L26:
            r4 = move-exception
            java.lang.String r5 = "dbs"
            java.lang.String r1 = "dld"
            com.amap.api.col.p0003sl.fa.a(r4, r5, r1)     // Catch: java.lang.Throwable -> L39
            android.database.sqlite.SQLiteDatabase r4 = r3.b     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L37
        L32:
            r4.close()     // Catch: java.lang.Throwable -> L44
            r3.b = r2     // Catch: java.lang.Throwable -> L44
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L39:
            r4 = move-exception
            android.database.sqlite.SQLiteDatabase r5 = r3.b     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L43
            r5.close()     // Catch: java.lang.Throwable -> L44
            r3.b = r2     // Catch: java.lang.Throwable -> L44
        L43:
            throw r4     // Catch: java.lang.Throwable -> L44
        L44:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.sa.a(java.lang.String, java.lang.Class):void");
    }

    public <T> List<T> b(String str, Class<T> cls) {
        ArrayList arrayList;
        Throwable th;
        Cursor cursor;
        synchronized (this.c) {
            arrayList = new ArrayList();
            ta a2 = a((Class) cls);
            String a3 = a(a2);
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                if (sQLiteDatabase == null) {
                    try {
                        this.b = this.f1878a.getReadableDatabase();
                    } catch (Throwable th2) {
                        fa.a(th2, "dbs", "grd");
                    }
                }
                this.b = this.b;
            }
            if (this.b != null && !TextUtils.isEmpty(a3) && str != null) {
                try {
                    try {
                        cursor = this.b.query(a3, null, str, null, null, null, null);
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                fa.a(th, "dbs", "sld");
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable th4) {
                                        fa.a(th4, "dbs", "sld");
                                    }
                                }
                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.close();
                                    this.b = null;
                                }
                                return arrayList;
                            } finally {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        cursor = null;
                    }
                } catch (Throwable th6) {
                    fa.a(th6, "dbs", "sld");
                }
                if (cursor == null) {
                    this.b.close();
                    this.b = null;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th7) {
                            fa.a(th7, "dbs", "sld");
                        }
                    }
                    try {
                        SQLiteDatabase sQLiteDatabase3 = this.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.close();
                            this.b = null;
                        }
                    } catch (Throwable th8) {
                        fa.a(th8, "dbs", "sld");
                    }
                } else {
                    while (cursor.moveToNext()) {
                        arrayList.add(a(cursor, cls, a2));
                    }
                    try {
                        cursor.close();
                    } catch (Throwable th9) {
                        fa.a(th9, "dbs", "sld");
                    }
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.close();
                        this.b = null;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(java.lang.String r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.amap.api.col.3sl.ra r0 = r4.c
            monitor-enter(r0)
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L4c
            com.amap.api.col.3sl.ta r1 = a(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = a(r1)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L17:
            android.content.ContentValues r6 = a(r6, r1)     // Catch: java.lang.Throwable -> L4c
            android.database.sqlite.SQLiteDatabase r1 = r4.a()     // Catch: java.lang.Throwable -> L4c
            r4.b = r1     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L25:
            r3 = 0
            r1.update(r2, r6, r5, r3)     // Catch: java.lang.Throwable -> L2e
            android.database.sqlite.SQLiteDatabase r5 = r4.b     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3f
            goto L3a
        L2e:
            r5 = move-exception
            java.lang.String r6 = "dbs"
            java.lang.String r1 = "udd"
            com.amap.api.col.p0003sl.fa.a(r5, r6, r1)     // Catch: java.lang.Throwable -> L41
            android.database.sqlite.SQLiteDatabase r5 = r4.b     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3f
        L3a:
            r5.close()     // Catch: java.lang.Throwable -> L4c
            r4.b = r3     // Catch: java.lang.Throwable -> L4c
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L41:
            r5 = move-exception
            android.database.sqlite.SQLiteDatabase r6 = r4.b     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L4b
            r6.close()     // Catch: java.lang.Throwable -> L4c
            r4.b = r3     // Catch: java.lang.Throwable -> L4c
        L4b:
            throw r5     // Catch: java.lang.Throwable -> L4c
        L4c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.sa.a(java.lang.String, java.lang.Object):void");
    }

    public void a(Object obj, String str) {
        synchronized (this.c) {
            if (((ArrayList) b(str, obj.getClass())).size() == 0) {
                a((sa) obj);
            } else {
                a(str, obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0013, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(T r5) {
        /*
            r4 = this;
            com.amap.api.col.3sl.ra r0 = r4.c
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r4.a()     // Catch: java.lang.Throwable -> L34
            r4.b = r1     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        Ld:
            r2 = 0
            a(r1, r5)     // Catch: java.lang.Throwable -> L16
            android.database.sqlite.SQLiteDatabase r5 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L27
            goto L22
        L16:
            r5 = move-exception
            java.lang.String r1 = "dbs"
            java.lang.String r3 = "itd"
            com.amap.api.col.p0003sl.fa.a(r5, r1, r3)     // Catch: java.lang.Throwable -> L29
            android.database.sqlite.SQLiteDatabase r5 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L27
        L22:
            r5.close()     // Catch: java.lang.Throwable -> L34
            r4.b = r2     // Catch: java.lang.Throwable -> L34
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L29:
            r5 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r4.b     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L34
            r4.b = r2     // Catch: java.lang.Throwable -> L34
        L33:
            throw r5     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.sa.a(java.lang.Object):void");
    }

    private static <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        ta a2 = a((Class) t.getClass());
        String a3 = a(a2);
        if (TextUtils.isEmpty(a3) || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(a3, null, a(t, a2));
    }

    public <T> void a(List<T> list) {
        synchronized (this.c) {
            if (list.size() == 0) {
                return;
            }
            SQLiteDatabase a2 = a();
            this.b = a2;
            if (a2 == null) {
                return;
            }
            try {
                try {
                    a2.beginTransaction();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        a(this.b, it.next());
                    }
                    this.b.setTransactionSuccessful();
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (Throwable th) {
                        fa.a(th, "dbs", "ild");
                    }
                    this.b.close();
                    this.b = null;
                } catch (Throwable th2) {
                    fa.a(th2, "dbs", "ild");
                }
            } catch (Throwable th3) {
                try {
                    fa.a(th3, "dbs", "ild");
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (Throwable th4) {
                        fa.a(th4, "dbs", "ild");
                    }
                    this.b.close();
                    this.b = null;
                } finally {
                }
            }
        }
    }

    private static <T> T a(Cursor cursor, Class<T> cls, ta taVar) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Field[] declaredFields;
        boolean isSuperField = taVar.isSuperField();
        if (cls == null) {
            declaredFields = null;
        } else if (isSuperField) {
            declaredFields = cls.getSuperclass().getDeclaredFields();
        } else {
            declaredFields = cls.getDeclaredFields();
        }
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(ua.class);
            if (annotation != null) {
                ua uaVar = (ua) annotation;
                int fieldType = uaVar.fieldType();
                int columnIndex = cursor.getColumnIndex(uaVar.fieldName());
                switch (fieldType) {
                    case 1:
                        field.set(newInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case 2:
                        field.set(newInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case 3:
                        field.set(newInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case 4:
                        field.set(newInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case 5:
                        field.set(newInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case 6:
                        field.set(newInstance, cursor.getString(columnIndex));
                        break;
                    case 7:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return newInstance;
    }

    private static ContentValues a(Object obj, ta taVar) {
        Field[] declaredFields;
        ContentValues contentValues = new ContentValues();
        Class<?> cls = obj.getClass();
        boolean isSuperField = taVar.isSuperField();
        if (cls == null) {
            declaredFields = null;
        } else if (isSuperField) {
            declaredFields = cls.getSuperclass().getDeclaredFields();
        } else {
            declaredFields = cls.getDeclaredFields();
        }
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(ua.class);
            if (annotation != null) {
                ua uaVar = (ua) annotation;
                switch (uaVar.fieldType()) {
                    case 1:
                        contentValues.put(uaVar.fieldName(), Short.valueOf(field.getShort(obj)));
                        break;
                    case 2:
                        contentValues.put(uaVar.fieldName(), Integer.valueOf(field.getInt(obj)));
                        break;
                    case 3:
                        contentValues.put(uaVar.fieldName(), Float.valueOf(field.getFloat(obj)));
                        break;
                    case 4:
                        contentValues.put(uaVar.fieldName(), Double.valueOf(field.getDouble(obj)));
                        break;
                    case 5:
                        contentValues.put(uaVar.fieldName(), Long.valueOf(field.getLong(obj)));
                        break;
                    case 6:
                        contentValues.put(uaVar.fieldName(), (String) field.get(obj));
                        break;
                    case 7:
                        try {
                            contentValues.put(uaVar.fieldName(), (byte[]) field.get(obj));
                            break;
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            break;
                        }
                }
            }
        }
        return contentValues;
    }

    private SQLiteDatabase a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.b = this.f1878a.getWritableDatabase();
            }
        } catch (Throwable th) {
            fa.a(th, "dbs", "gwd");
        }
        return this.b;
    }

    private static <T> String a(ta taVar) {
        if (taVar == null) {
            return null;
        }
        return taVar.tableName();
    }

    private static <T> ta a(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(ta.class);
        if (annotation != null) {
            return (ta) annotation;
        }
        return null;
    }
}
