/*     */ package io.bloompeak.jr;
/*     */ 
/*     */ import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
/*     */ import com.atlassian.sal.api.auth.LoginUriProvider;
/*     */ import com.atlassian.sal.api.user.UserManager;
/*     */ import com.atlassian.templaterenderer.TemplateRenderer;
/*     */ import com.atlassian.webresource.api.assembler.PageBuilderService;
/*     */ import io.bloompeak.jr.util.b;
/*     */ import java.net.URI;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MainServlet
/*     */   extends HttpServlet
/*     */ {
/*     */   private static final long a = -4920164128460086704L;
/*  28 */   private static final Logger b = LoggerFactory.getLogger(MainServlet.class);
/*     */   
/*     */   @ComponentImport
/*     */   private PageBuilderService c;
/*     */   
/*     */   @ComponentImport
/*     */   private TemplateRenderer d;
/*     */   
/*     */   @ComponentImport
/*     */   private UserManager e;
/*     */   
/*     */   @ComponentImport
/*     */   private LoginUriProvider f;
/*     */   
/*     */   private final b g;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   public MainServlet(@ComponentImport TemplateRenderer paramTemplateRenderer, PageBuilderService paramPageBuilderService, UserManager paramUserManager, LoginUriProvider paramLoginUriProvider, b paramb) {
/*  47 */     this.d = paramTemplateRenderer;
/*  48 */     this.c = paramPageBuilderService;
/*  49 */     this.e = paramUserManager;
/*  50 */     this.f = paramLoginUriProvider;
/*  51 */     this.g = paramb;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doGet(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) {
/*  56 */     a(paramHttpServletRequest, paramHttpServletResponse);
/*     */   }
/*     */   
/*     */   private void a(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) {
/*  60 */     String str1 = this.e.getRemoteUsername(paramHttpServletRequest);
/*  61 */     if (str1 == null) {
/*  62 */       b(paramHttpServletRequest, paramHttpServletResponse);
/*     */       
/*     */       return;
/*     */     } 
/*  66 */     HashMap<Object, Object> hashMap = new HashMap<>();
/*  67 */     paramHttpServletResponse.setContentType("text/html;charset=utf-8");
/*     */ 
/*     */     
/*  70 */     hashMap.put("contextPath", paramHttpServletRequest.getContextPath());
/*  71 */     hashMap.put("user_is_admin", Boolean.valueOf(this.e.isSystemAdmin(str1)));
/*  72 */     String str2 = getServletConfig().getInitParameter("pluginKey");
/*  73 */     hashMap.put("pluginKey", str2);
/*  74 */     String str3 = "jr-index";
/*  75 */     if (b(paramHttpServletRequest)) {
/*  76 */       if (str2.equals("io.bloompeak.jira-reports-pro")) {
/*  77 */         this.g.a(hashMap);
/*     */       } else {
/*  79 */         a.a((Map)hashMap);
/*     */       } 
/*  81 */       str3 = "jr-chart";
/*     */     } 
/*  83 */     this.d.render("templates/" + str3 + ".vm", hashMap, paramHttpServletResponse.getWriter());
/*     */   }
/*     */   
/*     */   private void b(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse) {
/*  87 */     paramHttpServletResponse.sendRedirect(this.f.getLoginUri(a(paramHttpServletRequest)).toASCIIString());
/*     */   }
/*     */   
/*     */   private URI a(HttpServletRequest paramHttpServletRequest) {
/*  91 */     StringBuffer stringBuffer = paramHttpServletRequest.getRequestURL();
/*  92 */     if (paramHttpServletRequest.getQueryString() != null) {
/*  93 */       stringBuffer.append("?");
/*  94 */       stringBuffer.append(paramHttpServletRequest.getQueryString());
/*     */     } 
/*  96 */     return URI.create(stringBuffer.toString());
/*     */   }
/*     */   
/*     */   private boolean b(HttpServletRequest paramHttpServletRequest) {
/* 100 */     return a(paramHttpServletRequest, "chart");
/*     */   }
/*     */   protected boolean a(HttpServletRequest paramHttpServletRequest, String paramString) {
/* 103 */     return paramHttpServletRequest.getRequestURI().startsWith(paramHttpServletRequest.getContextPath() + "/plugins/servlet/bloompeak-jr/mainservlet/" + paramString);
/*     */   }
/*     */ }


/* Location:              /Users/chdande/Downloads/jira-reports-free-1.6.6.jar!/io/bloompeak/jr/MainServlet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */