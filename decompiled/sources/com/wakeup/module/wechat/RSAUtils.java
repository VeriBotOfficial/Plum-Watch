package com.wakeup.module.wechat;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.Base64Utils;
import com.wakeup.common.log.LogUtils;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public class RSAUtils {
    public static String PRIVATE_REDATA = "MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAl6m0VOPZyCrHgHhIv7UpNpfkKN1TaJbHoXkD+O6xJR04qdgMDeHW9ovNGvsPETa7ehuOGW2Gtwb7K3QJxgJNTwIDAQABAkAovjhpzcRF1+g8hRPWHI7z0Z5DtCGiKU97+4yrpUQFmga08FH80huU2lKD8ahmNizX8DA3oKOCufPhmNlQYZYhAiEA6Mit2uJc0J1nns6aSgocDsPxpOPMIM3ofOUAqJO5I4kCIQCmyeKUyO8E6MYVfQcqhbbpWAN2sPNU78Hj+l08XKw8FwIhAOLPPU4KxmJhK6g5J23CgeoFEvoVFjxURBUEz+pw3K/5AiEAh0g3DSFRpbS8fk90EYx1iR0Hai0qoVj69lRrbXtphC8CICsIlNu3DEJe2fU4bZCh8UphaOXjTlxxb5FTEC0610rX";
    public static String PUBLICKEY = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJFQJDAjzq5w2E1mL6zSle7F6V6/2JPi4B7csi7EVNGrkgl7ZZZeeDMwES8MwdKd3GsQv334MvE45A4GfB+RQrUCAwEAAQ==";
    public static String PUBLICKEY_HE = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAMNnB+K68jQzchhJ7Ft61MOX8AyfWWZqciRKBhUgEFkNOFSAvfutyiLbTaMnXzeCFymNK8PE4S6GcFURvKsTY7cCAwEAAQ==";
    public static String PUBLICKEY_PA = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJeptFTj2cgqx4B4SL+1KTaX5CjdU2iWx6F5A/jusSUdOKnYDA3h1vaLzRr7DxE2u3objhlthrcG+yt0CcYCTU8CAwEAAQ==";
    public static String PUBLICKEY_PIC_HE = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwrhvtpBGIvPcuun0KTI2tl+grsZnIXnfY4MacnpvIyXdo2OOFc7+FrSpgFaLIWHvh2oMOmz8p5U+1c6sFtm6wjUqDdNi1k5kaU2IT4QEmL2W1tERKHCKEffnnMD1aucXA6EQqMC1msPCuWRFS8mczf1gSEw0CLJ4JL5vR92GFHa4p8av8quHnLBaSfOpqX261urgmXzMQsZdfp50xfmMM1IQPH/Jr/yRyk/IihnR3cCAwEAAQ==";
    public static String PUBLICKEY_PIC_PA = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwjk3PH7U0ovKK2A9kVDmrd5ccoPom8vXK7svaeMGIXLP1f0oPQoPnBJ4ZoFcPbDxGI2NlU69kDkYgbcCXYNVULOYAEQYeAl3uYa2DhfeW9Ns21o1+dxrHRhC2FLMoYVe1AYYvcfchEe3vJmvd6qGILrByjnS7RS6YhvXG0+NTri77flNp3evDFzpMJsQ8g7uf7iMkemb/tp7lHF6TKEZNWWCBKKSxxdiVfDWJiuNfECAwEAAQ==";
    private static String RSA = "RSA";
    private static String UTF8 = "UTF-8";
    public static String WECHAT_PUBLIC_KEY = "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAwl6mrqPX7hDhwngeWRPRf/W+rzEyTYeNynd55vD6sV2vYAHzeJYqT08uYsfRXZ4f1oPLxPqCmmP3OCupzDkl4HiTWMrL8HoRDNMaLQZOkQhX1sXrCohFZZYgPAzgMsCPGywg8qD+27T3v5rrDYVtPpUPI1AFr5JAEmqFkQ+fsGp+aWPNwer5O2MzckPcndFWlkLmNcsHH3HXJPRfCMF4/cS8iR/uFJZNTQzSUV09b/hDk2lJiQ7ayusELuW9m+syVY/66CbwceBH3hote3ar7JrB55m2D90hl1xEwOzVgfMaLtzj1C2koXE1JgNZHrfnB/9aVw1sZl+J74xJjqknCgkql3XNwqyVLu02KdGDczoQmGmNzt97xHbgqdWICoFr5AnI3dfPtsBX3vNmI1UoyMTCG7A3wUxTB4X38+tMPAwXL4tYAIvYJ8ofXZ726jTNdM5DJ52m30MjKonG5cxJ/NmlAf6GfUzr3Rjp9bnijK/c2MAKRNBxQjReh30jXowFw0yQ4bqFUdWx50u6JlvY2RVgn+KCaVcIMXXOVqs8WMtS2ikXfuGgSl73BVqC8ZzG+QnljNx8/c89fo1YZhCUheABAc7GG+zxLoQFTH2iUbbflJSxvJsxjKe9qFcaE7dOueqK3zlfaLFxj1+SnSeWv6aZyDFVbm6VKdnnR9s8pgkCAwEAAQ==";

    public static String encrypt(String str) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Utils.decode(PUBLICKEY)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0);
    }

    public static String encryptPA(String str) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Utils.decode(PUBLICKEY_PA)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64Utils.encode(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static String encryptHE(String str) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Utils.decode(PUBLICKEY_HE)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64Utils.encode(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static String encryptPA(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Utils.decode(str2)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64Utils.encode(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static String encryptHE(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64Utils.decode(str2)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, rSAPublicKey);
        return Base64Utils.encode(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
    }

    public static String decryptKey(String str) throws Exception {
        byte[] decode = Base64Utils.decode(str);
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64Utils.decode(PRIVATE_REDATA)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, rSAPrivateKey);
        return new String(cipher.doFinal(decode));
    }

    public static String decryptWithWeChatPublicKey(String str) throws Exception {
        try {
            LogUtils.d("RSAUtils", "======开始RSA解密，输入数据长度: " + str.length());
            byte[] decode = Base64.decode(str, 0);
            LogUtils.d("RSAUtils", "======Base64解码后数据长度: " + decode.length);
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(WECHAT_PUBLIC_KEY, 0)));
            int bitLength = rSAPublicKey.getModulus().bitLength() / 8;
            Log.d("RSAUtils", "密钥大小: " + bitLength + " bytes");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < decode.length) {
                int i2 = i + bitLength;
                int min = Math.min(i2, decode.length) - i;
                byte[] bArr = new byte[min];
                System.arraycopy(decode, i, bArr, 0, min);
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < min; i3++) {
                    sb.append(String.format("%02x", Integer.valueOf(bArr[i3] & 255)));
                }
                String bigInteger = new BigInteger(sb.toString(), 16).modPow(rSAPublicKey.getPublicExponent(), rSAPublicKey.getModulus()).toString(16);
                if (bigInteger.length() % 2 != 0) {
                    bigInteger = "0" + bigInteger;
                }
                int i4 = 0;
                while (i4 < bigInteger.length()) {
                    int i5 = i4 + 2;
                    arrayList.add(Byte.valueOf((byte) Integer.parseInt(bigInteger.substring(i4, i5), 16)));
                    i4 = i5;
                }
                i = i2;
            }
            byte[] bArr2 = new byte[arrayList.size()];
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                bArr2[i6] = ((Byte) arrayList.get(i6)).byteValue();
            }
            String str2 = new String(bArr2, StandardCharsets.UTF_8);
            Log.d("RSAUtils", "解密完成，结果长度: " + str2.length());
            for (int i7 = 0; i7 < str2.length(); i7++) {
                char charAt = str2.charAt(i7);
                if (charAt < ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    Log.w("RSAUtils", "检测到控制字符，位置: " + i7 + ", 字符码: " + ((int) charAt));
                    Log.w("RSAUtils", "解密结果包含控制字符，可能存在编码问题");
                    return str2;
                }
            }
            Log.d("RSAUtils", "解密结果验证通过，无异常字符");
            return str2;
        } catch (Exception e) {
            LogUtils.d("RSAUtils", "解密失败: " + e.getMessage(), e);
            throw new Exception("微信公钥解密失败: " + e.getMessage(), e);
        }
    }

    public static String decryptWithWeChatPublicKeySimple(String str) throws Exception {
        return decryptWithWeChatPublicKey(str);
    }
}
