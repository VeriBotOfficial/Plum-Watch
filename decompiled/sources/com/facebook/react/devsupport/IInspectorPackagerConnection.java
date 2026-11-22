package com.facebook.react.devsupport;

/* loaded from: classes14.dex */
interface IInspectorPackagerConnection {
    void closeQuietly();

    void connect();

    void sendEventToAllConnections(String str);
}
