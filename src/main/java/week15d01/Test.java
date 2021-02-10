package week15d01;
//foo() mainben nem használható így nem statikusan
//https://www.indiabix.com/online-test/java-programming-test/61

    class SC2
    {
        public static void main(String [] args)
        {
            SC2 s = new SC2();
            s.start();

        }

        void start()
        {
            int a = 3;
            int b = 4;
            System.out.print(" " + 7 + 2 + " ");
            System.out.print(a + b);
            System.out.print(" " + a + b + " ");
            System.out.print(foo() + a + b + " ");
            System.out.println(a + b + foo());
            foo();
        }

        String foo()
        {
            return "foo";
        }
    }

