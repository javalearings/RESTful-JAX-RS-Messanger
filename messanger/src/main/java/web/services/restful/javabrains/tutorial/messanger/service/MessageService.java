package web.services.restful.javabrains.tutorial.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import web.services.restful.javabrains.tutorial.messanger.database.DataBaseClass;
import web.services.restful.javabrains.tutorial.messanger.model.Message;

public class MessageService {

	
	private Map<Long, Message> messages;
	
	public MessageService()
	{
		Message m1= new Message(1L, "Ravi", "Hello RESTful");
		Message m2=new Message(2L,"Ravi","Hello RESTful api using JAX-RS");
		messages=DataBaseClass.getMessages();
		messages.put(1L, m1);
		messages.put(2L, m2);
	}
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id)
	{
		if(messages.containsKey(id))
			return messages.get(id);
		return null;
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message) {
		if(message.getId()<0)
			return null;
		else
		{
			messages.put(message.getId(), message);
			return message;
		}	
	}
	public Message deleteMessage(long id) {
		if(messages.containsKey(id))
			return messages.remove(id);
		else
			return null;
		
	}
}
