package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidTestDataInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "Lcom/unity3d/ads/core/domain/GetTestDataInfo;", "androidManifestIntPropertyReader", "Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "(Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;)V", "invoke", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        Intrinsics.checkNotNullParameter(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.INSTANCE;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        return _create._build();
    }
}
