package com.wakeup.common.ab;

import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.hjq.gson.factory.GsonFactory;
import com.wakeup.common.burypoint.BuryPointEventName;
import com.wakeup.common.burypoint.BuryPointEventType;
import com.wakeup.common.burypoint.BuryPointManager;
import com.wakeup.common.burypoint.NorthStarSceneIdExtendInfo;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.video.ABPost;
import com.wakeup.common.network.entity.video.UserInfo;
import com.wakeup.common.storage.CacheManager;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.ITopic;

/* compiled from: NorthStarABManager.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0005H\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005J&\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0002J\b\u0010,\u001a\u00020%H\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007J\b\u0010.\u001a\u00020\u0019H\u0007J\u001a\u0010/\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u0005H\u0007J\u001a\u00101\u001a\u0002022\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000202H\u0007J\u001a\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000204H\u0007J\u001a\u00105\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u0019H\u0007J\u001a\u00106\u001a\u0002072\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000207H\u0007J\u001a\u00108\u001a\u0002092\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000209H\u0007J\u001a\u0010:\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u0017H\u0007J\u001a\u0010;\u001a\u00020<2\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020<H\u0007J\u0012\u0010=\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\u0005H\u0002J\u001a\u0010>\u001a\u0002022\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000202H\u0007J\u001a\u0010?\u001a\u0002022\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000202H\u0007J\u001a\u0010@\u001a\u0002022\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000202H\u0007J\u001a\u0010A\u001a\u0002022\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u000202H\u0007J$\u0010D\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010\u00012\b\u0010F\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u000202H\u0002J\u0012\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0019\u0010H\u001a\u0004\u0018\u0001022\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u0004\u0018\u0001092\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u0001042\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010NJ\u0019\u0010O\u001a\u0004\u0018\u00010\u00192\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010PJ\u0014\u0010Q\u001a\u0004\u0018\u00010\u00052\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002J!\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020\u00052\n\b\u0002\u0010T\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0002\u0010UR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010B\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/wakeup/common/ab/NorthStarABManager;", "", "<init>", "()V", "TAG", "", "BOT_CHAT_TAG", "currentUserId", "getCurrentUserId", "()Ljava/lang/String;", "setCurrentUserId", "(Ljava/lang/String;)V", "abTestConfig", "Ljava/util/concurrent/ConcurrentHashMap;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "experimentIds", "", "CACHE_KEY_CURRENT_USER_ID", "CACHE_KEY_EXPERIMENT_IDS", "CACHE_KEY_EXPERIMENT_CONFIGS", "CACHE_KEY_REQUEST_TIME", "experimentConfigs", "Lorg/json/JSONObject;", "requestTime", "", "debugMockConfigProvider", "Lkotlin/Function0;", "getDebugMockConfigProvider$annotations", "getDebugMockConfigProvider", "()Lkotlin/jvm/functions/Function0;", "setDebugMockConfigProvider", "(Lkotlin/jvm/functions/Function0;)V", "lookupConfig", ITopic.ROOT, "key", "init", "", "userId", "fetchABTestConfig", "abPost", "Lcom/wakeup/common/network/entity/video/ABPost;", "cachedUserId", "cachedExperimentIds", "reportConfigFetched", "getExperimentIds", "getRequestTime", "getABTestValue", "defaultValue", "getABTestBoolean", "", "getABTestInt", "", "getABTestLong", "getABTestFloat", "", "getABTestDouble", "", "getABTestJSONObject", "getABTestJSONArray", "Lorg/json/JSONArray;", "optABTestObject", "getABTestForUnifiedDomain", "getABTestBooleanOrCache", "getABTestBooleanPerPlatform", "getABTestBooleanPerPlatformOrCache", "PLATFORM_KEY_SUFFIX", "PLATFORM_FIELD_ANDROID", "resolvePlatformBoolean", "platformObj", "boolObj", "optABTestObjectOrMmkv", "toBoolean", "value", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "toDouble", "(Ljava/lang/Object;)Ljava/lang/Double;", "toInteger", "(Ljava/lang/Object;)Ljava/lang/Integer;", "toLong", "(Ljava/lang/Object;)Ljava/lang/Long;", "toString", "logBotChatAbConfig", "source", "resolvedEnableBotChat", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NorthStarABManager {
    private static final String BOT_CHAT_TAG = "botChat";
    private static final String CACHE_KEY_CURRENT_USER_ID = "currentUserIdOfNorthStar";
    private static final String CACHE_KEY_EXPERIMENT_CONFIGS = "experimentConfigsOfNorthStar";
    private static final String CACHE_KEY_EXPERIMENT_IDS = "experimentIdsOfNorthStar";
    private static final String CACHE_KEY_REQUEST_TIME = "requestTimeOfNorthStar";
    private static final String PLATFORM_FIELD_ANDROID = "an";
    private static final String PLATFORM_KEY_SUFFIX = "Platform";
    private static final String TAG = "NorthStarABManager";
    private static volatile Function0<? extends JSONObject> debugMockConfigProvider;
    private static long requestTime;
    public static final NorthStarABManager INSTANCE = new NorthStarABManager();
    private static String currentUserId = "";
    private static final ConcurrentHashMap<String, Object> abTestConfig = new ConcurrentHashMap<>();
    private static final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    private static List<String> experimentIds = new ArrayList();
    private static JSONObject experimentConfigs = new JSONObject();

    @JvmStatic
    public static /* synthetic */ void getDebugMockConfigProvider$annotations() {
    }

    private NorthStarABManager() {
    }

    public final String getCurrentUserId() {
        return currentUserId;
    }

    public final void setCurrentUserId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        currentUserId = str;
    }

    public static final Function0<JSONObject> getDebugMockConfigProvider() {
        return debugMockConfigProvider;
    }

    public static final void setDebugMockConfigProvider(Function0<? extends JSONObject> function0) {
        debugMockConfigProvider = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    private final Object lookupConfig(JSONObject root, String key) {
        Object opt;
        String str = key;
        if (StringsKt.contains$default((CharSequence) str, '/', false, 2, (Object) null)) {
            for (String str2 : StringsKt.split$default((CharSequence) str, new char[]{'/'}, false, 0, 6, (Object) null)) {
                if (root == 0) {
                    break;
                }
                root = root instanceof JSONObject ? ((JSONObject) root).opt(str2) : 0;
            }
            return root;
        }
        Object opt2 = root.opt(key);
        if (opt2 != null) {
            return opt2;
        }
        Iterator<String> keys = root.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Object obj = root.get(keys.next());
            if ((obj instanceof JSONObject) && (opt = ((JSONObject) obj).opt(key)) != null) {
                return opt;
            }
        }
        return null;
    }

    public final void init(String userId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(userId, "userId");
        currentUserId = userId;
        String string = CacheManager.INSTANCE.getString(CACHE_KEY_CURRENT_USER_ID, "");
        Object data = CacheManager.INSTANCE.getData(CACHE_KEY_EXPERIMENT_IDS, ArrayList.class);
        ArrayList arrayList = TypeIntrinsics.isMutableList(data) ? (List) data : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (string.length() > 0 && !Intrinsics.areEqual(string, currentUserId)) {
            LogUtils.i(TAG, "userId changed: " + string + " -> " + currentUserId + ", clear experiment cache");
            experimentConfigs = new JSONObject();
            requestTime = 0L;
            CacheManager.INSTANCE.saveString(CACHE_KEY_EXPERIMENT_CONFIGS, "");
            CacheManager.INSTANCE.saveData(CACHE_KEY_EXPERIMENT_IDS, new ArrayList());
            CacheManager.INSTANCE.saveLong(CACHE_KEY_REQUEST_TIME, 0L);
        } else {
            try {
                String string2 = CacheManager.INSTANCE.getString(CACHE_KEY_EXPERIMENT_CONFIGS);
                if (string2.length() > 0) {
                    jSONObject = new JSONObject(string2);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            experimentConfigs = jSONObject;
            requestTime = CacheManager.INSTANCE.getLong(CACHE_KEY_REQUEST_TIME);
        }
        logBotChatAbConfig$default(this, "init-cache", null, 2, null);
        fetchABTestConfig(new ABPost("super_app", true, new UserInfo(currentUserId)), string, arrayList);
    }

    private final void fetchABTestConfig(ABPost abPost, String cachedUserId, List<String> cachedExperimentIds) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NorthStarABManager$fetchABTestConfig$1(abPost, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportConfigFetched() {
        Log.d(TAG, "AB test config fetched successfully. Reporting bury point start");
        BuryPointManager buryPointManager = BuryPointManager.INSTANCE;
        String sourcePageId = BuryPointManager.INSTANCE.getSourcePageId();
        long currentTimeMillis = System.currentTimeMillis();
        String json = GsonFactory.getSingletonGson().toJson(new NorthStarSceneIdExtendInfo(experimentIds, "super_app", Long.valueOf(requestTime), BuryPointManager.INSTANCE.getLaunchId(), BuryPointManager.INSTANCE.getSessionId()));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        BuryPointManager.postEvent$default(buryPointManager, BuryPointEventType.ACTION_TYPE_AB_Test, BuryPointEventName.ACTION_NAME_USER_CLUSTERING, "", sourcePageId, currentTimeMillis, json, null, 64, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NorthStarABManager$reportConfigFetched$1(null), 3, null);
    }

    @JvmStatic
    public static final List<String> getExperimentIds() {
        return experimentIds;
    }

    @JvmStatic
    public static final long getRequestTime() {
        return requestTime;
    }

    public static /* synthetic */ String getABTestValue$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return getABTestValue(str, str2);
    }

    @JvmStatic
    public static final String getABTestValue(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        NorthStarABManager northStarABManager = INSTANCE;
        String northStarABManager2 = northStarABManager.toString(northStarABManager.optABTestObject(key));
        return northStarABManager2 == null ? defaultValue : northStarABManager2;
    }

    public static /* synthetic */ boolean getABTestBoolean$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getABTestBoolean(str, z);
    }

    @JvmStatic
    public static final boolean getABTestBoolean(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Boolean bool = northStarABManager.toBoolean(northStarABManager.optABTestObject(key));
        return bool != null ? bool.booleanValue() : defaultValue;
    }

    public static /* synthetic */ int getABTestInt$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return getABTestInt(str, i);
    }

    @JvmStatic
    public static final int getABTestInt(String key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Integer integer = northStarABManager.toInteger(northStarABManager.optABTestObject(key));
        return integer != null ? integer.intValue() : defaultValue;
    }

    public static /* synthetic */ long getABTestLong$default(String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return getABTestLong(str, j);
    }

    @JvmStatic
    public static final long getABTestLong(String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Long l = northStarABManager.toLong(northStarABManager.optABTestObject(key));
        return l != null ? l.longValue() : defaultValue;
    }

    public static /* synthetic */ float getABTestFloat$default(String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return getABTestFloat(str, f);
    }

    @JvmStatic
    public static final float getABTestFloat(String key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Double d = northStarABManager.toDouble(northStarABManager.optABTestObject(key));
        return d != null ? (float) d.doubleValue() : defaultValue;
    }

    public static /* synthetic */ double getABTestDouble$default(String str, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return getABTestDouble(str, d);
    }

    @JvmStatic
    public static final double getABTestDouble(String key, double defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Double d = northStarABManager.toDouble(northStarABManager.optABTestObject(key));
        return d != null ? d.doubleValue() : defaultValue;
    }

    public static /* synthetic */ JSONObject getABTestJSONObject$default(String str, JSONObject jSONObject, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONObject = new JSONObject();
        }
        return getABTestJSONObject(str, jSONObject);
    }

    @JvmStatic
    public static final JSONObject getABTestJSONObject(String key, JSONObject defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object optABTestObject = INSTANCE.optABTestObject(key);
        if (optABTestObject instanceof JSONObject) {
            return (JSONObject) optABTestObject;
        }
        if (!(optABTestObject instanceof String)) {
            return defaultValue;
        }
        try {
            return new JSONObject((String) optABTestObject);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    public static /* synthetic */ JSONArray getABTestJSONArray$default(String str, JSONArray jSONArray, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONArray = new JSONArray();
        }
        return getABTestJSONArray(str, jSONArray);
    }

    @JvmStatic
    public static final JSONArray getABTestJSONArray(String key, JSONArray defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object optABTestObject = INSTANCE.optABTestObject(key);
        if (optABTestObject instanceof JSONArray) {
            return (JSONArray) optABTestObject;
        }
        if (!(optABTestObject instanceof String)) {
            return defaultValue;
        }
        try {
            return new JSONArray((String) optABTestObject);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    private final Object optABTestObject(String key) {
        Object opt;
        Object defaultConfig = NorthStartConfigs.INSTANCE.getDefaultConfig(key);
        if (defaultConfig != null) {
            LogUtils.i(TAG, "Using default config for key: " + key + ", value: " + defaultConfig);
            return defaultConfig;
        }
        String str = key;
        if (StringsKt.contains$default((CharSequence) str, '/', false, 2, (Object) null)) {
            List<String> split$default = StringsKt.split$default((CharSequence) str, new char[]{'/'}, false, 0, 6, (Object) null);
            Object obj = experimentConfigs;
            for (String str2 : split$default) {
                if (obj == null) {
                    break;
                }
                obj = obj instanceof JSONObject ? ((JSONObject) obj).opt(str2) : null;
            }
            return obj;
        }
        Object opt2 = experimentConfigs.opt(key);
        if (opt2 != null) {
            return opt2;
        }
        Iterator<String> keys = experimentConfigs.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Object obj2 = experimentConfigs.get(keys.next());
            if ((obj2 instanceof JSONObject) && (opt = ((JSONObject) obj2).opt(key)) != null) {
                return opt;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean getABTestForUnifiedDomain$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getABTestForUnifiedDomain(str, z);
    }

    @JvmStatic
    public static final boolean getABTestForUnifiedDomain(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Boolean bool = northStarABManager.toBoolean(northStarABManager.optABTestObjectOrMmkv(key));
        return bool != null ? bool.booleanValue() : defaultValue;
    }

    public static /* synthetic */ boolean getABTestBooleanOrCache$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getABTestBooleanOrCache(str, z);
    }

    @JvmStatic
    public static final boolean getABTestBooleanOrCache(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        Boolean bool = northStarABManager.toBoolean(northStarABManager.optABTestObjectOrMmkv(key));
        return bool != null ? bool.booleanValue() : defaultValue;
    }

    public static /* synthetic */ boolean getABTestBooleanPerPlatform$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getABTestBooleanPerPlatform(str, z);
    }

    @JvmStatic
    public static final boolean getABTestBooleanPerPlatform(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        return northStarABManager.resolvePlatformBoolean(northStarABManager.optABTestObject(key + PLATFORM_KEY_SUFFIX), northStarABManager.optABTestObject(key), defaultValue);
    }

    public static /* synthetic */ boolean getABTestBooleanPerPlatformOrCache$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getABTestBooleanPerPlatformOrCache(str, z);
    }

    @JvmStatic
    public static final boolean getABTestBooleanPerPlatformOrCache(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        NorthStarABManager northStarABManager = INSTANCE;
        return northStarABManager.resolvePlatformBoolean(northStarABManager.optABTestObjectOrMmkv(key + PLATFORM_KEY_SUFFIX), northStarABManager.optABTestObjectOrMmkv(key), defaultValue);
    }

    private final boolean resolvePlatformBoolean(Object platformObj, Object boolObj, boolean defaultValue) {
        JSONObject jSONObject;
        if (platformObj instanceof JSONObject) {
            jSONObject = (JSONObject) platformObj;
        } else {
            if ((platformObj instanceof String) && StringsKt.startsWith$default(StringsKt.trim((CharSequence) platformObj).toString(), Const.STR_MART_JSON_BEGIN, false, 2, (Object) null)) {
                try {
                    jSONObject = new JSONObject((String) platformObj);
                } catch (Exception unused) {
                }
            }
            jSONObject = null;
        }
        if (jSONObject != null && (jSONObject.has("an") || jSONObject.has("ios"))) {
            Boolean bool = toBoolean(jSONObject.opt("an"));
            return bool != null ? bool.booleanValue() : defaultValue;
        }
        Boolean bool2 = toBoolean(boolObj);
        return bool2 != null ? bool2.booleanValue() : defaultValue;
    }

    private final Object optABTestObjectOrMmkv(String key) {
        JSONObject jSONObject;
        Object opt;
        if (experimentConfigs.length() <= 0) {
            try {
                String string = CacheManager.INSTANCE.getString(CACHE_KEY_EXPERIMENT_CONFIGS);
                if (string.length() > 0) {
                    jSONObject = new JSONObject(string);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            experimentConfigs = jSONObject;
        }
        Object defaultConfig = NorthStartConfigs.INSTANCE.getDefaultConfig(key);
        if (defaultConfig != null) {
            return defaultConfig;
        }
        String str = key;
        if (StringsKt.contains$default((CharSequence) str, '/', false, 2, (Object) null)) {
            List<String> split$default = StringsKt.split$default((CharSequence) str, new char[]{'/'}, false, 0, 6, (Object) null);
            Object obj = experimentConfigs;
            for (String str2 : split$default) {
                if (obj == null) {
                    break;
                }
                obj = obj instanceof JSONObject ? ((JSONObject) obj).opt(str2) : null;
            }
            return obj;
        }
        Object opt2 = experimentConfigs.opt(key);
        if (opt2 != null) {
            return opt2;
        }
        Iterator<String> keys = experimentConfigs.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            Object obj2 = experimentConfigs.get(keys.next());
            if ((obj2 instanceof JSONObject) && (opt = ((JSONObject) obj2).opt(key)) != null) {
                return opt;
            }
        }
        return null;
    }

    private final Boolean toBoolean(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        if (!(value instanceof String)) {
            return null;
        }
        String str = (String) value;
        if (StringsKt.equals(MediaConstraintKeys.TRUE, str, true)) {
            return true;
        }
        return StringsKt.equals("false", str, true) ? false : null;
    }

    private final Double toDouble(Object value) {
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (!(value instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) value));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Integer toInteger(Object value) {
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof Number) {
            return Integer.valueOf(((Number) value).intValue());
        }
        if (!(value instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) value));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Long toLong(Object value) {
        if (value instanceof Long) {
            return (Long) value;
        }
        if (value instanceof Number) {
            return Long.valueOf(((Number) value).longValue());
        }
        if (!(value instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) value));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final String toString(Object value) {
        if (value instanceof String) {
            return (String) value;
        }
        if (value != null) {
            return value.toString();
        }
        return null;
    }

    static /* synthetic */ void logBotChatAbConfig$default(NorthStarABManager northStarABManager, String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        northStarABManager.logBotChatAbConfig(str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logBotChatAbConfig(String source, Boolean resolvedEnableBotChat) {
        boolean aBTestBoolean;
        JSONObject optJSONObject = experimentConfigs.optJSONObject("superAppOtherPageConfig");
        Object opt = optJSONObject != null ? optJSONObject.opt("enableBotChat") : null;
        if (resolvedEnableBotChat != null) {
            aBTestBoolean = resolvedEnableBotChat.booleanValue();
        } else {
            aBTestBoolean = getABTestBoolean(NorthStartConfigs.ENABLE_BOT_CHAT, false);
        }
        LogUtils.i(BOT_CHAT_TAG, "abConfig[" + source + "] userId=" + currentUserId + ", key=superAppOtherPageConfig/enableBotChat, enableBotChat=" + aBTestBoolean + ", rawEnableBotChat=" + opt + ", superAppOtherPageConfig=" + optJSONObject + ", experimentIds=" + experimentIds + ", cachedUserId=" + CacheManager.INSTANCE.getString(CACHE_KEY_CURRENT_USER_ID, ""));
    }
}
