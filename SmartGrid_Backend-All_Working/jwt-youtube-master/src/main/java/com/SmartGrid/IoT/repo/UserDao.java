package com.SmartGrid.IoT.repo;

import com.SmartGrid.IoT.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
