package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FileUtils.java */
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static String f8746a;

    public static String a() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(Environment.getExternalStorageDirectory().getAbsolutePath());
        String str = File.separator;
        return append.append(str).append("AR/ARResource").append(str).append(b()).toString();
    }

    public static void b(String str) {
        f8746a = str;
    }

    public static String b() {
        return f8746a;
    }

    public static void b(String str, String str2) {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        File file = new File(a());
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = a() + File.separator + str2;
        File file2 = new File(str3);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
            }
        }
        if (a(str, str2)) {
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str3, true);
                try {
                    outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                        try {
                            bufferedWriter2.write(str);
                            bufferedWriter2.newLine();
                            bufferedWriter2.close();
                            outputStreamWriter.close();
                            fileOutputStream.close();
                        } catch (FileNotFoundException unused2) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            if (outputStreamWriter != null) {
                                outputStreamWriter.close();
                            }
                            if (fileOutputStream == null) {
                                return;
                            }
                            fileOutputStream.close();
                        } catch (UnsupportedEncodingException unused3) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            if (outputStreamWriter != null) {
                                outputStreamWriter.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (IOException unused4) {
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                            if (outputStreamWriter != null) {
                                outputStreamWriter.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused5) {
                                    throw th;
                                }
                            }
                            if (outputStreamWriter != null) {
                                outputStreamWriter.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused6) {
                    } catch (UnsupportedEncodingException unused7) {
                    } catch (IOException unused8) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException unused9) {
                    outputStreamWriter = null;
                } catch (UnsupportedEncodingException unused10) {
                    outputStreamWriter = null;
                } catch (IOException unused11) {
                    outputStreamWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamWriter = null;
                }
            } catch (IOException unused12) {
            }
        } catch (FileNotFoundException unused13) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (UnsupportedEncodingException unused14) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (IOException unused15) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
            fileOutputStream = null;
        }
    }

    public static String a(String str, int i) {
        String str2;
        String a2 = a();
        if (a2 == null) {
            str2 = null;
        } else if (i == 0) {
            str2 = a2 + "/track";
        } else if (i == 2) {
            str2 = a2 + "/track";
        } else if (i == 3) {
            str2 = a2 + "/udt";
        } else if (i != 4) {
            str2 = a2 + "/normal";
        } else {
            str2 = a2 + "/npc";
        }
        return !TextUtils.isEmpty(str) ? str2 + File.separator + str : str2;
    }

    public static boolean a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean a(String str, String str2) {
        HashSet<String> a2 = a(a() + File.separator + str2);
        if (a2 == null) {
            return false;
        }
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            boolean equals = str.equals(next);
            a.a("item = " + next + ", key = " + str + ", result = " + equals);
            if (equals) {
                return true;
            }
        }
        return false;
    }

    private static HashSet<String> a(String str) {
        Throwable th;
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        HashSet<String> hashSet = new HashSet<>();
        BufferedReader bufferedReader2 = null;
        if (!new File(str).exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                hashSet.add(readLine);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                    return null;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (IOException unused4) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused5) {
                                    return null;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused6) {
                                    throw th;
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    a.a("keysSet size is " + hashSet.size());
                    return hashSet;
                } catch (FileNotFoundException unused7) {
                    bufferedReader = null;
                } catch (IOException unused8) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException unused9) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (IOException unused10) {
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (FileNotFoundException unused11) {
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        } catch (IOException unused12) {
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            fileInputStream = null;
        }
    }
}
