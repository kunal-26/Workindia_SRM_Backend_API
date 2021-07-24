package com.nishkarsh.restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishkarsh.restapi.model.Credentials;
@Repository
public interface ManagerRepo extends JpaRepository<Credentials, String> {
}