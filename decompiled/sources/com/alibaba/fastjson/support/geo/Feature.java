package com.alibaba.fastjson.support.geo;

import com.alibaba.fastjson.annotation.JSONType;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmind.core.internal.dom.DOMConstants;

@JSONType(orders = {"type", "id", "bbox", "coordinates", DOMConstants.TAG_PROPERTIES}, typeName = "Feature")
/* loaded from: classes11.dex */
public class Feature extends Geometry {
    private Geometry geometry;

    /* renamed from: id, reason: collision with root package name */
    private String f1262id;
    private Map<String, String> properties;

    public Feature() {
        super("Feature");
        this.properties = new LinkedHashMap();
    }

    public Geometry getGeometry() {
        return this.geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, String> map) {
        this.properties = map;
    }

    public String getId() {
        return this.f1262id;
    }

    public void setId(String str) {
        this.f1262id = str;
    }
}
