package com.SmartGrid.IoT.service;

import com.SmartGrid.IoT.repo.RoleDao;
import com.SmartGrid.IoT.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
