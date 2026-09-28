package com.parking.client.repository;

import com.parking.client.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BillingRepository extends JpaRepository<Billing, UUID> {
}
