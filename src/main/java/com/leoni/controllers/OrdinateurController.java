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
import com.leoni.entities.Ordinateur;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import com.leoni.services.OrdinateurService;

@RestController
@RequestMapping(value = "/parcInfo/ordinateurs")
@CrossOrigin(origins = "*")
public class OrdinateurController {
	 @Autowired
	    private OrdinateurService ordinateurService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(ordinateurService.listAllOrdinateurs());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Ordinateurs'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody Ordinateur ordinateur) {
	        try {
	            return new ParcInfoResult(ordinateurService.save(ordinateur));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'Ordinateur' "+ordinateur+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody Ordinateur ordinateur) {
	        try {
	            return new ParcInfoResult(ordinateurService.update(ordinateur));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'Ordinateur' "+ordinateur+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(String nomOrd) {
	        try {
	            ordinateurService.remove(nomOrd);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'Ordinateur' nomOrd=" + nomOrd + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(String nomOrd) {
	        try {
	            return new ParcInfoResult(ordinateurService.getOrdinateur(nomOrd));
	        } catch (Exception ex) {
	            logger.error("#Error get 'Ordinateur' nomOrd=" + nomOrd + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }	       
}