package com.wakeup.common.network.entity.user;

/* loaded from: classes2.dex */
public class SaveBatchIntegralRecordModel {
    private long appTime;
    private int taskId;
    private int taskScore;

    public SaveBatchIntegralRecordModel(long appTime, int taskId, int taskScore) {
        this.appTime = appTime;
        this.taskId = taskId;
        this.taskScore = taskScore;
    }

    public long getAppTime() {
        return this.appTime;
    }

    public void setAppTime(long appTime) {
        this.appTime = appTime;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskScore() {
        return this.taskScore;
    }

    public void setTaskScore(int taskScore) {
        this.taskScore = taskScore;
    }
}
