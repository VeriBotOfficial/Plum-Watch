package com.baidu.mapapi.search.building;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.b;

/* loaded from: classes13.dex */
public class BuildingSearch extends b {
    private boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    private final com.baidu.platform.core.building.b f8059a = new com.baidu.platform.core.building.b();

    public static BuildingSearch newInstance() {
        BMapManager.init();
        return new BuildingSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f8059a.destroy();
        BMapManager.destroy();
    }

    public boolean requestBuilding(BuildingSearchOption buildingSearchOption) {
        if (this.f8059a == null) {
            throw new IllegalStateException("BDMapSDKException: BuildingSearch is null, please call newInstance() first.");
        }
        if (buildingSearchOption == null || buildingSearchOption.getLatLng() == null) {
            throw new IllegalStateException("BDMapSDKException: option or location can not be null");
        }
        return this.f8059a.searchBuilding(buildingSearchOption);
    }

    public void setOnGetBuildingSearchResultListener(OnGetBuildingSearchResultListener onGetBuildingSearchResultListener) {
        com.baidu.platform.core.building.b bVar = this.f8059a;
        if (bVar == null) {
            throw new IllegalStateException("BDMapSDKException: BuildingSearch is null, please call newInstance first.");
        }
        if (onGetBuildingSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        bVar.setOnBuildingSearchListener(onGetBuildingSearchResultListener);
    }
}
