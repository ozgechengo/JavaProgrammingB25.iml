package day11_Switch_Scanner;

public class Protocol {
    public static void main(String[] args) {
        int  number = 121231;
        String statusCode = "";
        switch (number) {

            case 200:
                statusCode="OK";
                break ;
            case 201 :
                statusCode="Created";
            case 202:
                statusCode="Accepted";
                break ;
            case 301:
                statusCode="Moved Permanently";
                break ;
            case 303:
                statusCode="See Other";
                break ;
            case 304:
                statusCode="Not Modified";
                break ;
            case 307:
                statusCode="Temporary Redirect";
                break ;
            case 400:
                statusCode="Bad Request";
                break ;
            case 401:
                statusCode="Unothorized";
                break ;
            case 403:
                statusCode="Forbidden";
                break ;
            case 404:
                statusCode="Not Found";
                break ;
            case 410:
                statusCode="Gone";
                break ;
            case 500:
                statusCode="Gone";
                break ;
            case 503:
                statusCode="Service Unavailable";
                break ;

            default:
                statusCode="INVALID NUMBER" ;}
        System.out.println(statusCode);}}
