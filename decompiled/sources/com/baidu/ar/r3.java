package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.message.ARPMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class r3 extends m0 {
    public List<WeakReference<s3>> c;
    public i8 d;
    public boolean e;

    public r3(Context context) {
        super(context);
        this.c = Collections.synchronizedList(new ArrayList());
        this.e = false;
        a();
        i8 i8Var = new i8();
        this.d = i8Var;
        i8Var.a(context);
        a(this.d);
    }

    public void a(int i, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i, hashMap);
    }

    public void a(boolean z) {
        this.e = z;
    }

    public final synchronized boolean a(int i, int i2, HashMap<String, Object> hashMap) {
        if (i == 1001) {
            hashMap.put("audio_status", "audio_play");
            return true;
        }
        if (i == 1003) {
            hashMap.put("audio_status", "audio_pause");
            return true;
        }
        if (i == 1005) {
            hashMap.put("audio_status", "audio_resume");
            return true;
        }
        if (i == 1007) {
            hashMap.put("audio_status", "audio_stop");
            return true;
        }
        if (i != 1012) {
            return false;
        }
        hashMap.put("audio_status", "audio_reset");
        return true;
    }

    public synchronized boolean a(s3 s3Var) {
        List<WeakReference<s3>> list = this.c;
        if (list == null) {
            return false;
        }
        for (WeakReference<s3> weakReference : list) {
            if (weakReference.get() != null && weakReference.get().equals(s3Var)) {
                return false;
            }
        }
        h.a("EngineMsgBridge", "addEngineMsgListener engineMsgListener = " + s3Var.hashCode());
        return this.c.add(new WeakReference<>(s3Var));
    }

    public void b(String str) {
        ARPMessage.getInstance().sendLuaScriptToEngine(str);
    }

    public synchronized boolean b(s3 s3Var) {
        List<WeakReference<s3>> list = this.c;
        if (list == null) {
            return false;
        }
        for (WeakReference<s3> weakReference : list) {
            if (weakReference.get() != null && weakReference.get().equals(s3Var)) {
                h.a("EngineMsgBridge", "removeEngineMsgListener engineMsgListener = " + s3Var.hashCode());
                boolean remove = this.c.remove(weakReference);
                weakReference.clear();
                return remove;
            }
        }
        return false;
    }

    public synchronized void c() {
        i8 i8Var = this.d;
        if (i8Var != null) {
            i8Var.b();
            this.d = null;
        }
        List<WeakReference<s3>> list = this.c;
        if (list != null) {
            Iterator<WeakReference<s3>> it = list.iterator();
            while (it.hasNext()) {
                it.next().clear();
            }
            this.c.clear();
            this.c = null;
        }
    }

    public i8 d() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // com.baidu.ar.m0, com.baidu.ar.arplay.core.message.ARPMessage.MessageHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void handleMessage(int r5, int r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "handleMessage aMessageType = "
            monitor-enter(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r0 = r1.append(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = " && aMessageID = "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = "EngineMsgBridge"
            com.baidu.ar.h.a(r1, r0)     // Catch: java.lang.Throwable -> L80
            boolean r0 = r4.e     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L2d
            boolean r0 = r4.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L2a
            goto L2d
        L2a:
            r5 = 1901(0x76d, float:2.664E-42)
            goto L34
        L2d:
            r0 = 8200(0x2008, float:1.149E-41)
            if (r5 == r0) goto L34
            super.handleMessage(r5, r6, r7)     // Catch: java.lang.Throwable -> L80
        L34:
            java.util.List<java.lang.ref.WeakReference<com.baidu.ar.s3>> r0 = r4.c     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L3a
            monitor-exit(r4)
            return
        L3a:
            r0 = 0
        L3b:
            java.util.List<java.lang.ref.WeakReference<com.baidu.ar.s3>> r1 = r4.c     // Catch: java.lang.Throwable -> L80
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L80
            if (r0 >= r1) goto L7e
            java.util.List<java.lang.ref.WeakReference<com.baidu.ar.s3>> r1 = r4.c     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L4e
            goto L7b
        L4e:
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L80
            com.baidu.ar.s3 r1 = (com.baidu.ar.s3) r1     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L7b
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L5d
            goto L7b
        L5d:
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L80
        L65:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L80
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L80
            if (r5 != r3) goto L65
            r1.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L80
            goto L65
        L7b:
            int r0 = r0 + 1
            goto L3b
        L7e:
            monitor-exit(r4)
            return
        L80:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L80
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.r3.handleMessage(int, int, java.util.HashMap):void");
    }
}
