package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonGetTransactionRequest.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionDataList", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.util.List<gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionData> r6, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1
            if (r0 == 0) goto L14
            r0 = r7
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.L$4
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r6 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r6
            java.lang.Object r1 = r0.L$3
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r1 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r1
            java.lang.Object r2 = r0.L$2
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r2 = (gatewayprotocol.v1.TransactionEventRequestKt.Dsl) r2
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.CommonGetTransactionRequest r0 = (com.unity3d.ads.core.domain.events.CommonGetTransactionRequest) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L74
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            kotlin.ResultKt.throwOnFailure(r7)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl$Companion r7 = gatewayprotocol.v1.TransactionEventRequestKt.Dsl.INSTANCE
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest$Builder r2 = gatewayprotocol.v1.TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            gatewayprotocol.v1.TransactionEventRequestKt$Dsl r7 = r7._create(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r5.deviceInfoRepository
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r0.label = r3
            java.lang.Object r0 = r2.staticDeviceInfo(r0)
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r3 = r6
            r6 = r7
            r1 = r6
            r2 = r1
            r7 = r0
            r0 = r5
        L74:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r7 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r7
            r6.setStaticDeviceInfo(r7)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r0.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r6 = r6.getDynamicDeviceInfo()
            r1.setDynamicDeviceInfo(r6)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$StoreType r6 = gatewayprotocol.v1.TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY
            r1.setAppStore(r6)
            com.google.protobuf.kotlin.DslList r6 = r1.getTransactionData()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r1.addAllTransactionData(r6, r3)
            gatewayprotocol.v1.TransactionEventRequestOuterClass$TransactionEventRequest r6 = r2._build()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest.invoke(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
