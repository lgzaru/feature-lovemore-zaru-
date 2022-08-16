package com.api.econet.backendtask.business.shop;

import com.api.econet.backendtask.business.area.CreateAreaRepository;
import com.api.econet.backendtask.business.domain.Area;
import com.api.econet.backendtask.business.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*
 * Created 16/08/2022 - 12:06
 * Project locationManagementService
 * Author LG Zaru
 */
@Service
public class CreateShopServiceImpl implements CreateShopService {
    final CreateShopRepository repository;
    final CreateAreaRepository areaRepository;

    @Autowired
    public CreateShopServiceImpl(CreateShopRepository repository, CreateAreaRepository areaRepository) {
        this.repository = repository;
        this.areaRepository = areaRepository;
    }

    @Override
    public Shop insertShop(Shop shop, Long areaId) {
        boolean areaExist = areaRepository.existsById(Objects.requireNonNull(areaId, "Area doesnt exist"));
        if (areaExist) {
            Optional<Area> existingArea = areaRepository.findById(areaId);
            shop.setAreaName(existingArea.get().getAreaName());
            shop.setAreaId(areaId);
            repository.save(shop);
        }
        return shop;
    }

    public List<Shop> getAllShop(Long areaId) {
        return repository.findByAreaId(areaId);
    }

}
