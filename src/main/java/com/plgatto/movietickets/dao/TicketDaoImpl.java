package com.plgatto.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.plgatto.movietickets.dao.models.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {

	private static final String INSERT_TICKET_SQL = "insert into ticket (movie, screen, seat) values (?, ?, ?)";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Ticket ticket) {
		jdbcTemplate.update(INSERT_TICKET_SQL, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
	}
}
