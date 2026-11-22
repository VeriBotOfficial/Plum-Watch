package android.gov.nist.javax.sip;

import android.javax.sip.Dialog;
import android.javax.sip.RequestEvent;
import android.javax.sip.ServerTransaction;
import android.javax.sip.message.Request;

/* loaded from: classes.dex */
public class RequestEventExt extends RequestEvent {
    private String remoteIpAddress;
    private int remotePort;

    public RequestEventExt(Object obj, ServerTransaction serverTransaction, Dialog dialog, Request request) {
        super(obj, serverTransaction, dialog, request);
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public void setRemotePort(int i) {
        this.remotePort = i;
    }

    public int getRemotePort() {
        return this.remotePort;
    }
}
