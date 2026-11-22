package com.hispark.clouddiag.manager;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceIdentityIndex.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/hispark/clouddiag/manager/DeviceIdentityIndex;", "", "<init>", "()V", "registeredDeviceIds", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "boardSnByDeviceId", "", "deviceIdByBoardSn", "deviceIdsByAlias", "Lcom/hispark/clouddiag/manager/IdentityAlias;", "", "aliasesByDeviceId", "", "previousDeviceIds", "rememberDevice", "", "deviceId", "remember", "boardSn", "resolveOrNull", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "resolve", "resolveFirst", "candidates", "", "rename", "oldDeviceId", "newDeviceId", "forgetBoardInfo", "remove", SDPKeywords.CLEAR, "", "matchingDeviceIds", "refreshAliases", "removeAliases", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceIdentityIndex {
    private final LinkedHashSet<String> registeredDeviceIds = new LinkedHashSet<>();
    private final Map<String, String> boardSnByDeviceId = new LinkedHashMap();
    private final Map<String, String> deviceIdByBoardSn = new LinkedHashMap();
    private final Map<IdentityAlias, Set<String>> deviceIdsByAlias = new LinkedHashMap();
    private final Map<String, Set<IdentityAlias>> aliasesByDeviceId = new LinkedHashMap();
    private final Map<String, Set<String>> previousDeviceIds = new LinkedHashMap();

    public final synchronized boolean rememberDevice(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        if (StringsKt.isBlank(deviceId)) {
            return false;
        }
        boolean add = this.registeredDeviceIds.add(deviceId);
        refreshAliases(deviceId);
        return add;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r6) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean remember(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "deviceId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "boardSn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L95
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L95
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)     // Catch: java.lang.Throwable -> L95
            r1 = 0
            if (r0 != 0) goto L93
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L95
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L20
            goto L93
        L20:
            java.util.LinkedHashSet<java.lang.String> r0 = r5.registeredDeviceIds     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.add(r6)     // Catch: java.lang.Throwable -> L95
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.boardSnByDeviceId     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r2.put(r6, r7)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L95
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L51
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L3a
            goto L51
        L3a:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)     // Catch: java.lang.Throwable -> L95
            if (r3 != 0) goto L51
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.deviceIdByBoardSn     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L95
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L51
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.deviceIdByBoardSn     // Catch: java.lang.Throwable -> L95
            r3.remove(r2)     // Catch: java.lang.Throwable -> L95
        L51:
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.deviceIdByBoardSn     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r3.put(r7, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L95
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L7f
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L65
            goto L7f
        L65:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto L7f
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.boardSnByDeviceId     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L95
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r7)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L7c
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.boardSnByDeviceId     // Catch: java.lang.Throwable -> L95
            r4.remove(r3)     // Catch: java.lang.Throwable -> L95
        L7c:
            r5.refreshAliases(r3)     // Catch: java.lang.Throwable -> L95
        L7f:
            r5.refreshAliases(r6)     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L90
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L90
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L91
        L90:
            r1 = 1
        L91:
            monitor-exit(r5)
            return r1
        L93:
            monitor-exit(r5)
            return r1
        L95:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.clouddiag.manager.DeviceIdentityIndex.remember(java.lang.String, java.lang.String):boolean");
    }

    public final synchronized String resolveOrNull(String identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        return (String) CollectionsKt.singleOrNull(matchingDeviceIds(identity));
    }

    public final synchronized String resolve(String identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        String resolveOrNull = resolveOrNull(identity);
        if (resolveOrNull != null) {
            identity = resolveOrNull;
        }
        return identity;
    }

    public final synchronized String rename(String oldDeviceId, String newDeviceId) {
        Intrinsics.checkNotNullParameter(oldDeviceId, "oldDeviceId");
        Intrinsics.checkNotNullParameter(newDeviceId, "newDeviceId");
        if (Intrinsics.areEqual(oldDeviceId, newDeviceId)) {
            return this.boardSnByDeviceId.get(oldDeviceId);
        }
        if (StringsKt.isBlank(newDeviceId)) {
            throw new IllegalArgumentException("newDeviceId must not be blank".toString());
        }
        if (this.registeredDeviceIds.contains(newDeviceId)) {
            throw new IllegalArgumentException("Cannot rename to another registered device".toString());
        }
        Set<String> matchingDeviceIds = matchingDeviceIds(newDeviceId);
        if (!(matchingDeviceIds instanceof Collection) || !matchingDeviceIds.isEmpty()) {
            Iterator<T> it = matchingDeviceIds.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.areEqual((String) it.next(), oldDeviceId)) {
                    throw new IllegalArgumentException("Cannot rename to another device's alias".toString());
                }
            }
        }
        Set<String> set = this.previousDeviceIds.get(oldDeviceId);
        if (set == null) {
            set = SetsKt.emptySet();
        }
        Set<String> plus = SetsKt.plus(set, oldDeviceId);
        String remove = remove(oldDeviceId);
        this.previousDeviceIds.put(newDeviceId, plus);
        rememberDevice(newDeviceId);
        String str = remove;
        if (str != null && !StringsKt.isBlank(str)) {
            remember(newDeviceId, remove);
        }
        return remove;
    }

    public final synchronized String forgetBoardInfo(String deviceId) {
        String remove;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        remove = this.boardSnByDeviceId.remove(deviceId);
        String str = remove;
        if (str != null && !StringsKt.isBlank(str) && Intrinsics.areEqual(this.deviceIdByBoardSn.get(remove), deviceId)) {
            this.deviceIdByBoardSn.remove(remove);
        }
        refreshAliases(deviceId);
        return remove;
    }

    public final synchronized String remove(String deviceId) {
        String remove;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.registeredDeviceIds.remove(deviceId);
        remove = this.boardSnByDeviceId.remove(deviceId);
        String str = remove;
        if (str != null && !StringsKt.isBlank(str) && Intrinsics.areEqual(this.deviceIdByBoardSn.get(remove), deviceId)) {
            this.deviceIdByBoardSn.remove(remove);
        }
        removeAliases(deviceId);
        this.previousDeviceIds.remove(deviceId);
        return remove;
    }

    public final synchronized void clear() {
        this.registeredDeviceIds.clear();
        this.boardSnByDeviceId.clear();
        this.deviceIdByBoardSn.clear();
        this.deviceIdsByAlias.clear();
        this.aliasesByDeviceId.clear();
        this.previousDeviceIds.clear();
    }

    private final Set<String> matchingDeviceIds(String identity) {
        List identityAliases;
        identityAliases = DeviceIdentityIndexKt.identityAliases(identity);
        Iterator it = identityAliases.iterator();
        while (it.hasNext()) {
            Set<String> set = this.deviceIdsByAlias.get((IdentityAlias) it.next());
            Set<String> set2 = set;
            if (set2 != null && !set2.isEmpty()) {
                return CollectionsKt.toSet(set);
            }
        }
        return SetsKt.emptySet();
    }

    private final void refreshAliases(String deviceId) {
        List identityAliases;
        List identityAliases2;
        List identityAliases3;
        removeAliases(deviceId);
        if (this.registeredDeviceIds.contains(deviceId)) {
            LinkedHashSet<IdentityAlias> linkedHashSet = new LinkedHashSet();
            identityAliases = DeviceIdentityIndexKt.identityAliases(deviceId);
            linkedHashSet.addAll(identityAliases);
            Set<String> set = this.previousDeviceIds.get(deviceId);
            if (set == null) {
                set = SetsKt.emptySet();
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                identityAliases3 = DeviceIdentityIndexKt.identityAliases((String) it.next());
                linkedHashSet.addAll(identityAliases3);
            }
            String str = this.boardSnByDeviceId.get(deviceId);
            if (str != null) {
                identityAliases2 = DeviceIdentityIndexKt.identityAliases(str);
                linkedHashSet.addAll(identityAliases2);
            }
            for (IdentityAlias identityAlias : linkedHashSet) {
                Map<IdentityAlias, Set<String>> map = this.deviceIdsByAlias;
                LinkedHashSet linkedHashSet2 = map.get(identityAlias);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    map.put(identityAlias, linkedHashSet2);
                }
                linkedHashSet2.add(deviceId);
            }
            this.aliasesByDeviceId.put(deviceId, linkedHashSet);
        }
    }

    private final void removeAliases(String deviceId) {
        Set<IdentityAlias> remove = this.aliasesByDeviceId.remove(deviceId);
        if (remove != null) {
            for (IdentityAlias identityAlias : remove) {
                Set<String> set = this.deviceIdsByAlias.get(identityAlias);
                if (set != null) {
                    set.remove(deviceId);
                    if (set.isEmpty()) {
                        this.deviceIdsByAlias.remove(identityAlias);
                    }
                }
            }
        }
    }

    public final synchronized String resolveFirst(Iterable<String> candidates) {
        Intrinsics.checkNotNullParameter(candidates, "candidates");
        Iterator<String> it = candidates.iterator();
        while (it.hasNext()) {
            Set<String> matchingDeviceIds = matchingDeviceIds(it.next());
            if (!matchingDeviceIds.isEmpty()) {
                return (String) CollectionsKt.singleOrNull(matchingDeviceIds);
            }
        }
        return null;
    }
}
