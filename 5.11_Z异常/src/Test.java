public class Test {
         //2
        private static void testMethod(){

            System.out.println("testMethod");

        }

        public static void main(String[] args) {

            ((Test)null).testMethod();

        }


        //3
//        public void getCustomerInfo() {
//
//            try {
//
//                //do something that may cause an Exception;
//
//            } catch (java.io.FileNotFoundException ex) {
//
//                System.out.print("FileNotFoundException!");
//
//            } catch (java.io.IOException ex) {
//
//                System.out.print("IOException!");
//
//            } catch (java.lang.Exception ex) {
//
//                System.out.print("Exception!");
//
//            }
//
//        }


}
