package tech.saswat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tech.saswat.entity.AppMember;

@Repository
public interface AppMemberRepository extends CrudRepository<AppMember, Integer> {
	
	AppMember findByUnameAndPasswordAndProgram(String uname, String password, String program);
}
