package com.api.cvjuicer.dtos;

import javax.validation.constraints.NotNull;

public class HtmlToPdfRequest {

    @NotNull
    String html;

    public HtmlToPdfRequest() {
    }

    public HtmlToPdfRequest(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "HtmlToPdfRequest{" +
                "html='" + html + '\'' +
                '}';
    }
}
