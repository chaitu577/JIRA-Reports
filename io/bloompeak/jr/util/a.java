/*    */ package io.bloompeak.jr.util;
/*    */ 
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.Base64;
/*    */ 
/*    */ public class a {
/*  7 */   static final Charset a = Charset.forName("UTF-8");
/*    */   static String a(String paramString) {
/*  9 */     return new String(Base64.getDecoder().decode(paramString.getBytes(a)), a);
/*    */   }
/*    */   static String b(String paramString) {
/* 12 */     return new String(Base64.getEncoder().encode(paramString.getBytes(a)), a);
/*    */   }
/*    */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/util/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */