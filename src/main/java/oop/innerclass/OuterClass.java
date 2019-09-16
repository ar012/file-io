package oop.innerclass;

class OuterClass {

    int x = 10;

//   class InnerClass{
//        int y = 5;
//    }

//    private class InnerClass{
//        int y = 5;
//    }

//   static class InnerClass{
//        int y = 5;
//    }

    class InnnerClass{
        public int myInnerMethod(){
            return  x;
        }
    }
}
