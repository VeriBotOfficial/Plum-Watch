package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pm2 implements MediaFile {

    /* renamed from: a, reason: collision with root package name */
    private final xn0 f16585a;

    public pm2(xn0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        this.f16585a = mediaFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm2) && Intrinsics.areEqual(this.f16585a, ((pm2) obj).f16585a);
    }

    public final int hashCode() {
        return this.f16585a.hashCode();
    }

    public final String toString() {
        return "YandexMediaFile(mediaFile=" + this.f16585a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, com.yandex.mobile.ads.impl.rc2
    public final String getUrl() {
        return this.f16585a.getUrl();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f16585a.getAdWidth();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f16585a.getAdHeight();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getMediaType() {
        return this.f16585a.getMediaType();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final Integer getBitrate() {
        return this.f16585a.getBitrate();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getApiFramework() {
        return this.f16585a.getApiFramework();
    }
}
