package com.api.cvjuicer.services;

import com.api.cvjuicer.repositories.ActionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionLogService {

    @Autowired
    ActionLogRepository actionLogRepository;

}
