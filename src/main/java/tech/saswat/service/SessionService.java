package tech.saswat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.saswat.entity.AppMember;
import tech.saswat.model.MemberAuthenticationResponse;
import tech.saswat.repository.AppMemberRepository;

@Service
public class SessionService {

	@Autowired
	private AppMemberRepository appMemberRepo;
	
	
	public MemberAuthenticationResponse appMemberLogin(AppMember appMember) {
		
		//appMember = null;
		
		AppMember member = appMemberRepo.findByUnameAndPasswordAndProgram(appMember.getUname(), appMember.getPassword(), appMember.getProgram());
		MemberAuthenticationResponse maResponse = new MemberAuthenticationResponse(member);
		
		System.out.println("AppMember is: "+maResponse);
		
		return maResponse;
		
		
	}
}
