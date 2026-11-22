package com.amap.location.collection.uploadsave.save;

import android.content.Context;
import android.os.Looper;
import com.amap.location.collection.uploadsave.save.SaveController;
import com.amap.location.collection.uploadsave.upload.UploadData;
import com.amap.location.support.log.ALLog;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class DataManager {
    private static final long FLUSH_BUFFER_DELAY = 60000;
    private static final int MAX_BUFFER_SIZE = 10240;
    private DbManager mDbManager;
    private Looper mLooper;
    private SaveController<CollectDataItem> mSaveController = new SaveController<>();
    private SaveBusiness mSaveBusiness = new SaveBusiness();

    private class SaveBusiness implements SaveController.ISaveBusiness<CollectDataItem> {
        private SaveBusiness() {
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public long getMaxBufferDataSize() {
            return 10240L;
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public long getStorePeriod() {
            return 60000L;
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public void onDestroy() {
            DataManager.this.mDbManager.close();
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public void onInit() {
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public boolean prepareStorageForDataSize(long j) {
            return DataManager.this.mDbManager.prepareStorageForDataSize(j);
        }

        @Override // com.amap.location.collection.uploadsave.save.SaveController.ISaveBusiness
        public void storeData(ArrayList<CollectDataItem> arrayList) {
            if (arrayList == null || arrayList.size() == 0) {
                return;
            }
            DataManager.this.mDbManager.insert(arrayList);
        }
    }

    public DataManager(Context context, Looper looper) {
        this.mLooper = looper;
        this.mDbManager = new DbManager(context);
    }

    public void add(int i, byte[] bArr) {
        this.mSaveController.saveItem(new CollectDataItem(i, bArr));
    }

    public void delete(UploadData uploadData) {
        this.mDbManager.delete(uploadData);
    }

    public void destroy() {
        try {
            this.mSaveController.destroy();
        } catch (Throwable th) {
            ALLog.d(th);
        }
    }

    public UploadData get(boolean z, int i, long j) {
        return this.mDbManager.get(z, i, j);
    }

    public int getTotalLocatorDataSize() {
        return this.mDbManager.getTotalLocatorDataSize();
    }

    public int getTotalOthersDataSize() {
        return this.mDbManager.getTotalOthersDataSize();
    }

    public void init() {
        this.mSaveController.init(this.mSaveBusiness, this.mLooper);
    }
}
