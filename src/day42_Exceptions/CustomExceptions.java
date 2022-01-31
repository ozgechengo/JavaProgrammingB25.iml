package day42_Exceptions;


class FaddyExceptions extends RuntimeException{
       public FaddyExceptions(String message){
       super(message);

}
}



class NoBreakException extends  Exception{

}
public class CustomExceptions {

    public static void main(String[] args)  {

       // throw new FaddyExceptions("iTS BREAK TIME " );
        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }}