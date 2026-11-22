package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.LogRecord;

/* loaded from: classes.dex */
class MessageLog implements LogRecord {
    private String callId;
    private String destination;
    private String firstLine;
    private boolean isSender;
    private String message;
    private String source;
    private String tid;
    private long timeStamp;
    private long timeStampHeaderValue;

    @Override // android.gov.nist.javax.sip.LogRecord
    public boolean equals(Object obj) {
        if (!(obj instanceof MessageLog)) {
            return false;
        }
        MessageLog messageLog = (MessageLog) obj;
        return messageLog.message.equals(this.message) && messageLog.timeStamp == this.timeStamp;
    }

    public MessageLog(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, long j) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("null msg");
        }
        this.message = str;
        this.source = str2;
        this.destination = str3;
        try {
            long parseLong = Long.parseLong(str4);
            if (parseLong < 0) {
                throw new IllegalArgumentException("Bad time stamp ");
            }
            this.timeStamp = parseLong;
            this.isSender = z;
            this.firstLine = str5;
            this.tid = str6;
            this.callId = str7;
            this.timeStampHeaderValue = j;
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Bad number format " + str4);
        }
    }

    public MessageLog(String str, String str2, String str3, long j, boolean z, String str4, String str5, String str6, long j2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("null msg");
        }
        this.message = str;
        this.source = str2;
        this.destination = str3;
        if (j < 0) {
            throw new IllegalArgumentException("negative ts");
        }
        this.timeStamp = j;
        this.isSender = z;
        this.firstLine = str4;
        this.tid = str5;
        this.callId = str6;
        this.timeStampHeaderValue = j2;
    }

    @Override // android.gov.nist.javax.sip.LogRecord
    public String toString() {
        return (((("<message\nfrom=\"" + this.source + "\" \nto=\"" + this.destination + "\" \ntime=\"" + this.timeStamp + "\"" + (this.timeStampHeaderValue != 0 ? "\ntimeStamp = \"" + this.timeStampHeaderValue + "\"" : "") + "\nisSender=\"" + this.isSender + "\" \ntransactionId=\"" + this.tid + "\" \ncallId=\"" + this.callId + "\" \nfirstLine=\"" + this.firstLine.trim() + "\" \n>\n") + "<![CDATA[") + this.message) + "]]>\n") + "</message>\n";
    }
}
