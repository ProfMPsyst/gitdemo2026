/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studlist;

/**
 *
 * @author Megha Patel, 2026
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] st=new Student[5];
         st[0]=new Student(10,"Megha");
         st[1]=new Student(11,"Sam");
         st[2]=new Student(12,"Pam");
         st[3]=new Student(13,"Kim");
         st[4]=new Student(14,"Ray");
         
         for(int i=0; i<st.length; i++)
         {
             System.out.println(st[i].toString());
         }
         
    }

}
