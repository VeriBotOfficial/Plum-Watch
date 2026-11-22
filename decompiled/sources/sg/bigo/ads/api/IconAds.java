package sg.bigo.ads.api;

/* loaded from: classes7.dex */
public interface IconAds extends Ad {
    NativeAd[] getNativeAds();

    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(d dVar);
}
