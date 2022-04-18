package com.SmartGrid.IoT.repo;

import com.SmartGrid.IoT.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
