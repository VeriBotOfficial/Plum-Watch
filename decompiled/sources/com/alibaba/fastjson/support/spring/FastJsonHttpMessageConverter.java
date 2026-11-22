package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.charset.Charset;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

/* loaded from: classes11.dex */
public class FastJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> implements GenericHttpMessageConverter<Object> {
    public static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Deprecated
    protected String dateFormat;
    private FastJsonConfig fastJsonConfig;

    @Deprecated
    protected SerializerFeature[] features;

    @Deprecated
    protected SerializeFilter[] filters;
    private boolean setLengthError;

    protected boolean supports(Class<?> cls) {
        return true;
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
    }

    public FastJsonHttpMessageConverter() {
        super(MediaType.ALL);
        this.features = new SerializerFeature[0];
        this.filters = new SerializeFilter[0];
        this.setLengthError = false;
        this.fastJsonConfig = new FastJsonConfig();
    }

    @Deprecated
    public Charset getCharset() {
        return this.fastJsonConfig.getCharset();
    }

    @Deprecated
    public void setCharset(Charset charset) {
        this.fastJsonConfig.setCharset(charset);
    }

    @Deprecated
    public String getDateFormat() {
        return this.fastJsonConfig.getDateFormat();
    }

    @Deprecated
    public void setDateFormat(String str) {
        this.fastJsonConfig.setDateFormat(str);
    }

    @Deprecated
    public SerializerFeature[] getFeatures() {
        return this.fastJsonConfig.getSerializerFeatures();
    }

    @Deprecated
    public void setFeatures(SerializerFeature... serializerFeatureArr) {
        this.fastJsonConfig.setSerializerFeatures(serializerFeatureArr);
    }

    @Deprecated
    public SerializeFilter[] getFilters() {
        return this.fastJsonConfig.getSerializeFilters();
    }

    @Deprecated
    public void setFilters(SerializeFilter... serializeFilterArr) {
        this.fastJsonConfig.setSerializeFilters(serializeFilterArr);
    }

    @Deprecated
    public void addSerializeFilter(SerializeFilter serializeFilter) {
        if (serializeFilter == null) {
            return;
        }
        int length = this.fastJsonConfig.getSerializeFilters().length;
        SerializeFilter[] serializeFilterArr = new SerializeFilter[length + 1];
        System.arraycopy(this.fastJsonConfig.getSerializeFilters(), 0, serializeFilterArr, 0, length);
        serializeFilterArr[length] = serializeFilter;
        this.fastJsonConfig.setSerializeFilters(serializeFilterArr);
    }

    public boolean canRead(Type type, Class<?> cls, MediaType mediaType) {
        return super.canRead(cls, mediaType);
    }

    public boolean canWrite(Type type, Class<?> cls, MediaType mediaType) {
        return super.canWrite(cls, mediaType);
    }

    public Object read(Type type, Class<?> cls, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return readType(getType(type, cls), httpInputMessage);
    }

    public void write(Object obj, Type type, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        super.write(obj, mediaType, httpOutputMessage);
    }

    protected Object readInternal(Class<?> cls, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return readType(getType(cls, null), httpInputMessage);
    }

    private Object readType(Type type, HttpInputMessage httpInputMessage) {
        try {
            return JSON.parseObject(httpInputMessage.getBody(), this.fastJsonConfig.getCharset(), type, this.fastJsonConfig.getParserConfig(), this.fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, this.fastJsonConfig.getFeatures());
        } catch (JSONException e) {
            throw new HttpMessageNotReadableException("JSON parse error: " + e.getMessage(), e);
        } catch (IOException e2) {
            throw new HttpMessageNotReadableException("I/O error while reading input message", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if ((r13 instanceof com.alibaba.fastjson.JSONPObject) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void writeInternal(java.lang.Object r13, org.springframework.http.HttpOutputMessage r14) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
        /*
            r12 = this;
            java.lang.String r1 = "Could not write JSON: "
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            org.springframework.http.HttpHeaders r0 = r14.getHeaders()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.serializer.SerializeFilter[] r3 = r3.getSerializeFilters()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.lang.Object r13 = r12.strangeCodeForJackson(r13)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            boolean r3 = r13 instanceof com.alibaba.fastjson.support.spring.FastJsonContainer     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r3 == 0) goto L33
            com.alibaba.fastjson.support.spring.FastJsonContainer r13 = (com.alibaba.fastjson.support.spring.FastJsonContainer) r13     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.support.spring.PropertyPreFilters r3 = r13.getFilters()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.util.List r3 = r3.getFilters()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
        L33:
            boolean r3 = r13 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r10 = 1
            if (r3 == 0) goto L46
            r3 = r13
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r3 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r3     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.lang.String r3 = r3.getJsonpFunction()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            boolean r3 = org.springframework.util.StringUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r3 != 0) goto L4c
            goto L4a
        L46:
            boolean r3 = r13 instanceof com.alibaba.fastjson.JSONPObject     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r3 == 0) goto L4c
        L4a:
            r11 = r10
            goto L4e
        L4c:
            r3 = 0
            r11 = r3
        L4e:
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.nio.charset.Charset r3 = r3.getCharset()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.support.config.FastJsonConfig r5 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.serializer.SerializeConfig r5 = r5.getSerializeConfig()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.serializer.SerializeFilter[] r6 = new com.alibaba.fastjson.serializer.SerializeFilter[r6]     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.lang.Object[] r4 = r4.toArray(r6)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r6 = r4
            com.alibaba.fastjson.serializer.SerializeFilter[] r6 = (com.alibaba.fastjson.serializer.SerializeFilter[]) r6     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            java.lang.String r7 = r4.getDateFormat()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            int r8 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            com.alibaba.fastjson.serializer.SerializerFeature[] r9 = r4.getSerializerFeatures()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r4 = r13
            int r13 = com.alibaba.fastjson.JSON.writeJSONStringWithFastJsonConfig(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r11 == 0) goto L81
            org.springframework.http.MediaType r3 = com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter.APPLICATION_JAVASCRIPT     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r0.setContentType(r3)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
        L81:
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r12.fastJsonConfig     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            boolean r3 = r3.isWriteContentLength()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r3 == 0) goto L94
            boolean r3 = r12.setLengthError     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            if (r3 != 0) goto L94
            long r3 = (long) r13
            r0.setContentLength(r3)     // Catch: java.lang.UnsupportedOperationException -> L92 java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            goto L94
        L92:
            r12.setLengthError = r10     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
        L94:
            java.io.OutputStream r13 = r14.getBody()     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r2.writeTo(r13)     // Catch: java.lang.Throwable -> L9f com.alibaba.fastjson.JSONException -> La2
            r2.close()
            return
        L9f:
            r0 = move-exception
            r13 = r0
            goto Lbb
        La2:
            r0 = move-exception
            r13 = r0
            org.springframework.http.converter.HttpMessageNotWritableException r14 = new org.springframework.http.converter.HttpMessageNotWritableException     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r13.getMessage()     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9f
            r14.<init>(r0, r13)     // Catch: java.lang.Throwable -> L9f
            throw r14     // Catch: java.lang.Throwable -> L9f
        Lbb:
            r2.close()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter.writeInternal(java.lang.Object, org.springframework.http.HttpOutputMessage):void");
    }

    private Object strangeCodeForJackson(Object obj) {
        return (obj == null || !"com.fasterxml.jackson.databind.node.ObjectNode".equals(obj.getClass().getName())) ? obj : obj.toString();
    }

    protected Type getType(Type type, Class<?> cls) {
        return Spring4TypeResolvableHelper.isSupport() ? Spring4TypeResolvableHelper.getType(type, cls) : type;
    }

    private static class Spring4TypeResolvableHelper {
        private static boolean hasClazzResolvableType;

        private Spring4TypeResolvableHelper() {
        }

        static {
            try {
                Class.forName("org.springframework.core.ResolvableType");
                hasClazzResolvableType = true;
            } catch (ClassNotFoundException unused) {
                hasClazzResolvableType = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupport() {
            return hasClazzResolvableType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Type getType(Type type, Class<?> cls) {
            if (cls == null) {
                return type;
            }
            ResolvableType forType = ResolvableType.forType(type);
            if (type instanceof TypeVariable) {
                ResolvableType resolveVariable = resolveVariable((TypeVariable) type, ResolvableType.forClass(cls));
                return resolveVariable != ResolvableType.NONE ? resolveVariable.resolve() : type;
            }
            if (!(type instanceof ParameterizedType) || !forType.hasUnresolvableGenerics()) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class[] clsArr = new Class[parameterizedType.getActualTypeArguments().length];
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                if (type2 instanceof TypeVariable) {
                    ResolvableType resolveVariable2 = resolveVariable((TypeVariable) type2, ResolvableType.forClass(cls));
                    if (resolveVariable2 != ResolvableType.NONE) {
                        clsArr[i] = resolveVariable2.resolve();
                    } else {
                        clsArr[i] = ResolvableType.forType(type2).resolve();
                    }
                } else {
                    clsArr[i] = ResolvableType.forType(type2).resolve();
                }
            }
            return ResolvableType.forClassWithGenerics(forType.getRawClass(), clsArr).getType();
        }

        private static ResolvableType resolveVariable(TypeVariable<?> typeVariable, ResolvableType resolvableType) {
            if (resolvableType.hasGenerics()) {
                ResolvableType forType = ResolvableType.forType(typeVariable, resolvableType);
                if (forType.resolve() != null) {
                    return forType;
                }
            }
            ResolvableType superType = resolvableType.getSuperType();
            if (superType != ResolvableType.NONE) {
                ResolvableType resolveVariable = resolveVariable(typeVariable, superType);
                if (resolveVariable.resolve() != null) {
                    return resolveVariable;
                }
            }
            for (ResolvableType resolvableType2 : resolvableType.getInterfaces()) {
                ResolvableType resolveVariable2 = resolveVariable(typeVariable, resolvableType2);
                if (resolveVariable2.resolve() != null) {
                    return resolveVariable2;
                }
            }
            return ResolvableType.NONE;
        }
    }
}
