package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.sdk.c0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class b0 implements Handler.Callback {
    public static final b0 c = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10126a;
    public final Map<y, a> b = new ConcurrentHashMap(5, 0.75f, 1);

    public static class b implements i0 {

        /* renamed from: a, reason: collision with root package name */
        public z0<?> f10129a;

        public b(z0<?> z0Var) {
            this.f10129a = z0Var;
        }
    }

    public b0() {
        HandlerThread handlerThread = new HandlerThread("HonorApiManager");
        handlerThread.start();
        this.f10126a = new Handler(handlerThread.getLooper(), this);
    }

    public <TResult> v0<TResult> a(z0<TResult> z0Var) {
        m0<TResult> m0Var = new m0<>();
        z0Var.f10169a = m0Var;
        Log.i("HonorApiManager", "sendRequest start");
        Handler handler = this.f10126a;
        handler.sendMessage(handler.obtainMessage(1, z0Var));
        return m0Var.f10145a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar;
        boolean bindService;
        String str;
        String str2;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            z0 z0Var = (z0) message.obj;
            y yVar = z0Var.d;
            if (yVar != null && this.b.containsKey(yVar) && (aVar = this.b.get(yVar)) != null) {
                synchronized (aVar) {
                    String str3 = "resolveResult apiCall " + z0Var.b;
                    f.a(b0.this.f10126a);
                    aVar.b.remove(z0Var);
                    if (aVar.f10127a.peek() == null || aVar.b.peek() == null) {
                        synchronized (aVar) {
                            f.a(b0.this.f10126a);
                            ((e0) aVar.c).a();
                        }
                    }
                }
            }
            return true;
        }
        z0<?> z0Var2 = (z0) message.obj;
        y yVar2 = z0Var2.d;
        a aVar2 = this.b.get(yVar2);
        if (aVar2 == null) {
            Log.i("HonorApiManager", "connect and send request, create new connection manager.");
            aVar2 = new a(yVar2);
            this.b.put(yVar2, aVar2);
        }
        synchronized (aVar2) {
            String str4 = "sendRequest " + z0Var2.b;
            f.a(b0.this.f10126a);
            l lVar = aVar2.e;
            if (lVar != null && lVar.f10143a != 0) {
                z0Var2.b(lVar.a(), null);
            } else if (((e0) aVar2.c).f10134a.get() == 3) {
                aVar2.b.add(z0Var2);
                aVar2.a(z0Var2);
            } else {
                aVar2.f10127a.add(z0Var2);
                synchronized (aVar2) {
                    f.a(b0.this.f10126a);
                    if (((e0) aVar2.c).f10134a.get() == 3) {
                        str = "HonorApiManager";
                        str2 = "client is connected";
                    } else if (((e0) aVar2.c).f10134a.get() == 5) {
                        str = "HonorApiManager";
                        str2 = "client is isConnecting";
                    } else {
                        e0 e0Var = (e0) aVar2.c;
                        e0Var.getClass();
                        Log.i("PushConnectionClient", " ==== PUSHSDK VERSION 80012307 ====");
                        if (e0Var.f10134a.compareAndSet(0, 5)) {
                            s sVar = s.c;
                            Context a2 = sVar.a();
                            com.hihonor.push.sdk.a b2 = f.b(a2);
                            int a3 = f.a(a2, b2);
                            l lVar2 = l.SUCCESS;
                            if (a3 == 0) {
                                Log.i("PushConnectionClient", "enter bindCoreService.");
                                f0 f0Var = new f0(b2);
                                e0Var.d = f0Var;
                                f0Var.c = new d0(e0Var);
                                try {
                                    if ((TextUtils.isEmpty(b2.c) && TextUtils.isEmpty(null)) || TextUtils.isEmpty(b2.f10123a)) {
                                        Log.e("AIDLSrvConnection", "bind core is null : " + f0Var.b);
                                        f0Var.a(8002004);
                                    } else {
                                        Intent intent = new Intent();
                                        com.hihonor.push.sdk.a aVar3 = f0Var.b;
                                        String str5 = aVar3.f10123a;
                                        String str6 = aVar3.c;
                                        if (TextUtils.isEmpty(str6)) {
                                            intent.setAction(null);
                                            intent.setPackage(str5);
                                        } else {
                                            intent.setComponent(new ComponentName(str5, str6));
                                        }
                                        Context a4 = sVar.a();
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            Looper myLooper = Looper.myLooper();
                                            f0Var.a(myLooper);
                                            bindService = a4.bindService(intent, 1, new k0(new Handler(myLooper)), f0Var);
                                        } else {
                                            f0Var.a(Looper.getMainLooper());
                                            bindService = a4.bindService(intent, f0Var, 1);
                                        }
                                        if (!bindService) {
                                            Log.e("AIDLSrvConnection", "bind core service fail");
                                            f0Var.a();
                                            f0Var.a(8002001);
                                        }
                                    }
                                } catch (Exception e) {
                                    Log.e("AIDLSrvConnection", "bindCoreService error: " + e);
                                }
                            } else {
                                e0Var.a(a3);
                            }
                        }
                    }
                    Log.i(str, str2);
                }
            }
        }
        return true;
    }

    public class a implements c0.a {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<z0<?>> f10127a = new LinkedList();
        public final Queue<z0<?>> b = new LinkedList();
        public final c0 c = new e0(this);
        public final y d;
        public l e;

        /* renamed from: com.hihonor.push.sdk.b0$a$a, reason: collision with other inner class name */
        public class RunnableC0601a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f10128a;

            public RunnableC0601a(int i) {
                this.f10128a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(l.A.get(this.f10128a, l.ERROR_UNKNOWN));
            }
        }

        public a(y yVar) {
            this.d = yVar;
        }

        public final synchronized void a() {
            Log.i("HonorApiManager", "onConnectedSuccess");
            f.a(b0.this.f10126a);
            for (z0<?> z0Var : this.f10127a) {
                this.b.add(z0Var);
                a(z0Var);
            }
            this.f10127a.clear();
        }

        public final synchronized void a(l lVar) {
            Log.i("HonorApiManager", "onConnectionFailed");
            f.a(b0.this.f10126a);
            Iterator<z0<?>> it = this.f10127a.iterator();
            while (it.hasNext()) {
                it.next().b(lVar.a(), null);
            }
            this.f10127a.clear();
            Iterator<z0<?>> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().b(lVar.a(), null);
            }
            this.b.clear();
            synchronized (this) {
                f.a(b0.this.f10126a);
                e0 e0Var = (e0) this.c;
                e0Var.getClass();
                Log.i("PushConnectionClient", "enter disconnect");
                e0Var.b = null;
                e0Var.a();
            }
            if (this.e == null) {
                this.e = lVar;
                b0.this.b.remove(this.d);
            }
        }

        public void a(int i) {
            if (Looper.myLooper() == b0.this.f10126a.getLooper()) {
                a(l.A.get(i, l.ERROR_UNKNOWN));
            } else {
                b0.this.f10126a.post(new RunnableC0601a(i));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:7:0x0015, B:9:0x001f, B:11:0x0029, B:13:0x002f, B:16:0x0036, B:18:0x0050, B:19:0x0069, B:22:0x006c, B:23:0x006d, B:26:0x008a, B:28:0x0091, B:29:0x00b8, B:31:0x00bc, B:36:0x009d, B:37:0x00b3, B:39:0x00a1, B:42:0x00c2, B:43:0x00c3, B:46:0x003c, B:21:0x006a), top: B:3:0x0007, inners: #0, #2, #3 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void a(com.hihonor.push.sdk.z0<?> r11) {
            /*
                r10 = this;
                java.lang.String r0 = "transport remote error. "
                java.lang.String r1 = "start transport parse. "
                java.lang.String r2 = "In newResponseInstance, instancing exception."
                monitor-enter(r10)
                com.hihonor.push.sdk.c0 r3 = r10.c     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.b0$b r4 = new com.hihonor.push.sdk.b0$b     // Catch: java.lang.Throwable -> Lc4
                r4.<init>(r11)     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.h0 r5 = new com.hihonor.push.sdk.h0     // Catch: java.lang.Throwable -> Lc4
                r11.getClass()     // Catch: java.lang.Throwable -> Lc4
                r6 = 0
                r7 = 0
                java.lang.Class r8 = r11.getClass()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                java.lang.reflect.Type r8 = r8.getGenericSuperclass()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                if (r8 == 0) goto L2c
                java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                java.lang.reflect.Type[] r8 = r8.getActualTypeArguments()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                r8 = r8[r6]     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                if (r8 == 0) goto L2c
                java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                goto L2d
            L2c:
                r8 = r7
            L2d:
                if (r8 == 0) goto L50
                boolean r9 = r8.isPrimitive()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                if (r9 == 0) goto L36
                goto L50
            L36:
                java.lang.Object r7 = r8.newInstance()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lc4
                goto L50
            L3b:
                r8 = move-exception
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
                r9.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r2 = r8.getMessage()     // Catch: java.lang.Throwable -> Lc4
                java.lang.StringBuilder r2 = r9.append(r2)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.j.a(r2)     // Catch: java.lang.Throwable -> Lc4
            L50:
                r5.<init>(r7, r4)     // Catch: java.lang.Throwable -> Lc4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
                r2.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r1 = r11.b     // Catch: java.lang.Throwable -> Lc4
                java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r2 = "IpcTransport"
                android.util.Log.i(r2, r1)     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.e0 r3 = (com.hihonor.push.sdk.e0) r3     // Catch: java.lang.Throwable -> Lc4
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.e r1 = r3.c     // Catch: java.lang.Throwable -> Lc1
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r2 = r11.b     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.common.RequestHeader r3 = r11.e     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.c r11 = r11.c     // Catch: java.lang.Throwable -> Lc4
                android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
                r4.<init>()     // Catch: java.lang.Throwable -> Lc4
                android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
                r7.<init>()     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.f.a(r3, r4)     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.f.a(r11, r7)     // Catch: java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.b r11 = new com.hihonor.push.sdk.b     // Catch: java.lang.Throwable -> Lc4
                r11.<init>(r2, r4, r7)     // Catch: java.lang.Throwable -> Lc4
                if (r1 == 0) goto L99
                r1.a(r11, r5)     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> Lc4
                java.lang.String r11 = "IpcTransport"
                java.lang.String r1 = "end transport parse."
                android.util.Log.i(r11, r1)     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> Lc4
                com.hihonor.push.sdk.l r11 = com.hihonor.push.sdk.l.SUCCESS     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> Lc4
                goto Lb8
            L97:
                r11 = move-exception
                goto La1
            L99:
                java.lang.String r11 = "IpcTransport"
                java.lang.String r1 = "transport invoke is null."
                android.util.Log.i(r11, r1)     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> Lc4
                goto Lb3
            La1:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
                r1.<init>(r0)     // Catch: java.lang.Throwable -> Lc4
                java.lang.StringBuilder r11 = r1.append(r11)     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lc4
                java.lang.String r0 = "IpcTransport"
                android.util.Log.e(r0, r11)     // Catch: java.lang.Throwable -> Lc4
            Lb3:
                com.hihonor.push.sdk.l r11 = com.hihonor.push.sdk.l.ERROR_SERVICE_DISCONNECTED     // Catch: java.lang.Throwable -> Lc4
                r6 = 8002002(0x7a19d2, float:1.1213193E-38)
            Lb8:
                com.hihonor.push.sdk.l r11 = com.hihonor.push.sdk.l.SUCCESS     // Catch: java.lang.Throwable -> Lc4
                if (r6 == 0) goto Lbf
                r10.a(r6)     // Catch: java.lang.Throwable -> Lc4
            Lbf:
                monitor-exit(r10)
                return
            Lc1:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc4
                throw r11     // Catch: java.lang.Throwable -> Lc4
            Lc4:
                r11 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lc4
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hihonor.push.sdk.b0.a.a(com.hihonor.push.sdk.z0):void");
        }
    }
}
