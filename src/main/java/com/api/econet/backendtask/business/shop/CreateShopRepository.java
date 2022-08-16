package com.api.econet.backendtask.business.shop;

import com.api.econet.backendtask.business.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/*
 * Created 16/08/2022 - 12:05
 * Project locationManagementService
 * Author LG Zaru
 */
public interface CreateShopRepository extends JpaRepository<Shop, Long> {
    Optional<Shop> findById(Long id);
    List<Shop> findByAreaId(Long id);
}
