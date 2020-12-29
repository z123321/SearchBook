package com.fastsees.updategoodsprice;

import com.fastsees.updategoodsprice.javabeans.GoodsList;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class SearchBook {
    public static void main(String[] args) {
         HashMap<String,String>  booksMap=ReadCsv.getBooks();
         for(String isbn:booksMap.keySet()) {
             if (isbn != null) {
                 // GoodsList goodsList = gsonUtil(isbn);
                ArrayList<GoodsList.DataDTO.ItemListDTO> list= (ArrayList<GoodsList.DataDTO.ItemListDTO>) gsonUtil(isbn).getData().getItemList();
                for(int i=0;i<list.size();i++){
                    System.out.println("ISBN"+":"+isbn+"价格："+list.get(i).getPrice()+"书店名:"+list.get(i).getShopname());
                }
                Random random=new Random();
                int time= random.nextInt(280);
                 try {
                     Thread.sleep(time+150);
                 }catch (Exception e){
                     e.printStackTrace();
                 }
          }

      }
    //    System.out.println(getGooslist("9780205395101"));
         }
    private  static GoodsList gsonUtil(String isbn) {
        Gson gson=new Gson();
        GoodsList result=gson.fromJson(getGooslist(isbn), GoodsList.class);
        return result;
    }
    private static String getGooslist(String isbn) {
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL("http://search.kongfz.com/product_result/?ajaxdata=1&type=1&key="+isbn);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("contentType", "utf-8");
            conn.connect();
            in = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "gbk"));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result.toString();
//hihihi
    }
}