 package org.ef.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ef.javabrains.messenger.database.DatabaseClass;
import org.ef.javabrains.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Me", "Too"));
		messages.put(2L, new Message(2, "You", "Not"));
	}
	
	public List<Message> getAllMessages() {
		/*
		Message m1 = new Message(1L, "Hello World!", "Koushik");
		Message m2 = new Message(2L, "Hello Jersey!", "Koushik");
		List<Message> list = new ArrayList<>();
		list.add(m1);	
		list.add(m2);
		return list;
		*/
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		message.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
