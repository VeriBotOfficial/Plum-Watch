package com.amap.api.services.nearby;

import android.content.Context;
import com.amap.api.col.p0003sl.b6;
import com.amap.api.col.p0003sl.i8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;

/* loaded from: classes11.dex */
public class NearbySearch {
    public static final int AMAP = 1;
    public static final int GPS = 0;
    private static NearbySearch b;

    /* renamed from: a, reason: collision with root package name */
    private INearbySearch f2129a;

    public interface NearbyListener {
        void onNearbyInfoSearched(NearbySearchResult nearbySearchResult, int i);

        void onNearbyInfoUploaded(int i);

        void onUserInfoCleared(int i);
    }

    public static class NearbyQuery {

        /* renamed from: a, reason: collision with root package name */
        private LatLonPoint f2130a;
        private NearbySearchFunctionType b = NearbySearchFunctionType.DISTANCE_SEARCH;
        private int c = 1000;
        private int d = 1800;
        private int e = 1;

        public LatLonPoint getCenterPoint() {
            return this.f2130a;
        }

        public int getCoordType() {
            return this.e;
        }

        public int getRadius() {
            return this.c;
        }

        public int getTimeRange() {
            return this.d;
        }

        public int getType() {
            int ordinal = this.b.ordinal();
            return (ordinal == 0 || ordinal != 1) ? 0 : 1;
        }

        public void setCenterPoint(LatLonPoint latLonPoint) {
            this.f2130a = latLonPoint;
        }

        public void setCoordType(int i) {
            if (i == 0 || i == 1) {
                this.e = i;
            } else {
                this.e = 1;
            }
        }

        public void setRadius(int i) {
            if (i > 10000) {
                i = 10000;
            }
            this.c = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0008, code lost:
        
            if (r2 > 86400) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void setTimeRange(int r2) {
            /*
                r1 = this;
                r0 = 5
                if (r2 >= r0) goto L5
            L3:
                r2 = r0
                goto Lb
            L5:
                r0 = 86400(0x15180, float:1.21072E-40)
                if (r2 <= r0) goto Lb
                goto L3
            Lb:
                r1.d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.nearby.NearbySearch.NearbyQuery.setTimeRange(int):void");
        }

        public void setType(NearbySearchFunctionType nearbySearchFunctionType) {
            this.b = nearbySearchFunctionType;
        }
    }

    private NearbySearch(Context context) throws AMapException {
        if (this.f2129a == null) {
            try {
                this.f2129a = new i8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public static synchronized void destroy() {
        synchronized (NearbySearch.class) {
            NearbySearch nearbySearch = b;
            if (nearbySearch != null) {
                try {
                    INearbySearch iNearbySearch = nearbySearch.f2129a;
                    if (iNearbySearch != null) {
                        iNearbySearch.destroy();
                    }
                    nearbySearch.f2129a = null;
                } catch (Throwable th) {
                    b6.a(th, "NearbySearch", "destryoy");
                }
            }
            b = null;
        }
    }

    public static synchronized NearbySearch getInstance(Context context) throws AMapException {
        NearbySearch nearbySearch;
        synchronized (NearbySearch.class) {
            if (b == null) {
                try {
                    b = new NearbySearch(context);
                } catch (AMapException e) {
                    throw e;
                }
            }
            nearbySearch = b;
        }
        return nearbySearch;
    }

    public synchronized void addNearbyListener(NearbyListener nearbyListener) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.addNearbyListener(nearbyListener);
        }
    }

    public void clearUserInfoAsyn() {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.clearUserInfoAsyn();
        }
    }

    public synchronized void removeNearbyListener(NearbyListener nearbyListener) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.removeNearbyListener(nearbyListener);
        }
    }

    public NearbySearchResult searchNearbyInfo(NearbyQuery nearbyQuery) throws AMapException {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            return iNearbySearch.searchNearbyInfo(nearbyQuery);
        }
        return null;
    }

    public void searchNearbyInfoAsyn(NearbyQuery nearbyQuery) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.searchNearbyInfoAsyn(nearbyQuery);
        }
    }

    public void setUserID(String str) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.setUserID(str);
        }
    }

    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.startUploadNearbyInfoAuto(uploadInfoCallback, i);
        }
    }

    public synchronized void stopUploadNearbyInfoAuto() {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.stopUploadNearbyInfoAuto();
        }
    }

    public void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        INearbySearch iNearbySearch = this.f2129a;
        if (iNearbySearch != null) {
            iNearbySearch.uploadNearbyInfoAsyn(uploadInfo);
        }
    }
}
