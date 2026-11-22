package org.apache.commons.net;

import java.util.EventObject;

/* loaded from: classes8.dex */
public class ProtocolCommandEvent extends EventObject {
    private static final long serialVersionUID = 403743538418947240L;
    private final String command;
    private final boolean isCommand;
    private final String message;
    private final int replyCode;

    public ProtocolCommandEvent(Object obj, int i, String str) {
        super(obj);
        this.replyCode = i;
        this.message = str;
        this.isCommand = false;
        this.command = null;
    }

    public ProtocolCommandEvent(Object obj, String str, String str2) {
        super(obj);
        this.replyCode = 0;
        this.message = str2;
        this.isCommand = true;
        this.command = str;
    }

    public String getCommand() {
        return this.command;
    }

    public String getMessage() {
        return this.message;
    }

    public int getReplyCode() {
        return this.replyCode;
    }

    public boolean isCommand() {
        return this.isCommand;
    }

    public boolean isReply() {
        return !isCommand();
    }
}
