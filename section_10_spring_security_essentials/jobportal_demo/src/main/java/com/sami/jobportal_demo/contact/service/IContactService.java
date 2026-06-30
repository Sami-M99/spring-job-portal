package com.sami.jobportal_demo.contact.service;

import com.sami.jobportal_demo.contact.dto.ContactRequestDto;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
