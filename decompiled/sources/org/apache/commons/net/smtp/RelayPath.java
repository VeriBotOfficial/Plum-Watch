package org.apache.commons.net.smtp;

import android.gov.nist.core.Separators;
import java.util.Enumeration;
import java.util.Vector;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public final class RelayPath {
    private final String emailAddress;
    private final Vector<String> path = new Vector<>();

    public RelayPath(String str) {
        this.emailAddress = str;
    }

    public void addRelay(String str) {
        this.path.addElement(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Separators.LESS_THAN);
        Enumeration<String> elements = this.path.elements();
        if (elements.hasMoreElements()) {
            sb.append('@');
            sb.append(elements.nextElement());
            while (elements.hasMoreElements()) {
                sb.append(",@");
                sb.append(elements.nextElement());
            }
            sb.append(AbstractJsonLexerKt.COLON);
        }
        sb.append(this.emailAddress);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
