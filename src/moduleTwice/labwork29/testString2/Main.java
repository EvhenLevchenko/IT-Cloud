package moduleTwice.labwork29.testString2;

public class Main {
    public static void main(String[] args) {
        String myStr1="Cartoon";
        String myStr2="Tomcat";
        System.out.println(ComprasionOfTheWorlds(myStr1,myStr2));

    }
    public static String ComprasionOfTheWorlds(String string1,String string2){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<string1.length();i++){
            char character=string1.charAt(i);
            if(string2.indexOf(character)==-1
                    && result.indexOf(""+character)== -1){
                result.append(character);
            }
        }
        return result.toString();
    }
}
