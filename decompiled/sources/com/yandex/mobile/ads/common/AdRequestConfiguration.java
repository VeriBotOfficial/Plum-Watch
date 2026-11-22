package com.yandex.mobile.ads.common;

import android.location.Location;
import com.anythink.core.api.ATCustomRuleKeys;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.mobile.ads.impl.v3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00013J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010,\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "getAdUnitId", "()Ljava/lang/String;", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "b", "getAge", ATCustomRuleKeys.AGE, "c", "getGender", "gender", "d", "getContextQuery", "contextQuery", "", "e", "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "contextTags", "Landroid/location/Location;", "f", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "location", "", "g", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "h", "getBiddingData", "biddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", "i", "Lcom/yandex/mobile/ads/common/AdTheme;", "getPreferredTheme", "()Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdRequestConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* renamed from: b, reason: from kotlin metadata */
    private final String age;

    /* renamed from: c, reason: from kotlin metadata */
    private final String gender;

    /* renamed from: d, reason: from kotlin metadata */
    private final String contextQuery;

    /* renamed from: e, reason: from kotlin metadata */
    private final List<String> contextTags;

    /* renamed from: f, reason: from kotlin metadata */
    private final Location location;

    /* renamed from: g, reason: from kotlin metadata */
    private final Map<String, String> parameters;

    /* renamed from: h, reason: from kotlin metadata */
    private final String biddingData;

    /* renamed from: i, reason: from kotlin metadata */
    private final AdTheme preferredTheme;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "", "Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "build", "()Lcom/yandex/mobile/ads/common/AdRequestConfiguration;", "", ATCustomRuleKeys.AGE, "setAge", "(Ljava/lang/String;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "contextQuery", "setContextQuery", "", "contextTags", "setContextTags", "(Ljava/util/List;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "gender", "setGender", "Landroid/location/Location;", "location", "setLocation", "(Landroid/location/Location;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "", "parameters", "setParameters", "(Ljava/util/Map;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", "biddingData", "setBiddingData", "Lcom/yandex/mobile/ads/common/AdTheme;", "preferredTheme", "setPreferredTheme", "(Lcom/yandex/mobile/ads/common/AdTheme;)Lcom/yandex/mobile/ads/common/AdRequestConfiguration$Builder;", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "<init>", "(Ljava/lang/String;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f14937a;
        private String b;
        private String c;
        private Location d;
        private String e;
        private List<String> f;
        private Map<String, String> g;
        private String h;
        private AdTheme i;

        public Builder(String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f14937a = adUnitId;
        }

        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f14937a, this.b, this.c, this.e, this.f, this.d, this.g, this.h, this.i, null);
        }

        public final Builder setAge(String age) {
            this.b = age;
            return this;
        }

        public final Builder setBiddingData(String biddingData) {
            this.h = biddingData;
            return this;
        }

        public final Builder setContextQuery(String contextQuery) {
            this.e = contextQuery;
            return this;
        }

        public final Builder setContextTags(List<String> contextTags) {
            this.f = contextTags;
            return this;
        }

        public final Builder setGender(String gender) {
            this.c = gender;
            return this;
        }

        public final Builder setLocation(Location location) {
            this.d = location;
            return this;
        }

        public final Builder setParameters(Map<String, String> parameters) {
            this.g = parameters;
            return this;
        }

        public final Builder setPreferredTheme(AdTheme preferredTheme) {
            this.i = preferredTheme;
            return this;
        }
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(AdRequestConfiguration.class, other.getClass())) {
            AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) other;
            if (Intrinsics.areEqual(this.adUnitId, adRequestConfiguration.adUnitId) && Intrinsics.areEqual(this.age, adRequestConfiguration.age) && Intrinsics.areEqual(this.gender, adRequestConfiguration.gender) && Intrinsics.areEqual(this.contextQuery, adRequestConfiguration.contextQuery) && Intrinsics.areEqual(this.contextTags, adRequestConfiguration.contextTags) && Intrinsics.areEqual(this.location, adRequestConfiguration.location) && Intrinsics.areEqual(this.parameters, adRequestConfiguration.parameters) && Intrinsics.areEqual(this.biddingData, adRequestConfiguration.biddingData) && this.preferredTheme == adRequestConfiguration.preferredTheme) {
                return true;
            }
        }
        return false;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getBiddingData() {
        return this.biddingData;
    }

    public final String getContextQuery() {
        return this.contextQuery;
    }

    public final List<String> getContextTags() {
        return this.contextTags;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final AdTheme getPreferredTheme() {
        return this.preferredTheme;
    }

    public int hashCode() {
        String str = this.age;
        int a2 = v3.a(this.adUnitId, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.gender;
        int hashCode = (a2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contextQuery;
        int hashCode2 = (hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.contextTags;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.location;
        int hashCode4 = (hashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.parameters;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.biddingData;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.preferredTheme;
        return hashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List<String> list, Location location, Map<String, String> map, String str5, AdTheme adTheme) {
        this.adUnitId = str;
        this.age = str2;
        this.gender = str3;
        this.contextQuery = str4;
        this.contextTags = list;
        this.location = location;
        this.parameters = map;
        this.biddingData = str5;
        this.preferredTheme = adTheme;
    }
}
