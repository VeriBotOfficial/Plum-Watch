package com.amap.api.maps.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes11.dex */
public class TextOptionsCreator implements Parcelable.Creator<TextOptions> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public TextOptions createFromParcel(Parcel parcel) {
        TextOptions textOptions = new TextOptions();
        textOptions.f2056a = parcel.readString();
        Bundle readBundle = parcel.readBundle();
        textOptions.position(new LatLng(readBundle.getDouble("lat"), readBundle.getDouble("lng")));
        textOptions.text(parcel.readString());
        textOptions.typeface(Typeface.defaultFromStyle(parcel.readInt()));
        textOptions.rotate(parcel.readFloat());
        textOptions.align(parcel.readInt(), parcel.readInt());
        textOptions.backgroundColor(parcel.readInt());
        textOptions.fontColor(parcel.readInt());
        textOptions.fontSize(parcel.readInt());
        textOptions.zIndex(parcel.readFloat());
        textOptions.visible(parcel.readByte() == 1);
        try {
            Parcelable parcelable = parcel.readBundle().getParcelable(MapBundleKey.MapObjKey.OBJ_SL_OBJ);
            if (parcelable != null) {
                textOptions.setObject(parcelable);
                return textOptions;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return textOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public TextOptions[] newArray(int i) {
        return new TextOptions[i];
    }
}
