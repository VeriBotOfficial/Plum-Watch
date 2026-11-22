package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.qumeng.overseas.advlib.__remote__.__bootstrap__.LibInit;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import com.yandex.div2.PhoneMasks;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/* loaded from: classes17.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static final char f12869a = 12288;
    public static final String b = "\r\n";

    public static String a(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(z.class, "exp_ICliUtils_StringUtils_safeFormat", String.valueOf(e.getMessage()), (Throwable) e);
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(z.class, "exp_ICliUtils_StringUtils_safeFormat2", String.valueOf(th.getMessage()), th);
            return "";
        }
    }

    public static String c(int i) {
        Random a2 = u.a();
        byte[] bytes = "1234567890abcdef".getBytes();
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            try {
                sb.append((char) bytes[a2.nextInt(bytes.length - 1)]);
            } catch (Exception unused) {
                sb.append('e');
            }
            i--;
        }
        return sb.toString();
    }

    public static String d(String str) {
        try {
            return new String(Base64.decode(new String(Base64.decode(str, 2)), 2));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e(String str) {
        return (str != null && str.contains("_1080_1600") && str.contains("cdn.adseye.com")) ? str + "?x-oss-process=image/resize,m_fill,w_640,h_960" : String.valueOf(str);
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), ICliFactory.urlReceiveHost);
    }

    public static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString().toLowerCase().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static ArrayMap<String, String> h(String str) {
        int i;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        int indexOf = str.indexOf(Separators.QUESTION);
        if (indexOf >= 0 && str.length() > (i = indexOf + 1)) {
            String substring = str.substring(i);
            if (substring.contains("&")) {
                for (String str2 : substring.split("&")) {
                    if (str2.contains("=")) {
                        String[] split = str2.split("=");
                        if (split.length >= 2) {
                            arrayMap.put(split[0], split[1]);
                        }
                    }
                }
            } else if (substring.contains("=")) {
                String[] split2 = substring.split("=");
                arrayMap.put(split2[0], split2.length < 2 ? "" : split2[1]);
            }
        }
        return arrayMap;
    }

    public static long c(String str) {
        String[] split = str.split("\\.");
        long j = 0;
        for (int i = 0; i < split.length; i++) {
            j += b0.b(split[i]) * ((long) Math.pow(1000.0d, 3 - i));
        }
        return j;
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return TextUtils.equals(str, str2);
    }

    public static String a(List<String> list) {
        return a(list, ";");
    }

    public static String a(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String b(int i) {
        if (i == 1) {
            return "ONE";
        }
        if (i == 2) {
            return "TWO";
        }
        if (i == 3) {
            return "THREE";
        }
        if (i == 4) {
            return "FOUR";
        }
        if (i == 5) {
            return "FIVE";
        }
        return "";
    }

    public static String b(String str) {
        if (str == null) {
            com.qumeng.overseas.advlib.__remote__.utils.n.b("TrimVersion", "****, what did you gives me!!!?", new Object[0]);
            return "";
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = split[i];
            if (str2.length() > 0) {
                int i2 = 0;
                while (i2 < str2.length() && str2.charAt(i2) >= '0' && str2.charAt(i2) <= '9') {
                    i2++;
                }
                if (i2 != str2.length()) {
                    sb.append((CharSequence) str2, 0, i2);
                    break;
                }
                sb.append(str2);
                if (str2 != split[split.length - 1]) {
                    sb.append(".");
                }
            }
            i++;
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        if (length2 > 0) {
            while (true) {
                int i3 = length2 - 1;
                if (i3 < 0 || sb2.charAt(i3) != '.') {
                    break;
                }
                length2 = i3;
            }
            if (length2 != sb2.length()) {
                return sb2.substring(0, length2);
            }
        }
        return sb2;
    }

    public static String a(InputStream inputStream, int i, int i2) {
        int read;
        if (inputStream == null) {
            com.qumeng.overseas.advlib.__remote__.utils.n.b("byteMD5", "byteMD5 cannot proceed null!", new Object[0]);
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            try {
                if (i2 == -1) {
                    while (true) {
                        int read2 = inputStream.read(bArr);
                        if (read2 <= -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read2);
                    }
                } else {
                    while (i2 > 0) {
                        if (i2 < 1024) {
                            read = inputStream.read(bArr, 0, i2);
                        } else {
                            read = inputStream.read(bArr);
                        }
                        messageDigest.update(bArr, 0, read);
                        i2 -= read;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            com.qumeng.overseas.advlib.__remote__.utils.n.b("byteMD5", "byteMD5 cannot proceed null!", new Object[0]);
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr, i, i2);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append((CharSequence) Integer.toHexString((b2 & 255) | 256), 1, 3);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[2048];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        m.a(fileInputStream);
                        return a(messageDigest.digest());
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        m.a(fileInputStream);
                        return null;
                    } catch (Throwable th2) {
                        m.a(fileInputStream);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((CharSequence) Integer.toHexString((b2 & 255) | 256), 1, 3);
        }
        return sb.toString();
    }

    public static String a() {
        return b(b("1.049") + "." + ("".equals(LibInit.aisdk_bootstrap_version) ? "0" : b(LibInit.aisdk_bootstrap_version)));
    }

    public static String a(long j) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 4) {
            int i2 = ((int) j) & 255;
            if (i2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i2));
            j >>= 8;
            i++;
        }
        while (i < 4) {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
            i++;
        }
        return sb.toString();
    }

    public static Pair<String, String> a(String str, int i, String str2, String str3, String str4) {
        return a(str, String.valueOf(i), str2, str3, str4);
    }

    public static Pair<String, String> a(String str, String str2, String str3, String str4, String str5) {
        Random a2 = u.a();
        if (str != null && str3 != null && str4 != null && str5 != null) {
            String c = c(4);
            String a3 = a(System.currentTimeMillis() / 1000);
            String str6 = c + str + str2 + str3 + str4 + str5 + a3;
            String a4 = a(str6.getBytes(), 0, str6.length());
            int parseInt = 16 - Integer.parseInt(a4.substring(0, 1), 16);
            String str7 = a4.substring(0, parseInt) + c + a3 + a4.substring(parseInt);
            int nextInt = a2.nextInt(str7.length());
            return Pair.create(c, new StringBuilder().append((CharSequence) str7, 0, nextInt).append("gk").append(str7.substring(nextInt)).toString());
        }
        throw new NullPointerException("Arguments mustn't be null!");
    }

    public static String a(String str, int i) {
        String[] split = str.split("\\.");
        if (split.length >= 2) {
            split[split.length - 2] = split[split.length - 2] + String.format("-%d", Integer.valueOf(i));
        } else if (split.length == 1) {
            split[0] = split[0] + String.format("-%d", Integer.valueOf(i));
        } else {
            return UUID.randomUUID().toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            sb.append(str2);
            if (str2 != split[split.length - 1] && split.length != 1) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        if (str != null) {
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == '.') {
                    return str.substring(length + 1);
                }
            }
            return "";
        }
        throw new NullPointerException("ClassNameStripper: original class name should not be null!");
    }

    public static String a(InputStream inputStream) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        String str = "";
        while (true) {
            int read = inputStreamReader.read();
            if (read != -1) {
                str = str + ((char) read);
            } else {
                inputStreamReader.close();
                return str;
            }
        }
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public static String a(int i) {
        return new String(Character.toChars(i));
    }
}
