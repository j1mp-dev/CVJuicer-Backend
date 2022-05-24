package com.api.cvjuicer.controllers;

import com.api.cvjuicer.dtos.HtmlToPdfRequest;
import com.api.cvjuicer.models.CvModel;
import com.api.cvjuicer.services.CvModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@RequestMapping("/cvmodel")
public class CvModelController {

    @Autowired
    CvModelService cvModelService;

    @PostMapping(value="/htmlToPdf")
    public ResponseEntity htmlToPdf(@RequestBody @Valid HtmlToPdfRequest html) {
        CvModel cvModel = new CvModel();
        cvModel.setCreatedAt(LocalDateTime.now(ZoneId.of("WET")));
        cvModel.setContent(html.getHtml());
        cvModel.setVisible(true);
        cvModelService.save(cvModel);
        return ResponseEntity.status(HttpStatus.OK).body("It worked!");
    }

}
