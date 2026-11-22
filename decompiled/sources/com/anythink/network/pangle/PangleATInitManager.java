package com.anythink.network.pangle;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.wakeup.common.utils.AdvConstance;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class PangleATInitManager extends ATInitMediation {
    public static final String TAG = "PangleATInitManager";
    private static volatile PangleATInitManager b;
    private String c;
    private String d;
    private boolean f;
    private List<MediationInitCallback> h;
    private final Object i = new Object();
    private Map<String, WeakReference> j = new ConcurrentHashMap();
    private int k = -1;
    private Boolean l = null;
    private Boolean m = null;
    private int n = 1;

    /* renamed from: a, reason: collision with root package name */
    PAGConfig.Builder f5865a = new PAGConfig.Builder();
    private Handler e = new Handler(Looper.getMainLooper());
    private AtomicBoolean g = new AtomicBoolean(false);

    static /* synthetic */ boolean a(PangleATInitManager pangleATInitManager) {
        pangleATInitManager.f = true;
        return true;
    }

    private PangleATInitManager() {
    }

    public static PangleATInitManager getInstance() {
        if (b == null) {
            synchronized (PangleATInitManager.class) {
                if (b == null) {
                    b = new PangleATInitManager();
                }
            }
        }
        return b;
    }

    public void setPAConsent(int i) {
        this.n = i;
    }

    public synchronized void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.anythink.core.api.ATInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        initSDK(context, map, new HashMap(1), mediationInitCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        r10.onSuccess();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: all -> 0x0199, TryCatch #7 {, blocks: (B:11:0x0016, B:13:0x0026, B:14:0x0043, B:16:0x0049, B:19:0x004f, B:20:0x0051, B:35:0x0077, B:88:0x0181, B:91:0x0190, B:92:0x0191, B:94:0x0194, B:97:0x0029, B:99:0x002d, B:101:0x0033, B:103:0x0013, B:37:0x007c, B:49:0x0129, B:51:0x012d, B:52:0x0136, B:54:0x013a, B:68:0x0176, B:83:0x0126, B:86:0x00e5, B:39:0x00aa, B:42:0x00d8, B:45:0x00e8, B:48:0x0119, B:3:0x0001, B:6:0x000b, B:22:0x0052, B:25:0x005c, B:26:0x0061, B:29:0x0064, B:31:0x0068, B:32:0x006f, B:33:0x0074), top: B:2:0x0001, inners: #0, #2, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0029 A[Catch: all -> 0x0199, TryCatch #7 {, blocks: (B:11:0x0016, B:13:0x0026, B:14:0x0043, B:16:0x0049, B:19:0x004f, B:20:0x0051, B:35:0x0077, B:88:0x0181, B:91:0x0190, B:92:0x0191, B:94:0x0194, B:97:0x0029, B:99:0x002d, B:101:0x0033, B:103:0x0013, B:37:0x007c, B:49:0x0129, B:51:0x012d, B:52:0x0136, B:54:0x013a, B:68:0x0176, B:83:0x0126, B:86:0x00e5, B:39:0x00aa, B:42:0x00d8, B:45:0x00e8, B:48:0x0119, B:3:0x0001, B:6:0x000b, B:22:0x0052, B:25:0x005c, B:26:0x0061, B:29:0x0064, B:31:0x0068, B:32:0x006f, B:33:0x0074), top: B:2:0x0001, inners: #0, #2, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void initSDK(android.content.Context r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.util.Map<java.lang.String, java.lang.Object> r9, com.anythink.core.api.MediationInitCallback r10) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.pangle.PangleATInitManager.initSDK(android.content.Context, java.util.Map, java.util.Map, com.anythink.core.api.MediationInitCallback):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, String str2) {
        synchronized (this.i) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                MediationInitCallback mediationInitCallback = this.h.get(i);
                if (mediationInitCallback != null) {
                    if (z) {
                        mediationInitCallback.onSuccess();
                    } else {
                        mediationInitCallback.onFail(str + " | " + str2);
                    }
                }
            }
            this.h.clear();
            this.g.set(false);
        }
    }

    @Deprecated
    public void setAppIconId(int i) {
        this.k = i;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        if (this.f5865a == null) {
            this.f5865a = new PAGConfig.Builder();
        }
        this.f5865a.setGDPRConsent(z ? 1 : 0);
        return true;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Pangle";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return PangleATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.bytedance.sdk.openadsdk.api.init.PAGSdk";
    }

    final void a(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        a(context, map, map2, aTBidRequestInfoListener, false);
    }

    final void a(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final ATBidRequestInfoListener aTBidRequestInfoListener, final boolean z) {
        getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.pangle.PangleATInitManager.2
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                try {
                    try {
                        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
                        pAGBiddingRequest.setAdxId(AdvConstance.SPORT_RECORD);
                        pAGBiddingRequest.setSlotId(ATInitMediation.getStringFromMap(map, "slot_id"));
                        if (z) {
                            pAGBiddingRequest.setBannerSize(PangleATInitManager.getInstance().getBannerSize(context, map, map2));
                        }
                        PAGSdk.getBiddingToken(context, pAGBiddingRequest, new BiddingTokenCallback() { // from class: com.anythink.network.pangle.PangleATInitManager.2.1
                            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
                            public final void onBiddingTokenCollected(String str) {
                                String str2 = PangleATInitManager.TAG;
                                Looper.getMainLooper();
                                Looper.myLooper();
                                a(str);
                            }
                        });
                    } catch (Throwable unused) {
                        PAGSdk.getBiddingToken(new BiddingTokenCallback() { // from class: com.anythink.network.pangle.PangleATInitManager.2.2
                            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
                            public final void onBiddingTokenCollected(String str) {
                                String str2 = PangleATInitManager.TAG;
                                Looper.getMainLooper();
                                Looper.myLooper();
                                a(str);
                            }
                        });
                    }
                } catch (Throwable unused2) {
                    a(PAGSdk.getBiddingToken());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(String str) {
                PangleBidRequestInfo pangleBidRequestInfo = new PangleBidRequestInfo(context, map, map2, str, z);
                if (!pangleBidRequestInfo.isValid()) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onFailed(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                        return;
                    }
                    return;
                }
                ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener3 != null) {
                    aTBidRequestInfoListener3.onSuccess(pangleBidRequestInfo);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener2 != null) {
                    aTBidRequestInfoListener2.onFailed(str);
                }
            }
        });
    }

    protected final void a(String str, WeakReference weakReference) {
        try {
            this.j.put(str, weakReference);
        } catch (Throwable unused) {
        }
    }

    public static void setPangleUserData(Map<String, Object> map) {
        String str;
        String stringFromMap = getStringFromMap(map, j.w.o);
        if (TextUtils.isEmpty(stringFromMap)) {
            str = "";
        } else {
            str = "{\"name\":\"hybrid_id\",\"value\":\"" + stringFromMap + "\"},";
        }
        String str2 = "[" + str + "{\"name\":\"mediation\",\"value\":\"TopOn\"},{\"name\":\"adapter_version\",\"value\":\"" + ATSDK.getSDKVersionName() + "_" + getInstance().getNetworkVersion() + "\"}]";
        PAGConfig.setUserData(str2);
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(TAG, "extraData = ".concat(String.valueOf(str2)));
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.10.3";
    }

    public void setSupportMultiProcessConfig(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public void setUseTextureView(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public PAGBannerSize getBannerSize(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i2;
        String stringFromMap = getStringFromMap(map, "size");
        int i3 = 0;
        int intFromMap = getIntFromMap(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        int intFromMap2 = getIntFromMap(map, "media_size", 0);
        int i4 = 50;
        int i5 = 320;
        if (intFromMap != 1) {
            try {
            } catch (Exception e) {
                e = e;
                i = 0;
            }
            if (!TextUtils.isEmpty(stringFromMap)) {
                String[] split = stringFromMap.split("x");
                i = Integer.parseInt(split[0]);
                try {
                    i2 = Integer.parseInt(split[1]);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    i2 = 0;
                    i3 = i;
                    if (i3 != 0) {
                        i4 = i2;
                        i5 = i3;
                    }
                    return new PAGBannerSize(i5, i4);
                }
                i3 = i;
            }
            i2 = 0;
        } else if (intFromMap2 != 1) {
            if (intFromMap2 == 8) {
                i3 = 300;
                i2 = 250;
            }
            i2 = 0;
        } else {
            i2 = 50;
            i3 = 320;
        }
        if (i3 != 0 && i2 != 0) {
            i4 = i2;
            i5 = i3;
        }
        return new PAGBannerSize(i5, i4);
    }
}
