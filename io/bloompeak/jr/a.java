/*    */ package io.bloompeak.jr;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class a {
/*  7 */   private static long a = -1L;
/*  8 */   private static long b = -1L;
/*  9 */   private static long c = -1L;
/* 10 */   private static long d = -1L;
/* 11 */   private static String e = "ra*A6^8gryj=U4dQ!p7pngG=hs6N#9$KSJ454a_hPf";
/* 12 */   private static String f = e + "fZpCHwkzzD4Vw@YzbAP^vz!cVM$wNSVLJNc4998G6rs-*Zfvb8XvT_ca2Gf42N5=DRPdL4$nT3*s7A+W$e@n3D";
/* 13 */   private static String g = e + "fZpCHwkzzD4Vw@YzbAP^vz!cVM$wNSVLJNc499BG6rs-*Zfvb8XvT_ca2Gf42N5=DRPdL4$nT3*s7A+W$e@n3D";
/* 14 */   private static long h = 1000L;
/* 15 */   private static long i = 5L;
/*    */   
/*    */   public static void a(Map<String, Object> paramMap) {
/*    */     String str;
/* 19 */     long l = a();
/*    */     
/* 21 */     if (a != -1L && l - a < i * h) {
/* 22 */       str = g;
/*    */     } else {
/* 24 */       str = f;
/* 25 */       a = b;
/* 26 */       b = c;
/* 27 */       c = d;
/* 28 */       d = l;
/*    */     } 
/* 30 */     paramMap.put("cfwsfk", str);
/*    */   }
/*    */   private static long a() {
/* 33 */     return (new Date()).getTime();
/*    */   }
/*    */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */