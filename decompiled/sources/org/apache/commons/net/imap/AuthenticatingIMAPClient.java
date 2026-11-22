package org.apache.commons.net.imap;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.imap.IMAP;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes8.dex */
public class AuthenticatingIMAPClient extends IMAPSClient {
    private static final String MAC_ALGORITHM = "HmacMD5";

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH"),
        XOAUTH2("XOAUTH2");

        private final String authName;

        AUTH_METHOD(String str) {
            this.authName = str;
        }

        public final String getAuthName() {
            return this.authName;
        }
    }

    public AuthenticatingIMAPClient() {
        this("TLS", false);
    }

    public AuthenticatingIMAPClient(boolean z) {
        this("TLS", z);
    }

    public AuthenticatingIMAPClient(boolean z, SSLContext sSLContext) {
        this("TLS", z, sSLContext);
    }

    public AuthenticatingIMAPClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public AuthenticatingIMAPClient(String str) {
        this(str, false);
    }

    public AuthenticatingIMAPClient(String str, boolean z) {
        this(str, z, null);
    }

    public AuthenticatingIMAPClient(String str, boolean z, SSLContext sSLContext) {
        super(str, z, sSLContext);
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        if (!IMAPReply.isContinuation(sendCommand(IMAPCommand.AUTHENTICATE, auth_method.getAuthName()))) {
            return false;
        }
        int i = AnonymousClass1.$SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD[auth_method.ordinal()];
        if (i == 1) {
            int sendData = sendData(Base64.getEncoder().encodeToString((WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str2).getBytes(getCharset())));
            if (sendData == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            return sendData == 0;
        }
        if (i == 2) {
            byte[] decode = Base64.getDecoder().decode(getReplyString().substring(2).trim());
            Mac mac = Mac.getInstance(MAC_ALGORITHM);
            mac.init(new SecretKeySpec(str2.getBytes(getCharset()), MAC_ALGORITHM));
            byte[] bytes = convertToHexString(mac.doFinal(decode)).getBytes(getCharset());
            byte[] bytes2 = str.getBytes(getCharset());
            byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
            System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
            bArr[bytes2.length] = 32;
            System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
            int sendData2 = sendData(Base64.getEncoder().encodeToString(bArr));
            if (sendData2 == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            return sendData2 == 0;
        }
        if (i == 3) {
            if (sendData(Base64.getEncoder().encodeToString(str.getBytes(getCharset()))) != 3) {
                return false;
            }
            int sendData3 = sendData(Base64.getEncoder().encodeToString(str2.getBytes(getCharset())));
            if (sendData3 == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            return sendData3 == 0;
        }
        if (i != 4 && i != 5) {
            return false;
        }
        int sendData4 = sendData(str);
        if (sendData4 == 0) {
            setState(IMAP.IMAPState.AUTH_STATE);
        }
        return sendData4 == 0;
    }

    /* renamed from: org.apache.commons.net.imap.AuthenticatingIMAPClient$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD;

        static {
            int[] iArr = new int[AUTH_METHOD.values().length];
            $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD = iArr;
            try {
                iArr[AUTH_METHOD.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD[AUTH_METHOD.CRAM_MD5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD[AUTH_METHOD.LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD[AUTH_METHOD.XOAUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD[AUTH_METHOD.XOAUTH2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public boolean authenticate(AUTH_METHOD auth_method, String str, String str2) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        return auth(auth_method, str, str2);
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
}
