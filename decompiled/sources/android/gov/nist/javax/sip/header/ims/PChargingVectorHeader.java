package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface PChargingVectorHeader extends Header, Parameters {
    public static final String NAME = "P-Charging-Vector";

    String getICID();

    String getICIDGeneratedAt();

    String getOriginatingIOI();

    String getTerminatingIOI();

    void setICID(String str) throws ParseException;

    void setICIDGeneratedAt(String str) throws ParseException;

    void setOriginatingIOI(String str) throws ParseException;

    void setTerminatingIOI(String str) throws ParseException;
}
