package com.amap.location.collection.uploadsave.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.location.support.AmapContext;
import com.amap.location.support.log.ALLog;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public class UploadController {
    private static final int EXECUTOR_PROVIDER_INNER = 2;
    private static final int EXECUTOR_PROVIDER_OUTER = 1;
    private static final int MSG_DESTROY = 106;
    private static final int MSG_INIT = 105;
    private static final int MSG_TRY_UPLOAD = 101;
    private static final int MSG_UPLOAD_FAIL = 104;
    private static final int MSG_UPLOAD_SUCCESS = 103;
    private static final int MSG_UPLOAD_TIMEOUT = 102;
    private static final int STATE_DESTROYED = 2;
    private static final int STATE_INITED = 1;
    private static final int STATE_NONE = 0;
    private static final String TAG = "UploadController";
    private static final int TRY_FROM_INNER = 0;
    private static final int TRY_FROM_OUTER = 1;
    private Executor mExecutor;
    private long mLastCreateDataSuccessTime;
    private UploadTask mLastUploadTask;
    private int mUploadFailCount;
    private IUploadBusiness mUploadImpl;
    private Handler mWorkHandler;
    private int mState = 0;
    private ReentrantReadWriteLock mLock = new ReentrantReadWriteLock();
    private int mExecutorProvider = 0;
    private Handler.Callback mCallback = new Handler.Callback() { // from class: com.amap.location.collection.uploadsave.upload.UploadController.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                return UploadController.this.handleMessageInner(message);
            } catch (Exception unused) {
                UploadController.this.resetTimer();
                return true;
            }
        }
    };

    public interface IUploadBusiness {
        void decreaseUploadQuota(int i, Object obj);

        void deleteUploadedData(Object obj);

        boolean doUpload(Object obj);

        boolean enableUpload(int i);

        Executor getExecutor();

        long getIntervalOfAutoUpload();

        int getMaxFailCount();

        long getTotalSizeToUpload();

        Object getUploadData(long j);

        long getUploadQuota(int i);

        long getUploadSizePerRequest(int i);

        int getUploadTimeout();

        void onDestroy();

        void onInit();

        void onUploadCancelByNetwokChanged();

        void onUploadFinish(int i);
    }

    static class UploadTask implements Runnable {
        volatile boolean isCanceled;
        final int mNetType;
        WeakReference<UploadController> mUploadController;
        Object mUploadData;
        WeakReference<IUploadBusiness> mUploadImpl;

        UploadTask(UploadController uploadController, IUploadBusiness iUploadBusiness, Object obj, int i) {
            this.mUploadController = new WeakReference<>(uploadController);
            this.mUploadImpl = new WeakReference<>(iUploadBusiness);
            this.mUploadData = obj;
            this.mNetType = i;
        }

        void cancel() {
            this.isCanceled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.isCanceled) {
                return;
            }
            UploadController uploadController = this.mUploadController.get();
            IUploadBusiness iUploadBusiness = this.mUploadImpl.get();
            if (uploadController == null || iUploadBusiness == null) {
                return;
            }
            boolean z = false;
            if (AmapContext.getTelephonyManager().getNetworkCoarseType() < this.mNetType) {
                uploadController.notifyUploadResult(this, false);
                return;
            }
            try {
                z = iUploadBusiness.doUpload(this.mUploadData);
            } catch (Throwable th) {
                ALLog.d(th);
            }
            if (this.isCanceled) {
                return;
            }
            uploadController.notifyUploadResult(this, z);
        }
    }

    private void doDestroy() {
        this.mUploadImpl.onDestroy();
        UploadTask uploadTask = this.mLastUploadTask;
        if (uploadTask != null) {
            uploadTask.cancel();
        }
        if (this.mExecutorProvider == 2) {
            ((ExecutorService) this.mExecutor).shutdown();
        }
        this.mExecutor = null;
        this.mUploadImpl = null;
        this.mLastUploadTask = null;
    }

    private Executor getExector() {
        Executor executor = this.mExecutor;
        if (executor != null) {
            return executor;
        }
        Executor executor2 = this.mUploadImpl.getExecutor();
        if (executor2 != null) {
            this.mExecutorProvider = 1;
            this.mExecutor = executor2;
            return executor2;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1024), new ThreadFactory() { // from class: com.amap.location.collection.uploadsave.upload.UploadController.2
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, UploadController.TAG);
            }
        });
        this.mExecutor = threadPoolExecutor;
        this.mExecutorProvider = 2;
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean handleMessageInner(Message message) {
        switch (message.what) {
            case 101:
                if (message.arg1 == 1) {
                    this.mUploadFailCount = 0;
                }
                tryUploadInner();
                return true;
            case 102:
                IUploadBusiness iUploadBusiness = this.mUploadImpl;
                UploadTask uploadTask = this.mLastUploadTask;
                iUploadBusiness.decreaseUploadQuota(uploadTask.mNetType, uploadTask.mUploadData);
                this.mLastUploadTask.cancel();
                this.mLastUploadTask = null;
                this.mUploadFailCount++;
                this.mUploadImpl.onUploadFinish(-1);
                resetTimer();
                return true;
            case 103:
                Object obj = message.obj;
                UploadTask uploadTask2 = (UploadTask) obj;
                if (obj == this.mLastUploadTask) {
                    this.mLastUploadTask = null;
                    try {
                        this.mLock.readLock().lock();
                        Handler handler = this.mWorkHandler;
                        if (handler != null) {
                            handler.removeMessages(102);
                        }
                        this.mLock.readLock().unlock();
                        this.mUploadImpl.decreaseUploadQuota(uploadTask2.mNetType, uploadTask2.mUploadData);
                        this.mUploadImpl.deleteUploadedData(uploadTask2.mUploadData);
                        this.mUploadImpl.onUploadFinish(1);
                        tryUploadInner();
                    } finally {
                    }
                }
                return true;
            case 104:
                Object obj2 = message.obj;
                UploadTask uploadTask3 = this.mLastUploadTask;
                if (obj2 == uploadTask3) {
                    this.mUploadImpl.decreaseUploadQuota(uploadTask3.mNetType, uploadTask3.mUploadData);
                    this.mLastUploadTask = null;
                    try {
                        this.mLock.readLock().lock();
                        Handler handler2 = this.mWorkHandler;
                        if (handler2 != null) {
                            handler2.removeMessages(102);
                        }
                        this.mLock.readLock().unlock();
                        this.mUploadFailCount++;
                        this.mUploadImpl.onUploadFinish(0);
                        resetTimer();
                    } finally {
                    }
                }
                return true;
            case 105:
                this.mUploadImpl.onInit();
                return true;
            case 106:
                doDestroy();
                return true;
            default:
                return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyUploadResult(UploadTask uploadTask, boolean z) {
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.obtainMessage(z ? 103 : 104, uploadTask).sendToTarget();
            }
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimer() {
        try {
            this.mLock.readLock().lock();
            if (this.mWorkHandler != null && ((this.mUploadImpl.getMaxFailCount() <= 0 || this.mUploadFailCount < this.mUploadImpl.getMaxFailCount()) && !this.mWorkHandler.hasMessages(101))) {
                this.mWorkHandler.sendMessageDelayed(this.mWorkHandler.obtainMessage(101, 0, 0), this.mUploadImpl.getIntervalOfAutoUpload());
            }
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    private void tryUploadInner() {
        if (this.mLastUploadTask != null) {
            return;
        }
        int networkCoarseType = AmapContext.getTelephonyManager().getNetworkCoarseType();
        if (networkCoarseType == 0) {
            resetTimer();
            return;
        }
        if (!this.mUploadImpl.enableUpload(networkCoarseType)) {
            resetTimer();
            return;
        }
        long uploadQuota = this.mUploadImpl.getUploadQuota(networkCoarseType);
        if (uploadQuota <= 0) {
            resetTimer();
            return;
        }
        long totalSizeToUpload = this.mUploadImpl.getTotalSizeToUpload();
        if (totalSizeToUpload <= 0) {
            resetTimer();
            return;
        }
        long min = Math.min(this.mUploadImpl.getUploadSizePerRequest(networkCoarseType), uploadQuota);
        if (totalSizeToUpload < min && SystemClock.elapsedRealtime() - this.mLastCreateDataSuccessTime < this.mUploadImpl.getIntervalOfAutoUpload()) {
            resetTimer();
            return;
        }
        Object uploadData = this.mUploadImpl.getUploadData(min);
        if (uploadData == null) {
            resetTimer();
            return;
        }
        this.mLastCreateDataSuccessTime = SystemClock.elapsedRealtime();
        if (networkCoarseType != AmapContext.getTelephonyManager().getNetworkCoarseType()) {
            this.mUploadImpl.onUploadCancelByNetwokChanged();
            resetTimer();
            return;
        }
        try {
            this.mLock.readLock().lock();
            if (this.mWorkHandler != null) {
                this.mLastUploadTask = new UploadTask(this, this.mUploadImpl, uploadData, networkCoarseType);
                getExector().execute(this.mLastUploadTask);
                this.mWorkHandler.sendEmptyMessageDelayed(102, this.mUploadImpl.getUploadTimeout());
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    void destroy() {
        try {
            this.mLock.writeLock().lock();
            if (this.mState == 1) {
                this.mState = 2;
                this.mWorkHandler.removeCallbacksAndMessages(null);
                if (this.mWorkHandler.getLooper() == Looper.myLooper()) {
                    doDestroy();
                } else {
                    this.mWorkHandler.sendEmptyMessage(106);
                }
                this.mWorkHandler = null;
            }
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    public void init(IUploadBusiness iUploadBusiness, Looper looper) {
        if (iUploadBusiness == null || looper == null) {
            throw new RuntimeException("params not be null!");
        }
        try {
            this.mLock.writeLock().lock();
            if (this.mState == 0) {
                this.mUploadImpl = iUploadBusiness;
                this.mWorkHandler = new Handler(looper, this.mCallback);
                if (Looper.myLooper() == looper) {
                    this.mUploadImpl.onInit();
                } else {
                    this.mWorkHandler.sendEmptyMessage(105);
                }
                this.mState = 1;
            }
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    void tryUpload(long j) {
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mWorkHandler;
            if (handler != null) {
                handler.removeMessages(101);
                this.mWorkHandler.sendMessageDelayed(this.mWorkHandler.obtainMessage(101, 1, 0), Math.max(0L, j));
            }
        } finally {
            this.mLock.readLock().unlock();
        }
    }
}
