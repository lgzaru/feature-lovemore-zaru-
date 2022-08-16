package com.api.econet.backendtask.business.area;

import com.api.econet.backendtask.business.domain.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * Created 16/08/2022 - 12:09
 * Project locationManagementService
 * Author LG Zaru
 */
@RestController
@RequestMapping("/api/econet")
public class CreateAreaController {

    final CreateAreaServiceImpl service;

    @Autowired
    public CreateAreaController(CreateAreaServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/createArea")
    Area createArea(@RequestBody Area area) {
        return service.createArea(area);
    }

    @PutMapping("/insertShop/{areaId}")
    Area insertShop(@RequestBody Area area, @PathVariable("areaId") Long areaId) {
        return service.insertShop(area, areaId);
    }

}
