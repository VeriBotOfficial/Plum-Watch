package com.heytap.msp.push.mode;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationSortMessage implements Comparable<NotificationSortMessage> {
    private int autoDelete;
    private String group;
    private int importantLevel;
    private boolean isMcs;
    private String messageId;
    private int notifyId;
    private long postTime;
    private String statisticData;

    public NotificationSortMessage(String str, int r10, int r11, boolean z, long j, int r15, String str2) {
        this(str, r10, r11, z, j, str2);
        this.notifyId = r15;
    }

    public NotificationSortMessage(String str, int r2, int r3, boolean z, long j, String str2) {
        this.messageId = str;
        this.importantLevel = r2;
        this.autoDelete = r3;
        this.isMcs = z;
        this.postTime = j;
        this.statisticData = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getPostTime() < this.postTime) {
            return 1;
        }
        return notificationSortMessage.getPostTime() == this.postTime ? 0 : -1;
    }

    public int getAutoDelete() {
        return this.autoDelete;
    }

    public String getGroup() {
        return this.group;
    }

    public int getImportantLevel() {
        return this.importantLevel;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getNotifyId() {
        return this.notifyId;
    }

    public long getPostTime() {
        return this.postTime;
    }

    public String getStatisticData() {
        return this.statisticData;
    }

    public boolean isMcs() {
        return this.isMcs;
    }

    public void setGroup(String str) {
        this.group = str;
    }
}
