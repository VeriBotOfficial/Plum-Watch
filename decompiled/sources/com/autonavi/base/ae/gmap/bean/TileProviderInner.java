package com.autonavi.base.ae.gmap.bean;

import android.text.TextUtils;
import com.amap.api.col.p0003sl.qc;
import com.amap.api.col.p0003sl.s4;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileOverlaySource;
import com.amap.api.maps.model.TileProvider;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class TileProviderInner {
    private WeakReference<IGlOverlayLayer> glOverlayLayerRef;
    private List<TileOverlaySource> mTileSource;
    private String overlayName;
    private final HashMap<String, qc> reqTaskHandleHashMap = new HashMap<>();
    private final TileProvider tileProvider;

    public TileProviderInner(TileProvider tileProvider) {
        this.tileProvider = tileProvider;
    }

    private Object callNativeFunction(String str, Object[] objArr) {
        try {
            IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private String createKey(int i, int i2, int i3, long j) {
        return i + " " + i2 + " " + i3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishDownload(Tile tile, TileReqTaskHandle tileReqTaskHandle, String str) {
        boolean z;
        if (this.glOverlayLayerRef.get() == null) {
            return;
        }
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(str)) {
                if (this.reqTaskHandleHashMap.containsKey(str)) {
                    this.reqTaskHandleHashMap.remove(str);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    tileReqTaskHandle.finish(tile);
                    callNativeFunction("finishTileReqTask", new Object[]{tileReqTaskHandle});
                }
            }
        }
    }

    public void cancelTile(TileSourceReq tileSourceReq, TileReqTaskHandle tileReqTaskHandle) {
        String createKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(createKey)) {
                qc qcVar = this.reqTaskHandleHashMap.get(createKey);
                if (qcVar != null) {
                    s4.b().getClass();
                    try {
                        qcVar.cancelTask();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                tileReqTaskHandle.status = 1;
                finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, createKey);
                try {
                    TileProvider tileProvider = this.tileProvider;
                    if (tileProvider instanceof TileSourceProvider) {
                        ((TileSourceProvider) tileProvider).cancel(tileSourceReq);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public void getTile(final TileSourceReq tileSourceReq, final TileReqTaskHandle tileReqTaskHandle) {
        final String createKey = createKey(tileSourceReq.x, tileSourceReq.y, tileSourceReq.zoom, tileReqTaskHandle.nativeObj);
        qc qcVar = new qc() { // from class: com.autonavi.base.ae.gmap.bean.TileProviderInner.1
            @Override // com.amap.api.col.p0003sl.qc
            public void runTask() {
                try {
                    synchronized (TileProviderInner.this.reqTaskHandleHashMap) {
                        if (TileProviderInner.this.reqTaskHandleHashMap.containsKey(createKey)) {
                            if (TileProviderInner.this.tileProvider != null) {
                                Tile tile = TileProvider.NO_TILE;
                                try {
                                    if (TileProviderInner.this.tileProvider instanceof TileSourceProvider) {
                                        tile = ((TileSourceProvider) TileProviderInner.this.tileProvider).getTile(tileSourceReq);
                                    } else {
                                        TileProvider tileProvider = TileProviderInner.this.tileProvider;
                                        TileSourceReq tileSourceReq2 = tileSourceReq;
                                        tile = tileProvider.getTile(tileSourceReq2.x, tileSourceReq2.y, tileSourceReq2.zoom);
                                    }
                                } catch (Throwable unused) {
                                }
                                TileProviderInner.this.finishDownload(tile, tileReqTaskHandle, createKey);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TileProviderInner.this.finishDownload(TileProvider.NO_TILE, tileReqTaskHandle, createKey);
                    th.printStackTrace();
                }
            }
        };
        synchronized (this.reqTaskHandleHashMap) {
            if (this.reqTaskHandleHashMap.containsKey(createKey)) {
                return;
            }
            this.reqTaskHandleHashMap.put(createKey, qcVar);
            s4.b().a(qcVar);
        }
    }

    public int getTileHeight() {
        TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileHeight();
        }
        return 0;
    }

    public int getTileWidth() {
        TileProvider tileProvider = this.tileProvider;
        if (tileProvider != null) {
            return tileProvider.getTileWidth();
        }
        return 0;
    }

    public void init(IGlOverlayLayer iGlOverlayLayer, String str) {
        this.glOverlayLayerRef = new WeakReference<>(iGlOverlayLayer);
        this.overlayName = str;
    }

    public void setTileSource(List<TileOverlaySource> list) {
        this.mTileSource = list;
    }
}
