package com.baidu.platform.core.district;

import com.baidu.mapapi.search.district.DistrictSearchOption;
import com.baidu.mapapi.search.district.OnGetDistricSearchResultListener;

/* loaded from: classes13.dex */
public interface IDistrictSearch {
    void destroy();

    boolean searchDistrict(DistrictSearchOption districtSearchOption);

    void setOnDistrictSearchListener(OnGetDistricSearchResultListener onGetDistricSearchResultListener);
}
