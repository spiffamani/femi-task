public  class CharacterOccurance {

public static int alphabet(String alpha  ,  char occurances){
int checklist = 0;

for(int alphaindex = 0; alphaindex < alpha.length(); alphaindex++){
String result = alpha.toLowerCase();


if(result.charAt(alphaindex) == occurances ){

	checklist++;
}
}

return checklist;
}


public static void main(String[] args){

String word = "Hello World";
char read = 'a';
System.out.print("character occurance is" +  CharacterOccurance.alphabet(word , read ));
}
}
