package com.plgatto.movietickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plgatto.movietickets.bo.TicketBO;
import com.plgatto.movietickets.dao.TicketDao;
import com.plgatto.movietickets.dao.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao ticketDao;
	
	@Override
	public void purchaseTicket(TicketBO ticketBO) {
		Ticket ticket = new Ticket(ticketBO.getMovie(), ticketBO.getScreen(), ticketBO.getSeat());
		ticketDao.create(ticket);
	}
}
