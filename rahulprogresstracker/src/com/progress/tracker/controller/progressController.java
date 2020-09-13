package com.progress.tracker.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.progress.tracker.entity.Progress;
import com.progress.tracker.service.ProgressService;

@Controller
@RequestMapping("/progress")
public class progressController {

	@Autowired
	private ProgressService progressService;
	
//	@GetMapping("/list/{page}")
//	public ModelAndView listProgressByPage(@PathVariable("page") int page) {
//		ModelAndView modelAndView = new ModelAndView("list-progress");
//		PageRequest pageable = PageRequest.of(page - 1, 15);
//		
//		return modelAndView;
//		
//	}
	
	@GetMapping("/list")
	public String ListProgress(Model theModel)
	{
		List<Progress> progress_list = progressService.getProgressList();
		
		
		Map<Integer, String> durationMap = new HashMap<>();
		
		for(Progress progress : progress_list) {
			
			long duration = progress.getDuration();
			
			int min = (int) duration/(60*1000);
			int rem = (int) duration%(60*1000);
			int sec = rem%1000;
			
			String strDuration = (min + "m " + sec + "s");
			Integer id = progress.getId();
			
			durationMap.put(id, strDuration);
			
			progress.setDuration(duration);
		}
		
		theModel.addAttribute("progresslist", progress_list);
		theModel.addAttribute("map", durationMap);
		
		return "list-progress";
	}
}
