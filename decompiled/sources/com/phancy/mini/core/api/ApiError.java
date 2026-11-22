package com.phancy.mini.core.api;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.message.Request;
import com.alibaba.fastjson.JSONObject;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.wakeup.common.burypoint.BuryPointPageId;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.style.IStyle;

/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u000bH\u0007J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010*H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/phancy/mini/core/api/ApiError;", "", "()V", Request.CANCEL, "Lcom/phancy/mini/core/api/ApiError$JSONConst;", "ERROR_CANCEL", "", "ERROR_FAIL", "ERROR_INTERNAL", "ERROR_INVALID_REQUEST", "ERROR_MSG_CANCEL", "", "ERROR_MSG_FAIL", "ERROR_MSG_INTERNAL", "ERROR_MSG_INVALID_REQUEST", "ERROR_MSG_NOT_SUPPORTED", "ERROR_MSG_OK", "ERROR_MSG_PERMISSION", "ERROR_MSG_SYSTEM_PERMISSION", "ERROR_MSG_TIMEOUT", "ERROR_MSG_USER_AUTHORIZE_CANCELED", "ERROR_MSG_USER_AUTHORIZE_DENIED", "ERROR_NOT_SUPPORTED", "ERROR_OK", "ERROR_PERMISSION", "ERROR_SYSTEM_PERMISSION", "ERROR_TIMEOUT", "ERROR_USER_AUTHORIZE_CANCELED", "ERROR_USER_AUTHORIZE_DENIED", AMapLocationStaticsEntity.FAIL_STATUS, "INTERNAL", "INVALID_REQUEST", "KEY_ERR_MSG", "KEY_ERR_NO", "NOT_SUPPORTED", "OK", "PERMISSION", "SYSTEM_PERMISSION", "TIMEOUT", "USER_AUTHORIZE_CANCELED", "USER_AUTHORIZE_DENIED", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lcom/alibaba/fastjson/JSONObject;", "error", "message", "isOK", "", "result", "JSONConst", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApiError {
    public static final int ERROR_CANCEL = 1;
    public static final int ERROR_FAIL = 2;
    public static final int ERROR_INTERNAL = 4;
    public static final int ERROR_INVALID_REQUEST = 101;
    public static final String ERROR_MSG_CANCEL = "cancel";
    public static final int ERROR_NOT_SUPPORTED = 100;
    public static final int ERROR_OK = 0;
    public static final int ERROR_PERMISSION = 102;
    public static final int ERROR_SYSTEM_PERMISSION = 3;
    public static final int ERROR_TIMEOUT = 5;
    public static final int ERROR_USER_AUTHORIZE_CANCELED = 104;
    public static final int ERROR_USER_AUTHORIZE_DENIED = 103;
    public static final String KEY_ERR_MSG = "errMsg";
    public static final String KEY_ERR_NO = "errno";
    public static final ApiError INSTANCE = new ApiError();
    public static final String ERROR_MSG_OK = "ok";
    public static final JSONConst OK = new JSONConst(create(0, ERROR_MSG_OK));
    public static final JSONConst CANCEL = new JSONConst(create(1, "cancel"));
    public static final String ERROR_MSG_FAIL = "fail";
    public static final JSONConst FAIL = new JSONConst(create(2, ERROR_MSG_FAIL));
    public static final String ERROR_MSG_SYSTEM_PERMISSION = "system permission denied";
    public static final JSONConst SYSTEM_PERMISSION = new JSONConst(create(3, ERROR_MSG_SYSTEM_PERMISSION));
    public static final String ERROR_MSG_INTERNAL = "internal error";
    public static final JSONConst INTERNAL = new JSONConst(create(4, ERROR_MSG_INTERNAL));
    public static final String ERROR_MSG_TIMEOUT = "time out";
    public static final JSONConst TIMEOUT = new JSONConst(create(5, ERROR_MSG_TIMEOUT));
    public static final String ERROR_MSG_NOT_SUPPORTED = "jsapi not supported";
    public static final JSONConst NOT_SUPPORTED = new JSONConst(create(100, ERROR_MSG_NOT_SUPPORTED));
    public static final String ERROR_MSG_INVALID_REQUEST = "jsapi invalid request data";
    public static final JSONConst INVALID_REQUEST = new JSONConst(create(101, ERROR_MSG_INVALID_REQUEST));
    public static final String ERROR_MSG_PERMISSION = "jsapi has no permission";
    public static final JSONConst PERMISSION = new JSONConst(create(102, ERROR_MSG_PERMISSION));
    public static final String ERROR_MSG_USER_AUTHORIZE_DENIED = "jsapi user authorize denied";
    public static final JSONConst USER_AUTHORIZE_DENIED = new JSONConst(create(103, ERROR_MSG_USER_AUTHORIZE_DENIED));
    public static final String ERROR_MSG_USER_AUTHORIZE_CANCELED = "jsapi user authorize canceled";
    public static final JSONConst USER_AUTHORIZE_CANCELED = new JSONConst(create(104, ERROR_MSG_USER_AUTHORIZE_CANCELED));

    private ApiError() {
    }

    @JvmStatic
    public static final boolean isOK(JSONObject result) {
        return result == null || result.getIntValue(KEY_ERR_NO) == 0;
    }

    @JvmStatic
    public static final JSONObject create(int error, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_ERR_NO, (Object) Integer.valueOf(error));
        jSONObject.put("errMsg", (Object) message);
        return jSONObject;
    }

    /* compiled from: ApiError.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003H\u0016J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/phancy/mini/core/api/ApiError$JSONConst;", "Lcom/alibaba/fastjson/JSONObject;", IStyle.MAP, "", "", "", "(Ljava/util/Map;)V", SDPKeywords.CLEAR, "", "put", "key", "value", "putAll", "from", "remove", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JSONConst extends JSONObject {
        public JSONConst(Map<String, ? extends Object> map) {
            super(map);
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj == null ? true : obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
            return getEntries();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj == null ? true : obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ Object get(String str) {
            return super.get((Object) str);
        }

        public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj == null ? true : obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
        }

        public /* bridge */ Object getOrDefault(String str, Object obj) {
            return super.getOrDefault((Object) str, obj);
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Object> getValues() {
            return super.values();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj == null ? true : obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj == null ? true : obj instanceof String) {
                return remove((String) obj, obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str, Object obj) {
            return super.remove((Object) str, obj);
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public final /* bridge */ Collection<Object> values() {
            return getValues();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public Object put(String key, Object value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        /* renamed from: putAll, reason: merged with bridge method [inline-methods] */
        public Void putAll2(Map<? extends String, ? extends Object> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            throw new UnsupportedOperationException();
        }

        public Object remove(String key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson.JSONObject, java.util.Map
        public Void clear() {
            throw new UnsupportedOperationException();
        }
    }
}
