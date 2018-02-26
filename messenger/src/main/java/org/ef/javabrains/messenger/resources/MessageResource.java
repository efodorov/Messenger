package org.ef.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ef.javabrains.messenger.model.Message;
import org.ef.javabrains.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	//create a new instance of messageService
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessages() {
		//returning a call to a service
		return messageService.getAllMessages();
	}
	

	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long mid, Message message) {
		message.setId(mid);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long mid) {
		messageService.deleteMessage(mid);
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long mid) {
		return messageService.getMessage(mid);
	}
	
	
}
