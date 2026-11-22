package android.gov.nist.core;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class Host extends GenericObject {
    protected static final int HOSTNAME = 1;
    protected static final int IPV4ADDRESS = 2;
    protected static final int IPV6ADDRESS = 3;
    private static final long serialVersionUID = -7233564517978323344L;
    private static boolean stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    protected int addressType;
    protected String hostname;
    private InetAddress inetAddress;

    public Host() {
        this.addressType = 1;
    }

    public Host(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("null host name");
        }
        setHost(str, 2);
    }

    public Host(String str, int i) {
        setHost(str, i);
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        if (this.addressType == 3 && !isIPv6Reference(this.hostname)) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.hostname).append(AbstractJsonLexerKt.END_LIST);
            return sb;
        }
        sb.append(this.hostname);
        return sb;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            return ((Host) obj).hostname.equals(this.hostname);
        }
        return false;
    }

    public String getHostname() {
        return this.hostname;
    }

    public String getAddress() {
        return this.hostname;
    }

    public String getIpAddress() {
        String str = this.hostname;
        if (str == null) {
            return null;
        }
        int i = this.addressType;
        if (i == 1) {
            try {
                if (this.inetAddress == null) {
                    this.inetAddress = InetAddress.getByName(str);
                }
                return this.inetAddress.getHostAddress();
            } catch (UnknownHostException e) {
                dbgPrint("Could not resolve hostname " + e);
            }
        } else {
            if (i != 3) {
                return str;
            }
            try {
                String inetAddress = getInetAddress().toString();
                int indexOf = inetAddress.indexOf("/");
                if (indexOf != -1) {
                    inetAddress = inetAddress.substring(indexOf + 1, inetAddress.length());
                }
                return this.hostname.startsWith("[") ? "[" + inetAddress + AbstractJsonLexerKt.END_LIST : inetAddress;
            } catch (UnknownHostException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void setHostname(String str) {
        setHost(str, 1);
    }

    public void setHostAddress(String str) {
        setHost(str, 2);
    }

    private void setHost(String str, int i) {
        int indexOf;
        this.inetAddress = null;
        if (isIPv6Address(str)) {
            this.addressType = 3;
        } else {
            this.addressType = i;
        }
        if (str != null) {
            String trim = str.trim();
            this.hostname = trim;
            if (this.addressType == 1) {
                this.hostname = trim.toLowerCase();
            }
            if (this.addressType == 3 && stripAddressScopeZones && (indexOf = this.hostname.indexOf(37)) != -1) {
                String substring = this.hostname.substring(0, indexOf);
                this.hostname = substring;
                if (!substring.startsWith("[") || this.hostname.endsWith("]")) {
                    return;
                }
                this.hostname += AbstractJsonLexerKt.END_LIST;
            }
        }
    }

    public void setAddress(String str) {
        setHostAddress(str);
    }

    public boolean isHostname() {
        return this.addressType == 1;
    }

    public boolean isIPAddress() {
        return this.addressType != 1;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        String str = this.hostname;
        if (str == null) {
            return null;
        }
        InetAddress inetAddress = this.inetAddress;
        if (inetAddress != null) {
            return inetAddress;
        }
        InetAddress byName = InetAddress.getByName(str);
        this.inetAddress = byName;
        return byName;
    }

    private boolean isIPv6Address(String str) {
        return (str == null || str.indexOf(58) == -1) ? false : true;
    }

    public static boolean isIPv6Reference(String str) {
        return str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']';
    }

    public int hashCode() {
        return getHostname().hashCode();
    }
}
