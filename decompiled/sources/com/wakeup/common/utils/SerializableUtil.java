package com.wakeup.common.utils;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class SerializableUtil {
    public static <T extends Serializable> boolean saveSerializable(Context context, T objectToSave, String fileName) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            fileOutputStream = context.openFileOutput(fileName, 0);
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                objectOutputStream.writeObject(objectToSave);
                try {
                    objectOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (fileOutputStream == null) {
                    return true;
                }
                try {
                    fileOutputStream.close();
                    return true;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return true;
                }
            } catch (IOException e4) {
                e = e4;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static <T extends Serializable> T readSerializable(Context context, String fileName) {
        ObjectInputStream objectInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = context.openFileInput(fileName);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    T t = (T) objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return t;
                } catch (IOException | ClassNotFoundException unused) {
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (fileInputStream == null) {
                        return null;
                    }
                    try {
                        fileInputStream.close();
                        return null;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException | ClassNotFoundException unused2) {
                objectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (IOException | ClassNotFoundException unused3) {
            fileInputStream = null;
            objectInputStream = null;
        } catch (Throwable th4) {
            objectInputStream = null;
            th = th4;
            fileInputStream = null;
        }
    }

    public static boolean removeSerializable(Context context, String filename) {
        return context.deleteFile(filename);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Object[]] */
    public static <T> boolean saveSerializable(Context context, List<T> list, String name) {
        return saveSerializable(context, list.toArray(), name);
    }

    public static <E> List<E> readObjectForList(Context context, String name) {
        Object[] objArr = (Object[]) readSerializable(context, name);
        if (objArr == null) {
            return new LinkedList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
