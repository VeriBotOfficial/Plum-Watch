package org.apache.commons.net.smtp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes8.dex */
public class SimpleSMTPHeader {
    private StringBuffer cc;
    private final String from;
    private boolean hasHeaderDate;
    private final StringBuffer headerFields;
    private final String subject;
    private final String to;

    public SimpleSMTPHeader(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("From cannot be null");
        }
        this.to = str2;
        this.from = str;
        this.subject = str3;
        this.headerFields = new StringBuffer();
        this.cc = null;
    }

    public void addCC(String str) {
        StringBuffer stringBuffer = this.cc;
        if (stringBuffer == null) {
            this.cc = new StringBuffer();
        } else {
            stringBuffer.append(", ");
        }
        this.cc.append(str);
    }

    public void addHeaderField(String str, String str2) {
        if (!this.hasHeaderDate && "Date".equals(str)) {
            this.hasHeaderDate = true;
        }
        this.headerFields.append(str);
        this.headerFields.append(": ");
        this.headerFields.append(str2);
        this.headerFields.append('\n');
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        if (!this.hasHeaderDate) {
            addHeaderField("Date", simpleDateFormat.format(new Date()));
        }
        if (this.headerFields.length() > 0) {
            sb.append(this.headerFields.toString());
        }
        sb.append("From: ").append(this.from).append("\n");
        if (this.to != null) {
            sb.append("To: ").append(this.to).append("\n");
        }
        if (this.cc != null) {
            sb.append("Cc: ").append(this.cc.toString()).append("\n");
        }
        if (this.subject != null) {
            sb.append("Subject: ").append(this.subject).append("\n");
        }
        sb.append('\n');
        return sb.toString();
    }
}
