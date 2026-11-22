package io.livekit.android.token;

import com.auth0.android.jwt.Claim;
import com.auth0.android.jwt.JWT;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenPayload.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0013\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R/\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010 \u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b!\u0010\u0013R\u0013\u0010#\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013R\u001d\u0010(\u001a\u0004\u0018\u00010)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b*\u0010+¨\u00065"}, d2 = {"Lio/livekit/android/token/TokenPayload;", "", "token", "", "(Ljava/lang/String;)V", "attributes", "", "getAttributes$annotations", "()V", "getAttributes", "()Ljava/util/Map;", "attributes$delegate", "Lkotlin/Lazy;", "expiresAt", "Ljava/util/Date;", "getExpiresAt", "()Ljava/util/Date;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "getIdentity", "()Ljava/lang/String;", "identity$delegate", "issuedAt", "getIssuedAt", "issuer", "getIssuer", "jwt", "Lcom/auth0/android/jwt/JWT;", "getJwt", "()Lcom/auth0/android/jwt/JWT;", "metadata", "getMetadata", "metadata$delegate", "name", "getName", "name$delegate", "notBefore", "getNotBefore", "subject", "getSubject", "getToken", "video", "Lio/livekit/android/token/VideoGrants;", "getVideo", "()Lio/livekit/android/token/VideoGrants;", "video$delegate", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TokenPayload {

    /* renamed from: attributes$delegate, reason: from kotlin metadata */
    private final Lazy attributes;

    /* renamed from: identity$delegate, reason: from kotlin metadata */
    private final Lazy identity;
    private final JWT jwt;

    /* renamed from: metadata$delegate, reason: from kotlin metadata */
    private final Lazy metadata;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final Lazy name;
    private final String token;

    /* renamed from: video$delegate, reason: from kotlin metadata */
    private final Lazy video;

    public static /* synthetic */ TokenPayload copy$default(TokenPayload tokenPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenPayload.token;
        }
        return tokenPayload.copy(str);
    }

    public static /* synthetic */ void getAttributes$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final TokenPayload copy(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new TokenPayload(token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenPayload) && Intrinsics.areEqual(this.token, ((TokenPayload) other).token);
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "TokenPayload(token=" + this.token + ')';
    }

    public TokenPayload(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.jwt = new JWT(token);
        this.name = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<String>() { // from class: io.livekit.android.token.TokenPayload$name$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                Claim claim = TokenPayload.this.getJwt().getClaims().get("name");
                if (claim != null) {
                    return claim.asString();
                }
                return null;
            }
        });
        this.identity = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<String>() { // from class: io.livekit.android.token.TokenPayload$identity$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String subject = TokenPayload.this.getSubject();
                if (subject != null) {
                    return subject;
                }
                Claim claim = TokenPayload.this.getJwt().getClaims().get(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                if (claim != null) {
                    return claim.asString();
                }
                return null;
            }
        });
        this.metadata = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<String>() { // from class: io.livekit.android.token.TokenPayload$metadata$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                Claim claim = TokenPayload.this.getJwt().getClaims().get("metadata");
                if (claim != null) {
                    return claim.asString();
                }
                return null;
            }
        });
        this.attributes = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Map<String, ? extends String>>() { // from class: io.livekit.android.token.TokenPayload$attributes$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends String> invoke() {
                Claim claim = TokenPayload.this.getJwt().getClaims().get("attributes");
                Map<String, ? extends String> map = claim != null ? (Map) claim.asObject(Map.class) : null;
                if (map instanceof Map) {
                    return map;
                }
                return null;
            }
        });
        this.video = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<VideoGrants>() { // from class: io.livekit.android.token.TokenPayload$video$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VideoGrants invoke() {
                Claim claim = TokenPayload.this.getJwt().getClaims().get("video");
                if (claim != null) {
                    return (VideoGrants) claim.asObject(VideoGrants.class);
                }
                return null;
            }
        });
    }

    public final String getToken() {
        return this.token;
    }

    public final JWT getJwt() {
        return this.jwt;
    }

    public final String getIssuer() {
        return this.jwt.getIssuer();
    }

    public final String getSubject() {
        return this.jwt.getSubject();
    }

    public final Date getExpiresAt() {
        return this.jwt.getExpiresAt();
    }

    public final Date getNotBefore() {
        return this.jwt.getNotBefore();
    }

    public final Date getIssuedAt() {
        return this.jwt.getIssuedAt();
    }

    public final String getName() {
        return (String) this.name.getValue();
    }

    public final String getIdentity() {
        return (String) this.identity.getValue();
    }

    public final String getMetadata() {
        return (String) this.metadata.getValue();
    }

    public final Map<String, String> getAttributes() {
        return (Map) this.attributes.getValue();
    }

    public final VideoGrants getVideo() {
        return (VideoGrants) this.video.getValue();
    }
}
