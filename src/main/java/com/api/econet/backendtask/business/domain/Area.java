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
public class Area {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "area_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    private String areaName;
    private LocalDateTime createdDate;


    @PrePersist
    private void initializeDate (){
        if(createdDate == null){
            createdDate = LocalDateTime.now();
        }
    }

}
