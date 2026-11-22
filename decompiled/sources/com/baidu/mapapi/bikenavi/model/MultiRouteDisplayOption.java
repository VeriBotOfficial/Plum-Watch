package com.baidu.mapapi.bikenavi.model;

import com.baidu.mapapi.map.BitmapDescriptor;

/* loaded from: classes13.dex */
public class MultiRouteDisplayOption {
    private BitmapDescriptor mFocusRouteBitmapDescriptor;
    private BitmapDescriptor mNoFocusRouteBitmapDescriptor;
    private int mFocusRouteWidth = 0;
    private int mNoFocusRouteWidth = 0;
    private int mFocusColor = 0;
    private int mNoFocusColor = 0;

    public int getFocusColor() {
        return this.mFocusColor;
    }

    public BitmapDescriptor getFocusRouteBitmapDescriptor() {
        return this.mFocusRouteBitmapDescriptor;
    }

    public int getFocusRouteWidth() {
        return this.mFocusRouteWidth;
    }

    public int getNoFocusColor() {
        return this.mNoFocusColor;
    }

    public BitmapDescriptor getNoFocusRouteBitmapDescriptor() {
        return this.mNoFocusRouteBitmapDescriptor;
    }

    public int getNoFocusRouteWidth() {
        return this.mNoFocusRouteWidth;
    }

    public void setFocusColor(int i) {
        this.mFocusColor = i;
    }

    public void setFocusRouteBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.mFocusRouteBitmapDescriptor = bitmapDescriptor;
    }

    public void setFocusRouteWidth(int i) {
        this.mFocusRouteWidth = i;
    }

    public void setNoFocusColor(int i) {
        this.mNoFocusColor = i;
    }

    public void setNoFocusRouteBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.mNoFocusRouteBitmapDescriptor = bitmapDescriptor;
    }

    public void setNoFocusRouteWidth(int i) {
        this.mNoFocusRouteWidth = i;
    }
}
