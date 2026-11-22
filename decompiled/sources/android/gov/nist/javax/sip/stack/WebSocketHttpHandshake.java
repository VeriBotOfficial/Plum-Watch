package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes.dex */
public class WebSocketHttpHandshake {
    private static StackLogger logger = CommonLogger.getLogger(WebSocketHttpHandshake.class);
    private HashMap<String, String> headers = new HashMap<>();

    public byte[] createHttpResponse(String str) throws Exception {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Request=" + str);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        String readLine = readLine(byteArrayInputStream);
        if (readLine == null) {
            return null;
        }
        String[] split = readLine.split(" ");
        if (split.length >= 3) {
            this.headers.put("ctx", split[1]);
        }
        boolean z = false;
        while (!readLine.isEmpty()) {
            readLine = readLine(byteArrayInputStream);
            if (readLine != null && !readLine.isEmpty()) {
                String[] split2 = readLine.split(":", 2);
                if (split2.length == 2) {
                    if (split2[0].toLowerCase().startsWith("sec-websocket-key")) {
                        z = true;
                    }
                    this.headers.put(split2[0].trim(), split2[1].trim());
                }
            }
        }
        if (z) {
            byteArrayInputStream.read(new byte[8]);
        }
        StringBuilder sb = new StringBuilder("HTTP/1.1 101 Web Socket Protocol Handshake\r\nUpgrade: WebSocket\r\nConnection: Upgrade\r\n");
        if (z) {
            sb.append("Sec-");
        }
        sb.append("WebSocket-Origin: ").append(this.headers.get(HttpHeaders.ORIGIN)).append("\r\n");
        if (z) {
            sb.append("Sec-");
        }
        sb.append("WebSocket-Location: ws://").append(this.headers.get("Host")).append(this.headers.get("ctx")).append("\r\nSec-WebSocket-Accept: ");
        sb.append(computeRev13Response(this.headers.get(HttpHeaders.SEC_WEBSOCKET_KEY))).append("\r\n");
        if (this.headers.get("Protocol") != null) {
            if (z) {
                sb.append("Sec-");
            }
            sb.append("Protocol: ").append(this.headers.get("Protocol")).append("\r\n");
        }
        if (this.headers.get(HttpHeaders.SEC_WEBSOCKET_PROTOCOL) != null) {
            sb.append("Sec-WebSocket-Protocol: ").append(this.headers.get(HttpHeaders.SEC_WEBSOCKET_PROTOCOL)).append("\r\n");
        }
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Response=" + sb2);
        }
        return sb.toString().getBytes();
    }

    public static String computeRev13Response(String str) throws IOException {
        String str2 = str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = messageDigest.digest(str2.getBytes());
        new ByteArrayOutputStream();
        return Base64.encodeBytes(digest);
    }

    private String readLine(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            if (read == 13) {
                z = true;
            } else {
                if (read == 10 && z) {
                    return sb.toString();
                }
                if (read == 10) {
                    return null;
                }
                sb.append((char) read);
            }
        }
    }
}
