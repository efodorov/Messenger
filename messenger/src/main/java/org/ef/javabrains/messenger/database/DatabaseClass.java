package org.ef.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.ef.javabrains.messenger.model.Message;
import org.ef.javabrains.messenger.model.Profile;


public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public  static Map<Long, Message> getMessages() {
		return messages;
	}
		
	public static  Map<Long, Profile> getProfiles() {
		return profiles;
	
	}
}
