package com.jimplush.goose;

import java.io.*;

/**
 * Created by Idan Rufeisen for OWOW using Goose
 * Date: 17/08/13
 */
public class Main {

  public static void main(String[] args) {
	  
	  System.out.println("Start");
	  
    try {
      String url = args[0];
      
      FileReader fr = new FileReader("pref.txt");
      BufferedReader br = new BufferedReader(fr);
      String localStorage = br.readLine(), imageMagick = br.readLine(),
    		  line = br.readLine();
      Boolean save=true,all=true,css=true;
      if(line.compareToIgnoreCase("save=false") == 0 )
    	  save = false;
      line = br.readLine();
      if(line.compareToIgnoreCase("all=false") == 0 )
    	  all = false;
      line = br.readLine();
      if(line.compareToIgnoreCase("css=false") == 0 )
    	  css = false;
      Configuration config = new Configuration(localStorage,imageMagick,save,all,css);
      br.close();

      ContentExtractor contentExtractor = new ContentExtractor(config);
      Article article = contentExtractor.extractContent(url);
      String image = article.getTopImage().getImageSrc();
      if(image!=null)
      {
    	  System.out.println("Found image:");
    	  System.out.println(article.getTopImage().getImageSrc());
    	  if(save)
        	  System.out.println("Saved image at specified location");
      }
      else
      {
    	  System.out.println("Didn't find image, closest site description:");
    	  System.out.println(article.getCleanedArticleText());
    	  if(save)
        	  System.out.println("Saved description at specified location");
      }

    } catch (Exception e) {
      System.out.println("Make sure you pass in a valid URL and have correct pref.txt");
    }
    
    System.out.println("Done");

  }

}
