package com.qumeng.overseas.advlib.trdparty.unionset.apply.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f13349a = "HookStartActivity";
    private static boolean b;
    private static boolean c;

    static abstract class a {

        /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c$a$a, reason: collision with other inner class name */
        class C0867a implements InvocationHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f13350a;

            C0867a(Object obj) {
                this.f13350a = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (c.c && "startActivity".equals(method.getName())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Intent) {
                            break;
                        }
                    }
                }
                try {
                    return method.invoke(this.f13350a, objArr);
                } catch (Throwable th) {
                    th.printStackTrace();
                    n.b(c.f13349a, "hook error = " + th.toString(), new Object[0]);
                    return 1;
                }
            }
        }

        a() {
        }

        abstract Class<?> a();

        Object b() {
            try {
                return c().get("");
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        public void build(Context context) {
            Object b = b();
            Class<?> a2 = a();
            try {
                Class<?> cls = Class.forName("android.util.Singleton");
                Field declaredField = cls.getDeclaredField("mInstance");
                declaredField.setAccessible(true);
                Method declaredMethod = cls.getDeclaredMethod("get", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredField.set(b, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{a2}, new C0867a(declaredMethod.invoke(b, new Object[0]))));
            } catch (Throwable th) {
                th.printStackTrace();
                n.b(c.f13349a, "hook error = " + th.toString(), new Object[0]);
            }
        }

        abstract Field c();
    }

    static class b extends a {
        b() {
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Class<?> a() {
            try {
                return Class.forName("android.app.IActivityManager");
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Field c() {
            try {
                Field declaredField = ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c$c, reason: collision with other inner class name */
    static class C0868c extends a {
        C0868c() {
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Class<?> a() {
            try {
                return Class.forName("android.app.IActivityManager");
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Field c() {
            try {
                Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    static class d extends a {
        d() {
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Class<?> a() {
            try {
                return Class.forName("android.app.IActivityTaskManager");
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.apply.common.c.a
        Field c() {
            Field field = null;
            try {
                field = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
                field.setAccessible(true);
                return field;
            } catch (Throwable th) {
                th.printStackTrace();
                return field;
            }
        }
    }

    public static void a(boolean z) {
        Log.i(f13349a, "setIsHook = " + z);
        c = z;
    }

    public static void a(Context context) {
        a bVar;
        if (b) {
            Log.i(f13349a, "sIsInit return");
            return;
        }
        b = true;
        if (Build.VERSION.SDK_INT >= 29) {
            bVar = new d();
        } else {
            bVar = new b();
        }
        bVar.build(context);
    }
}
