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

import com.leoni.entities.Phone;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import com.leoni.services.PhoneService;
@RestController
@RequestMapping(value = "/parcInfo/phones")
@CrossOrigin(origins = "*")
public class PhoneController {
	@Autowired
	 private PhoneService phoneService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(phoneService.listAllPhones());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Phones'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody Phone phone) {
	        try {
	            return new ParcInfoResult(phoneService.save(phone));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'Phone' "+phone+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody Phone phone) {
	        try {
	            return new ParcInfoResult(phoneService.update(phone));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'Phone' "+phone+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(Integer id) {
	        try {
	            phoneService.remove(id);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'Phone' idPhone=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(Integer id) {
	        try {
	            return new ParcInfoResult(phoneService.getPhone(id));
	        } catch (Exception ex) {
	            logger.error("#Error get 'Phone' idPhone=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }		    
}