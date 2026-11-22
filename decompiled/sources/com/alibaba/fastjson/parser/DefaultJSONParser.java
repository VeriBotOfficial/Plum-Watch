package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    private static final Set<Class<?>> primitiveClasses;
    private String[] autoTypeAccept;
    private boolean autoTypeEnable;
    protected ParserConfig config;
    protected ParseContext context;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private List<ExtraProcessor> extraProcessors;
    private List<ExtraTypeProvider> extraTypeProviders;
    protected FieldTypeResolver fieldTypeResolver;
    public final Object input;
    protected transient BeanContext lastBeanContext;
    public final JSONLexer lexer;
    private int objectKeyLevel;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    static {
        HashSet hashSet = new HashSet();
        primitiveClasses = hashSet;
        hashSet.addAll(Arrays.asList(Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class));
    }

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.getLocale());
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.getTimeZone());
        }
        return this.dateFormat;
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public void setDateFomrat(DateFormat dateFormat) {
        setDateFormat(dateFormat);
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.getGlobalInstance(), JSON.DEFAULT_PARSER_FEATURE);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(str, new JSONScanner(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
        this(str, new JSONScanner(str, i), parserConfig);
    }

    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
        this(cArr, new JSONScanner(cArr, i, i2), parserConfig);
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.getGlobalInstance());
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this((Object) null, jSONLexer, parserConfig);
    }

    public DefaultJSONParser(Object obj, JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.objectKeyLevel = 0;
        this.autoTypeAccept = null;
        this.lexer = jSONLexer;
        this.input = obj;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char current = jSONLexer.getCurrent();
        if (current == '{') {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 12;
        } else if (current == '[') {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 14;
        } else {
            jSONLexer.nextToken();
        }
    }

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    public String getInput() {
        Object obj = this.input;
        if (obj instanceof char[]) {
            return new String((char[]) this.input);
        }
        return obj.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x034c, code lost:
    
        if (r3 == com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer.class) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x034e, code lost:
    
        setResolveStatus(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0362, code lost:
    
        return r0.deserialze(r17, r7, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0355, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson.parser.deserializer.MapDeserializer) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0357, code lost:
    
        setResolveStatus(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a8, code lost:
    
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02b3, code lost:
    
        if (r4.token() != 13) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b5, code lost:
    
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c0, code lost:
    
        if ((r17.config.getDeserializer(r7) instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02c2, code lost:
    
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r18, (java.lang.Class<java.lang.Object>) r7, r17.config);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ca, code lost:
    
        if (r0 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ce, code lost:
    
        if (r7 != java.lang.Cloneable.class) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02d0, code lost:
    
        r0 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02dc, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r6) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02de, code lost:
    
        r0 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02e9, code lost:
    
        if ("java.util.Collections$UnmodifiableMap".equals(r6) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02eb, code lost:
    
        r0 = java.util.Collections.unmodifiableMap(new java.util.HashMap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02f5, code lost:
    
        r0 = r7.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02fc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c9, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0305, code lost:
    
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0306, code lost:
    
        setResolveStatus(2);
        r3 = r17.context;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x030c, code lost:
    
        if (r3 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030e, code lost:
    
        if (r19 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0312, code lost:
    
        if ((r19 instanceof java.lang.Integer) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0318, code lost:
    
        if ((r3.fieldName instanceof java.lang.Integer) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x031a, code lost:
    
        popContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0321, code lost:
    
        if (r18.size() <= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0323, code lost:
    
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r18, (java.lang.Class<java.lang.Object>) r7, r17.config);
        setResolveStatus(0);
        parseObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0333, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0334, code lost:
    
        r0 = r17.config.getDeserializer(r7);
        r3 = r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0344, code lost:
    
        if (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class.isAssignableFrom(r3) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0348, code lost:
    
        if (r3 == com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0473 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x049c A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f8 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0604 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0610 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x061c A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0631 A[Catch: all -> 0x06c1, TRY_ENTER, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0223 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a2 A[Catch: all -> 0x06c1, TryCatch #0 {all -> 0x06c1, blocks: (B:24:0x0072, B:26:0x0076, B:28:0x0080, B:31:0x0093, B:35:0x00ab, B:39:0x0223, B:40:0x0229, B:42:0x0234, B:45:0x023c, B:52:0x0251, B:54:0x025f, B:57:0x02a2, B:59:0x02a8, B:61:0x02b5, B:63:0x02b8, B:65:0x02c2, B:69:0x02d0, B:70:0x02d6, B:72:0x02de, B:73:0x02e3, B:75:0x02eb, B:76:0x02f5, B:81:0x02fe, B:82:0x0305, B:83:0x0306, B:86:0x0310, B:88:0x0314, B:90:0x031a, B:91:0x031d, B:93:0x0323, B:96:0x0334, B:102:0x034e, B:103:0x035b, B:106:0x0353, B:108:0x0357, B:109:0x0264, B:112:0x0270, B:116:0x027c, B:118:0x0282, B:122:0x028f, B:125:0x0292, B:133:0x036c, B:271:0x0372, B:275:0x037a, B:277:0x0384, B:279:0x0395, B:281:0x03a0, B:283:0x03a8, B:285:0x03ac, B:287:0x03b2, B:290:0x03b7, B:292:0x03bb, B:293:0x0421, B:295:0x0429, B:298:0x0432, B:299:0x044e, B:302:0x03c2, B:304:0x03ca, B:306:0x03ce, B:307:0x03d1, B:308:0x03dd, B:311:0x03e6, B:313:0x03ea, B:315:0x03ed, B:317:0x03f1, B:318:0x03f5, B:319:0x0401, B:321:0x040b, B:322:0x0418, B:324:0x044f, B:325:0x046f, B:138:0x0473, B:140:0x0477, B:142:0x047b, B:144:0x0481, B:145:0x0484, B:149:0x048c, B:155:0x049c, B:157:0x04ab, B:159:0x04b6, B:160:0x04be, B:161:0x04c1, B:162:0x04ed, B:164:0x04f8, B:171:0x0505, B:174:0x0515, B:175:0x0539, B:180:0x04d1, B:182:0x04db, B:183:0x04ea, B:184:0x04e0, B:189:0x053e, B:191:0x0548, B:193:0x0550, B:194:0x0553, B:196:0x055e, B:197:0x0562, B:206:0x056d, B:199:0x0574, B:203:0x0581, B:204:0x0586, B:211:0x058b, B:213:0x0590, B:216:0x059b, B:218:0x05a3, B:220:0x05b8, B:222:0x05d7, B:223:0x05df, B:226:0x05e5, B:227:0x05eb, B:229:0x05f3, B:231:0x0604, B:234:0x060c, B:236:0x0610, B:237:0x0617, B:239:0x061c, B:240:0x061f, B:251:0x0627, B:242:0x0631, B:245:0x063b, B:246:0x0640, B:248:0x0645, B:249:0x0661, B:257:0x05c3, B:258:0x05ca, B:260:0x0662, B:268:0x0674, B:262:0x067b, B:265:0x0688, B:266:0x06ac, B:329:0x00bd, B:330:0x00df, B:406:0x00e4, B:408:0x00ef, B:410:0x00f3, B:412:0x00f7, B:414:0x00fd, B:415:0x0100, B:335:0x010f, B:337:0x0117, B:341:0x0127, B:342:0x0141, B:344:0x0142, B:345:0x0147, B:354:0x015c, B:356:0x0162, B:358:0x0169, B:359:0x0172, B:364:0x0184, B:368:0x018c, B:369:0x01a6, B:370:0x017f, B:371:0x016e, B:373:0x01a7, B:374:0x01c1, B:382:0x01cb, B:384:0x01d3, B:388:0x01e4, B:389:0x0208, B:391:0x0209, B:392:0x020e, B:393:0x020f, B:395:0x0219, B:397:0x06ad, B:398:0x06b4, B:400:0x06b5, B:401:0x06ba, B:403:0x06bb, B:404:0x06c0), top: B:23:0x0072, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a8 A[EDGE_INSN: B:58:0x02a8->B:59:0x02a8 BREAK  A[LOOP:0: B:28:0x0080->B:50:0x0080], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseObject(java.util.Map r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public ParserConfig getConfig() {
        return this.config;
    }

    public void setConfig(ParserConfig parserConfig) {
        this.config = parserConfig;
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T parseObject(Type type, Object obj) {
        int i = this.lexer.token();
        if (i == 8) {
            this.lexer.nextToken();
            return (T) TypeUtils.optionalEmpty(type);
        }
        if (i == 4) {
            if (type == byte[].class) {
                T t = (T) this.lexer.bytesValue();
                this.lexer.nextToken();
                return t;
            }
            if (type == char[].class) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return (T) stringVal.toCharArray();
            }
        }
        ObjectDeserializer deserializer = this.config.getDeserializer(type);
        try {
            if (deserializer.getClass() == JavaBeanDeserializer.class) {
                if (this.lexer.token() != 12 && this.lexer.token() != 14) {
                    throw new JSONException("syntax error,expect start with { or [,but actually start with " + this.lexer.tokenName());
                }
                return (T) ((JavaBeanDeserializer) deserializer).deserialze(this, type, obj, 0);
            }
            return (T) deserializer.deserialze(this, type, obj);
        } catch (JSONException e) {
            throw e;
        } catch (Throwable th) {
            throw new JSONException(th.getMessage(), th);
        }
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer deserializer;
        int i = this.lexer.token();
        if (i == 21 || i == 22) {
            this.lexer.nextToken();
            i = this.lexer.token();
        }
        if (i != 14) {
            throw new JSONException("field " + obj + " expect '[', but " + JSONToken.name(i) + ", " + this.lexer.info());
        }
        if (Integer.TYPE == type) {
            deserializer = IntegerCodec.instance;
            this.lexer.nextToken(2);
        } else if (String.class == type) {
            deserializer = StringCodec.instance;
            this.lexer.nextToken(4);
        } else {
            deserializer = this.config.getDeserializer(type);
            this.lexer.nextToken(deserializer.getFastMatchToken());
        }
        ParseContext parseContext = this.context;
        setContext(collection, obj);
        int i2 = 0;
        while (true) {
            try {
                if (this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                    while (this.lexer.token() == 16) {
                        this.lexer.nextToken();
                    }
                }
                if (this.lexer.token() != 15) {
                    Object obj2 = null;
                    if (Integer.TYPE == type) {
                        collection.add(IntegerCodec.instance.deserialze(this, null, null));
                    } else if (String.class == type) {
                        if (this.lexer.token() == 4) {
                            obj2 = this.lexer.stringVal();
                            this.lexer.nextToken(16);
                        } else {
                            Object parse = parse();
                            if (parse != null) {
                                obj2 = parse.toString();
                            }
                        }
                        collection.add(obj2);
                    } else {
                        if (this.lexer.token() == 8) {
                            this.lexer.nextToken();
                        } else {
                            obj2 = deserializer.deserialze(this, type, Integer.valueOf(i2));
                        }
                        collection.add(obj2);
                        checkListResolve(collection);
                    }
                    if (this.lexer.token() == 16) {
                        this.lexer.nextToken(deserializer.getFastMatchToken());
                    }
                    i2++;
                } else {
                    setContext(parseContext);
                    this.lexer.nextToken(16);
                    return;
                }
            } catch (Throwable th) {
                setContext(parseContext);
                throw th;
            }
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object cast;
        Class<?> cls;
        boolean z;
        Class cls2;
        int i = 8;
        if (this.lexer.token() == 8) {
            this.lexer.nextToken(16);
            return null;
        }
        int i2 = 14;
        if (this.lexer.token() != 14) {
            throw new JSONException("syntax error : " + this.lexer.tokenName());
        }
        Object[] objArr = new Object[typeArr.length];
        if (typeArr.length == 0) {
            this.lexer.nextToken(15);
            if (this.lexer.token() != 15) {
                throw new JSONException("syntax error");
            }
            this.lexer.nextToken(16);
            return new Object[0];
        }
        this.lexer.nextToken(2);
        int i3 = 0;
        while (i3 < typeArr.length) {
            if (this.lexer.token() == i) {
                this.lexer.nextToken(16);
                cast = null;
            } else {
                Type type = typeArr[i3];
                if (type == Integer.TYPE || type == Integer.class) {
                    if (this.lexer.token() == 2) {
                        cast = Integer.valueOf(this.lexer.intValue());
                        this.lexer.nextToken(16);
                    } else {
                        cast = TypeUtils.cast(parse(), type, this.config);
                    }
                } else if (type == String.class) {
                    if (this.lexer.token() == 4) {
                        cast = this.lexer.stringVal();
                        this.lexer.nextToken(16);
                    } else {
                        cast = TypeUtils.cast(parse(), type, this.config);
                    }
                } else {
                    if (i3 == typeArr.length - 1 && (type instanceof Class) && (((cls2 = (Class) type) != byte[].class && cls2 != char[].class) || this.lexer.token() != 4)) {
                        z = cls2.isArray();
                        cls = cls2.getComponentType();
                    } else {
                        cls = null;
                        z = false;
                    }
                    if (z && this.lexer.token() != i2) {
                        ArrayList arrayList = new ArrayList();
                        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
                        int fastMatchToken = deserializer.getFastMatchToken();
                        if (this.lexer.token() != 15) {
                            while (true) {
                                arrayList.add(deserializer.deserialze(this, type, null));
                                if (this.lexer.token() != 16) {
                                    break;
                                }
                                this.lexer.nextToken(fastMatchToken);
                            }
                            if (this.lexer.token() != 15) {
                                throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
                            }
                        }
                        cast = TypeUtils.cast(arrayList, type, this.config);
                    } else {
                        cast = this.config.getDeserializer(type).deserialze(this, type, Integer.valueOf(i3));
                    }
                }
            }
            objArr[i3] = cast;
            if (this.lexer.token() == 15) {
                break;
            }
            if (this.lexer.token() != 16) {
                throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
            }
            if (i3 == typeArr.length - 1) {
                this.lexer.nextToken(15);
            } else {
                this.lexer.nextToken(2);
            }
            i3++;
            i = 8;
            i2 = 14;
        }
        if (this.lexer.token() != 15) {
            throw new JSONException("syntax error");
        }
        this.lexer.nextToken(16);
        return objArr;
    }

    public void parseObject(Object obj) {
        Object deserialze;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (this.lexer.token() != 12 && this.lexer.token() != 16) {
            throw new JSONException("syntax error, expect {, actual " + this.lexer.tokenName());
        }
        while (true) {
            String scanSymbol = this.lexer.scanSymbol(this.symbolTable);
            if (scanSymbol == null) {
                if (this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                } else if (this.lexer.token() == 16 && this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                }
            }
            FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(scanSymbol) : null;
            if (fieldDeserializer == null) {
                if (!this.lexer.isEnabled(Feature.IgnoreNotMatch)) {
                    throw new JSONException("setter not found, class " + cls.getName() + ", property " + scanSymbol);
                }
                this.lexer.nextTokenWithColon();
                parse();
                if (this.lexer.token() == 13) {
                    this.lexer.nextToken();
                    return;
                }
            } else {
                Class<?> cls2 = fieldDeserializer.fieldInfo.fieldClass;
                Type type = fieldDeserializer.fieldInfo.fieldType;
                if (cls2 == Integer.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    deserialze = IntegerCodec.instance.deserialze(this, type, null);
                } else if (cls2 == String.class) {
                    this.lexer.nextTokenWithColon(4);
                    deserialze = StringCodec.deserialze(this);
                } else if (cls2 == Long.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    deserialze = LongCodec.instance.deserialze(this, type, null);
                } else {
                    ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                    this.lexer.nextTokenWithColon(deserializer2.getFastMatchToken());
                    deserialze = deserializer2.deserialze(this, type, null);
                }
                fieldDeserializer.setValue(obj, deserialze);
                if (this.lexer.token() != 16 && this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                }
            }
        }
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token() == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 1) {
            throw new JSONException("not support type " + type);
        }
        Type type2 = actualTypeArguments[0];
        if (type2 instanceof Class) {
            ArrayList arrayList = new ArrayList();
            parseArray((Class<?>) type2, (Collection) arrayList);
            return arrayList;
        }
        if (type2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type2;
            Type type3 = wildcardType.getUpperBounds()[0];
            if (Object.class.equals(type3)) {
                if (wildcardType.getLowerBounds().length == 0) {
                    return parse();
                }
                throw new JSONException("not support type : " + type);
            }
            ArrayList arrayList2 = new ArrayList();
            parseArray((Class<?>) type3, (Collection) arrayList2);
            return arrayList2;
        }
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 1) {
                throw new JSONException("not support : " + typeVariable);
            }
            Type type4 = bounds[0];
            if (type4 instanceof Class) {
                ArrayList arrayList3 = new ArrayList();
                parseArray((Class<?>) type4, (Collection) arrayList3);
                return arrayList3;
            }
        }
        if (type2 instanceof ParameterizedType) {
            ArrayList arrayList4 = new ArrayList();
            parseArray((ParameterizedType) type2, arrayList4);
            return arrayList4;
        }
        throw new JSONException("TODO : " + type);
    }

    public void acceptType(String str) {
        JSONLexer jSONLexer = this.lexer;
        jSONLexer.nextTokenWithColon();
        if (jSONLexer.token() != 4) {
            throw new JSONException("type not match error");
        }
        if (str.equals(jSONLexer.stringVal())) {
            jSONLexer.nextToken();
            if (jSONLexer.token() == 16) {
                jSONLexer.nextToken();
                return;
            }
            return;
        }
        throw new JSONException("type not match error");
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public void setResolveStatus(int i) {
        this.resolveStatus = i;
    }

    public Object getObject(String str) {
        for (int i = 0; i < this.contextArrayIndex; i++) {
            if (str.equals(this.contextArray[i].toString())) {
                return this.contextArray[i].object;
            }
        }
        return null;
    }

    public void checkListResolve(Collection collection) {
        if (this.resolveStatus == 1) {
            if (collection instanceof List) {
                int size = collection.size() - 1;
                ResolveTask lastResolveTask = getLastResolveTask();
                lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, size);
                lastResolveTask.ownerContext = this.context;
                setResolveStatus(0);
                return;
            }
            ResolveTask lastResolveTask2 = getLastResolveTask();
            lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(collection);
            lastResolveTask2.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    public void checkMapResolve(Map map, Object obj) {
        if (this.resolveStatus == 1) {
            ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
            lastResolveTask.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public JSONObject parseObject() {
        Object parseObject = parseObject((Map) new JSONObject(this.lexer.isEnabled(Feature.OrderedField)));
        if (parseObject instanceof JSONObject) {
            return (JSONObject) parseObject;
        }
        if (parseObject == null) {
            return null;
        }
        return new JSONObject((Map<String, Object>) parseObject);
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    public final void parseArray(Collection collection, Object obj) {
        Object obj2;
        Number decimalValue;
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == 21 || jSONLexer.token() == 22) {
            jSONLexer.nextToken();
        }
        if (jSONLexer.token() != 14) {
            throw new JSONException("syntax error, expect [, actual " + JSONToken.name(jSONLexer.token()) + ", pos " + jSONLexer.pos() + ", fieldName " + obj);
        }
        jSONLexer.nextToken(4);
        ParseContext parseContext = this.context;
        if (parseContext != null && parseContext.level > 512) {
            throw new JSONException("array level > 512");
        }
        ParseContext parseContext2 = this.context;
        setContext(collection, obj);
        int i = 0;
        while (true) {
            try {
                try {
                    if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                        while (jSONLexer.token() == 16) {
                            jSONLexer.nextToken();
                        }
                    }
                    int i2 = jSONLexer.token();
                    if (i2 == 2) {
                        Number integerValue = jSONLexer.integerValue();
                        jSONLexer.nextToken(16);
                        obj2 = integerValue;
                    } else if (i2 == 3) {
                        if (jSONLexer.isEnabled(Feature.UseBigDecimal)) {
                            decimalValue = jSONLexer.decimalValue(true);
                        } else {
                            decimalValue = jSONLexer.decimalValue(false);
                        }
                        obj2 = decimalValue;
                        jSONLexer.nextToken(16);
                    } else if (i2 == 4) {
                        String stringVal = jSONLexer.stringVal();
                        jSONLexer.nextToken(16);
                        obj2 = stringVal;
                        if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                            JSONScanner jSONScanner = new JSONScanner(stringVal);
                            Object obj3 = stringVal;
                            if (jSONScanner.scanISO8601DateIfMatch()) {
                                obj3 = jSONScanner.getCalendar().getTime();
                            }
                            jSONScanner.close();
                            obj2 = obj3;
                        }
                    } else if (i2 == 6) {
                        Boolean bool = Boolean.TRUE;
                        jSONLexer.nextToken(16);
                        obj2 = bool;
                    } else if (i2 != 7) {
                        obj2 = null;
                        obj2 = null;
                        if (i2 == 8) {
                            jSONLexer.nextToken(4);
                        } else if (i2 == 12) {
                            obj2 = parseObject(new JSONObject(jSONLexer.isEnabled(Feature.OrderedField)), Integer.valueOf(i));
                        } else {
                            if (i2 == 20) {
                                throw new JSONException("unclosed jsonArray");
                            }
                            if (i2 == 23) {
                                jSONLexer.nextToken(4);
                            } else if (i2 == 14) {
                                JSONArray jSONArray = new JSONArray();
                                parseArray(jSONArray, Integer.valueOf(i));
                                obj2 = jSONArray;
                                if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                                    obj2 = jSONArray.toArray();
                                }
                            } else {
                                if (i2 == 15) {
                                    jSONLexer.nextToken(16);
                                    return;
                                }
                                obj2 = parse();
                            }
                        }
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        jSONLexer.nextToken(16);
                        obj2 = bool2;
                    }
                    collection.add(obj2);
                    checkListResolve(collection);
                    if (jSONLexer.token() == 16) {
                        jSONLexer.nextToken(4);
                    }
                    i++;
                } catch (ClassCastException e) {
                    throw new JSONException("unkown error", e);
                }
            } finally {
                setContext(parseContext2);
            }
        }
    }

    public ParseContext getContext() {
        return this.context;
    }

    public ParseContext getOwnerContext() {
        return this.context.parent;
    }

    public List<ResolveTask> getResolveTaskList() {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        return this.resolveTaskList;
    }

    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    public ResolveTask getLastResolveTask() {
        return this.resolveTaskList.get(r0.size() - 1);
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    public FieldTypeResolver getFieldTypeResolver() {
        return this.fieldTypeResolver;
    }

    public void setFieldTypeResolver(FieldTypeResolver fieldTypeResolver) {
        this.fieldTypeResolver = fieldTypeResolver;
    }

    public void setContext(ParseContext parseContext) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = parseContext;
    }

    public void popContext() {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = this.context.parent;
        int i = this.contextArrayIndex;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.contextArrayIndex = i2;
        this.contextArray[i2] = null;
    }

    public ParseContext setContext(Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        return setContext(this.context, obj, obj2);
    }

    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        ParseContext parseContext2 = new ParseContext(parseContext, obj, obj2);
        this.context = parseContext2;
        addContext(parseContext2);
        return this.context;
    }

    private void addContext(ParseContext parseContext) {
        int i = this.contextArrayIndex;
        this.contextArrayIndex = i + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[(parseContextArr.length * 3) / 2];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        this.contextArray[i] = parseContext;
    }

    public Object parse() {
        return parse(null);
    }

    public Object parseKey() {
        if (this.lexer.token() == 18) {
            String stringVal = this.lexer.stringVal();
            this.lexer.nextToken(16);
            return stringVal;
        }
        return parse(null);
    }

    public Object parse(Object obj) {
        Map jSONObject;
        JSONLexer jSONLexer = this.lexer;
        int i = jSONLexer.token();
        if (i == 2) {
            Number integerValue = jSONLexer.integerValue();
            jSONLexer.nextToken();
            return integerValue;
        }
        if (i == 3) {
            Number decimalValue = jSONLexer.decimalValue(jSONLexer.isEnabled(Feature.UseBigDecimal));
            jSONLexer.nextToken();
            return decimalValue;
        }
        if (i == 4) {
            String stringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            if (!jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                return stringVal;
            }
            JSONScanner jSONScanner = new JSONScanner(stringVal);
            try {
                return jSONScanner.scanISO8601DateIfMatch() ? jSONScanner.getCalendar().getTime() : stringVal;
            } finally {
                jSONScanner.close();
            }
        }
        if (i == 12) {
            if (isEnabled(Feature.UseNativeJavaObject)) {
                jSONObject = jSONLexer.isEnabled(Feature.OrderedField) ? new HashMap() : new LinkedHashMap();
            } else {
                jSONObject = new JSONObject(jSONLexer.isEnabled(Feature.OrderedField));
            }
            return parseObject(jSONObject, obj);
        }
        if (i == 14) {
            Collection arrayList = isEnabled(Feature.UseNativeJavaObject) ? new ArrayList() : new JSONArray();
            parseArray(arrayList, obj);
            return jSONLexer.isEnabled(Feature.UseObjectArray) ? arrayList.toArray() : arrayList;
        }
        if (i == 18) {
            if ("NaN".equals(jSONLexer.stringVal())) {
                jSONLexer.nextToken();
                return null;
            }
            throw new JSONException("syntax error, " + jSONLexer.info());
        }
        if (i != 26) {
            switch (i) {
                case 6:
                    jSONLexer.nextToken();
                    return Boolean.TRUE;
                case 7:
                    jSONLexer.nextToken();
                    return Boolean.FALSE;
                case 8:
                    jSONLexer.nextToken();
                    return null;
                case 9:
                    jSONLexer.nextToken(18);
                    if (jSONLexer.token() != 18) {
                        throw new JSONException("syntax error");
                    }
                    jSONLexer.nextToken(10);
                    accept(10);
                    long longValue = jSONLexer.integerValue().longValue();
                    accept(2);
                    accept(11);
                    return new Date(longValue);
                default:
                    switch (i) {
                        case 20:
                            if (jSONLexer.isBlankInput()) {
                                return null;
                            }
                            throw new JSONException("unterminated json string, " + jSONLexer.info());
                        case 21:
                            jSONLexer.nextToken();
                            HashSet hashSet = new HashSet();
                            parseArray(hashSet, obj);
                            return hashSet;
                        case 22:
                            jSONLexer.nextToken();
                            TreeSet treeSet = new TreeSet();
                            parseArray(treeSet, obj);
                            return treeSet;
                        case 23:
                            jSONLexer.nextToken();
                            return null;
                        default:
                            throw new JSONException("syntax error, " + jSONLexer.info());
                    }
            }
        }
        byte[] bytesValue = jSONLexer.bytesValue();
        jSONLexer.nextToken();
        return bytesValue;
    }

    public void config(Feature feature, boolean z) {
        this.lexer.config(feature, z);
    }

    public boolean isEnabled(Feature feature) {
        return this.lexer.isEnabled(feature);
    }

    public JSONLexer getLexer() {
        return this.lexer;
    }

    public final void accept(int i) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i) {
            jSONLexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i) + ", actual " + JSONToken.name(jSONLexer.token()));
    }

    public final void accept(int i, int i2) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i) {
            jSONLexer.nextToken(i2);
        } else {
            throwException(i);
        }
    }

    public void throwException(int i) {
        throw new JSONException("syntax error, expect " + JSONToken.name(i) + ", actual " + JSONToken.name(this.lexer.token()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JSONLexer jSONLexer = this.lexer;
        try {
            if (jSONLexer.isEnabled(Feature.AutoCloseSource) && jSONLexer.token() != 20) {
                throw new JSONException("not close json text, token : " + JSONToken.name(jSONLexer.token()));
            }
        } finally {
            jSONLexer.close();
        }
    }

    public Object resolveReference(String str) {
        if (this.contextArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            ParseContext[] parseContextArr = this.contextArray;
            if (i >= parseContextArr.length || i >= this.contextArrayIndex) {
                break;
            }
            ParseContext parseContext = parseContextArr[i];
            if (parseContext.toString().equals(str)) {
                return parseContext.object;
            }
            i++;
        }
        return null;
    }

    public void handleResovleTask(Object obj) {
        Object obj2;
        List<ResolveTask> list = this.resolveTaskList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveTask resolveTask = this.resolveTaskList.get(i);
            String str = resolveTask.referenceValue;
            Object obj3 = resolveTask.ownerContext != null ? resolveTask.ownerContext.object : null;
            if (str.startsWith("$")) {
                obj2 = getObject(str);
                if (obj2 == null) {
                    try {
                        JSONPath jSONPath = new JSONPath(str, SerializeConfig.getGlobalInstance(), this.config, true);
                        if (jSONPath.isRef()) {
                            obj2 = jSONPath.eval(obj);
                        }
                    } catch (JSONPathException unused) {
                    }
                }
            } else {
                obj2 = resolveTask.context.object;
            }
            FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
            if (fieldDeserializer != null) {
                if (obj2 != null && obj2.getClass() == JSONObject.class && fieldDeserializer.fieldInfo != null && !Map.class.isAssignableFrom(fieldDeserializer.fieldInfo.fieldClass)) {
                    Object obj4 = this.contextArray[0].object;
                    JSONPath compile = JSONPath.compile(str);
                    if (compile.isRef()) {
                        obj2 = compile.eval(obj4);
                    }
                }
                if (fieldDeserializer.getOwnerClass() != null && !fieldDeserializer.getOwnerClass().isInstance(obj3) && resolveTask.ownerContext.parent != null) {
                    ParseContext parseContext = resolveTask.ownerContext;
                    while (true) {
                        parseContext = parseContext.parent;
                        if (parseContext != null) {
                            if (fieldDeserializer.getOwnerClass().isInstance(parseContext.object)) {
                                obj3 = parseContext.object;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                fieldDeserializer.setValue(obj3, obj2);
            }
        }
    }

    public static class ResolveTask {
        public final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        public final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    public void parseExtra(Object obj, String str) {
        Object parseObject;
        this.lexer.nextTokenWithColon();
        List<ExtraTypeProvider> list = this.extraTypeProviders;
        Type type = null;
        if (list != null) {
            Iterator<ExtraTypeProvider> it = list.iterator();
            while (it.hasNext()) {
                type = it.next().getExtraType(obj, str);
            }
        }
        if (type == null) {
            parseObject = parse();
        } else {
            parseObject = parseObject(type);
        }
        if (obj instanceof ExtraProcessable) {
            ((ExtraProcessable) obj).processExtra(str, parseObject);
            return;
        }
        List<ExtraProcessor> list2 = this.extraProcessors;
        if (list2 != null) {
            Iterator<ExtraProcessor> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().processExtra(obj, str, parseObject);
            }
        }
        if (this.resolveStatus == 1) {
            this.resolveStatus = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0240, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(com.alibaba.fastjson.parser.deserializer.PropertyProcessable r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parse(com.alibaba.fastjson.parser.deserializer.PropertyProcessable, java.lang.Object):java.lang.Object");
    }
}
