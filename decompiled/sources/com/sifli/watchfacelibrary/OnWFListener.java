package com.sifli.watchfacelibrary;

/* loaded from: classes17.dex */
public interface OnWFListener {
    public static final int WF_CONNECT = 0;
    public static final int WF_DISCONNECT = 1;

    void onConnectionState(int i);

    void onFileSend(int i);
}
