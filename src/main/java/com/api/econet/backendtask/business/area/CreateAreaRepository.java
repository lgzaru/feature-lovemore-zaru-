package com.api.econet.backendtask.business.area;

import com.api.econet.backendtask.business.domain.Area;
import com.api.econet.backendtask.business.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
 * Created 16/08/2022 - 12:05
 * Project locationManagementService
 * Author LG Zaru
 */
public interface CreateAreaRepository extends JpaRepository<Area, Long> {
    Optional<Area> findById(Long id);
}
