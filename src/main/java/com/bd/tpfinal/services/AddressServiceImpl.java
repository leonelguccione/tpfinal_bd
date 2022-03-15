package com.bd.tpfinal.services;

import com.bd.tpfinal.model.Address;
import com.bd.tpfinal.model.Client;
import com.bd.tpfinal.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService
{
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository)
    {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAAddressList()
    {
        return addressRepository.findAll();
    }

    @Override
    public void addAddress(Address newAddress)
    {
        this.addressRepository.save(newAddress);
    }

    @Override
    public List<Address> getAnAddressList()
    {
        return this.addressRepository.findAll();
    }

    @Override
    public List<Address> getAll()
    {
        return addressRepository.findAll();
    }







}