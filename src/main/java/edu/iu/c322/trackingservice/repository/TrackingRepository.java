package edu.iu.c322.trackingservice.repository;

import edu.iu.c322.trackingservice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingRepository extends JpaRepository<Invoice,Integer> {
}
