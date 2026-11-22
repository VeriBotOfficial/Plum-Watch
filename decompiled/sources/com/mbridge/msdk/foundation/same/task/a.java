package com.mbridge.msdk.foundation.same.task;

/* compiled from: CommonTask.java */
/* loaded from: classes17.dex */
public abstract class a implements Runnable {

    /* renamed from: id, reason: collision with root package name */
    public static long f11631id;
    public InterfaceC0685a mListener;
    public b mState = b.READY;

    /* compiled from: CommonTask.java */
    /* renamed from: com.mbridge.msdk.foundation.same.task.a$a, reason: collision with other inner class name */
    public interface InterfaceC0685a {
        void a(b bVar);
    }

    /* compiled from: CommonTask.java */
    public enum b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public a() {
        f11631id++;
    }

    private void setState(b bVar) {
        this.mState = bVar;
        InterfaceC0685a interfaceC0685a = this.mListener;
        if (interfaceC0685a != null) {
            interfaceC0685a.a(bVar);
        }
    }

    public final void cancel() {
        b bVar = this.mState;
        b bVar2 = b.CANCEL;
        if (bVar != bVar2) {
            setState(bVar2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return f11631id;
    }

    public b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == b.READY) {
                setState(b.RUNNING);
                runTask();
                setState(b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(InterfaceC0685a interfaceC0685a) {
        this.mListener = interfaceC0685a;
    }

    public final void setPause(boolean z) {
        b bVar = this.mState;
        b bVar2 = b.PAUSE;
        if (bVar == bVar2 || bVar == b.CANCEL || bVar == b.FINISH) {
            return;
        }
        if (z) {
            setState(bVar2);
        } else {
            setState(b.RUNNING);
        }
        pauseTask(z);
    }
}
