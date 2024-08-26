/*    */ package io.bloompeak.jr;
/*    */ 
/*    */ import com.atlassian.plugin.PluginAccessor;
/*    */ import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
/*    */ import com.atlassian.plugin.web.ContextProvider;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DashboardItemContextProvider
/*    */   implements ContextProvider
/*    */ {
/*    */   private final PluginAccessor pluginAccessor;
/*    */   
/*    */   public DashboardItemContextProvider(@ComponentImport PluginAccessor paramPluginAccessor) {
/* 20 */     this.pluginAccessor = paramPluginAccessor;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void init(Map<String, String> paramMap) {}
/*    */ 
/*    */   
/*    */   public Map<String, Object> getContextMap(Map<String, Object> paramMap) {
/* 29 */     return Maps.newHashMap(paramMap);
/*    */   }
/*    */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/DashboardItemContextProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */