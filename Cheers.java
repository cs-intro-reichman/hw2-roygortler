// Prints a crowd cheering output.
public class Cheers {
        
        public static void main(String[] args) {
	    // Replace this comment with your code
            String s=args[0];
            int c=0;
            int number=Integer.parseInt(args[1]);
            String t="AEFHILMNORSX";
            s.toUpperCase();
            while(c<s.length()){
                char a=s.charAt(c);
                int n=0;
                boolean r=true;
                while(n<t.length()){
                        if(a==t.charAt(n))
                                {System.out.println("give me an"+s.charAt(c));
                                r=false;
                                break;}
                        
                        n++;
                }
                
                if(r==true)
                        System.out.println("give me a"+s.charAt(c));
                c++;}

                            
                while (c>0) {
                        System.out.println(s);
                        c--;
                        
                }
                        }
        }
                        
