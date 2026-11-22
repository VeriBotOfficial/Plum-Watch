package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.col.p0003sl.b6;
import com.amap.api.col.p0003sl.j8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.yandex.div2.PhoneMasks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public class PoiSearch {
    public static final String CHINESE = "zh-CN";
    public static final String ENGLISH = "en";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";

    /* renamed from: a, reason: collision with root package name */
    private IPoiSearch f2142a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(PoiItem poiItem, int i);

        void onPoiSearched(PoiResult poiResult, int i);
    }

    public static class Query implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private String f2143a;
        private String b;
        private String c;
        private int d;
        private int e;
        private String f;
        private boolean g;
        private boolean h;
        private String i;
        private boolean j;
        private LatLonPoint k;
        private boolean l;
        private Map<String, String> m;
        private String n;

        public Query(String str, String str2) {
            this(str, str2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Query query = (Query) obj;
            if (this.d == query.d && this.e == query.e && this.g == query.g && this.h == query.h && this.j == query.j && this.l == query.l && Objects.equals(this.f2143a, query.f2143a) && Objects.equals(this.b, query.b) && Objects.equals(this.c, query.c) && Objects.equals(this.f, query.f) && Objects.equals(this.i, query.i) && Objects.equals(this.k, query.k) && Objects.equals(this.m, query.m)) {
                return Objects.equals(this.n, query.n);
            }
            return false;
        }

        public String getBuilding() {
            return this.i;
        }

        public String getCategory() {
            String str = this.b;
            return (str == null || str.equals(PhoneMasks.EXTRA_NUMBERS) || this.b.equals("00|")) ? "" : this.b;
        }

        public String getCity() {
            return this.c;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public Map<String, String> getCustomParams() {
            return this.m;
        }

        public String getExtensions() {
            return this.n;
        }

        public LatLonPoint getLocation() {
            return this.k;
        }

        public int getPageNum() {
            return this.d;
        }

        public int getPageSize() {
            return this.e;
        }

        protected String getQueryLanguage() {
            return this.f;
        }

        public String getQueryString() {
            return this.f2143a;
        }

        public int hashCode() {
            String str = this.f2143a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
            String str4 = this.f;
            int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31;
            String str5 = this.i;
            int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            LatLonPoint latLonPoint = this.k;
            int hashCode6 = (((hashCode5 + (latLonPoint != null ? latLonPoint.hashCode() : 0)) * 31) + (this.l ? 1 : 0)) * 31;
            Map<String, String> map = this.m;
            int hashCode7 = (hashCode6 + (map != null ? map.hashCode() : 0)) * 31;
            String str6 = this.n;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public boolean isDistanceSort() {
            return this.j;
        }

        public boolean isRequireSubPois() {
            return this.h;
        }

        public boolean isSpecial() {
            return this.l;
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            return PoiSearch.a(query.f2143a, this.f2143a) && PoiSearch.a(query.b, this.b) && PoiSearch.a(query.f, this.f) && PoiSearch.a(query.c, this.c) && PoiSearch.a(query.n, this.n) && PoiSearch.a(query.i, this.i) && query.g == this.g && query.e == this.e && query.j == this.j && query.m.equals(this.m) && query.l == this.l;
        }

        public void requireSubPois(boolean z) {
            this.h = z;
        }

        public void setBuilding(String str) {
            this.i = str;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public void setCustomParams(Map<String, String> map) {
            if (map != null) {
                this.m.putAll(map);
            }
        }

        public void setDistanceSort(boolean z) {
            this.j = z;
        }

        public void setExtensions(String str) {
            this.n = str;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.k = latLonPoint;
        }

        public void setPageNum(int i) {
            if (i < 1) {
                i = 1;
            }
            this.d = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.e = 20;
            } else if (i > 30) {
                this.e = 30;
            } else {
                this.e = i;
            }
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f = "en";
            } else {
                this.f = "zh-CN";
            }
        }

        public void setSpecial(boolean z) {
            this.l = z;
        }

        public Query(String str, String str2, String str3) {
            this.d = 1;
            this.e = 20;
            this.f = "zh-CN";
            this.g = false;
            this.h = false;
            this.j = true;
            this.l = true;
            this.m = new HashMap();
            this.n = "base";
            this.f2143a = str;
            this.b = str2;
            this.c = str3;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m6890clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f2143a, this.b, this.c);
            query.setPageNum(this.d);
            query.setPageSize(this.e);
            query.setQueryLanguage(this.f);
            query.setCityLimit(this.g);
            query.requireSubPois(this.h);
            query.setBuilding(this.i);
            query.setLocation(this.k);
            query.setDistanceSort(this.j);
            query.setSpecial(this.l);
            query.setExtensions(this.n);
            query.setCustomParams(this.m);
            return query;
        }
    }

    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String ELLIPSE_SHAPE = "Ellipse";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* renamed from: a, reason: collision with root package name */
        private LatLonPoint f2144a;
        private LatLonPoint b;
        private int c;
        private LatLonPoint d;
        private String e;
        private boolean f;
        private List<LatLonPoint> g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f = true;
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
        }

        private void a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f2144a = latLonPoint;
            this.b = latLonPoint2;
            if (latLonPoint.getLatitude() >= this.b.getLatitude() || this.f2144a.getLongitude() >= this.b.getLongitude()) {
                new IllegalArgumentException("invalid rect ").printStackTrace();
            }
            this.d = new LatLonPoint((this.f2144a.getLatitude() + this.b.getLatitude()) / 2.0d, (this.f2144a.getLongitude() + this.b.getLongitude()) / 2.0d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SearchBound searchBound = (SearchBound) obj;
            LatLonPoint latLonPoint = this.d;
            if (latLonPoint == null) {
                if (searchBound.d != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(searchBound.d)) {
                return false;
            }
            if (this.f != searchBound.f) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.f2144a;
            if (latLonPoint2 == null) {
                if (searchBound.f2144a != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(searchBound.f2144a)) {
                return false;
            }
            LatLonPoint latLonPoint3 = this.b;
            if (latLonPoint3 == null) {
                if (searchBound.b != null) {
                    return false;
                }
            } else if (!latLonPoint3.equals(searchBound.b)) {
                return false;
            }
            List<LatLonPoint> list = this.g;
            if (list == null) {
                if (searchBound.g != null) {
                    return false;
                }
            } else if (!list.equals(searchBound.g)) {
                return false;
            }
            if (this.c != searchBound.c) {
                return false;
            }
            String str = this.e;
            if (str == null) {
                if (searchBound.e != null) {
                    return false;
                }
            } else if (!str.equals(searchBound.e)) {
                return false;
            }
            return true;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public LatLonPoint getLowerLeft() {
            return this.f2144a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.g;
        }

        public int getRange() {
            return this.c;
        }

        public String getShape() {
            return this.e;
        }

        public LatLonPoint getUpperRight() {
            return this.b;
        }

        public int hashCode() {
            LatLonPoint latLonPoint = this.d;
            int hashCode = ((((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31) + (this.f ? 1231 : 1237)) * 31;
            LatLonPoint latLonPoint2 = this.f2144a;
            int hashCode2 = (hashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.b;
            int hashCode3 = (hashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            List<LatLonPoint> list = this.g;
            int hashCode4 = (((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31;
            String str = this.e;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        public boolean isDistanceSort() {
            return this.f;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m6891clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "PoiSearch", "SearchBoundClone");
            }
            return new SearchBound(this.f2144a, this.b, this.c, this.d, this.e, this.g, this.f);
        }

        public SearchBound(LatLonPoint latLonPoint, int i, boolean z) {
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
            this.f = z;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.c = 1500;
            this.f = true;
            this.e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        public SearchBound(List<LatLonPoint> list) {
            this.c = 1500;
            this.f = true;
            this.e = "Polygon";
            this.g = list;
        }

        private SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.f2144a = latLonPoint;
            this.b = latLonPoint2;
            this.c = i;
            this.d = latLonPoint3;
            this.e = str;
            this.g = list;
            this.f = z;
        }
    }

    public PoiSearch(Context context, Query query) throws AMapException {
        this.f2142a = null;
        try {
            this.f2142a = new j8(context, query);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof AMapException) {
                throw ((AMapException) e);
            }
        }
    }

    static boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public SearchBound getBound() {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            return iPoiSearch.getBound();
        }
        return null;
    }

    public String getLanguage() {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            return iPoiSearch.getLanguage();
        }
        return null;
    }

    public Query getQuery() {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            return iPoiSearch.getQuery();
        }
        return null;
    }

    public PoiResult searchPOI() throws AMapException {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIAsyn();
        }
    }

    public PoiItem searchPOIId(String str) throws AMapException {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            return iPoiSearch.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.searchPOIIdAsyn(str);
        }
    }

    public void setBound(SearchBound searchBound) {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.setBound(searchBound);
        }
    }

    public void setLanguage(String str) {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.setLanguage(str);
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setQuery(Query query) {
        IPoiSearch iPoiSearch = this.f2142a;
        if (iPoiSearch != null) {
            iPoiSearch.setQuery(query);
        }
    }
}
