package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jo1 {

    public static final class a {
        public static final Class[] a(Object... objArr) {
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Class<?> cls = obj != null ? obj.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return (Class[]) arrayList.toArray(new Class[0]);
        }

        @JvmStatic
        public static Object a(Object obj, Class clazz, String methodName, Class[] argumentsTypes, Object... arguments) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(argumentsTypes, "argumentsTypes");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object obj2 = null;
            try {
                Method a2 = a(clazz, methodName, argumentsTypes);
                if (a2 == null) {
                    return null;
                }
                a2.setAccessible(true);
                obj2 = a2.invoke(obj, Arrays.copyOf(arguments, arguments.length));
                a2.setAccessible(false);
                return obj2;
            } catch (Throwable unused) {
                Object[] args = {methodName};
                int i = sp0.b;
                Intrinsics.checkNotNullParameter(args, "args");
                return obj2;
            }
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }

        @JvmStatic
        public static Object a(Object obj, String methodName, Object... arguments) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList();
            int length = copyOf.length;
            for (int i = 0; i < length; i++) {
                Object obj2 = copyOf[i];
                Class<?> cls = obj2 != null ? obj2.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return a(obj, obj.getClass(), methodName, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(arguments, arguments.length));
        }

        @JvmStatic
        private static Method a(Class cls, String str, Class[] clsArr) {
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                Intrinsics.checkNotNull(declaredMethods);
                for (Method method : declaredMethods) {
                    Intrinsics.checkNotNull(method);
                    Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                    if (Intrinsics.areEqual(str, method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == clsArr2.length) {
                            int length = parameterTypes.length;
                            for (int i = 0; i < length; i++) {
                                if (!parameterTypes[i].isAssignableFrom(clsArr2[i])) {
                                    break;
                                }
                            }
                            return method;
                        }
                        continue;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }

        @JvmStatic
        public static Object a(String className, Object... arguments) throws Throwable {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNull(cls);
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList(copyOf.length);
            for (Object obj : copyOf) {
                arrayList.add(obj.getClass());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                boolean isAccessible = declaredConstructor.isAccessible();
                if (!isAccessible) {
                    declaredConstructor.setAccessible(true);
                }
                Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(copyOf, copyOf.length));
                if (!isAccessible) {
                    declaredConstructor.setAccessible(false);
                }
                return newInstance;
            } catch (Throwable unused) {
                Object[] args = {cls.getCanonicalName(), Arrays.toString(copyOf)};
                int i = sp0.b;
                Intrinsics.checkNotNullParameter(args, "args");
                return null;
            }
        }
    }

    public static Object a(Class clazz, String methodName, Object... arguments) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return a.a(null, clazz, methodName, a.a(Arrays.copyOf(arguments, arguments.length)), Arrays.copyOf(arguments, arguments.length));
    }
}
