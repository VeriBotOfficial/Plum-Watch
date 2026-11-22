package com.xmly.businesssdk.network.repository;

import com.xmly.businesssdk.network.RetrofitManager;
import com.xmly.businesssdk.network.api.AlbumApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlbumRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/xmly/businesssdk/network/repository/AlbumRepository;", "Lcom/xmly/businesssdk/network/repository/Repository;", "Lcom/xmly/businesssdk/network/api/AlbumApi;", "()V", "getApi", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AlbumRepository implements Repository<AlbumApi> {
    public static final AlbumRepository INSTANCE = new AlbumRepository();

    private AlbumRepository() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xmly.businesssdk.network.repository.Repository
    public AlbumApi getApi() {
        Object instance = RetrofitManager.instance(AlbumApi.class);
        Intrinsics.checkNotNullExpressionValue(instance, "instance(AlbumApi::class.java)");
        return (AlbumApi) instance;
    }
}
