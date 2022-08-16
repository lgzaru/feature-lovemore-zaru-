package com.api.econet.backendtask.business.shop;

import com.api.econet.backendtask.business.domain.Area;
import com.api.econet.backendtask.business.domain.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Created 16/08/2022 - 12:09
 * Project locationManagementService
 * Author LG Zaru
 */
@RestController
@RequestMapping("/api/econet")
public class CreateShopController {

    final CreateShopServiceImpl service;

    @Autowired
    public CreateShopController(CreateShopServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/insertShop/{areaId}")
    Shop insertShop(@RequestBody Shop shop, @PathVariable("areaId") Long areaId) {
        return service.insertShop(shop, areaId);
    }

    @GetMapping("/getAllShops/{areaId}")
    public List<Shop> getAllShops(@PathVariable("areaId") Long areaId) {
        return service.getAllShop(areaId);

    }

}
