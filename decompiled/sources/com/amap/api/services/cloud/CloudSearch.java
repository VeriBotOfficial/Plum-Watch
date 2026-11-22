package com.amap.api.services.cloud;

import android.content.Context;
import com.amap.api.col.p0003sl.b6;
import com.amap.api.col.p0003sl.d8;
import com.amap.api.col.p0003sl.e7;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class CloudSearch {

    /* renamed from: a, reason: collision with root package name */
    private ICloudSearch f2097a;

    public interface OnCloudSearchListener {
        void onCloudItemDetailSearched(CloudItemDetail cloudItemDetail, int i);

        void onCloudSearched(CloudResult cloudResult, int i);
    }

    public static class Query implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private String f2098a;
        private String d;
        private SearchBound e;
        private Sortingrules f;
        private int b = 1;
        private int c = 20;
        private ArrayList<e7> g = new ArrayList<>();
        private List<String> h = new ArrayList();

        public Query(String str, String str2, SearchBound searchBound) throws AMapException {
            if (b6.a(str) || searchBound == null) {
                throw new AMapException(AMapException.AMAP_CLIENT_INVALID_PARAMETER);
            }
            this.d = str;
            this.f2098a = str2;
            this.e = searchBound;
        }

        public void addFilterNum(String str, String str2, String str3) {
            this.g.add(new e7(str, str2, str3));
        }

        public void addFilterString(String str, String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.h.add(str + str2);
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Query)) {
                if (obj == this) {
                    return true;
                }
                Query query = (Query) obj;
                if (queryEquals(query) && query.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public SearchBound getBound() {
            return this.e;
        }

        public String getFilterNumString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    e7 e7Var = this.g.get(i);
                    stringBuffer.append(e7Var.a()).append(">=").append(e7Var.b()).append("&&").append(e7Var.a()).append("<=").append(e7Var.c());
                    if (i != size - 1) {
                        stringBuffer.append("&&");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public String getFilterString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int size = this.h.size();
                for (int i = 0; i < size; i++) {
                    stringBuffer.append(this.h.get(i));
                    if (i != size - 1) {
                        stringBuffer.append("&&");
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return stringBuffer.toString();
        }

        public int getPageNum() {
            return this.b;
        }

        public int getPageSize() {
            return this.c;
        }

        public String getQueryString() {
            return this.f2098a;
        }

        public Sortingrules getSortingrules() {
            return this.f;
        }

        public String getTableID() {
            return this.d;
        }

        public int hashCode() {
            ArrayList<e7> arrayList = this.g;
            int hashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31;
            List<String> list = this.h;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            SearchBound searchBound = this.e;
            int hashCode3 = (((((hashCode2 + (searchBound == null ? 0 : searchBound.hashCode())) * 31) + this.b) * 31) + this.c) * 31;
            String str = this.f2098a;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Sortingrules sortingrules = this.f;
            int hashCode5 = (hashCode4 + (sortingrules == null ? 0 : sortingrules.hashCode())) * 31;
            String str2 = this.d;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            if (CloudSearch.a(query.f2098a, this.f2098a) && CloudSearch.a(query.getTableID(), getTableID()) && CloudSearch.a(query.getFilterString(), getFilterString()) && CloudSearch.a(query.getFilterNumString(), getFilterNumString()) && query.c == this.c) {
                SearchBound bound = query.getBound();
                SearchBound bound2 = getBound();
                if ((bound == null && bound2 == null) ? true : (bound == null || bound2 == null) ? false : bound.equals(bound2)) {
                    Sortingrules sortingrules = query.getSortingrules();
                    Sortingrules sortingrules2 = getSortingrules();
                    if ((sortingrules == null && sortingrules2 == null) ? true : (sortingrules == null || sortingrules2 == null) ? false : sortingrules.equals(sortingrules2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void setBound(SearchBound searchBound) {
            this.e = searchBound;
        }

        public void setPageNum(int i) {
            this.b = i;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.c = 20;
            } else if (i > 100) {
                this.c = 100;
            } else {
                this.c = i;
            }
        }

        public void setSortingrules(Sortingrules sortingrules) {
            this.f = sortingrules;
        }

        public void setTableID(String str) {
            this.d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.amap.api.services.cloud.CloudSearch.Query m6887clone() {
            /*
                r6 = this;
                super.clone()     // Catch: java.lang.CloneNotSupportedException -> L4
                goto L8
            L4:
                r0 = move-exception
                r0.printStackTrace()
            L8:
                r0 = 0
                com.amap.api.services.cloud.CloudSearch$Query r1 = new com.amap.api.services.cloud.CloudSearch$Query     // Catch: com.amap.api.services.core.AMapException -> L4b
                java.lang.String r2 = r6.d     // Catch: com.amap.api.services.core.AMapException -> L4b
                java.lang.String r3 = r6.f2098a     // Catch: com.amap.api.services.core.AMapException -> L4b
                com.amap.api.services.cloud.CloudSearch$SearchBound r4 = r6.e     // Catch: com.amap.api.services.core.AMapException -> L4b
                r1.<init>(r2, r3, r4)     // Catch: com.amap.api.services.core.AMapException -> L4b
                int r2 = r6.b     // Catch: com.amap.api.services.core.AMapException -> L49
                r1.setPageNum(r2)     // Catch: com.amap.api.services.core.AMapException -> L49
                int r2 = r6.c     // Catch: com.amap.api.services.core.AMapException -> L49
                r1.setPageSize(r2)     // Catch: com.amap.api.services.core.AMapException -> L49
                com.amap.api.services.cloud.CloudSearch$Sortingrules r2 = r6.getSortingrules()     // Catch: com.amap.api.services.core.AMapException -> L49
                r1.setSortingrules(r2)     // Catch: com.amap.api.services.core.AMapException -> L49
                java.util.ArrayList<com.amap.api.col.3sl.e7> r2 = r6.g     // Catch: com.amap.api.services.core.AMapException -> L49
                if (r2 != 0) goto L2b
                r2 = r0
                goto L35
            L2b:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: com.amap.api.services.core.AMapException -> L49
                r2.<init>()     // Catch: com.amap.api.services.core.AMapException -> L49
                java.util.ArrayList<com.amap.api.col.3sl.e7> r3 = r6.g     // Catch: com.amap.api.services.core.AMapException -> L49
                r2.addAll(r3)     // Catch: com.amap.api.services.core.AMapException -> L49
            L35:
                r1.g = r2     // Catch: com.amap.api.services.core.AMapException -> L49
                java.util.List<java.lang.String> r2 = r6.h     // Catch: com.amap.api.services.core.AMapException -> L49
                if (r2 != 0) goto L3c
                goto L46
            L3c:
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: com.amap.api.services.core.AMapException -> L49
                r0.<init>()     // Catch: com.amap.api.services.core.AMapException -> L49
                java.util.List<java.lang.String> r2 = r6.h     // Catch: com.amap.api.services.core.AMapException -> L49
                r0.addAll(r2)     // Catch: com.amap.api.services.core.AMapException -> L49
            L46:
                r1.h = r0     // Catch: com.amap.api.services.core.AMapException -> L49
                goto L52
            L49:
                r0 = move-exception
                goto L4f
            L4b:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L4f:
                r0.printStackTrace()
            L52:
                if (r1 != 0) goto L5a
                com.amap.api.services.cloud.CloudSearch$Query r0 = new com.amap.api.services.cloud.CloudSearch$Query
                r0.<init>()
                return r0
            L5a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.cloud.CloudSearch.Query.m6887clone():com.amap.api.services.cloud.CloudSearch$Query");
        }

        private Query() {
        }
    }

    public static class SearchBound implements Cloneable {
        public static final String BOUND_SHAPE = "Bound";
        public static final String LOCAL_SHAPE = "Local";
        public static final String POLYGON_SHAPE = "Polygon";
        public static final String RECTANGLE_SHAPE = "Rectangle";

        /* renamed from: a, reason: collision with root package name */
        private LatLonPoint f2099a;
        private LatLonPoint b;
        private int c;
        private LatLonPoint d;
        private String e;
        private List<LatLonPoint> f;
        private String g;

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.e = "Bound";
            this.c = i;
            this.d = latLonPoint;
        }

        private boolean a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f2099a = latLonPoint;
            this.b = latLonPoint2;
            return latLonPoint != null && latLonPoint2 != null && latLonPoint.getLatitude() < this.b.getLatitude() && this.f2099a.getLongitude() < this.b.getLongitude();
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof SearchBound)) {
                SearchBound searchBound = (SearchBound) obj;
                if (!getShape().equalsIgnoreCase(searchBound.getShape())) {
                    return false;
                }
                if (getShape().equals("Bound")) {
                    return searchBound.d.equals(this.d) && searchBound.c == this.c;
                }
                if (getShape().equals("Polygon")) {
                    List<LatLonPoint> list = searchBound.f;
                    List<LatLonPoint> list2 = this.f;
                    if (list != null || list2 != null) {
                        if (list != null && list2 != null && list.size() == list2.size()) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                if (list.get(i).equals(list2.get(i))) {
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                if (getShape().equals(LOCAL_SHAPE)) {
                    return searchBound.g.equals(this.g);
                }
                if (searchBound.f2099a.equals(this.f2099a) && searchBound.b.equals(this.b)) {
                    return true;
                }
            }
            return false;
        }

        public LatLonPoint getCenter() {
            return this.d;
        }

        public String getCity() {
            return this.g;
        }

        public LatLonPoint getLowerLeft() {
            return this.f2099a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f;
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
            int hashCode = ((latLonPoint == null ? 0 : latLonPoint.hashCode()) + 31) * 31;
            LatLonPoint latLonPoint2 = this.f2099a;
            int hashCode2 = (hashCode + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            LatLonPoint latLonPoint3 = this.b;
            int hashCode3 = (hashCode2 + (latLonPoint3 == null ? 0 : latLonPoint3.hashCode())) * 31;
            List<LatLonPoint> list = this.f;
            int hashCode4 = (((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.c) * 31;
            String str = this.e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SearchBound m6888clone() {
            ArrayList arrayList;
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (getShape().equals("Bound")) {
                return new SearchBound(this.d, this.c);
            }
            if (!getShape().equals("Polygon")) {
                return getShape().equals(LOCAL_SHAPE) ? new SearchBound(this.g) : new SearchBound(this.f2099a, this.b);
            }
            if (this.f == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (LatLonPoint latLonPoint : this.f) {
                    arrayList.add(new LatLonPoint(latLonPoint.getLatitude(), latLonPoint.getLongitude()));
                }
            }
            return new SearchBound(arrayList);
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.e = "Rectangle";
            if (a(latLonPoint, latLonPoint2)) {
                return;
            }
            new IllegalArgumentException("invalid rect ").printStackTrace();
        }

        public SearchBound(List<LatLonPoint> list) {
            this.e = "Polygon";
            this.f = list;
        }

        public SearchBound(String str) {
            this.e = LOCAL_SHAPE;
            this.g = str;
        }
    }

    public CloudSearch(Context context) throws AMapException {
        if (this.f2097a == null) {
            try {
                this.f2097a = new d8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
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

    public void searchCloudAsyn(Query query) {
        ICloudSearch iCloudSearch = this.f2097a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudAsyn(query);
        }
    }

    public void searchCloudDetailAsyn(String str, String str2) {
        ICloudSearch iCloudSearch = this.f2097a;
        if (iCloudSearch != null) {
            iCloudSearch.searchCloudDetailAsyn(str, str2);
        }
    }

    public void setOnCloudSearchListener(OnCloudSearchListener onCloudSearchListener) {
        ICloudSearch iCloudSearch = this.f2097a;
        if (iCloudSearch != null) {
            iCloudSearch.setOnCloudSearchListener(onCloudSearchListener);
        }
    }

    public static class Sortingrules {
        public static final int DISTANCE = 1;
        public static final int WEIGHT = 0;

        /* renamed from: a, reason: collision with root package name */
        private int f2100a;
        private String b;
        private boolean c;

        public Sortingrules(String str, boolean z) {
            this.f2100a = 0;
            this.b = str;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Sortingrules sortingrules = (Sortingrules) obj;
            if (this.c != sortingrules.c) {
                return false;
            }
            String str = this.b;
            if (str == null) {
                if (sortingrules.b != null) {
                    return false;
                }
            } else if (!str.equals(sortingrules.b)) {
                return false;
            }
            return this.f2100a == sortingrules.f2100a;
        }

        public int hashCode() {
            int i = ((this.c ? 1231 : 1237) + 31) * 31;
            String str = this.b;
            return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.f2100a;
        }

        public String toString() {
            if (!b6.a(this.b)) {
                return this.c ? this.b + ":asc" : this.b + ":desc";
            }
            int i = this.f2100a;
            return i == 0 ? "_weight:desc" : i == 1 ? "_distance:asc" : "";
        }

        public Sortingrules(int i) {
            this.c = true;
            this.f2100a = i;
        }
    }
}
