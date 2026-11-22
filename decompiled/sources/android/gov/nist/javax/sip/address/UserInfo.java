package android.gov.nist.javax.sip.address;

/* loaded from: classes.dex */
public final class UserInfo extends NetObject {
    public static final int TELEPHONE_SUBSCRIBER = 1;
    public static final int USER = 2;
    private static final long serialVersionUID = 7268593273924256144L;
    protected String password;
    protected String user;
    protected int userType;

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        if (this.userType != userInfo.userType || !this.user.equalsIgnoreCase(userInfo.user)) {
            return false;
        }
        String str = this.password;
        if (str != null && userInfo.password == null) {
            return false;
        }
        String str2 = userInfo.password;
        if (str2 != null && str == null) {
            return false;
        }
        if (str == str2) {
            return true;
        }
        return str.equals(str2);
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        if (this.password != null) {
            sb.append(this.user).append(":").append(this.password);
            return sb;
        }
        sb.append(this.user);
        return sb;
    }

    public void clearPassword() {
        this.password = null;
    }

    public int getUserType() {
        return this.userType;
    }

    public String getUser() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUser(String str) {
        if (str == null || "".equals(str)) {
            return;
        }
        this.user = str;
        if (str != null && (str.indexOf("#") >= 0 || str.indexOf(";") >= 0)) {
            setUserType(1);
        } else {
            setUserType(2);
        }
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setUserType(int i) throws IllegalArgumentException {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Parameter not in range");
        }
        this.userType = i;
    }
}
