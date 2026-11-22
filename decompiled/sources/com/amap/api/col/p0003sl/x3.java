package com.amap.api.col.p0003sl;

import android.graphics.Color;
import android.text.TextUtils;
import com.autonavi.base.ae.gmap.style.StyleElement;
import com.autonavi.base.ae.gmap.style.StyleItem;
import com.autonavi.base.amap.mapcore.Convert;
import com.facebook.react.uimanager.ViewProps;
import com.iflytek.cloud.ErrorCode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StyleParser.java */
/* loaded from: classes11.dex */
public class x3 {
    private static final int[] d = {1};

    /* renamed from: a, reason: collision with root package name */
    private int f1967a = 0;
    private int b = -1;
    List<t3> c = null;

    private List<t3> b() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        int i;
        int i2;
        JSONObject optJSONObject;
        int i3;
        String str;
        String str2;
        int i4;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONArray jSONArray4;
        String str5 = "name";
        this.c = new ArrayList();
        try {
            jSONArray = new JSONArray("[{\n\t\"regions\": {\n\t\t\"name\": \"区域面\",\n\t\t\"subType\": {\n\t\t\t\"land\": {\n\t\t\t\t\"name\": \"陆地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [1, 4, 5]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"green\": {\n\t\t\t\t\"name\": \"绿地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [3, 7, 8, 9, 10, 12]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"edu\": {\n\t\t\t\t\"name\": \"教育体育\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [3, 31]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"public\": {\n\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [4, 12, 22, 32]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"traffic\": {\n\t\t\t\t\"name\": \"交通枢纽\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [6, 14, 40]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 30004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"scenicSpot\": {\n\t\t\t\t\"name\": \"景区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [5, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"culture\": {\n\t\t\t\t\"name\": \"文化\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [7, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"health\": {\n\t\t\t\t\"name\": \"医疗卫生\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [8, 36]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"sports\": {\n\t\t\t\t\"name\": \"运动场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [9, 10, 13, 19, 20, 21, 34, 37, 39]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"business\": {\n\t\t\t\t\"name\": \"商业场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [11, 23, 24, 25, 26, 27, 28, 29, 30, 38]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"parkingLot\": {\n\t\t\t\t\"name\": \"停车场\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30003\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"water\": {\n\t\t\"name\": \"水系\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 30001,\n\t\t\t\"subkey\": [2, 6, 11, 13]\n\t\t}, {\n\t\t\t\"mainkey\": 20014\n\t\t}, {\n\t\t\t\"mainkey\": 10002,\n\t\t\t\"subkey\": [13]\n\t\t}]\n\t},\n\t\"buildings\": {\n\t\t\"name\": \"建筑物\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 50001\n\t\t}, {\n\t\t\t\"mainkey\": 50002\n\t\t}, {\n\t\t\t\"mainkey\": 50003\n\t\t}, {\n\t\t\t\"mainkey\": 50004\n\t\t}, {\n\t\t\t\"mainkey\": 30002,\n\t\t\t\"subkey\": [2, 15, 16, 17, 18]\n\t\t}]\n\t},\n\t\"roads\": {\n\t\t\"name\": \"道路\",\n\t\t\"subType\": {\n\t\t\t\"highWay\": {\n\t\t\t\t\"name\": \"高速公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20001\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"ringRoad\": {\n\t\t\t\t\"name\": \"城市环线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20002\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"nationalRoad\": {\n\t\t\t\t\"name\": \"国道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20003\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincialRoad\": {\n\t\t\t\t\"name\": \"省道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"secondaryRoad\": {\n\t\t\t\t\"name\": \"二级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20007\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelThreeRoad\": {\n\t\t\t\t\"name\": \"三级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20008\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelFourRoad\": {\n\t\t\t\t\"name\": \"四级道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20009\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"roadsBeingBuilt\": {\n\t\t\t\t\"name\": \"在建道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20018\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"railway\": {\n\t\t\t\t\"name\": \"铁路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"highSpeedRailway\": {\n\t\t\t\t\"name\": \"高铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [2]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subwayBeingBuilt\": {\n\t\t\t\t\"name\": \"在建地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015,\n\t\t\t\t\t\"subkey\": [1, 2]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20019\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"overPass\": {\n\t\t\t\t\"name\": \"天桥\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20012\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"underPass\": {\n\t\t\t\t\"name\": \"地道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20013\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"other\": {\n\t\t\t\t\"name\": \"其他线条\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20011\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20017\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20020\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20024\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20028\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"guideBoards\": {\n\t\t\t\t\"name\": \"道路路牌\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 40001\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"labels\": {\n\t\t\"name\": \"标注\",\n\t\t\"subType\": {\n\t\t\t\"pois\": {\n\t\t\t\t\"name\": \"兴趣点\",\n\t\t\t\t\"subType\": {\n\t\t\t\t\t\"hotel\": {\n\t\t\t\t\t\t\"name\": \"住宿\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 0,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [9, 133, 134, 135, 136, 155, 156, 157, 158, 159, 160, 161, 162, 186]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [31, 32, 33, 34, 35, 36, 37, 38, 39, 164, 165]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"restaurant\": {\n\t\t\t\t\t\t\"name\": \"餐饮\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 1,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [19, 20, 21, 22, 114, 115, 116, 117, 118, 119, 183, 187]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 166, 167, 168, 179, 180, 181, 203, 205, 206, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"shop\": {\n\t\t\t\t\t\t\"name\": \"购物\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 2,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [7, 8, 68, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 7, 8, 9, 10, 11, 12, 13, 175, 200, 201, 202, 204]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"scenicSpot\": {\n\t\t\t\t\t\t\"name\": \"风景名胜\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 3,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [4, 12, 14, 38, 69, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 120, 167, 171, 188, 189, 190, 191, 192]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10008\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 187, 188, 190, 192, 193, 194, 195, 196, 198, 216, 217, 218, 219, 220, 221, 223, 224, 225]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"traffic\": {\n\t\t\t\t\t\t\"name\": \"交通设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 4,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [23, 24, 25, 26, 31, 36, 148, 154, 168, 172, 175, 176, 177, 178]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [11, 16]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10009\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"bank\": {\n\t\t\t\t\t\t\"name\": \"金融保险\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 5,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [42, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 144, 145, 146, 147]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"edu\": {\n\t\t\t\t\t\t\"name\": \"科教文化\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 6,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [10, 11, 13, 35, 138, 139, 140, 141, 142, 143, 163, 164, 165, 166, 170]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [43, 44, 45, 46, 47, 176, 177]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"live\": {\n\t\t\t\t\t\t\"name\": \"生活服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 7,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [58, 63, 64, 65, 66, 67, 121, 122, 123]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [28, 29, 30]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"hospital\": {\n\t\t\t\t\t\t\"name\": \"医疗保健\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 8,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [32, 33, 57, 70, 131, 132, 169, 193, 206, 207, 208, 209, 210]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [170, 209]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pe\": {\n\t\t\t\t\t\t\"name\": \"休闲体育\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 9,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [15, 16, 17, 37, 60, 61, 62, 73, 124, 125, 126, 127, 128, 129, 130, 180, 181, 182, 184, 185, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [169, 171, 172, 173, 174, 178, 197, 207]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"public\": {\n\t\t\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 10,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [59, 173, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"buidling\": {\n\t\t\t\t\t\t\"name\": \"商务住宅\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 11,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 74, 75, 76, 77, 78, 79, 80, 81, 179]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [189, 191]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"gov\": {\n\t\t\t\t\t\t\"name\": \"政府机构及社会团体\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 12,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [3, 34, 43, 137]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"moto\": {\n\t\t\t\t\t\t\"name\": \"摩托车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 13,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [113]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"vehicle\": {\n\t\t\t\t\t\t\"name\": \"汽车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 14,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [39, 40, 41, 71, 72, 151, 152, 153]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [40, 41, 42, 182, 183, 184, 185, 186]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pass\": {\n\t\t\t\t\t\t\"name\": \"通行设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 15,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [27, 28, 149, 150, 174]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [21]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"subway\": {\n\t\t\t\t\t\t\"name\": \"地铁站\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 16,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10005\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10006\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"roadFacilities\": {\n\t\t\t\t\t\t\"name\": \"道路附属设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 17,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [2, 29, 30]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10017\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"address\": {\n\t\t\t\t\t\t\"name\": \"地名\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 18,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [18]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [10, 12, 14, 15, 23, 36]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"other\": {\n\t\t\t\t\t\t\"name\": \"其他\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 19,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [1, 211, 212]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [28]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [208, 210, 211, 212, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10010\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10011\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10012\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10013\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10014\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10015\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10016\n\t\t\t\t\t\t}]\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t},\n\t\t\t\"aois\": {\n\t\t\t\t\"name\": \"区域标注\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"continent\": {\n\t\t\t\t\"name\": \"大洲\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [20]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"country\": {\n\t\t\t\t\"name\": \"国家\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [18, 19, 29]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"province\": {\n\t\t\t\t\"name\": \"省/直辖市/自治区/特别行政区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [22, 26, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"city\": {\n\t\t\t\t\"name\": \"城市\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 5, 7, 24, 25, 27, 30, 31, 32, 34, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"district\": {\n\t\t\t\t\"name\": \"区县\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [6, 8, 37]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"town\": {\n\t\t\t\t\"name\": \"乡镇\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"village\": {\n\t\t\t\t\"name\": \"村庄\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [17]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"borders\": {\n\t\t\"name\": \"行政区边界\",\n\t\t\"subType\": {\n\t\t\t\"China\": {\n\t\t\t\t\"name\": \"中国国界\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [1, 2, 9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"foreign\": {\n\t\t\t\t\"name\": \"外国国界/停火线/主张线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [3, 4, 8, 10, 11]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincial\": {\n\t\t\t\t\"name\": \"省界线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [5, 6, 7, 12]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t}\n}]");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return this.c;
        }
        int i5 = 0;
        JSONObject optJSONObject2 = jSONArray.optJSONObject(0);
        if (optJSONObject2 == null) {
            return this.c;
        }
        JSONArray names = optJSONObject2.names();
        int length = names.length();
        int i6 = 0;
        while (i6 < length) {
            String optString = names.optString(i6);
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString);
            if (optJSONObject3 != null) {
                String optString2 = optJSONObject3.optString(str5);
                if (optJSONObject3.has("styleMap")) {
                    a(optJSONObject3.optJSONArray("styleMap"), optString, (String) null, optString2, this.c);
                } else if (optJSONObject3.has("subType")) {
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("subType");
                    if (optJSONObject4 != null) {
                        JSONArray names2 = optJSONObject4.names();
                        int length2 = names2.length();
                        int i7 = i5;
                        while (i7 < length2) {
                            int i8 = length2;
                            String optString3 = names2.optString(i7);
                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject(optString3);
                            if (optJSONObject5 == null) {
                                str3 = str5;
                                jSONArray3 = names2;
                                i = i7;
                                i2 = i8;
                                jSONObject = optJSONObject2;
                                jSONArray2 = names;
                            } else {
                                jSONObject = optJSONObject2;
                                String optString4 = optJSONObject5.optString(str5);
                                jSONArray2 = names;
                                if (optJSONObject5.has("styleMap")) {
                                    jSONArray3 = names2;
                                    i = i7;
                                    i2 = i8;
                                    a(optJSONObject5.optJSONArray("styleMap"), optString, optString3, optString2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + optString4, this.c);
                                } else {
                                    jSONArray3 = names2;
                                    String str6 = optString3;
                                    i = i7;
                                    i2 = i8;
                                    if (optJSONObject5.has("subType") && (optJSONObject = optJSONObject5.optJSONObject("subType")) != null) {
                                        JSONArray names3 = optJSONObject.names();
                                        int length3 = names3.length();
                                        int i9 = 0;
                                        while (i9 < length3) {
                                            String str7 = optString;
                                            String optString5 = names3.optString(i9);
                                            JSONArray jSONArray5 = names3;
                                            JSONObject optJSONObject6 = optJSONObject.optJSONObject(optString5);
                                            if (optJSONObject6 == null) {
                                                str = str5;
                                                str2 = str6;
                                                i3 = length3;
                                            } else {
                                                i3 = length3;
                                                String optString6 = optJSONObject6.optString(str5);
                                                if (optJSONObject6.has("styleMap")) {
                                                    str = str5;
                                                    str2 = str6;
                                                    i4 = i9;
                                                    optString = str7;
                                                    a(optJSONObject6.optJSONArray("styleMap"), optString, str6 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + optString5, optString2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + optString4 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + optString6, this.c);
                                                    i9 = i4 + 1;
                                                    str6 = str2;
                                                    names3 = jSONArray5;
                                                    length3 = i3;
                                                    str5 = str;
                                                } else {
                                                    str = str5;
                                                    str2 = str6;
                                                }
                                            }
                                            optString = str7;
                                            i4 = i9;
                                            i9 = i4 + 1;
                                            str6 = str2;
                                            names3 = jSONArray5;
                                            length3 = i3;
                                            str5 = str;
                                        }
                                    }
                                }
                                str3 = str5;
                            }
                            i7 = i + 1;
                            optJSONObject2 = jSONObject;
                            names2 = jSONArray3;
                            names = jSONArray2;
                            length2 = i2;
                            str5 = str3;
                        }
                    }
                }
                str4 = str5;
                jSONObject2 = optJSONObject2;
                jSONArray4 = names;
                this.c.add(new t3(ErrorCode.ERROR_UNSATISFIED_LINK, d, "roads", "trafficRoadBackgroundColor", null));
                i6++;
                optJSONObject2 = jSONObject2;
                names = jSONArray4;
                str5 = str4;
                i5 = 0;
            }
            str4 = str5;
            jSONObject2 = optJSONObject2;
            jSONArray4 = names;
            i6++;
            optJSONObject2 = jSONObject2;
            names = jSONArray4;
            str5 = str4;
            i5 = 0;
        }
        return this.c;
    }

    public y3 a(byte[] bArr, boolean z) {
        y3 y3Var = new y3();
        try {
            if (!a(y3Var.c(), bArr)) {
                a(y3Var, bArr, z);
            }
            a(y3Var);
            y3Var.a();
            return y3Var;
        } catch (Throwable th) {
            th.printStackTrace();
            return y3Var;
        }
    }

    protected void a(y3 y3Var) {
        if (this.b != -1) {
            Map<Integer, StyleItem> c = y3Var.c();
            Iterator it = ((ArrayList) a("roads", "trafficRoadBackgroundColor")).iterator();
            while (it.hasNext()) {
                t3 t3Var = (t3) it.next();
                a(c, t3Var.d, v3.a("fillColor"), t3Var).value = this.b;
                a(c, t3Var.d, v3.a("strokeColor"), t3Var).value = this.b;
            }
        }
    }

    private void a(y3 y3Var, byte[] bArr, boolean z) {
        JSONArray jSONArray;
        int i;
        u3 a2 = a(bArr);
        if (a2 == null || a2.a() == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2.a());
            JSONArray names = jSONObject.names();
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string = names.getString(i2);
                if (string == null || !string.trim().equals("sdkTextures")) {
                    if (string != null) {
                        try {
                            if (string.trim().equals("background")) {
                                this.f1967a = a("#" + jSONObject.optString("background"));
                            }
                        } catch (Throwable th) {
                            th = th;
                            th.printStackTrace();
                            return;
                        }
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(string);
                    if (optJSONObject != null) {
                        Map<Integer, StyleItem> c = y3Var.c();
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("subType");
                        if (optJSONObject2 == null) {
                            a(string, string, c, optJSONObject, z);
                        } else {
                            JSONArray names2 = optJSONObject2.names();
                            for (int i3 = 0; i3 < names2.length(); i3++) {
                                String optString = names2.optString(i3);
                                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString);
                                if (optJSONObject3.has("detailedType")) {
                                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("detailedType");
                                    if (optJSONObject4 != null) {
                                        JSONArray names3 = optJSONObject4.names();
                                        int i4 = 0;
                                        while (i4 < names3.length()) {
                                            int i5 = i4;
                                            String optString2 = names3.optString(i5);
                                            JSONObject optJSONObject5 = optJSONObject4.optJSONObject(optString2);
                                            if (optJSONObject5 == null) {
                                                jSONArray = names3;
                                                i = i5;
                                            } else {
                                                jSONArray = names3;
                                                i = i5;
                                                a(string, optString2, c, optJSONObject5, z);
                                            }
                                            i4 = i + 1;
                                            names3 = jSONArray;
                                        }
                                    }
                                } else {
                                    a(string, optString, c, optJSONObject3, z);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a(JSONArray jSONArray, String str, String str2, String str3, List<t3> list) {
        int[] iArr;
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("mainkey");
                int[] iArr2 = new int[0];
                JSONArray optJSONArray = optJSONObject.optJSONArray("subkey");
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    int[] iArr3 = new int[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        iArr3[i2] = optJSONArray.optInt(i2);
                    }
                    iArr = iArr3;
                } else {
                    iArr = iArr2;
                }
                list.add(new t3(optInt, iArr, str, str2, str3));
            }
        }
    }

    private List<t3> a(String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList();
        for (t3 t3Var : this.c) {
            if (t3Var != null) {
                String str4 = t3Var.e;
                if (str4 != null && str4.equals(str2)) {
                    arrayList.add(t3Var);
                } else {
                    String str5 = t3Var.e;
                    if (str5 != null && str5.equals(str) && (str3 = t3Var.f) != null && str3.contains(str2)) {
                        arrayList.add(t3Var);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(String str, String str2, Map<Integer, StyleItem> map, JSONObject jSONObject, boolean z) throws JSONException {
        if (jSONObject != null) {
            if (this.c == null) {
                this.c = b();
            }
            ArrayList arrayList = (ArrayList) a(str, str2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t3 t3Var = (t3) it.next();
                if (t3Var != null && t3Var.c != -1000) {
                    int i = t3Var.d;
                    if (!jSONObject.optBoolean("visible", true)) {
                        StyleElement a2 = a(map, i, v3.a("visible"), t3Var);
                        a2.textureId = -1;
                        a2.visible = 0;
                    } else {
                        if (!jSONObject.optBoolean("showIcon", true)) {
                            a(map, i, v3.a("textFillColor"), t3Var).textureId = -1;
                        }
                        if (!jSONObject.optBoolean("showLabel", true)) {
                            a(map, i, v3.a("textFillColor"), t3Var).opacity = 0.0f;
                            StyleElement a3 = a(map, i, v3.a("textStrokeColor"), t3Var);
                            a3.opacity = 0.0f;
                            a3.visible = 0;
                            a3.textureId = -1;
                        }
                        Map<Integer, StyleItem> map2 = map;
                        JSONObject jSONObject2 = jSONObject;
                        a(map2, jSONObject2, "color", ViewProps.OPACITY, i, t3Var);
                        a(map2, jSONObject2, "fillColor", "fillOpacity", i, t3Var);
                        a(map2, jSONObject2, "strokeColor", "strokeOpacity", i, t3Var);
                        a(map2, jSONObject2, "textFillColor", "textFillOpacity", i, t3Var);
                        a(map2, jSONObject2, "textStrokeColor", "textStrokeOpacity", i, t3Var);
                        a(map2, jSONObject2, "backgroundColor", "backgroundOpacity", i, t3Var);
                        if (z) {
                            try {
                                int optInt = jSONObject2.optInt("textureName", 0);
                                if (optInt != 0) {
                                    a(map2, i, v3.a("textureName"), t3Var).textureId = optInt;
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        map = map2;
                        jSONObject = jSONObject2;
                    }
                }
            }
            arrayList.clear();
        }
    }

    private void a(Map<Integer, StyleItem> map, JSONObject jSONObject, String str, String str2, int i, t3 t3Var) {
        int a2;
        float f;
        try {
            String optString = jSONObject.optString(str, null);
            if (TextUtils.isEmpty(optString)) {
                f = (float) jSONObject.optDouble(str2, 1.0d);
                a2 = 0;
            } else {
                a2 = a("#" + optString);
                f = 1.0f;
            }
            if (a2 == 0 && f == 1.0d) {
                return;
            }
            int a3 = v3.a(str);
            StyleElement a4 = a(map, i, a3, t3Var);
            a4.value = a2;
            a4.opacity = f;
            String str3 = t3Var.f;
            if (str3 != null && str3.equals("China")) {
                a(map, i, a3, t3Var).opacity = 0.0f;
                return;
            }
            String str4 = t3Var.e;
            if (str4 != null && str4.equals("water") && a3 == 3) {
                StyleElement a5 = a(map, i, 2, t3Var);
                a5.value = a2;
                a5.opacity = f;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u3 a(byte[] bArr) {
        u3 u3Var;
        String str = null;
        try {
            u3Var = new u3();
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bytes = "l".getBytes("utf-8");
            int length = bArr.length;
            int length2 = bytes.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) (bytes[i % length2] ^ bArr[i]);
            }
            Convert.getString(bArr, 0, 4);
            Convert.getString(bArr, 4, 32);
            Convert.getString(bArr, 36, 10);
            byte[] subBytes = Convert.getSubBytes(bArr, 46, 16);
            byte[] subBytes2 = Convert.getSubBytes(bArr, 62, 16);
            byte[] subBytes3 = Convert.getSubBytes(bArr, 78, length - 78);
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(subBytes2);
                SecretKeySpec secretKeySpec = new SecretKeySpec(subBytes, "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                str = new String(cipher.doFinal(subBytes3), "utf-8");
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            u3Var.a(str);
            return u3Var;
        } catch (Throwable th3) {
            th = th3;
            str = u3Var;
            th.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[Catch: all -> 0x00b7, JSONException -> 0x00bc, TryCatch #2 {JSONException -> 0x00bc, all -> 0x00b7, blocks: (B:3:0x0001, B:4:0x000e, B:6:0x0014, B:11:0x0027, B:13:0x002f, B:15:0x0037, B:18:0x0044, B:19:0x0047, B:25:0x006e, B:30:0x0091, B:33:0x0095, B:36:0x00a2, B:39:0x00aa, B:42:0x0076, B:44:0x007b, B:50:0x008a, B:46:0x0084, B:54:0x0051, B:56:0x0056, B:62:0x0065, B:58:0x005f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.Map<java.lang.Integer, com.autonavi.base.ae.gmap.style.StyleItem> r11, byte[] r12) {
        /*
            r10 = this;
            r1 = 0
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            java.lang.String r2 = "UTF-8"
            r0.<init>(r12, r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            r12.<init>(r0)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            r0 = r1
        Le:
            int r2 = r12.length()     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r0 >= r2) goto Lb5
            org.json.JSONObject r5 = r12.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            java.lang.String r2 = "featureType"
            java.lang.String r2 = r5.optString(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r3 == 0) goto L27
        L24:
            r4 = r11
            goto Lb0
        L27:
            java.lang.String r3 = "background"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r3 == 0) goto L47
            java.lang.String r2 = "stylers"
            org.json.JSONObject r2 = r5.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r2 == 0) goto L24
            java.lang.String r3 = "color"
            java.lang.String r2 = r2.optString(r3)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            int r2 = a(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r2 != 0) goto L44
            goto L24
        L44:
            r10.f1967a = r2     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            goto L24
        L47:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            r4 = 0
            r6 = -1
            if (r3 == 0) goto L50
            goto L6a
        L50:
            r3 = r1
        L51:
            java.lang.String[] r7 = com.amap.api.col.p0003sl.w3.f1947a     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            int r8 = r7.length     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r3 >= r8) goto L62
            r7 = r7[r3]     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r7 == 0) goto L5f
            goto L63
        L5f:
            int r3 = r3 + 1
            goto L51
        L62:
            r3 = r6
        L63:
            if (r3 < 0) goto L6a
            java.lang.String[] r7 = com.amap.api.col.p0003sl.w3.c     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            r3 = r7[r3]     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            goto L6b
        L6a:
            r3 = r4
        L6b:
            if (r3 != 0) goto L6e
            goto L24
        L6e:
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r7 == 0) goto L75
            goto L8e
        L75:
            r7 = r1
        L76:
            java.lang.String[] r8 = com.amap.api.col.p0003sl.w3.f1947a     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            int r9 = r8.length     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r7 >= r9) goto L87
            r8 = r8[r7]     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r8 == 0) goto L84
            goto L88
        L84:
            int r7 = r7 + 1
            goto L76
        L87:
            r7 = r6
        L88:
            if (r7 < 0) goto L8e
            java.lang.String[][] r2 = com.amap.api.col.p0003sl.w3.b     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            r4 = r2[r7]     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
        L8e:
            r7 = r4
            if (r7 == 0) goto L24
            int r2 = r7.length     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r2 != 0) goto L95
            goto L24
        L95:
            java.lang.String r2 = "elementType"
            java.lang.String r2 = r5.optString(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r4 == 0) goto La2
            goto L24
        La2:
            int r8 = com.amap.api.col.p0003sl.v3.a(r2)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
            if (r8 != r6) goto Laa
            goto L24
        Laa:
            r4 = r11
            r6 = r3
            r3 = r10
            r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb7 org.json.JSONException -> Lbc
        Lb0:
            int r0 = r0 + 1
            r11 = r4
            goto Le
        Lb5:
            r11 = 1
            return r11
        Lb7:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.x3.a(java.util.Map, byte[]):boolean");
    }

    private void a(Map<Integer, StyleItem> map, JSONObject jSONObject, String str, String[] strArr, int i) throws JSONException {
        int a2;
        for (String str2 : strArr) {
            if (this.c == null) {
                this.c = b();
            }
            Iterator it = ((ArrayList) a(str, str2)).iterator();
            while (it.hasNext()) {
                t3 t3Var = (t3) it.next();
                int i2 = t3Var.d;
                StyleElement a3 = a(map, i2, i, t3Var);
                JSONObject optJSONObject = jSONObject.optJSONObject("stylers");
                if (optJSONObject != null && (a2 = a(optJSONObject.optString("color"))) != 0) {
                    a3.value = a2;
                    a3.textureId = optJSONObject.optInt("textureName", 0);
                    a3.lineWidth = optJSONObject.optInt("lineWidth", 0);
                    if (i2 >= 30 && i2 <= 38) {
                        a(map, i2, 4, t3Var).opacity = 0.1f;
                    } else {
                        String str3 = t3Var.e;
                        if (str3 != null && str3.equals("water") && i == 3) {
                            a(map, i2, 2, t3Var).value = a2;
                        }
                    }
                }
            }
        }
    }

    private StyleElement a(Map<Integer, StyleItem> map, int i, int i2, t3 t3Var) {
        StyleItem styleItem = map.get(Integer.valueOf(i));
        if (styleItem == null) {
            styleItem = new StyleItem(t3Var.c);
            styleItem.mainKey = t3Var.f1884a;
            styleItem.subKey = t3Var.b;
            map.put(Integer.valueOf(i), styleItem);
        }
        StyleElement styleElement = styleItem.get(i2);
        if (styleElement != null) {
            return styleElement;
        }
        StyleElement styleElement2 = new StyleElement();
        styleElement2.styleElementType = i2;
        styleItem.put(i2, styleElement2);
        return styleElement2;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (!str.startsWith("#")) {
                str = "#" + str;
            }
            return Color.parseColor(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public int a() {
        return this.f1967a;
    }
}
