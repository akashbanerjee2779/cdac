package com.example.demo.entity.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="m_sample")
public class Sample {

    @Id
    Integer sys_sample_id;

   /* CREATE TABLE `m_sample` (
            `sys_sample_id` INT NOT NULL AUTO_INCREMENT,
  `icmr_sample_id` VARCHAR(40) NOT NULL,
  `collection_date` DATETIME NOT NULL,
            `state_id` INT NOT NULL,
            `district_id` INT NOT NULL,
            `supercategory_id` INT DEFAULT NULL,
            `sample_category_id` INT NOT NULL,
            `sample_subcategory_id` INT NOT NULL,
            `sample_other_info` LONGTEXT,
            `place_of_collection_id` INT NOT NULL,
            `contact_name` VARCHAR(50) NOT NULL,
  `contact_address` LONGTEXT NOT NULL,
            `contact_phone` VARCHAR(11) DEFAULT NULL,
  `handwash_avilability` VARCHAR(100) NOT NULL,
  `handwash_facility_desc` LONGTEXT,
            `handwash_facility_frequency` VARCHAR(30) NOT NULL,
  `cutting_nail` VARCHAR(3) NOT NULL,
  `personal_hyg` VARCHAR(3) NOT NULL,
  `mkt_cleaned` VARCHAR(50) NOT NULL,
  `mkt_clean_frequency` VARCHAR(100) DEFAULT NULL,
  `mkt_zoned` VARCHAR(15) NOT NULL,
  `cold_storage_mkt` VARCHAR(3) NOT NULL,
  `food_expose` VARCHAR(3) NOT NULL,
  `overall_clean_mkt` VARCHAR(3) DEFAULT NULL,
  `vendor_handwash` VARCHAR(3) NOT NULL,
  `clean_washdish` VARCHAR(3) NOT NULL,
  `immediate_env` TEXT NOT NULL,
            `food_cover` VARCHAR(3) NOT NULL,
  `food_expose_flies` VARCHAR(3) NOT NULL,
  `food_ground_level` VARCHAR(3) NOT NULL,
  `food_source` VARCHAR(100) DEFAULT NULL,
  `cold_storage_oth_mkt` VARCHAR(25) NOT NULL,
  `preservation_time` VARCHAR(30) NOT NULL,
  `overall_clean_oth` VARCHAR(3) NOT NULL,
  `updated_by` INT DEFAULT NULL,
            `updated_time` DATETIME DEFAULT NULL,
            `aprroved_by` INT DEFAULT NULL,
            `approved_date` DATE DEFAULT NULL,
            `aproved_status` VARCHAR(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'Submitted',
            `rejection_reason` TEXT,
    PRIMARY KEY (`sys_sample_id`),
    UNIQUE KEY `id_smaple_UNIQUE` (`sys_sample_id`),
    UNIQUE KEY `icmr_sample_id_UNIQUE` (`icmr_sample_id`),
    KEY `fk_m_sample_place_of_collection` (`place_of_collection_id`),
    KEY `fk_m_sample_state_id` (`state_id`),
    KEY `fk_m_sample_category` (`sample_category_id`),
    KEY `fk_m_sample_subcategory_id` (`sample_subcategory_id`),
    KEY `m_sample_district` (`district_id`),
    KEY `Index_msample` (`sys_sample_id`,`icmr_sample_id`,`state_id`,`district_id`,`sample_category_id`,`sample_subcategory_id`,`place_of_collection_id`),
    CONSTRAINT `fk_m_sample_category` FOREIGN KEY (`sample_category_id`) REFERENCES `m_sample_category` (`sample_category_id`),
    CONSTRAINT `fk_m_sample_place_of_collection` FOREIGN KEY (`place_of_collection_id`) REFERENCES `m_market` (`market_id`),
    CONSTRAINT `fk_m_sample_state_id` FOREIGN KEY (`state_id`) REFERENCES `m_state` (`state_id`),
    CONSTRAINT `fk_m_sample_subcategory_id` FOREIGN KEY (`sample_subcategory_id`) REFERENCES `m_sample_subcategory` (`sample_subcategory_id`),
    CONSTRAINT `m_sample_district` FOREIGN KEY (`district_id`) REFERENCES `m_district` (`district_id`)
            ) ENGINE=INNODB AUTO_INCREMENT=14556 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;*/

}
