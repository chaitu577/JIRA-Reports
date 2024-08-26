/*    */ package io.bloompeak.jr;
/*    */ 
/*    */ import com.atlassian.sal.api.auth.LoginUriProvider;
/*    */ import com.atlassian.sal.api.user.UserManager;
/*    */ import com.atlassian.templaterenderer.TemplateRenderer;
/*    */ import com.atlassian.webresource.api.assembler.PageBuilderService;
/*    */ import io.bloompeak.jr.util.b;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MainServletFree
/*    */   extends MainServlet
/*    */ {
/*    */   public MainServletFree(TemplateRenderer paramTemplateRenderer, PageBuilderService paramPageBuilderService, UserManager paramUserManager, LoginUriProvider paramLoginUriProvider, b paramb) {
/* 16 */     super(paramTemplateRenderer, paramPageBuilderService, paramUserManager, paramLoginUriProvider, paramb);
/*    */   }
/*    */   
/*    */   protected boolean a(HttpServletRequest paramHttpServletRequest, String paramString) {
/* 20 */     return paramHttpServletRequest.getRequestURI().startsWith(paramHttpServletRequest.getContextPath() + "/plugins/servlet/bloompeak-jr-free/mainservlet/" + paramString);
/*    */   }
/*    */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/MainServletFree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */