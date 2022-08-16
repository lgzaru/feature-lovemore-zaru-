package com.api.econet.backendtask.business.shop;

import com.api.econet.backendtask.business.domain.Area;
import com.api.econet.backendtask.business.domain.Shop;

/*
 * Created 16/08/2022 - 12:03
 * Project locationManagementService
 * Author LG Zaru
 */
public interface CreateShopService {
    Shop insertShop(Shop shop, Long areaId);
}
