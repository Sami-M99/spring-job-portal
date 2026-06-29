package com.sami.jobportal_demo.contact.repository;

import com.sami.jobportal_demo.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}