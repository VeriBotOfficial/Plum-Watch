package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils;

import android.os.Looper;
import android.os.MessageQueue;
import android.widget.Toast;
import com.qumeng.overseas.advlib.__remote__.framework.receiver.b;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.g;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f13059a;

    class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f13060a;

        a(Object obj) {
            this.f13060a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("enqueueToast".equals(method.getName()) || "enqueueToastEx".equals(method.getName())) {
                objArr[0] = "android";
            }
            return method.invoke(this.f13060a, objArr);
        }
    }

    class b implements g.b {
        b() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.g.b
        public void onCrash(String str, String str2) {
            StringBuilder sb = new StringBuilder("log path: ");
            if (str == null) {
                str = "(null)";
            }
            StringBuilder append = sb.append(str).append(", emergency: ");
            if (str2 == null) {
                str2 = "(null)";
            }
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, append.append(str2).toString(), new Object[0]);
        }
    }

    class c implements b.a {
        c() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.receiver.b.a
        public boolean onWifiChanged(boolean z) {
            n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "onWifiChanged=" + z, new Object[0]);
            if (z) {
                d.c();
            }
            return z;
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.d$d, reason: collision with other inner class name */
    class C0826d implements MessageQueue.IdleHandler {
        C0826d() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            for (File file : com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.d.b()) {
                d.b(file.getAbsolutePath(), null);
            }
            return false;
        }
    }

    public static void b() {
        try {
            Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Object newProxyInstance = Proxy.newProxyInstance(Toast.class.getClassLoader(), new Class[]{Class.forName("android.app.INotificationManager")}, new a(invoke));
            Field declaredField = Toast.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            declaredField.set(null, newProxyInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        Looper.myQueue().addIdleHandler(new C0826d());
    }

    public static void a(int i) {
        n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "xcrash init", new Object[0]);
        com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.g.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(), new g.c().setAppVersion("1.049").setJavaLogCountMax(6).setDefaultHandler(i).setJavaCallback(new b()).setPlaceholderCountMax(3).setLogFileMaintainDelayMs(5000));
        n.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.f.f13084a, "xcrash end", new Object[0]);
        if (f13059a == null) {
            c cVar = new c();
            f13059a = cVar;
            com.qumeng.overseas.advlib.__remote__.framework.receiver.b.a(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2) {
        try {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.e.a(str, str2));
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.d.a(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
