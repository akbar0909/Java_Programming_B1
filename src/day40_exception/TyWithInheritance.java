package day40_exception;

public class TyWithInheritance {

    public static void main(String[] args) {

        try {

        }catch (IndexOutOfBoundsException e){   // first more specific

        }catch (RuntimeException e){  //2nd more specific

        }catch (Exception e){  // 3d more specific

        }

//        try {
//
//        }catch (Exception e){   // 3d more specific
//
//        }catch (RuntimeException e){  //2nd more specific
//
//        }catch (IndexOutOfBoundsException e){  // 1st more specific
//
//        }
    }
}
