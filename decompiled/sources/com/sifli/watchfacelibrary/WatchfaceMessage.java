package com.sifli.watchfacelibrary;

/* loaded from: classes17.dex */
public class WatchfaceMessage {
    public static final int WF_MESSAGE_TYPE_LOG = 2;
    public static final int WF_MESSAGE_TYPE_PROGRESS = 0;
    public static final int WF_MESSAGE_TYPE_STATE = 1;
    private String messageLog;
    private int messageState;
    private int messageType;
    private int messageValue;

    public WatchfaceMessage(int i, int i2, int i3, String str) {
        this.messageType = i;
        this.messageState = i2;
        this.messageValue = i3;
        this.messageLog = str;
    }

    public int getMessageType() {
        return this.messageType;
    }

    public int getMessageValue() {
        return this.messageValue;
    }

    public int getMessageState() {
        return this.messageState;
    }

    public String getMessageLog() {
        return this.messageLog;
    }
}
