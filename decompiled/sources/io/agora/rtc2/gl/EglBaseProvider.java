package io.agora.rtc2.gl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.EglBaseFactory;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;

/* loaded from: classes6.dex */
public class EglBaseProvider {
    private static final String RELEASE_MESSAGE_TEMPLATE = "EglBaseProvider released %s unavailable";
    private static final String TAG = "EglBaseProvider";
    private static volatile EglBaseProvider instance;
    private volatile boolean initialized = false;
    private EglBase localEglBase;
    private EglBase remoteEglBase;
    private EglBase rootEglBase;

    public static native void nativeExtensionNativeStartFunc(long j);

    public static native void nativeExtensionNativeStopFunc(long j);

    public static EglBaseProvider instance() {
        EglBaseProvider eglBaseProvider;
        synchronized (EglBaseProvider.class) {
            if (instance == null) {
                instance = new EglBaseProvider();
            }
            eglBaseProvider = instance;
        }
        return eglBaseProvider;
    }

    public static void destroy() {
        synchronized (EglBaseProvider.class) {
            if (instance != null) {
                instance.release();
                instance = null;
            }
        }
    }

    public EglBase getRootEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRootEglBase");
            initialize();
            eglBase = instance.rootEglBase;
        }
        return eglBase;
    }

    public EglBase getLocalEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getLocalEglBase");
            initialize();
            eglBase = instance.localEglBase;
        }
        return eglBase;
    }

    public EglBase.Context getLocalEglBaseContext() {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            checkReleased("getLocalEglBaseContext");
            initialize();
            eglBaseContext = instance.localEglBase.getEglBaseContext();
        }
        return eglBaseContext;
    }

    public EglBase getRemoteEglBase() {
        EglBase eglBase;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRemoteEglBase");
            initialize();
            eglBase = instance.remoteEglBase;
        }
        return eglBase;
    }

    public EglBase.Context getRemoteEglBaseContext() {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            checkReleased("getRemoteEglBaseContext");
            initialize();
            eglBaseContext = instance.remoteEglBase.getEglBaseContext();
        }
        return eglBaseContext;
    }

    public static EglBase.Context getCurrentEglContext() {
        if (EglBase14.isEGL14SupportedImpl()) {
            EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (Objects.equals(eglGetCurrentContext, EGL14.EGL_NO_CONTEXT)) {
                return null;
            }
            return new EglBase14.Context(eglGetCurrentContext);
        }
        EGL10 egl10 = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        if (egl10 == null || !Objects.equals(egl10.eglGetCurrentContext(), EGL10.EGL_NO_CONTEXT)) {
            return null;
        }
        return new EglBase10.Context(egl10.eglGetCurrentContext());
    }

    public static boolean isEgl14BaseContext(EglBase.Context context) {
        return context instanceof EglBase14.Context;
    }

    public static boolean isSameEglContext(EglBase.Context context, EglBase.Context context2) {
        return Objects.equals(context, context2);
    }

    public void replaceRootBase(EglBase.Context context) {
        synchronized (EglBaseProvider.class) {
            release();
            EglBase create = EglBaseFactory.create(context, EglBase.CONFIG_PLAIN);
            this.rootEglBase = create;
            this.localEglBase = EglBaseFactory.create(create.getEglBaseContext());
            this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
            this.initialized = true;
        }
    }

    public boolean replaceRemoteEglContext(Object obj) {
        EglBase.Context eglBaseContext;
        synchronized (EglBaseProvider.class) {
            checkReleased("replaceRemoteEglContext");
            initialize();
            if (obj != null) {
                if (!checkEglContext(obj)) {
                    return false;
                }
                eglBaseContext = createEglBaseContext(obj);
                if (eglBaseContext == null) {
                    return false;
                }
                Logging.i(TAG, "replaceRemoteEglContext: " + eglBaseContext + " eglBase Context: " + this.rootEglBase.getEglBaseContext());
            } else {
                eglBaseContext = this.rootEglBase.getEglBaseContext();
            }
            releaseRemoteEglbase();
            this.remoteEglBase = EglBaseFactory.create(eglBaseContext);
            return true;
        }
    }

    public void destroyRemoteEglContext() {
        synchronized (EglBaseProvider.class) {
            checkReleased("destroyRemoteEglContext");
            releaseRemoteEglbase();
            this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
        }
    }

    private boolean checkEglContext(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof EglBase10.Context) {
            return !((EglBase10.Context) obj).getEglContext().equals(EGL10.EGL_NO_CONTEXT);
        }
        if (obj instanceof EglBase14.Context) {
            return !((EglBase14.Context) obj).getEglContext().equals(EGL14.EGL_NO_CONTEXT);
        }
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            return !((javax.microedition.khronos.egl.EGLContext) obj).equals(EGL10.EGL_NO_CONTEXT);
        }
        if (obj instanceof EGLContext) {
            return !((EGLContext) obj).equals(EGL14.EGL_NO_CONTEXT);
        }
        return false;
    }

    private EglBase.Context createEglBaseContext(Object obj) {
        if (obj instanceof EglBase.Context) {
            return (EglBase.Context) obj;
        }
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            return new EglBase10.Context((javax.microedition.khronos.egl.EGLContext) obj);
        }
        if (obj instanceof EGLContext) {
            EglBase14.Context context = new EglBase14.Context((EGLContext) obj);
            Logging.i(TAG, "createRemoteEglContext: " + context.getEglContext());
            return context;
        }
        Logging.e(TAG, "illegal egl context!");
        return null;
    }

    public static void acquireEglBaseReadLock() {
        EglBase.rwlock.readLock().lock();
    }

    public static void releaseEglBaseReadLock() {
        EglBase.rwlock.readLock().unlock();
    }

    public static void startWithEglBaseLock(long j) {
        synchronized (EglBase.lock) {
            nativeExtensionNativeStartFunc(j);
        }
    }

    public static void stopWithEglBaseLock(long j) {
        synchronized (EglBase.lock) {
            nativeExtensionNativeStopFunc(j);
        }
    }

    private void release() {
        synchronized (EglBaseProvider.class) {
            EglBase eglBase = this.remoteEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            EglBase eglBase2 = this.localEglBase;
            if (eglBase2 != null) {
                eglBase2.release();
            }
            EglBase eglBase3 = this.rootEglBase;
            if (eglBase3 != null) {
                eglBase3.release();
            }
            this.initialized = false;
        }
    }

    private void releaseRemoteEglbase() {
        synchronized (EglBaseProvider.class) {
            EglBase eglBase = this.remoteEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
        }
    }

    private EglBaseProvider() {
    }

    private void initialize() {
        if (this.initialized) {
            return;
        }
        EglBase create = EglBaseFactory.create();
        this.rootEglBase = create;
        this.localEglBase = EglBaseFactory.create(create.getEglBaseContext());
        this.remoteEglBase = EglBaseFactory.create(this.rootEglBase.getEglBaseContext());
        this.initialized = true;
    }

    private void checkReleased(String str) {
        if (instance == null) {
            throw new IllegalStateException(String.format(RELEASE_MESSAGE_TEMPLATE, str));
        }
    }
}
