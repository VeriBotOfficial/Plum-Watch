package com.amap.location.collection.uploadsave.save;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.location.collection.uploadsave.save.SaveController.DataItem;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes11.dex */
public class SaveController<Item extends DataItem> {
    private static final int MSG_DESTROY = 3;
    private static final int MSG_INIT = 4;
    private static final int MSG_SAVE_ITEM = 1;
    private static final int MSG_WRITE_TO_STORAGE = 2;
    private static final int STATE_DESTROYED = 2;
    private static final int STATE_INITED = 1;
    private static final int STATE_NONE = 0;
    private ISaveBusiness<Item> mBusiness;
    private long mCurrBufferDataSize;
    private Handler mHandler;
    private boolean mIsStoreTimerSet;
    private Handler.Callback mCallback = new Handler.Callback() { // from class: com.amap.location.collection.uploadsave.save.SaveController.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                return SaveController.this.handleMessageInner(message);
            } catch (Exception unused) {
                return true;
            }
        }
    };
    private int mState = 0;
    private ReentrantReadWriteLock mLock = new ReentrantReadWriteLock();
    private ArrayList<Item> mBuffer = new ArrayList<>();

    public interface DataItem {
        long getDataSize();
    }

    public interface ISaveBusiness<Item extends DataItem> {
        long getMaxBufferDataSize();

        long getStorePeriod();

        void onDestroy();

        void onInit();

        boolean prepareStorageForDataSize(long j);

        void storeData(ArrayList<Item> arrayList);
    }

    private void addToMemoryBuffer(Item item) {
        this.mBuffer.add(item);
        long dataSize = this.mCurrBufferDataSize + item.getDataSize();
        this.mCurrBufferDataSize = dataSize;
        if (dataSize < this.mBusiness.getMaxBufferDataSize()) {
            setDumpTimerIfHaveNot();
            return;
        }
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(2);
            }
            this.mLock.readLock().unlock();
            writeToStorage();
        } catch (Throwable th) {
            this.mLock.readLock().unlock();
            throw th;
        }
    }

    private void doDestroy() {
        writeToStorage();
        this.mBusiness.onDestroy();
        this.mBusiness = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessageInner(Message message) {
        int i = message.what;
        if (i == 1) {
            addToMemoryBuffer((DataItem) message.obj);
        } else if (i == 2) {
            writeToStorage();
        } else if (i == 3) {
            doDestroy();
        } else if (i == 4) {
            this.mBusiness.onInit();
        }
        return true;
    }

    private void setDumpTimerIfHaveNot() {
        if (this.mIsStoreTimerSet) {
            return;
        }
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(2, this.mBusiness.getStorePeriod());
            }
            this.mLock.readLock().unlock();
            this.mIsStoreTimerSet = true;
        } catch (Throwable th) {
            this.mLock.readLock().unlock();
            throw th;
        }
    }

    private void writeToStorage() {
        this.mIsStoreTimerSet = false;
        if (this.mBusiness.prepareStorageForDataSize(this.mCurrBufferDataSize)) {
            this.mBusiness.storeData(this.mBuffer);
        }
        this.mBuffer.clear();
        this.mCurrBufferDataSize = 0L;
    }

    public void destroy() {
        this.mLock.writeLock().lock();
        try {
            if (this.mState == 1) {
                this.mState = 2;
                this.mHandler.removeCallbacksAndMessages(null);
                if (this.mHandler.getLooper() == Looper.myLooper()) {
                    doDestroy();
                } else {
                    this.mHandler.sendEmptyMessage(3);
                }
                this.mHandler = null;
            }
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    public void flush() {
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mHandler;
            if (handler != null) {
                if (handler.getLooper() == Looper.myLooper()) {
                    this.mHandler.removeMessages(2);
                    writeToStorage();
                } else {
                    this.mHandler.removeMessages(2);
                    this.mHandler.obtainMessage(2).sendToTarget();
                }
            }
        } finally {
            this.mLock.readLock().unlock();
        }
    }

    public void init(ISaveBusiness<Item> iSaveBusiness, Looper looper) {
        if (iSaveBusiness == null || looper == null) {
            throw new RuntimeException("business 和 looper 都不能为 null");
        }
        try {
            this.mLock.writeLock().lock();
            if (this.mState == 0) {
                this.mBusiness = iSaveBusiness;
                this.mHandler = new Handler(looper, this.mCallback);
                if (Looper.myLooper() == looper) {
                    this.mBusiness.onInit();
                } else {
                    this.mHandler.sendEmptyMessage(4);
                }
                this.mState = 1;
            }
        } finally {
            this.mLock.writeLock().unlock();
        }
    }

    public void saveItem(Item item) {
        try {
            this.mLock.readLock().lock();
            Handler handler = this.mHandler;
            if (handler != null) {
                if (handler.getLooper() == Looper.myLooper()) {
                    addToMemoryBuffer(item);
                } else {
                    this.mHandler.obtainMessage(1, item).sendToTarget();
                }
            }
        } finally {
            this.mLock.readLock().unlock();
        }
    }
}
