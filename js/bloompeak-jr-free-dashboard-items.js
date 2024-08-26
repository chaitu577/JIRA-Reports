define('bloompeak-jr-free-dashboard-items/report', ['underscore', 'jquery', 'wrm/context-path'], function (_, $, contextPath) {
  var DashboardItem = function (API) {
    this.API = API;
  };
  /**
   * Called to render the view for a fully configured dashboard item.
   *
   * @param context The surrounding <div/> context that this items should render into.
   * @param preferences The user preferences saved for this dashboard item (e.g. filter id, number of results...)
   */
  DashboardItem.prototype.render = function (context, preferences) {
    renderInternal(this.API, context, false);
  };

  DashboardItem.prototype.renderEdit = function (context, preferences) {
    renderInternal(this.API, context, true);
  };

  function renderInternal(API, context, isEdit) {
    var dashboardId = API.gadget.context.dashboard.id
    var dashboardItemId = API.gadget.context.dashboardItem.id
    var frameId = `bloompeak-jr-dashboard-frame-${dashboardId}-${dashboardItemId}`

    var $element = this.$element = $(context).find(`#bloompeak-jr-free-static`);
    var frameElem = document.getElementById(frameId)
    
    // console.log('frameId', frameId)
    // console.log('frameElem', frameElem)
    
    if(frameElem===null){
      window.addEventListener('message',(e) => {
        // console.log('frameId:' + frameId + ' e.data:', e.data)
        if (e.data.hasOwnProperty("channel") && e.data.channel === frameId) {
          if (e.data.hasOwnProperty("jr_frameHeight")) {
            document.getElementById(frameId).style.height = `${e.data.jr_frameHeight}px`;
            API.resize();
            // console.log('resizing', e.data.jr_frameHeight);
          }
          if (e.data.hasOwnProperty("dashboardItemTitle")) {
            console.log('e.data.dashboardItemTitle',e.data.dashboardItemTitle)
            API.setTitle(e.data.dashboardItemTitle)
          }
        }
      })

      $element.empty().html(Dashboard.Item.Templatesbloompeakjrfree.IFrame({ frameId:frameId, dashboardId: dashboardId, dashboardItemId: dashboardItemId, isEdit: isEdit, contextPath: contextPath() }));
    }else{
      frameElem.contentWindow.postMessage({jr_isEdit: isEdit}, '*');
    }
  }

  return DashboardItem;
});