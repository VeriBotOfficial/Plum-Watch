package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.AcceptLanguageHeader;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AcceptLanguage extends ParametersHeader implements AcceptLanguageHeader {
    private static final long serialVersionUID = -4473982069737324919L;
    protected String languageRange;

    public AcceptLanguage() {
        super("Accept-Language");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        String str = this.languageRange;
        if (str != null) {
            sb.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";").append(this.parameters.encode());
        }
        return sb;
    }

    public String getLanguageRange() {
        return this.languageRange;
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public float getQValue() {
        if (hasParameter("q")) {
            return ((Float) this.parameters.getValue("q")).floatValue();
        }
        return -1.0f;
    }

    public boolean hasQValue() {
        return hasParameter("q");
    }

    public void removeQValue() {
        removeParameter("q");
    }

    public void setLanguageRange(String str) {
        this.languageRange = str.trim();
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public void setQValue(float f) throws InvalidArgumentException {
        double d = f;
        if (d < 0.0d || d > 1.0d) {
            throw new InvalidArgumentException("qvalue out of range!");
        }
        if (f == -1.0f) {
            removeParameter("q");
        } else {
            setParameter(new NameValue("q", Float.valueOf(f)));
        }
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public Locale getAcceptLanguage() {
        String str = this.languageRange;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            return new Locale(this.languageRange.substring(0, indexOf), this.languageRange.substring(indexOf + 1));
        }
        return new Locale(this.languageRange);
    }

    @Override // android.javax.sip.header.AcceptLanguageHeader
    public void setAcceptLanguage(Locale locale) {
        if ("".equals(locale.getCountry())) {
            this.languageRange = locale.getLanguage();
        } else {
            this.languageRange = locale.getLanguage() + '-' + locale.getCountry();
        }
    }
}
