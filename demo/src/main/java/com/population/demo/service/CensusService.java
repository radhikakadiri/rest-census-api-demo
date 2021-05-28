package com.population.demo.service;

import com.population.demo.model.Country;
import com.population.demo.model.State;
import com.population.demo.repository.CountryRepository;
import com.population.demo.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class CensusService {
    @Autowired
    private StateRepository stateRepository;
    private CountryRepository countryRepository;
    //private StateRepository stateRepository;
    public List<Country> listAllCountries() {
        return countryRepository.findAll();
    }
 
    //public void addState(country_cd, state_cd, state_name, state_population)
    public void addState(State state) {
    	System.out.println("IA m here in adding state");
    	stateRepository.save(state);
    }
    
    
    
    /* getAllCountryPopulations()
     * getAllCountryCurrencies()
     * validateState(country_code, state_code)
     * addState(country_cd, state_cd, state_name, state_population)
     */
     
    
    /*public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }*/
    
    
}
