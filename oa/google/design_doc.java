// Problem 
// Given a sent

text = Hello! How are you doing? How is the weather?
// Doc works (Tricky)
// Like a Proper DOC (Think of margins and what are is actually meant for text)
// Highlights, Bolding, Formatting (Take more pixels)



// String of text
// Output -> 

Hello! How are you
doing? How is the 
weather?

abc ill-
mannered

Document breadth = 200px; 
// Breath = 200px;
// Length - Infinity;

// Text Justification 

// Box ()

How is the
hshhshshhs \n
hh

render -> Read the string 
// Doc (Postion(int x, int y)) -> Move to the newline 
List<String> doc; // grid

font size = 8px;

String finalFOrmattedString = "Hello!"+ '\n' +

public String render(String text) {
	StringBuffer finalString = new StringBuffer("");
  int maxPixels = 200px;
  int maxChars = maxPixels/fontSize;
  int currIndex = 0;
  
  String texts[] = text.split(" ");
  for(int i=0;i<texts.length;i++) {
  	String currText = texts[i];
    
    if(currText.length() > maxChars) {

    	if(currIndex!=0) finalString.append("\n");
      String subStringText = currText.substring(0, maxChars);
      int i = 0;
      
      while(i<currText.length()) {
        finalString.append(subStringText);
        
        if(subStringText.length() < maxChars) {
          currIndex = subStringText.length()+1;
        	break;
        }
        
        subStringText = currText.substring(maxChars);
        if(subStringText!="") {
        	finalString.append("\n");
        } else {
           break;
        }
      }
      continue;
    }
    
    if(currText.length() + currIndex > maxChars) {
       // case if currText contains(-);
       int dashIndex = currText.indexOf("-");
       
       if(currIndex + dashIndex < maxChars) {
       			
       } 
       
    // 
    	finalString.append("\n");
      curr
    }
    
    finalString.append(" ");
    currIndex += 1;
  }
  
}

// Total width 100px  (X -> (0, 100))
// Two different para
// Brute -> half
// Len1 and Len2;
// Len1 = 100, Len2 = 10;

render(s1) -> Vertical Length (l1)
render(s2) -> Vertical Length (l2)

noPixS1 = l1/(l1+l2) * maxChars
noPixS2 = l2/(l1+l2) * maxChars

How is the weather? | I am doing well.
How hot was it		  | I have a had good sleep.
today?    				  |



