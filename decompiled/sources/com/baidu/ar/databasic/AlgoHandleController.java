package com.baidu.ar.databasic;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class AlgoHandleController {

    /* renamed from: a, reason: collision with root package name */
    public final List<Long> f6877a = Collections.synchronizedList(new ArrayList());
    public boolean b = true;
    public int c = 0;
    public long d = 0;
    public HandlerThread e;
    public e f;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IARRenderer f6878a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        public a(AlgoHandleController algoHandleController, IARRenderer iARRenderer, long j, String str) {
            this.f6878a = iARRenderer;
            this.b = j;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IARRenderer iARRenderer = this.f6878a;
            if (iARRenderer != null) {
                iARRenderer.setAlgoHandleData(this.b, this.c);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.a();
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6880a;

        public c(long j) {
            this.f6880a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.f6877a.add(Long.valueOf(this.f6880a));
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6881a;

        public d(long j) {
            this.f6881a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlgoHandleController.this.a(this.f6881a);
        }
    }

    public static final class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6882a;

        public e(Looper looper) {
            super(looper);
            this.f6882a = false;
        }

        public void a(int i, Runnable runnable) {
            if (this.f6882a) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = runnable;
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1004) {
                this.f6882a = true;
            }
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public AlgoHandleController() {
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("HandleHandlerThread");
            this.e = handlerThread;
            handlerThread.start();
        }
        if (this.f == null) {
            this.f = new e(this.e.getLooper());
        }
    }

    public final int a(long j) {
        b(j);
        return AlgoHandleAdapter.destroyHandle(j);
    }

    public final void a() {
        this.b = false;
        if (this.f6877a.size() > 0) {
            try {
                Iterator<Long> it = this.f6877a.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    if (longValue <= 0 || longValue != this.d) {
                        AlgoHandleAdapter.destroyHandle(longValue);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                h.b("release Exception:" + e2.getMessage());
            }
        }
        if (this.f != null) {
            this.f = null;
        }
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.e = null;
        }
    }

    public final void a(int i) {
        if (i > 5) {
            h.c("type:" + this.c + " destroyIgnoreHandles current size:" + i);
            for (int i2 = 0; i2 < i; i2++) {
                long longValue = this.f6877a.get(0).longValue();
                this.f6877a.remove(0);
                AlgoHandleAdapter.destroyHandle(longValue);
            }
        }
    }

    public final void b(long j) {
        try {
            if (this.f6877a.contains(Long.valueOf(j))) {
                int indexOf = this.f6877a.indexOf(Long.valueOf(j));
                if (indexOf < 0) {
                    h.b("removeHandle cant find:" + j);
                    return;
                }
                this.f6877a.remove(indexOf);
                if (indexOf >= 1) {
                    a(indexOf);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            h.b("removeHandle Exception:" + e2.getMessage());
        }
    }

    public long createHandle() {
        e eVar;
        if (!this.b) {
            return 0L;
        }
        long createHandle = AlgoHandleAdapter.createHandle();
        HandlerThread handlerThread = this.e;
        if (handlerThread != null && handlerThread.isAlive() && (eVar = this.f) != null) {
            eVar.a(1001, new c(createHandle));
        }
        return createHandle;
    }

    public int destroyHandle(long j) {
        e eVar;
        HandlerThread handlerThread = this.e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f) == null) {
            return -1;
        }
        eVar.a(1003, new d(j));
        return 0;
    }

    public byte[] getHandleMaskData(long j) {
        return AlgoHandleAdapter.getHandleMaskData(j);
    }

    public int getHandleReserveData(long j, ReserveHandleData reserveHandleData) {
        return AlgoHandleAdapter.getHandleReserveData(j, reserveHandleData);
    }

    public int getHandleType(long j) {
        return AlgoHandleAdapter.getHandleType(j);
    }

    public int increaseHandleReference(long j) {
        return AlgoHandleAdapter.increaseHandleReference(j);
    }

    public void release() {
        e eVar;
        this.b = false;
        HandlerThread handlerThread = this.e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f) == null) {
            return;
        }
        eVar.a(1004, new b());
    }

    public void sendHandleToRenderer(long j, IARRenderer iARRenderer, String str) {
        e eVar;
        HandlerThread handlerThread = this.e;
        if (handlerThread == null || !handlerThread.isAlive() || (eVar = this.f) == null) {
            return;
        }
        eVar.a(1002, new a(this, iARRenderer, j, str));
    }

    public int setHandleFaceHandle(long j, long j2) {
        return AlgoHandleAdapter.setHandleFaceHandle(j, j2);
    }

    public int setHandleInput(long j, int i, long j2, int i2, int i3, int i4, boolean z, int i5, boolean z2, ByteBuffer byteBuffer) {
        this.c = i;
        return AlgoHandleAdapter.setHandleInput(j, i, j2, i2, i3, i4, z, i5, z2, byteBuffer);
    }

    public int setHandleMaskThreshold(long j, float f) {
        return AlgoHandleAdapter.setHandleMaskThreshold(j, f);
    }

    public void setUsingHandle(long j) {
        this.d = j;
    }
}
