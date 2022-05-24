package com.api.cvjuicer.repositories;

import com.api.cvjuicer.models.CvModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CvModelRepository extends JpaRepository<CvModel, UUID> {
}
