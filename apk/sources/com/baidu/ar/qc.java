package com.baidu.ar;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class qc {
    public static qc c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, String> f7128a;
    public String[] b;

    public qc() {
        this.f7128a = null;
        this.b = null;
        HashMap<String, String> mapB = b();
        this.f7128a = mapB;
        if (mapB != null) {
            this.b = a(mapB);
        }
    }

    public static qc a() {
        if (c == null) {
            c = new qc();
        }
        return c;
    }

    public static byte[] a(String str) {
        try {
            return Base64.decode(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String[] a(HashMap<String, String> map) {
        Set<String> setKeySet = map.keySet();
        String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
        return strArr == null ? new String[0] : strArr;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strReplace = str;
        int r2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (r2 >= strArr.length) {
                return str;
            }
            String str2 = strArr[r2];
            int length = 0;
            while (true) {
                int r4 = strReplace.indexOf(str2, length);
                if (r4 != -1) {
                    str = str.replace(str2, str2 + this.f7128a.get(this.b[r2]));
                    strReplace = strReplace.replace(str2, String.format(Separators.PERCENT + str2.length() + "s", " "));
                    length = r4 + str2.length();
                }
            }
            r2++;
        }
    }

    public final HashMap<String, String> b() {
        HashMap<String, String> map = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject("{\n  \"柱状图\": \"<client><widget><type>chart</type><position><xCenterOffset>0</xCenterOffset><widthRatio>0.5</widthRatio></position><ttl>3</ttl><version>2.0</version><chart><type>bar</type><title>使用状况</title><data><x>A</x><y>0.17</y></data><data><x>B</x><y>0.35</y></data><data><x>C</x><y>0.45</y></data><keyMap><x>x</x><y>y</y></keyMap><labelMap><x>名称</x><y>使用占比</y></labelMap></chart></widget></client>\",\n  \"图文\": \"<client><widget><type>graphic</type><position><aspectRatio>3</aspectRatio><xCenterOffset>0</xCenterOffset><widthRatio>0.5</widthRatio></position><ttl>3</ttl><version>2.0</version><graphic><imageUrl>https://bj.bcebos.com/v1/digital-human-background-image/gonghang.png</imageUrl><text>点击此处进入工商银行首页</text><linkUrl>http://www.icbc.com.cn/icbc/</linkUrl></graphic></widget></client>\",\n  \"折线图\": \"<client><widget><type>chart</type><position><xCenterOffset>0</xCenterOffset><widthRatio>0.5</widthRatio></position><ttl>3</ttl><version>2.0</version><chart><type>line</type><title>折线图</title><data><x>1542772693147</x><y1>47</y1><y2>36</y2></data><data><x>1542774493147</x><y1>24</y1><y2>75</y2></data><data><x>1542776293147</x><y1>63</y1><y2>16</y2></data><data><x>1542778093147</x><y1>58</y1><y2>14</y2></data><keyMap><x>x</x><y1>y1</y1><y2>y2</y2></keyMap> <titleMap><y1>客流量</y1><y2>支付笔数</y2></titleMap><labelMap><x>时间</x><y>客流量</y></labelMap><formatX>date</formatX></chart></widget></client>\",\n  \"饼图\": \"<client><widget><type>echart</type><position><xCenterOffset>0</xCenterOffset><widthRatio>1</widthRatio></position><ttl>3</ttl><echart><option><title><text>饼状图示例</text><textStyle><fontSize>14</fontSize><fontWeight>bold</fontWeight></textStyle></title><tooltip><trigger>item</trigger></tooltip><legend><orient>vertical</orient><left>10</left><data>07-19</data><data>07-20</data><data>07-21</data><data>07-22</data></legend><series><type>pie</type><data><name>07-19</name><value>9</value></data><data><name>07-20</name><value>5</value></data><data><name>07-21</name><value>2</value></data><data><name>07-22</name><value>8</value></data></series></option></echart></widget></client>\",\n  \"图片\": \"<client><widget><type>image</type><position><aspectRatio>3.5</aspectRatio><xCenterOffset>0</xCenterOffset><widthRatio>0.5</widthRatio></position><ttl>3</ttl><version>2.0</version><image><id>imageId</id><url>https://bj.bcebos.com/v1/digital-human-background-image/gonghang.png</url></image></widget></client>\"\n}");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return map;
        }
    }
}
