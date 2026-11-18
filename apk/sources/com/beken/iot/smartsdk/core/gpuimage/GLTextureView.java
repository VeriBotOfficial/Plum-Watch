package com.beken.iot.smartsdk.core.gpuimage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.heytap.mcssdk.constant.MessageConstant;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes15.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "GLTextureView";
    private static final GLThreadManager glThreadManager = new GLThreadManager();
    private int debugFlags;
    private boolean detached;
    private EGLConfigChooser eglConfigChooser;
    private int eglContextClientVersion;
    private EGLContextFactory eglContextFactory;
    private EGLWindowSurfaceFactory eglWindowSurfaceFactory;
    private GLThread glThread;
    private GLWrapper glWrapper;
    private final WeakReference<GLTextureView> mThisWeakRef;
    private boolean preserveEGLContextOnPause;
    private Renderer renderer;
    private List<TextureView.SurfaceTextureListener> surfaceTextureListeners;

    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface GLWrapper {
        GL wrap(GL gl);
    }

    public interface Renderer {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int r2, int r3);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);
    }

    public GLTextureView(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference<>(this);
        this.surfaceTextureListeners = new ArrayList();
        init();
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference<>(this);
        this.surfaceTextureListeners = new ArrayList();
        init();
    }

    protected void finalize() throws Throwable {
        try {
            GLThread gLThread = this.glThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.glWrapper = gLWrapper;
    }

    public void setDebugFlags(int r1) {
        this.debugFlags = r1;
    }

    public int getDebugFlags() {
        return this.debugFlags;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.preserveEGLContextOnPause = z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.preserveEGLContextOnPause;
    }

    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (this.eglConfigChooser == null) {
            this.eglConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.eglContextFactory == null) {
            this.eglContextFactory = new DefaultContextFactory();
        }
        if (this.eglWindowSurfaceFactory == null) {
            this.eglWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.renderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.glThread = gLThread;
        gLThread.start();
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.eglContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.eglWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.eglConfigChooser = eGLConfigChooser;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    public void setEGLConfigChooser(int r10, int r11, int r12, int r13, int r14, int r15) {
        setEGLConfigChooser(new ComponentSizeChooser(r10, r11, r12, r13, r14, r15));
    }

    public void setEGLContextClientVersion(int r1) {
        checkRenderThreadState();
        this.eglContextClientVersion = r1;
    }

    public void setRenderMode(int r2) {
        this.glThread.setRenderMode(r2);
    }

    public int getRenderMode() {
        return this.glThread.getRenderMode();
    }

    public void requestRender() {
        this.glThread.requestRender();
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
        this.glThread.surfaceCreated();
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        this.glThread.surfaceDestroyed();
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int r2, int r3, int r4) {
        this.glThread.onWindowResize(r3, r4);
    }

    public void onPause() {
        this.glThread.onPause();
    }

    public void onResume() {
        this.glThread.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.glThread.queueEvent(runnable);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.detached && this.renderer != null) {
            GLThread gLThread = this.glThread;
            int renderMode = gLThread != null ? gLThread.getRenderMode() : 1;
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.glThread = gLThread2;
            if (renderMode != 1) {
                gLThread2.setRenderMode(renderMode);
            }
            this.glThread.start();
        }
        this.detached = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        GLThread gLThread = this.glThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.detached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        surfaceChanged(getSurfaceTexture(), 0, r4 - r2, r5 - r3);
    }

    public void addSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.surfaceTextureListeners.add(surfaceTextureListener);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int r4, int r5) {
        surfaceCreated(surfaceTexture);
        surfaceChanged(surfaceTexture, 0, r4, r5);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureAvailable(surfaceTexture, r4, r5);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int r4, int r5) {
        surfaceChanged(surfaceTexture, 0, r4, r5);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureSizeChanged(surfaceTexture, r4, r5);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(surfaceTexture);
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        requestRender();
        Iterator<TextureView.SurfaceTextureListener> it = this.surfaceTextureListeners.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    private class DefaultContextFactory implements EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] r0 = {this.EGL_CONTEXT_CLIENT_VERSION, GLTextureView.this.eglContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.eglContextClientVersion == 0) {
                r0 = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, r0);
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }

    private static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e(GLTextureView.TAG, "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    private abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public BaseConfigChooser(int[] r2) {
            this.mConfigSpec = filterConfigSpec(r2);
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] r0 = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, r0)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int r5 = r0[0];
            if (r5 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[r5];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, r5, r0)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigChooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigChooseConfig != null) {
                return eGLConfigChooseConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        private int[] filterConfigSpec(int[] r5) {
            if (GLTextureView.this.eglContextClientVersion != 2) {
                return r5;
            }
            int length = r5.length;
            int[] r1 = new int[length + 2];
            int r2 = length - 1;
            System.arraycopy(r5, 0, r1, 0, r2);
            r1[r2] = 12352;
            r1[length] = 4;
            r1[length + 1] = 12344;
            return r1;
        }
    }

    private class ComponentSizeChooser extends BaseConfigChooser {
        protected int alphaSize;
        protected int blueSize;
        protected int depthSize;
        protected int greenSize;
        protected int redSize;
        protected int stencilSize;
        private int[] value;

        public ComponentSizeChooser(int r17, int r18, int r19, int r20, int r21, int r22) {
            super(new int[]{12324, r17, 12323, r18, 12322, r19, 12321, r20, 12325, r21, 12326, r22, 12344});
            this.value = new int[1];
            this.redSize = r17;
            this.greenSize = r18;
            this.blueSize = r19;
            this.alphaSize = r20;
            this.depthSize = r21;
            this.stencilSize = r22;
        }

        @Override // com.beken.iot.smartsdk.core.gpuimage.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int r9 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int r2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (r9 >= this.depthSize && r2 >= this.stencilSize) {
                    int r10 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int r11 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int r12 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int r3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (r10 == this.redSize && r11 == this.greenSize && r12 == this.blueSize && r3 == this.alphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int r5, int r6) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, r5, this.value) ? this.value[0] : r6;
        }
    }

    private class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    private static class EglHelper {
        EGL10 egl;
        EGLConfig eglConfig;
        EGLContext eglContext;
        EGLDisplay eglDisplay;
        EGLSurface eglSurface;
        private WeakReference<GLTextureView> glTextureViewWeakRef;

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.glTextureViewWeakRef = weakReference;
        }

        public void start() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.egl.eglInitialize(this.eglDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView != null) {
                this.eglConfig = gLTextureView.eglConfigChooser.chooseConfig(this.egl, this.eglDisplay);
                this.eglContext = gLTextureView.eglContextFactory.createContext(this.egl, this.eglDisplay, this.eglConfig);
            } else {
                this.eglConfig = null;
                this.eglContext = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.eglContext = null;
                throwEglException("createContext");
            }
            this.eglSurface = null;
        }

        public boolean createSurface() {
            if (this.egl == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.eglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.eglConfig == null) {
                throw new RuntimeException("eglConfig not initialized");
            }
            destroySurfaceImp();
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView != null) {
                this.eglSurface = gLTextureView.eglWindowSurfaceFactory.createWindowSurface(this.egl, this.eglDisplay, this.eglConfig, gLTextureView.getSurfaceTexture());
            } else {
                this.eglSurface = null;
            }
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.egl.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            EGL10 egl10 = this.egl;
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface2 = this.eglSurface;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.eglContext)) {
                return true;
            }
            logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.egl.eglGetError());
            return false;
        }

        GL createGL() {
            GL gl = this.eglContext.getGL();
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.glWrapper != null) {
                gl = gLTextureView.glWrapper.wrap(gl);
            }
            if ((gLTextureView.debugFlags & 3) != 0) {
                return GLDebugHelper.wrap(gl, (gLTextureView.debugFlags & 1) == 0 ? 0 : 1, (gLTextureView.debugFlags & 2) != 0 ? new LogWriter() : null);
            }
            return gl;
        }

        public int swap() {
            return !this.egl.eglSwapBuffers(this.eglDisplay, this.eglSurface) ? this.egl.eglGetError() : MessageConstant.CommandId.COMMAND_BASE;
        }

        public void destroySurface() {
            destroySurfaceImp();
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            this.egl.eglMakeCurrent(this.eglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
            if (gLTextureView != null) {
                gLTextureView.eglWindowSurfaceFactory.destroySurface(this.egl, this.eglDisplay, this.eglSurface);
            }
            this.eglSurface = null;
        }

        public void finish() {
            if (this.eglContext != null) {
                GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.eglContextFactory.destroyContext(this.egl, this.eglDisplay, this.eglContext);
                }
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay = this.eglDisplay;
            if (eGLDisplay != null) {
                this.egl.eglTerminate(eGLDisplay);
                this.eglDisplay = null;
            }
        }

        private void throwEglException(String str) {
            throwEglException(str, this.egl.eglGetError());
        }

        public static void throwEglException(String str, int r1) {
            throw new RuntimeException(formatEglError(str, r1));
        }

        public static void logEglErrorAsWarning(String str, String str2, int r2) {
            Log.w(str, formatEglError(str2, r2));
        }

        public static String formatEglError(String str, int r2) {
            return str + " failed: " + r2;
        }
    }

    static class GLThread extends Thread {
        private EglHelper eglHelper;
        private boolean exited;
        private WeakReference<GLTextureView> glTextureViewWeakRef;
        private boolean hasSurface;
        private boolean haveEglContext;
        private boolean haveEglSurface;
        private boolean paused;
        private boolean renderComplete;
        private boolean requestPaused;
        private boolean shouldExit;
        private boolean shouldReleaseEglContext;
        private boolean surfaceIsBad;
        private boolean waitingForSurface;
        private ArrayList<Runnable> eventQueue = new ArrayList<>();
        private boolean sizeChanged = true;
        private int width = 0;
        private int height = 0;
        private boolean requestRender = true;
        private int renderMode = 1;

        GLThread(WeakReference<GLTextureView> weakReference) {
            this.glTextureViewWeakRef = weakReference;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } finally {
                GLTextureView.glThreadManager.threadExiting(this);
            }
        }

        private void stopEglSurfaceLocked() {
            if (this.haveEglSurface) {
                this.haveEglSurface = false;
                this.eglHelper.destroySurface();
            }
        }

        private void stopEglContextLocked() {
            if (this.haveEglContext) {
                this.eglHelper.finish();
                this.haveEglContext = false;
                GLTextureView.glThreadManager.releaseEglContextLocked(this);
            }
        }

        private void guardedRun() throws InterruptedException {
            boolean z;
            boolean z2;
            this.eglHelper = new EglHelper(this.glTextureViewWeakRef);
            this.haveEglContext = false;
            this.haveEglSurface = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int r11 = 0;
            int r12 = 0;
            boolean z10 = false;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (GLTextureView.glThreadManager) {
                            while (true) {
                                if (this.shouldExit) {
                                    synchronized (GLTextureView.glThreadManager) {
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                    }
                                    return;
                                }
                                if (!this.eventQueue.isEmpty()) {
                                    runnableRemove = this.eventQueue.remove(0);
                                    z = false;
                                    break;
                                }
                                boolean z11 = this.paused;
                                boolean z12 = this.requestPaused;
                                if (z11 != z12) {
                                    this.paused = z12;
                                    GLTextureView.glThreadManager.notifyAll();
                                } else {
                                    z12 = false;
                                }
                                if (this.shouldReleaseEglContext) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    this.shouldReleaseEglContext = false;
                                    z5 = true;
                                }
                                if (z3) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    z3 = false;
                                }
                                if (z12 && this.haveEglSurface) {
                                    stopEglSurfaceLocked();
                                }
                                if (z12 && this.haveEglContext) {
                                    GLTextureView gLTextureView = this.glTextureViewWeakRef.get();
                                    if (!(gLTextureView == null ? false : gLTextureView.preserveEGLContextOnPause) || GLTextureView.glThreadManager.shouldReleaseEGLContextWhenPausing()) {
                                        stopEglContextLocked();
                                    }
                                }
                                if (z12 && GLTextureView.glThreadManager.shouldTerminateEGLWhenPausing()) {
                                    this.eglHelper.finish();
                                }
                                if (!this.hasSurface && !this.waitingForSurface) {
                                    if (this.haveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    this.waitingForSurface = true;
                                    this.surfaceIsBad = false;
                                    GLTextureView.glThreadManager.notifyAll();
                                }
                                if (this.hasSurface && this.waitingForSurface) {
                                    this.waitingForSurface = false;
                                    GLTextureView.glThreadManager.notifyAll();
                                }
                                if (z4) {
                                    this.renderComplete = true;
                                    GLTextureView.glThreadManager.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (readyToDraw()) {
                                    if (!this.haveEglContext) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.glThreadManager.tryAcquireEglContextLocked(this)) {
                                            try {
                                                this.eglHelper.start();
                                                this.haveEglContext = true;
                                                GLTextureView.glThreadManager.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.glThreadManager.releaseEglContextLocked(this);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.haveEglContext && !this.haveEglSurface) {
                                        this.haveEglSurface = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.haveEglSurface) {
                                        if (this.sizeChanged) {
                                            int r0 = this.width;
                                            int r2 = this.height;
                                            this.sizeChanged = false;
                                            r11 = r0;
                                            r12 = r2;
                                            z = false;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        } else {
                                            z = false;
                                        }
                                        this.requestRender = z;
                                        GLTextureView.glThreadManager.notifyAll();
                                        break;
                                    }
                                }
                                GLTextureView.glThreadManager.wait();
                            }
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (z7) {
                            if (this.eglHelper.createSurface()) {
                                z7 = z;
                            } else {
                                synchronized (GLTextureView.glThreadManager) {
                                    this.surfaceIsBad = true;
                                    GLTextureView.glThreadManager.notifyAll();
                                }
                            }
                        }
                        if (z8) {
                            gl10 = (GL10) this.eglHelper.createGL();
                            GLTextureView.glThreadManager.checkGLDriver(gl10);
                            z8 = z;
                        }
                        if (z6) {
                            GLTextureView gLTextureView2 = this.glTextureViewWeakRef.get();
                            if (gLTextureView2 != null) {
                                gLTextureView2.renderer.onSurfaceCreated(gl10, this.eglHelper.eglConfig);
                            }
                            z6 = z;
                        }
                        if (z9) {
                            GLTextureView gLTextureView3 = this.glTextureViewWeakRef.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.renderer.onSurfaceChanged(gl10, r11, r12);
                            }
                            z9 = z;
                        }
                        GLTextureView gLTextureView4 = this.glTextureViewWeakRef.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.renderer.onDrawFrame(gl10);
                        }
                        int r3 = this.eglHelper.swap();
                        if (r3 == 12288) {
                            z2 = true;
                        } else if (r3 != 12302) {
                            EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", r3);
                            synchronized (GLTextureView.glThreadManager) {
                                z2 = true;
                                this.surfaceIsBad = true;
                                GLTextureView.glThreadManager.notifyAll();
                            }
                        } else {
                            z2 = true;
                            z3 = true;
                        }
                        if (z10) {
                            z4 = z2;
                        }
                    } catch (Throwable th) {
                        synchronized (GLTextureView.glThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            throw th;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        public boolean ableToDraw() {
            return this.haveEglContext && this.haveEglSurface && readyToDraw();
        }

        private boolean readyToDraw() {
            return !this.paused && this.hasSurface && !this.surfaceIsBad && this.width > 0 && this.height > 0 && (this.requestRender || this.renderMode == 1);
        }

        public void setRenderMode(int r2) {
            if (r2 >= 0 && r2 <= 1) {
                synchronized (GLTextureView.glThreadManager) {
                    this.renderMode = r2;
                    GLTextureView.glThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public int getRenderMode() {
            int r1;
            synchronized (GLTextureView.glThreadManager) {
                r1 = this.renderMode;
            }
            return r1;
        }

        public void requestRender() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestRender = true;
                GLTextureView.glThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (GLTextureView.glThreadManager) {
                this.hasSurface = true;
                GLTextureView.glThreadManager.notifyAll();
                while (this.waitingForSurface && !this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (GLTextureView.glThreadManager) {
                this.hasSurface = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.waitingForSurface && !this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onPause() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestPaused = true;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && !this.paused) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (GLTextureView.glThreadManager) {
                this.requestPaused = false;
                this.requestRender = true;
                this.renderComplete = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && this.paused && !this.renderComplete) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int r2, int r3) {
            synchronized (GLTextureView.glThreadManager) {
                this.width = r2;
                this.height = r3;
                this.sizeChanged = true;
                this.requestRender = true;
                this.renderComplete = false;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited && !this.paused && !this.renderComplete && ableToDraw()) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestExitAndWait() {
            synchronized (GLTextureView.glThreadManager) {
                this.shouldExit = true;
                GLTextureView.glThreadManager.notifyAll();
                while (!this.exited) {
                    try {
                        GLTextureView.glThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.shouldReleaseEglContext = true;
            GLTextureView.glThreadManager.notifyAll();
        }

        public void queueEvent(Runnable runnable) {
            if (runnable != null) {
                synchronized (GLTextureView.glThreadManager) {
                    this.eventQueue.add(runnable);
                    GLTextureView.glThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    static class LogWriter extends Writer {
        private StringBuilder builder = new StringBuilder();

        LogWriter() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int r5, int r6) {
            for (int r0 = 0; r0 < r6; r0++) {
                char c = cArr[r5 + r0];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.builder.append(c);
                }
            }
        }

        private void flushBuilder() {
            if (this.builder.length() > 0) {
                Log.v("GLTextureView", this.builder.toString());
                StringBuilder sb = this.builder;
                sb.delete(0, sb.length());
            }
        }
    }

    private void checkRenderThreadState() {
        if (this.glThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private static class GLThreadManager {
        private static String TAG = "GLThreadManager";
        private static final int kGLES_20 = 131072;
        private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
        private GLThread eglOwner;
        private boolean glesDriverCheckComplete;
        private int glesVersion;
        private boolean glesVersionCheckComplete;
        private boolean limitedGLESContexts;
        private boolean multipleGLESContextsAllowed;

        private GLThreadManager() {
        }

        public synchronized void threadExiting(GLThread gLThread) {
            gLThread.exited = true;
            if (this.eglOwner == gLThread) {
                this.eglOwner = null;
            }
            notifyAll();
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            GLThread gLThread2 = this.eglOwner;
            if (gLThread2 == gLThread || gLThread2 == null) {
                this.eglOwner = gLThread;
                notifyAll();
                return true;
            }
            checkGLESVersion();
            if (this.multipleGLESContextsAllowed) {
                return true;
            }
            GLThread gLThread3 = this.eglOwner;
            if (gLThread3 == null) {
                return false;
            }
            gLThread3.requestReleaseEglContextLocked();
            return false;
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (this.eglOwner == gLThread) {
                this.eglOwner = null;
            }
            notifyAll();
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            return this.limitedGLESContexts;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            checkGLESVersion();
            return !this.multipleGLESContextsAllowed;
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            if (!this.glesDriverCheckComplete) {
                checkGLESVersion();
                String strGlGetString = gl10.glGetString(7937);
                if (this.glesVersion < 131072) {
                    this.multipleGLESContextsAllowed = !strGlGetString.startsWith(kMSM7K_RENDERER_PREFIX);
                    notifyAll();
                }
                this.limitedGLESContexts = !this.multipleGLESContextsAllowed;
                this.glesDriverCheckComplete = true;
            }
        }

        private void checkGLESVersion() {
            if (this.glesVersionCheckComplete) {
                return;
            }
            this.glesVersionCheckComplete = true;
        }
    }
}
