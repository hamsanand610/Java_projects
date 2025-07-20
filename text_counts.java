import java.util.Scanner;
public class text_counts{
public static void main(String[] args){
	System.out.print("Enter the line of texts: ");
	Scanner sc=new Scanner(System.in);
	String line=sc.nextLine();

	int words=0;int characters=0;int alpha=0;
	int vowels=0;int consonants=0;int digits=0;
	
	if(!line.trim().isEmpty()){
		words=line.trim().split("\\s+").length;       
		}
				//int result=!line.trim().isEmpty()?words=0:words=line.trim().split("\\s+").length;
	
	for(int i=0;i<line.length();i++){
		char ch=line.charAt(i);
			if(ch!=' '){
				characters++;
			}
	if(Character.isLetter(ch)){
		alpha++;
		}
	char lower=Character.toLowerCase(ch);
	if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u'){
		vowels++;}
	else{
		consonants++;}
	
	if(Character.isDigit(ch)){
		digits++;}	
	}
	
	System.out.println("words "+words);
	System.out.println("characters "+characters);
	System.out.println("alphabets "+alpha);
	System.out.println("vowels "+vowels);
	System.out.println("consonants "+consonants);
	System.out.println("digits "+digits);
}
}