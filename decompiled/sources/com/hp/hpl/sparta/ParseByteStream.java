package com.hp.hpl.sparta;

import com.phancy.mini.api.file.FileSystemManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
class ParseByteStream implements ParseSource {
    private ParseCharStream parseSource_;

    public ParseByteStream(String str, InputStream inputStream, ParseLog parseLog, String str2, ParseHandler parseHandler) throws ParseException, IOException {
        String str3;
        ParseHandler parseHandler2;
        String str4;
        EncodingMismatchException encodingMismatchException;
        String declaredEncoding;
        ParseHandler parseHandler3;
        ParseLog parseLog2 = parseLog == null ? DEFAULT_LOG : parseLog;
        if (!inputStream.markSupported()) {
            throw new Error("Precondition violation: the InputStream passed to ParseByteStream must support mark");
        }
        inputStream.mark(MAXLOOKAHEAD);
        byte[] bArr = new byte[4];
        String guessEncoding = str2 == null ? guessEncoding(str, bArr, inputStream.read(bArr), parseLog2) : str2;
        try {
            inputStream.reset();
            try {
                str3 = str;
                parseHandler3 = parseHandler;
            } catch (EncodingMismatchException e) {
                e = e;
                str3 = str;
                parseHandler3 = parseHandler;
            } catch (IOException unused) {
                str3 = str;
                str4 = guessEncoding;
                parseHandler2 = parseHandler;
            }
        } catch (EncodingMismatchException e2) {
            e = e2;
            str3 = str;
            parseHandler2 = parseHandler;
            str4 = guessEncoding;
        }
        try {
            str4 = guessEncoding;
            try {
                this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding(guessEncoding)), parseLog2, guessEncoding, parseHandler3);
            } catch (EncodingMismatchException e3) {
                e = e3;
                encodingMismatchException = e;
                parseHandler2 = parseHandler3;
                declaredEncoding = encodingMismatchException.getDeclaredEncoding();
                parseLog2.note("Encoding declaration of " + declaredEncoding + " is different that assumed " + str4 + " so restarting the parsing with the new encoding", str3, 1);
                inputStream.reset();
                try {
                    this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding(declaredEncoding)), parseLog2, (String) null, parseHandler2);
                } catch (UnsupportedEncodingException unused2) {
                    throw new ParseException(parseLog2, str3, 1, 0, declaredEncoding, "\"" + declaredEncoding + "\" is not a supported encoding");
                }
            } catch (IOException unused3) {
                parseHandler2 = parseHandler3;
                try {
                    parseLog2.note("Problem reading with assumed encoding of " + str4 + " so restarting with euc-jp", str3, 1);
                    inputStream.reset();
                    try {
                        ParseHandler parseHandler4 = parseHandler2;
                        try {
                            this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding("euc-jp")), parseLog2, (String) null, parseHandler4);
                        } catch (EncodingMismatchException e4) {
                            e = e4;
                            parseHandler2 = parseHandler4;
                            encodingMismatchException = e;
                            declaredEncoding = encodingMismatchException.getDeclaredEncoding();
                            parseLog2.note("Encoding declaration of " + declaredEncoding + " is different that assumed " + str4 + " so restarting the parsing with the new encoding", str3, 1);
                            inputStream.reset();
                            this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding(declaredEncoding)), parseLog2, (String) null, parseHandler2);
                        }
                    } catch (UnsupportedEncodingException unused4) {
                        String str5 = str3;
                        try {
                            throw new ParseException(parseLog2, str5, 1, 0, "euc-jp", "\"euc-jp\" is not a supported encoding");
                        } catch (EncodingMismatchException e5) {
                            e = e5;
                            parseLog2 = parseLog2;
                            str3 = str5;
                            encodingMismatchException = e;
                            declaredEncoding = encodingMismatchException.getDeclaredEncoding();
                            parseLog2.note("Encoding declaration of " + declaredEncoding + " is different that assumed " + str4 + " so restarting the parsing with the new encoding", str3, 1);
                            inputStream.reset();
                            this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding(declaredEncoding)), parseLog2, (String) null, parseHandler2);
                        }
                    }
                } catch (EncodingMismatchException e6) {
                    e = e6;
                }
            }
        } catch (EncodingMismatchException e7) {
            e = e7;
            str4 = guessEncoding;
            encodingMismatchException = e;
            parseHandler2 = parseHandler3;
            declaredEncoding = encodingMismatchException.getDeclaredEncoding();
            parseLog2.note("Encoding declaration of " + declaredEncoding + " is different that assumed " + str4 + " so restarting the parsing with the new encoding", str3, 1);
            inputStream.reset();
            this.parseSource_ = new ParseCharStream(str3, new InputStreamReader(inputStream, fixEncoding(declaredEncoding)), parseLog2, (String) null, parseHandler2);
        } catch (IOException unused5) {
            str4 = guessEncoding;
        }
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public String toString() {
        return this.parseSource_.toString();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public String getSystemId() {
        return this.parseSource_.getSystemId();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public int getLineNumber() {
        return this.parseSource_.getLineNumber();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String guessEncoding(java.lang.String r5, byte[] r6, int r7, com.hp.hpl.sparta.ParseLog r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hp.hpl.sparta.ParseByteStream.guessEncoding(java.lang.String, byte[], int, com.hp.hpl.sparta.ParseLog):java.lang.String");
    }

    private static String hex(byte b) {
        String hexString = Integer.toHexString(b);
        int length = hexString.length();
        if (length != 1) {
            return length != 2 ? hexString.substring(hexString.length() - 2) : hexString;
        }
        return "0" + hexString;
    }

    private static boolean equals(byte[] bArr, int i) {
        return bArr[0] == ((byte) (i >>> 24)) && bArr[1] == ((byte) ((i >>> 16) & 255)) && bArr[2] == ((byte) ((i >>> 8) & 255)) && bArr[3] == ((byte) (i & 255));
    }

    private static boolean equals(byte[] bArr, short s) {
        return bArr[0] == ((byte) (s >>> 8)) && bArr[1] == ((byte) (s & 255));
    }

    private static String fixEncoding(String str) {
        return str.toLowerCase().equals(FileSystemManager.ENCODING_UTF8) ? "UTF-8" : str;
    }
}
