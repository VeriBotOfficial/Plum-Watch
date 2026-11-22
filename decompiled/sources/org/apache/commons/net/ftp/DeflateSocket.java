package org.apache.commons.net.ftp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* loaded from: classes8.dex */
final class DeflateSocket extends DelegateSocket {
    DeflateSocket(Socket socket) {
        super(socket);
    }

    @Override // org.apache.commons.net.ftp.DelegateSocket, java.net.Socket
    public InputStream getInputStream() throws IOException {
        return new InflaterInputStream(this.delegate.getInputStream());
    }

    @Override // org.apache.commons.net.ftp.DelegateSocket, java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return new DeflaterOutputStream(this.delegate.getOutputStream());
    }
}
