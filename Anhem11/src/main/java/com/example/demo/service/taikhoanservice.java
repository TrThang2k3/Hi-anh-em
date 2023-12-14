package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.taikhoanentity;

@Service
public interface taikhoanservice {
	public List<taikhoanentity> findAll();
	public theloaientity findById(String email);

}
