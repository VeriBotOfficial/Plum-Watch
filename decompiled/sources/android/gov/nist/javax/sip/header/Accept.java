package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.AcceptHeader;

/* loaded from: classes.dex */
public final class Accept extends ParametersHeader implements AcceptHeader {
    private static final long serialVersionUID = -7866187924308658151L;
    protected MediaRange mediaRange;

    public Accept() {
        super("Accept");
    }

    @Override // android.javax.sip.header.AcceptHeader
    public boolean allowsAllContentTypes() {
        MediaRange mediaRange = this.mediaRange;
        return mediaRange != null && mediaRange.type.compareTo("*") == 0;
    }

    @Override // android.javax.sip.header.AcceptHeader
    public boolean allowsAllContentSubTypes() {
        MediaRange mediaRange = this.mediaRange;
        return mediaRange != null && mediaRange.getSubtype().compareTo("*") == 0;
    }

    protected String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            mediaRange.encode(sb);
        }
        if (this.parameters != null && !this.parameters.isEmpty()) {
            sb.append(';');
            this.parameters.encode(sb);
        }
        return sb;
    }

    public MediaRange getMediaRange() {
        return this.mediaRange;
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getType();
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentSubType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getSubtype();
    }

    @Override // android.javax.sip.header.AcceptHeader
    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public boolean hasQValue() {
        return super.hasParameter("q");
    }

    public void removeQValue() {
        super.removeParameter("q");
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentSubType(String str) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setSubtype(str);
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentType(String str) {
        if (this.mediaRange == null) {
            this.mediaRange = new MediaRange();
        }
        this.mediaRange.setType(str);
    }

    @Override // android.javax.sip.header.AcceptHeader
    public void setQValue(float f) throws InvalidArgumentException {
        if (f == -1.0f) {
            super.removeParameter("q");
        }
        super.setParameter("q", f);
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Accept accept = (Accept) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            accept.mediaRange = (MediaRange) mediaRange.clone();
        }
        return accept;
    }
}
