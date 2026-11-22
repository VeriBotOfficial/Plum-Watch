package io.agora.utils2;

import java.net.InetAddress;
import java.util.ArrayList;

/* loaded from: classes6.dex */
class DnsParseRequest {
    private Thread parseThread = null;

    DnsParseRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeResolveDoneCallback(long handle, boolean succ, Object addresses, long count);

    boolean makeRequest(final long nativeHandle, final String name) {
        if (name.isEmpty()) {
            return false;
        }
        Thread thread = this.parseThread;
        if (thread != null && thread.isAlive()) {
            return false;
        }
        Thread thread2 = new Thread(new Runnable() { // from class: io.agora.utils2.DnsParseRequest.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(name);
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : allByName) {
                        arrayList.add(inetAddress.getHostAddress());
                    }
                    DnsParseRequest.nativeResolveDoneCallback(nativeHandle, true, arrayList, arrayList.size());
                } catch (Exception unused) {
                    DnsParseRequest.nativeResolveDoneCallback(nativeHandle, false, null, 0L);
                }
            }
        });
        this.parseThread = thread2;
        thread2.start();
        return true;
    }
}
