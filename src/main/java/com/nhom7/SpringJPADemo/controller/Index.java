package com.nhom7.SpringJPADemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhom7.SpringJPADemo.service.PhanTichSo;

@Controller
public class Index {
	@Autowired
	PhanTichSo phanTichSo;


	@PostMapping("/calc")
	@ResponseBody
	public Map<Integer, Integer> phanTichThanhThuaSoNguyenTo(@RequestBody Map<String, Integer> body) {
		return phanTichSo.phanTichThanhThuaSoNguyenTo(body.get("n"));
	}
}
