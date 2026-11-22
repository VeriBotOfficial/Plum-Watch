package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/assets/DefaultMediatedAssetFactory;", "Lcom/monetization/ads/mediation/nativeads/assets/MediatedAssetFactory;", "", "resourceId", "", "makeSponsored", "(I)Ljava/lang/String;", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "makeFeedback", "(I)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "Landroid/content/Context;", "context", "Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedSponsoredFactory;", "defaultMediatedSponsoredFactory", "Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedFeedbackFactory;", "defaultMediatedFeedbackFactory", "<init>", "(Landroid/content/Context;Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedSponsoredFactory;Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedFeedbackFactory;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12711a;
    private final DefaultMediatedSponsoredFactory b;
    private final DefaultMediatedFeedbackFactory c;

    public DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultMediatedSponsoredFactory, "defaultMediatedSponsoredFactory");
        Intrinsics.checkNotNullParameter(defaultMediatedFeedbackFactory, "defaultMediatedFeedbackFactory");
        this.f12711a = context;
        this.b = defaultMediatedSponsoredFactory;
        this.c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    public MediatedNativeAdImage makeFeedback(int resourceId) {
        return this.c.makeFeedback(this.f12711a, resourceId);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    public String makeSponsored(int resourceId) {
        return this.b.makeSponsored(this.f12711a, resourceId);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
