package com.wakeup.common.storage.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DeviceModel implements Serializable {
    private String bluetoothName;
    private int chipType;
    private String code;
    private String described;
    private String equipmentAlias;
    private long equipmentId;
    private String functionLanguages;
    private String innerUrl;
    private boolean isTemp;
    private String mac;
    private int majorVersion;
    private List<MessageAppEntity> messageAppList;
    private String motherBluetoothName;
    private String name;
    private int productId;
    private String supports;
    private String url;
    private String version;
    private int xmlyOpen;

    public String getMotherBluetoothName() {
        return this.motherBluetoothName;
    }

    public void setMotherBluetoothName(String motherBluetoothName) {
        this.motherBluetoothName = motherBluetoothName;
    }

    public String getDescribed() {
        return this.described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        if (this.code == null) {
            this.code = "";
        }
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSupports() {
        return this.supports;
    }

    public void setSupports(String supports) {
        this.supports = supports;
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public List<Integer> getSupportList() {
        List<Integer> list;
        try {
            list = (List) new Gson().fromJson(getSupports(), new TypeToken<ArrayList<Integer>>() { // from class: com.wakeup.common.storage.model.DeviceModel.1
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        return list == null ? new ArrayList() : list;
    }

    public String getVersion() {
        if (this.version == null) {
            this.version = "";
        }
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBluetoothName() {
        if (this.bluetoothName == null) {
            this.bluetoothName = "";
        }
        return this.bluetoothName;
    }

    public void setBluetoothName(String bluetoothName) {
        this.bluetoothName = bluetoothName;
    }

    public boolean isTemp() {
        return this.isTemp;
    }

    public void setTemp(boolean temp) {
        this.isTemp = temp;
    }

    public List<MessageAppEntity> getMessageAppList() {
        return this.messageAppList;
    }

    public void setMessageAppList(List<MessageAppEntity> messageAppList) {
        this.messageAppList = messageAppList;
    }

    public void setEquipmentId(long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public long getEquipmentId() {
        return this.equipmentId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setFunctionLanguages(String functionLanguages) {
        this.functionLanguages = functionLanguages;
    }

    public String getFunctionLanguages() {
        return this.functionLanguages;
    }

    public void setEquipmentAlias(String equipmentAlias) {
        this.equipmentAlias = equipmentAlias;
    }

    public String getEquipmentAlias() {
        if (TextUtils.isEmpty(this.equipmentAlias)) {
            return this.name;
        }
        return this.equipmentAlias;
    }

    public List<String> getTranslateCodeList() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.functionLanguages)) {
            try {
                JSONArray jSONArray = new JSONObject(this.functionLanguages).getJSONArray("0");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public List<String> getSICodeList() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.functionLanguages)) {
            try {
                JSONArray jSONArray = new JSONObject(this.functionLanguages).getJSONArray("1");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public void setInnerUrl(String innerUrl) {
        this.innerUrl = innerUrl;
    }

    public String getInnerUrl() {
        return this.innerUrl;
    }

    public int getXmlyOpen() {
        return this.xmlyOpen;
    }

    public void setXmlyOpen(int xmlyOpen) {
        this.xmlyOpen = xmlyOpen;
    }

    public void setChipType(int chipType) {
        this.chipType = chipType;
    }

    public int getChipType() {
        return this.chipType;
    }

    public boolean isWifiSound() {
        return this.productId == 28;
    }

    public boolean isGlasses2() {
        return this.productId == 11 && this.chipType == 3;
    }

    public boolean isShootHeadset() {
        return this.productId == 25 && this.chipType == 3;
    }

    public boolean isLdGlasses() {
        return this.productId == 11 && this.chipType == 5;
    }

    public boolean isSleepSound() {
        return this.productId == 27;
    }

    public String toString() {
        return "DeviceModel{described='" + this.described + "', mac='" + this.mac + "', name='" + this.name + "', url='" + this.url + "', code='" + this.code + "', equipmentId=" + this.equipmentId + ", supports='" + this.supports + "', version='" + this.version + "', bluetoothName='" + this.bluetoothName + "', motherBluetoothName='" + this.motherBluetoothName + "', messageAppList=" + this.messageAppList + ", isTemp=" + this.isTemp + ", productId=" + this.productId + ", functionLanguages='" + this.functionLanguages + "', equipmentAlias='" + this.equipmentAlias + "', innerUrl='" + this.innerUrl + "', xmlyOpen=" + this.xmlyOpen + ", chipType=" + this.chipType + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean isWatch() {
        int i = this.productId;
        return i == 0 || i == 6;
    }

    public boolean isWatch4G() {
        return this.productId == 17;
    }
}
