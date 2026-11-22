package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: MethodCallHelper.java */
/* loaded from: classes11.dex */
public class g5 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1660a = false;
    Map<String, a> b = Collections.synchronizedMap(new HashMap());
    List<String> c = Collections.synchronizedList(new LinkedList());

    /* compiled from: MethodCallHelper.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f1661a;
        private Object b;
        private Class<?>[] c;
        private Object[] d;

        public a(Object obj, String str, Object... objArr) {
            this.b = obj;
            this.f1661a = str;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            this.c = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                this.c[i] = objArr[i].getClass();
            }
            this.d = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.d[i2] = objArr[i2];
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r4 = r3.b.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f1660a     // Catch: java.lang.Throwable -> Ld0
            r1 = 1
            if (r0 != r1) goto L8
            monitor-exit(r8)
            return
        L8:
            r8.f1660a = r1     // Catch: java.lang.Throwable -> Ld0
            java.util.Map<java.lang.String, com.amap.api.col.3sl.g5$a> r0 = r8.b     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lce
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto Lce
            java.util.List<java.lang.String> r0 = r8.c     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lce
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Ld0
            if (r0 != 0) goto Lce
            r0 = 0
            r2 = r0
        L20:
            java.util.List<java.lang.String> r3 = r8.c     // Catch: java.lang.Throwable -> Ld0
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Ld0
            if (r2 >= r3) goto Lc4
            java.util.Map<java.lang.String, com.amap.api.col.3sl.g5$a> r3 = r8.b     // Catch: java.lang.Throwable -> Ld0
            java.util.List<java.lang.String> r4 = r8.c     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Ld0
            com.amap.api.col.3sl.g5$a r3 = (com.amap.api.col.3sl.g5.a) r3     // Catch: java.lang.Throwable -> Ld0
            if (r3 == 0) goto Lc0
            java.lang.Object r4 = com.amap.api.col.3sl.g5.a.a(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            if (r4 != 0) goto L40
            goto Lc0
        L40:
            java.lang.Object r4 = com.amap.api.col.3sl.g5.a.a(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            if (r4 != 0) goto L4c
            goto Lc0
        L4c:
            java.lang.String r5 = com.amap.api.col.3sl.g5.a.b(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.Throwable -> Ld0
            java.lang.Class[] r6 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.Throwable -> Ld0
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L59 java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.Throwable -> Ld0
            goto L97
        L59:
            java.lang.Class[] r5 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            int r5 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            if (r5 <= 0) goto L96
            java.lang.Class[] r5 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            int r5 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r6 = r0
        L68:
            java.lang.Class[] r7 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            int r7 = r7.length     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            if (r6 >= r7) goto L8d
            java.lang.Class[] r7 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r7 = r7[r6]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Class[] r7 = r7.getInterfaces()     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            int r7 = r7.length     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            if (r7 <= 0) goto L8a
            java.lang.Class[] r7 = com.amap.api.col.3sl.g5.a.c(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r7 = r7[r6]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Class[] r7 = r7.getInterfaces()     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r7 = r7[r0]     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r5[r6] = r7     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
        L8a:
            int r6 = r6 + 1
            goto L68
        L8d:
            java.lang.String r6 = com.amap.api.col.3sl.g5.a.b(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r5)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            goto L97
        L96:
            r4 = 0
        L97:
            if (r4 == 0) goto Lc0
            r4.setAccessible(r1)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Object r5 = com.amap.api.col.3sl.g5.a.a(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            java.lang.Object[] r3 = com.amap.api.col.3sl.g5.a.d(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            r4.invoke(r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> La8 java.lang.IllegalArgumentException -> Lad java.lang.IllegalAccessException -> Lb2 java.lang.SecurityException -> Lb7 java.lang.NoSuchMethodException -> Lbc java.lang.Throwable -> Ld0
            goto Lc0
        La8:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            goto Lc0
        Lad:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            goto Lc0
        Lb2:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            goto Lc0
        Lb7:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
            goto Lc0
        Lbc:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld0
        Lc0:
            int r2 = r2 + 1
            goto L20
        Lc4:
            java.util.Map<java.lang.String, com.amap.api.col.3sl.g5$a> r0 = r8.b     // Catch: java.lang.Throwable -> Ld0
            r0.clear()     // Catch: java.lang.Throwable -> Ld0
            java.util.List<java.lang.String> r0 = r8.c     // Catch: java.lang.Throwable -> Ld0
            r0.clear()     // Catch: java.lang.Throwable -> Ld0
        Lce:
            monitor-exit(r8)
            return
        Ld0:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.g5.a():void");
    }

    public synchronized void a(Object obj, Object... objArr) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 3) {
                String methodName = stackTrace[3].getMethodName();
                StringBuilder sb = new StringBuilder();
                sb.append(obj.getClass().getName()).append("::");
                sb.append(methodName).append(Separators.LPAREN);
                if (objArr.length > 0) {
                    for (Object obj2 : objArr) {
                        sb.append(obj2.getClass().getName()).append(",");
                    }
                }
                sb.append(Separators.RPAREN);
                String a2 = i9.a(sb.toString());
                a aVar = new a(obj, methodName, objArr);
                if (!this.c.contains(a2)) {
                    List<String> list = this.c;
                    list.add(list.size(), a2);
                }
                this.b.put(a2, aVar);
            }
        } catch (Throwable unused) {
        }
        this.f1660a = false;
    }
}
