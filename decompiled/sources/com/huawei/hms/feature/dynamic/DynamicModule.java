package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.IDynamicInstall;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import com.huawei.hms.feature.dynamic.a.d;
import com.huawei.hms.feature.dynamic.a.e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes14.dex */
public class DynamicModule {
    private static final int b = 256;
    private static final int c = -100;
    private static int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private Context g;
    public static final VersionPolicy PREFER_REMOTE = new e();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.huawei.hms.feature.dynamic.a.c();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new e();

    /* renamed from: a, reason: collision with root package name */
    private static final String f10331a = "DynamicModule";
    private static final ThreadLocal<HashMap<String, Boolean>> d = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, String>> e = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, IDynamicLoader>> f = new ThreadLocal<>();

    public static class DynamicLoaderClassLoader {

        /* renamed from: a, reason: collision with root package name */
        private static HashMap<String, ClassLoader> f10335a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return f10335a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f10335a.put(str, classLoader);
        }
    }

    public static class LoadingException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private Bundle f10336a;

        private LoadingException(String str) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, byte b) {
            this(str);
        }

        private LoadingException(String str, Bundle bundle) {
            super(str);
            this.f10336a = bundle;
        }

        /* synthetic */ LoadingException(String str, Bundle bundle, byte b) {
            this(str, bundle);
        }

        public Bundle getBundle() {
            return this.f10336a;
        }
    }

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, byte b) {
            this(str);
        }
    }

    private DynamicModule(Context context) {
        this.g = context;
    }

    public static Set<String> GetInstalledModuleInfo() {
        return c.a().f10352a;
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper load = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(b.j), ObjectWrapper.wrap(bundle));
            if (ObjectWrapper.unwrap(load) == null) {
                Logger.w(f10331a, "Get remote context is null.");
                return null;
            }
            if (ObjectWrapper.unwrap(load) instanceof Context) {
                Logger.i(f10331a, "Get context success.");
                return (Context) ObjectWrapper.unwrap(load);
            }
            if (!ObjectWrapper.unwrap(load).getClass().getName().equals(LoadingException.class.getName())) {
                return null;
            }
            Bundle bundle2 = (Bundle) ObjectWrapper.unwrap(load).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(load), new Object[0]);
            Logger.w(f10331a, "Successfully get the bundle in exception.");
            throw new LoadingException("Failed to load, please check the bundle in exception.", bundle2, (byte) 0);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.w(f10331a, "Failed to get remote module context.", e3);
            return null;
        }
    }

    private static Bundle a(Context context, String str) throws LoadingException, a {
        byte b2 = 0;
        try {
            Bundle d2 = d(context, str);
            String string = d2.getString(b.p);
            if (TextUtils.isEmpty(string) || !new File(string).exists()) {
                Logger.w(f10331a, "The loader_path:" + string + " is not available.");
                throw new LoadingException("The loader_path in queryBundle is empty or not exist.", b2);
            }
            Logger.i(f10331a, "Query HMS module:" + str + " info success.");
            return d2;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a("failed to get :" + str + " info.", b2);
        }
    }

    private static DynamicModule a(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        byte b2 = 0;
        try {
            synchronized (DynamicModule.class) {
                bool = (Boolean) ((HashMap) Objects.requireNonNull(d.get())).get(str);
                iDynamicLoader = (IDynamicLoader) ((HashMap) Objects.requireNonNull(f.get())).get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.", b2);
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context a2 = a(context, str, bundle, iDynamicLoader);
            if (a2 != null) {
                return new DynamicModule(a2);
            }
            throw new LoadingException("Failed to get remote module context: null", b2);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.", b2);
        }
    }

    private static IDynamicInstall a(Context context) throws LoadingException {
        int i2;
        int i3;
        String str = null;
        byte b2 = 0;
        try {
            Bundle a2 = a(context, b.d);
            str = a2.getString(b.p);
            i2 = a2.getInt(b.o);
        } catch (Exception e2) {
            Logger.w(f10331a, "Cannot get remote HMS dynamicLoader.", e2);
            i2 = 0;
        }
        try {
            i3 = getLocalVersion(context, b.d);
        } catch (Exception e3) {
            Logger.w(f10331a, "Cannot find local dynamicLoader fallback.", e3);
            i3 = 0;
        }
        String str2 = f10331a;
        Logger.i(str2, "DynamicLoader remoteHMSVersion:" + i2 + ", hmsLoaderPath:" + str + ", localLoaderVersion:" + i3);
        int i4 = i2 > i3 ? i2 : i3;
        if (i4 <= 10009300) {
            Logger.w(str2, "The current version:" + i4 + " is too low.");
            throw new LoadingException("The loader version:" + i4 + " is too low to support HFF.", b2);
        }
        if (i2 > i3) {
            Logger.i(str2, "Choose hms dynamicLoader: ".concat(String.valueOf(str)));
            h = 1;
            return a(str);
        }
        Logger.i(str2, "Choose local dynamicLoader fallback: ");
        h = 2;
        return b(context);
    }

    private static IDynamicInstall a(String str) throws LoadingException {
        byte b2 = 0;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return IDynamicInstall.Stub.asInterface((IBinder) new com.huawei.hms.feature.dynamic.a.a(str, ClassLoader.getSystemClassLoader()).loadClass(b.f).getConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e2.getMessage(), b2);
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.", b2);
    }

    private static void a(String str, ClassLoader classLoader) throws LoadingException {
        byte b2 = 0;
        try {
            f.set(new HashMap<String, IDynamicLoader>(str, (IBinder) classLoader.loadClass(b.e).getConstructor(new Class[0]).newInstance(new Object[0])) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.3

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f10334a;
                final /* synthetic */ IBinder b;

                {
                    this.f10334a = str;
                    this.b = r2;
                    put(str, IDynamicLoader.Stub.asInterface(r2));
                }
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to get loader interface:" + e2.getMessage(), b2);
        }
    }

    private static Bundle b(Context context, String str) throws LoadingException {
        boolean z = false;
        try {
            try {
                Class<?> loadClass = (context.getApplicationContext() == null ? context : context.getApplicationContext()).getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
                Method declaredMethod = loadClass.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = loadClass.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader == null) {
                    try {
                        Logger.i(f10331a, "No available cached loader, query remote.");
                        Bundle c2 = c(context, str);
                        synchronized (DynamicModule.class) {
                            String str2 = (String) ((HashMap) Objects.requireNonNull(e.get())).get(str);
                            if (TextUtils.isEmpty(str2)) {
                                return c2;
                            }
                            com.huawei.hms.feature.dynamic.a.a aVar = new com.huawei.hms.feature.dynamic.a.a(str2, ClassLoader.getSystemClassLoader());
                            a(str, aVar);
                            declaredMethod2.invoke(null, str, aVar);
                            d.set(new HashMap<String, Boolean>(str) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.1

                                /* renamed from: a, reason: collision with root package name */
                                final /* synthetic */ String f10332a;

                                {
                                    this.f10332a = str;
                                    put(str, Boolean.TRUE);
                                }
                            });
                            return c2;
                        }
                    } catch (a unused) {
                    }
                } else if (classLoader != ClassLoader.getSystemClassLoader()) {
                    Logger.i(f10331a, "Cached loader is available, ready to use it.");
                    try {
                        a(str, classLoader);
                    } catch (LoadingException e2) {
                        Logger.w(f10331a, "Get loader interface failed.", e2);
                    }
                    z = true;
                }
            } catch (Exception e3) {
                Logger.w(f10331a, "failed to load.", e3);
            }
            HashMap<String, Boolean> hashMap = new HashMap<>();
            hashMap.put(str, Boolean.valueOf(z));
            d.set(hashMap);
            return new Bundle();
        } catch (LoadingException e4) {
            throw e4;
        }
    }

    private static IDynamicInstall b(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(b.f).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e2.getMessage(), (byte) 0);
        }
    }

    private static Bundle c(Context context, String str) throws LoadingException, a {
        try {
            Bundle d2 = d(context, str);
            String string = d2.getString(b.p);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                e.set(new HashMap<String, String>(str, string) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.2

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f10333a;
                    final /* synthetic */ String b;

                    {
                        this.f10333a = str;
                        this.b = string;
                        put(str, string);
                    }
                });
                Logger.i(f10331a, "Query remote version by module name:" + str + " success.");
                return d2;
            }
            Logger.w(f10331a, "The loader_path:" + string + " in query bundle is not available,change the module version to:-100");
            d2.putInt(b.j, -100);
            return d2;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a("failed to Query remote version.", (byte) 0);
        }
    }

    private static Bundle d(Context context, String str) throws LoadingException, a {
        byte b2 = 0;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new a("Query remote version failed: null contentResolver.", b2);
            }
            Bundle call = contentResolver.call(Uri.parse(b.f10350a), str, (String) null, (Bundle) null);
            if (call == null) {
                Logger.w(f10331a, "Failed to get bundle info:null.");
                throw new a("Query remote version failed: null bundle info.", b2);
            }
            int i2 = call.getInt(b.g);
            String string = call.getString(b.p);
            String str2 = f10331a;
            Logger.i(str2, "bundle info: errorCode:" + i2 + ", moduleVersion:" + call.getInt(b.j) + ", modulePath:" + call.getString(b.l) + ", loader_version:" + call.getInt(b.o) + ", loaderPath:" + string + ", armeabiType:" + call.getInt(b.f10351q));
            if (i2 == 0) {
                return call;
            }
            Logger.w(str2, "Failed to get " + str + " bundle info, errcode:" + i2);
            throw new LoadingException("Query " + str + " unavailable, errorCode:" + i2, call, b2);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a("failed to get :" + str + " info.", b2);
        }
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString(b.i, str);
        bundle.putInt(b.k, localVersion);
        return bundle;
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.e(f10331a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            String str2 = "com.huawei.hms.feature.dynamic.descriptors." + str + ".ModuleDescriptor";
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(f10331a, "Cannot find the class of module descriptor for ".concat(String.valueOf(str)));
            return 0;
        } catch (Exception e2) {
            Logger.w(f10331a, "Get local module info failed.", e2);
            return 0;
        }
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.w(f10331a, "Get remote module info for " + str + " failed.", e3);
        }
        synchronized (DynamicModule.class) {
            ThreadLocal<HashMap<String, Boolean>> threadLocal = d;
            if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                Bundle b2 = b(context, str);
                if (b2.getInt(b.j) > 0) {
                    return b2;
                }
            }
            if (threadLocal.get().get(str).booleanValue()) {
                try {
                    return c(context, str);
                } catch (a e4) {
                    Logger.w(f10331a, "Query remote module info in HMS failed.", e4);
                }
            }
            return new Bundle();
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        byte b2 = 0;
        try {
            Bundle c2 = c(context, str);
            if (c2 != null && !c2.isEmpty()) {
                return c2.getInt(b.j);
            }
            Logger.w(f10331a, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.", b2);
        } catch (a e2) {
            Logger.w(f10331a, "Query remote module:" + str + " exception:" + e2);
            return 0;
        }
    }

    public static void install(Context context) {
        if (context == null) {
            Logger.e(f10331a, "The input context is null.");
            return;
        }
        byte b2 = 0;
        try {
            IDynamicInstall a2 = a(context);
            if (a2 == null) {
                throw new LoadingException("Get dynamicInstaller failed.", b2);
            }
            Bundle install = a2.install(ObjectWrapper.wrap(context), new Bundle());
            if (install == null) {
                throw new LoadingException("Get install info failed: moduleBundle is null.", b2);
            }
            c.a().a(install);
            Logger.i(f10331a, "Install module success.");
        } catch (RemoteException | LoadingException | NullPointerException e2) {
            if (h == 2 || getLocalVersion(context, b.d) <= 0) {
                Logger.w(f10331a, "Install module failed.", e2);
                return;
            }
            String str = f10331a;
            Logger.i(str, "Ready to use local loader-fallback to retry:");
            try {
                Bundle install2 = b(context).install(ObjectWrapper.wrap(context), new Bundle());
                if (install2 == null) {
                    throw new LoadingException("Retry: get install info failed: moduleBundle is null.", b2);
                }
                c.a().a(install2);
                Logger.i(str, "Retry install module with local loader-fallback success.");
            } catch (RemoteException | LoadingException | NullPointerException e3) {
                Logger.w(f10331a, "Retry failed with local loader-fallback.", e3);
            }
        }
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        byte b2 = 0;
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException("Null param, please check it.", b2);
        }
        try {
            try {
                Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
                if (moduleInfo.getInt(b.j) <= 0) {
                    if (moduleInfo.getInt(b.k) <= 0) {
                        throw new LoadingException("Query remote version and local version failed.", b2);
                    }
                    Logger.i(f10331a, "Remote version is invalid, use local context.");
                    return new DynamicModule(context.getApplicationContext());
                }
                try {
                    return a(context, str, moduleInfo);
                } catch (LoadingException e2) {
                    Logger.w(f10331a, "Failed to load remote module.", e2);
                    if (getLocalVersion(context, str) <= 0) {
                        return null;
                    }
                    Logger.d(f10331a, "Local module version is valid, use local fallback.");
                    return new DynamicModule(context.getApplicationContext());
                }
            } catch (Exception e3) {
                Logger.e(f10331a, "Other exception:".concat(String.valueOf(e3)));
                throw new LoadingException("Load failed.", b2);
            }
        } catch (LoadingException e4) {
            throw e4;
        }
    }

    public final Context getModuleContext() {
        return this.g;
    }
}
