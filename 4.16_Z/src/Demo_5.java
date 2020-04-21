/**
 *5、静态成员变量和实例成员变量的访问
 */

    public class Demo_5{

        private float f=1.0f;
        int m=12;
        static int n=1;

        public static void main(String args[]){
            Demo_5 t=new Demo_5();
            
            t.f = 1.0f;//t.f=1.0  -- 由于1.0是double类型

            System.out.println(this.n);
            System.out.println(t.m);//访问实例成员变量
            System.out.println(t.f);
            System.out.println(Demo_5.n);//访问静态成员变量


        }

    }

