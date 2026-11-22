package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class CallIdentifier extends SIPObject {
    private static final long serialVersionUID = 7314773655675451377L;
    protected String host;
    protected String localId;

    public CallIdentifier() {
    }

    public CallIdentifier(String str, String str2) {
        this.localId = str;
        this.host = str2;
    }

    public CallIdentifier(String str) throws IllegalArgumentException {
        setCallID(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(this.localId);
        if (this.host != null) {
            sb.append(Separators.AT).append(this.host);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        CallIdentifier callIdentifier = (CallIdentifier) obj;
        if (this.localId.compareTo(callIdentifier.localId) != 0) {
            return false;
        }
        String str = this.host;
        String str2 = callIdentifier.host;
        if (str == str2) {
            return true;
        }
        return (str != null || str2 == null) && (str == null || str2 != null) && str.compareToIgnoreCase(str2) == 0;
    }

    public int hashCode() {
        String str = this.localId;
        if (str == null) {
            throw new UnsupportedOperationException("Hash code called before id is set");
        }
        return str.hashCode();
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getHost() {
        return this.host;
    }

    public void setLocalId(String str) {
        this.localId = str;
    }

    public void setCallID(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("NULL!");
        }
        int indexOf = str.indexOf(64);
        if (indexOf == -1) {
            this.localId = str;
            this.host = null;
            return;
        }
        this.localId = str.substring(0, indexOf);
        String substring = str.substring(indexOf + 1, str.length());
        this.host = substring;
        if (this.localId == null || substring == null) {
            throw new IllegalArgumentException("CallID  must be token@token or token");
        }
    }

    public void setHost(String str) {
        this.host = str;
    }
}
