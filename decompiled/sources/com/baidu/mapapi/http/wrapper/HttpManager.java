package com.baidu.mapapi.http.wrapper;

import android.text.TextUtils;
import com.anythink.core.common.m.a;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.DELETE;
import com.baidu.mapapi.http.wrapper.annotation.FileParam;
import com.baidu.mapapi.http.wrapper.annotation.GET;
import com.baidu.mapapi.http.wrapper.annotation.HttpHeader;
import com.baidu.mapapi.http.wrapper.annotation.POST;
import com.baidu.mapapi.http.wrapper.annotation.PUT;
import com.baidu.mapapi.http.wrapper.annotation.QueryString;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class HttpManager {
    public static final String HTTP_DELETE = "DELETE";
    public static final String HTTP_GET = "GET";
    public static final String HTTP_POST = "POST";
    public static final String HTTP_PUT = "PUT";
    private static final String UN_SUPPORT_REQUEST_METHOD = "UN_SUPPORT_REQUEST_METHOD";
    private String host;
    private String prefix;
    private final ExecutorService threadPool;

    public HttpManager(String str) {
        this(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> getGenericReturnType(Method method) {
        Iterator<Map.Entry<String, ClassInfo>> it = ClassInfo.getType(method.getGenericReturnType()).getGenericParams().entrySet().iterator();
        if (it.hasNext()) {
            return it.next().getValue().getRawType();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeCommonHeader(HttpClient.HttpHeader httpHeader, Class<?> cls, String str) {
        if (httpHeader != null) {
            if (cls == POST.class || cls == PUT.class) {
                httpHeader.setAccept("application/body").setCharset("UTF-8").setConnection("Keep-Alive");
                if (BodyData.TYPE_URL_ENCODED.equals(str)) {
                    httpHeader.setContentType("application/x-www-form-urlencoded");
                }
                if (BodyData.TYPE_FORM_DATA.equals(str)) {
                    httpHeader.setContentType("multipart/form-data;boundary=bd_map_sdk_cc");
                }
                if (BodyData.TYPE_JSON.equals(str)) {
                    httpHeader.setContentType(a.f3976q);
                }
            }
        }
    }

    public <T> T getApiInstance(Class<T> cls) {
        return (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.baidu.mapapi.http.wrapper.HttpManager.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                Class cls2;
                HttpClient httpClient;
                boolean z;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Iterator it;
                ArrayList arrayList4;
                Object[] objArr2 = objArr;
                Class<?> returnType = method.getReturnType();
                if (returnType != AsyncResponse.class && returnType != Response.class) {
                    return returnType.newInstance();
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                final HashMap hashMap = new HashMap();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                String str = "";
                String str2 = "";
                int i = 0;
                while (i < objArr2.length && i < parameterAnnotations.length) {
                    Annotation[] annotationArr = parameterAnnotations[i];
                    int length = annotationArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Annotation annotation = annotationArr[i2];
                        if (annotation instanceof QueryString) {
                            arrayList5.add(objArr2[i]);
                        }
                        if (annotation instanceof BodyData) {
                            str2 = ((BodyData) annotation).value();
                            arrayList6.add(objArr2[i]);
                        }
                        if (annotation instanceof HttpHeader) {
                            arrayList7.add(objArr2[i]);
                        }
                        if (annotation instanceof FileParam) {
                            FileParam fileParam = (FileParam) annotation;
                            if (fileParam.type() == 2) {
                                Iterator it2 = ((Map) objArr[i]).entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    Iterator it3 = it2;
                                    if (hashMap.containsKey(entry.getKey())) {
                                        arrayList4 = arrayList5;
                                    } else {
                                        arrayList4 = arrayList5;
                                        hashMap.put(entry.getKey(), new ArrayList());
                                    }
                                    ((List) hashMap.get(entry.getKey())).add(new FileWrapper((File) entry.getValue()));
                                    it2 = it3;
                                    arrayList5 = arrayList4;
                                }
                            }
                            arrayList = arrayList5;
                            if (fileParam.type() == 3) {
                                for (Iterator it4 = ((Map) objArr[i]).entrySet().iterator(); it4.hasNext(); it4 = it) {
                                    Map.Entry entry2 = (Map.Entry) it4.next();
                                    if (hashMap.containsKey(entry2.getKey())) {
                                        it = it4;
                                    } else {
                                        it = it4;
                                        hashMap.put(entry2.getKey(), new ArrayList());
                                    }
                                    if (entry2.getValue() != null) {
                                        File[] fileArr = (File[]) entry2.getValue();
                                        int length2 = fileArr.length;
                                        int i3 = 0;
                                        while (i3 < length2) {
                                            int i4 = i3;
                                            Map.Entry entry3 = entry2;
                                            ((List) hashMap.get(entry3.getKey())).add(new FileWrapper(fileArr[i4]));
                                            i3 = i4 + 1;
                                            entry2 = entry3;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                }
                            }
                            arrayList2 = arrayList6;
                            if (fileParam.type() == 6) {
                                for (Map.Entry entry4 : ((Map) objArr[i]).entrySet()) {
                                    if (!hashMap.containsKey(entry4.getKey())) {
                                        hashMap.put(entry4.getKey(), new ArrayList());
                                    }
                                    ((List) hashMap.get(entry4.getKey())).add(entry4.getValue());
                                }
                            }
                            if (fileParam.type() == 7) {
                                Iterator it5 = ((Map) objArr[i]).entrySet().iterator();
                                while (it5.hasNext()) {
                                    Map.Entry entry5 = (Map.Entry) it5.next();
                                    if (!hashMap.containsKey(entry5.getKey())) {
                                        hashMap.put(entry5.getKey(), new ArrayList());
                                    }
                                    if (entry5.getValue() != null) {
                                        FileWrapper[] fileWrapperArr = (FileWrapper[]) entry5.getValue();
                                        int length3 = fileWrapperArr.length;
                                        Iterator it6 = it5;
                                        int i5 = 0;
                                        while (i5 < length3) {
                                            int i6 = i5;
                                            Map.Entry entry6 = entry5;
                                            ((List) hashMap.get(entry6.getKey())).add(fileWrapperArr[i6]);
                                            i5 = i6 + 1;
                                            entry5 = entry6;
                                        }
                                        it5 = it6;
                                    }
                                }
                            }
                            String value = fileParam.value();
                            if (!TextUtils.isEmpty(value)) {
                                if (!hashMap.containsKey(value)) {
                                    hashMap.put(value, new ArrayList());
                                }
                                if (fileParam.type() == 0) {
                                    ((List) hashMap.get(value)).add(new FileWrapper((File) objArr[i]));
                                }
                                if (fileParam.type() == 1) {
                                    File[] fileArr2 = (File[]) objArr[i];
                                    int length4 = fileArr2.length;
                                    int i7 = 0;
                                    while (i7 < length4) {
                                        File[] fileArr3 = fileArr2;
                                        ((List) hashMap.get(value)).add(new FileWrapper(fileArr3[i7]));
                                        i7++;
                                        fileArr2 = fileArr3;
                                        arrayList7 = arrayList7;
                                    }
                                }
                                arrayList3 = arrayList7;
                                if (fileParam.type() == 4) {
                                    ((List) hashMap.get(value)).add((FileWrapper) objArr[i]);
                                }
                                if (fileParam.type() == 5) {
                                    ((List) hashMap.get(value)).addAll(Arrays.asList((FileWrapper[]) objArr[i]));
                                }
                                i2++;
                                objArr2 = objArr;
                                arrayList5 = arrayList;
                                arrayList7 = arrayList3;
                                arrayList6 = arrayList2;
                            }
                        } else {
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                        }
                        arrayList3 = arrayList7;
                        i2++;
                        objArr2 = objArr;
                        arrayList5 = arrayList;
                        arrayList7 = arrayList3;
                        arrayList6 = arrayList2;
                    }
                    i++;
                    objArr2 = objArr;
                }
                ArrayList arrayList8 = arrayList5;
                ArrayList arrayList9 = arrayList6;
                ArrayList arrayList10 = arrayList7;
                Annotation[] annotations = method.getAnnotations();
                int length5 = annotations.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length5) {
                        cls2 = null;
                        httpClient = null;
                        z = true;
                        break;
                    }
                    Annotation annotation2 = annotations[i8];
                    if (annotation2 instanceof GET) {
                        cls2 = GET.class;
                        httpClient = new HttpClient("GET");
                        GET get = (GET) annotation2;
                        str = get.value();
                        z = get.paramsNeedEncode();
                        break;
                    }
                    if (annotation2 instanceof POST) {
                        cls2 = POST.class;
                        httpClient = new HttpClient("POST");
                        POST post = (POST) annotation2;
                        str = post.value();
                        z = post.paramsNeedEncode();
                        break;
                    }
                    if (annotation2 instanceof PUT) {
                        cls2 = PUT.class;
                        httpClient = new HttpClient(HttpManager.HTTP_PUT);
                        PUT put = (PUT) annotation2;
                        str = put.value();
                        z = put.paramsNeedEncode();
                        break;
                    }
                    if (annotation2 instanceof DELETE) {
                        cls2 = DELETE.class;
                        httpClient = new HttpClient(HttpManager.HTTP_DELETE);
                        DELETE delete = (DELETE) annotation2;
                        str = delete.value();
                        z = delete.paramsNeedEncode();
                        break;
                    }
                    i8++;
                }
                if (cls2 == null) {
                    if (returnType == AsyncResponse.class) {
                        AsyncResponse asyncResponse = new AsyncResponse();
                        asyncResponse.onFailed(new Throwable(HttpManager.UN_SUPPORT_REQUEST_METHOD));
                        return asyncResponse;
                    }
                    Response response = new Response();
                    response.setE(new Throwable(HttpManager.UN_SUPPORT_REQUEST_METHOD));
                    return response;
                }
                try {
                    final String makeQueryString = ParamsUtils.makeQueryString(arrayList8.toArray());
                    final String makeQueryString2 = BodyData.TYPE_URL_ENCODED.equals(str2) ? ParamsUtils.makeQueryString(arrayList9.toArray(), z) : BodyData.TYPE_FORM_DATA.equals(str2) ? ParamsUtils.makeFormString(arrayList9.toArray(), z) : ParamsUtils.makeJsonString(arrayList9.toArray(), z);
                    final String str3 = HttpManager.this.host + HttpManager.this.prefix + str;
                    final Class genericReturnType = HttpManager.this.getGenericReturnType(method);
                    HttpClient.HttpHeader httpHeader = new HttpClient.HttpHeader();
                    HttpManager.this.makeCommonHeader(httpHeader, cls2, str2);
                    httpClient.setHeader(httpHeader.setCustom(ParamsUtils.getParamsMap(arrayList10.toArray())));
                    if (returnType == AsyncResponse.class) {
                        final HttpClient httpClient2 = httpClient;
                        final AsyncResponse asyncResponse2 = new AsyncResponse();
                        HttpManager.this.threadPool.submit(new Runnable() { // from class: com.baidu.mapapi.http.wrapper.HttpManager.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                HttpClient.HttpResponse request = httpClient2.request(str3, makeQueryString, makeQueryString2, hashMap);
                                if (request.getError() != HttpClient.HttpStateError.NO_ERROR) {
                                    asyncResponse2.onFailed(new Throwable(request.getError().toString()));
                                    return;
                                }
                                try {
                                    if (genericReturnType != null) {
                                        asyncResponse2.onSuccess(ParamsUtils.toObject(request.getData(), genericReturnType));
                                    } else {
                                        asyncResponse2.onSuccess(null);
                                    }
                                } catch (Exception e) {
                                    asyncResponse2.onFailed(e);
                                }
                            }
                        });
                        return asyncResponse2;
                    }
                    Response response2 = new Response();
                    HttpClient.HttpResponse request = httpClient.request(str3, makeQueryString, makeQueryString2, hashMap);
                    if (request.getError() != HttpClient.HttpStateError.NO_ERROR) {
                        response2.setE(new Throwable(request.getError().toString()));
                        return response2;
                    }
                    if (genericReturnType != null) {
                        try {
                            response2.setData(ParamsUtils.toObject(request.getData(), genericReturnType));
                            return response2;
                        } catch (Exception e) {
                            response2.setE(e);
                        }
                    }
                    return response2;
                } catch (Exception e2) {
                    if (returnType == AsyncResponse.class) {
                        AsyncResponse asyncResponse3 = new AsyncResponse();
                        asyncResponse3.onFailed(e2);
                        return asyncResponse3;
                    }
                    Response response3 = new Response();
                    response3.setE(e2);
                    return response3;
                }
            }
        });
    }

    public HttpManager(String str, String str2) {
        this.host = "";
        this.prefix = "";
        this.threadPool = com.baidu.mapapi.a.a();
        if (!TextUtils.isEmpty(str)) {
            this.host = str;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.prefix = str2;
    }
}
