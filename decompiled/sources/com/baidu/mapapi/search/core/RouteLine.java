package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.route.BikingRouteLine;
import com.baidu.mapapi.search.route.DrivingRouteLine;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import java.util.List;

/* loaded from: classes13.dex */
public class RouteLine<T extends RouteStep> implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private RouteNode f8074a;
    private RouteNode b;
    private String c;
    private List<T> d;
    private int e;
    private int f;
    private a g;
    TYPE h;

    protected enum TYPE {
        DRIVESTEP(0),
        TRANSITSTEP(1),
        WALKSTEP(2),
        BIKINGSTEP(3);

        private int b;

        TYPE(int i) {
            this.b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.b;
        }
    }

    protected RouteLine() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<T> getAllStep() {
        return this.d;
    }

    public int getDistance() {
        return this.e;
    }

    public int getDuration() {
        return this.f;
    }

    public a getLegLinked() {
        return this.g;
    }

    public RouteNode getStarting() {
        return this.f8074a;
    }

    public RouteNode getTerminal() {
        return this.b;
    }

    public String getTitle() {
        return this.c;
    }

    protected TYPE getType() {
        return this.h;
    }

    public void setDistance(int i) {
        this.e = i;
    }

    public void setDuration(int i) {
        this.f = i;
    }

    public void setLegLinked(a aVar) {
        this.g = aVar;
    }

    public void setStarting(RouteNode routeNode) {
        this.f8074a = routeNode;
    }

    public void setSteps(List<T> list) {
        this.d = list;
    }

    public void setTerminal(RouteNode routeNode) {
        this.b = routeNode;
    }

    public void setTitle(String str) {
        this.c = str;
    }

    protected void setType(TYPE type) {
        this.h = type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TYPE type = this.h;
        if (type != null) {
            parcel.writeInt(type.a());
        } else {
            parcel.writeInt(10);
        }
        parcel.writeValue(this.f8074a);
        parcel.writeValue(this.b);
        parcel.writeString(this.c);
        if (this.h != null) {
            parcel.writeTypedList(this.d);
        }
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    protected RouteLine(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8074a = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.b = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.c = parcel.readString();
        if (readInt == 0) {
            this.d = parcel.createTypedArrayList(DrivingRouteLine.DrivingStep.CREATOR);
        } else if (readInt == 1) {
            this.d = parcel.createTypedArrayList(TransitRouteLine.TransitStep.CREATOR);
        } else if (readInt == 2) {
            this.d = parcel.createTypedArrayList(WalkingRouteLine.WalkingStep.CREATOR);
        } else if (readInt == 3) {
            this.d = parcel.createTypedArrayList(BikingRouteLine.BikingStep.CREATOR);
        }
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }
}
