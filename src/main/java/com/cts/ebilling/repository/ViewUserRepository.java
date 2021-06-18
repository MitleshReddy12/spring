package com.cts.ebilling.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.cts.ebilling.model.ViewUser;
 
 
@Repository
public interface ViewUserRepository extends JpaRepository<ViewUser, Long> {
 
}