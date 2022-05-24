package com.api.cvjuicer.services;

import com.api.cvjuicer.models.CvModel;
import com.api.cvjuicer.repositories.CvModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CvModelService {

    @Autowired
    CvModelRepository cvModelRepository;

    @Transactional
    public CvModel save(CvModel cvm) {
        return cvModelRepository.save(cvm);
    }

}
