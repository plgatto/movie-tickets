package com.plgatto.movietickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plgatto.movietickets.bo.TicketBO;
import com.plgatto.movietickets.service.TicketService;

@Controller
public class TicketController {

	private static final String CREATE_TICKET_VIEW = "createTicket";

	@Autowired
	TicketService ticketService;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return CREATE_TICKET_VIEW;
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(TicketBO ticketBO, ModelMap modelMap) {
		ticketService.purchaseTicket(ticketBO);
		modelMap.addAttribute("msg", "Ticket purchased successfully");
		return CREATE_TICKET_VIEW;
	}
}
