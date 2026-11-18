package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes11.dex */
interface IInspectorPackagerConnection {
    void closeQuietly();

    void connect();

    void sendEventToAllConnections(String str);
}
