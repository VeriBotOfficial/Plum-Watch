package android.gov.nist.core;

import com.autonavi.aps.amapapi.config.Const;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class GenericObject implements Serializable, Cloneable {
    protected static final String AND = "&";
    protected static final String AT = "@";
    protected static final String COLON = ":";
    protected static final String COMMA = ",";
    protected static final String DOT = ".";
    protected static final String DOUBLE_QUOTE = "\"";
    protected static final String EQUALS = "=";
    protected static final String GREATER_THAN = ">";
    protected static final String HT = "\t";
    protected static final String LESS_THAN = "<";
    protected static final String LPAREN = "(";
    protected static final String NEWLINE = "\r\n";
    protected static final String PERCENT = "%";
    protected static final String POUND = "#";
    protected static final String QUESTION = "?";
    protected static final String QUOTE = "'";
    protected static final String RETURN = "\n";
    protected static final String RPAREN = ")";
    protected static final String SEMICOLON = ";";
    protected static final String SLASH = "/";
    protected static final String SP = " ";
    protected static final String STAR = "*";
    protected Match matchExpression;
    protected static final Set<Class<?>> immutableClasses = new HashSet(10);
    static final String[] immutableClassNames = {"String", "Character", "Boolean", "Byte", "Short", "Integer", "Long", "Float", "Double"};
    protected int indentation = 0;
    protected String stringRepresentation = "";

    public abstract String encode();

    static {
        int i = 0;
        while (true) {
            try {
                String[] strArr = immutableClassNames;
                if (i >= strArr.length) {
                    return;
                }
                immutableClasses.add(Class.forName("java.lang." + strArr[i]));
                i++;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, e);
            }
        }
    }

    public void setMatcher(Match match) {
        if (match == null) {
            throw new IllegalArgumentException("null arg!");
        }
        this.matchExpression = match;
    }

    public Match getMatcher() {
        return this.matchExpression;
    }

    public static Class<?> getClassFromName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
            return null;
        }
    }

    public static boolean isMySubclass(Class<?> cls) {
        return GenericObject.class.isAssignableFrom(cls);
    }

    public static Object makeClone(Object obj) {
        Object clone;
        if (obj == null) {
            throw new NullPointerException("null obj!");
        }
        Class<?> cls = obj.getClass();
        if (!immutableClasses.contains(cls)) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive()) {
                    return ((Object[]) obj).clone();
                }
                if (componentType == Character.TYPE) {
                    clone = ((char[]) obj).clone();
                } else {
                    clone = componentType == Boolean.TYPE ? ((boolean[]) obj).clone() : obj;
                }
                if (componentType == Byte.TYPE) {
                    return ((byte[]) obj).clone();
                }
                if (componentType == Short.TYPE) {
                    return ((short[]) obj).clone();
                }
                if (componentType == Integer.TYPE) {
                    return ((int[]) obj).clone();
                }
                if (componentType == Long.TYPE) {
                    return ((long[]) obj).clone();
                }
                if (componentType == Float.TYPE) {
                    return ((float[]) obj).clone();
                }
                return componentType == Double.TYPE ? ((double[]) obj).clone() : clone;
            }
            if (GenericObject.class.isAssignableFrom(cls)) {
                return ((GenericObject) obj).clone();
            }
            if (GenericObjectList.class.isAssignableFrom(cls)) {
                return ((GenericObjectList) obj).clone();
            }
            if (Cloneable.class.isAssignableFrom(cls)) {
                try {
                    return cls.getMethod("clone", null).invoke(obj, null);
                } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                } catch (IllegalArgumentException e) {
                    InternalErrorHandler.handleException(e);
                }
            }
        }
        return obj;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
        }
    }

    public void merge(Object obj) {
        if (obj == null) {
            return;
        }
        if (!obj.getClass().equals(getClass())) {
            throw new IllegalArgumentException("Bad override object");
        }
        Class<?> cls = getClass();
        do {
            for (Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!Modifier.isPrivate(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isInterface(modifiers)) {
                    Class<?> type = field.getType();
                    String cls2 = type.toString();
                    try {
                        if (type.isPrimitive()) {
                            if (cls2.compareTo("int") == 0) {
                                field.setInt(this, field.getInt(obj));
                            } else if (cls2.compareTo("short") == 0) {
                                field.setShort(this, field.getShort(obj));
                            } else if (cls2.compareTo("char") == 0) {
                                field.setChar(this, field.getChar(obj));
                            } else if (cls2.compareTo("long") == 0) {
                                field.setLong(this, field.getLong(obj));
                            } else if (cls2.compareTo("boolean") == 0) {
                                field.setBoolean(this, field.getBoolean(obj));
                            } else if (cls2.compareTo("double") == 0) {
                                field.setDouble(this, field.getDouble(obj));
                            } else if (cls2.compareTo("float") == 0) {
                                field.setFloat(this, field.getFloat(obj));
                            }
                        } else {
                            Object obj2 = field.get(this);
                            Object obj3 = field.get(obj);
                            if (obj3 != null) {
                                if (obj2 == null) {
                                    field.set(this, obj3);
                                } else if (obj2 instanceof GenericObject) {
                                    ((GenericObject) obj2).merge(obj3);
                                } else {
                                    field.set(this, obj3);
                                }
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (!cls.equals(GenericObject.class));
    }

    protected GenericObject() {
    }

    protected String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    protected void sprint(String str) {
        if (str == null) {
            this.stringRepresentation += getIndentation();
            this.stringRepresentation += "<null>\n";
            return;
        }
        if (str.compareTo("}") == 0 || str.compareTo("]") == 0) {
            this.indentation--;
        }
        this.stringRepresentation += getIndentation();
        this.stringRepresentation += str;
        this.stringRepresentation += "\n";
        if (str.compareTo(Const.STR_MART_JSON_BEGIN) == 0 || str.compareTo("[") == 0) {
            this.indentation++;
        }
    }

    protected void sprint(Object obj) {
        sprint(obj.toString());
    }

    protected void sprint(int i) {
        sprint(String.valueOf(i));
    }

    protected void sprint(short s) {
        sprint(String.valueOf((int) s));
    }

    protected void sprint(char c) {
        sprint(String.valueOf(c));
    }

    protected void sprint(long j) {
        sprint(String.valueOf(j));
    }

    protected void sprint(boolean z) {
        sprint(String.valueOf(z));
    }

    protected void sprint(double d) {
        sprint(String.valueOf(d));
    }

    protected void sprint(float f) {
        sprint(String.valueOf(f));
    }

    protected void dbgPrint() {
        Debug.println(debugDump());
    }

    protected void dbgPrint(String str) {
        Debug.println(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Class<?> cls = getClass();
        Class<?> cls2 = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            Field[] declaredFields2 = cls2.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                Field field = declaredFields[i];
                Field field2 = declaredFields2[i];
                if ((field.getModifiers() & 2) != 2) {
                    Class<?> type = field.getType();
                    String name = field.getName();
                    if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                        try {
                            if (type.isPrimitive()) {
                                String cls3 = type.toString();
                                if (cls3.compareTo("int") == 0) {
                                    if (field.getInt(this) != field2.getInt(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("short") == 0) {
                                    if (field.getShort(this) != field2.getShort(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("char") == 0) {
                                    if (field.getChar(this) != field2.getChar(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("long") == 0) {
                                    if (field.getLong(this) != field2.getLong(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("boolean") == 0) {
                                    if (field.getBoolean(this) != field2.getBoolean(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("double") == 0) {
                                    if (field.getDouble(this) != field2.getDouble(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(obj)) {
                                    return false;
                                }
                            } else {
                                if (field2.get(obj) == field.get(this)) {
                                    return true;
                                }
                                if (field.get(this) == null || field2.get(obj) == null) {
                                    return false;
                                }
                                if ((field2.get(obj) == null && field.get(this) != null) || !field.get(this).equals(field2.get(obj))) {
                                    return false;
                                }
                            }
                        } catch (IllegalAccessException e) {
                            InternalErrorHandler.handleException(e);
                        }
                    }
                }
            }
            if (cls.equals(GenericObject.class)) {
                return true;
            }
            cls = cls.getSuperclass();
            cls2 = cls2.getSuperclass();
        }
    }

    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObject genericObject = (GenericObject) obj;
        Field[] declaredFields = getClass().getDeclaredFields();
        Field[] declaredFields2 = obj.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            Field field2 = declaredFields2[i];
            if ((field.getModifiers() & 2) != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    try {
                        if (type.isPrimitive()) {
                            String cls = type.toString();
                            if (cls.compareTo("int") == 0) {
                                if (field.getInt(this) != field2.getInt(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("short") == 0) {
                                if (field.getShort(this) != field2.getShort(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("char") == 0) {
                                if (field.getChar(this) != field2.getChar(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("long") == 0) {
                                if (field.getLong(this) != field2.getLong(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("boolean") == 0) {
                                if (field.getBoolean(this) != field2.getBoolean(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("double") == 0) {
                                if (field.getDouble(this) != field2.getDouble(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(genericObject)) {
                                return false;
                            }
                        } else {
                            Object obj2 = field.get(this);
                            Object obj3 = field2.get(genericObject);
                            if (obj3 != null && obj2 == null) {
                                return false;
                            }
                            if ((obj3 != null || obj2 == null) && (obj3 != null || obj2 != null)) {
                                if ((obj3 instanceof String) && (obj2 instanceof String)) {
                                    if (!((String) obj3).trim().equals("") && ((String) obj2).compareToIgnoreCase((String) obj3) != 0) {
                                        return false;
                                    }
                                } else {
                                    if (isMySubclass(obj2.getClass()) && !((GenericObject) obj2).match(obj3)) {
                                        return false;
                                    }
                                    if (GenericObjectList.isMySubclass(obj2.getClass()) && !((GenericObjectList) obj2).match(obj3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException e) {
                        InternalErrorHandler.handleException(e);
                    }
                }
            }
        }
        return true;
    }

    public String debugDump() {
        this.stringRepresentation = "";
        Class<?> cls = getClass();
        sprint(cls.getName());
        sprint(Const.STR_MART_JSON_BEGIN);
        for (Field field : cls.getDeclaredFields()) {
            if ((field.getModifiers() & 2) != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    sprint(name + ":");
                    try {
                        if (type.isPrimitive()) {
                            String cls2 = type.toString();
                            sprint(cls2 + ":");
                            if (cls2.compareTo("int") == 0) {
                                sprint(field.getInt(this));
                            } else if (cls2.compareTo("short") == 0) {
                                sprint(field.getShort(this));
                            } else if (cls2.compareTo("char") == 0) {
                                sprint(field.getChar(this));
                            } else if (cls2.compareTo("long") == 0) {
                                sprint(field.getLong(this));
                            } else if (cls2.compareTo("boolean") == 0) {
                                sprint(field.getBoolean(this));
                            } else if (cls2.compareTo("double") == 0) {
                                sprint(field.getDouble(this));
                            } else if (cls2.compareTo("float") == 0) {
                                sprint(field.getFloat(this));
                            }
                        } else if (GenericObject.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(((GenericObject) field.get(this)).debugDump(this.indentation + 1));
                            } else {
                                sprint("<null>");
                            }
                        } else if (GenericObjectList.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(((GenericObjectList) field.get(this)).debugDump(this.indentation + 1));
                            } else {
                                sprint("<null>");
                            }
                        } else {
                            if (field.get(this) != null) {
                                sprint(field.get(this).getClass().getName() + ":");
                            } else {
                                sprint(type.getName() + ":");
                            }
                            sprint(Const.STR_MART_JSON_BEGIN);
                            if (field.get(this) != null) {
                                sprint(field.get(this).toString());
                            } else {
                                sprint("<null>");
                            }
                            sprint("}");
                        }
                    } catch (IllegalAccessException unused) {
                    } catch (Exception e) {
                        InternalErrorHandler.handleException(e);
                    }
                }
            }
        }
        sprint("}");
        return this.stringRepresentation;
    }

    public String debugDump(int i) {
        this.indentation = i;
        String debugDump = debugDump();
        this.indentation = 0;
        return debugDump;
    }

    public StringBuilder encode(StringBuilder sb) {
        return sb.append(encode());
    }
}
