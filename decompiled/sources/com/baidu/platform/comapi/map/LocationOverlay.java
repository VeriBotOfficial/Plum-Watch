package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.baidu.platform.comjni.tools.ParcelItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public class LocationOverlay extends InnerOverlay {
    private AppBaseMap d;

    public LocationOverlay() {
        super(7);
    }

    public void beginLocationLayerAnimation() {
        this.d.BeginLocationLayerAnimation();
    }

    public void clearLocationLayerData(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("locationaddr", this.mLayerID);
        this.d.ClearLocationLayerData(bundle);
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public boolean getDefaultShowStatus() {
        return true;
    }

    @Override // com.baidu.platform.comapi.map.InnerOverlay
    public String getLayerTag() {
        return "location";
    }

    public void setLocationLayerData(List<OverlayLocationData> list) {
        int i;
        List<OverlayLocationData> list2 = list;
        if (list2 == null || list2.size() <= 0 || this.mLayerID == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("locationaddr", this.mLayerID);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list2.size()) {
            OverlayLocationData overlayLocationData = list2.get(i2);
            if (overlayLocationData.getImgType() != "arrowicon") {
                if (overlayLocationData.getImgType() != "icon") {
                    i = i2;
                    if (overlayLocationData.getImgType() != "gificon") {
                        if (overlayLocationData.getImage() == null) {
                            return;
                        }
                        ParcelItem parcelItem = new ParcelItem();
                        Bitmap image = overlayLocationData.getImage();
                        Bundle bundle2 = new Bundle();
                        ByteBuffer allocate = ByteBuffer.allocate(image.getWidth() * image.getHeight() * 4);
                        image.copyPixelsToBuffer(allocate);
                        byte[] array = allocate.array();
                        bundle2.putByteArray("imgbin", array);
                        bundle2.putInt("w", overlayLocationData.getImgWidth());
                        bundle2.putInt("h", overlayLocationData.getImgHeight());
                        bundle2.putInt("rotation", overlayLocationData.isRotation());
                        bundle2.putString("name", overlayLocationData.getImgName() + "_" + Arrays.hashCode(array));
                        parcelItem.setBundle(bundle2);
                        arrayList.add(parcelItem);
                    } else if (overlayLocationData.getGIFImgPath() != null) {
                        ParcelItem parcelItem2 = new ParcelItem();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("rotation", overlayLocationData.isRotation());
                        bundle3.putInt("animation", overlayLocationData.isAnimation());
                        bundle3.putString("gifpath", overlayLocationData.getGIFImgPath());
                        bundle3.putString("imgtype", overlayLocationData.getImgType());
                        bundle3.putString("name", overlayLocationData.getImgName());
                        bundle3.putFloat("markersize", overlayLocationData.getMarkerSize());
                        parcelItem2.setBundle(bundle3);
                        arrayList.add(parcelItem2);
                    }
                } else if (overlayLocationData.getImage() != null) {
                    ParcelItem parcelItem3 = new ParcelItem();
                    Bitmap image2 = overlayLocationData.getImage();
                    i = i2;
                    Bundle bundle4 = new Bundle();
                    ByteBuffer allocate2 = ByteBuffer.allocate(image2.getWidth() * image2.getHeight() * 4);
                    image2.copyPixelsToBuffer(allocate2);
                    bundle4.putByteArray("imgbin", allocate2.array());
                    bundle4.putInt("w", overlayLocationData.getImgWidth());
                    bundle4.putInt("h", overlayLocationData.getImgHeight());
                    bundle4.putInt("len", image2.getWidth() * image2.getHeight() * 4);
                    bundle4.putInt("rotation", overlayLocationData.isRotation());
                    bundle4.putInt("animation", overlayLocationData.isAnimation());
                    bundle4.putString("imgtype", overlayLocationData.getImgType());
                    bundle4.putString("name", overlayLocationData.getImgName());
                    bundle4.putFloat("markersize", overlayLocationData.getMarkerSize());
                    parcelItem3.setBundle(bundle4);
                    arrayList.add(parcelItem3);
                }
                i2 = i + 1;
                list2 = list;
            } else if (overlayLocationData.getImage() != null) {
                ParcelItem parcelItem4 = new ParcelItem();
                Bitmap image3 = overlayLocationData.getImage();
                Bundle bundle5 = new Bundle();
                ByteBuffer allocate3 = ByteBuffer.allocate(image3.getWidth() * image3.getHeight() * 4);
                image3.copyPixelsToBuffer(allocate3);
                bundle5.putByteArray("imgbin", allocate3.array());
                bundle5.putInt("w", overlayLocationData.getImgWidth());
                bundle5.putInt("h", overlayLocationData.getImgHeight());
                bundle5.putInt("len", image3.getWidth() * image3.getHeight() * 4);
                bundle5.putInt("rotation", 1);
                bundle5.putString("imgtype", overlayLocationData.getImgType());
                bundle5.putString("name", overlayLocationData.getImgName());
                bundle5.putFloat("arrowsize", overlayLocationData.getArrowSize());
                parcelItem4.setBundle(bundle5);
                arrayList.add(parcelItem4);
            }
            i = i2;
            i2 = i + 1;
            list2 = list;
        }
        if (arrayList.size() > 0) {
            ParcelItem[] parcelItemArr = new ParcelItem[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                parcelItemArr[i3] = (ParcelItem) arrayList.get(i3);
            }
            bundle.putParcelableArray("imagedata", parcelItemArr);
        }
        this.d.SetLocationLayerData(bundle);
    }

    public LocationOverlay(AppBaseMap appBaseMap) {
        super(7, appBaseMap);
        this.d = appBaseMap;
    }
}
