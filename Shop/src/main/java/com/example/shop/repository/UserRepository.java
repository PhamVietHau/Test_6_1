package com.example.shop.repository;

import com.example.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
 User findByUserName(String name);

 @Query(value = "select userName, role from user,role where user.id=role.id and userName = ''",nativeQuery = true)
 public List<User> findByUserName1(String name);


}
