package com.facebook.react.soloader;

import com.facebook.soloader.ExternalSoMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenSourceMergedSoMapping.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u000bH\u0086 J\t\u0010\f\u001a\u00020\u000bH\u0086 J\t\u0010\r\u001a\u00020\u000bH\u0086 J\t\u0010\u000e\u001a\u00020\u000bH\u0086 J\t\u0010\u000f\u001a\u00020\u000bH\u0086 J\t\u0010\u0010\u001a\u00020\u000bH\u0086 J\t\u0010\u0011\u001a\u00020\u000bH\u0086 J\t\u0010\u0012\u001a\u00020\u000bH\u0086 J\t\u0010\u0013\u001a\u00020\u000bH\u0086 J\t\u0010\u0014\u001a\u00020\u000bH\u0086 J\t\u0010\u0015\u001a\u00020\u000bH\u0086 J\t\u0010\u0016\u001a\u00020\u000bH\u0086 J\t\u0010\u0017\u001a\u00020\u000bH\u0086 J\t\u0010\u0018\u001a\u00020\u000bH\u0086 J\t\u0010\u0019\u001a\u00020\u000bH\u0086 J\t\u0010\u001a\u001a\u00020\u000bH\u0086 J\t\u0010\u001b\u001a\u00020\u000bH\u0086 J\t\u0010\u001c\u001a\u00020\u000bH\u0086 J\t\u0010\u001d\u001a\u00020\u000bH\u0086 J\t\u0010\u001e\u001a\u00020\u000bH\u0086 J\t\u0010\u001f\u001a\u00020\u000bH\u0086 ¨\u0006 "}, d2 = {"Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;", "Lcom/facebook/soloader/ExternalSoMapping;", "<init>", "()V", "mapLibName", "", "input", "invokeJniOnload", "", "libraryName", "libfabricjni_so", "", "libhermes_executor_so", "libhermesinstancejni_so", "libhermestooling_so", "libjscexecutor_so", "libjscinstance_so", "libjscruntime_so", "libjsctooling_so", "libjsijniprofiler_so", "libjsinspector_so", "libmapbufferjni_so", "libreact_devsupportjni_so", "libreact_featureflagsjni_so", "libreact_newarchdefaults_so", "libreactnative_so", "libreactnativeblob_so", "libreactnativejni_so", "librninstance_so", "libturbomodulejsijni_so", "libuimanagerjni_so", "libyoga_so", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenSourceMergedSoMapping implements ExternalSoMapping {
    public static final OpenSourceMergedSoMapping INSTANCE = new OpenSourceMergedSoMapping();

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjscexecutor_so();

    public final native int libjscinstance_so();

    public final native int libjscruntime_so();

    public final native int libjsctooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();

    private OpenSourceMergedSoMapping() {
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00be A[ORIG_RETURN, RETURN] */
    @Override // com.facebook.soloader.ExternalSoMapping
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String mapLibName(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1793638007: goto Lb6;
                case -1624070447: goto Lad;
                case -1570429553: goto La4;
                case -1438915853: goto L9b;
                case -1382694412: goto L92;
                case -616737073: goto L86;
                case -579037304: goto L7d;
                case -49345041: goto L74;
                case 3714672: goto L6a;
                case 65536138: goto L5e;
                case 86183502: goto L54;
                case 352552524: goto L4a;
                case 688235659: goto L40;
                case 716617324: goto L36;
                case 871152397: goto L2c;
                case 1236065886: goto L22;
                case 1590431694: goto L18;
                case 2016911584: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lc0
        Le:
            java.lang.String r0 = "fabricjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L18:
            java.lang.String r0 = "jsinspector"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L22:
            java.lang.String r0 = "jscruntime"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8f
            goto Lc0
        L2c:
            java.lang.String r0 = "jscexecutor"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8f
            goto Lc0
        L36:
            java.lang.String r0 = "uimanagerjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L40:
            java.lang.String r0 = "react_devsupportjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L4a:
            java.lang.String r0 = "hermes_executor"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L67
            goto Lc0
        L54:
            java.lang.String r0 = "jsijniprofiler"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L67
            goto Lc0
        L5e:
            java.lang.String r0 = "hermesinstancejni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L67
            goto Lc0
        L67:
            java.lang.String r2 = "hermestooling"
            return r2
        L6a:
            java.lang.String r0 = "yoga"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L74:
            java.lang.String r0 = "turbomodulejsijni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L7d:
            java.lang.String r0 = "react_newarchdefaults"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L86:
            java.lang.String r0 = "jscinstance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L8f
            goto Lc0
        L8f:
            java.lang.String r2 = "jsctooling"
            return r2
        L92:
            java.lang.String r0 = "react_featureflagsjni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        L9b:
            java.lang.String r0 = "reactnativeblob"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        La4:
            java.lang.String r0 = "reactnativejni"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        Lad:
            java.lang.String r0 = "rninstance"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lbe
            goto Lc0
        Lb6:
            java.lang.String r0 = "mapbufferjni"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc0
        Lbe:
            java.lang.String r2 = "reactnative"
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.soloader.OpenSourceMergedSoMapping.mapLibName(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.facebook.soloader.ExternalSoMapping
    public void invokeJniOnload(String libraryName) {
        Intrinsics.checkNotNullParameter(libraryName, "libraryName");
        switch (libraryName.hashCode()) {
            case -1793638007:
                if (libraryName.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (libraryName.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (libraryName.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1454983728:
                if (libraryName.equals("jsctooling")) {
                    libjsctooling_so();
                    break;
                }
                break;
            case -1438915853:
                if (libraryName.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (libraryName.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1033318826:
                if (libraryName.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -616737073:
                if (libraryName.equals("jscinstance")) {
                    libjscinstance_so();
                    break;
                }
                break;
            case -579037304:
                if (libraryName.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (libraryName.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (libraryName.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (libraryName.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (libraryName.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (libraryName.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (libraryName.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (libraryName.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (libraryName.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 871152397:
                if (libraryName.equals("jscexecutor")) {
                    libjscexecutor_so();
                    break;
                }
                break;
            case 1236065886:
                if (libraryName.equals("jscruntime")) {
                    libjscruntime_so();
                    break;
                }
                break;
            case 1590431694:
                if (libraryName.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (libraryName.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }
}
