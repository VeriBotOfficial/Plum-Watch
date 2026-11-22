package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3105ak implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f18187a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public C3105ak(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f18187a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = obj;
    }

    public final C3105ak a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C3105ak(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105ak)) {
            return false;
        }
        C3105ak c3105ak = (C3105ak) obj;
        return Intrinsics.areEqual(this.f18187a, c3105ak.f18187a) && Intrinsics.areEqual(this.b, c3105ak.b) && Intrinsics.areEqual(this.c, c3105ak.c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f18187a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f18187a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f18187a + ", remoteConfigMetaInfo=" + this.b + ", featuresConfig=" + this.c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f18187a;
    }

    public static C3105ak a(C3105ak c3105ak, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c3105ak.f18187a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c3105ak.b;
        }
        if ((i & 4) != 0) {
            obj = c3105ak.c;
        }
        c3105ak.getClass();
        return new C3105ak(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
