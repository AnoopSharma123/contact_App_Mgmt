package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public String deleteContact(int id) {
		repo.deleteById(id);
		return "SUCESS";
	}

	@Override
	public Contact getContact(int id) {
		Optional<Contact> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Contact> getAllContact() {
		return repo.findAll();
	}

	@Override
	public String upsert(Contact contact) {
		repo.save(contact);
		return "SUCCESS";
	};
}
