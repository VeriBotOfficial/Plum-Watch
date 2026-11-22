package com.amap.api.col.p0003sl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.map3d.R;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;

/* compiled from: MapFragmentDelegateImp.java */
/* loaded from: classes11.dex */
public class a1 implements IMapFragmentDelegate {
    public static volatile Context f;
    private static String g;

    /* renamed from: a, reason: collision with root package name */
    private IAMap f1509a;
    private int c;
    private AMapOptions d;
    public int b = 0;
    boolean e = true;

    public a1(int i) {
        this.c = 0;
        this.c = i % 3;
        a();
    }

    void a(AMapOptions aMapOptions) throws RemoteException {
        if (aMapOptions == null || this.f1509a == null) {
            return;
        }
        CameraPosition camera = aMapOptions.getCamera();
        if (camera != null) {
            this.f1509a.moveCamera(CameraUpdateFactory.newCameraPosition(camera));
        }
        UiSettings aMapUiSettings = this.f1509a.getAMapUiSettings();
        aMapUiSettings.setRotateGesturesEnabled(aMapOptions.getRotateGesturesEnabled());
        aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled());
        aMapUiSettings.setTiltGesturesEnabled(aMapOptions.getTiltGesturesEnabled());
        aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled());
        aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled());
        aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled());
        aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled());
        aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
        this.f1509a.setMapType(aMapOptions.getMapType());
        this.f1509a.setZOrderOnTop(aMapOptions.getZOrderOnTop());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public IAMap getMap() throws RemoteException {
        if (this.f1509a == null) {
            if (f == null) {
                Log.w("MapFragmentDelegateImp", n1.a(R.string.O105492_286));
                return null;
            }
            int i = f.getResources().getDisplayMetrics().densityDpi;
            if (i <= 120) {
                v0.b = 0.5f;
            } else if (i <= 160) {
                v0.b = 0.8f;
            } else if (i <= 240) {
                v0.b = 0.87f;
            } else if (i <= 320) {
                v0.b = 1.0f;
            } else if (i <= 480) {
                v0.b = 1.5f;
            } else if (i <= 640) {
                v0.b = 1.8f;
            } else {
                v0.b = 0.9f;
            }
            int i2 = this.c;
            if (i2 == 0) {
                this.f1509a = new k0(f, null, this.e).a();
            } else if (i2 == 1) {
                this.f1509a = new l0(f, this.e).f();
            } else {
                this.f1509a = new j0(f, null).a();
            }
        }
        return this.f1509a;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void loadWorldVectorMap(boolean z) {
        this.e = z;
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.loadWorldVectorMap(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onCreate(Bundle bundle) throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws RemoteException {
        byte[] byteArray;
        if (f == null && layoutInflater != null) {
            setContext(layoutInflater.getContext().getApplicationContext());
        }
        try {
            IAMap map = getMap();
            this.f1509a = map;
            map.setVisibilityEx(this.b);
            if (this.d == null && bundle != null && (byteArray = bundle.getByteArray("MAP_OPTIONS")) != null) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                this.d = AMapOptions.CREATOR.createFromParcel(obtain);
            }
            a(this.d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.f1509a.getView();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onDestroy() throws RemoteException {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < stackTrace.length; i++) {
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("TextureMapView")) {
                    z2 = true;
                }
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("Fragment")) {
                    z = true;
                }
                if ("OnDestroyView".equalsIgnoreCase(stackTrace[i].getMethodName())) {
                    z3 = true;
                }
            }
            if (z && z2 && !z3) {
                Log.i("errorLog", g);
                Log.i("errorLog", "OnDestroy 方法需要在OnDestroyView中调用");
                Log.i("errorLog", g);
            }
        } catch (Throwable unused) {
        }
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.destroy();
            this.f1509a = null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onDestroyView() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) throws RemoteException {
        setContext(activity.getApplicationContext());
        this.d = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onLowMemory() throws RemoteException {
        Log.d("onLowMemory", "onLowMemory run");
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onPause() throws RemoteException {
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.onActivityPause();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onResume() throws RemoteException {
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.onActivityResume();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void onSaveInstanceState(Bundle bundle) throws RemoteException {
        if (this.f1509a != null) {
            if (this.d == null) {
                this.d = new AMapOptions();
            }
            try {
                Parcel obtain = Parcel.obtain();
                AMapOptions camera = this.d.camera(getMap().getCameraPosition());
                this.d = camera;
                camera.writeToParcel(obtain, 0);
                bundle.putByteArray("MAP_OPTIONS", obtain.marshall());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void setContext(Context context) {
        if (context != null) {
            f = context.getApplicationContext();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void setOptions(AMapOptions aMapOptions) {
        this.d = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void setUseForNavi(boolean z) {
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.setUseForNavi(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public void setVisibility(int i) {
        this.b = i;
        IAMap iAMap = this.f1509a;
        if (iAMap != null) {
            iAMap.setVisibilityEx(i);
        }
    }

    private void a() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 80; i++) {
                sb.append("=");
            }
            g = sb.toString();
        } catch (Throwable unused) {
        }
    }
}
