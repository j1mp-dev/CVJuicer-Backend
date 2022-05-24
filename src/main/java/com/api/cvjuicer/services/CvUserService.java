package com.api.cvjuicer.services;

import com.api.cvjuicer.repositories.CvUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CvUserService {

    @Autowired
    CvUserRepository cvUserRepository;

}
