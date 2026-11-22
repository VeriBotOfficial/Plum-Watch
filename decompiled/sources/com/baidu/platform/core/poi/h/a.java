package com.baidu.platform.core.poi.h;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapapi.http.wrapper.SignUtils;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceAdministrativeRegionOption;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceAroundRegionOption;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceDetailOption;
import com.baidu.mapapi.search.poi.abroad.AbroadPlacePolygonRegionOption;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceSuggestOption;
import com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadAdministrativeRegionParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadAroundRegionParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceDetailParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceDetailResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceSuggestParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceSuggestResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPolygonRegionParams;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbroadPlaceSearch.java */
/* loaded from: classes13.dex */
public class a implements IAbroadPlaceSearch {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f9000a = new HashMap();

    /* compiled from: AbroadPlaceSearch.java */
    /* renamed from: com.baidu.platform.core.poi.h.a$a, reason: collision with other inner class name */
    class C0433a implements AsyncResponse.Callback<AbroadPlaceResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a.a.a.a.a f9001a;

        C0433a(a.a.a.a.a.a aVar) {
            this.f9001a = aVar;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AbroadPlaceResponse abroadPlaceResponse) {
            this.f9001a.success(abroadPlaceResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f9001a.failed(-5, th.getMessage());
        }
    }

    /* compiled from: AbroadPlaceSearch.java */
    class b implements AsyncResponse.Callback<AbroadPlaceResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a.a.a.a.a f9002a;

        b(a.a.a.a.a.a aVar) {
            this.f9002a = aVar;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AbroadPlaceResponse abroadPlaceResponse) {
            this.f9002a.success(abroadPlaceResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f9002a.failed(-5, th.getMessage());
        }
    }

    /* compiled from: AbroadPlaceSearch.java */
    class c implements AsyncResponse.Callback<AbroadPlaceResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a.a.a.a.a f9003a;

        c(a.a.a.a.a.a aVar) {
            this.f9003a = aVar;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AbroadPlaceResponse abroadPlaceResponse) {
            this.f9003a.success(abroadPlaceResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f9003a.failed(-5, th.getMessage());
        }
    }

    /* compiled from: AbroadPlaceSearch.java */
    class d implements AsyncResponse.Callback<AbroadPlaceDetailResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a.a.a.a.a f9004a;

        d(a.a.a.a.a.a aVar) {
            this.f9004a = aVar;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AbroadPlaceDetailResponse abroadPlaceDetailResponse) {
            this.f9004a.success(abroadPlaceDetailResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f9004a.failed(-5, th.getMessage());
        }
    }

    /* compiled from: AbroadPlaceSearch.java */
    class e implements AsyncResponse.Callback<AbroadPlaceSuggestResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.a.a.a.a.a f9005a;

        e(a.a.a.a.a.a aVar) {
            this.f9005a = aVar;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AbroadPlaceSuggestResponse abroadPlaceSuggestResponse) {
            this.f9005a.success(abroadPlaceSuggestResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f9005a.failed(-5, th.getMessage());
        }
    }

    /* compiled from: AbroadPlaceSearch.java */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        static final a f9006a = new a();
    }

    public static a a() {
        return f.f9006a;
    }

    @Override // com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch
    public void searchAbroadAdministrativeRegionPlace(AbroadPlaceAdministrativeRegionOption abroadPlaceAdministrativeRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar) {
        if (aVar == null) {
            return;
        }
        if (abroadPlaceAdministrativeRegionOption == null || TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getQuery())) {
            aVar.failed(-3, "MISS_PARAM");
            return;
        }
        AbroadAdministrativeRegionParams abroadAdministrativeRegionParams = new AbroadAdministrativeRegionParams();
        abroadAdministrativeRegionParams.apply(abroadPlaceAdministrativeRegionOption);
        abroadAdministrativeRegionParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                aVar.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        abroadAdministrativeRegionParams.setToken(authToken);
        try {
            abroadAdministrativeRegionParams.setSign(SignUtils.signParams(abroadAdministrativeRegionParams, phoneInfoRaw, true));
            com.baidu.platform.core.poi.h.b bVar = (com.baidu.platform.core.poi.h.b) a(com.baidu.platform.core.poi.h.b.class, 1);
            if (bVar == null) {
                aVar.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(abroadAdministrativeRegionParams, phoneInfoRaw).setCallback(new C0433a(aVar));
            }
        } catch (Exception unused) {
            aVar.failed(-2, "EMPTY_TOKEN");
        }
    }

    @Override // com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch
    public void searchAbroadAroundRegionPlace(AbroadPlaceAroundRegionOption abroadPlaceAroundRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar) {
        if (aVar == null) {
            return;
        }
        if (abroadPlaceAroundRegionOption == null || TextUtils.isEmpty(abroadPlaceAroundRegionOption.getQuery())) {
            aVar.failed(-3, "MISS_PARAM");
            return;
        }
        AbroadAroundRegionParams abroadAroundRegionParams = new AbroadAroundRegionParams();
        abroadAroundRegionParams.apply(abroadPlaceAroundRegionOption);
        abroadAroundRegionParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                aVar.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        abroadAroundRegionParams.setToken(authToken);
        try {
            abroadAroundRegionParams.setSign(SignUtils.signParams(abroadAroundRegionParams, phoneInfoRaw, true));
            com.baidu.platform.core.poi.h.b bVar = (com.baidu.platform.core.poi.h.b) a(com.baidu.platform.core.poi.h.b.class, 1);
            if (bVar == null) {
                aVar.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(abroadAroundRegionParams, phoneInfoRaw).setCallback(new b(aVar));
            }
        } catch (Exception unused) {
            aVar.failed(-2, "EMPTY_TOKEN");
        }
    }

    @Override // com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch
    public void searchAbroadPlaceDetail(AbroadPlaceDetailOption abroadPlaceDetailOption, a.a.a.a.a.a<AbroadPlaceDetailResponse> aVar) {
        if (aVar == null) {
            return;
        }
        if (abroadPlaceDetailOption == null || TextUtils.isEmpty(abroadPlaceDetailOption.getUids())) {
            aVar.failed(-3, "MISS_PARAM");
            return;
        }
        AbroadPlaceDetailParams abroadPlaceDetailParams = new AbroadPlaceDetailParams();
        abroadPlaceDetailParams.apply(abroadPlaceDetailOption);
        abroadPlaceDetailParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                aVar.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        abroadPlaceDetailParams.setToken(authToken);
        try {
            abroadPlaceDetailParams.setSign(SignUtils.signParams(abroadPlaceDetailParams, phoneInfoRaw, true));
            com.baidu.platform.core.poi.h.b bVar = (com.baidu.platform.core.poi.h.b) a(com.baidu.platform.core.poi.h.b.class, 1);
            if (bVar == null) {
                aVar.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(abroadPlaceDetailParams, phoneInfoRaw).setCallback(new d(aVar));
            }
        } catch (Exception unused) {
            aVar.failed(-2, "EMPTY_TOKEN");
        }
    }

    @Override // com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch
    public void searchAbroadPlaceSuggestion(AbroadPlaceSuggestOption abroadPlaceSuggestOption, a.a.a.a.a.a<AbroadPlaceSuggestResponse> aVar) {
        if (aVar == null) {
            return;
        }
        if (abroadPlaceSuggestOption == null) {
            aVar.failed(-3, "MISS_PARAM");
            return;
        }
        AbroadPlaceSuggestParams abroadPlaceSuggestParams = new AbroadPlaceSuggestParams();
        abroadPlaceSuggestParams.apply(abroadPlaceSuggestOption);
        abroadPlaceSuggestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                aVar.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        abroadPlaceSuggestParams.setToken(authToken);
        try {
            abroadPlaceSuggestParams.setSign(SignUtils.signParams(abroadPlaceSuggestParams, phoneInfoRaw, true));
            com.baidu.platform.core.poi.h.b bVar = (com.baidu.platform.core.poi.h.b) a(com.baidu.platform.core.poi.h.b.class, 1);
            if (bVar == null) {
                aVar.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(abroadPlaceSuggestParams, phoneInfoRaw).setCallback(new e(aVar));
            }
        } catch (Exception unused) {
            aVar.failed(-2, "EMPTY_TOKEN");
        }
    }

    @Override // com.baidu.mapapi.search.poi.abroad.IAbroadPlaceSearch
    public void searchAbroadPolygonRegionPlace(AbroadPlacePolygonRegionOption abroadPlacePolygonRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar) {
        if (aVar == null) {
            return;
        }
        if (abroadPlacePolygonRegionOption == null || TextUtils.isEmpty(abroadPlacePolygonRegionOption.getQuery())) {
            aVar.failed(-3, "MISS_PARAM");
            return;
        }
        AbroadPolygonRegionParams abroadPolygonRegionParams = new AbroadPolygonRegionParams();
        abroadPolygonRegionParams.apply(abroadPlacePolygonRegionOption);
        abroadPolygonRegionParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                aVar.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        abroadPolygonRegionParams.setToken(authToken);
        try {
            abroadPolygonRegionParams.setSign(SignUtils.signParams(abroadPolygonRegionParams, phoneInfoRaw, true));
            com.baidu.platform.core.poi.h.b bVar = (com.baidu.platform.core.poi.h.b) a(com.baidu.platform.core.poi.h.b.class, 1);
            if (bVar == null) {
                aVar.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(abroadPolygonRegionParams, phoneInfoRaw).setCallback(new c(aVar));
            }
        } catch (Exception unused) {
            aVar.failed(-2, "EMPTY_TOKEN");
        }
    }

    private <T> T a(Class<T> cls, int i) {
        if (cls == null) {
            return null;
        }
        if (this.f9000a.containsKey(cls)) {
            return (T) this.f9000a.get(cls);
        }
        HttpManager b2 = com.baidu.platform.util.b.a().b(i);
        if (b2 == null) {
            return null;
        }
        T t = (T) b2.getApiInstance(cls);
        this.f9000a.put(cls, t);
        return t;
    }
}
