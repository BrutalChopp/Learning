package Lesson17;

public class Gv {
    public boolean ravenstvo(Object one , Object two){
        boolean result = (two.equals(one));

        switch (result) {
            case true:
                System.out.println(true);
                break;
            case false:
                System.out.println(false);

        }
        return result;
        }

}
