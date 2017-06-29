package com.test;

import java.io.IOException;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class TestCheckedExceptionPropagation {


        void m() throws IOException{
            throw new java.io.IOException("device error");//checked exception
        }
        void n() throws  IOException{
            m();
        }
        void p() throws Exception {
            try{
                n();
            }
            catch (IOException io){
                System.out.println("Io Exception occured::"+io.getMessage());
                throw new Exception("Excmeption");
            }
            catch(Exception e){
                System.out.println("exception handeled");
            }
        }

        public static void main(String args[]) throws Exception{
            TestCheckedExceptionPropagation obj=new TestCheckedExceptionPropagation();
            obj.p();
            System.out.println("normal flow");
        }
}

