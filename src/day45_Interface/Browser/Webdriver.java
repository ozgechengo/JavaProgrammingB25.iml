package day45_Interface.Browser;

public  interface Webdriver extends SearchContext {





     void get(String url);

    void  close();
    void quit();
    void getTitle();




}
