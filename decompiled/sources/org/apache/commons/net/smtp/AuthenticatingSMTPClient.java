package org.apache.commons.net.smtp;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.IntUnaryOperator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes8.dex */
public class AuthenticatingSMTPClient extends SMTPSClient {
    private static final String MAC_ALGORITHM = "HmacMD5";

    public enum AUTH_METHOD {
        PLAIN,
        CRAM_MD5,
        LOGIN,
        XOAUTH,
        XOAUTH2;

        public static final String getAuthName(AUTH_METHOD auth_method) {
            if (auth_method.equals(PLAIN)) {
                return "PLAIN";
            }
            if (auth_method.equals(CRAM_MD5)) {
                return "CRAM-MD5";
            }
            if (auth_method.equals(LOGIN)) {
                return "LOGIN";
            }
            if (auth_method.equals(XOAUTH)) {
                return "XOAUTH";
            }
            if (auth_method.equals(XOAUTH2)) {
                return "XOAUTH2";
            }
            return null;
        }
    }

    public AuthenticatingSMTPClient() {
    }

    public AuthenticatingSMTPClient(boolean z, SSLContext sSLContext) {
        super(z, sSLContext);
    }

    public AuthenticatingSMTPClient(String str) {
        super(str);
    }

    public AuthenticatingSMTPClient(String str, boolean z) {
        super(str, z);
    }

    public AuthenticatingSMTPClient(String str, boolean z, String str2) {
        super(str, z, str2);
    }

    public AuthenticatingSMTPClient(String str, String str2) {
        super(str, false, str2);
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        if (!SMTPReply.isPositiveIntermediate(sendCommand(14, AUTH_METHOD.getAuthName(auth_method)))) {
            return false;
        }
        if (auth_method.equals(AUTH_METHOD.PLAIN)) {
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.getEncoder().encodeToString((WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str2).getBytes(getCharset()))));
        }
        if (auth_method.equals(AUTH_METHOD.CRAM_MD5)) {
            byte[] decode = Base64.getDecoder().decode(getReplyString().substring(4).trim());
            Mac mac = Mac.getInstance(MAC_ALGORITHM);
            mac.init(new SecretKeySpec(str2.getBytes(getCharset()), MAC_ALGORITHM));
            byte[] bytes = convertToHexString(mac.doFinal(decode)).getBytes(getCharset());
            byte[] bytes2 = str.getBytes(getCharset());
            byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
            System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
            bArr[bytes2.length] = 32;
            System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.getEncoder().encodeToString(bArr)));
        }
        if (auth_method.equals(AUTH_METHOD.LOGIN)) {
            if (SMTPReply.isPositiveIntermediate(sendCommand(Base64.getEncoder().encodeToString(str.getBytes(getCharset()))))) {
                return SMTPReply.isPositiveCompletion(sendCommand(Base64.getEncoder().encodeToString(str2.getBytes(getCharset()))));
            }
            return false;
        }
        if (auth_method.equals(AUTH_METHOD.XOAUTH) || auth_method.equals(AUTH_METHOD.XOAUTH2)) {
            return SMTPReply.isPositiveIntermediate(sendCommand(Base64.getEncoder().encodeToString(str.getBytes(getCharset()))));
        }
        return false;
    }

    private String convertToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public int ehlo(String str) throws IOException {
        return sendCommand(15, str);
    }

    public boolean elogin() throws IOException {
        String hostName = getLocalAddress().getHostName();
        if (hostName == null) {
            return false;
        }
        return SMTPReply.isPositiveCompletion(ehlo(hostName));
    }

    public boolean elogin(String str) throws IOException {
        return SMTPReply.isPositiveCompletion(ehlo(str));
    }

    public int[] getEnhancedReplyCode() {
        String substring = getReplyString().substring(4);
        final String[] split = substring.substring(0, substring.indexOf(32)).split("\\.");
        int[] iArr = new int[split.length];
        Arrays.setAll(iArr, new IntUnaryOperator() { // from class: org.apache.commons.net.smtp.AuthenticatingSMTPClient$$ExternalSyntheticLambda0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                int parseInt;
                parseInt = Integer.parseInt(split[i]);
                return parseInt;
            }
        });
        return iArr;
    }
}
