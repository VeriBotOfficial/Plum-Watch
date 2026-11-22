package android.gov.nist.core;

import java.text.ParseException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class HostNameParser extends ParserCore {
    private static boolean stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    private static final char[] VALID_DOMAIN_LABEL_CHAR = {65533, '-', '.', '_'};

    public HostNameParser(String str) {
        this.lexer = new LexerCore("charLexer", str);
    }

    public HostNameParser(LexerCore lexerCore) {
        this.lexer = lexerCore;
        lexerCore.selectLexer("charLexer");
    }

    protected void consumeDomainLabel() throws ParseException {
        if (debug) {
            dbg_enter("domainLabel");
        }
        try {
            this.lexer.consumeValidChars(VALID_DOMAIN_LABEL_CHAR);
        } finally {
            if (debug) {
                dbg_leave("domainLabel");
            }
        }
    }

    protected String ipv6Reference() throws ParseException {
        int indexOf;
        StringBuilder sb = new StringBuilder();
        if (debug) {
            dbg_enter("ipv6Reference");
        }
        try {
            if (!stripAddressScopeZones) {
                while (true) {
                    if (!this.lexer.hasMoreChars()) {
                        break;
                    }
                    char lookAhead = this.lexer.lookAhead(0);
                    if (!LexerCore.isHexDigit(lookAhead) && lookAhead != '.' && lookAhead != ':' && lookAhead != '[') {
                        if (lookAhead == ']') {
                            this.lexer.consume(1);
                            sb.append(lookAhead);
                            String sb2 = sb.toString();
                            if (debug) {
                                dbg_leave("ipv6Reference");
                            }
                            return sb2;
                        }
                    }
                    this.lexer.consume(1);
                    sb.append(lookAhead);
                }
            } else {
                while (true) {
                    if (!this.lexer.hasMoreChars()) {
                        break;
                    }
                    char lookAhead2 = this.lexer.lookAhead(0);
                    if (!LexerCore.isHexDigit(lookAhead2) && lookAhead2 != '.' && lookAhead2 != ':' && lookAhead2 != '[') {
                        if (lookAhead2 == ']') {
                            this.lexer.consume(1);
                            sb.append(lookAhead2);
                            return sb.toString();
                        }
                        if (lookAhead2 == '%') {
                            this.lexer.consume(1);
                            String rest = this.lexer.getRest();
                            if (rest != null && rest.length() != 0 && (indexOf = rest.indexOf(93)) != -1) {
                                this.lexer.consume(indexOf + 1);
                                sb.append("]");
                                String sb3 = sb.toString();
                                if (debug) {
                                    dbg_leave("ipv6Reference");
                                }
                                return sb3;
                            }
                        }
                    }
                    this.lexer.consume(1);
                    sb.append(lookAhead2);
                }
            }
            throw new ParseException(this.lexer.getBuffer() + ": Illegal Host name ", this.lexer.getPtr());
        } finally {
            if (debug) {
                dbg_leave("ipv6Reference");
            }
        }
    }

    public Host host() throws ParseException {
        String substring;
        if (debug) {
            dbg_enter("host");
        }
        try {
            if (this.lexer.lookAhead(0) == '[') {
                substring = ipv6Reference();
            } else if (isIPv6Address(this.lexer.getRest())) {
                int ptr = this.lexer.getPtr();
                this.lexer.consumeValidChars(new char[]{65533, AbstractJsonLexerKt.COLON});
                substring = "[" + this.lexer.getBuffer().substring(ptr, this.lexer.getPtr()) + "]";
            } else {
                int ptr2 = this.lexer.getPtr();
                consumeDomainLabel();
                substring = this.lexer.getBuffer().substring(ptr2, this.lexer.getPtr());
            }
            if (substring.length() == 0) {
                throw new ParseException(this.lexer.getBuffer() + ": Missing host name", this.lexer.getPtr());
            }
            return new Host(substring);
        } finally {
            if (debug) {
                dbg_leave("host");
            }
        }
    }

    private boolean isIPv6Address(String str) {
        int indexOf = str.indexOf(",");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(63);
        int indexOf3 = str.indexOf(59);
        if (indexOf2 == -1 || (indexOf3 != -1 && indexOf2 > indexOf3)) {
            indexOf2 = indexOf3;
        }
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        String substring = str.substring(0, indexOf2);
        int indexOf4 = substring.indexOf(58);
        return (indexOf4 == -1 || substring.indexOf(58, indexOf4 + 1) == -1) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:5:0x0009, B:7:0x0017, B:8:0x001c, B:10:0x0024, B:35:0x00a0, B:36:0x00ce, B:38:0x0058, B:40:0x0060, B:42:0x0065, B:44:0x0073, B:45:0x0097, B:46:0x0098), top: B:4:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.gov.nist.core.HostPort hostPort(boolean r6) throws java.text.ParseException {
        /*
            r5 = this;
            boolean r0 = android.gov.nist.core.HostNameParser.debug
            java.lang.String r1 = "hostPort"
            if (r0 == 0) goto L9
            r5.dbg_enter(r1)
        L9:
            android.gov.nist.core.Host r0 = r5.host()     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.HostPort r2 = new android.gov.nist.core.HostPort     // Catch: java.lang.Throwable -> Ld7
            r2.<init>()     // Catch: java.lang.Throwable -> Ld7
            r2.setHost(r0)     // Catch: java.lang.Throwable -> Ld7
            if (r6 == 0) goto L1c
            android.gov.nist.core.LexerCore r0 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            r0.SPorHT()     // Catch: java.lang.Throwable -> Ld7
        L1c:
            android.gov.nist.core.LexerCore r0 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = r0.hasMoreChars()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Lcf
            android.gov.nist.core.LexerCore r0 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            r3 = 0
            char r0 = r0.lookAhead(r3)     // Catch: java.lang.Throwable -> Ld7
            r4 = 9
            if (r0 == r4) goto Lcf
            r4 = 10
            if (r0 == r4) goto Lcf
            r4 = 13
            if (r0 == r4) goto Lcf
            r4 = 32
            if (r0 == r4) goto Lcf
            r4 = 37
            if (r0 == r4) goto L98
            r4 = 44
            if (r0 == r4) goto Lcf
            r4 = 47
            if (r0 == r4) goto Lcf
            r4 = 58
            if (r0 == r4) goto L58
            r4 = 59
            if (r0 == r4) goto Lcf
            r4 = 62
            if (r0 == r4) goto Lcf
            r4 = 63
            if (r0 == r4) goto Lcf
            goto L9d
        L58:
            android.gov.nist.core.LexerCore r0 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            r3 = 1
            r0.consume(r3)     // Catch: java.lang.Throwable -> Ld7
            if (r6 == 0) goto L65
            android.gov.nist.core.LexerCore r6 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            r6.SPorHT()     // Catch: java.lang.Throwable -> Ld7
        L65:
            android.gov.nist.core.LexerCore r6 = r5.lexer     // Catch: java.lang.NumberFormatException -> L73 java.lang.Throwable -> Ld7
            java.lang.String r6 = r6.number()     // Catch: java.lang.NumberFormatException -> L73 java.lang.Throwable -> Ld7
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L73 java.lang.Throwable -> Ld7
            r2.setPort(r6)     // Catch: java.lang.NumberFormatException -> L73 java.lang.Throwable -> Ld7
            goto Lcf
        L73:
            java.text.ParseException r6 = new java.text.ParseException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.LexerCore r2 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = " :Error parsing port "
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.LexerCore r2 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            int r2 = r2.getPtr()     // Catch: java.lang.Throwable -> Ld7
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r6     // Catch: java.lang.Throwable -> Ld7
        L98:
            boolean r0 = android.gov.nist.core.HostNameParser.stripAddressScopeZones     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L9d
            goto Lcf
        L9d:
            if (r6 == 0) goto La0
            goto Lcf
        La0:
            java.text.ParseException r6 = new java.text.ParseException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.LexerCore r2 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = " Illegal character in hostname:"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.LexerCore r2 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            char r2 = r2.lookAhead(r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld7
            android.gov.nist.core.LexerCore r2 = r5.lexer     // Catch: java.lang.Throwable -> Ld7
            int r2 = r2.getPtr()     // Catch: java.lang.Throwable -> Ld7
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r6     // Catch: java.lang.Throwable -> Ld7
        Lcf:
            boolean r6 = android.gov.nist.core.HostNameParser.debug
            if (r6 == 0) goto Ld6
            r5.dbg_leave(r1)
        Ld6:
            return r2
        Ld7:
            r6 = move-exception
            boolean r0 = android.gov.nist.core.HostNameParser.debug
            if (r0 == 0) goto Ldf
            r5.dbg_leave(r1)
        Ldf:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.gov.nist.core.HostNameParser.hostPort(boolean):android.gov.nist.core.HostPort");
    }

    public static void main(String[] strArr) throws ParseException {
        String[] strArr2 = {"foo.bar.com:1234", "proxima.chaplin.bt.co.uk", "129.6.55.181:2345", ":1234", "foo.bar.com:         1234", "foo.bar.com     :      1234   ", "MIK_S:1234"};
        for (int i = 0; i < 7; i++) {
            try {
                System.out.println("[" + new HostNameParser(strArr2[i]).hostPort(true).encode() + "]");
            } catch (ParseException e) {
                System.out.println("exception text = " + e.getMessage());
            }
        }
    }
}
