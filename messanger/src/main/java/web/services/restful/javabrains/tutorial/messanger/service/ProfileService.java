package web.services.restful.javabrains.tutorial.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import web.services.restful.javabrains.tutorial.messanger.database.DataBaseClass;
import web.services.restful.javabrains.tutorial.messanger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles;
	
	public ProfileService() {
		profiles=DataBaseClass.getProfile();
		profiles.put("Ravi", new Profile(1l, "Ravi", "Ravi", "Tejha"));
		
	}
	
	public List<Profile> getAllProfiles() {
		System.out.println("Profiles "+new ArrayList<Profile>(profiles.values()));
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		if(profiles.containsKey(profileName))
				return profiles.get(profileName);
		return null;
	}
	
	public Profile addProfile(Profile profile) {
		
		profile.setId(profiles.size()+1L);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	public Profile updateProfile(Profile profile) {
		if(profiles.containsKey(profile.getProfileName()))
			return profiles.put(profile.getProfileName(), profile);
		return null;
	}
	public Profile deleteProfile(String	 profileName) {
		if(profiles.containsKey(profileName))
			return profiles.remove(profileName);
		return null;
	}
}
