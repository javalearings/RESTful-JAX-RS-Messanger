package web.services.restful.javabrains.tutorial.messanger.database;

import java.util.HashMap;
import java.util.Map;

import web.services.restful.javabrains.tutorial.messanger.model.Message;
import web.services.restful.javabrains.tutorial.messanger.model.Profile;

public class DataBaseClass {
	
	public static Map <Long, Message> messages= new HashMap<Long,Message>(); 
	public static Map <String,Profile> profiles= new HashMap<String,Profile>();
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfile() {
		return profiles;
	}
	
	
}
