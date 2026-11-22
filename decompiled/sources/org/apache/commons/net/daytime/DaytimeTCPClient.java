package org.apache.commons.net.daytime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;

/* loaded from: classes8.dex */
public final class DaytimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 13;
    private final char[] buffer = new char[64];

    public DaytimeTCPClient() {
        setDefaultPort(13);
    }

    public String getTime() throws IOException {
        StringBuilder sb = new StringBuilder(this.buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this._input_, getCharset()));
        while (true) {
            char[] cArr = this.buffer;
            int read = bufferedReader.read(cArr, 0, cArr.length);
            if (read > 0) {
                sb.append(this.buffer, 0, read);
            } else {
                return sb.toString();
            }
        }
    }
}
