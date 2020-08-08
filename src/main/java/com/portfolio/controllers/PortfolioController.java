package com.portfolio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.models.Portfolio;



@RestController
@RequestMapping("/PortFolioService")
public class PortfolioController {
	@RequestMapping("/{pfId}")
	public Portfolio getUserById(@PathVariable("pfId") int pfId) {
		List<Portfolio> pfList = new ArrayList<Portfolio>();
		List<String> holdlist = new ArrayList<String>();
		holdlist.add("2");holdlist.add("1");
		pfList.add(new Portfolio(1,holdlist,10000,400,1));
		pfList.add(new Portfolio(2,holdlist,39000,200,2));
		pfList.add(new Portfolio(3,holdlist,48000,300,3));
		Portfolio pflio = pfList.stream().filter(pf -> pfId == pf.getPfId()).findAny().orElse(null);
		return pflio;
		}
}
