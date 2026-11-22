package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "developerConsentRepository", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        Intrinsics.checkNotNullParameter(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            if (r0 == 0) goto L14
            r0 = r6
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r1
            java.lang.Object r2 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r2
            java.lang.Object r3 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r3 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L81
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L42:
            kotlin.ResultKt.throwOnFailure(r6)
            gatewayprotocol.v1.UniversalRequestKt r6 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl$Companion r6 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.INSTANCE
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData$Builder r2 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r6 = r6._create(r2)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r5.sessionRepository
            com.google.protobuf.ByteString r2 = r2.getSessionToken()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L69
            r6.setSessionToken(r2)
            r0 = r5
            r3 = r6
            goto L87
        L69:
            com.unity3d.ads.core.domain.GetLimitedSessionToken r2 = r5.getLimitedSessionToken
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L7c
            return r1
        L7c:
            r1 = r6
            r2 = r1
            r3 = r2
            r6 = r0
            r0 = r5
        L81:
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) r6
            r1.setLimitedSessionToken(r6)
            r6 = r2
        L87:
            com.unity3d.ads.core.domain.GetSharedDataTimestamps r1 = r0.getSharedDataTimestamps
            gatewayprotocol.v1.TimestampsOuterClass$Timestamps r1 = r1.invoke()
            r6.setTimestamps(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()
            com.google.protobuf.Timestamp r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.setSdkStartTime(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()
            com.google.protobuf.Timestamp r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.setAppStartTime(r1)
            com.unity3d.ads.core.data.repository.DeveloperConsentRepository r1 = r0.developerConsentRepository
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent r1 = r1.getDeveloperConsent()
            r6.setDeveloperConsent(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r0 = r0.deviceInfoRepository
            gatewayprotocol.v1.PiiOuterClass$Pii r0 = r0.getPiiData()
            com.google.protobuf.ByteString r1 = r0.getAdvertisingId()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lc9
            com.google.protobuf.ByteString r1 = r0.getOpenAdvertisingTrackingId()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lcc
        Lc9:
            r6.setPii(r0)
        Lcc:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r6 = r3._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
