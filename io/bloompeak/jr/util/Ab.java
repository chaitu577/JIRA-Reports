/*    */ package io.bloompeak.jr.util;
/*    */ 
/*    */ import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
/*    */ import com.atlassian.upm.api.license.PluginLicenseManager;
/*    */ import com.atlassian.upm.api.license.entity.LicenseError;
/*    */ import com.atlassian.upm.api.license.entity.PluginLicense;
/*    */ import com.atlassian.upm.api.util.Option;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ 
/*    */ @Component
/*    */ public class Ab
/*    */ {
/*    */   PluginLicenseManager a;
/*    */   
/*    */   @Autowired
/*    */   public Ab(@ComponentImport PluginLicenseManager paramPluginLicenseManager) {
/* 19 */     this.a = paramPluginLicenseManager;
/*    */   }
/*    */   
/*    */   public String a() {
/* 23 */     Option option = this.a.getLicense();
/* 24 */     if (!option.isDefined() || ((PluginLicense)option.get()).getError().isDefined()) {
/* 25 */       String str = "empty";
/* 26 */       if (option.isDefined() && ((PluginLicense)option.get()).getError().isDefined()) {
/* 27 */         str = ((LicenseError)((PluginLicense)option.get()).getError().get()).name();
/*    */       }
/* 29 */       return str;
/*    */     } 
/* 31 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/util/Ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */