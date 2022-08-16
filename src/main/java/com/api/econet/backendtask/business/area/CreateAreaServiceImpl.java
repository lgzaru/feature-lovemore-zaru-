package com.api.econet.backendtask.business.area;

import com.api.econet.backendtask.business.domain.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
 * Created 16/08/2022 - 12:06
 * Project locationManagementService
 * Author LG Zaru
 */
@Service
public class CreateAreaServiceImpl implements CreateAreaService {
    final CreateAreaRepository repository;

    @Autowired
    public CreateAreaServiceImpl(CreateAreaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Area createArea(Area area) {
        return repository.save(area);
    }

    @Override
    public Area insertShop(Area area, Long areaId) {
        Optional<Area> existingArea = repository.findById(areaId);
        if(existingArea.isPresent()){
            existingArea.get().setAreaName(area.getAreaName());
            repository.save(existingArea.get());
        }
        return area;
    }




}
