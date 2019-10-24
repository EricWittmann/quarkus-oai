package io.wittmann;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.wittmann.beans.Widget;

@Path("/widgets")
public class WidgetResource {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Widget> listWidgets() {
    	List<Widget> rval = new ArrayList<>();
    	Widget widget = new Widget();
    	widget.setName("Widget 1");
    	widget.setSize(17);
    	rval.add(widget);
    	return rval;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{widgetId}")
    public Widget getWidget(@PathParam("widgetId") String widgetId) {
    	Widget widget = new Widget();
    	widget.setName("Widget 1");
    	widget.setSize(17);
    	return widget;
    }

}
