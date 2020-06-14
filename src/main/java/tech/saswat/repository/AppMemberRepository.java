package tech.saswat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import tech.saswat.entity.AppMember;

public interface AppMemberRepository extends CrudRepository <AppMember, Integer> {
	
	AppMember findByUnameAndPasswordAndProgram(String uname, String password, String program);
}
