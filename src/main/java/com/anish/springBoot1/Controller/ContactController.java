package com.anish.springBoot1.Controller;

import com.anish.springBoot1.model.Contact;
import com.anish.springBoot1.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {

    //private static Logger log = LoggerFactory.getLogger((ContactController.class));

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @RequestMapping("/contact")
    public String displayContactPage(){
        return "contact.html";
    }

    /*
    @RequestMapping(value = "/saveMsg", method = POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email,
                                    @RequestParam String subject)
    {
        log.info("Name: " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Id: " + email);
        log.info("Subject: " + subject);

      return new ModelAndView("redirect:/contact");
    }
    */

    @RequestMapping(value = "/saveMsg", method = POST)
    public ModelAndView saveMessage(Contact contact)
    {
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }


}
