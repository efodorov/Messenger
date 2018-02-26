package org.ef.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ef.javabrains.messenger.model.Message;
import org.ef.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	//create a new instance of messageService
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		//returning a call to a service
		return messageService.getAllMessages();
	}
	
	//here can be another method, e.g. POST method
	//@POST
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long mid) {
		return messageService.getMessage(mid);
	}
}
