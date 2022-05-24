package com.api.cvjuicer.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.extend.FontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

public class HtmlConversion {

    private static String htmlToXhtml(String html) {
        Document document = Jsoup.parse(html);
        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        return document.html();
    }

    private static void xhtmlToPdf(String xhtml, String outFileName) throws IOException {
        File output = new File(outFileName);
        ITextRenderer iTextRenderer = new ITextRenderer();
        iTextRenderer.setDocumentFromString(xhtml);
        iTextRenderer.layout();
        OutputStream os = new FileOutputStream(output);
        iTextRenderer.createPDF(os);
        os.close();
    }

    private static String htmlFileToString(String path) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
            contentBuilder.append(str);
        }
        in.close();
        return contentBuilder.toString();
    }

    public static void htmlToPdf(String html) throws IOException {
        ITextRenderer iTextRenderer = new ITextRenderer();
        FontResolver resolver = iTextRenderer.getFontResolver();
        iTextRenderer.getFontResolver().addFont("Roboto-Bold.ttf", true);
        //String html = htmlFileToString("example.html");
        System.out.println("\n\n\n\n yeah \n\n\n\n" + html);
        String xhtml = htmlToXhtml(html);
        xhtmlToPdf(xhtml, "output.pdf");
    }

}
