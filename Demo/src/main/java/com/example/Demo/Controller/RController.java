package com.example.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.FetchNextNumber;
import com.example.Demo.Service.FetchService;

@RestController
@RequestMapping("/FetchNextNumber")
public class RController {

	private FetchService fs;
	
	@Autowired
	public RController(FetchService fetchser)
	{
		fs=fetchser;
	}
	
	@GetMapping("/{CategoryCode}")
	public FetchNextNumber getAll(@PathVariable int CategoryCode)
	{
		FetchNextNumber fg=new FetchNextNumber();
		fg.setCategoryCode(CategoryCode);
		//fg.setOldvalue(9);
		fs.Save(fg);
		
		FetchNextNumber fnnum=fs.GetConcode(CategoryCode);
		return fnnum;
				
	}
}
