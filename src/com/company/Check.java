package com.company;
import java.io.IOException;
import com.itextpdf.text.pdf.PdfReader;

public class Check {

    public static boolean damaged(String pfad) {

        try
        {
            PdfReader pdfReader = new PdfReader(pfad);
            pdfReader.close();
            return false;
        }
        catch (IOException e)
        {
            return true;
        }
    }
}
