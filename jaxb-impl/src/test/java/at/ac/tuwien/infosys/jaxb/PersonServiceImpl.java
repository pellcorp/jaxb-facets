package at.ac.tuwien.infosys.jaxb;

import javax.jws.WebService;

import at.ac.tuwien.infosys.jaxb.test.TestRequest;

@WebService(endpointInterface = "at.ac.tuwien.infosys.jaxb.PersonService", 
serviceName = "PersonService", 
targetNamespace = "http://com.pellcorp/service/PersonService")
@SuppressWarnings("all")
public class PersonServiceImpl implements PersonService {
    public void save(Person data) {
    }

    public void foo(TestRequest r) {
    }

    public void save(Applicant data) {
    }
}
