package android.gov.nist.javax.sip.header;

import android.javax.sip.header.Parameters;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface ParametersExt extends Parameters {
    String getParameter(String str, boolean z);

    void setQuotedParameter(String str, String str2) throws ParseException;
}
