package com.api.cvjuicer.controllers;

import com.api.cvjuicer.dtos.HtmlToPdfRequest;
import com.api.cvjuicer.utils.HtmlConversion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping("/cv")
public class CvController {

    @PostMapping(value="/htmlToPdf")
    public ResponseEntity htmlToPdf(@RequestBody @Valid HtmlToPdfRequest html) {
        try {
            HtmlConversion.htmlToPdf(html.getHtml());
            return ResponseEntity.status(HttpStatus.OK).body("It worked!");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }



}
