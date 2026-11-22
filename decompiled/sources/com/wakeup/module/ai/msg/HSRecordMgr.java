package com.wakeup.module.ai.msg;

import android.text.TextUtils;
import com.blankj.utilcode.util.FileUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.module.ai.bean.HSRecord;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HSRecordMgr.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/ai/msg/HSRecordMgr;", "", "<init>", "()V", "CACHE_KEY", "", "gson", "Lcom/google/gson/Gson;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "addRecord", "", "record", "Lcom/wakeup/module/ai/bean/HSRecord;", "editRecord", "deleteRecord", "getRecordList", "", "saveList", "list", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HSRecordMgr {
    private static final String CACHE_KEY = "hs_record_cache_list";
    public static final HSRecordMgr INSTANCE = new HSRecordMgr();
    private static final Gson gson = new Gson();
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private HSRecordMgr() {
    }

    public final void addRecord(HSRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.writeLock().lock();
        List<HSRecord> mutableList = CollectionsKt.toMutableList((Collection) getRecordList());
        mutableList.add(record);
        saveList(mutableList);
        reentrantReadWriteLock.writeLock().unlock();
    }

    public final void editRecord(HSRecord record) {
        Object obj;
        Intrinsics.checkNotNullParameter(record, "record");
        lock.writeLock().lock();
        List<HSRecord> mutableList = CollectionsKt.toMutableList((Collection) getRecordList());
        Iterator<T> it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((HSRecord) obj).getId(), record.getId())) {
                    break;
                }
            }
        }
        HSRecord hSRecord = (HSRecord) obj;
        if (hSRecord != null) {
            hSRecord.setDescribe(record.getDescribe());
            hSRecord.setAudioDuration(record.getAudioDuration());
            hSRecord.setWavPath(record.getWavPath());
            hSRecord.setAudioUp(record.getIsAudioUp());
            hSRecord.setBeforeUp(record.getIsBeforeUp());
            hSRecord.setAfterUp(record.getIsAfterUp());
        }
        saveList(mutableList);
        lock.writeLock().unlock();
    }

    public final void deleteRecord(HSRecord record) {
        Object obj;
        Intrinsics.checkNotNullParameter(record, "record");
        lock.writeLock().lock();
        List<HSRecord> mutableList = CollectionsKt.toMutableList((Collection) getRecordList());
        Iterator<T> it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((HSRecord) obj).getId(), record.getId())) {
                    break;
                }
            }
        }
        HSRecord hSRecord = (HSRecord) obj;
        if (hSRecord == null) {
            return;
        }
        FileUtils.delete(hSRecord.getAudioPath());
        FileUtils.delete(hSRecord.getBeforeTextPath());
        FileUtils.delete(hSRecord.getAfterTextPath());
        mutableList.remove(hSRecord);
        saveList(mutableList);
        lock.writeLock().unlock();
    }

    public final List<HSRecord> getRecordList() {
        ReentrantReadWriteLock reentrantReadWriteLock = lock;
        reentrantReadWriteLock.readLock().lock();
        String string = CacheManager.INSTANCE.getString(CACHE_KEY);
        List<HSRecord> emptyList = CollectionsKt.emptyList();
        if (!TextUtils.isEmpty(string)) {
            emptyList = (List) gson.fromJson(string, new TypeToken<List<? extends HSRecord>>() { // from class: com.wakeup.module.ai.msg.HSRecordMgr$getRecordList$1
            }.getType());
        }
        reentrantReadWriteLock.readLock().unlock();
        return emptyList;
    }

    private final void saveList(List<HSRecord> list) {
        CacheManager cacheManager = CacheManager.INSTANCE;
        String json = gson.toJson(list);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        cacheManager.saveString(CACHE_KEY, json);
    }
}
