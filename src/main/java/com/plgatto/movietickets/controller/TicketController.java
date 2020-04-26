package com.plgatto.movietickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {

	private static final String CREATE_TICKET_VIEW = "createTicket";

	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return CREATE_TICKET_VIEW;
	}
}
