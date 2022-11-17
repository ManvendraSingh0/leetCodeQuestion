public class DetectCapital520 {
    public static void main(String[] args) {
        String word="Google";
        if((isStringUpperCase(word))||isStringLowerCase(word)||Character.isUpperCase(word.charAt(0))&&isStringLowerCase(word.substring(1)))
        {
            System.out.println(true);
        }
        else
        System.out.println(false);
    }
    private static boolean isStringUpperCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
    
    private static boolean isStringLowerCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in upper case, return false
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
}
