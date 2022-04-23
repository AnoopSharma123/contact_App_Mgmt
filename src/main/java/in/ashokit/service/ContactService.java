package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {
   String deleteContact(int id);
   Contact getContact(int id);
   List<Contact> getAllContact();
   String upsert(Contact contact);
}
