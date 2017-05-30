package com.wadoha.controller;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wadoha.model.Contact;
import com.wadoha.repository.ContactRepository;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;
    
	@RequestMapping(value = "contact", method = RequestMethod.GET)
	Page<Contact> contactPageable(Pageable pageable) {
		return contactRepository.findAll(pageable);
	}
    
    @RequestMapping(value = "contact", method=RequestMethod.POST)
    public Contact create(@RequestBody Contact contact){
        return contactRepository.saveAndFlush(contact);
    }

    @RequestMapping(value = "contact/{id}", method = RequestMethod.DELETE)
    public Contact delete(@PathVariable Long id) {
        Contact existingContact = contactRepository.findOne(id);
        contactRepository.delete(existingContact);
        return existingContact;
    }

    @RequestMapping(value = "contact/{id}", method = RequestMethod.GET)
    public Contact get(@PathVariable Long id) {
        return contactRepository.findOne(id);
        
    }

    @RequestMapping(value = "contact/all", method = RequestMethod.GET)
    public List<Contact> list() {
    	return contactRepository.findAll();
    }

    @RequestMapping(value = "contact/{id}", method = RequestMethod.PUT)
    public Contact update(@PathVariable Long id, @RequestBody Contact contact) {
        Contact existingContact = contactRepository.findOne(id);
        BeanUtils.copyProperties(contact, existingContact);
        return contactRepository.saveAndFlush(existingContact);
    }

}
