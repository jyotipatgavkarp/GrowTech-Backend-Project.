package com.agroproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.agroproject.model.User;
import com.agroproject.payload.UserProjection;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	@Query(value="select * from user" , nativeQuery = true)
	public List<UserProjection> getOnlyUser();

}
