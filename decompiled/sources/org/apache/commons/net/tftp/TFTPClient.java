package org.apache.commons.net.tftp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes8.dex */
public class TFTPClient extends TFTP {
    public static final int DEFAULT_MAX_TIMEOUTS = 5;
    private int maxTimeouts = 5;
    private long totalBytesReceived;
    private long totalBytesSent;

    public int getMaxTimeouts() {
        return this.maxTimeouts;
    }

    public long getTotalBytesReceived() {
        return this.totalBytesReceived;
    }

    public long getTotalBytesSent() {
        return this.totalBytesSent;
    }

    public int receiveFile(String str, int i, OutputStream outputStream, InetAddress inetAddress) throws IOException {
        return receiveFile(str, i, outputStream, inetAddress, 69);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|9|10|(5:(4:41|42|(3:105|106|107)(1:44)|45)(7:13|14|15|16|17|18|20)|23|24|(3:36|37|38)|(1:28)(1:27))(1:112)|46|47|(6:91|92|93|94|95|96)(4:50|51|52|(3:83|84|(2:86|87)(2:88|89))(4:54|55|(5:67|68|69|(1:71)|72)(4:57|58|(1:60)|61)|63))|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x015e, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0191, code lost:
    
        r6.setBlockNumber(r12);
        r11 = r11 + r13;
        r18.totalBytesReceived += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019d, code lost:
    
        if (r13 == 512) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x019f, code lost:
    
        bufferedSend(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a5, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r12 == (r10 != 0 ? r10 - 1 : 65535)) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ac A[LOOP:1: B:8:0x0034->B:27:0x01ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191 A[EDGE_INSN: B:28:0x0191->B:29:0x0191 BREAK  A[LOOP:1: B:8:0x0034->B:27:0x01ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r18v0, types: [org.apache.commons.net.tftp.TFTPClient] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.apache.commons.net.tftp.TFTPAckPacket, org.apache.commons.net.tftp.TFTPPacket] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int receiveFile(java.lang.String r19, int r20, java.io.OutputStream r21, java.net.InetAddress r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.receiveFile(java.lang.String, int, java.io.OutputStream, java.net.InetAddress, int):int");
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2) throws UnknownHostException, IOException {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), 69);
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2, int i2) throws UnknownHostException, IOException {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), i2);
    }

    public void sendFile(String str, int i, InputStream inputStream, InetAddress inetAddress) throws IOException {
        sendFile(str, i, inputStream, inetAddress, 69);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011a, code lost:
    
        if (r11 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0120, code lost:
    
        r4 = 512;
        r3 = 4;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0125, code lost:
    
        if (r4 <= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0127, code lost:
    
        r12 = r9.read(r17.sendBuffer, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012d, code lost:
    
        if (r12 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
    
        r3 = r3 + r12;
        r4 = r4 - r12;
        r10 = r10 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0133, code lost:
    
        if (r10 >= 512) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0135, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014a A[LOOP:1: B:8:0x0039->B:24:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[EDGE_INSN: B:25:0x011a->B:26:0x011a BREAK  A[LOOP:1: B:8:0x0039->B:24:0x014a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendFile(java.lang.String r18, int r19, java.io.InputStream r20, java.net.InetAddress r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.sendFile(java.lang.String, int, java.io.InputStream, java.net.InetAddress, int):void");
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2) throws UnknownHostException, IOException {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), 69);
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2, int i2) throws UnknownHostException, IOException {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), i2);
    }

    public void setMaxTimeouts(int i) {
        this.maxTimeouts = Math.max(i, 1);
    }
}
