package com.huawei.agconnect.core.a;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.Service;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Service> f10191a = new HashMap();
    private static Map<Class<?>, Object> b = new HashMap();
    private Map<Class<?>, Service> c = new HashMap();
    private Map<Class<?>, Object> d = new HashMap();

    d(List<Service> list, Context context) {
        a(list, context);
    }

    private Object a(AGConnectInstance aGConnectInstance, Service service) {
        StringBuilder sb;
        String localizedMessage;
        if (service.getInstance() != null) {
            return service.getInstance();
        }
        Class<?> type = service.getType();
        if (type == null) {
            return null;
        }
        try {
            Constructor a2 = a(type, Context.class, AGConnectInstance.class);
            if (a2 != null) {
                return a2.newInstance(aGConnectInstance.getContext(), aGConnectInstance);
            }
            Constructor a3 = a(type, Context.class);
            return a3 != null ? a3.newInstance(aGConnectInstance.getContext()) : type.newInstance();
        } catch (IllegalAccessException e) {
            sb = new StringBuilder("Instantiate service exception ");
            localizedMessage = e.getLocalizedMessage();
            Log.e("ServiceRepository", sb.append(localizedMessage).toString());
            return null;
        } catch (InstantiationException e2) {
            sb = new StringBuilder("Instantiate service exception ");
            localizedMessage = e2.getLocalizedMessage();
            Log.e("ServiceRepository", sb.append(localizedMessage).toString());
            return null;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder("Instantiate service exception ");
            localizedMessage = e3.getLocalizedMessage();
            Log.e("ServiceRepository", sb.append(localizedMessage).toString());
            return null;
        }
    }

    private static Constructor a(Class cls, Class... clsArr) {
        boolean z = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i = 0; i < clsArr.length; i++) {
                    z = parameterTypes[i] == clsArr[i];
                }
                if (z) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private void a(String str, Exception exc) {
        Log.e("ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        Log.e("ServiceRepository", "cause message:" + (exc.getCause() != null ? exc.getCause().getMessage() : ""));
    }

    public <T> T a(AGConnectInstance aGConnectInstance, Class<?> cls) {
        T t;
        Service service = this.c.get(cls);
        if (service == null && (service = f10191a.get(cls)) != null) {
            return (T) b.get(cls);
        }
        if (service == null) {
            return null;
        }
        if (service.isSingleton() && (t = (T) this.d.get(cls)) != null) {
            return t;
        }
        T t2 = (T) a(aGConnectInstance, service);
        if (t2 != null && service.isSingleton()) {
            this.d.put(cls, t2);
        }
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: InvocationTargetException -> 0x0077, InstantiationException -> 0x007b, IllegalAccessException -> 0x007f, TryCatch #2 {IllegalAccessException -> 0x007f, InstantiationException -> 0x007b, InvocationTargetException -> 0x0077, blocks: (B:20:0x004a, B:24:0x005c, B:25:0x006d, B:28:0x0065), top: B:19:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: InvocationTargetException -> 0x0077, InstantiationException -> 0x007b, IllegalAccessException -> 0x007f, TryCatch #2 {IllegalAccessException -> 0x007f, InstantiationException -> 0x007b, InvocationTargetException -> 0x0077, blocks: (B:20:0x004a, B:24:0x005c, B:25:0x006d, B:28:0x0065), top: B:19:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<com.huawei.agconnect.core.Service> r6, android.content.Context r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L86
        L4:
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r6.next()
            com.huawei.agconnect.core.Service r0 = (com.huawei.agconnect.core.Service) r0
            boolean r1 = r0.isSharedInstance()
            if (r1 == 0) goto L29
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r1 = com.huawei.agconnect.core.a.d.f10191a
            java.lang.Class r2 = r0.getInterface()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L32
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r1 = com.huawei.agconnect.core.a.d.f10191a
            goto L2b
        L29:
            java.util.Map<java.lang.Class<?>, com.huawei.agconnect.core.Service> r1 = r5.c
        L2b:
            java.lang.Class r2 = r0.getInterface()
            r1.put(r2, r0)
        L32:
            boolean r1 = r0.isAutoCreated()
            if (r1 == 0) goto L8
            java.lang.Class r1 = r0.getType()
            if (r1 == 0) goto L8
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = com.huawei.agconnect.core.a.d.b
            java.lang.Class r2 = r0.getInterface()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L8
            java.lang.Class r1 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            java.lang.reflect.Constructor r1 = a(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            if (r1 == 0) goto L65
            java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            goto L6d
        L65:
            java.lang.Class r1 = r0.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
        L6d:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = com.huawei.agconnect.core.a.d.b     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            java.lang.Class r0 = r0.getInterface()     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            r2.put(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.InstantiationException -> L7b java.lang.IllegalAccessException -> L7f
            goto L8
        L77:
            r0 = move-exception
            java.lang.String r1 = "TargetException"
            goto L82
        L7b:
            r0 = move-exception
            java.lang.String r1 = "InstantiationException"
            goto L82
        L7f:
            r0 = move-exception
            java.lang.String r1 = "AccessException"
        L82:
            r5.a(r1, r0)
            goto L8
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.core.a.d.a(java.util.List, android.content.Context):void");
    }
}
