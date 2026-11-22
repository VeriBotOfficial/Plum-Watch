package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class IndoorRouteLine extends RouteLine<IndoorRouteStep> {
    public static final Parcelable.Creator<IndoorRouteLine> CREATOR = new a();

    public static class IndoorRouteStep extends RouteStep {
        private RouteNode e;
        private RouteNode f;
        private String g;
        private String h;
        private String i;
        private List<IndoorStepNode> j;
        private List<Double> k;

        public static class IndoorStepNode {

            /* renamed from: a, reason: collision with root package name */
            private String f8159a;
            private int b;
            private LatLng c;
            private String d;

            public String getDetail() {
                return this.d;
            }

            public LatLng getLocation() {
                return this.c;
            }

            public String getName() {
                return this.f8159a;
            }

            public int getType() {
                return this.b;
            }

            public void setDetail(String str) {
                this.d = str;
            }

            public void setLocation(LatLng latLng) {
                this.c = latLng;
            }

            public void setName(String str) {
                this.f8159a = str;
            }

            public void setType(int i) {
                this.b = i;
            }
        }

        private List<LatLng> a(List<Double> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i += 2) {
                arrayList.add(new LatLng(list.get(i).doubleValue(), list.get(i + 1).doubleValue()));
            }
            return arrayList;
        }

        public String getBuildingId() {
            return this.i;
        }

        public RouteNode getEntrace() {
            return this.e;
        }

        public RouteNode getExit() {
            return this.f;
        }

        public String getFloorId() {
            return this.h;
        }

        public String getInstructions() {
            return this.g;
        }

        public List<IndoorStepNode> getStepNodes() {
            return this.j;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.k);
            }
            return this.mWayPoints;
        }

        public void setBuildingId(String str) {
            this.i = str;
        }

        public void setEntrace(RouteNode routeNode) {
            this.e = routeNode;
        }

        public void setExit(RouteNode routeNode) {
            this.f = routeNode;
        }

        public void setFloorId(String str) {
            this.h = str;
        }

        public void setInstructions(String str) {
            this.g = str;
        }

        public void setPath(List<Double> list) {
            this.k = list;
        }

        public void setStepNodes(List<IndoorStepNode> list) {
            this.j = list;
        }
    }

    static class a implements Parcelable.Creator<IndoorRouteLine> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteLine createFromParcel(Parcel parcel) {
            return new IndoorRouteLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorRouteLine[] newArray(int i) {
            return new IndoorRouteLine[i];
        }
    }

    public IndoorRouteLine() {
        setType(RouteLine.TYPE.WALKSTEP);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<IndoorRouteStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected IndoorRouteLine(Parcel parcel) {
        super(parcel);
    }
}
