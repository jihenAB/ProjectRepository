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

import com.leoni.entities.Imprimante;
import com.leoni.utils.ParcInfoResult;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import com.leoni.services.ImprimanteService;
@RestController
@RequestMapping(value = "/parcInfo/imprimantes")
@CrossOrigin(origins = "*")
public class ImprimanteController {
	@Autowired
	 private ImprimanteService imprimanteService;

	    Logger logger = LoggerFactory.getLogger(this.getClass());
	    @RequestMapping(value = "/listAll", method = GET)
	    public ParcInfoResult list() {
	        try {
	            return new ParcInfoResult(imprimanteService.listAllImprimantes());
	        } catch (Exception ex) {
	            logger.error("#Error listing 'Imprimantes'", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }	
	    
	    @RequestMapping(value = "/add", method = POST)
	    public ParcInfoResult add(@RequestBody Imprimante imprimante) {
	        try {
	            return new ParcInfoResult(imprimanteService.save(imprimante));
	        } catch (Exception ex) {
	            logger.error("#Error adding 'Imprimante' "+imprimante+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }  
	    
	    @RequestMapping(value = "/update", method = PUT)
	    public ParcInfoResult update(@RequestBody Imprimante imprimante) {
	        try {
	            return new ParcInfoResult(imprimanteService.update(imprimante));
	        } catch (Exception ex) {
	            logger.error("#Error updating 'Imprimante' "+imprimante+":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/remove", method = DELETE)
	    public ParcInfoResult remove(Integer id) {
	        try {
	            imprimanteService.remove(id);
	            return new ParcInfoResult(true);
	        } catch (Exception ex) {
	            logger.error("#Error removing 'Imprimante' idImpr=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }
	    
	    @RequestMapping(value = "/get", method = GET)
	    public ParcInfoResult get(Integer id) {
	        try {
	            return new ParcInfoResult(imprimanteService.getImprimante(id));
	        } catch (Exception ex) {
	            logger.error("#Error get 'Imprimante' idImpr=" + id + ":", ex.getMessage());
	            return new ParcInfoResult(ex);
	        }
	    }	
}