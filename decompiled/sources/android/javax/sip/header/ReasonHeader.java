package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface ReasonHeader extends Parameters, Header {
    public static final String NAME = "Reason";

    int getCause();

    String getProtocol();

    String getText();

    void setCause(int i) throws InvalidArgumentException;

    void setProtocol(String str) throws ParseException;

    void setText(String str) throws ParseException;
}
