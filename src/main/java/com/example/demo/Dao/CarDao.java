package com.example.demo.Dao;

import com.example.demo.Model.CarItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDao extends JpaRepository<CarItem, Long> {
}
