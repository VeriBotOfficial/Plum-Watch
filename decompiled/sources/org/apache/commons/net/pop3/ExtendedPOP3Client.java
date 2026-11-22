package org.apache.commons.net.pop3;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes8.dex */
public class ExtendedPOP3Client extends POP3SClient {
    private static final String MAC_ALGORITHM = "HmacMD5";

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5");

        private final String methodName;

        AUTH_METHOD(String str) {
            this.methodName = str;
        }

        public final String getAuthName() {
            return this.methodName;
        }
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException {
        if (sendCommand(13, auth_method.getAuthName()) != 2) {
            return false;
        }
        int i = AnonymousClass1.$SwitchMap$org$apache$commons$net$pop3$ExtendedPOP3Client$AUTH_METHOD[auth_method.ordinal()];
        if (i == 1) {
            return sendCommand(new String(Base64.getEncoder().encode(new StringBuilder(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).append(str).append(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).append(str2).toString().getBytes(getCharset())), getCharset())) == 0;
        }
        if (i != 2) {
            return false;
        }
        byte[] decode = Base64.getDecoder().decode(getReplyString().substring(2).trim());
        Mac mac = Mac.getInstance(MAC_ALGORITHM);
        mac.init(new SecretKeySpec(str2.getBytes(getCharset()), MAC_ALGORITHM));
        byte[] bytes = convertToHexString(mac.doFinal(decode)).getBytes(getCharset());
        byte[] bytes2 = str.getBytes(getCharset());
        byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        bArr[bytes2.length] = 32;
        System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
        return sendCommand(Base64.getEncoder().encodeToString(bArr)) == 0;
    }

    /* renamed from: org.apache.commons.net.pop3.ExtendedPOP3Client$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$net$pop3$ExtendedPOP3Client$AUTH_METHOD;

        static {
            int[] iArr = new int[AUTH_METHOD.values().length];
            $SwitchMap$org$apache$commons$net$pop3$ExtendedPOP3Client$AUTH_METHOD = iArr;
            try {
                iArr[AUTH_METHOD.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$net$pop3$ExtendedPOP3Client$AUTH_METHOD[AUTH_METHOD.CRAM_MD5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
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
