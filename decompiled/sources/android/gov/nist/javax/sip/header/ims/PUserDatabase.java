package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PUserDatabase extends ParametersHeader implements PUserDatabaseHeader, SIPHeaderNamesIms, ExtensionHeader {
    private String databaseName;

    public PUserDatabase(String str) {
        super("P-User-Database");
        this.databaseName = str;
    }

    public PUserDatabase() {
        super("P-User-Database");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public String getDatabaseName() {
        return this.databaseName;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public void setDatabaseName(String str) {
        if (str == null || str.equals(" ")) {
            throw new NullPointerException("Database name is null");
        }
        if (!str.contains("aaa://")) {
            this.databaseName = "aaa://" + str;
        } else {
            this.databaseName = str;
        }
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Separators.LESS_THAN);
        if (getDatabaseName() != null) {
            sb.append(getDatabaseName());
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        sb.append(Separators.GREATER_THAN);
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof PUserDatabaseHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PUserDatabase) super.clone();
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
