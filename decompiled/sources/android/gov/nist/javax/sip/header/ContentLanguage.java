package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ContentLanguageHeader;
import java.util.Locale;

/* loaded from: classes.dex */
public class ContentLanguage extends SIPHeader implements ContentLanguageHeader {
    private static final long serialVersionUID = -5195728427134181070L;
    protected Locale locale;

    public ContentLanguage() {
        super("Content-Language");
    }

    public ContentLanguage(String str) {
        super("Content-Language");
        setLanguageTag(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(getLanguageTag());
    }

    public String getLanguageTag() {
        if ("".equals(this.locale.getCountry())) {
            return this.locale.getLanguage();
        }
        return this.locale.getLanguage() + '-' + this.locale.getCountry();
    }

    public void setLanguageTag(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf >= 0) {
            this.locale = new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else {
            this.locale = new Locale(str);
        }
    }

    @Override // android.javax.sip.header.ContentLanguageHeader
    public Locale getContentLanguage() {
        return this.locale;
    }

    @Override // android.javax.sip.header.ContentLanguageHeader
    public void setContentLanguage(Locale locale) {
        this.locale = locale;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ContentLanguage contentLanguage = (ContentLanguage) super.clone();
        Locale locale = this.locale;
        if (locale != null) {
            contentLanguage.locale = (Locale) locale.clone();
        }
        return contentLanguage;
    }
}
