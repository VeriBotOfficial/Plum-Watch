package android.javax.sip.header;

import java.text.ParseException;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface Parameters {
    String getParameter(String str);

    Iterator getParameterNames();

    void removeParameter(String str);

    void setParameter(String str, String str2) throws ParseException;
}
