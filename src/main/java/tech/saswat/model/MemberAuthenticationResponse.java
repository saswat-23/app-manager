package tech.saswat.model;

import java.util.UUID;

import tech.saswat.entity.AppMember;

public class MemberAuthenticationResponse {

	private String authToken;
	private boolean isAuthenticated;
	private AppMember appMember;
	
	public MemberAuthenticationResponse(AppMember appMember) {

		try {
			if(appMember.getStatus().equalsIgnoreCase("active")) {
				this.appMember = appMember;
				this.isAuthenticated = true;
				this.authToken = UUID.randomUUID().toString();
				return;
			}
		}
		catch(NullPointerException npe) {}
		
		this.appMember = null;
		this.isAuthenticated = false;
		this.authToken = null;
	}
	
	public String getAuthToken() {
		return authToken;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public AppMember getAppMember() {
		return appMember;
	}

	@Override
	public String toString() {
		return "MemberAuthenticationResponse [authToken=" + authToken + ", isAuthenticated=" + isAuthenticated
				+ ", appMember=" + appMember + "]";
	}
	
	
	
}
