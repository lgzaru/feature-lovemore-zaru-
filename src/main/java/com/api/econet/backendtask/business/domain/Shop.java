package com.api.econet.backendtask.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
 * Created 16/08/2022 - 11:47
 * Project locationManagementService
 * Author LG Zaru
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "area_seq")
    private Long id;

    @Column(unique = true)
    private String shopName;
    //@OneToMany
    //@JoinColumn(name = "id")
    private String areaName;
    private Long areaId;
    private LocalDateTime createdDate;


    @PrePersist
    private void initializeDate (){
        if(createdDate == null){
            createdDate = LocalDateTime.now();
        }
    }

}
