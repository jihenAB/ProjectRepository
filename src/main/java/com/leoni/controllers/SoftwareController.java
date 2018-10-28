package com.leoni.controllers;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leoni.entities.Software;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import com.leoni.services.SoftwareService;
@RestController
@RequestMapping(value = "/parcInfo/softwares")
@CrossOrigin(origins = "*")
public class SoftwareController {
	@Autowired
	 private SoftwareService softwareService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(softwareService.listAllSoftwares());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Softwares'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody Software software) {
	        try {
	            return new ParcInfoResult(softwareService.save(software));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'Software' "+software+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }  
	    
	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody Software software) {
	        try {
	            return new ParcInfoResult(softwareService.update(software));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'Software' "+software+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(Integer id) {
	        try {
	            softwareService.remove(id);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'Software' idSoft=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(Integer id) {
	        try {
	            return new ParcInfoResult(softwareService.getSoftware(id));
	        } catch (Exception ex) {
	            logger.error("#Error get 'Software' idSoft=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }	
}
