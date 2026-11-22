package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshotTaker;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class FileDownloadList {
    private final ArrayList<BaseDownloadTask.IRunningTask> mList;

    private static final class HolderClass {
        private static final FileDownloadList INSTANCE = new FileDownloadList();

        private HolderClass() {
        }
    }

    public static FileDownloadList getImpl() {
        return HolderClass.INSTANCE;
    }

    private FileDownloadList() {
        this.mList = new ArrayList<>();
    }

    boolean isEmpty() {
        return this.mList.isEmpty();
    }

    int size() {
        return this.mList.size();
    }

    int count(int i) {
        int i2;
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().is(i)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public BaseDownloadTask.IRunningTask get(int i) {
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (next.is(i)) {
                    return next;
                }
            }
            return null;
        }
    }

    List<BaseDownloadTask.IRunningTask> getReceiveServiceTaskList(int i) {
        byte status;
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (next.is(i) && !next.isOver() && (status = next.getOrigin().getStatus()) != 0 && status != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    List<BaseDownloadTask.IRunningTask> getDownloadingList(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (next.is(i) && !next.isOver()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    boolean isNotContains(BaseDownloadTask.IRunningTask iRunningTask) {
        return this.mList.isEmpty() || !this.mList.contains(iRunningTask);
    }

    List<BaseDownloadTask.IRunningTask> copy(FileDownloadListener fileDownloadListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (next.is(fileDownloadListener)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    List<BaseDownloadTask.IRunningTask> assembleTasksToStart(int i, FileDownloadListener fileDownloadListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (next.getOrigin().getListener() == fileDownloadListener && !next.getOrigin().isAttached()) {
                    next.setAttachKeyByQueue(i);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    BaseDownloadTask.IRunningTask[] copy() {
        BaseDownloadTask.IRunningTask[] iRunningTaskArr;
        synchronized (this.mList) {
            iRunningTaskArr = (BaseDownloadTask.IRunningTask[]) this.mList.toArray(new BaseDownloadTask.IRunningTask[this.mList.size()]);
        }
        return iRunningTaskArr;
    }

    void divertAndIgnoreDuplicate(List<BaseDownloadTask.IRunningTask> list) {
        synchronized (this.mList) {
            Iterator<BaseDownloadTask.IRunningTask> it = this.mList.iterator();
            while (it.hasNext()) {
                BaseDownloadTask.IRunningTask next = it.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.mList.clear();
        }
    }

    public boolean remove(BaseDownloadTask.IRunningTask iRunningTask, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte status = messageSnapshot.getStatus();
        synchronized (this.mList) {
            remove = this.mList.remove(iRunningTask);
            if (remove && this.mList.size() == 0 && FileDownloadServiceProxy.getImpl().isRunServiceForeground()) {
                FileDownloader.getImpl().stopForeground(true);
            }
        }
        if (FileDownloadLog.NEED_LOG && this.mList.size() == 0) {
            FileDownloadLog.v(this, "remove %s left %d %d", iRunningTask, Byte.valueOf(status), Integer.valueOf(this.mList.size()));
        }
        if (remove) {
            IFileDownloadMessenger messenger = iRunningTask.getMessageHandler().getMessenger();
            if (status == -4) {
                messenger.notifyWarn(messageSnapshot);
                return remove;
            }
            if (status == -3) {
                messenger.notifyBlockComplete(MessageSnapshotTaker.takeBlockCompleted(messageSnapshot));
                return remove;
            }
            if (status == -2) {
                messenger.notifyPaused(messageSnapshot);
                return remove;
            }
            if (status != -1) {
                return remove;
            }
            messenger.notifyError(messageSnapshot);
            return remove;
        }
        FileDownloadLog.e(this, "remove error, not exist: %s %d", iRunningTask, Byte.valueOf(status));
        return remove;
    }

    void add(BaseDownloadTask.IRunningTask iRunningTask) {
        if (!iRunningTask.getOrigin().isAttached()) {
            iRunningTask.setAttachKeyDefault();
        }
        if (iRunningTask.getMessageHandler().getMessenger().notifyBegin()) {
            addUnchecked(iRunningTask);
        }
    }

    void addUnchecked(BaseDownloadTask.IRunningTask iRunningTask) {
        if (iRunningTask.isMarkedAdded2List()) {
            return;
        }
        synchronized (this.mList) {
            if (this.mList.contains(iRunningTask)) {
                FileDownloadLog.w(this, "already has %s", iRunningTask);
            } else {
                iRunningTask.markAdded2List();
                this.mList.add(iRunningTask);
                if (FileDownloadLog.NEED_LOG) {
                    FileDownloadLog.v(this, "add list in all %s %d %d", iRunningTask, Byte.valueOf(iRunningTask.getOrigin().getStatus()), Integer.valueOf(this.mList.size()));
                }
            }
        }
    }
}
