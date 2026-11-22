package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGround;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;

/* loaded from: classes13.dex */
public final class GroundOverlay extends Overlay {
    int g;
    BitmapDescriptor h;
    LatLng i;
    double j;
    double k;
    float l;
    float m;
    LatLngBounds n;
    float o;
    private BmGround p;

    /* renamed from: q, reason: collision with root package name */
    boolean f7912q = false;

    GroundOverlay() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.ground;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        bundle.putBundle("image_info", this.h.a());
        if (this.g == 1) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.n.southwest);
            double longitudeE6 = ll2mc.getLongitudeE6();
            double latitudeE6 = ll2mc.getLatitudeE6();
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.n.northeast);
            double longitudeE62 = ll2mc2.getLongitudeE6();
            double latitudeE62 = ll2mc2.getLatitudeE6();
            double d = longitudeE62 - longitudeE6;
            this.j = d;
            double d2 = latitudeE62 - latitudeE6;
            this.k = d2;
            this.i = CoordUtil.mc2ll(new GeoPoint(latitudeE6 + (d2 / 2.0d), longitudeE6 + (d / 2.0d)));
            this.l = 0.5f;
            this.m = 0.5f;
        }
        double d3 = this.j;
        if (d3 <= 0.0d || this.k <= 0.0d) {
            throw new IllegalStateException("BDMapSDKException: when you add ground overlay, the width and height must greater than 0");
        }
        bundle.putDouble("x_distance", d3);
        if (this.k == 2.147483647E9d) {
            this.k = (int) ((this.j * this.h.f7895a.getHeight()) / this.h.f7895a.getWidth());
        }
        bundle.putDouble("y_distance", this.k);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(this.i);
        bundle.putDouble("location_x", ll2mc3.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc3.getLatitudeE6());
        bundle.putFloat("anchor_x", this.l);
        bundle.putFloat("anchor_y", this.m);
        bundle.putFloat("transparency", this.o);
        bundle.putInt("isClickable", this.f7912q ? 1 : 0);
        return bundle;
    }

    public float getAnchorX() {
        return this.l;
    }

    public float getAnchorY() {
        return this.m;
    }

    public LatLngBounds getBounds() {
        return this.n;
    }

    public double getHeight() {
        return this.k;
    }

    public BitmapDescriptor getImage() {
        return this.h;
    }

    public LatLng getPosition() {
        return this.i;
    }

    public float getTransparency() {
        return this.o;
    }

    public double getWidth() {
        return this.j;
    }

    public boolean isClickable() {
        return this.f7912q;
    }

    public void setAnchor(float f, float f2) {
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            return;
        }
        this.l = f;
        this.m = f2;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        BmGround bmGround = this.p;
        if (bmGround == null || this.f == null) {
            return;
        }
        bmGround.b(this.l);
        this.p.c(this.m);
        this.f.b();
    }

    public void setClickable(boolean z) {
        this.f7912q = z;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        BmGround bmGround = this.p;
        if (bmGround == null || this.f == null) {
            return;
        }
        bmGround.a(this.f7912q);
        this.f.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDimensions(int r5) {
        /*
            r4 = this;
            if (r5 > 0) goto L9
            r0 = 0
            r4.j = r0
            r4.k = r0
            goto L2e
        L9:
            double r0 = (double) r5
            r4.j = r0
            r2 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            r4.k = r2
            com.baidu.mapapi.map.BitmapDescriptor r5 = r4.h
            if (r5 == 0) goto L2e
            android.graphics.Bitmap r5 = r5.f7895a
            if (r5 == 0) goto L2e
            int r5 = r5.getHeight()
            double r2 = (double) r5
            double r0 = r0 * r2
            com.baidu.mapapi.map.BitmapDescriptor r5 = r4.h
            android.graphics.Bitmap r5 = r5.f7895a
            int r5 = r5.getWidth()
            float r5 = (float) r5
            double r2 = (double) r5
            double r0 = r0 / r2
            int r5 = (int) r0
            goto L2f
        L2e:
            r5 = 0
        L2f:
            boolean r0 = com.baidu.mapapi.map.OverlayUtil.isOverlayUpgrade()
            if (r0 == 0) goto L4e
            com.baidu.platform.comapi.bmsdk.BmGround r0 = r4.p
            if (r0 == 0) goto L4d
            com.baidu.platform.comapi.bmsdk.BmLayer r1 = r4.f
            if (r1 == 0) goto L4d
            double r1 = (double) r5
            r0.a(r1)
            com.baidu.platform.comapi.bmsdk.BmGround r5 = r4.p
            double r0 = r4.j
            r5.b(r0)
            com.baidu.platform.comapi.bmsdk.BmLayer r5 = r4.f
            r5.b()
        L4d:
            return
        L4e:
            com.baidu.mapapi.map.Overlay$a r5 = r4.listener
            r5.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.GroundOverlay.setDimensions(int):void");
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: image can not be null");
        }
        this.h = bitmapDescriptor;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        if (this.p == null || this.f == null) {
            return;
        }
        this.p.a(this.h.f7895a != null ? (int) ((this.j * r5.getHeight()) / this.h.f7895a.getWidth()) : 0);
        this.p.a(new BmBitmapResource(this.h.getBitmap()));
        this.f.b();
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.g = 2;
        this.i = latLng;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
        } else {
            if (this.p == null || this.f == null) {
                return;
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(this.i);
            this.p.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            this.f.b();
        }
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("BDMapSDKException: bounds can not be null");
        }
        this.g = 1;
        this.n = latLngBounds;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        if (this.p == null || this.f == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.n.southwest);
        double longitudeE6 = ll2mc.getLongitudeE6();
        double latitudeE6 = ll2mc.getLatitudeE6();
        GeoPoint ll2mc2 = CoordUtil.ll2mc(this.n.northeast);
        double longitudeE62 = ll2mc2.getLongitudeE6();
        double latitudeE62 = ll2mc2.getLatitudeE6();
        double d = longitudeE62 - longitudeE6;
        this.j = d;
        double d2 = latitudeE62 - latitudeE6;
        this.k = d2;
        GeoPoint geoPoint = new GeoPoint(latitudeE6 + (d2 / 2.0d), longitudeE6 + (d / 2.0d));
        this.i = CoordUtil.mc2ll(geoPoint);
        this.l = 0.5f;
        this.m = 0.5f;
        this.p.a(new com.baidu.platform.comapi.bmsdk.b(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()));
        this.p.b(this.j);
        this.p.a(this.k);
        this.p.b(this.l);
        this.p.c(this.m);
        this.f.b();
    }

    public void setTransparency(float f) {
        if (f > 1.0f || f < 0.0f) {
            return;
        }
        this.o = f;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.c(this);
            return;
        }
        BmGround bmGround = this.p;
        if (bmGround == null || this.f == null) {
            return;
        }
        bmGround.a(this.o);
        this.f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        Bitmap bitmap;
        BmGround bmGround = new BmGround();
        this.p = bmGround;
        bmGround.a(this);
        setDrawItem(this.p);
        super.toDrawItem();
        if (this.h == null) {
            return this.p;
        }
        if (this.g == 1) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.n.southwest);
            double longitudeE6 = ll2mc.getLongitudeE6();
            double latitudeE6 = ll2mc.getLatitudeE6();
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.n.northeast);
            double longitudeE62 = ll2mc2.getLongitudeE6();
            double latitudeE62 = ll2mc2.getLatitudeE6();
            double d = longitudeE62 - longitudeE6;
            this.j = d;
            double d2 = latitudeE62 - latitudeE6;
            this.k = d2;
            this.i = CoordUtil.mc2ll(new GeoPoint(latitudeE6 + (d2 / 2.0d), longitudeE6 + (d / 2.0d)));
            this.l = 0.5f;
            this.m = 0.5f;
        }
        if (this.k == 2.147483647E9d && (bitmap = this.h.f7895a) != null) {
            this.k = (int) ((this.j * bitmap.getHeight()) / this.h.f7895a.getWidth());
        }
        LatLng latLng = this.i;
        if (latLng != null) {
            GeoPoint ll2mc3 = CoordUtil.ll2mc(latLng);
            this.p.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc3.getLongitudeE6(), ll2mc3.getLatitudeE6()));
        }
        this.p.b(this.j);
        this.p.a(this.k);
        this.p.b(this.l);
        this.p.c(this.m);
        this.p.a(this.f7912q);
        this.p.a(this.o);
        this.p.a(new BmBitmapResource(this.h.getBitmap()));
        return this.p;
    }

    public void setImage(BitmapDescriptor bitmapDescriptor, boolean z) {
        if (bitmapDescriptor != null) {
            this.h = bitmapDescriptor;
            if (!OverlayUtil.isOverlayUpgrade() || this.p == null || this.f == null) {
                return;
            }
            if (z) {
                this.p.a(this.h.f7895a != null ? (int) ((this.j * r3.getHeight()) / this.h.f7895a.getWidth()) : 0);
            }
            this.p.a(new BmBitmapResource(this.h.getBitmap()));
            this.f.b();
            return;
        }
        throw new IllegalArgumentException("BDMapSDKException: image can not be null");
    }

    public void setDimensions(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.j = i;
            this.k = i2;
        } else {
            this.j = 0.0d;
            this.k = 0.0d;
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            BmGround bmGround = this.p;
            if (bmGround == null || this.f == null) {
                return;
            }
            bmGround.a(this.k);
            this.p.b(this.j);
            this.f.b();
            return;
        }
        this.listener.c(this);
    }
}
