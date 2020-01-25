package com.lambton;

public class string_handling
{
    public static void main(String[] args) {
        String s[];
        s =new String[5];
        s[0]="canada";
        s[1]="geet";
        s[2]="komal";
        s[3]="kamal";
        s[4]="manu";
        String zigzagStrings[]=new String[s.length];
        System.out.println("\n_________reverse string_______");

        for(int i=0;i<s.length;i++)
        {
            String zigzag = zigzagString(s[i]);
            zigzagStrings[i] = zigzag;
            System.out.println(s[i] + "<->" + zigzag);

    }


    }



    public static String zigzagString(String st)
    {
        String temp;
        char names[]= st.toCharArray();
       char output[]= st.toCharArray();
        int len =names.length;
        int count = len-len%2;
        for( int i =0;i<count;i+=2)
        {
            output[i]=names[i+1];
            output[i+1]=names[i];
        }
        temp = new String(output);
        if(len % 2 ==1)
        {
            String firstPart = temp.substring(0,len/2);
            String secondPart = temp.substring(len/2,len-1);
            temp = firstPart + output[output.length-1]+ secondPart;
        }
        return  temp;
    }
}
