package android.gov.nist.javax.sip;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.message.SIPResponse;
import com.xiaomi.mipush.sdk.Constants;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class Utils implements UtilsExt {
    private static int callIDCounter = 0;
    private static int digesterPoolsSize = 20;
    private static Random rand;
    private static String signature;
    private static MessageDigest[] digesterPool = new MessageDigest[20];
    private static long counter = 0;
    private static Utils instance = new Utils();
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        for (int i = 0; i < digesterPoolsSize; i++) {
            try {
                digesterPool[i] = MessageDigest.getInstance("MD5");
            } catch (Exception e) {
                throw new RuntimeException("Could not intialize Digester ", e);
            }
        }
        Random random = new Random(System.nanoTime());
        rand = random;
        signature = toHexString(Integer.toString(Math.abs(random.nextInt() % 1000)).getBytes());
    }

    public static Utils getInstance() {
        return instance;
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = toHex;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String getQuotedString(String str) {
        return "\"" + str.replace("\"", "\\\"") + '\"';
    }

    protected static String reduceString(String str) {
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();
        String str2 = "";
        for (int i = 0; i < length; i++) {
            if (lowerCase.charAt(i) != ' ' && lowerCase.charAt(i) != '\t') {
                str2 = str2 + lowerCase.charAt(i);
            }
        }
        return str2;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase(Locale.ENGLISH);
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public String generateCallIdentifier(String str) {
        String str2;
        long nextLong = rand.nextLong();
        MessageDigest messageDigest = digesterPool[(int) Math.abs(nextLong % digesterPoolsSize)];
        synchronized (messageDigest) {
            long nanoTime = System.nanoTime() + System.currentTimeMillis();
            int i = callIDCounter;
            callIDCounter = i + 1;
            str2 = toHexString(messageDigest.digest(Long.toString(nanoTime + i + nextLong).getBytes())) + Separators.AT + str;
        }
        return str2;
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public synchronized String generateTag() {
        return Integer.toHexString(rand.nextInt());
    }

    @Override // android.gov.nist.javax.sip.UtilsExt
    public String generateBranchId() {
        String str;
        long nextLong = rand.nextLong();
        long j = counter;
        counter = 1 + j;
        long currentTimeMillis = nextLong + j + System.currentTimeMillis() + System.nanoTime();
        MessageDigest messageDigest = digesterPool[(int) Math.abs(currentTimeMillis % digesterPoolsSize)];
        synchronized (messageDigest) {
            str = "z9hG4bK-" + signature + Constants.ACCEPT_TIME_SEPARATOR_SERVER + toHexString(messageDigest.digest(Long.toString(currentTimeMillis).getBytes()));
        }
        return str;
    }

    public boolean responseBelongsToUs(SIPResponse sIPResponse) {
        String branch = sIPResponse.getTopmostVia().getBranch();
        return branch != null && branch.startsWith(new StringBuilder("z9hG4bK-").append(signature).toString());
    }

    public static String getSignature() {
        return signature;
    }

    public static void main(String[] strArr) {
        final HashSet hashSet = new HashSet();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            newFixedThreadPool.execute(new Runnable() { // from class: android.gov.nist.javax.sip.Utils.1
                @Override // java.lang.Runnable
                public void run() {
                    for (int i2 = 0; i2 < 1000000; i2++) {
                        String generateBranchId = Utils.getInstance().generateBranchId();
                        if (hashSet.contains(generateBranchId)) {
                            throw new RuntimeException("Duplicate Branch ID");
                        }
                        hashSet.add(generateBranchId);
                    }
                }
            });
        }
        System.out.println("Done!!");
    }
}
