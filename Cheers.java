// Prints a crowd cheering output.
public class Cheers {
        
        public static void main(String[] args) {
	    // Replace this comment with your code
            String s=args[0];
            int c=0;
           s= s.toUpperCase();
            int number=Integer.parseInt(args[1]);
            
            String t="AEFHILMNORSX";
            
            while(c<s.length()){
                char a=s.charAt(c);
                int n=0;
                boolean r=true;
                while(n<t.length()){
                        if(a==t.charAt(n))
                                {System.out.println("Give me an "+s.charAt(c)+": "+s.charAt(c)+"!");
                                r=false;
                                break;}
                        
                        n++;
                }
                
                if(r==true)
                        System.out.println("Give me a  "+s.charAt(c)+": "+s.charAt(c)+"!");
                c++;}

                  System.out.println("What does that spell?");          
                while (number>0) {
                        System.out.println(s+"!!!");
                        number--;
                        
                }
                        }
        }
                        
