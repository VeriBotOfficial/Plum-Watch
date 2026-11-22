package com.baidu.platform.core.building;

import android.text.TextUtils;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.building.BuildingResult;
import com.baidu.mapapi.search.building.OnGetBuildingSearchResultListener;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BuildingParser.java */
/* loaded from: classes13.dex */
public class a extends com.baidu.platform.base.b {
    private static final String b = "a";

    @Override // com.baidu.platform.base.b
    public SearchResult a(String str) {
        BuildingResult buildingResult = new BuildingResult();
        if (str == null || str.isEmpty()) {
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return buildingResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return buildingResult;
            }
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject != null && optJSONObject.has("PermissionCheckError")) {
                    buildingResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return buildingResult;
                }
                if (optJSONObject != null && optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        buildingResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                        return buildingResult;
                    }
                    if (optString.equals("REQUEST_ERROR")) {
                        buildingResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                        return buildingResult;
                    }
                    buildingResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    return buildingResult;
                }
            }
            if (!a(str, buildingResult, true)) {
                a(str, buildingResult);
            }
            return buildingResult;
        } catch (JSONException e) {
            Log.e(b, "ParseBuidingResult: ", e);
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return buildingResult;
        }
    }

    @Override // com.baidu.platform.base.b
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetBuildingSearchResultListener) {
            ((OnGetBuildingSearchResultListener) obj).onGetBuildingResult((BuildingResult) searchResult);
        }
    }

    private boolean a(String str, BuildingResult buildingResult) {
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            int optInt = jSONObject.optInt("status");
            if (optInt == 0) {
                if ("in".equals(jSONObject.optString("relation"))) {
                    i = 1;
                } else {
                    buildingResult.setDistance(jSONObject.optDouble("distance", 0.0d));
                }
                buildingResult.setRelation(i);
                return a(jSONObject, buildingResult);
            }
            if (optInt == 1) {
                buildingResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            } else if (optInt != 2) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                buildingResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
            }
            return false;
        } catch (JSONException e) {
            Log.e(b, "ParseBuidingResult error: ", e);
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
    }

    private boolean a(JSONObject jSONObject, BuildingResult buildingResult) {
        JSONArray optJSONArray = jSONObject.optJSONArray("buildinginfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i);
            if (jSONObject2 != null) {
                BuildingInfo buildingInfo = new BuildingInfo();
                float optLong = jSONObject2.optLong("height");
                buildingInfo.setLabel(jSONObject2.optString("label").equals("main") ? 1 : 0);
                buildingInfo.setStructID(jSONObject2.optString("struct_id"));
                buildingInfo.setHeight(optLong);
                buildingInfo.setAccuracy(jSONObject2.optInt(Const.JSON_KEY_ACCURACY));
                buildingInfo.setGeom(jSONObject2.optString("geom"));
                buildingInfo.setCenter(a(jSONObject2));
                arrayList.add(buildingInfo);
            }
        }
        buildingResult.setBuildingList(arrayList);
        return true;
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("center");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String[] split = optString.split(",");
        if (split.length != 2) {
            return null;
        }
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }
}
