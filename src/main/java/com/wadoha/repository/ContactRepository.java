package com.wadoha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wadoha.model.Contact;

@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact, Long> {	
}
