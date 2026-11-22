package com.monetization.ads.mediation.nativeads;

import com.alipay.sdk.m.c0.d;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.d.n;
import com.caverock.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001:\u0001:B\u009f\u0001\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b8\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0019\u00101\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0019\u00107\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\u0015¨\u0006;"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets;", "", "", "a", "Ljava/lang/String;", "getAge", "()Ljava/lang/String;", ATCustomRuleKeys.AGE, "b", "getBody", "body", "c", "getCallToAction", "callToAction", "d", "getDomain", "domain", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "e", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "getFavicon", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "favicon", "f", "getIcon", "icon", "g", "getImage", "image", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", "h", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", "getMedia", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "i", "getPrice", "price", "j", "getRating", "rating", "k", "getReviewCount", "reviewCount", "l", "getSponsored", "sponsored", "m", "getTitle", "title", n.f4527a, "getWarning", "warning", "o", "getFeedback", "feedback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;)V", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class MediatedNativeAdAssets {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String age;

    /* renamed from: b, reason: from kotlin metadata */
    private final String body;

    /* renamed from: c, reason: from kotlin metadata */
    private final String callToAction;

    /* renamed from: d, reason: from kotlin metadata */
    private final String domain;

    /* renamed from: e, reason: from kotlin metadata */
    private final MediatedNativeAdImage favicon;

    /* renamed from: f, reason: from kotlin metadata */
    private final MediatedNativeAdImage icon;

    /* renamed from: g, reason: from kotlin metadata */
    private final MediatedNativeAdImage image;

    /* renamed from: h, reason: from kotlin metadata */
    private final MediatedNativeAdMedia media;

    /* renamed from: i, reason: from kotlin metadata */
    private final String price;

    /* renamed from: j, reason: from kotlin metadata */
    private final String rating;

    /* renamed from: k, reason: from kotlin metadata */
    private final String reviewCount;

    /* renamed from: l, reason: from kotlin metadata */
    private final String sponsored;

    /* renamed from: m, reason: from kotlin metadata */
    private final String title;

    /* renamed from: n, reason: from kotlin metadata */
    private final String warning;

    /* renamed from: o, reason: from kotlin metadata */
    private final MediatedNativeAdImage feedback;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b \u0010\bJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010\bJ\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b$\u0010\bJ\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b&\u0010\bJ\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b(\u0010\u0012¨\u0006+"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets$Builder;", "", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets;", "build", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets;", "", ATCustomRuleKeys.AGE, "setAge", "(Ljava/lang/String;)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets$Builder;", "body", "setBody", "callToAction", "setCallToAction", "domain", "setDomain", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "favicon", "setFavicon", "(Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets$Builder;", "icon", "setIcon", "image", "setImage", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "setMedia", "(Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdAssets$Builder;", "price", "setPrice", "rating", "setRating", "reviewCount", "setReviewCount", "sponsored", "setSponsored", "title", d.p, "warning", "setWarning", "feedback", "setFeedback", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f12706a;
        private String b;
        private String c;
        private String d;
        private MediatedNativeAdImage e;
        private MediatedNativeAdImage f;
        private MediatedNativeAdImage g;
        private MediatedNativeAdMedia h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private MediatedNativeAdImage o;

        public final MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this.f12706a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, null);
        }

        public final Builder setAge(String age) {
            this.f12706a = age;
            return this;
        }

        public final Builder setBody(String body) {
            this.b = body;
            return this;
        }

        public final Builder setCallToAction(String callToAction) {
            this.c = callToAction;
            return this;
        }

        public final Builder setDomain(String domain) {
            this.d = domain;
            return this;
        }

        public final Builder setFavicon(MediatedNativeAdImage favicon) {
            this.e = favicon;
            return this;
        }

        public final Builder setFeedback(MediatedNativeAdImage feedback) {
            this.o = feedback;
            return this;
        }

        public final Builder setIcon(MediatedNativeAdImage icon) {
            this.f = icon;
            return this;
        }

        public final Builder setImage(MediatedNativeAdImage image) {
            this.g = image;
            return this;
        }

        public final Builder setMedia(MediatedNativeAdMedia media) {
            this.h = media;
            return this;
        }

        public final Builder setPrice(String price) {
            this.i = price;
            return this;
        }

        public final Builder setRating(String rating) {
            this.j = rating;
            return this;
        }

        public final Builder setReviewCount(String reviewCount) {
            this.k = reviewCount;
            return this;
        }

        public final Builder setSponsored(String sponsored) {
            this.l = sponsored;
            return this;
        }

        public final Builder setTitle(String title) {
            this.m = title;
            return this;
        }

        public final Builder setWarning(String warning) {
            this.n = warning;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, mediatedNativeAdImage, mediatedNativeAdImage2, mediatedNativeAdImage3, mediatedNativeAdMedia, str5, str6, str7, str8, str9, str10, mediatedNativeAdImage4);
    }

    public final String getAge() {
        return this.age;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final MediatedNativeAdImage getFavicon() {
        return this.favicon;
    }

    public final MediatedNativeAdImage getFeedback() {
        return this.feedback;
    }

    public final MediatedNativeAdImage getIcon() {
        return this.icon;
    }

    public final MediatedNativeAdImage getImage() {
        return this.image;
    }

    public final MediatedNativeAdMedia getMedia() {
        return this.media;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getReviewCount() {
        return this.reviewCount;
    }

    public final String getSponsored() {
        return this.sponsored;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWarning() {
        return this.warning;
    }

    private MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4) {
        this.age = str;
        this.body = str2;
        this.callToAction = str3;
        this.domain = str4;
        this.favicon = mediatedNativeAdImage;
        this.icon = mediatedNativeAdImage2;
        this.image = mediatedNativeAdImage3;
        this.media = mediatedNativeAdMedia;
        this.price = str5;
        this.rating = str6;
        this.reviewCount = str7;
        this.sponsored = str8;
        this.title = str9;
        this.warning = str10;
        this.feedback = mediatedNativeAdImage4;
    }
}
