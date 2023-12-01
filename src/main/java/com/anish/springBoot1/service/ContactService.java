package com.anish.springBoot1.service;

import com.anish.springBoot1.model.Contact;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
//import java.util.logging.Logger;

@Slf4j
@Service
public class ContactService {


    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        /* ToDo: Need to persist the data into the DB Table */

        log.info(contact.toString());
        return isSaved;
    }
}
