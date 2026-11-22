package com.baidu.mapapi.http.wrapper;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class ClassInfo {
    private final boolean isRawClass;
    private final Class<?> rawType;
    private final Map<String, ClassInfo> genericParams = new HashMap();
    private final Map<Field, ClassInfo> genericFields = new HashMap();

    public ClassInfo(Class<?> cls, boolean z) {
        this.rawType = cls;
        this.isRawClass = z;
    }

    private static ClassInfo getGenericFieldClassInfo(Field field, Map<String, ClassInfo> map) {
        Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            return null;
        }
        if (!(genericType instanceof ParameterizedType)) {
            if (genericType instanceof TypeVariable) {
                return map.get(((TypeVariable) genericType).getName());
            }
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        ClassInfo classInfo = new ClassInfo((Class) parameterizedType.getRawType(), false);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = classInfo.rawType.getTypeParameters();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            classInfo.genericParams.put(typeParameters[i].getName(), getType(actualTypeArguments[i], map));
        }
        for (Field field2 : classInfo.rawType.getFields()) {
            ClassInfo genericFieldClassInfo = getGenericFieldClassInfo(field2, classInfo.genericParams);
            if (genericFieldClassInfo != null) {
                classInfo.genericFields.put(field2, genericFieldClassInfo);
            }
        }
        for (Field field3 : classInfo.rawType.getDeclaredFields()) {
            ClassInfo genericFieldClassInfo2 = getGenericFieldClassInfo(field3, classInfo.genericParams);
            if (genericFieldClassInfo2 != null) {
                classInfo.genericFields.put(field3, genericFieldClassInfo2);
            }
        }
        return classInfo;
    }

    public static ClassInfo getType(Type type) {
        return getType(type, new HashMap());
    }

    public Map<Field, ClassInfo> getGenericFields() {
        return this.genericFields;
    }

    public Map<String, ClassInfo> getGenericParams() {
        return this.genericParams;
    }

    public Class<?> getRawType() {
        return this.rawType;
    }

    public boolean isRawClass() {
        return this.isRawClass;
    }

    private static ClassInfo getType(Type type, Map<String, ClassInfo> map) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class) {
            return new ClassInfo((Class) type, true);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof TypeVariable) || map == null) {
                return null;
            }
            return map.get(((TypeVariable) type).getName());
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        ClassInfo classInfo = new ClassInfo((Class) parameterizedType.getRawType(), false);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable<Class<?>>[] typeParameters = classInfo.rawType.getTypeParameters();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            classInfo.genericParams.put(typeParameters[i].getName(), getType(actualTypeArguments[i], map));
        }
        for (Field field : classInfo.rawType.getFields()) {
            ClassInfo genericFieldClassInfo = getGenericFieldClassInfo(field, classInfo.genericParams);
            if (genericFieldClassInfo != null) {
                classInfo.genericFields.put(field, genericFieldClassInfo);
            }
        }
        for (Field field2 : classInfo.rawType.getDeclaredFields()) {
            ClassInfo genericFieldClassInfo2 = getGenericFieldClassInfo(field2, classInfo.genericParams);
            if (genericFieldClassInfo2 != null) {
                classInfo.genericFields.put(field2, genericFieldClassInfo2);
            }
        }
        return classInfo;
    }
}
