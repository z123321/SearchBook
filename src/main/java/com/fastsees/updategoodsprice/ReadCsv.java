package com.fastsees.updategoodsprice;

import java.io.*;
import java.util.HashMap;

public class ReadCsv {

    public static HashMap<String,String> getBooks()  {
        HashMap<String, String> booksMap=new HashMap();
        try {
            BufferedReader br=new BufferedReader(new FileReader("D:\\huinan.csv"));

            StringBuilder sb = new StringBuilder();
            int line=1;
            while ((line = br.read()) != -1){
            //    System.out.println(br.readLine());
                String  mLine=  br.readLine();
                String[] bookData=mLine.split(",");
                String isbn=("9"+bookData[0]).trim();
                String price=bookData[1];
                booksMap.put(isbn, price);
                line++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
        }
        return booksMap;
    }
}
