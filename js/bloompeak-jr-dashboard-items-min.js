define("bloompeak-jr-dashboard-items/report",["underscore","jquery","wrm/context-path"],function(d,m,n){function f(a,c,g){var h=a.gadget.context.dashboard.id,k=a.gadget.context.dashboardItem.id,e=`bloompeak-jr-dashboard-frame-${h}-${k}`;c=this.$element=m(c).find("#bloompeak-jr-static");var l=document.getElementById(e);null===l?(window.addEventListener("message",b=>{b.data.hasOwnProperty("channel")&&b.data.channel===e&&(b.data.hasOwnProperty("jr_frameHeight")&&(document.getElementById(e).style.height=
`${b.data.jr_frameHeight}px`,a.resize()),b.data.hasOwnProperty("dashboardItemTitle")&&(console.log("e.data.dashboardItemTitle",b.data.dashboardItemTitle),a.setTitle(b.data.dashboardItemTitle)))}),c.empty().html(Dashboard.Item.Templatesbloompeakjr.IFrame({frameId:e,dashboardId:h,dashboardItemId:k,isEdit:g,contextPath:n()}))):l.contentWindow.postMessage({jr_isEdit:g},"*")}d=function(a){this.API=a};d.prototype.render=function(a,c){f(this.API,a,!1)};d.prototype.renderEdit=function(a,c){f(this.API,a,!0)};
return d});