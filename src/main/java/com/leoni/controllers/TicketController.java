package com.leoni.controllers;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leoni.entities.Ticket;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import com.leoni.services.TicketService;
@RestController
@RequestMapping(value = "/parcInfo/tickets")
@CrossOrigin(origins = "*")
public class TicketController {
	 @Autowired
	    private TicketService ticketService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(ticketService.listAllTickets());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Tickets'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody Ticket ticket) {
	        try {
	            return new ParcInfoResult(ticketService.save(ticket));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'Ticket' "+ticket+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody Ticket ticket) {
	        try {
	            return new ParcInfoResult(ticketService.update(ticket));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'Ticket' "+ticket+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(Integer id) {
	        try {
	            ticketService.remove(id);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'Ticket' idTicket=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(Integer id) {
	        try {
	            return new ParcInfoResult(ticketService.getTicket(id));
	        } catch (Exception ex) {
	            logger.error("#Error get 'Ticket' idTicket=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }

}
