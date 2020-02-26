package tech.saswat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.saswat.entity.AppMember;
import tech.saswat.model.MemberAuthenticationResponse;
import tech.saswat.service.SessionService;

@RestController
@RequestMapping("/session")
public class SessionController {

	@Autowired
	SessionService sessionService;
	
	@GetMapping("/test")
	public String test() {
		System.out.println("Testing ...");
		return "Test result successful!";
	}
	
	@PostMapping("/login")
	public ResponseEntity<MemberAuthenticationResponse> appMemberLogin(@RequestBody AppMember appMember) {
		
		System.out.println(appMember);
		return new ResponseEntity<MemberAuthenticationResponse>(sessionService.appMemberLogin(appMember), HttpStatus.OK);
	}
	
}
