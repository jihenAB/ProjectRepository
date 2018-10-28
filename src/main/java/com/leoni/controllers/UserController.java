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
import com.leoni.entities.User;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import com.leoni.services.UserService;

@RestController
@RequestMapping(value = "/parcInfo/users")
@CrossOrigin(origins = "*")
public class UserController {
	 @Autowired
	    private UserService userService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(userService.listAllUsers());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Annonces'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody User user) {
	        try {
	            return new ParcInfoResult(userService.save(user));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'User' "+user+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }

	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody User user) {
	        try {
	            return new ParcInfoResult(userService.update(user));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'User' "+user+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(Integer id) {
	        try {
	            userService.remove(id);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'User' idUser=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	 
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(Integer id) {
	        try {
	            return new ParcInfoResult(userService.getUser(id));
	        } catch (Exception ex) {
	            logger.error("#Error get 'User' idUser=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
}