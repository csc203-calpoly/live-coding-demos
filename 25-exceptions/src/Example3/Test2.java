//import java.util.*;
//import java.io.*;
//
//public class Test2
//{
//    public static void main(String[] args)
//    {
//       try {
//          someMethod(-3);
//       }
//       catch (CustomException e)
//       {
//          System.out.println(e.getMessage() + "at line " +
//           e.getLineNum());
//       }
//    }
//
//    public static void someMethod(int x) throws CustomException
//    {
//       if (x >0)
//          return;
//
//       throw new CustomException(56, "bummer...");
//    }
//}
