package com.bd.tpfinal.services;

import com.bd.tpfinal.model.Client;
import com.bd.tpfinal.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService
{

    private final ClientRepository clientRepository;

    //Este constructor recibe un personRepository
    //PersonRepository es una interfaz que extiende de JpaRepository.
    //El framework se encarga de crear la clase que implementa ClientRepository y el objeto.

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository)
    {
        this.clientRepository = clientRepository;
    }

    public void addClient(Client newClient)
    {
        clientRepository.save(newClient);
    }

    public List<Client> getAClientList()
    {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> getAll()
    {
        return clientRepository.findAll();
    }

    @Override
    public Client getClient(String username, String password)
    {
        //return this.clientRepository.get;
        return null;
    }
}