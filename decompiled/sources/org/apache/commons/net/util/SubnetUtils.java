package org.apache.commons.net.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public class SubnetUtils {
    private static final int NBITS = 32;
    private static final String PARSE_FAIL = "Could not parse [%s]";
    private final int address;
    private final int broadcast;
    private boolean inclusiveHostCount;
    private final int netmask;
    private final int network;
    private static final String IP_ADDRESS = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
    private static final Pattern ADDRESS_PATTERN = Pattern.compile(IP_ADDRESS);
    private static final String SLASH_FORMAT = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,2})";
    private static final Pattern CIDR_PATTERN = Pattern.compile(SLASH_FORMAT);

    public final class SubnetInfo {
        private static final long UNSIGNED_INT_MASK = 4294967295L;

        private SubnetInfo() {
        }

        public int asInteger(String str) {
            return SubnetUtils.toInteger(str);
        }

        private long broadcastLong() {
            return SubnetUtils.this.broadcast & 4294967295L;
        }

        private String format(int[] iArr) {
            int length = iArr.length - 1;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                sb.append(iArr[i]);
                if (i == length) {
                    return sb.toString();
                }
                sb.append('.');
                i++;
            }
        }

        public String getAddress() {
            return format(toArray(SubnetUtils.this.address));
        }

        @Deprecated
        public int getAddressCount() {
            long addressCountLong = getAddressCountLong();
            if (addressCountLong <= 2147483647L) {
                return (int) addressCountLong;
            }
            throw new IllegalStateException("Count is larger than an integer: " + addressCountLong);
        }

        public long getAddressCountLong() {
            long broadcastLong = (broadcastLong() - networkLong()) + (SubnetUtils.this.isInclusiveHostCount() ? 1 : -1);
            if (broadcastLong < 0) {
                return 0L;
            }
            return broadcastLong;
        }

        public String[] getAllAddresses() {
            int addressCount = getAddressCount();
            String[] strArr = new String[addressCount];
            if (addressCount != 0) {
                int low = low();
                int i = 0;
                while (low <= high()) {
                    strArr[i] = format(toArray(low));
                    low++;
                    i++;
                }
            }
            return strArr;
        }

        public String getBroadcastAddress() {
            return format(toArray(SubnetUtils.this.broadcast));
        }

        public String getCidrSignature() {
            return format(toArray(SubnetUtils.this.address)) + "/" + Integer.bitCount(SubnetUtils.this.netmask);
        }

        public String getHighAddress() {
            return format(toArray(high()));
        }

        public String getLowAddress() {
            return format(toArray(low()));
        }

        public String getNetmask() {
            return format(toArray(SubnetUtils.this.netmask));
        }

        public String getNetworkAddress() {
            return format(toArray(SubnetUtils.this.network));
        }

        public String getNextAddress() {
            return format(toArray(SubnetUtils.this.address + 1));
        }

        public String getPreviousAddress() {
            return format(toArray(SubnetUtils.this.address - 1));
        }

        private int high() {
            if (SubnetUtils.this.isInclusiveHostCount()) {
                return SubnetUtils.this.broadcast;
            }
            if (broadcastLong() - networkLong() > 1) {
                return SubnetUtils.this.broadcast - 1;
            }
            return 0;
        }

        public boolean isInRange(int i) {
            if (i == 0) {
                return false;
            }
            long j = i & 4294967295L;
            return j >= (((long) low()) & 4294967295L) && j <= (4294967295L & ((long) high()));
        }

        public boolean isInRange(String str) {
            return isInRange(SubnetUtils.toInteger(str));
        }

        private int low() {
            if (SubnetUtils.this.isInclusiveHostCount()) {
                return SubnetUtils.this.network;
            }
            if (broadcastLong() - networkLong() > 1) {
                return SubnetUtils.this.network + 1;
            }
            return 0;
        }

        private long networkLong() {
            return SubnetUtils.this.network & 4294967295L;
        }

        private int[] toArray(int i) {
            int[] iArr = new int[4];
            for (int i2 = 3; i2 >= 0; i2--) {
                iArr[i2] = iArr[i2] | ((i >>> ((3 - i2) * 8)) & 255);
            }
            return iArr;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CIDR Signature:\t[");
            sb.append(getCidrSignature()).append("]\n  Netmask: [").append(getNetmask()).append("]\n  Network: [").append(getNetworkAddress()).append("]\n  Broadcast: [").append(getBroadcastAddress()).append("]\n  First address: [").append(getLowAddress()).append("]\n  Last address: [").append(getHighAddress()).append("]\n  Address Count: [").append(getAddressCountLong()).append("]\n");
            return sb.toString();
        }
    }

    private static int matchAddress(Matcher matcher) {
        int i = 0;
        for (int i2 = 1; i2 <= 4; i2++) {
            i |= (rangeCheck(Integer.parseInt(matcher.group(i2)), 0, 255) & 255) << ((4 - i2) * 8);
        }
        return i;
    }

    private static int rangeCheck(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalArgumentException("Value [" + i + "] not in range [" + i2 + "," + i3 + "]");
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInteger(String str) {
        Matcher matcher = ADDRESS_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matchAddress(matcher);
        }
        throw new IllegalArgumentException(String.format(PARSE_FAIL, str));
    }

    public SubnetUtils(String str) {
        Matcher matcher = CIDR_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(String.format(PARSE_FAIL, str));
        }
        int matchAddress = matchAddress(matcher);
        this.address = matchAddress;
        int rangeCheck = (int) (BodyPartID.bodyIdMax << (32 - rangeCheck(Integer.parseInt(matcher.group(5)), 0, 32)));
        this.netmask = rangeCheck;
        int i = matchAddress & rangeCheck;
        this.network = i;
        this.broadcast = i | (~rangeCheck);
    }

    public SubnetUtils(String str, String str2) {
        int integer = toInteger(str);
        this.address = integer;
        int integer2 = toInteger(str2);
        this.netmask = integer2;
        if (((-integer2) & integer2) - 1 != (~integer2)) {
            throw new IllegalArgumentException(String.format(PARSE_FAIL, str2));
        }
        int i = integer & integer2;
        this.network = i;
        this.broadcast = i | (~integer2);
    }

    public final SubnetInfo getInfo() {
        return new SubnetInfo();
    }

    public SubnetUtils getNext() {
        return new SubnetUtils(getInfo().getNextAddress(), getInfo().getNetmask());
    }

    public SubnetUtils getPrevious() {
        return new SubnetUtils(getInfo().getPreviousAddress(), getInfo().getNetmask());
    }

    public boolean isInclusiveHostCount() {
        return this.inclusiveHostCount;
    }

    public void setInclusiveHostCount(boolean z) {
        this.inclusiveHostCount = z;
    }

    public String toString() {
        return getInfo().toString();
    }
}
