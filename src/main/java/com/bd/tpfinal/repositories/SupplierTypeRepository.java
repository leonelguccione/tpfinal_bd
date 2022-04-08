package com.bd.tpfinal.repositories;

import com.bd.tpfinal.model.SupplierType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierTypeRepository extends JpaRepository<SupplierType, Long>
{
}