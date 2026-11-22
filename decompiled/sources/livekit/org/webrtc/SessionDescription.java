package livekit.org.webrtc;

import java.util.Locale;

/* loaded from: classes8.dex */
public class SessionDescription {
    public final String description;
    public final Type type;

    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }

        public static Type fromCanonicalForm(String canonical) {
            return (Type) valueOf(Type.class, canonical.toUpperCase(Locale.US));
        }
    }

    public SessionDescription(Type type, String description) {
        this.type = type;
        this.description = description;
    }

    String getDescription() {
        return this.description;
    }

    String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
