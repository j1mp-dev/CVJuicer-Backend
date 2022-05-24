package com.api.cvjuicer.repositories;

import com.api.cvjuicer.models.ActionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActionLogRepository extends JpaRepository<ActionLog, UUID> {
}
